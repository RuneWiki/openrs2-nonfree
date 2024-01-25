import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
	public int anInt9091 = 99;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(IIIZ)V")
	public Class102_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static237.aClass143_2, Static541.aClass264_5);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIILclient!qa;Lclient!qt;I)V")
	public void method7851(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4 arg3, @OriginalArg(5) Class243 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface7 local7 = null;
		if (arg2 == 0) {
			local7 = (Interface7) Static47.method5108(arg1, arg0, arg5);
		}
		if (arg2 == 1) {
			local7 = (Interface7) Static544.method6945(arg1, arg0, arg5);
		}
		if (arg2 == 2) {
			local7 = (Interface7) Static100.method2041(arg1, arg0, arg5, fp.class);
		}
		if (arg2 == 3) {
			local7 = (Interface7) Static465.method7066(arg1, arg0, arg5);
		}
		if (local7 == null) {
			return;
		}
		@Pc(63) Class51 local63 = Static398.aClass18_4.method609(local7.method8046());
		@Pc(67) int local67 = local7.method8047();
		@Pc(71) int local71 = local7.method8044();
		if (local63.method1620()) {
			Static543.method8261(arg0, arg1, local63, arg5);
		}
		if (local7.method8049()) {
			local7.method8043(arg3);
		}
		if (arg2 == 0) {
			@Pc(265) Class20_Sub2 local265 = Static47.method5108(arg1, arg0, arg5);
			if (local265 instanceof Class20_Sub2_Sub3) {
				((Class20_Sub2_Sub3) local265).aClass20_Sub2_3 = null;
			} else {
				Static184.method3552(arg1, arg0, arg5);
			}
			if (local63.anInt1649 != 0) {
				arg4.method6470(local71, local63.aBoolean133, local67, arg0, arg5, !local63.aBoolean139);
			}
		} else if (arg2 == 1) {
			@Pc(245) Class20_Sub4 local245 = Static544.method6945(arg1, arg0, arg5);
			if (local245 instanceof Class20_Sub4_Sub2) {
				((Class20_Sub4_Sub2) local245).aClass20_Sub4_3 = null;
			} else {
				Static39.method1124(arg1, arg0, arg5);
			}
		} else if (arg2 == 2) {
			@Pc(149) Class20_Sub1 local149 = Static100.method2041(arg1, arg0, arg5, fp.class);
			if (local149 instanceof Class20_Sub1_Sub4 && arg0 == local149.aShort124 && local149.aShort123 == arg5) {
				((Class20_Sub1_Sub4) local149).aClass20_Sub1_1 = null;
			} else {
				Static334.method5662(arg1, arg0, arg5, fp.class);
			}
			if (local63.anInt1649 != 0 && arg0 + local63.anInt1636 < super.anInt9080 && arg5 + local63.anInt1636 < super.anInt9076 && local63.anInt1615 + arg0 < super.anInt9080 && super.anInt9076 > local63.anInt1615 + arg5) {
				arg4.method6476(local63.anInt1636, arg0, !local63.aBoolean139, local71, local63.aBoolean133, local63.anInt1615, arg5);
			}
		} else if (arg2 == 3) {
			@Pc(110) Class20_Sub5 local110 = Static465.method7066(arg1, arg0, arg5);
			if (local110 instanceof Class20_Sub5_Sub1) {
				((Class20_Sub5_Sub1) local110).aClass20_Sub5_2 = null;
			} else {
				Static292.method5118(arg1, arg0, arg5);
			}
			if (local63.anInt1649 == 1) {
				arg4.method6475(arg0, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIILclient!qt;IBLclient!qa;II)V")
	public void method7852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class243 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class4 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static286.aClass1_Sub15_Sub1_1.method6381(Static449.anInt7876) && !Static29.method801(arg3, arg0, Static514.anInt9103, arg4)) {
			return;
		}
		if (arg2 < this.anInt9091) {
			this.anInt9091 = arg2;
		}
		@Pc(30) Class51 local30 = Static398.aClass18_4.method609(arg6);
		if (arg7.method7148() && Static286.aClass1_Sub15_Sub1_1.aBoolean527 && local30.aBoolean130) {
			return;
		}
		@Pc(54) int local54;
		@Pc(51) int local51;
		if (arg9 == 1 || arg9 == 3) {
			local51 = local30.anInt1636;
			local54 = local30.anInt1615;
		} else {
			local54 = local30.anInt1636;
			local51 = local30.anInt1615;
		}
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (super.anInt9080 < local54 + arg3) {
			local70 = arg3;
			local74 = arg3 + 1;
		} else {
			local70 = arg3 + (local54 >> 1);
			local74 = arg3 + (local54 + 1 >> 1);
		}
		@Pc(99) int local99;
		@Pc(103) int local103;
		if (local51 + arg4 > super.anInt9076) {
			local99 = arg4;
			local103 = arg4 + 1;
		} else {
			local99 = (local51 >> 1) + arg4;
			local103 = (local51 + 1 >> 1) + arg4;
		}
		@Pc(123) Class7 local123 = Static296.aClass7Array11[arg0];
		@Pc(146) int local146 = local123.ba(local70, local99) + local123.ba(local74, local99) + local123.ba(local70, local103) + local123.ba(local74, local103) >> 2;
		@Pc(154) int local154 = (arg3 << 7) + (local54 << 6);
		@Pc(163) int local163 = (arg4 << 7) + (local51 << 6);
		@Pc(175) boolean local175 = Static361.aBoolean482 && !super.aBoolean681 && local30.aBoolean128;
		if (local30.method1620()) {
			Static509.method7776(arg3, null, null, local30, arg4, arg9, arg2);
		}
		@Pc(209) boolean local209 = arg1 == -1 && local30.anInt1630 == -1 && local30.anIntArray107 == null && local30.anIntArray108 == null && !local30.aBoolean137;
		if (Static453.aBoolean587 && (Static379.method6621(arg8) && local30.anInt1637 != 1 || !(!Static107.method2172(arg8) || local30.anInt1637 != 0))) {
			return;
		}
		if (arg8 != 22) {
			@Pc(372) Class20_Sub1 local372;
			@Pc(339) Class20_Sub1_Sub3 local339;
			@Pc(343) int local343;
			if (arg8 == 10 || arg8 == 11) {
				local339 = null;
				if (local209) {
					@Pc(402) Class20_Sub1_Sub3 local402 = new Class20_Sub1_Sub3(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg3, local54 + arg3 - 1, arg4, local51 + arg4 - 1, arg8, arg9, local175);
					local343 = local402.method4921();
					local372 = local402;
					local339 = local402;
				} else {
					local343 = 15;
					local372 = new Class20_Sub1_Sub2(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg3, local54 + arg3 - 1, arg4, arg4 + local51 - 1, arg8, arg9, arg1);
				}
				@Pc(423) Class20_Sub1 local423 = Static100.method2041(arg2, arg3, arg4, fp.class);
				@Pc(425) boolean local425 = false;
				if (local423 instanceof Class20_Sub1_Sub4 && arg3 == local423.aShort124 && arg4 == local423.aShort123) {
					((Class20_Sub1_Sub4) local423).aClass20_Sub1_1 = local372;
					local425 = true;
				}
				if (local425 || Static391.method6237(local372, false)) {
					if (local339 != null && local339.method8049()) {
						local339.method8045(arg7);
					}
					if (local30.aBoolean140 && Static361.aBoolean482) {
						if (local343 > 30) {
							local343 = 30;
						}
						for (@Pc(478) int local478 = 0; local478 <= local54; local478++) {
							for (@Pc(482) int local482 = 0; local482 <= local51; local482++) {
								local123.Q(local478 + arg3, arg4 - -local482, local343);
							}
						}
					}
				}
				if (local30.anInt1649 != 0 && arg5 != null) {
					arg5.method6467(local54, arg4, !local30.aBoolean139, local51, arg3, local30.aBoolean133);
				}
			} else {
				@Pc(642) Class20_Sub1 local642;
				if (arg8 >= 12 && arg8 <= 17 || arg8 >= 18 && arg8 <= 21) {
					if (local209) {
						local339 = new Class20_Sub1_Sub3(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg3, local54 + arg3 - 1, arg4, local51 + arg4 - 1, arg8, arg9, local175);
						if (local339.method8049()) {
							local339.method8045(arg7);
						}
						local372 = local339;
					} else {
						local372 = new Class20_Sub1_Sub2(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg3, arg3 + local54 - 1, arg4, arg4 + local51 - 1, arg8, arg9, arg1);
					}
					local642 = Static100.method2041(arg2, arg3, arg4, fp.class);
					if (local642 instanceof Class20_Sub1_Sub4 && local642.aShort124 == arg3 && arg4 == local642.aShort123) {
						((Class20_Sub1_Sub4) local642).aClass20_Sub1_1 = local372;
					} else {
						Static391.method6237(local372, false);
					}
					if (Static361.aBoolean482 && !super.aBoolean681 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg2 > 0 && local30.anInt1637 != 0) {
						super.aByteArrayArrayArray16[arg2][arg3][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg4] | 0x4);
					}
					if (local30.anInt1649 != 0 && arg5 != null) {
						arg5.method6467(local54, arg4, !local30.aBoolean139, local51, arg3, local30.aBoolean133);
					}
				} else {
					@Pc(769) Class20_Sub2 local769;
					if (arg8 == 0) {
						@Pc(742) int local742 = local30.anInt1637;
						if (Static220.aBoolean337 && local30.anInt1637 == -1) {
							local742 = 1;
						}
						if (local209) {
							@Pc(767) Class20_Sub2_Sub1 local767 = new Class20_Sub2_Sub1(arg7, local30, arg0, local154, local146, local163, super.aBoolean681, arg8, arg9, local175);
							local769 = local767;
							if (local767.method8049()) {
								local767.method8045(arg7);
							}
						} else {
							local769 = new Class20_Sub2_Sub2(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg8, arg9, arg1);
						}
						@Pc(800) Class20_Sub2 local800 = Static47.method5108(arg2, arg3, arg4);
						if (local800 instanceof Class20_Sub2_Sub3) {
							((Class20_Sub2_Sub3) local800).aClass20_Sub2_3 = local769;
						} else {
							Static164.method2943(arg2, arg3, arg4, local769, null);
						}
						if (Static361.aBoolean482) {
							if (arg9 == 0) {
								if (local30.aBoolean140) {
									local123.Q(arg3, arg4, 50);
									local123.Q(arg3, arg4 + 1, 50);
								}
								if (local742 == 1 && !super.aBoolean681) {
									super.aByteArrayArrayArray16[arg2][arg3][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg4] | 0x1);
								}
							} else if (arg9 == 1) {
								if (local30.aBoolean140) {
									local123.Q(arg3, arg4 + 1, 50);
									local123.Q(arg3 + 1, arg4 + 1, 50);
								}
								if (local742 == 1 && !super.aBoolean681) {
									super.aByteArrayArrayArray16[arg2][arg3][arg4 + 1] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg4 + 1] | 0x2);
								}
							} else if (arg9 == 2) {
								if (local30.aBoolean140) {
									local123.Q(arg3 + 1, arg4, 50);
									local123.Q(arg3 + 1, arg4 - -1, 50);
								}
								if (local742 == 1 && !super.aBoolean681) {
									super.aByteArrayArrayArray16[arg2][arg3 + 1][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg3 + 1][arg4] | 0x1);
								}
							} else if (arg9 == 3) {
								if (local30.aBoolean140) {
									local123.Q(arg3, arg4, 50);
									local123.Q(arg3 + 1, arg4, 50);
								}
								if (local742 == 1 && !super.aBoolean681) {
									super.aByteArrayArrayArray16[arg2][arg3][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg4] | 0x2);
								}
							}
						}
						if (local30.anInt1649 != 0 && arg5 != null) {
							arg5.method6473(local30.aBoolean133, arg3, !local30.aBoolean139, arg4, arg9, arg8);
						}
						if (local30.anInt1663 != 16) {
							Static108.method2194(arg2, arg3, arg4, local30.anInt1663);
						}
					} else {
						@Pc(1098) Class20_Sub2_Sub1 local1098;
						@Pc(1081) Class20_Sub2 local1081;
						if (arg8 == 1) {
							if (local209) {
								local1098 = new Class20_Sub2_Sub1(arg7, local30, arg0, local154, local146, local163, super.aBoolean681, arg8, arg9, local175);
								local1081 = local1098;
								if (local1098.method8049()) {
									local1098.method8045(arg7);
								}
							} else {
								local1081 = new Class20_Sub2_Sub2(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg8, arg9, arg1);
							}
							local769 = Static47.method5108(arg2, arg3, arg4);
							if (local769 instanceof Class20_Sub2_Sub3) {
								((Class20_Sub2_Sub3) local769).aClass20_Sub2_3 = local1081;
							} else {
								Static164.method2943(arg2, arg3, arg4, local1081, null);
							}
							if (local30.aBoolean140 && Static361.aBoolean482) {
								if (arg9 == 0) {
									local123.Q(arg3, arg4 + 1, 50);
								} else if (arg9 == 1) {
									local123.Q(arg3 + 1, arg4 + 1, 50);
								} else if (arg9 == 2) {
									local123.Q(arg3 + 1, arg4, 50);
								} else if (arg9 == 3) {
									local123.Q(arg3, arg4, 50);
								}
							}
							if (local30.anInt1649 != 0 && arg5 != null) {
								arg5.method6473(local30.aBoolean133, arg3, !local30.aBoolean139, arg4, arg9, arg8);
							}
						} else if (arg8 == 2) {
							local343 = arg9 + 1 & 0x3;
							if (local209) {
								@Pc(1231) Class20_Sub2_Sub1 local1231 = new Class20_Sub2_Sub1(arg7, local30, arg0, local154, local146, local163, super.aBoolean681, arg8, arg9 + 4, local175);
								@Pc(1246) Class20_Sub2_Sub1 local1246 = new Class20_Sub2_Sub1(arg7, local30, arg0, local154, local146, local163, super.aBoolean681, arg8, local343, local175);
								if (local1231.method8049()) {
									local1231.method8045(arg7);
								}
								local1081 = local1231;
								if (local1246.method8049()) {
									local1246.method8045(arg7);
								}
								local769 = local1246;
							} else {
								local1081 = new Class20_Sub2_Sub2(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg8, arg9 + 4, arg1);
								local769 = new Class20_Sub2_Sub2(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg8, local343, arg1);
							}
							Static164.method2943(arg2, arg3, arg4, local1081, local769);
							if (local30.anInt1637 == 1 && Static361.aBoolean482 && !super.aBoolean681) {
								if (arg9 == 0) {
									super.aByteArrayArrayArray16[arg2][arg3][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg4] | 0x1);
									super.aByteArrayArrayArray16[arg2][arg3][arg4 + 1] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg4 + 1] | 0x2);
								} else if (arg9 == 1) {
									super.aByteArrayArrayArray16[arg2][arg3][arg4 + 1] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg4 + 1] | 0x2);
									super.aByteArrayArrayArray16[arg2][arg3 + 1][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg3 + 1][arg4] | 0x1);
								} else if (arg9 == 2) {
									super.aByteArrayArrayArray16[arg2][arg3 + 1][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg3 + 1][arg4] | 0x1);
									super.aByteArrayArrayArray16[arg2][arg3][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg4] | 0x2);
								} else if (arg9 == 3) {
									super.aByteArrayArrayArray16[arg2][arg3][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg4] | 0x2);
									super.aByteArrayArrayArray16[arg2][arg3][arg4] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg4] | 0x1);
								}
							}
							if (local30.anInt1649 != 0 && arg5 != null) {
								arg5.method6473(local30.aBoolean133, arg3, !local30.aBoolean139, arg4, arg9, arg8);
							}
							if (local30.anInt1663 != 16) {
								Static108.method2194(arg2, arg3, arg4, local30.anInt1663);
							}
						} else if (arg8 == 3) {
							if (local209) {
								local1098 = new Class20_Sub2_Sub1(arg7, local30, arg0, local154, local146, local163, super.aBoolean681, arg8, arg9, local175);
								if (local1098.method8049()) {
									local1098.method8045(arg7);
								}
								local1081 = local1098;
							} else {
								local1081 = new Class20_Sub2_Sub2(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg8, arg9, arg1);
							}
							local769 = Static47.method5108(arg2, arg3, arg4);
							if (local769 instanceof Class20_Sub2_Sub3) {
								((Class20_Sub2_Sub3) local769).aClass20_Sub2_3 = local1081;
							} else {
								Static164.method2943(arg2, arg3, arg4, local1081, null);
							}
							if (local30.aBoolean140 && Static361.aBoolean482) {
								if (arg9 == 0) {
									local123.Q(arg3, arg4 + 1, 50);
								} else if (arg9 == 1) {
									local123.Q(arg3 + 1, arg4 + 1, 50);
								} else if (arg9 == 2) {
									local123.Q(arg3 + 1, arg4, 50);
								} else if (arg9 == 3) {
									local123.Q(arg3, arg4, 50);
								}
							}
							if (local30.anInt1649 != 0 && arg5 != null) {
								arg5.method6473(local30.aBoolean133, arg3, !local30.aBoolean139, arg4, arg9, arg8);
							}
						} else if (arg8 == 9) {
							if (local209) {
								local339 = new Class20_Sub1_Sub3(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg3, arg3, arg4, arg4, arg8, arg9, local175);
								if (local339.method8049()) {
									local339.method8045(arg7);
								}
								local372 = local339;
							} else {
								local372 = new Class20_Sub1_Sub2(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg3, local54 + arg3 - 1, arg4, local51 + arg4 - 1, arg8, arg9, arg1);
							}
							local642 = Static100.method2041(arg2, arg3, arg4, fp.class);
							if (local642 instanceof Class20_Sub1_Sub4 && arg3 == local642.aShort124 && local642.aShort123 == arg4) {
								((Class20_Sub1_Sub4) local642).aClass20_Sub1_1 = local372;
							} else {
								Static391.method6237(local372, false);
							}
							if (local30.anInt1649 != 0 && arg5 != null) {
								arg5.method6467(local54, arg4, !local30.aBoolean139, local51, arg3, local30.aBoolean133);
							}
							if (local30.anInt1663 != 16) {
								Static108.method2194(arg2, arg3, arg4, local30.anInt1663);
							}
						} else {
							@Pc(1850) Class20_Sub4 local1850;
							if (arg8 == 4) {
								if (local209) {
									@Pc(1869) Class20_Sub4_Sub1 local1869 = new Class20_Sub4_Sub1(arg7, local30, arg0, local154, local146, local163, super.aBoolean681, 0, 0, 0, arg8, arg9);
									local1850 = local1869;
									if (local1869.method8049()) {
										local1869.method8045(arg7);
									}
								} else {
									local1850 = new Class20_Sub4_Sub3(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, 0, 0, 0, arg8, arg9, arg1);
								}
								@Pc(1884) Class20_Sub4 local1884 = Static544.method6945(arg2, arg3, arg4);
								if (local1884 instanceof Class20_Sub4_Sub2) {
									((Class20_Sub4_Sub2) local1884).aClass20_Sub4_3 = local1850;
								} else {
									Static390.method6233(arg2, arg3, arg4, local1850, null);
								}
							} else {
								@Pc(1904) int local1904;
								@Pc(1910) Interface7 local1910;
								@Pc(1949) Class20_Sub4_Sub1 local1949;
								@Pc(1993) Class20_Sub4 local1993;
								if (arg8 == 5) {
									local1904 = 17;
									local1910 = (Interface7) Static47.method5108(arg2, arg3, arg4);
									if (local1910 != null) {
										local1904 = Static398.aClass18_4.method609(local1910.method8046()).anInt1663 + 1;
									}
									if (local209) {
										local1949 = new Class20_Sub4_Sub1(arg7, local30, arg0, local154, local146, local163, super.aBoolean681, 0, Static485.anIntArray683[arg9] * local1904, Static66.anIntArray115[arg9] * local1904, arg8, arg9);
										if (local1949.method8049()) {
											local1949.method8045(arg7);
										}
										local1850 = local1949;
									} else {
										local1850 = new Class20_Sub4_Sub3(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, 0, Static485.anIntArray683[arg9] * local1904, local1904 * Static66.anIntArray115[arg9], arg8, arg9, arg1);
									}
									local1993 = Static544.method6945(arg2, arg3, arg4);
									if (local1993 instanceof Class20_Sub4_Sub2) {
										((Class20_Sub4_Sub2) local1993).aClass20_Sub4_3 = local1850;
									} else {
										Static390.method6233(arg2, arg3, arg4, local1850, null);
									}
								} else if (arg8 == 6) {
									local1904 = 9;
									local1910 = (Interface7) Static47.method5108(arg2, arg3, arg4);
									if (local1910 != null) {
										local1904 = Static398.aClass18_4.method609(local1910.method8046()).anInt1663 / 2 + 1;
									}
									if (local209) {
										local1949 = new Class20_Sub4_Sub1(arg7, local30, arg0, local154, local146, local163, super.aBoolean681, arg9, local1904 * Static485.anIntArray683[arg9], local1904 * Static66.anIntArray115[arg9], arg8, arg9 + 4);
										local1850 = local1949;
										if (local1949.method8049()) {
											local1949.method8045(arg7);
										}
									} else {
										local1850 = new Class20_Sub4_Sub3(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg9, local1904 * Static409.anIntArray697[arg9], local1904 * Static161.anIntArray269[arg9], arg8, arg9 + 4, arg1);
									}
									local1993 = Static544.method6945(arg2, arg3, arg4);
									if (local1993 instanceof Class20_Sub4_Sub2) {
										((Class20_Sub4_Sub2) local1993).aClass20_Sub4_3 = local1850;
									} else {
										Static390.method6233(arg2, arg3, arg4, local1850, null);
									}
								} else if (arg8 == 7) {
									local1904 = arg9 + 2 & 0x3;
									if (local209) {
										@Pc(2178) Class20_Sub4_Sub1 local2178 = new Class20_Sub4_Sub1(arg7, local30, arg0, local154, local146, local163, super.aBoolean681, local1904, 0, 0, arg8, local1904 + 4);
										local1850 = local2178;
										if (local2178.method8049()) {
											local2178.method8045(arg7);
										}
									} else {
										local1850 = new Class20_Sub4_Sub3(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, local1904, 0, 0, arg8, local1904 + 4, arg1);
									}
									@Pc(2193) Class20_Sub4 local2193 = Static544.method6945(arg2, arg3, arg4);
									if (local2193 instanceof Class20_Sub4_Sub2) {
										((Class20_Sub4_Sub2) local2193).aClass20_Sub4_3 = local1850;
									} else {
										Static390.method6233(arg2, arg3, arg4, local1850, null);
									}
								} else if (arg8 == 8) {
									local343 = arg9 + 2 & 0x3;
									@Pc(2219) int local2219 = 9;
									@Pc(2225) Interface7 local2225 = (Interface7) Static47.method5108(arg2, arg3, arg4);
									if (local2225 != null) {
										local2219 = Static398.aClass18_4.method609(local2225.method8046()).anInt1663 / 2 + 1;
									}
									@Pc(2270) Class20_Sub4 local2270;
									@Pc(2293) Class20_Sub4 local2293;
									if (local209) {
										local2270 = new Class20_Sub4_Sub1(arg7, local30, arg0, local154, local146, local163, super.aBoolean681, arg9, local2219 * Static409.anIntArray697[arg9], Static161.anIntArray269[arg9] * local2219, arg8, arg9 + 4);
										local2293 = new Class20_Sub4_Sub1(arg7, local30, arg0, local154, local146, local163, super.aBoolean681, arg9, 0, 0, arg8, local343 + 4);
										if (local2270.method8049()) {
											local2270.method8045(arg7);
										}
										if (local2293.method8049()) {
											local2293.method8045(arg7);
										}
									} else {
										local2270 = new Class20_Sub4_Sub3(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg9, Static409.anIntArray697[arg9] * local2219, local2219 * Static161.anIntArray269[arg9], arg8, arg9 + 4, arg1);
										local2293 = new Class20_Sub4_Sub3(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg9, 0, 0, arg8, local343 + 4, arg1);
									}
									Static390.method6233(arg2, arg3, arg4, local2270, local2293);
								}
							}
						}
					}
				}
			}
		} else if (Static286.aClass1_Sub15_Sub1_1.aBoolean531 || local30.anInt1632 != 0 || local30.anInt1649 == 1 || local30.aBoolean138) {
			@Pc(269) Class20_Sub5 local269;
			if (local209) {
				@Pc(267) Class20_Sub5_Sub3 local267 = new Class20_Sub5_Sub3(arg7, local30, arg0, local154, local146, local163, super.aBoolean681, arg9, local175);
				local269 = local267;
				if (local267.method8049()) {
					local267.method8045(arg7);
				}
			} else {
				local269 = new Class20_Sub5_Sub2(arg7, local30, arg2, arg0, local154, local146, local163, super.aBoolean681, arg9, arg1);
			}
			@Pc(299) Class20_Sub5 local299 = Static465.method7066(arg2, arg3, arg4);
			if (local299 instanceof Class20_Sub5_Sub1) {
				((Class20_Sub5_Sub1) local299).aClass20_Sub5_2 = local269;
			} else {
				Static165.method3097(arg2, arg3, arg4, local269);
			}
			if (local30.anInt1649 == 1 && arg5 != null) {
				arg5.method6474(arg3, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI[ILclient!os;ILclient!qa;)V")
	public void method7853(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class1_Sub17 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4 arg4) {
		if (super.aBoolean681) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class126 local13 = null;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					@Pc(24) int local24;
					@Pc(106) int local106;
					@Pc(496) int local496;
					@Pc(163) int local163;
					@Pc(157) int local157;
					@Pc(161) int local161;
					while (arg2.anInt4872 < arg2.aByteArray58.length) {
						local24 = arg2.method4487();
						if (local24 == 0) {
							local13 = new Class126(arg2);
						} else {
							@Pc(193) int local193;
							@Pc(301) int local301;
							if (local24 == 1) {
								local106 = arg2.method4487();
								if (local106 > 0) {
									for (local496 = 0; local496 < local106; local496++) {
										@Pc(505) Class108 local505 = new Class108(arg4, arg2, 0);
										if (local505.anInt2837 == 31) {
											@Pc(516) Class145 local516 = Static478.aClass309_1.method7920(arg2.method4494());
											local505.method2645(local516.anInt4293, local516.anInt4289, local516.anInt4295, local516.anInt4290);
										}
										if (arg4.method7163() > 0) {
											@Pc(533) Class1_Sub5 local533 = local505.aClass1_Sub5_1;
											local163 = local533.method4306() + (arg0 << 7);
											local193 = (arg3 << 7) + local533.method4314();
											local301 = local163 >> 7;
											@Pc(557) int local557 = local193 >> 7;
											if (local301 >= 0 && local557 >= 0 && super.anInt9080 > local301 && local557 < super.anInt9076) {
												local533.method4308(super.anIntArrayArrayArray20[local505.anInt2842][local301][local557] - local533.method4305(), local163, local193);
												Static359.method5840(local505);
											}
										}
									}
								}
							} else if (local24 == 2) {
								if (local13 == null) {
									local13 = new Class126();
								}
								local13.method3238(arg2);
							} else if (local24 != 128) {
								if (local24 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray19 == null) {
									super.aByteArrayArrayArray19 = new byte[4][][];
								}
								for (local106 = 0; local106 < 4; local106++) {
									@Pc(112) byte local112 = arg2.method4482();
									if (local112 == 0 && super.aByteArrayArrayArray19[local106] != null) {
										local157 = arg0;
										local161 = arg0 + 64;
										local163 = arg3;
										local193 = arg3 + 64;
										if (local161 < 0) {
											local161 = 0;
										} else if (local161 >= super.anInt9080) {
											local161 = super.anInt9080;
										}
										if (arg0 < 0) {
											local157 = 0;
										} else if (super.anInt9080 <= arg0) {
											local157 = super.anInt9080;
										}
										if (arg3 < 0) {
											local163 = 0;
										} else if (super.anInt9076 <= arg3) {
											local163 = super.anInt9076;
										}
										if (local193 < 0) {
											local193 = 0;
										} else if (super.anInt9076 <= local193) {
											local193 = super.anInt9076;
										}
										while (local161 > local157) {
											while (local163 < local193) {
												super.aByteArrayArrayArray19[local106][local157][local163] = 0;
												local163++;
											}
											local157++;
										}
									} else if (local112 == 1) {
										if (super.aByteArrayArrayArray19[local106] == null) {
											super.aByteArrayArrayArray19[local106] = new byte[super.anInt9080 + 1][super.anInt9076 + 1];
										}
										for (local157 = 0; local157 < 64; local157 += 4) {
											for (local161 = 0; local161 < 64; local161 += 4) {
												@Pc(290) byte local290 = arg2.method4482();
												for (local193 = local157 + arg0; local193 < local157 + arg0 + 4; local193++) {
													for (local301 = arg3 + local161; local301 < local161 + arg3 + 4; local301++) {
														if (local193 >= 0 && local193 < super.anInt9080 && local301 >= 0 && super.anInt9076 > local301) {
															super.aByteArrayArrayArray19[local106][local193][local301] = local290;
														}
													}
												}
											}
										}
									} else if (local112 == 2) {
										if (super.aByteArrayArrayArray19[local106] == null) {
											super.aByteArrayArrayArray19[local106] = new byte[super.anInt9080 + 1][super.anInt9076 + 1];
										}
										if (local106 > 0) {
											local157 = arg0;
											local161 = arg0 + 64;
											local163 = arg3;
											if (arg3 < 0) {
												local163 = 0;
											} else if (arg3 >= super.anInt9076) {
												local163 = super.anInt9076;
											}
											if (arg0 < 0) {
												local157 = 0;
											} else if (arg0 >= super.anInt9080) {
												local157 = super.anInt9080;
											}
											local193 = arg3 + 64;
											if (local161 < 0) {
												local161 = 0;
											} else if (super.anInt9080 <= local161) {
												local161 = super.anInt9080;
											}
											if (local193 < 0) {
												local193 = 0;
											} else if (super.anInt9076 <= local193) {
												local193 = super.anInt9076;
											}
											while (local161 > local157) {
												while (local163 < local193) {
													super.aByteArrayArrayArray19[local106][local157][local163] = super.aByteArrayArrayArray19[local106 - 1][local157][local163];
													local163++;
												}
												local157++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg1 == null) {
								arg2.anInt4872 += 10;
							} else {
								arg1[0] = arg2.method4494();
								arg1[1] = arg2.method4447();
								arg1[2] = arg2.method4447();
								arg1[3] = arg2.method4447();
								arg1[4] = arg2.method4494();
							}
						}
					}
					if (local13 != null) {
						for (local24 = 0; local24 < 8; local24++) {
							for (local106 = 0; local106 < 8; local106++) {
								local496 = (arg0 >> 3) + local24;
								local157 = (arg3 >> 3) + local106;
								if (local496 >= 0 && local496 < super.anInt9080 >> 3 && local157 >= 0 && local157 < super.anInt9076 >> 3) {
									Static370.method5975(local496, local13, local157);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray19 != null) {
						for (local106 = 0; local106 < 4; local106++) {
							if (super.aByteArrayArrayArray19[local106] != null) {
								for (local496 = 0; local496 < 16; local496++) {
									for (local157 = 0; local157 < 16; local157++) {
										local161 = local496 + (arg0 >> 2);
										local163 = (arg3 >> 2) + local157;
										if (local161 >= 0 && local161 < 26 && local163 >= 0 && local163 < 26) {
											super.aByteArrayArrayArray19[local106][local161][local163] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([Lclient!qt;I[BLclient!qa;II)V")
	public void method7854(@OriginalArg(0) Class243[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4) {
		@Pc(10) Class1_Sub17 local10 = new Class1_Sub17(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method4499();
			if (local20 == 0) {
				return;
			}
			local12 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method4480();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local10.method4487();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = local53 + arg4;
				@Pc(77) int local77 = arg1 + local47;
				if (local73 > 0 && local77 > 0 && local73 < super.anInt9080 - 1 && local77 < super.anInt9076 - 1) {
					@Pc(109) Class243 local109 = null;
					if (!super.aBoolean681) {
						@Pc(114) int local114 = local57;
						if ((Static379.aByteArrayArrayArray13[1][local73][local77] & 0x2) == 2) {
							local114 = local57 - 1;
						}
						if (local114 >= 0) {
							local109 = arg0[local114];
						}
					}
					this.method7852(local57, -1, local57, local73, local77, local109, local12, arg3, local65, local69);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIILclient!qa;I[BI[Lclient!qt;II)V")
	public void method7857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class243[] arg8, @OriginalArg(9) int arg9) {
		@Pc(10) Class1_Sub17 local10 = new Class1_Sub17(arg6);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method4499();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method4480();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local10.method4487();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (local61 == arg0 && arg5 <= local57 && local57 < arg5 + 8 && arg2 <= local51 && local51 < arg2 + 8) {
					@Pc(113) Class51 local113 = Static398.aClass18_4.method609(local17);
					@Pc(131) int local131 = arg7 + Static14.method519(local51 & 0x7, local73, arg1, local57 & 0x7, local113.anInt1636, local113.anInt1615);
					@Pc(150) int local150 = arg3 + Static331.method5629(local73, local113.anInt1615, arg1, local113.anInt1636, local57 & 0x7, local51 & 0x7);
					if (local131 > 0 && local150 > 0 && super.anInt9080 - 1 > local131 && super.anInt9076 - 1 > local150) {
						@Pc(179) Class243 local179 = null;
						if (!super.aBoolean681) {
							@Pc(184) int local184 = arg9;
							if ((Static379.aByteArrayArrayArray13[1][local131][local150] & 0x2) == 2) {
								local184 = arg9 - 1;
							}
							if (local184 >= 0) {
								local179 = arg8[local184];
							}
						}
						this.method7852(arg9, -1, arg9, local131, local150, local179, local17, arg4, local69, arg1 + local73 & 0x3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!qa;III[IIIIILclient!os;)V")
	public void method7858(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class1_Sub17 arg9) {
		if (super.aBoolean681) {
			return;
		}
		@Pc(13) Class126 local13 = null;
		if (arg5 != null) {
			arg5[0] = -1;
		}
		@Pc(25) int local25 = (arg7 & 0x7) * 8;
		@Pc(35) int local35 = (arg6 & 0x7) * 8;
		while (true) {
			@Pc(54) int local54;
			@Pc(113) int local113;
			@Pc(155) int local155;
			@Pc(177) int local177;
			@Pc(61) int local61;
			@Pc(107) int local107;
			label233: do {
				while (true) {
					@Pc(40) int local40;
					@Pc(353) int local353;
					while (arg9.aByteArray58.length > arg9.anInt4872) {
						local40 = arg9.method4487();
						if (local40 == 0) {
							local13 = new Class126(arg9);
						} else {
							if (local40 == 1) {
								local54 = arg9.method4487();
								continue label233;
							}
							if (local40 == 2) {
								if (local13 == null) {
									local13 = new Class126();
								}
								local13.method3238(arg9);
							} else if (local40 != 128) {
								if (local40 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray19 == null) {
									super.aByteArrayArrayArray19 = new byte[4][][];
								}
								for (local54 = 0; local54 < 4; local54++) {
									@Pc(320) byte local320 = arg9.method4482();
									@Pc(357) int local357;
									if (local320 == 0 && super.aByteArrayArrayArray19[arg8] != null) {
										if (arg2 >= local54) {
											local353 = arg0;
											local357 = arg0 + 7;
											local107 = arg4;
											if (arg4 < 0) {
												local107 = 0;
											} else if (arg4 >= super.anInt9076) {
												local107 = super.anInt9076;
											}
											if (local357 < 0) {
												local357 = 0;
											} else if (local357 >= super.anInt9080) {
												local357 = super.anInt9080;
											}
											local113 = arg4 + 7;
											if (arg0 < 0) {
												local353 = 0;
											} else if (super.anInt9080 <= arg0) {
												local353 = super.anInt9080;
											}
											if (local113 < 0) {
												local113 = 0;
											} else if (local113 >= super.anInt9076) {
												local113 = super.anInt9076;
											}
											while (local357 > local353) {
												while (local113 > local107) {
													super.aByteArrayArrayArray19[arg8][local353][local107] = 0;
													local107++;
												}
												local353++;
											}
										}
									} else if (local320 == 1) {
										if (super.aByteArrayArrayArray19[arg8] == null) {
											super.aByteArrayArrayArray19[arg8] = new byte[super.anInt9080 + 1][super.anInt9076 + 1];
										}
										for (local353 = 0; local353 < 64; local353 += 4) {
											for (local357 = 0; local357 < 64; local357 += 4) {
												@Pc(363) byte local363 = arg9.method4482();
												if (local54 <= arg2) {
													for (local113 = local353; local113 < local353 + 4; local113++) {
														for (local155 = local357; local155 < local357 + 4; local155++) {
															if (local25 <= local113 && local113 < local25 + 8 && local35 <= local155 && local35 < local35 + 8) {
																local177 = Static8.method394(arg3, local113 & 0x7, local155 & 0x7) + arg0;
																@Pc(423) int local423 = arg4 + Static222.method4032(local155 & 0x7, local113 & 0x7, arg3);
																if (local177 >= 0 && local177 < super.anInt9080 && local423 >= 0 && local423 < super.anInt9076) {
																	super.aByteArrayArrayArray19[arg8][local177][local423] = local363;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg5 == null) {
								arg9.anInt4872 += 10;
							} else {
								arg5[0] = arg9.method4494();
								arg5[1] = arg9.method4447();
								arg5[2] = arg9.method4447();
								arg5[3] = arg9.method4447();
								arg5[4] = arg9.method4494();
							}
						}
					}
					if (local13 != null) {
						Static370.method5975(arg0 >> 3, local13, arg4 >> 3);
					}
					if (super.aByteArrayArrayArray19 != null && super.aByteArrayArrayArray19[arg8] != null) {
						local40 = arg0 + 7;
						local54 = arg4 + 7;
						for (local61 = arg0; local61 < local40; local61++) {
							for (local353 = arg4; local353 < local54; local353++) {
								super.aByteArrayArrayArray19[arg8][local61][local353] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local54 <= 0);
			for (local61 = 0; local61 < local54; local61++) {
				@Pc(70) Class108 local70 = new Class108(arg1, arg9, 0);
				if (local70.anInt2837 == 31) {
					@Pc(81) Class145 local81 = Static478.aClass309_1.method7920(arg9.method4494());
					local70.method2645(local81.anInt4293, local81.anInt4289, local81.anInt4295, local81.anInt4290);
				}
				if (arg1.method7163() > 0) {
					@Pc(101) Class1_Sub5 local101 = local70.aClass1_Sub5_1;
					local107 = local101.method4306() >> 7;
					local113 = local101.method4314() >> 7;
					if (arg2 == local70.anInt2842 && local25 <= local107 && local25 + 8 > local107 && local113 >= local35 && local113 < local35 + 8) {
						local155 = Static232.method4179(local101.method4314() & 0x3FF, local101.method4306() & 0x3FF, arg3) + (arg0 << 7);
						local107 = local155 >> 7;
						local177 = Static268.method4782(local101.method4306() & 0x3FF, local101.method4314() & 0x3FF, arg3) + (arg4 << 7);
						local113 = local177 >> 7;
						if (local107 >= 0 && local113 >= 0 && super.anInt9080 > local107 && super.anInt9076 > local113) {
							local101.method4308(super.anIntArrayArrayArray20[arg2][local107][local113] - local101.method4305(), local155, local177);
							Static359.method5840(local70);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLclient!qa;)V")
	public void method7860(@OriginalArg(1) Class4 arg0) {
		Static105.method2152(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt9074 > 1) {
			for (local13 = 0; super.anInt9080 > local13; local13++) {
				for (local17 = 0; super.anInt9076 > local17; local17++) {
					if ((Static379.aByteArrayArrayArray13[1][local13][local17] & 0x2) == 2) {
						Static472.method7362(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; super.anInt9074 > local13; local13++) {
			for (local17 = 0; super.anInt9076 >= local17; local17++) {
				for (@Pc(55) int local55 = 0; local55 <= super.anInt9080; local55++) {
					@Pc(73) int local73;
					@Pc(75) int local75;
					@Pc(77) int local77;
					@Pc(79) int local79;
					@Pc(128) int local128;
					@Pc(218) int local218;
					@Pc(227) int local227;
					@Pc(247) int local247;
					@Pc(251) int local251;
					if ((super.aByteArrayArrayArray16[local13][local55][local17] & 0x1) != 0) {
						local73 = local17;
						local75 = local17;
						local77 = local13;
						local79 = local13;
						while (super.anInt9076 > local75 && (super.aByteArrayArrayArray16[local13][local55][local75 + 1] & 0x1) != 0) {
							local75++;
						}
						while (local73 > 0 && (super.aByteArrayArrayArray16[local13][local55][local73 - 1] & 0x1) != 0) {
							local73--;
						}
						label164: while (local77 > 0) {
							for (local128 = local73; local128 <= local75; local128++) {
								if ((super.aByteArrayArrayArray16[local77 - 1][local55][local128] & 0x1) == 0) {
									break label164;
								}
							}
							local77--;
						}
						label153: while (local79 < 3) {
							for (local128 = local73; local128 <= local75; local128++) {
								if ((super.aByteArrayArrayArray16[local79 + 1][local55][local128] & 0x1) == 0) {
									break label153;
								}
							}
							local79++;
						}
						local128 = (local75 + 1 - local73) * (local79 + 1 - local77);
						if (local128 >= 2) {
							local218 = super.anIntArrayArrayArray20[local79][local55][local73] - 240;
							local227 = super.anIntArrayArrayArray20[local77][local55][local73];
							Static395.method6267(1, local55 << 7, local55 << 7, local73 << 7, (local75 << 7) + 128, local218, local227);
							for (local247 = local77; local247 <= local79; local247++) {
								for (local251 = local73; local251 <= local75; local251++) {
									super.aByteArrayArrayArray16[local247][local55][local251] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray16[local13][local55][local17] & 0x2) != 0) {
						local73 = local55;
						local75 = local55;
						local77 = local13;
						while (local75 < super.anInt9080 && (super.aByteArrayArrayArray16[local13][local75 + 1][local17] & 0x2) != 0) {
							local75++;
						}
						while (local73 > 0 && (super.aByteArrayArrayArray16[local13][local73 - 1][local17] & 0x2) != 0) {
							local73--;
						}
						local79 = local13;
						label217: while (local77 > 0) {
							for (local128 = local73; local128 <= local75; local128++) {
								if ((super.aByteArrayArrayArray16[local77 - 1][local128][local17] & 0x2) == 0) {
									break label217;
								}
							}
							local77--;
						}
						label206: while (local79 < 3) {
							for (local128 = local73; local128 <= local75; local128++) {
								if ((super.aByteArrayArrayArray16[local79 + 1][local128][local17] & 0x2) == 0) {
									break label206;
								}
							}
							local79++;
						}
						local128 = (local75 + 1 - local73) * (local79 + 1 - local77);
						if (local128 >= 2) {
							local218 = super.anIntArrayArrayArray20[local79][local73][local17] - 240;
							local227 = super.anIntArrayArrayArray20[local77][local73][local17];
							Static395.method6267(2, local73 << 7, (local75 << 7) + 128, local17 << 7, local17 << 7, local218, local227);
							for (local247 = local77; local247 <= local79; local247++) {
								for (local251 = local73; local251 <= local75; local251++) {
									super.aByteArrayArrayArray16[local247][local251][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray16[local13][local55][local17] & 0x4) != 0) {
						local73 = local55;
						local75 = local55;
						for (local77 = local17; local77 > 0 && (super.aByteArrayArrayArray16[local13][local55][local77 - 1] & 0x4) != 0; local77--) {
						}
						for (local79 = local17; super.anInt9076 > local79 && (super.aByteArrayArrayArray16[local13][local55][local79 + 1] & 0x4) != 0; local79++) {
						}
						label271: while (local73 > 0) {
							for (local128 = local77; local128 <= local79; local128++) {
								if ((super.aByteArrayArrayArray16[local13][local73 - 1][local128] & 0x4) == 0) {
									break label271;
								}
							}
							local73--;
						}
						label260: while (super.anInt9080 > local75) {
							for (local128 = local77; local128 <= local79; local128++) {
								if ((super.aByteArrayArrayArray16[local13][local75 + 1][local128] & 0x4) == 0) {
									break label260;
								}
							}
							local75++;
						}
						if ((local79 + 1 - local77) * (local75 + 1 - local73) >= 4) {
							local128 = super.anIntArrayArrayArray20[local13][local73][local77];
							Static395.method6267(4, local73 << 7, (local75 << 7) + 128, local77 << 7, (local79 << 7) + 128, local128, local128);
							for (@Pc(703) int local703 = local73; local703 <= local75; local703++) {
								for (local218 = local77; local218 <= local79; local218++) {
									super.aByteArrayArrayArray16[local13][local703][local218] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray16 = null;
	}
}
