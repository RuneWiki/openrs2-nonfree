import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!eda", name = "N", descriptor = "I")
	public int anInt2691 = 99;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(IIIZ)V")
	public Class85_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static471.aClass291_5, Static81.aClass162_11);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!ed;BLclient!oa;IIIIIII)V")
	public void method2388(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(3) Class66 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static189.aClass4_Sub2_Sub1_1.method7652(Static403.anInt6994) && !Static209.method7919(Static312.anInt9775, arg0, arg6, arg7)) {
			return;
		}
		if (arg5 < this.anInt2691) {
			this.anInt2691 = arg5;
		}
		@Pc(42) Class25 local42 = Static553.aClass288_4.method6419(arg9);
		if (arg2.method6837() && Static189.aClass4_Sub2_Sub1_1.aBoolean661 && local42.aBoolean54) {
			return;
		}
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (arg8 == 1 || arg8 == 3) {
			local61 = local42.anInt612;
			local64 = local42.anInt638;
		} else {
			local64 = local42.anInt612;
			local61 = local42.anInt638;
		}
		@Pc(85) int local85;
		@Pc(89) int local89;
		if (super.anInt2672 < arg6 + local64) {
			local85 = arg6;
			local89 = arg6 + 1;
		} else {
			local85 = (local64 >> 1) + arg6;
			local89 = (local64 + 1 >> 1) + arg6;
		}
		@Pc(117) int local117;
		@Pc(121) int local121;
		if (local61 + arg0 > super.anInt2684) {
			local117 = arg0;
			local121 = arg0 + 1;
		} else {
			local121 = (local61 + 1 >> 1) + arg0;
			local117 = (local61 >> 1) + arg0;
		}
		@Pc(141) Class16 local141 = Static112.aClass16Array3[arg7];
		@Pc(165) int local165 = local141.JA(local85, local117) + local141.JA(local89, local117) + local141.JA(local85, local121) + local141.JA(local89, local121) >> 2;
		@Pc(173) int local173 = (local64 << 8) + (arg6 << 9);
		@Pc(182) int local182 = (arg0 << 9) + (local61 << 8);
		@Pc(194) boolean local194 = Static256.aBoolean379 && !super.aBoolean215 && local42.aBoolean48;
		if (local42.method571()) {
			Static91.method2092(local42, arg5, arg8, null, null, arg0, arg6);
		}
		@Pc(228) boolean local228 = arg4 == -1 && local42.anInt645 == -1 && local42.anIntArray114 == null && local42.anIntArray115 == null && !local42.aBoolean55;
		if (Static146.aBoolean258 && (Static199.method3569(arg3) && local42.anInt642 != 1 || !(!Static387.method7903(arg3) || local42.anInt642 != 0))) {
			return;
		}
		if (arg3 != 22) {
			@Pc(395) Class10_Sub1 local395;
			@Pc(359) Class10_Sub1_Sub1 local359;
			@Pc(393) int local393;
			if (arg3 == 10 || arg3 == 11) {
				local359 = null;
				if (local228) {
					@Pc(389) Class10_Sub1_Sub1 local389 = new Class10_Sub1_Sub1(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg6, local64 + arg6 - 1, arg0, arg0 + local61 - 1, arg3, arg8, local194);
					local393 = local389.method764();
					local395 = local389;
					local359 = local389;
				} else {
					local395 = new Class10_Sub1_Sub6(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg6, arg6 + local64 - 1, arg0, local61 + arg0 - 1, arg3, arg8, arg4);
					local393 = 15;
				}
				@Pc(441) Class10_Sub1 local441 = Static541.method7510(arg5, arg6, arg0, qi.class);
				@Pc(443) boolean local443 = false;
				if (local441 instanceof Class10_Sub1_Sub5 && arg6 == local441.aShort116 && arg0 == local441.aShort117) {
					local443 = true;
					((Class10_Sub1_Sub5) local441).aClass10_Sub1_2 = local395;
				}
				if (local443 || Static314.method7738(local395, false)) {
					if (local359 != null && local359.method7739()) {
						local359.method7745(arg2);
					}
					if (local42.aBoolean49 && Static256.aBoolean379) {
						if (local393 > 30) {
							local393 = 30;
						}
						for (@Pc(492) int local492 = 0; local492 <= local64; local492++) {
							for (@Pc(496) int local496 = 0; local496 <= local61; local496++) {
								local141.EA(arg6 + local492, local496 + arg0, local393);
							}
						}
					}
				}
				if (local42.anInt607 != 0 && arg1 != null) {
					arg1.method2342(local64, !local42.aBoolean62, local61, arg6, local42.aBoolean56, arg0);
				}
			} else {
				@Pc(641) Class10_Sub1 local641;
				if (arg3 >= 12 && arg3 <= 17 || arg3 >= 18 && arg3 <= 21) {
					if (local228) {
						local359 = new Class10_Sub1_Sub1(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg6, local64 + arg6 - 1, arg0, arg0 + local61 - 1, arg3, arg8, local194);
						local395 = local359;
						if (local359.method7739()) {
							local359.method7745(arg2);
						}
					} else {
						local395 = new Class10_Sub1_Sub6(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg6, local64 + arg6 - 1, arg0, local61 + arg0 - 1, arg3, arg8, arg4);
					}
					local641 = Static541.method7510(arg5, arg6, arg0, qi.class);
					if (local641 instanceof Class10_Sub1_Sub5 && arg6 == local641.aShort116 && local641.aShort117 == arg0) {
						((Class10_Sub1_Sub5) local641).aClass10_Sub1_2 = local395;
					} else {
						Static314.method7738(local395, false);
					}
					if (Static256.aBoolean379 && !super.aBoolean215 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg5 > 0 && local42.anInt642 != 0) {
						super.aByteArrayArrayArray14[arg5][arg6][arg0] = (byte) (super.aByteArrayArrayArray14[arg5][arg6][arg0] | 0x4);
					}
					if (local42.anInt607 != 0 && arg1 != null) {
						arg1.method2342(local64, !local42.aBoolean62, local61, arg6, local42.aBoolean56, arg0);
					}
				} else {
					@Pc(761) Class10_Sub2 local761;
					if (arg3 == 0) {
						@Pc(733) int local733 = local42.anInt642;
						if (Static106.aBoolean209 && local42.anInt642 == -1) {
							local733 = 1;
						}
						if (local228) {
							@Pc(759) Class10_Sub2_Sub2 local759 = new Class10_Sub2_Sub2(arg2, local42, arg7, local173, local165, local182, super.aBoolean215, arg3, arg8, local194);
							local761 = local759;
							if (local759.method7739()) {
								local759.method7745(arg2);
							}
						} else {
							local761 = new Class10_Sub2_Sub3(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg3, arg8, arg4);
						}
						@Pc(792) Class10_Sub2 local792 = Static216.method3734(arg5, arg6, arg0);
						if (local792 instanceof Class10_Sub2_Sub1) {
							((Class10_Sub2_Sub1) local792).aClass10_Sub2_1 = local761;
						} else {
							Static461.method6470(arg5, arg6, arg0, local761, null);
						}
						if (Static256.aBoolean379) {
							if (arg8 == 0) {
								if (local42.aBoolean49) {
									local141.EA(arg6, arg0, 50);
									local141.EA(arg6, arg0 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean215) {
									super.aByteArrayArrayArray14[arg5][arg6][arg0] = (byte) (super.aByteArrayArrayArray14[arg5][arg6][arg0] | 0x1);
								}
							} else if (arg8 == 1) {
								if (local42.aBoolean49) {
									local141.EA(arg6, arg0 + 1, 50);
									local141.EA(arg6 + 1, arg0 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean215) {
									super.aByteArrayArrayArray14[arg5][arg6][arg0 + 1] = (byte) (super.aByteArrayArrayArray14[arg5][arg6][arg0 + 1] | 0x2);
								}
							} else if (arg8 == 2) {
								if (local42.aBoolean49) {
									local141.EA(arg6 + 1, arg0, 50);
									local141.EA(arg6 + 1, arg0 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean215) {
									super.aByteArrayArrayArray14[arg5][arg6 + 1][arg0] = (byte) (super.aByteArrayArrayArray14[arg5][arg6 + 1][arg0] | 0x1);
								}
							} else if (arg8 == 3) {
								if (local42.aBoolean49) {
									local141.EA(arg6, arg0, 50);
									local141.EA(arg6 + 1, arg0, 50);
								}
								if (local733 == 1 && !super.aBoolean215) {
									super.aByteArrayArrayArray14[arg5][arg6][arg0] = (byte) (super.aByteArrayArrayArray14[arg5][arg6][arg0] | 0x2);
								}
							}
						}
						if (local42.anInt607 != 0 && arg1 != null) {
							arg1.method2351(local42.aBoolean56, !local42.aBoolean62, arg6, arg0, arg3, arg8);
						}
						if (local42.anInt635 != 64) {
							Static454.method6417(arg5, arg6, arg0, local42.anInt635);
						}
					} else {
						@Pc(1069) Class10_Sub2_Sub2 local1069;
						@Pc(1071) Class10_Sub2 local1071;
						if (arg3 == 1) {
							if (local228) {
								local1069 = new Class10_Sub2_Sub2(arg2, local42, arg7, local173, local165, local182, super.aBoolean215, arg3, arg8, local194);
								local1071 = local1069;
								if (local1069.method7739()) {
									local1069.method7745(arg2);
								}
							} else {
								local1071 = new Class10_Sub2_Sub3(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg3, arg8, arg4);
							}
							local761 = Static216.method3734(arg5, arg6, arg0);
							if (local761 instanceof Class10_Sub2_Sub1) {
								((Class10_Sub2_Sub1) local761).aClass10_Sub2_1 = local1071;
							} else {
								Static461.method6470(arg5, arg6, arg0, local1071, null);
							}
							if (local42.aBoolean49 && Static256.aBoolean379) {
								if (arg8 == 0) {
									local141.EA(arg6, arg0 + 1, 50);
								} else if (arg8 == 1) {
									local141.EA(arg6 + 1, arg0 - -1, 50);
								} else if (arg8 == 2) {
									local141.EA(arg6 + 1, arg0, 50);
								} else if (arg8 == 3) {
									local141.EA(arg6, arg0, 50);
								}
							}
							if (local42.anInt607 != 0 && arg1 != null) {
								arg1.method2351(local42.aBoolean56, !local42.aBoolean62, arg6, arg0, arg3, arg8);
							}
						} else if (arg3 == 2) {
							local393 = arg8 + 1 & 0x3;
							if (local228) {
								@Pc(1230) Class10_Sub2_Sub2 local1230 = new Class10_Sub2_Sub2(arg2, local42, arg7, local173, local165, local182, super.aBoolean215, arg3, arg8 + 4, local194);
								@Pc(1245) Class10_Sub2_Sub2 local1245 = new Class10_Sub2_Sub2(arg2, local42, arg7, local173, local165, local182, super.aBoolean215, arg3, local393, local194);
								if (local1230.method7739()) {
									local1230.method7745(arg2);
								}
								if (local1245.method7739()) {
									local1245.method7745(arg2);
								}
								local761 = local1245;
								local1071 = local1230;
							} else {
								local1071 = new Class10_Sub2_Sub3(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg3, arg8 + 4, arg4);
								local761 = new Class10_Sub2_Sub3(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg3, local393, arg4);
							}
							Static461.method6470(arg5, arg6, arg0, local1071, local761);
							if (local42.anInt642 == 1 && Static256.aBoolean379 && !super.aBoolean215) {
								if (arg8 == 0) {
									super.aByteArrayArrayArray14[arg5][arg6][arg0] = (byte) (super.aByteArrayArrayArray14[arg5][arg6][arg0] | 0x1);
									super.aByteArrayArrayArray14[arg5][arg6][arg0 + 1] = (byte) (super.aByteArrayArrayArray14[arg5][arg6][arg0 + 1] | 0x2);
								} else if (arg8 == 1) {
									super.aByteArrayArrayArray14[arg5][arg6][arg0 + 1] = (byte) (super.aByteArrayArrayArray14[arg5][arg6][arg0 + 1] | 0x2);
									super.aByteArrayArrayArray14[arg5][arg6 + 1][arg0] = (byte) (super.aByteArrayArrayArray14[arg5][arg6 + 1][arg0] | 0x1);
								} else if (arg8 == 2) {
									super.aByteArrayArrayArray14[arg5][arg6 + 1][arg0] = (byte) (super.aByteArrayArrayArray14[arg5][arg6 + 1][arg0] | 0x1);
									super.aByteArrayArrayArray14[arg5][arg6][arg0] = (byte) (super.aByteArrayArrayArray14[arg5][arg6][arg0] | 0x2);
								} else if (arg8 == 3) {
									super.aByteArrayArrayArray14[arg5][arg6][arg0] = (byte) (super.aByteArrayArrayArray14[arg5][arg6][arg0] | 0x2);
									super.aByteArrayArrayArray14[arg5][arg6][arg0] = (byte) (super.aByteArrayArrayArray14[arg5][arg6][arg0] | 0x1);
								}
							}
							if (local42.anInt607 != 0 && arg1 != null) {
								arg1.method2351(local42.aBoolean56, !local42.aBoolean62, arg6, arg0, arg3, arg8);
							}
							if (local42.anInt635 != 64) {
								Static454.method6417(arg5, arg6, arg0, local42.anInt635);
							}
						} else if (arg3 == 3) {
							if (local228) {
								local1069 = new Class10_Sub2_Sub2(arg2, local42, arg7, local173, local165, local182, super.aBoolean215, arg3, arg8, local194);
								local1071 = local1069;
								if (local1069.method7739()) {
									local1069.method7745(arg2);
								}
							} else {
								local1071 = new Class10_Sub2_Sub3(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg3, arg8, arg4);
							}
							local761 = Static216.method3734(arg5, arg6, arg0);
							if (local761 instanceof Class10_Sub2_Sub1) {
								((Class10_Sub2_Sub1) local761).aClass10_Sub2_1 = local1071;
							} else {
								Static461.method6470(arg5, arg6, arg0, local1071, null);
							}
							if (local42.aBoolean49 && Static256.aBoolean379) {
								if (arg8 == 0) {
									local141.EA(arg6, arg0 + 1, 50);
								} else if (arg8 == 1) {
									local141.EA(arg6 + 1, arg0 + 1, 50);
								} else if (arg8 == 2) {
									local141.EA(arg6 + 1, arg0, 50);
								} else if (arg8 == 3) {
									local141.EA(arg6, arg0, 50);
								}
							}
							if (local42.anInt607 != 0 && arg1 != null) {
								arg1.method2351(local42.aBoolean56, !local42.aBoolean62, arg6, arg0, arg3, arg8);
							}
						} else if (arg3 == 9) {
							if (local228) {
								local359 = new Class10_Sub1_Sub1(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg6, arg6, arg0, arg0, arg3, arg8, local194);
								if (local359.method7739()) {
									local359.method7745(arg2);
								}
								local395 = local359;
							} else {
								local395 = new Class10_Sub1_Sub6(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg6, local64 + arg6 - 1, arg0, local61 + arg0 - 1, arg3, arg8, arg4);
							}
							local641 = Static541.method7510(arg5, arg6, arg0, qi.class);
							if (local641 instanceof Class10_Sub1_Sub5 && arg6 == local641.aShort116 && arg0 == local641.aShort117) {
								((Class10_Sub1_Sub5) local641).aClass10_Sub1_2 = local395;
							} else {
								Static314.method7738(local395, false);
							}
							if (local42.anInt607 != 0 && arg1 != null) {
								arg1.method2342(local64, !local42.aBoolean62, local61, arg6, local42.aBoolean56, arg0);
							}
							if (local42.anInt635 != 64) {
								Static454.method6417(arg5, arg6, arg0, local42.anInt635);
							}
						} else {
							@Pc(1849) Class10_Sub4 local1849;
							if (arg3 == 4) {
								if (local228) {
									@Pc(1847) Class10_Sub4_Sub1 local1847 = new Class10_Sub4_Sub1(arg2, local42, arg7, local173, local165, local182, super.aBoolean215, 0, 0, 0, arg3, arg8);
									local1849 = local1847;
									if (local1847.method7739()) {
										local1847.method7745(arg2);
									}
								} else {
									local1849 = new Class10_Sub4_Sub3(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, 0, 0, 0, arg3, arg8, arg4);
								}
								@Pc(1883) Class10_Sub4 local1883 = Static183.method3413(arg5, arg6, arg0);
								if (local1883 instanceof Class10_Sub4_Sub2) {
									((Class10_Sub4_Sub2) local1883).aClass10_Sub4_3 = local1849;
								} else {
									Static178.method3351(arg5, arg6, arg0, local1849, null);
								}
							} else {
								@Pc(1903) int local1903;
								@Pc(1909) Interface17 local1909;
								@Pc(1948) Class10_Sub4_Sub1 local1948;
								@Pc(1992) Class10_Sub4 local1992;
								if (arg3 == 5) {
									local1903 = 65;
									local1909 = (Interface17) Static216.method3734(arg5, arg6, arg0);
									if (local1909 != null) {
										local1903 = Static553.aClass288_4.method6419(local1909.method7743()).anInt635 + 1;
									}
									if (local228) {
										local1948 = new Class10_Sub4_Sub1(arg2, local42, arg7, local173, local165, local182, super.aBoolean215, 0, local1903 * Static278.anIntArray451[arg8], local1903 * Static366.anIntArray530[arg8], arg3, arg8);
										if (local1948.method7739()) {
											local1948.method7745(arg2);
										}
										local1849 = local1948;
									} else {
										local1849 = new Class10_Sub4_Sub3(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, 0, local1903 * Static278.anIntArray451[arg8], Static366.anIntArray530[arg8] * local1903, arg3, arg8, arg4);
									}
									local1992 = Static183.method3413(arg5, arg6, arg0);
									if (local1992 instanceof Class10_Sub4_Sub2) {
										((Class10_Sub4_Sub2) local1992).aClass10_Sub4_3 = local1849;
									} else {
										Static178.method3351(arg5, arg6, arg0, local1849, null);
									}
								} else if (arg3 == 6) {
									local1903 = 33;
									local1909 = (Interface17) Static216.method3734(arg5, arg6, arg0);
									if (local1909 != null) {
										local1903 = Static553.aClass288_4.method6419(local1909.method7743()).anInt635 / 2 + 1;
									}
									if (local228) {
										local1948 = new Class10_Sub4_Sub1(arg2, local42, arg7, local173, local165, local182, super.aBoolean215, arg8, Static278.anIntArray451[arg8] * local1903, local1903 * Static366.anIntArray530[arg8], arg3, arg8 + 4);
										local1849 = local1948;
										if (local1948.method7739()) {
											local1948.method7745(arg2);
										}
									} else {
										local1849 = new Class10_Sub4_Sub3(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg8, Static163.anIntArray352[arg8] * local1903, local1903 * Static360.anIntArray514[arg8], arg3, arg8 + 4, arg4);
									}
									local1992 = Static183.method3413(arg5, arg6, arg0);
									if (local1992 instanceof Class10_Sub4_Sub2) {
										((Class10_Sub4_Sub2) local1992).aClass10_Sub4_3 = local1849;
									} else {
										Static178.method3351(arg5, arg6, arg0, local1849, null);
									}
								} else if (arg3 == 7) {
									local1903 = arg8 + 2 & 0x3;
									if (local228) {
										@Pc(2177) Class10_Sub4_Sub1 local2177 = new Class10_Sub4_Sub1(arg2, local42, arg7, local173, local165, local182, super.aBoolean215, local1903, 0, 0, arg3, local1903 + 4);
										if (local2177.method7739()) {
											local2177.method7745(arg2);
										}
										local1849 = local2177;
									} else {
										local1849 = new Class10_Sub4_Sub3(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, local1903, 0, 0, arg3, local1903 + 4, arg4);
									}
									@Pc(2192) Class10_Sub4 local2192 = Static183.method3413(arg5, arg6, arg0);
									if (local2192 instanceof Class10_Sub4_Sub2) {
										((Class10_Sub4_Sub2) local2192).aClass10_Sub4_3 = local1849;
									} else {
										Static178.method3351(arg5, arg6, arg0, local1849, null);
									}
								} else if (arg3 == 8) {
									local393 = arg8 + 2 & 0x3;
									@Pc(2218) int local2218 = 33;
									@Pc(2224) Interface17 local2224 = (Interface17) Static216.method3734(arg5, arg6, arg0);
									if (local2224 != null) {
										local2218 = Static553.aClass288_4.method6419(local2224.method7743()).anInt635 / 2 + 1;
									}
									@Pc(2269) Class10_Sub4 local2269;
									@Pc(2292) Class10_Sub4 local2292;
									if (local228) {
										local2269 = new Class10_Sub4_Sub1(arg2, local42, arg7, local173, local165, local182, super.aBoolean215, arg8, Static163.anIntArray352[arg8] * local2218, local2218 * Static360.anIntArray514[arg8], arg3, arg8 + 4);
										local2292 = new Class10_Sub4_Sub1(arg2, local42, arg7, local173, local165, local182, super.aBoolean215, arg8, 0, 0, arg3, local393 + 4);
										if (local2269.method7739()) {
											local2269.method7745(arg2);
										}
										if (local2292.method7739()) {
											local2292.method7745(arg2);
										}
									} else {
										local2269 = new Class10_Sub4_Sub3(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg8, Static163.anIntArray352[arg8] * local2218, Static360.anIntArray514[arg8] * local2218, arg3, arg8 + 4, arg4);
										local2292 = new Class10_Sub4_Sub3(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg8, 0, 0, arg3, local393 + 4, arg4);
									}
									Static178.method3351(arg5, arg6, arg0, local2269, local2292);
								}
							}
						}
					}
				}
			}
		} else if (Static189.aClass4_Sub2_Sub1_1.aBoolean656 || local42.anInt599 != 0 || local42.anInt607 == 1 || local42.aBoolean61) {
			@Pc(293) Class10_Sub5 local293;
			if (local228) {
				@Pc(291) Class10_Sub5_Sub2 local291 = new Class10_Sub5_Sub2(arg2, local42, arg7, local173, local165, local182, super.aBoolean215, arg8, local194);
				local293 = local291;
				if (local291.method7739()) {
					local291.method7745(arg2);
				}
			} else {
				local293 = new Class10_Sub5_Sub1(arg2, local42, arg5, arg7, local173, local165, local182, super.aBoolean215, arg8, arg4);
			}
			@Pc(323) Class10_Sub5 local323 = Static38.method651(arg5, arg6, arg0);
			if (local323 instanceof Class10_Sub5_Sub3) {
				((Class10_Sub5_Sub3) local323).aClass10_Sub5_2 = local293;
			} else {
				Static344.method5097(arg5, arg6, arg0, local293);
			}
			if (local42.anInt607 == 1 && arg1 != null) {
				arg1.method2358(arg6, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!ed;IILclient!oa;II)V")
	public void method2389(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class66 arg4, @OriginalArg(5) int arg5) {
		@Pc(7) Interface17 local7 = null;
		if (arg5 == 0) {
			local7 = (Interface17) Static216.method3734(arg3, arg2, arg0);
		}
		if (arg5 == 1) {
			local7 = (Interface17) Static183.method3413(arg3, arg2, arg0);
		}
		if (arg5 == 2) {
			local7 = (Interface17) Static541.method7510(arg3, arg2, arg0, qi.class);
		}
		if (arg5 == 3) {
			local7 = (Interface17) Static38.method651(arg3, arg2, arg0);
		}
		if (local7 == null) {
			return;
		}
		@Pc(64) Class25 local64 = Static553.aClass288_4.method6419(local7.method7743());
		@Pc(68) int local68 = local7.method7742();
		@Pc(72) int local72 = local7.method7744();
		if (local64.method571()) {
			Static50.method7710(arg3, arg2, local64, arg0);
		}
		if (local7.method7739()) {
			local7.method7746(arg4);
		}
		if (arg5 == 0) {
			@Pc(100) Class10_Sub2 local100 = Static216.method3734(arg3, arg2, arg0);
			if (local100 instanceof Class10_Sub2_Sub1) {
				((Class10_Sub2_Sub1) local100).aClass10_Sub2_1 = null;
			} else {
				Static596.method8017(arg3, arg2, arg0);
			}
			if (local64.anInt607 != 0) {
				arg1.method2352(local68, !local64.aBoolean62, local72, local64.aBoolean56, arg2, arg0);
				return;
			}
			return;
		}
		if (arg5 == 1) {
			@Pc(145) Class10_Sub4 local145 = Static183.method3413(arg3, arg2, arg0);
			if (!(local145 instanceof Class10_Sub4_Sub2)) {
				Static292.method4576(arg3, arg2, arg0);
				return;
			}
			((Class10_Sub4_Sub2) local145).aClass10_Sub4_3 = null;
			return;
		}
		if (arg5 == 2) {
			@Pc(176) Class10_Sub1 local176 = Static541.method7510(arg3, arg2, arg0, qi.class);
			if (local176 instanceof Class10_Sub1_Sub5 && local176.aShort116 == arg2 && local176.aShort117 == arg0) {
				((Class10_Sub1_Sub5) local176).aClass10_Sub1_2 = null;
			} else {
				Static146.method3010(arg3, arg2, arg0, qi.class);
			}
			if (local64.anInt607 != 0 && local64.anInt612 + arg2 < super.anInt2672 && super.anInt2684 > local64.anInt612 + arg0 && arg2 + local64.anInt638 < super.anInt2672 && local64.anInt638 + arg0 < super.anInt2684) {
				arg1.method2350(local64.anInt612, arg0, local64.anInt638, !local64.aBoolean62, arg2, local64.aBoolean56, local72);
				return;
			}
			return;
		}
		if (arg5 != 3) {
			return;
		}
		@Pc(282) Class10_Sub5 local282 = Static38.method651(arg3, arg2, arg0);
		if (local282 instanceof Class10_Sub5_Sub3) {
			((Class10_Sub5_Sub3) local282).aClass10_Sub5_2 = null;
		} else {
			Static18.method1347(arg3, arg2, arg0);
		}
		if (local64.anInt607 == 1) {
			arg1.method2343(arg2, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!eh;I[ILclient!oa;BI)V")
	public void method2390(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class66 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean215) {
			return;
		}
		@Pc(15) boolean local15 = false;
		@Pc(17) Class285 local17 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		while (true) {
			@Pc(41) int local41;
			@Pc(107) int local107;
			@Pc(111) int local111;
			@Pc(48) int local48;
			@Pc(98) int local98;
			label306: do {
				while (true) {
					@Pc(30) int local30;
					@Pc(266) int local266;
					@Pc(270) int local270;
					while (arg0.anInt7219 < arg0.aByteArray97.length) {
						local30 = arg0.method6015();
						if (local30 == 0) {
							local17 = new Class285(arg0);
						} else {
							if (local30 == 1) {
								local41 = arg0.method6015();
								continue label306;
							}
							if (local30 == 2) {
								if (local17 == null) {
									local17 = new Class285();
								}
								local17.method6285(arg0);
							} else if (local30 != 128) {
								if (local30 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray10 == null) {
									super.aByteArrayArrayArray10 = new byte[4][][];
								}
								local15 = true;
								for (local41 = 0; local41 < 4; local41++) {
									@Pc(254) byte local254 = arg0.method6021();
									if (local254 == 0 && super.aByteArrayArrayArray10[local41] != null) {
										local266 = arg1;
										local270 = arg1 + 64;
										local98 = arg4;
										if (arg1 < 0) {
											local266 = 0;
										} else if (super.anInt2672 <= arg1) {
											local266 = super.anInt2672;
										}
										if (local270 < 0) {
											local270 = 0;
										} else if (super.anInt2672 <= local270) {
											local270 = super.anInt2672;
										}
										local107 = arg4 + 64;
										if (arg4 < 0) {
											local98 = 0;
										} else if (arg4 >= super.anInt2684) {
											local98 = super.anInt2684;
										}
										if (local107 < 0) {
											local107 = 0;
										} else if (super.anInt2684 <= local107) {
											local107 = super.anInt2684;
										}
										while (local266 < local270) {
											while (local107 > local98) {
												super.aByteArrayArrayArray10[local41][local266][local98] = 0;
												local98++;
											}
											local266++;
										}
									} else if (local254 == 1) {
										if (super.aByteArrayArrayArray10[local41] == null) {
											super.aByteArrayArrayArray10[local41] = new byte[super.anInt2672 + 1][super.anInt2684 + 1];
										}
										for (local266 = 0; local266 < 64; local266 += 4) {
											for (local270 = 0; local270 < 64; local270 += 4) {
												@Pc(544) byte local544 = arg0.method6021();
												for (local107 = arg1 + local266; local107 < local266 + arg1 + 4; local107++) {
													for (local111 = local270 + arg4; local111 < local270 + arg4 + 4; local111++) {
														if (local107 >= 0 && super.anInt2672 > local107 && local111 >= 0 && super.anInt2684 > local111) {
															super.aByteArrayArrayArray10[local41][local107][local111] = local544;
														}
													}
												}
											}
										}
									} else if (local254 == 2) {
										if (super.aByteArrayArrayArray10[local41] == null) {
											super.aByteArrayArrayArray10[local41] = new byte[super.anInt2672 + 1][super.anInt2684 + 1];
										}
										if (local41 > 0) {
											local266 = arg1;
											local270 = arg1 + 64;
											local98 = arg4;
											local107 = arg4 + 64;
											if (local270 < 0) {
												local270 = 0;
											} else if (local270 >= super.anInt2672) {
												local270 = super.anInt2672;
											}
											if (arg4 < 0) {
												local98 = 0;
											} else if (arg4 >= super.anInt2684) {
												local98 = super.anInt2684;
											}
											if (arg1 < 0) {
												local266 = 0;
											} else if (super.anInt2672 <= arg1) {
												local266 = super.anInt2672;
											}
											if (local107 < 0) {
												local107 = 0;
											} else if (super.anInt2684 <= local107) {
												local107 = super.anInt2684;
											}
											while (local266 < local270) {
												while (local98 < local107) {
													super.aByteArrayArrayArray10[local41][local266][local98] = super.aByteArrayArrayArray10[local41 - 1][local266][local98];
													local98++;
												}
												local266++;
											}
										}
									}
								}
							} else if (arg2 == null) {
								arg0.anInt7219 += 10;
							} else {
								arg2[0] = arg0.method5982();
								arg2[1] = arg0.method6003();
								arg2[2] = arg0.method6003();
								arg2[3] = arg0.method6003();
								arg2[4] = arg0.method5982();
							}
						}
					}
					if (local17 != null) {
						for (local30 = 0; local30 < 8; local30++) {
							for (local41 = 0; local41 < 8; local41++) {
								local48 = (arg1 >> 3) + local30;
								local266 = (arg4 >> 3) + local41;
								if (local48 >= 0 && super.anInt2672 >> 3 > local48 && local266 >= 0 && super.anInt2684 >> 3 > local266) {
									Static368.method5541(local266, local48, local17);
								}
							}
						}
					}
					if (!local15 && super.aByteArrayArrayArray10 != null) {
						for (local30 = 0; local30 < 4; local30++) {
							if (super.aByteArrayArrayArray10[local30] != null) {
								for (local41 = 0; local41 < 16; local41++) {
									for (local48 = 0; local48 < 16; local48++) {
										local266 = local41 + (arg1 >> 2);
										local270 = (arg4 >> 2) + local48;
										if (local266 >= 0 && local266 < 26 && local270 >= 0 && local270 < 26) {
											super.aByteArrayArrayArray10[local30][local266][local270] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local41 <= 0);
			for (local48 = 0; local48 < local41; local48++) {
				@Pc(57) Class32 local57 = new Class32(arg3, arg0, 2);
				if (local57.anInt779 == 31) {
					@Pc(68) Class350 local68 = Static485.aClass88_1.method2419(arg0.method5982());
					local57.method689(local68.anInt9525, local68.anInt9523, local68.anInt9524, local68.anInt9522);
				}
				if (arg3.method6832() > 0) {
					@Pc(90) Class4_Sub32 local90 = local57.aClass4_Sub32_2;
					local98 = (arg1 << 9) + local90.method6614();
					local107 = local90.method6617() + (arg4 << 9);
					local111 = local98 >> 9;
					@Pc(115) int local115 = local107 >> 9;
					if (local111 >= 0 && local115 >= 0 && local111 < super.anInt2672 && local115 < super.anInt2684) {
						local90.method6623(local107, local98, super.anIntArrayArrayArray12[local57.anInt781][local111][local115] - local90.method6615(-18736));
						Static592.method7966(local57);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "([BIIIII[Lclient!ed;IIILclient!oa;)V")
	public void method2391(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class84[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class66 arg9) {
		@Pc(10) Class4_Sub9 local10 = new Class4_Sub9(arg0);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method5976();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method5978();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(43) int local43 = local24 & 0x3F;
				@Pc(49) int local49 = local24 >> 6 & 0x3F;
				@Pc(53) int local53 = local24 >> 12;
				@Pc(57) int local57 = local10.method6015();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				if (arg6 == local53 && arg7 <= local49 && local49 < arg7 + 8 && local43 >= arg3 && local43 < arg3 + 8) {
					@Pc(97) Class25 local97 = Static553.aClass288_4.method6419(local12);
					@Pc(114) int local114 = arg2 + Static217.method3741(local43 & 0x7, local65, local97.anInt638, local49 & 0x7, arg8, local97.anInt612);
					@Pc(131) int local131 = Static409.method7483(local43 & 0x7, arg8, local97.anInt612, local49 & 0x7, local97.anInt638, local65) + arg1;
					if (local114 > 0 && local131 > 0 && super.anInt2672 - 1 > local114 && local131 < super.anInt2684 - 1) {
						@Pc(159) Class84 local159 = null;
						if (!super.aBoolean215) {
							@Pc(164) int local164 = arg4;
							if ((Static97.aByteArrayArrayArray19[1][local114][local131] & 0x2) == 2) {
								local164 = arg4 - 1;
							}
							if (local164 >= 0) {
								local159 = arg5[local164];
							}
						}
						this.method2388(local131, local159, arg9, local61, -1, arg4, local114, arg4, local65 + arg8 & 0x3, local12);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BLclient!oa;)V")
	public void method2392(@OriginalArg(1) Class66 arg0) {
		Static221.method3812(arg0);
		@Pc(23) int local23;
		@Pc(27) int local27;
		if (super.anInt2678 > 1) {
			for (local23 = 0; local23 < super.anInt2672; local23++) {
				for (local27 = 0; super.anInt2684 > local27; local27++) {
					if ((Static97.aByteArrayArrayArray19[1][local23][local27] & 0x2) == 2) {
						Static507.method7208(local23, local27);
					}
				}
			}
		}
		for (local23 = 0; super.anInt2678 > local23; local23++) {
			for (local27 = 0; super.anInt2684 >= local27; local27++) {
				for (@Pc(67) int local67 = 0; local67 <= super.anInt2672; local67++) {
					@Pc(85) int local85;
					@Pc(87) int local87;
					@Pc(89) int local89;
					@Pc(118) int local118;
					@Pc(143) int local143;
					@Pc(237) int local237;
					@Pc(246) int local246;
					@Pc(266) int local266;
					@Pc(270) int local270;
					if ((super.aByteArrayArrayArray14[local23][local67][local27] & 0x1) != 0) {
						local85 = local27;
						local87 = local27;
						local89 = local23;
						while (super.anInt2684 > local87 && (super.aByteArrayArrayArray14[local23][local67][local87 + 1] & 0x1) != 0) {
							local87++;
						}
						local118 = local23;
						while (local85 > 0 && (super.aByteArrayArrayArray14[local23][local67][local85 - 1] & 0x1) != 0) {
							local85--;
						}
						label164: while (local89 > 0) {
							for (local143 = local85; local143 <= local87; local143++) {
								if ((super.aByteArrayArrayArray14[local89 - 1][local67][local143] & 0x1) == 0) {
									break label164;
								}
							}
							local89--;
						}
						label153: while (local118 < 3) {
							for (local143 = local85; local143 <= local87; local143++) {
								if ((super.aByteArrayArrayArray14[local118 + 1][local67][local143] & 0x1) == 0) {
									break label153;
								}
							}
							local118++;
						}
						local143 = (local87 + 1 - local85) * (local118 + 1 - local89);
						if (local143 >= 2) {
							local237 = super.anIntArrayArrayArray12[local118][local67][local85] - 960;
							local246 = super.anIntArrayArrayArray12[local89][local67][local85];
							Static305.method4708(1, local67 << 9, local67 << 9, local85 << 9, (local87 << 9) + 512, local237, local246);
							for (local266 = local89; local266 <= local118; local266++) {
								for (local270 = local85; local270 <= local87; local270++) {
									super.aByteArrayArrayArray14[local266][local67][local270] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local23][local67][local27] & 0x2) != 0) {
						local85 = local67;
						local87 = local67;
						local89 = local23;
						while (local87 < super.anInt2672 && (super.aByteArrayArrayArray14[local23][local87 + 1][local27] & 0x2) != 0) {
							local87++;
						}
						while (local85 > 0 && (super.aByteArrayArrayArray14[local23][local85 - 1][local27] & 0x2) != 0) {
							local85--;
						}
						local118 = local23;
						label218: while (local89 > 0) {
							for (local143 = local85; local143 <= local87; local143++) {
								if ((super.aByteArrayArrayArray14[local89 - 1][local143][local27] & 0x2) == 0) {
									break label218;
								}
							}
							local89--;
						}
						label207: while (local118 < 3) {
							for (local143 = local85; local143 <= local87; local143++) {
								if ((super.aByteArrayArrayArray14[local118 + 1][local143][local27] & 0x2) == 0) {
									break label207;
								}
							}
							local118++;
						}
						local143 = (local87 + 1 - local85) * (local118 + 1 - local89);
						if (local143 >= 2) {
							local237 = super.anIntArrayArrayArray12[local118][local85][local27] - 960;
							local246 = super.anIntArrayArrayArray12[local89][local85][local27];
							Static305.method4708(2, local85 << 9, (local87 << 9) + 512, local27 << 9, local27 << 9, local237, local246);
							for (local266 = local89; local266 <= local118; local266++) {
								for (local270 = local85; local270 <= local87; local270++) {
									super.aByteArrayArrayArray14[local266][local270][local27] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local23][local67][local27] & 0x4) != 0) {
						local85 = local67;
						local87 = local67;
						local89 = local27;
						local118 = local27;
						while (local89 > 0 && (super.aByteArrayArrayArray14[local23][local67][local89 - 1] & 0x4) != 0) {
							local89--;
						}
						while (super.anInt2684 > local118 && (super.aByteArrayArrayArray14[local23][local67][local118 + 1] & 0x4) != 0) {
							local118++;
						}
						label272: while (local85 > 0) {
							for (local143 = local89; local143 <= local118; local143++) {
								if ((super.aByteArrayArrayArray14[local23][local85 - 1][local143] & 0x4) == 0) {
									break label272;
								}
							}
							local85--;
						}
						label261: while (local87 < super.anInt2672) {
							for (local143 = local89; local143 <= local118; local143++) {
								if ((super.aByteArrayArrayArray14[local23][local87 + 1][local143] & 0x4) == 0) {
									break label261;
								}
							}
							local87++;
						}
						if ((local118 + 1 - local89) * (local87 + 1 - local85) >= 4) {
							local143 = super.anIntArrayArrayArray12[local23][local85][local89];
							Static305.method4708(4, local85 << 9, (local87 << 9) + 512, local89 << 9, (local118 << 9) + 512, local143, local143);
							for (@Pc(702) int local702 = local85; local702 <= local87; local702++) {
								for (local237 = local89; local237 <= local118; local237++) {
									super.aByteArrayArrayArray14[local23][local702][local237] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "([B[Lclient!ed;Lclient!oa;III)V")
	public void method2395(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class84[] arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class4_Sub9 local10 = new Class4_Sub9(arg0);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local10.method5976();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local10.method5978();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(52) int local52 = local33 & 0x3F;
				@Pc(58) int local58 = local33 >> 6 & 0x3F;
				@Pc(62) int local62 = local33 >> 12;
				@Pc(66) int local66 = local10.method6015();
				@Pc(70) int local70 = local66 >> 2;
				@Pc(74) int local74 = local66 & 0x3;
				@Pc(78) int local78 = local58 + arg3;
				@Pc(82) int local82 = arg4 + local52;
				if (local78 > 0 && local82 > 0 && local78 < super.anInt2672 - 1 && super.anInt2684 - 1 > local82) {
					@Pc(104) Class84 local104 = null;
					if (!super.aBoolean215) {
						@Pc(109) int local109 = local62;
						if ((Static97.aByteArrayArrayArray19[1][local78][local82] & 0x2) == 2) {
							local109 = local62 - 1;
						}
						if (local109 >= 0) {
							local104 = arg1[local109];
						}
					}
					this.method2388(local82, local104, arg2, local70, -1, local62, local78, local62, local74, local18);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!oa;IIIILclient!eh;B[III)V")
	public void method2396(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub9 arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean215) {
			return;
		}
		if (arg7 != null) {
			arg7[0] = -1;
		}
		@Pc(23) Class285 local23 = null;
		@Pc(29) int local29 = (arg2 & 0x7) * 8;
		@Pc(35) int local35 = (arg4 & 0x7) * 8;
		while (true) {
			@Pc(40) int local40;
			@Pc(59) int local59;
			@Pc(358) int local358;
			@Pc(66) int local66;
			while (arg6.anInt7219 < arg6.aByteArray97.length) {
				local40 = arg6.method6015();
				if (local40 == 0) {
					local23 = new Class285(arg6);
				} else {
					@Pc(117) int local117;
					@Pc(164) int local164;
					@Pc(187) int local187;
					@Pc(111) int local111;
					if (local40 == 1) {
						local59 = arg6.method6015();
						if (local59 > 0) {
							for (local66 = 0; local66 < local59; local66++) {
								@Pc(75) Class32 local75 = new Class32(arg1, arg6, 2);
								if (local75.anInt779 == 31) {
									@Pc(86) Class350 local86 = Static485.aClass88_1.method2419(arg6.method5982());
									local75.method689(local86.anInt9525, local86.anInt9523, local86.anInt9524, local86.anInt9522);
								}
								if (arg1.method6832() > 0) {
									@Pc(105) Class4_Sub32 local105 = local75.aClass4_Sub32_2;
									local111 = local105.method6614() >> 9;
									local117 = local105.method6617() >> 9;
									if (local75.anInt781 == arg9 && local29 <= local111 && local29 + 8 > local111 && local35 <= local117 && local35 + 8 > local117) {
										local164 = (arg8 << 9) + Static512.method7247(arg5, local105.method6617() & 0xFFF, local105.method6614() & 0xFFF);
										local111 = local164 >> 9;
										local187 = (arg3 << 9) + Static203.method3607(local105.method6617() & 0xFFF, arg5, local105.method6614() & 0xFFF);
										local117 = local187 >> 9;
										if (local111 >= 0 && local117 >= 0 && local111 < super.anInt2672 && local117 < super.anInt2684) {
											local105.method6623(local187, local164, super.anIntArrayArrayArray12[arg9][local111][local117] - local105.method6615(-18736));
											Static592.method7966(local75);
										}
									}
								}
							}
						}
					} else if (local40 == 2) {
						if (local23 == null) {
							local23 = new Class285();
						}
						local23.method6285(arg6);
					} else if (local40 != 128) {
						if (local40 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray10 == null) {
							super.aByteArrayArrayArray10 = new byte[4][][];
						}
						for (local59 = 0; local59 < 4; local59++) {
							@Pc(323) byte local323 = arg6.method6021();
							@Pc(362) int local362;
							if (local323 == 0 && super.aByteArrayArrayArray10[arg0] != null) {
								if (arg9 >= local59) {
									local358 = arg8;
									local362 = arg8 + 7;
									local111 = arg3;
									if (local362 < 0) {
										local362 = 0;
									} else if (super.anInt2672 <= local362) {
										local362 = super.anInt2672;
									}
									if (arg3 < 0) {
										local111 = 0;
									} else if (arg3 >= super.anInt2684) {
										local111 = super.anInt2684;
									}
									if (arg8 < 0) {
										local358 = 0;
									} else if (arg8 >= super.anInt2672) {
										local358 = super.anInt2672;
									}
									local117 = arg3 + 7;
									if (local117 < 0) {
										local117 = 0;
									} else if (super.anInt2684 <= local117) {
										local117 = super.anInt2684;
									}
									while (local358 < local362) {
										while (local117 > local111) {
											super.aByteArrayArrayArray10[arg0][local358][local111] = 0;
											local111++;
										}
										local358++;
									}
								}
							} else if (local323 == 1) {
								if (super.aByteArrayArrayArray10[arg0] == null) {
									super.aByteArrayArrayArray10[arg0] = new byte[super.anInt2672 + 1][super.anInt2684 + 1];
								}
								for (local358 = 0; local358 < 64; local358 += 4) {
									for (local362 = 0; local362 < 64; local362 += 4) {
										@Pc(370) byte local370 = arg6.method6021();
										if (arg9 >= local59) {
											for (local117 = local358; local117 < local358 + 4; local117++) {
												for (local164 = local362; local164 < local362 + 4; local164++) {
													if (local117 >= local29 && local117 < local29 + 8 && local164 >= local35 && local35 < local35 + 8) {
														local187 = Static190.method3464(local117 & 0x7, arg5, local164 & 0x7) + arg8;
														@Pc(437) int local437 = arg3 + Static591.method7951(local164 & 0x7, arg5, local117 & 0x7);
														if (local187 >= 0 && super.anInt2672 > local187 && local437 >= 0 && local437 < super.anInt2684) {
															super.aByteArrayArrayArray10[arg0][local187][local437] = local370;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg7 == null) {
						arg6.anInt7219 += 10;
					} else {
						arg7[0] = arg6.method5982();
						arg7[1] = arg6.method6003();
						arg7[2] = arg6.method6003();
						arg7[3] = arg6.method6003();
						arg7[4] = arg6.method5982();
					}
				}
			}
			if (local23 != null) {
				Static368.method5541(arg3 >> 3, arg8 >> 3, local23);
			}
			if (super.aByteArrayArrayArray10 != null && super.aByteArrayArrayArray10[arg0] != null) {
				local40 = arg8 + 7;
				local59 = arg3 + 7;
				for (local66 = arg8; local66 < local40; local66++) {
					for (local358 = arg3; local358 < local59; local358++) {
						super.aByteArrayArrayArray10[arg0][local66][local358] = 0;
					}
				}
				return;
			}
			return;
		}
	}
}
