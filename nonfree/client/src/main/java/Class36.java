import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class36 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "I")
	private int anInt1418;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "[I")
	private int[] anIntArray147;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "[I")
	private int[] anIntArray148;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "Z")
	public boolean aBoolean50;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZZI)V")
	public void method1031(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray148[arg1];
		if (arg0) {
			local8++;
			if (Static108.aShortArrayArray1[arg1].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static108.aShortArrayArray1[arg1].length - 1;
			}
		}
		this.anIntArray148[arg1] = local8;
		this.method1033();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	private void method1033() {
		@Pc(8) long local8 = this.aLong53;
		this.aLong53 = 0L;
		@Pc(16) int local16 = this.anIntArray147[9];
		@Pc(21) int local21 = this.anIntArray147[5];
		this.anIntArray147[5] = local16;
		this.anIntArray147[9] = local21;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong53 <<= 0x4;
			if (this.anIntArray147[local33] >= 256) {
				this.aLong53 += this.anIntArray147[local33] - 256;
			}
		}
		if (this.anIntArray147[0] >= 256) {
			this.aLong53 += this.anIntArray147[0] - 256 >> 4;
		}
		if (this.anIntArray147[1] >= 256) {
			this.aLong53 += this.anIntArray147[1] - 256 >> 8;
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			this.aLong53 <<= 0x3;
			this.aLong53 += this.anIntArray148[local109];
		}
		this.anIntArray147[9] = local16;
		this.anIntArray147[5] = local21;
		this.aLong53 <<= 0x1;
		this.aLong53 += this.aBoolean50 ? 1 : 0;
		if (local8 != 0L && this.aLong53 != local8) {
			Static104.aClass48_58.method1389(local8);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZB)V")
	public void method1034(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean50) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray147[Static85.anIntArray205[arg0]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(58) Class4_Sub4_Sub8 local58;
		do {
			if (arg1) {
				local21++;
				if (local21 >= Static18.anInt455) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static18.anInt455 - 1;
				}
			}
			local58 = Static71.method1373(local21);
		} while (local58 == null || local58.aBoolean43 || local58.anInt1300 != (this.aBoolean50 ? 7 : 0) + arg0);
		this.anIntArray147[Static85.anIntArray205[arg0]] = local21 + 256;
		this.method1033();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)I")
	public int method1035() {
		return this.anInt1418 == -1 ? (this.anIntArray147[11] << 5) + (this.anIntArray147[8] << 10) + (this.anIntArray148[4] << 20) + (this.anIntArray148[0] << 25) + (this.anIntArray147[0] << 15) + this.anIntArray147[1] : Static122.method2060(this.anInt1418).anInt2001 + 305419896;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!t;IBLclient!t;)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method1036(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub4_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4_Sub4_Sub14 arg3) {
		if (this.anInt1418 != -1) {
			return Static122.method2060(this.anInt1418).method1493(arg0, arg1, arg2, arg3);
		}
		@Pc(26) long local26 = this.aLong53;
		@Pc(29) int[] local29 = this.anIntArray147;
		if (arg1 != null && (arg1.anInt2713 >= 0 || arg1.anInt2718 >= 0)) {
			local29 = new int[12];
			for (@Pc(45) int local45 = 0; local45 < 12; local45++) {
				local29[local45] = this.anIntArray147[local45];
			}
			if (arg1.anInt2713 >= 0) {
				local26 += arg1.anInt2713 - this.anIntArray147[5] << 8;
				local29[5] = arg1.anInt2713;
			}
			if (arg1.anInt2718 >= 0) {
				local26 += arg1.anInt2718 - this.anIntArray147[3] << 16;
				local29[3] = arg1.anInt2718;
			}
		}
		@Pc(111) Class4_Sub4_Sub1_Sub6 local111 = (Class4_Sub4_Sub1_Sub6) Static104.aClass48_58.method1390(local26);
		if (local111 == null) {
			@Pc(115) boolean local115 = false;
			for (@Pc(117) int local117 = 0; local117 < 12; local117++) {
				@Pc(123) int local123 = local29[local117];
				if (local123 >= 256 && local123 < 512 && !Static71.method1373(local123 - 256).method937()) {
					local115 = true;
				}
				if (local123 >= 512 && !Static24.method475(local123 - 512).method1540(this.aBoolean50)) {
					local115 = true;
				}
			}
			if (local115) {
				if (this.aLong52 != -1L) {
					local111 = (Class4_Sub4_Sub1_Sub6) Static104.aClass48_58.method1390(this.aLong52);
				}
				if (local111 == null) {
					return null;
				}
			}
			if (local111 == null) {
				@Pc(183) Class4_Sub4_Sub1_Sub7[] local183 = new Class4_Sub4_Sub1_Sub7[12];
				@Pc(185) int local185 = 0;
				for (@Pc(187) int local187 = 0; local187 < 12; local187++) {
					@Pc(193) int local193 = local29[local187];
					@Pc(209) Class4_Sub4_Sub1_Sub7 local209;
					if (local193 >= 256 && local193 < 512) {
						local209 = Static71.method1373(local193 - 256).method942();
						if (local209 != null) {
							local183[local185++] = local209;
						}
					}
					if (local193 >= 512) {
						local209 = Static24.method475(local193 - 512).method1550(this.aBoolean50);
						if (local209 != null) {
							local183[local185++] = local209;
						}
					}
				}
				@Pc(248) Class4_Sub4_Sub1_Sub7 local248 = new Class4_Sub4_Sub1_Sub7(local183, local185);
				for (@Pc(250) int local250 = 0; local250 < 5; local250++) {
					if (this.anIntArray148[local250] != 0) {
						local248.method1998(Static108.aShortArrayArray1[local250][0], Static108.aShortArrayArray1[local250][this.anIntArray148[local250]]);
						if (local250 == 1) {
							local248.method1998(Static52.aShortArray8[0], Static52.aShortArray8[this.anIntArray148[local250]]);
						}
					}
				}
				local111 = local248.method2003(64, 850, -30, -50, -30);
				Static104.aClass48_58.method1392(local111, local26);
				this.aLong52 = local26;
			}
		}
		if (arg1 == null && arg3 == null) {
			return local111;
		}
		@Pc(333) Class4_Sub4_Sub1_Sub6 local333;
		if (arg1 != null && arg3 != null) {
			local333 = arg1.method1915(arg0, local111, arg2, arg3);
		} else if (arg1 == null) {
			local333 = arg3.method1917(local111, arg2);
		} else {
			local333 = arg1.method1917(local111, arg0);
		}
		return local333;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!re;)V")
	public void method1037(@OriginalArg(1) Class4_Sub13 arg0) {
		arg0.method1209(this.aBoolean50 ? 1 : 0);
		@Pc(28) int local28;
		for (@Pc(19) int local19 = 0; local19 < 7; local19++) {
			local28 = this.anIntArray147[Static85.anIntArray205[local19]];
			if (local28 == 0) {
				arg0.method1209(-1);
			} else {
				arg0.method1209(local28 - 256);
			}
		}
		for (local28 = 0; local28 < 5; local28++) {
			arg0.method1209(this.anIntArray148[local28]);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BZ)V")
	public void method1038(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean50) {
			this.method1041(-1, arg0, this.anIntArray148, null);
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Lclient!u;")
	public Class4_Sub4_Sub1_Sub7 method1040() {
		if (this.anInt1418 != -1) {
			return Static122.method2060(this.anInt1418).method1484();
		}
		@Pc(22) boolean local22 = false;
		for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
			@Pc(31) int local31 = this.anIntArray147[local24];
			if (local31 >= 256 && local31 < 512 && !Static71.method1373(local31 - 256).method939()) {
				local22 = true;
			}
			if (local31 >= 512 && !Static24.method475(local31 - 512).method1548(this.aBoolean50)) {
				local22 = true;
			}
		}
		if (local22) {
			return null;
		}
		@Pc(78) int local78 = 0;
		@Pc(87) Class4_Sub4_Sub1_Sub7[] local87 = new Class4_Sub4_Sub1_Sub7[12];
		for (@Pc(89) int local89 = 0; local89 < 12; local89++) {
			@Pc(96) int local96 = this.anIntArray147[local89];
			@Pc(114) Class4_Sub4_Sub1_Sub7 local114;
			if (local96 >= 256 && local96 < 512) {
				local114 = Static71.method1373(local96 - 256).method941();
				if (local114 != null) {
					local87[local78++] = local114;
				}
			}
			if (local96 >= 512) {
				local114 = Static24.method475(local96 - 512).method1546(this.aBoolean50);
				if (local114 != null) {
					local87[local78++] = local114;
				}
			}
		}
		@Pc(153) Class4_Sub4_Sub1_Sub7 local153 = new Class4_Sub4_Sub1_Sub7(local87, local78);
		for (@Pc(155) int local155 = 0; local155 < 5; local155++) {
			if (this.anIntArray148[local155] != 0) {
				local153.method1998(Static108.aShortArrayArray1[local155][0], Static108.aShortArrayArray1[local155][this.anIntArray148[local155]]);
				if (local155 == 1) {
					local153.method1998(Static52.aShortArray8[0], Static52.aShortArray8[this.anIntArray148[local155]]);
				}
			}
		}
		return local153;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZI[I[I)V")
	public void method1041(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(14) int local14 = 0; local14 < 7; local14++) {
				for (@Pc(18) int local18 = 0; local18 < Static18.anInt455; local18++) {
					@Pc(24) Class4_Sub4_Sub8 local24 = Static71.method1373(local18);
					if (local24 != null && !local24.aBoolean43 && local24.anInt1300 == local14 + (arg1 ? 7 : 0)) {
						arg3[Static85.anIntArray205[local14]] = local18 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray147 = arg3;
		this.anInt1418 = arg0;
		this.anIntArray148 = arg2;
		this.aBoolean50 = arg1;
		this.method1033();
	}
}
