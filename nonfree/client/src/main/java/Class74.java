import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class74 {

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "[I")
	private int[] anIntArray337;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Z")
	public boolean aBoolean141;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "[I")
	private int[] anIntArray340;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
	private int anInt3202;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZB)V")
	public void method2267(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean141 != arg0) {
			this.method2277(-1, arg0, null, this.anIntArray337);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	private void method2268() {
		@Pc(8) long local8 = this.aLong110;
		@Pc(13) int local13 = this.anIntArray340[5];
		this.aLong110 = 0L;
		@Pc(21) int local21 = this.anIntArray340[9];
		this.anIntArray340[5] = local21;
		this.anIntArray340[9] = local13;
		for (@Pc(38) int local38 = 0; local38 < 12; local38++) {
			this.aLong110 <<= 0x4;
			if (this.anIntArray340[local38] >= 256) {
				this.aLong110 += this.anIntArray340[local38] - 256;
			}
		}
		if (this.anIntArray340[0] >= 256) {
			this.aLong110 += this.anIntArray340[0] - 256 >> 4;
		}
		if (this.anIntArray340[1] >= 256) {
			this.aLong110 += this.anIntArray340[1] - 256 >> 8;
		}
		for (@Pc(112) int local112 = 0; local112 < 5; local112++) {
			this.aLong110 <<= 0x3;
			this.aLong110 += this.anIntArray337[local112];
		}
		this.anIntArray340[9] = local21;
		this.anIntArray340[5] = local13;
		this.aLong110 <<= 0x1;
		this.aLong110 += this.aBoolean141 ? 1 : 0;
		if (local8 != 0L && this.aLong110 != local8) {
			Static64.aClass72_15.method2260(local8);
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Lclient!v;")
	public Class2_Sub1_Sub3_Sub7 method2269() {
		if (this.anInt3202 != -1) {
			return Static106.method1725(this.anInt3202).method53();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray340[local21];
			if (local28 >= 256 && local28 < 512 && !Static92.method1561(local28 - 256).method2200()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static78.method577(local28 - 512).method1099(this.aBoolean141)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(75) int local75 = 0;
		@Pc(78) Class2_Sub1_Sub3_Sub7[] local78 = new Class2_Sub1_Sub3_Sub7[12];
		for (@Pc(85) int local85 = 0; local85 < 12; local85++) {
			@Pc(92) int local92 = this.anIntArray340[local85];
			@Pc(106) Class2_Sub1_Sub3_Sub7 local106;
			if (local92 >= 256 && local92 < 512) {
				local106 = Static92.method1561(local92 - 256).method2198();
				if (local106 != null) {
					local78[local75++] = local106;
				}
			}
			if (local92 >= 512) {
				local106 = Static78.method577(local92 - 512).method1100(this.aBoolean141);
				if (local106 != null) {
					local78[local75++] = local106;
				}
			}
		}
		@Pc(147) Class2_Sub1_Sub3_Sub7 local147 = new Class2_Sub1_Sub3_Sub7(local78, local75);
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			if (Static58.aShortArrayArray40[local149].length > this.anIntArray337[local149]) {
				local147.method2566(Static136.aShortArray24[local149], Static58.aShortArrayArray40[local149][this.anIntArray337[local149]]);
			}
			if (Static147.aShortArrayArray107[local149].length > this.anIntArray337[local149]) {
				local147.method2566(Static135.aShortArray23[local149], Static147.aShortArrayArray107[local149][this.anIntArray337[local149]]);
			}
		}
		return local147;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)I")
	public int method2270() {
		return this.anInt3202 == -1 ? this.anIntArray340[1] + (this.anIntArray340[11] << 5) + (this.anIntArray340[8] << 10) + (this.anIntArray340[0] << 15) + (this.anIntArray337[0] << 25) + (this.anIntArray337[4] << 20) : Static106.method1725(this.anInt3202).anInt58 + 305419896;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZII)V")
	public void method2273(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anIntArray337[arg1];
		if (arg0) {
			local13++;
			if (Static58.aShortArrayArray40[arg1].length <= local13) {
				local13 = 0;
			}
		} else {
			local13--;
			if (local13 < 0) {
				local13 = Static58.aShortArrayArray40[arg1].length - 1;
			}
		}
		this.anIntArray337[arg1] = local13;
		this.method2268();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!va;)V")
	public void method2275(@OriginalArg(1) Class2_Sub11 arg0) {
		arg0.method1439(this.aBoolean141 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray340[Static119.anIntArray293[local16]];
			if (local25 == 0) {
				arg0.method1439(-1);
			} else {
				arg0.method1439(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1439(this.anIntArray337[local25]);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!ke;IZLclient!ke;)Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 method2276(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub1_Sub9 arg3) {
		if (this.anInt3202 != -1) {
			return Static106.method1725(this.anInt3202).method49(arg2, arg3, arg1, arg0);
		}
		@Pc(23) long local23 = this.aLong110;
		@Pc(26) int[] local26 = this.anIntArray340;
		if (arg3 != null && (arg3.anInt1934 >= 0 || arg3.anInt1928 >= 0)) {
			local26 = new int[12];
			for (@Pc(45) int local45 = 0; local45 < 12; local45++) {
				local26[local45] = this.anIntArray340[local45];
			}
			if (arg3.anInt1934 >= 0) {
				local23 += arg3.anInt1934 - this.anIntArray340[5] << 8;
				local26[5] = arg3.anInt1934;
			}
			if (arg3.anInt1928 >= 0) {
				local23 += arg3.anInt1928 - this.anIntArray340[3] << 16;
				local26[3] = arg3.anInt1928;
			}
		}
		@Pc(115) Class2_Sub1_Sub3_Sub3 local115 = (Class2_Sub1_Sub3_Sub3) Static64.aClass72_15.method2259(local23);
		if (local115 == null) {
			@Pc(119) boolean local119 = false;
			for (@Pc(121) int local121 = 0; local121 < 12; local121++) {
				@Pc(127) int local127 = local26[local121];
				if (local127 >= 256 && local127 < 512 && !Static92.method1561(local127 - 256).method2194()) {
					local119 = true;
				}
				if (local127 >= 512 && !Static78.method577(local127 - 512).method1091(this.aBoolean141)) {
					local119 = true;
				}
			}
			if (local119) {
				if (this.aLong111 != -1L) {
					local115 = (Class2_Sub1_Sub3_Sub3) Static64.aClass72_15.method2259(this.aLong111);
				}
				if (local115 == null) {
					return null;
				}
			}
			if (local115 == null) {
				@Pc(188) int local188 = 0;
				@Pc(191) Class2_Sub1_Sub3_Sub7[] local191 = new Class2_Sub1_Sub3_Sub7[12];
				for (@Pc(193) int local193 = 0; local193 < 12; local193++) {
					@Pc(199) int local199 = local26[local193];
					@Pc(213) Class2_Sub1_Sub3_Sub7 local213;
					if (local199 >= 256 && local199 < 512) {
						local213 = Static92.method1561(local199 - 256).method2193();
						if (local213 != null) {
							local191[local188++] = local213;
						}
					}
					if (local199 >= 512) {
						local213 = Static78.method577(local199 - 512).method1101(this.aBoolean141);
						if (local213 != null) {
							local191[local188++] = local213;
						}
					}
				}
				@Pc(252) Class2_Sub1_Sub3_Sub7 local252 = new Class2_Sub1_Sub3_Sub7(local191, local188);
				for (@Pc(254) int local254 = 0; local254 < 5; local254++) {
					if (this.anIntArray337[local254] < Static58.aShortArrayArray40[local254].length) {
						local252.method2566(Static136.aShortArray24[local254], Static58.aShortArrayArray40[local254][this.anIntArray337[local254]]);
					}
					if (this.anIntArray337[local254] < Static147.aShortArrayArray107[local254].length) {
						local252.method2566(Static135.aShortArray23[local254], Static147.aShortArrayArray107[local254][this.anIntArray337[local254]]);
					}
				}
				local115 = local252.method2565(64, 850, -30, -50, -30, true);
				Static64.aClass72_15.method2254(local115, local23);
				this.aLong111 = local23;
			}
		}
		if (arg3 == null && arg1 == null) {
			return local115;
		}
		@Pc(343) Class2_Sub1_Sub3_Sub3 local343;
		if (arg3 != null && arg1 != null) {
			local343 = arg3.method1366(arg1, arg2, arg0, local115);
		} else if (arg3 == null) {
			local343 = arg1.method1361(local115, arg2);
		} else {
			local343 = arg3.method1361(local115, arg0);
		}
		return local343;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ[I[II)V")
	public void method2277(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static12.anInt361; local12++) {
					@Pc(18) Class2_Sub1_Sub15 local18 = Static92.method1561(local12);
					if (local18 != null && !local18.aBoolean136 && local8 + (arg1 ? 7 : 0) == local18.anInt3080) {
						arg2[Static119.anIntArray293[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray340 = arg2;
		this.aBoolean141 = arg1;
		this.anIntArray337 = arg3;
		this.anInt3202 = arg0;
		this.method2268();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBZ)V")
	public void method2278(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean141) {
			return;
		}
		@Pc(25) int local25 = this.anIntArray340[Static119.anIntArray293[arg0]];
		if (local25 == 0) {
			return;
		}
		local25 -= 256;
		@Pc(53) Class2_Sub1_Sub15 local53;
		do {
			if (arg1) {
				local25++;
				if (Static12.anInt361 <= local25) {
					local25 = 0;
				}
			} else {
				local25--;
				if (local25 < 0) {
					local25 = Static12.anInt361 - 1;
				}
			}
			local53 = Static92.method1561(local25);
		} while (local53 == null || local53.aBoolean136 || local53.anInt3080 != (this.aBoolean141 ? 7 : 0) + arg0);
		this.anIntArray340[Static119.anIntArray293[arg0]] = local25 + 256;
		this.method2268();
	}
}
