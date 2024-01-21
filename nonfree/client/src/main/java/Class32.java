import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class32 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "Z")
	public boolean aBoolean56;

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
	private int anInt1177;

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Lclient!pa;")
	public Class5_Sub2_Sub4_Sub7 method867() {
		if (this.anInt1177 != -1) {
			return Static63.method1254(this.anInt1177).method2125();
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < 12; local28++) {
			@Pc(34) int local34 = this.anIntArray181[local28];
			if (local34 >= 256 && local34 < 512 && !Static40.method872(local34 - 256).method1344()) {
				local26 = true;
			}
			if (local34 >= 512 && !Static81.method1515(local34 - 512).method166(this.aBoolean56)) {
				local26 = true;
			}
		}
		if (local26) {
			return null;
		}
		@Pc(77) int local77 = 0;
		@Pc(80) Class5_Sub2_Sub4_Sub7[] local80 = new Class5_Sub2_Sub4_Sub7[12];
		for (@Pc(82) int local82 = 0; local82 < 12; local82++) {
			@Pc(88) int local88 = this.anIntArray181[local82];
			@Pc(106) Class5_Sub2_Sub4_Sub7 local106;
			if (local88 >= 256 && local88 < 512) {
				local106 = Static40.method872(local88 - 256).method1354();
				if (local106 != null) {
					local80[local77++] = local106;
				}
			}
			if (local88 >= 512) {
				local106 = Static81.method1515(local88 - 512).method162(this.aBoolean56);
				if (local106 != null) {
					local80[local77++] = local106;
				}
			}
		}
		@Pc(147) Class5_Sub2_Sub4_Sub7 local147 = new Class5_Sub2_Sub4_Sub7(local80, local77);
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			if (this.anIntArray180[local149] != 0) {
				local147.method1575(Static91.aShortArrayArray1[local149][0], Static91.aShortArrayArray1[local149][this.anIntArray180[local149]]);
				if (local149 == 1) {
					local147.method1575(Static72.aShortArray9[0], Static72.aShortArray9[this.anIntArray180[local149]]);
				}
			}
		}
		return local147;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I")
	public int method868() {
		return this.anInt1177 == -1 ? this.anIntArray181[1] + (this.anIntArray181[11] << 5) + (this.anIntArray180[0] << 25) + (this.anIntArray180[4] << 20) + (this.anIntArray181[0] << 15) + (this.anIntArray181[8] << 10) : Static63.method1254(this.anInt1177).anInt3079 + 305419896;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBZ)V")
	public void method869(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean56) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray181[Static21.anIntArray114[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(44) Class5_Sub2_Sub10 local44;
		do {
			if (arg1) {
				local19++;
				if (Static92.anInt3048 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static92.anInt3048 - 1;
				}
			}
			local44 = Static40.method872(local19);
		} while (local44 == null || local44.aBoolean96 || local44.anInt1997 != (this.aBoolean56 ? 7 : 0) + arg0);
		this.anIntArray181[Static21.anIntArray114[arg0]] = local19 + 256;
		this.method875();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLclient!hb;)V")
	public void method870(@OriginalArg(1) Class5_Sub9 arg0) {
		arg0.method1428(this.aBoolean56 ? 1 : 0);
		@Pc(32) int local32;
		for (@Pc(23) int local23 = 0; local23 < 7; local23++) {
			local32 = this.anIntArray181[Static21.anIntArray114[local23]];
			if (local32 == 0) {
				arg0.method1428(-1);
			} else {
				arg0.method1428(local32 - 256);
			}
		}
		for (local32 = 0; local32 < 5; local32++) {
			arg0.method1428(this.anIntArray180[local32]);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BZ)V")
	public void method873(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean56 != arg0) {
			this.method877(null, -1, this.anIntArray180, arg0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILclient!ka;Lclient!ka;B)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub9 arg2, @OriginalArg(3) Class5_Sub2_Sub9 arg3) {
		if (this.anInt1177 != -1) {
			return Static63.method1254(this.anInt1177).method2127(arg1, arg3, arg2, arg0);
		}
		@Pc(34) long local34 = this.aLong63;
		@Pc(37) int[] local37 = this.anIntArray181;
		if (arg2 != null && (arg2.anInt1676 >= 0 || arg2.anInt1667 >= 0)) {
			local37 = new int[12];
			for (@Pc(53) int local53 = 0; local53 < 12; local53++) {
				local37[local53] = this.anIntArray181[local53];
			}
			if (arg2.anInt1676 >= 0) {
				local34 += arg2.anInt1676 - this.anIntArray181[5] << 8;
				local37[5] = arg2.anInt1676;
			}
			if (arg2.anInt1667 >= 0) {
				local34 += arg2.anInt1667 - this.anIntArray181[3] << 16;
				local37[3] = arg2.anInt1667;
			}
		}
		@Pc(122) Class5_Sub2_Sub4_Sub2 local122 = (Class5_Sub2_Sub4_Sub2) Static100.aClass67_23.method1823(local34);
		if (local122 == null) {
			@Pc(126) boolean local126 = false;
			for (@Pc(128) int local128 = 0; local128 < 12; local128++) {
				@Pc(134) int local134 = local37[local128];
				if (local134 >= 256 && local134 < 512 && !Static40.method872(local134 - 256).method1348()) {
					local126 = true;
				}
				if (local134 >= 512 && !Static81.method1515(local134 - 512).method168(this.aBoolean56)) {
					local126 = true;
				}
			}
			if (local126) {
				if (this.aLong64 != -1L) {
					local122 = (Class5_Sub2_Sub4_Sub2) Static100.aClass67_23.method1823(this.aLong64);
				}
				if (local122 == null) {
					return null;
				}
			}
			if (local122 == null) {
				@Pc(198) Class5_Sub2_Sub4_Sub7[] local198 = new Class5_Sub2_Sub4_Sub7[12];
				@Pc(200) int local200 = 0;
				for (@Pc(202) int local202 = 0; local202 < 12; local202++) {
					@Pc(208) int local208 = local37[local202];
					@Pc(224) Class5_Sub2_Sub4_Sub7 local224;
					if (local208 >= 256 && local208 < 512) {
						local224 = Static40.method872(local208 - 256).method1345();
						if (local224 != null) {
							local198[local200++] = local224;
						}
					}
					if (local208 >= 512) {
						local224 = Static81.method1515(local208 - 512).method164(this.aBoolean56);
						if (local224 != null) {
							local198[local200++] = local224;
						}
					}
				}
				@Pc(263) Class5_Sub2_Sub4_Sub7 local263 = new Class5_Sub2_Sub4_Sub7(local198, local200);
				for (@Pc(265) int local265 = 0; local265 < 5; local265++) {
					if (this.anIntArray180[local265] != 0) {
						local263.method1575(Static91.aShortArrayArray1[local265][0], Static91.aShortArrayArray1[local265][this.anIntArray180[local265]]);
						if (local265 == 1) {
							local263.method1575(Static72.aShortArray9[0], Static72.aShortArray9[this.anIntArray180[local265]]);
						}
					}
				}
				local122 = local263.method1579(64, 850, -30, -50, -30);
				Static100.aClass67_23.method1818(local122, local34);
				this.aLong64 = local34;
			}
		}
		if (arg2 == null && arg3 == null) {
			return local122;
		}
		@Pc(346) Class5_Sub2_Sub4_Sub2 local346;
		if (arg2 != null && arg3 != null) {
			local346 = arg2.method1147(arg1, local122, arg3, arg0);
		} else if (arg2 == null) {
			local346 = arg3.method1151(arg1, local122);
		} else {
			local346 = arg2.method1151(arg0, local122);
		}
		return local346;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	private void method875() {
		@Pc(4) int local4 = this.anIntArray181[5];
		@Pc(11) long local11 = this.aLong63;
		@Pc(16) int local16 = this.anIntArray181[9];
		this.anIntArray181[9] = local4;
		this.aLong63 = 0L;
		this.anIntArray181[5] = local16;
		for (@Pc(31) int local31 = 0; local31 < 12; local31++) {
			this.aLong63 <<= 0x4;
			if (this.anIntArray181[local31] >= 256) {
				this.aLong63 += this.anIntArray181[local31] - 256;
			}
		}
		if (this.anIntArray181[0] >= 256) {
			this.aLong63 += this.anIntArray181[0] - 256 >> 4;
		}
		if (this.anIntArray181[1] >= 256) {
			this.aLong63 += this.anIntArray181[1] - 256 >> 8;
		}
		for (@Pc(106) int local106 = 0; local106 < 5; local106++) {
			this.aLong63 <<= 0x3;
			this.aLong63 += this.anIntArray180[local106];
		}
		this.aLong63 <<= 0x1;
		this.anIntArray181[9] = local16;
		this.aLong63 += this.aBoolean56 ? 1 : 0;
		this.anIntArray181[5] = local4;
		if (local11 != 0L && this.aLong63 != local11) {
			Static100.aClass67_23.method1822(local11);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BZI)V")
	public void method876(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray180[arg1];
		if (arg0) {
			local8++;
			if (local8 >= Static91.aShortArrayArray1[arg1].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static91.aShortArrayArray1[arg1].length - 1;
			}
		}
		this.anIntArray180[arg1] = local8;
		this.method875();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([II[IIZ)V")
	public void method877(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				for (@Pc(9) int local9 = 0; local9 < Static92.anInt3048; local9++) {
					@Pc(14) Class5_Sub2_Sub10 local14 = Static40.method872(local9);
					if (local14 != null && !local14.aBoolean96 && local14.anInt1997 == (arg3 ? 7 : 0) + local6) {
						arg0[Static21.anIntArray114[local6]] = local9 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray181 = arg0;
		this.anIntArray180 = arg2;
		this.aBoolean56 = arg3;
		this.anInt1177 = arg1;
		this.method875();
	}
}
