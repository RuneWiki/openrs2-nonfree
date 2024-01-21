import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class58 {

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	private int anInt2493;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "J")
	private long aLong70;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "[I")
	private int[] anIntArray340;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "Z")
	public boolean aBoolean119;

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!h;Lclient!h;BI)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method1612(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub8 arg1, @OriginalArg(2) Class1_Sub1_Sub8 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt2493 != -1) {
			return Static65.method1251(this.anInt2493).method1821(arg0, arg2, arg3, arg1);
		}
		@Pc(21) long local21 = this.aLong71;
		@Pc(29) int[] local29 = this.anIntArray341;
		if (arg1 != null && (arg1.anInt1080 >= 0 || arg1.anInt1072 >= 0)) {
			local29 = new int[12];
			for (@Pc(45) int local45 = 0; local45 < 12; local45++) {
				local29[local45] = this.anIntArray341[local45];
			}
			if (arg1.anInt1080 >= 0) {
				local21 += arg1.anInt1080 - this.anIntArray341[5] << 8;
				local29[5] = arg1.anInt1080;
			}
			if (arg1.anInt1072 >= 0) {
				local21 += arg1.anInt1072 - this.anIntArray341[3] << 16;
				local29[3] = arg1.anInt1072;
			}
		}
		@Pc(111) Class1_Sub1_Sub2_Sub6 local111 = (Class1_Sub1_Sub2_Sub6) Static87.aClass5_63.method98(local21);
		if (local111 == null) {
			@Pc(115) boolean local115 = false;
			for (@Pc(117) int local117 = 0; local117 < 12; local117++) {
				@Pc(122) int local122 = local29[local117];
				if (local122 >= 256 && local122 < 512 && !Static115.method1938(local122 - 256).method1844()) {
					local115 = true;
				}
				if (local122 >= 512 && !Static111.method1907(local122 - 512).method32(this.aBoolean119)) {
					local115 = true;
				}
			}
			if (local115) {
				if (this.aLong70 != -1L) {
					local111 = (Class1_Sub1_Sub2_Sub6) Static87.aClass5_63.method98(this.aLong70);
				}
				if (local111 == null) {
					return null;
				}
			}
			if (local111 == null) {
				@Pc(184) Class1_Sub1_Sub2_Sub6[] local184 = new Class1_Sub1_Sub2_Sub6[12];
				@Pc(186) int local186 = 0;
				@Pc(193) int local193;
				for (@Pc(188) int local188 = 0; local188 < 12; local188++) {
					local193 = local29[local188];
					@Pc(211) Class1_Sub1_Sub2_Sub6 local211;
					if (local193 >= 256 && local193 < 512) {
						local211 = Static115.method1938(local193 - 256).method1835();
						if (local211 != null) {
							local184[local186++] = local211;
						}
					}
					if (local193 >= 512) {
						local211 = Static111.method1907(local193 - 512).method30(this.aBoolean119);
						if (local211 != null) {
							local184[local186++] = local211;
						}
					}
				}
				local111 = new Class1_Sub1_Sub2_Sub6(local184, local186);
				for (local193 = 0; local193 < 5; local193++) {
					if (this.anIntArray340[local193] != 0) {
						local111.method1427(Static104.anIntArrayArray64[local193][0], Static104.anIntArrayArray64[local193][this.anIntArray340[local193]]);
						if (local193 == 1) {
							local111.method1427(Static52.anIntArray188[0], Static52.anIntArray188[this.anIntArray340[local193]]);
						}
					}
				}
				local111.method1426();
				local111.method1437(64, 850, -30, -50, -30, true);
				Static87.aClass5_63.method97(local111, local21);
				this.aLong70 = local21;
			}
		}
		if (arg1 == null && arg2 == null) {
			return local111;
		}
		@Pc(328) Class1_Sub1_Sub2_Sub6 local328;
		if (arg1 != null && arg2 != null) {
			local328 = arg1.method586(arg2, arg0, local111, arg3);
		} else if (arg1 == null) {
			local328 = arg2.method587(local111, arg3);
		} else {
			local328 = arg1.method587(local111, arg0);
		}
		return local328;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)I")
	public int method1613() {
		return this.anInt2493 == -1 ? (this.anIntArray341[8] << 10) + (this.anIntArray340[0] << 25) + (this.anIntArray340[4] << 20) + (this.anIntArray341[0] << 15) + (this.anIntArray341[11] << 5) + this.anIntArray341[1] : Static65.method1251(this.anInt2493).anInt2748 + 305419896;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[IIZ[I)V")
	public void method1614(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(10) int local10 = 0; local10 < 7; local10++) {
				for (@Pc(13) int local13 = 0; local13 < Static107.anInt2766; local13++) {
					@Pc(18) Class1_Sub1_Sub17 local18 = Static115.method1938(local13);
					if (local18 != null && !local18.aBoolean129 && local10 + (arg2 ? 7 : 0) == local18.anInt2795) {
						arg1[Static113.anIntArray409[local10]] = local13 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean119 = arg2;
		this.anInt2493 = arg0;
		this.anIntArray341 = arg1;
		this.anIntArray340 = arg3;
		this.method1623();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method1617() {
		if (this.anInt2493 != -1) {
			return Static65.method1251(this.anInt2493).method1819();
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < 12; local26++) {
			@Pc(33) int local33 = this.anIntArray341[local26];
			if (local33 >= 256 && local33 < 512 && !Static115.method1938(local33 - 256).method1846()) {
				local24 = true;
			}
			if (local33 >= 512 && !Static111.method1907(local33 - 512).method39(this.aBoolean119)) {
				local24 = true;
			}
		}
		if (local24) {
			return null;
		}
		@Pc(81) Class1_Sub1_Sub2_Sub6[] local81 = new Class1_Sub1_Sub2_Sub6[12];
		@Pc(83) int local83 = 0;
		for (@Pc(85) int local85 = 0; local85 < 12; local85++) {
			@Pc(92) int local92 = this.anIntArray341[local85];
			@Pc(108) Class1_Sub1_Sub2_Sub6 local108;
			if (local92 >= 256 && local92 < 512) {
				local108 = Static115.method1938(local92 - 256).method1843();
				if (local108 != null) {
					local81[local83++] = local108;
				}
			}
			if (local92 >= 512) {
				local108 = Static111.method1907(local92 - 512).method31(this.aBoolean119);
				if (local108 != null) {
					local81[local83++] = local108;
				}
			}
		}
		@Pc(147) Class1_Sub1_Sub2_Sub6 local147 = new Class1_Sub1_Sub2_Sub6(local81, local83);
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			if (this.anIntArray340[local149] != 0) {
				local147.method1427(Static104.anIntArrayArray64[local149][0], Static104.anIntArrayArray64[local149][this.anIntArray340[local149]]);
				if (local149 == 1) {
					local147.method1427(Static52.anIntArray188[0], Static52.anIntArray188[this.anIntArray340[local149]]);
				}
			}
		}
		return local147;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZ)V")
	public void method1618(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean119) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray341[Static113.anIntArray409[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(50) Class1_Sub1_Sub17 local50;
		do {
			if (arg1) {
				local19++;
				if (Static107.anInt2766 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static107.anInt2766 - 1;
				}
			}
			local50 = Static115.method1938(local19);
		} while (local50 == null || local50.aBoolean129 || arg0 + (this.aBoolean119 ? 7 : 0) != local50.anInt2795);
		this.anIntArray341[Static113.anIntArray409[arg0]] = local19 + 256;
		this.method1623();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZB)V")
	public void method1619(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean119 != arg0) {
			this.method1614(-1, null, arg0, this.anIntArray340);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!rc;)V")
	public void method1620(@OriginalArg(1) Class1_Sub5 arg0) {
		arg0.method674(this.aBoolean119 ? 1 : 0);
		@Pc(22) int local22;
		for (@Pc(14) int local14 = 0; local14 < 7; local14++) {
			local22 = this.anIntArray341[Static113.anIntArray409[local14]];
			if (local22 == 0) {
				arg0.method674(-1);
			} else {
				arg0.method674(local22 - 256);
			}
		}
		for (local22 = 0; local22 < 5; local22++) {
			arg0.method674(this.anIntArray340[local22]);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBZ)V")
	public void method1622(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = this.anIntArray340[arg0];
		if (arg1) {
			local8++;
			if (Static104.anIntArrayArray64[arg0].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static104.anIntArrayArray64[arg0].length - 1;
			}
		}
		this.anIntArray340[arg0] = local8;
		this.method1623();
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	private void method1623() {
		@Pc(4) int local4 = this.anIntArray341[5];
		@Pc(11) long local11 = this.aLong71;
		@Pc(16) int local16 = this.anIntArray341[9];
		this.anIntArray341[5] = local16;
		this.anIntArray341[9] = local4;
		this.aLong71 = 0L;
		for (@Pc(31) int local31 = 0; local31 < 12; local31++) {
			this.aLong71 <<= 0x4;
			if (this.anIntArray341[local31] >= 256) {
				this.aLong71 += this.anIntArray341[local31] - 256;
			}
		}
		if (this.anIntArray341[0] >= 256) {
			this.aLong71 += this.anIntArray341[0] - 256 >> 4;
		}
		if (this.anIntArray341[1] >= 256) {
			this.aLong71 += this.anIntArray341[1] - 256 >> 8;
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			this.aLong71 <<= 0x3;
			this.aLong71 += this.anIntArray340[local102];
		}
		this.aLong71 <<= 0x1;
		this.aLong71 += this.aBoolean119 ? 1 : 0;
		this.anIntArray341[5] = local4;
		this.anIntArray341[9] = local16;
		if (local11 != 0L && local11 != this.aLong71) {
			Static87.aClass5_63.method96(local11);
		}
	}
}
