import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class48 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	private int anInt1882;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)V")
	public void method1221(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean88 != arg0) {
			this.method1228(null, arg0, this.anIntArray215, -1);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZI)V")
	public void method1222(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean88) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray214[Static12.anIntArray58[arg1]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(45) Class3_Sub1_Sub7 local45;
		do {
			if (arg0) {
				local19++;
				if (Static83.anInt2050 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static83.anInt2050 - 1;
				}
			}
			local45 = Static108.method1889(local19);
		} while (local45 == null || local45.aBoolean62 || arg1 + (this.aBoolean88 ? 7 : 0) != local45.anInt1244);
		this.anIntArray214[Static12.anIntArray58[arg1]] = local19 + 256;
		this.method1229();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!m;I)V")
	public void method1224(@OriginalArg(0) Class3_Sub6 arg0) {
		arg0.method1608(this.aBoolean88 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray214[Static12.anIntArray58[local16]];
			if (local25 == 0) {
				arg0.method1608(-1);
			} else {
				arg0.method1608(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1608(this.anIntArray215[local25]);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!ne;Lclient!ne;II)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1225(@OriginalArg(1) Class3_Sub1_Sub11 arg0, @OriginalArg(2) Class3_Sub1_Sub11 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt1882 != -1) {
			return Static115.method1958(this.anInt1882).method1484(arg2, arg0, arg1, arg3);
		}
		@Pc(25) long local25 = this.aLong57;
		@Pc(28) int[] local28 = this.anIntArray214;
		if (arg1 != null && (arg1.anInt1915 >= 0 || arg1.anInt1930 >= 0)) {
			local28 = new int[12];
			for (@Pc(48) int local48 = 0; local48 < 12; local48++) {
				local28[local48] = this.anIntArray214[local48];
			}
			if (arg1.anInt1915 >= 0) {
				local25 += arg1.anInt1915 - this.anIntArray214[5] << 8;
				local28[5] = arg1.anInt1915;
			}
			if (arg1.anInt1930 >= 0) {
				local25 += arg1.anInt1930 - this.anIntArray214[3] << 16;
				local28[3] = arg1.anInt1930;
			}
		}
		@Pc(115) Class3_Sub1_Sub1_Sub6 local115 = (Class3_Sub1_Sub1_Sub6) Static21.aClass9_9.method282(local25);
		if (local115 == null) {
			@Pc(119) boolean local119 = false;
			for (@Pc(121) int local121 = 0; local121 < 12; local121++) {
				@Pc(127) int local127 = local28[local121];
				if (local127 >= 256 && local127 < 512 && !Static108.method1889(local127 - 256).method835()) {
					local119 = true;
				}
				if (local127 >= 512 && !Static37.method694(local127 - 512).method420(this.aBoolean88)) {
					local119 = true;
				}
			}
			if (local119) {
				if (this.aLong58 != -1L) {
					local115 = (Class3_Sub1_Sub1_Sub6) Static21.aClass9_9.method282(this.aLong58);
				}
				if (local115 == null) {
					return null;
				}
			}
			if (local115 == null) {
				@Pc(185) Class3_Sub1_Sub1_Sub6[] local185 = new Class3_Sub1_Sub1_Sub6[12];
				@Pc(187) int local187 = 0;
				@Pc(195) int local195;
				for (@Pc(189) int local189 = 0; local189 < 12; local189++) {
					local195 = local28[local189];
					@Pc(209) Class3_Sub1_Sub1_Sub6 local209;
					if (local195 >= 256 && local195 < 512) {
						local209 = Static108.method1889(local195 - 256).method838();
						if (local209 != null) {
							local185[local187++] = local209;
						}
					}
					if (local195 >= 512) {
						local209 = Static37.method694(local195 - 512).method431(this.aBoolean88);
						if (local209 != null) {
							local185[local187++] = local209;
						}
					}
				}
				local115 = new Class3_Sub1_Sub1_Sub6(local185, local187);
				for (local195 = 0; local195 < 5; local195++) {
					if (this.anIntArray215[local195] != 0) {
						local115.method1821(Static42.anIntArrayArray10[local195][0], Static42.anIntArrayArray10[local195][this.anIntArray215[local195]]);
						if (local195 == 1) {
							local115.method1821(Static50.anIntArray159[0], Static50.anIntArray159[this.anIntArray215[local195]]);
						}
					}
				}
				local115.method1811();
				local115.method1806(64, 850, -30, -50, -30, true);
				Static21.aClass9_9.method284(local115, local25);
				this.aLong58 = local25;
			}
		}
		if (arg1 == null && arg0 == null) {
			return local115;
		}
		@Pc(330) Class3_Sub1_Sub1_Sub6 local330;
		if (arg1 != null && arg0 != null) {
			local330 = arg1.method1254(arg2, local115, arg0, arg3);
		} else if (arg1 == null) {
			local330 = arg0.method1256(local115, arg3);
		} else {
			local330 = arg1.method1256(local115, arg2);
		}
		return local330;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1227() {
		if (this.anInt1882 != -1) {
			return Static115.method1958(this.anInt1882).method1477();
		}
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
			@Pc(27) int local27 = this.anIntArray214[local20];
			if (local27 >= 256 && local27 < 512 && !Static108.method1889(local27 - 256).method839()) {
				local18 = true;
			}
			if (local27 >= 512 && !Static37.method694(local27 - 512).method423(this.aBoolean88)) {
				local18 = true;
			}
		}
		if (local18) {
			return null;
		}
		@Pc(75) int local75 = 0;
		@Pc(78) Class3_Sub1_Sub1_Sub6[] local78 = new Class3_Sub1_Sub1_Sub6[12];
		for (@Pc(80) int local80 = 0; local80 < 12; local80++) {
			@Pc(87) int local87 = this.anIntArray214[local80];
			@Pc(107) Class3_Sub1_Sub1_Sub6 local107;
			if (local87 >= 256 && local87 < 512) {
				local107 = Static108.method1889(local87 - 256).method834();
				if (local107 != null) {
					local78[local75++] = local107;
				}
			}
			if (local87 >= 512) {
				local107 = Static37.method694(local87 - 512).method426(this.aBoolean88);
				if (local107 != null) {
					local78[local75++] = local107;
				}
			}
		}
		@Pc(146) Class3_Sub1_Sub1_Sub6 local146 = new Class3_Sub1_Sub1_Sub6(local78, local75);
		for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
			if (this.anIntArray215[local148] != 0) {
				local146.method1821(Static42.anIntArrayArray10[local148][0], Static42.anIntArrayArray10[local148][this.anIntArray215[local148]]);
				if (local148 == 1) {
					local146.method1821(Static50.anIntArray159[0], Static50.anIntArray159[this.anIntArray215[local148]]);
				}
			}
		}
		return local146;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([IZ[III)V")
	public void method1228(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static83.anInt2050; local16++) {
					@Pc(22) Class3_Sub1_Sub7 local22 = Static108.method1889(local16);
					if (local22 != null && !local22.aBoolean62 && local22.anInt1244 == (arg1 ? 7 : 0) + local12) {
						arg0[Static12.anIntArray58[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean88 = arg1;
		this.anIntArray215 = arg2;
		this.anIntArray214 = arg0;
		this.anInt1882 = arg3;
		this.method1229();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	private void method1229() {
		@Pc(4) long local4 = this.aLong57;
		this.aLong57 = 0L;
		@Pc(16) int local16 = this.anIntArray214[5];
		@Pc(21) int local21 = this.anIntArray214[9];
		this.anIntArray214[5] = local21;
		this.anIntArray214[9] = local16;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong57 <<= 0x4;
			if (this.anIntArray214[local33] >= 256) {
				this.aLong57 += this.anIntArray214[local33] - 256;
			}
		}
		if (this.anIntArray214[0] >= 256) {
			this.aLong57 += this.anIntArray214[0] - 256 >> 4;
		}
		if (this.anIntArray214[1] >= 256) {
			this.aLong57 += this.anIntArray214[1] - 256 >> 8;
		}
		for (@Pc(112) int local112 = 0; local112 < 5; local112++) {
			this.aLong57 <<= 0x3;
			this.aLong57 += this.anIntArray215[local112];
		}
		this.anIntArray214[9] = local21;
		this.aLong57 <<= 0x1;
		this.aLong57 += this.aBoolean88 ? 1 : 0;
		this.anIntArray214[5] = local16;
		if (local4 != 0L && this.aLong57 != local4) {
			Static21.aClass9_9.method280(local4);
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I")
	public int method1231() {
		return this.anInt1882 == -1 ? this.anIntArray214[1] + (this.anIntArray214[11] << 5) + (this.anIntArray214[8] << 10) + (this.anIntArray214[0] << 15) + (this.anIntArray215[0] << 25) + (this.anIntArray215[4] << 20) : Static115.method1958(this.anInt1882).anInt2212 + 305419896;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZII)V")
	public void method1234(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray215[arg1];
		if (arg0) {
			local8++;
			if (Static42.anIntArrayArray10[arg1].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static42.anIntArrayArray10[arg1].length - 1;
			}
		}
		this.anIntArray215[arg1] = local8;
		this.method1229();
	}
}
