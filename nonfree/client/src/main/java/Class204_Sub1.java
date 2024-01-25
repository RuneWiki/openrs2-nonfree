import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class204_Sub1 extends Class204 {

	@OriginalMember(owner = "client!q", name = "O", descriptor = "I")
	public int anInt5196 = 99;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIZ)V")
	public Class204_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static156.aClass146_3, Static412.aClass169_5);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILclient!ea;ILclient!qq;IZIII)V")
	public void method4542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class61 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class28 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static8.aClass173_Sub1_1.method3965(Static155.anInt2774) && !Static418.method5687(arg1, arg8, arg2, Static3.anInt6323)) {
			return;
		}
		if (this.anInt5196 > arg6) {
			this.anInt5196 = arg6;
		}
		@Pc(34) Class118 local34 = Static113.aClass127_2.method2820(arg4);
		if (Static155.anInt2774 == 1 && local34.aBoolean208) {
			return;
		}
		@Pc(56) int local56;
		@Pc(59) int local59;
		if (arg9 == 1 || arg9 == 3) {
			local56 = local34.anInt3025;
			local59 = local34.anInt2997;
		} else {
			local56 = local34.anInt2997;
			local59 = local34.anInt3025;
		}
		@Pc(88) int local88;
		@Pc(81) int local81;
		if (super.anInt5176 >= local56 + arg1) {
			local81 = arg1 + (local56 + 1 >> 1);
			local88 = arg1 + (local56 >> 1);
		} else {
			local88 = arg1;
			local81 = arg1 + 1;
		}
		@Pc(104) int local104;
		@Pc(108) int local108;
		if (super.anInt5178 < arg8 + local59) {
			local104 = arg8;
			local108 = arg8 + 1;
		} else {
			local104 = (local59 >> 1) + arg8;
			local108 = arg8 + (local59 + 1 >> 1);
		}
		@Pc(129) Class84 local129 = Static420.aClass84Array4[arg2];
		@Pc(153) int local153 = local129.method5322(local88, local104) + local129.method5322(local81, local104) + local129.method5322(local88, local108) + local129.method5322(local81, local108) >> 2;
		@Pc(178) int local178 = (arg1 << 7) + (local56 << 6);
		@Pc(186) int local186 = (arg8 << 7) + (local59 << 6);
		@Pc(198) boolean local198 = Static433.aBoolean315 && !super.aBoolean359 && local34.aBoolean215;
		if (local34.method2728()) {
			Static57.method1074(null, arg1, null, arg9, arg6, arg8, local34);
		}
		@Pc(231) boolean local231 = arg7 == -1 && local34.anInt2979 == -1 && local34.anIntArray277 == null && local34.anIntArray273 == null && !local34.aBoolean206;
		if (Static367.aBoolean484 && (Static402.method5471(arg0) && local34.anInt3012 != 1 || !(!Static385.method5312(arg0) || local34.anInt3012 != 0))) {
			return;
		}
		if (arg0 != 22) {
			@Pc(386) Class3_Sub3 local386;
			@Pc(354) Class3_Sub3_Sub1 local354;
			@Pc(358) int local358;
			if (arg0 == 10 || arg0 == 11) {
				local354 = null;
				if (local231) {
					@Pc(417) Class3_Sub3_Sub1 local417 = new Class3_Sub3_Sub1(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg1, arg1 + local56 - 1, arg8, arg8 + local59 - 1, arg0, arg9, local198);
					local354 = local417;
					local386 = local417;
					local358 = local417.method2135();
				} else {
					local358 = 15;
					local386 = new Class3_Sub3_Sub2(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg1, local56 + arg1 - 1, arg8, local59 + arg8 - 1, arg0, arg9, arg7);
				}
				@Pc(438) Class3_Sub3 local438 = Static49.method903(arg6, arg1, arg8, tf.class);
				@Pc(440) boolean local440 = false;
				if (local438 instanceof Class3_Sub3_Sub3 && arg1 == local438.aShort97 && arg8 == local438.aShort95) {
					((Class3_Sub3_Sub3) local438).aClass3_Sub3_1 = local386;
					local440 = true;
				}
				if (local440 || Static9.method128(local386, false)) {
					if (local354 != null && local354.method5806()) {
						local354.method5813(arg5);
					}
					if (local34.aBoolean216 && Static433.aBoolean315) {
						if (local358 > 30) {
							local358 = 30;
						}
						for (@Pc(485) int local485 = 0; local485 <= local56; local485++) {
							for (@Pc(489) int local489 = 0; local489 <= local59; local489++) {
								local129.method5332(arg1 + local485, arg8 - -local489, local358);
							}
						}
					}
				}
				if (local34.anInt2978 != 0 && arg3 != null) {
					arg3.method1481(local34.aBoolean214, local59, arg8, !local34.aBoolean220, local56, arg1);
				}
			} else {
				@Pc(638) Class3_Sub3 local638;
				if (arg0 >= 12 && arg0 <= 17 || arg0 >= 18 && arg0 <= 21) {
					if (local231) {
						local354 = new Class3_Sub3_Sub1(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg1, local56 + arg1 - 1, arg8, arg8 + local59 - 1, arg0, arg9, local198);
						local386 = local354;
						if (local354.method5806()) {
							local354.method5813(arg5);
						}
					} else {
						local386 = new Class3_Sub3_Sub2(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg1, local56 + arg1 - 1, arg8, arg8 + local59 - 1, arg0, arg9, arg7);
					}
					local638 = Static49.method903(arg6, arg1, arg8, tf.class);
					if (local638 instanceof Class3_Sub3_Sub3 && local638.aShort97 == arg1 && arg8 == local638.aShort95) {
						((Class3_Sub3_Sub3) local638).aClass3_Sub3_1 = local386;
					} else {
						Static9.method128(local386, false);
					}
					if (Static433.aBoolean315 && !super.aBoolean359 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg6 > 0 && local34.anInt3012 != 0) {
						super.aByteArrayArrayArray15[arg6][arg1][arg8] = (byte) (super.aByteArrayArrayArray15[arg6][arg1][arg8] | 0x4);
					}
					if (local34.anInt2978 != 0 && arg3 != null) {
						arg3.method1481(local34.aBoolean214, local59, arg8, !local34.aBoolean220, local56, arg1);
					}
				} else {
					@Pc(774) Class3_Sub1 local774;
					if (arg0 == 0) {
						@Pc(739) int local739 = local34.anInt3012;
						if (Static432.aBoolean489 && local34.anInt3012 == -1) {
							local739 = 1;
						}
						if (local231) {
							@Pc(764) Class3_Sub1_Sub1 local764 = new Class3_Sub1_Sub1(arg5, local34, arg2, local178, local153, local186, super.aBoolean359, arg0, arg9, local198);
							if (local764.method5806()) {
								local764.method5813(arg5);
							}
							local774 = local764;
						} else {
							local774 = new Class3_Sub1_Sub2(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg0, arg9, arg7);
						}
						@Pc(797) Class3_Sub1 local797 = Static428.method5836(arg6, arg1, arg8);
						if (local797 instanceof Class3_Sub1_Sub3) {
							((Class3_Sub1_Sub3) local797).aClass3_Sub1_3 = local774;
						} else {
							Static226.method3456(arg6, arg1, arg8, local774, null);
						}
						if (Static433.aBoolean315) {
							if (arg9 == 0) {
								if (local34.aBoolean216) {
									local129.method5332(arg1, arg8, 50);
									local129.method5332(arg1, arg8 + 1, 50);
								}
								if (local739 == 1 && !super.aBoolean359) {
									super.aByteArrayArrayArray15[arg6][arg1][arg8] = (byte) (super.aByteArrayArrayArray15[arg6][arg1][arg8] | 0x1);
								}
							} else if (arg9 == 1) {
								if (local34.aBoolean216) {
									local129.method5332(arg1, arg8 + 1, 50);
									local129.method5332(arg1 + 1, arg8 + 1, 50);
								}
								if (local739 == 1 && !super.aBoolean359) {
									super.aByteArrayArrayArray15[arg6][arg1][arg8 + 1] = (byte) (super.aByteArrayArrayArray15[arg6][arg1][arg8 + 1] | 0x2);
								}
							} else if (arg9 == 2) {
								if (local34.aBoolean216) {
									local129.method5332(arg1 + 1, arg8, 50);
									local129.method5332(arg1 + 1, arg8 - -1, 50);
								}
								if (local739 == 1 && !super.aBoolean359) {
									super.aByteArrayArrayArray15[arg6][arg1 + 1][arg8] = (byte) (super.aByteArrayArrayArray15[arg6][arg1 + 1][arg8] | 0x1);
								}
							} else if (arg9 == 3) {
								if (local34.aBoolean216) {
									local129.method5332(arg1, arg8, 50);
									local129.method5332(arg1 + 1, arg8, 50);
								}
								if (local739 == 1 && !super.aBoolean359) {
									super.aByteArrayArrayArray15[arg6][arg1][arg8] = (byte) (super.aByteArrayArrayArray15[arg6][arg1][arg8] | 0x2);
								}
							}
						}
						if (local34.anInt2978 != 0 && arg3 != null) {
							arg3.method1491(arg8, arg0, !local34.aBoolean220, local34.aBoolean214, arg9, arg1);
						}
						if (local34.anInt3002 != 16) {
							Static381.method5254(arg6, arg1, arg8, local34.anInt3002);
						}
					} else {
						@Pc(1065) Class3_Sub1_Sub1 local1065;
						@Pc(1075) Class3_Sub1 local1075;
						if (arg0 == 1) {
							if (local231) {
								local1065 = new Class3_Sub1_Sub1(arg5, local34, arg2, local178, local153, local186, super.aBoolean359, arg0, arg9, local198);
								if (local1065.method5806()) {
									local1065.method5813(arg5);
								}
								local1075 = local1065;
							} else {
								local1075 = new Class3_Sub1_Sub2(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg0, arg9, arg7);
							}
							local774 = Static428.method5836(arg6, arg1, arg8);
							if (local774 instanceof Class3_Sub1_Sub3) {
								((Class3_Sub1_Sub3) local774).aClass3_Sub1_3 = local1075;
							} else {
								Static226.method3456(arg6, arg1, arg8, local1075, null);
							}
							if (local34.aBoolean216 && Static433.aBoolean315) {
								if (arg9 == 0) {
									local129.method5332(arg1, arg8 + 1, 50);
								} else if (arg9 == 1) {
									local129.method5332(arg1 + 1, arg8 + 1, 50);
								} else if (arg9 == 2) {
									local129.method5332(arg1 + 1, arg8, 50);
								} else if (arg9 == 3) {
									local129.method5332(arg1, arg8, 50);
								}
							}
							if (local34.anInt2978 != 0 && arg3 != null) {
								arg3.method1491(arg8, arg0, !local34.aBoolean220, local34.aBoolean214, arg9, arg1);
							}
						} else if (arg0 == 2) {
							local358 = arg9 + 1 & 0x3;
							if (local231) {
								@Pc(1256) Class3_Sub1_Sub1 local1256 = new Class3_Sub1_Sub1(arg5, local34, arg2, local178, local153, local186, super.aBoolean359, arg0, arg9 + 4, local198);
								@Pc(1271) Class3_Sub1_Sub1 local1271 = new Class3_Sub1_Sub1(arg5, local34, arg2, local178, local153, local186, super.aBoolean359, arg0, local358, local198);
								if (local1256.method5806()) {
									local1256.method5813(arg5);
								}
								local774 = local1271;
								if (local1271.method5806()) {
									local1271.method5813(arg5);
								}
								local1075 = local1256;
							} else {
								local1075 = new Class3_Sub1_Sub2(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg0, arg9 + 4, arg7);
								local774 = new Class3_Sub1_Sub2(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg0, local358, arg7);
							}
							Static226.method3456(arg6, arg1, arg8, local1075, local774);
							if (local34.anInt3012 == 1 && Static433.aBoolean315 && !super.aBoolean359) {
								if (arg9 == 0) {
									super.aByteArrayArrayArray15[arg6][arg1][arg8] = (byte) (super.aByteArrayArrayArray15[arg6][arg1][arg8] | 0x1);
									super.aByteArrayArrayArray15[arg6][arg1][arg8 + 1] = (byte) (super.aByteArrayArrayArray15[arg6][arg1][arg8 + 1] | 0x2);
								} else if (arg9 == 1) {
									super.aByteArrayArrayArray15[arg6][arg1][arg8 + 1] = (byte) (super.aByteArrayArrayArray15[arg6][arg1][arg8 + 1] | 0x2);
									super.aByteArrayArrayArray15[arg6][arg1 + 1][arg8] = (byte) (super.aByteArrayArrayArray15[arg6][arg1 + 1][arg8] | 0x1);
								} else if (arg9 == 2) {
									super.aByteArrayArrayArray15[arg6][arg1 + 1][arg8] = (byte) (super.aByteArrayArrayArray15[arg6][arg1 + 1][arg8] | 0x1);
									super.aByteArrayArrayArray15[arg6][arg1][arg8] = (byte) (super.aByteArrayArrayArray15[arg6][arg1][arg8] | 0x2);
								} else if (arg9 == 3) {
									super.aByteArrayArrayArray15[arg6][arg1][arg8] = (byte) (super.aByteArrayArrayArray15[arg6][arg1][arg8] | 0x2);
									super.aByteArrayArrayArray15[arg6][arg1][arg8] = (byte) (super.aByteArrayArrayArray15[arg6][arg1][arg8] | 0x1);
								}
							}
							if (local34.anInt2978 != 0 && arg3 != null) {
								arg3.method1491(arg8, arg0, !local34.aBoolean220, local34.aBoolean214, arg9, arg1);
							}
							if (local34.anInt3002 != 16) {
								Static381.method5254(arg6, arg1, arg8, local34.anInt3002);
							}
						} else if (arg0 == 3) {
							if (local231) {
								local1065 = new Class3_Sub1_Sub1(arg5, local34, arg2, local178, local153, local186, super.aBoolean359, arg0, arg9, local198);
								local1075 = local1065;
								if (local1065.method5806()) {
									local1065.method5813(arg5);
								}
							} else {
								local1075 = new Class3_Sub1_Sub2(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg0, arg9, arg7);
							}
							local774 = Static428.method5836(arg6, arg1, arg8);
							if (local774 instanceof Class3_Sub1_Sub3) {
								((Class3_Sub1_Sub3) local774).aClass3_Sub1_3 = local1075;
							} else {
								Static226.method3456(arg6, arg1, arg8, local1075, null);
							}
							if (local34.aBoolean216 && Static433.aBoolean315) {
								if (arg9 == 0) {
									local129.method5332(arg1, arg8 + 1, 50);
								} else if (arg9 == 1) {
									local129.method5332(arg1 + 1, arg8 + 1, 50);
								} else if (arg9 == 2) {
									local129.method5332(arg1 + 1, arg8, 50);
								} else if (arg9 == 3) {
									local129.method5332(arg1, arg8, 50);
								}
							}
							if (local34.anInt2978 != 0 && arg3 != null) {
								arg3.method1491(arg8, arg0, !local34.aBoolean220, local34.aBoolean214, arg9, arg1);
							}
						} else if (arg0 == 9) {
							if (local231) {
								local354 = new Class3_Sub3_Sub1(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg1, arg1, arg8, arg8, arg0, arg9, local198);
								if (local354.method5806()) {
									local354.method5813(arg5);
								}
								local386 = local354;
							} else {
								local386 = new Class3_Sub3_Sub2(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg1, arg1 + local56 - 1, arg8, local59 + arg8 - 1, arg0, arg9, arg7);
							}
							local638 = Static49.method903(arg6, arg1, arg8, tf.class);
							if (local638 instanceof Class3_Sub3_Sub3 && arg1 == local638.aShort97 && local638.aShort95 == arg8) {
								((Class3_Sub3_Sub3) local638).aClass3_Sub3_1 = local386;
							} else {
								Static9.method128(local386, false);
							}
							if (local34.anInt2978 != 0 && arg3 != null) {
								arg3.method1481(local34.aBoolean214, local59, arg8, !local34.aBoolean220, local56, arg1);
							}
							if (local34.anInt3002 != 16) {
								Static381.method5254(arg6, arg1, arg8, local34.anInt3002);
							}
						} else {
							@Pc(1828) Class3_Sub4 local1828;
							if (arg0 == 4) {
								if (local231) {
									@Pc(1847) Class3_Sub4_Sub2 local1847 = new Class3_Sub4_Sub2(arg5, local34, arg2, local178, local153, local186, super.aBoolean359, 0, 0, 0, arg0, arg9);
									local1828 = local1847;
									if (local1847.method5806()) {
										local1847.method5813(arg5);
									}
								} else {
									local1828 = new Class3_Sub4_Sub3(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, 0, 0, 0, arg0, arg9, arg7);
								}
								@Pc(1862) Class3_Sub4 local1862 = Static64.method1227(arg6, arg1, arg8);
								if (local1862 instanceof Class3_Sub4_Sub1) {
									((Class3_Sub4_Sub1) local1862).aClass3_Sub4_1 = local1828;
								} else {
									Static377.method5521(arg6, arg1, arg8, local1828, null);
								}
							} else {
								@Pc(1884) int local1884;
								@Pc(1890) Interface10 local1890;
								@Pc(1929) Class3_Sub4_Sub2 local1929;
								@Pc(1973) Class3_Sub4 local1973;
								if (arg0 == 5) {
									local1884 = 17;
									local1890 = (Interface10) Static428.method5836(arg6, arg1, arg8);
									if (local1890 != null) {
										local1884 = Static113.aClass127_2.method2820(local1890.method5812()).anInt3002 + 1;
									}
									if (local231) {
										local1929 = new Class3_Sub4_Sub2(arg5, local34, arg2, local178, local153, local186, super.aBoolean359, 0, local1884 * Static211.anIntArray316[arg9], local1884 * Static195.anIntArray308[arg9], arg0, arg9);
										local1828 = local1929;
										if (local1929.method5806()) {
											local1929.method5813(arg5);
										}
									} else {
										local1828 = new Class3_Sub4_Sub3(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, 0, local1884 * Static211.anIntArray316[arg9], Static195.anIntArray308[arg9] * local1884, arg0, arg9, arg7);
									}
									local1973 = Static64.method1227(arg6, arg1, arg8);
									if (local1973 instanceof Class3_Sub4_Sub1) {
										((Class3_Sub4_Sub1) local1973).aClass3_Sub4_1 = local1828;
									} else {
										Static377.method5521(arg6, arg1, arg8, local1828, null);
									}
								} else if (arg0 == 6) {
									local1884 = 9;
									local1890 = (Interface10) Static428.method5836(arg6, arg1, arg8);
									if (local1890 != null) {
										local1884 = Static113.aClass127_2.method2820(local1890.method5812()).anInt3002 / 2 + 1;
									}
									if (local231) {
										local1929 = new Class3_Sub4_Sub2(arg5, local34, arg2, local178, local153, local186, super.aBoolean359, arg9, Static211.anIntArray316[arg9] * local1884, local1884 * Static195.anIntArray308[arg9], arg0, arg9 + 4);
										local1828 = local1929;
										if (local1929.method5806()) {
											local1929.method5813(arg5);
										}
									} else {
										local1828 = new Class3_Sub4_Sub3(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg9, Static120.anIntArray218[arg9] * local1884, Static176.anIntArray283[arg9] * local1884, arg0, arg9 + 4, arg7);
									}
									local1973 = Static64.method1227(arg6, arg1, arg8);
									if (local1973 instanceof Class3_Sub4_Sub1) {
										((Class3_Sub4_Sub1) local1973).aClass3_Sub4_1 = local1828;
									} else {
										Static377.method5521(arg6, arg1, arg8, local1828, null);
									}
								} else if (arg0 == 7) {
									local1884 = arg9 + 2 & 0x3;
									if (local231) {
										@Pc(2133) Class3_Sub4_Sub2 local2133 = new Class3_Sub4_Sub2(arg5, local34, arg2, local178, local153, local186, super.aBoolean359, local1884, 0, 0, arg0, local1884 + 4);
										local1828 = local2133;
										if (local2133.method5806()) {
											local2133.method5813(arg5);
										}
									} else {
										local1828 = new Class3_Sub4_Sub3(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, local1884, 0, 0, arg0, local1884 + 4, arg7);
									}
									@Pc(2171) Class3_Sub4 local2171 = Static64.method1227(arg6, arg1, arg8);
									if (local2171 instanceof Class3_Sub4_Sub1) {
										((Class3_Sub4_Sub1) local2171).aClass3_Sub4_1 = local1828;
									} else {
										Static377.method5521(arg6, arg1, arg8, local1828, null);
									}
								} else if (arg0 == 8) {
									local358 = arg9 + 2 & 0x3;
									@Pc(2197) int local2197 = 9;
									@Pc(2203) Interface10 local2203 = (Interface10) Static428.method5836(arg6, arg1, arg8);
									if (local2203 != null) {
										local2197 = Static113.aClass127_2.method2820(local2203.method5812()).anInt3002 / 2 + 1;
									}
									@Pc(2248) Class3_Sub4 local2248;
									@Pc(2269) Class3_Sub4 local2269;
									if (local231) {
										local2248 = new Class3_Sub4_Sub2(arg5, local34, arg2, local178, local153, local186, super.aBoolean359, arg9, local2197 * Static120.anIntArray218[arg9], local2197 * Static176.anIntArray283[arg9], arg0, arg9 + 4);
										local2269 = new Class3_Sub4_Sub2(arg5, local34, arg2, local178, local153, local186, super.aBoolean359, arg9, 0, 0, arg0, local358 + 4);
										if (local2248.method5806()) {
											local2248.method5813(arg5);
										}
										if (local2269.method5806()) {
											local2269.method5813(arg5);
										}
									} else {
										local2248 = new Class3_Sub4_Sub3(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg9, Static120.anIntArray218[arg9] * local2197, local2197 * Static176.anIntArray283[arg9], arg0, arg9 + 4, arg7);
										local2269 = new Class3_Sub4_Sub3(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg9, 0, 0, arg0, local358 + 4, arg7);
									}
									Static377.method5521(arg6, arg1, arg8, local2248, local2269);
								}
							}
						}
					}
				}
			}
		} else if (Static8.aClass173_Sub1_1.aBoolean302 || local34.anInt2984 != 0 || local34.anInt2978 == 1 || local34.aBoolean213) {
			@Pc(285) Class3_Sub5 local285;
			if (local231) {
				@Pc(301) Class3_Sub5_Sub2 local301 = new Class3_Sub5_Sub2(arg5, local34, arg2, local178, local153, local186, super.aBoolean359, arg9, local198);
				local285 = local301;
				if (local301.method5806()) {
					local301.method5813(arg5);
				}
			} else {
				local285 = new Class3_Sub5_Sub1(arg5, local34, arg6, arg2, local178, local153, local186, super.aBoolean359, arg9, arg7);
			}
			@Pc(316) Class3_Sub5 local316 = Static91.method1566(arg6, arg1, arg8);
			if (local316 instanceof Class3_Sub5_Sub3) {
				((Class3_Sub5_Sub3) local316).aClass3_Sub5_2 = local285;
			} else {
				Static53.method975(arg6, arg1, arg8, local285);
			}
			if (local34.anInt2978 == 1 && arg3 != null) {
				arg3.method1483(arg8, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!qq;I)V")
	public void method4543(@OriginalArg(0) Class28 arg0) {
		Static232.method3612(arg0);
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (super.anInt5181 > 1) {
			for (local17 = 0; local17 < super.anInt5176; local17++) {
				for (local21 = 0; local21 < super.anInt5178; local21++) {
					if ((Static179.aByteArrayArrayArray3[1][local17][local21] & 0x2) == 2) {
						Static300.method5942(local17, local21);
					}
				}
			}
		}
		for (local17 = 0; super.anInt5181 > local17; local17++) {
			for (local21 = 0; local21 <= super.anInt5178; local21++) {
				for (@Pc(59) int local59 = 0; super.anInt5176 >= local59; local59++) {
					@Pc(77) int local77;
					@Pc(79) int local79;
					@Pc(81) int local81;
					@Pc(83) int local83;
					@Pc(128) int local128;
					@Pc(219) int local219;
					@Pc(228) int local228;
					@Pc(248) int local248;
					@Pc(252) int local252;
					if ((super.aByteArrayArrayArray15[local17][local59][local21] & 0x1) != 0) {
						local77 = local21;
						local79 = local21;
						local81 = local17;
						local83 = local17;
						while (local77 > 0 && (super.aByteArrayArrayArray15[local17][local59][local77 - 1] & 0x1) != 0) {
							local77--;
						}
						while (super.anInt5178 > local79 && (super.aByteArrayArrayArray15[local17][local59][local79 + 1] & 0x1) != 0) {
							local79++;
						}
						label164: while (local81 > 0) {
							for (local128 = local77; local128 <= local79; local128++) {
								if ((super.aByteArrayArrayArray15[local81 - 1][local59][local128] & 0x1) == 0) {
									break label164;
								}
							}
							local81--;
						}
						label153: while (local83 < 3) {
							for (local128 = local77; local128 <= local79; local128++) {
								if ((super.aByteArrayArrayArray15[local83 + 1][local59][local128] & 0x1) == 0) {
									break label153;
								}
							}
							local83++;
						}
						local128 = (local83 + 1 - local81) * (local79 + 1 - local77);
						if (local128 >= 2) {
							local219 = super.anIntArrayArrayArray6[local83][local59][local77] - 240;
							local228 = super.anIntArrayArrayArray6[local81][local59][local77];
							Static156.method2611(1, local59 << 7, local59 << 7, local77 << 7, (local79 << 7) + 128, local219, local228);
							for (local248 = local81; local248 <= local83; local248++) {
								for (local252 = local77; local252 <= local79; local252++) {
									super.aByteArrayArrayArray15[local248][local59][local252] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray15[local17][local59][local21] & 0x2) != 0) {
						local77 = local59;
						local79 = local59;
						local81 = local17;
						while (local79 < super.anInt5176 && (super.aByteArrayArrayArray15[local17][local79 + 1][local21] & 0x2) != 0) {
							local79++;
						}
						local83 = local17;
						while (local77 > 0 && (super.aByteArrayArrayArray15[local17][local77 - 1][local21] & 0x2) != 0) {
							local77--;
						}
						label217: while (local81 > 0) {
							for (local128 = local77; local128 <= local79; local128++) {
								if ((super.aByteArrayArrayArray15[local81 - 1][local128][local21] & 0x2) == 0) {
									break label217;
								}
							}
							local81--;
						}
						label206: while (local83 < 3) {
							for (local128 = local77; local128 <= local79; local128++) {
								if ((super.aByteArrayArrayArray15[local83 + 1][local128][local21] & 0x2) == 0) {
									break label206;
								}
							}
							local83++;
						}
						local128 = (local83 + 1 - local81) * (local79 + 1 - local77);
						if (local128 >= 2) {
							local219 = super.anIntArrayArrayArray6[local83][local77][local21] - 240;
							local228 = super.anIntArrayArrayArray6[local81][local77][local21];
							Static156.method2611(2, local77 << 7, (local79 << 7) + 128, local21 << 7, local21 << 7, local219, local228);
							for (local248 = local81; local248 <= local83; local248++) {
								for (local252 = local77; local252 <= local79; local252++) {
									super.aByteArrayArrayArray15[local248][local252][local21] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray15[local17][local59][local21] & 0x4) != 0) {
						local77 = local59;
						local79 = local59;
						for (local81 = local21; local81 > 0 && (super.aByteArrayArrayArray15[local17][local59][local81 - 1] & 0x4) != 0; local81--) {
						}
						for (local83 = local21; local83 < super.anInt5178 && (super.aByteArrayArrayArray15[local17][local59][local83 + 1] & 0x4) != 0; local83++) {
						}
						label271: while (local77 > 0) {
							for (local128 = local81; local128 <= local83; local128++) {
								if ((super.aByteArrayArrayArray15[local17][local77 - 1][local128] & 0x4) == 0) {
									break label271;
								}
							}
							local77--;
						}
						label260: while (super.anInt5176 > local79) {
							for (local128 = local81; local128 <= local83; local128++) {
								if ((super.aByteArrayArrayArray15[local17][local79 + 1][local128] & 0x4) == 0) {
									break label260;
								}
							}
							local79++;
						}
						if ((local83 + 1 - local81) * (-local77 + local79 - -1) >= 4) {
							local128 = super.anIntArrayArrayArray6[local17][local77][local81];
							Static156.method2611(4, local77 << 7, (local79 << 7) + 128, local81 << 7, (local83 << 7) + 128, local128, local128);
							for (@Pc(703) int local703 = local77; local703 <= local79; local703++) {
								for (local219 = local81; local219 <= local83; local219++) {
									super.aByteArrayArrayArray15[local17][local703][local219] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILclient!qq;II[BIII[Lclient!ea;)V")
	public void method4544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class61[] arg9) {
		@Pc(10) Class6_Sub15 local10 = new Class6_Sub15(arg6);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(23) int local23 = local10.method3083();
			if (local23 == 0) {
				return;
			}
			local12 += local23;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local10.method3090();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local10.method3111();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (local60 == arg8 && arg0 <= local56 && local56 < arg0 + 8 && local50 >= arg7 && local50 < arg7 + 8) {
					@Pc(104) Class118 local104 = Static113.aClass127_2.method2820(local12);
					@Pc(123) int local123 = arg1 + Static31.method411(local104.anInt2997, local72, local56 & 0x7, local50 & 0x7, local104.anInt3025, arg2);
					@Pc(140) int local140 = arg5 + Static328.method4701(local72, arg2, local104.anInt3025, local104.anInt2997, local56 & 0x7, local50 & 0x7);
					if (local123 > 0 && local140 > 0 && local123 < super.anInt5176 - 1 && local140 < super.anInt5178 - 1) {
						@Pc(169) Class61 local169 = null;
						if (!super.aBoolean359) {
							@Pc(174) int local174 = arg4;
							if ((Static179.aByteArrayArrayArray3[1][local123][local140] & 0x2) == 2) {
								local174 = arg4 - 1;
							}
							if (local174 >= 0) {
								local169 = arg9[local174];
							}
						}
						this.method4542(local68, local123, arg4, local169, local12, arg3, arg4, -1, local140, arg2 + local72 & 0x3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!ha;ILclient!qq;[IIIIIII)V")
	public void method4546(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean359) {
			return;
		}
		@Pc(20) Class125 local20 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(32) int local32 = (arg0 & 0x7) * 8;
		@Pc(38) int local38 = (arg5 & 0x7) * 8;
		while (true) {
			@Pc(43) int local43;
			@Pc(59) int local59;
			@Pc(301) int local301;
			@Pc(66) int local66;
			while (arg1.anInt3487 < arg1.aByteArray51.length) {
				local43 = arg1.method3111();
				if (local43 == 0) {
					local20 = new Class125(arg1);
				} else {
					@Pc(115) int local115;
					@Pc(165) int local165;
					@Pc(187) int local187;
					@Pc(109) int local109;
					if (local43 == 1) {
						local59 = arg1.method3111();
						if (local59 > 0) {
							for (local66 = 0; local66 < local59; local66++) {
								@Pc(75) Class66 local75 = new Class66(arg3, arg1, 0);
								if (local75.anInt1666 == 31) {
									@Pc(86) Class224 local86 = Static221.aClass72_1.method1667(arg1.method3108());
									local75.method1548(local86.anInt6018, local86.anInt6017, local86.anInt6022, local86.anInt6015);
								}
								if (arg3.method3574() > 0) {
									@Pc(103) Class6_Sub6 local103 = local75.aClass6_Sub6_1;
									local109 = local103.method1163() >> 7;
									local115 = local103.method1169() >> 7;
									if (local75.anInt1662 == arg9 && local32 <= local109 && local109 < local32 + 8 && local115 >= local38 && local115 < local38 + 8) {
										local165 = (arg7 << 7) + Static348.method4941(local103.method1169() & 0x3FF, local103.method1163() & 0x3FF, arg6);
										local109 = local165 >> 7;
										local187 = (arg2 << 7) + Static402.method5468(arg6, local103.method1169() & 0x3FF, local103.method1163() & 0x3FF);
										local115 = local187 >> 7;
										if (local109 >= 0 && local115 >= 0 && super.anInt5176 > local109 && super.anInt5178 > local115) {
											local103.method1171(local187, local165, super.anIntArrayArrayArray6[arg9][local109][local115] - local103.method1170());
											if (arg3.method3574() > 0) {
												Static116.method1889(local75);
											}
										}
									}
								}
							}
						}
					} else if (local43 == 2) {
						if (local20 == null) {
							local20 = new Class125();
						}
						local20.method2768(arg1);
					} else if (local43 != 128) {
						if (local43 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray13 == null) {
							super.aByteArrayArrayArray13 = new byte[4][][];
						}
						for (local59 = 0; local59 < 4; local59++) {
							@Pc(285) byte local285 = arg1.method3116();
							@Pc(305) int local305;
							if (local285 == 0 && super.aByteArrayArrayArray13[arg8] != null) {
								if (arg9 >= local59) {
									local301 = arg7;
									local305 = arg7 + 7;
									local109 = arg2;
									if (arg2 < 0) {
										local109 = 0;
									} else if (super.anInt5178 <= arg2) {
										local109 = super.anInt5178;
									}
									if (arg7 < 0) {
										local301 = 0;
									} else if (arg7 >= super.anInt5176) {
										local301 = super.anInt5176;
									}
									if (local305 < 0) {
										local305 = 0;
									} else if (local305 >= super.anInt5176) {
										local305 = super.anInt5176;
									}
									local115 = arg2 + 7;
									if (local115 < 0) {
										local115 = 0;
									} else if (local115 >= super.anInt5178) {
										local115 = super.anInt5178;
									}
									while (local305 > local301) {
										while (local109 < local115) {
											super.aByteArrayArrayArray13[arg8][local301][local109] = 0;
											local109++;
										}
										local301++;
									}
								}
							} else if (local285 == 1) {
								if (super.aByteArrayArrayArray13[arg8] == null) {
									super.aByteArrayArrayArray13[arg8] = new byte[super.anInt5176 + 1][super.anInt5178 + 1];
								}
								for (local301 = 0; local301 < 64; local301 += 4) {
									for (local305 = 0; local305 < 64; local305 += 4) {
										@Pc(435) byte local435 = arg1.method3116();
										if (arg9 >= local59) {
											for (local115 = local301; local115 < local301 + 4; local115++) {
												for (local165 = local305; local165 < local305 + 4; local165++) {
													if (local32 <= local115 && local32 + 8 > local115 && local38 <= local165 && local38 < local38 + 8) {
														local187 = arg7 + Static256.method3949(local165 & 0x7, arg6, local115 & 0x7);
														@Pc(494) int local494 = Static46.method4880(local115 & 0x7, local165 & 0x7, arg6) + arg2;
														if (local187 >= 0 && super.anInt5176 > local187 && local494 >= 0 && super.anInt5178 > local494) {
															super.aByteArrayArrayArray13[arg8][local187][local494] = local435;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg4 == null) {
						arg1.anInt3487 += 10;
					} else {
						arg4[0] = arg1.method3108();
						arg4[1] = arg1.method3103();
						arg4[2] = arg1.method3103();
						arg4[3] = arg1.method3103();
						arg4[4] = arg1.method3108();
					}
				}
			}
			if (local20 != null) {
				Static90.method1556(arg7 >> 3, arg2 >> 3, local20);
			}
			if (super.aByteArrayArrayArray13 != null && super.aByteArrayArrayArray13[arg8] != null) {
				local43 = arg7 + 7;
				local59 = arg2 + 7;
				for (local66 = arg7; local66 < local43; local66++) {
					for (local301 = arg2; local301 < local59; local301++) {
						super.aByteArrayArrayArray13[arg8][local66][local301] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLclient!qq;[BII[Lclient!ea;)V")
	public void method4547(@OriginalArg(1) Class28 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class61[] arg4) {
		@Pc(10) Class6_Sub15 local10 = new Class6_Sub15(arg1);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local10.method3083();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(34) int local34 = local10.method3090();
				if (local34 == 0) {
					break;
				}
				local30 += local34 - 1;
				@Pc(49) int local49 = local30 & 0x3F;
				@Pc(55) int local55 = local30 >> 6 & 0x3F;
				@Pc(59) int local59 = local30 >> 12;
				@Pc(63) int local63 = local10.method3111();
				@Pc(67) int local67 = local63 >> 2;
				@Pc(71) int local71 = local63 & 0x3;
				@Pc(76) int local76 = local55 + arg3;
				@Pc(81) int local81 = local49 + arg2;
				if (local76 > 0 && local81 > 0 && local76 < super.anInt5176 - 1 && local81 < super.anInt5178 - 1) {
					@Pc(109) Class61 local109 = null;
					if (!super.aBoolean359) {
						@Pc(114) int local114 = local59;
						if ((Static179.aByteArrayArrayArray3[1][local76][local81] & 0x2) == 2) {
							local114 = local59 - 1;
						}
						if (local114 >= 0) {
							local109 = arg4[local114];
						}
					}
					this.method4542(local67, local76, local59, local109, local18, arg0, local59, -1, local81, local71);
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!qq;Lclient!ha;[IIII)V")
	public void method4548(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class6_Sub15 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean359) {
			return;
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) Class125 local21 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		while (true) {
			@Pc(32) int local32;
			@Pc(82) int local82;
			@Pc(100) int local100;
			@Pc(104) int local104;
			@Pc(522) int local522;
			while (arg1.aByteArray51.length > arg1.anInt3487) {
				local32 = arg1.method3111();
				if (local32 == 0) {
					local21 = new Class125(arg1);
				} else {
					@Pc(159) int local159;
					@Pc(391) int local391;
					@Pc(106) int local106;
					if (local32 == 1) {
						local82 = arg1.method3111();
						if (local82 > 0) {
							for (local522 = 0; local522 < local82; local522++) {
								@Pc(531) Class66 local531 = new Class66(arg0, arg1, 0);
								if (local531.anInt1666 == 31) {
									@Pc(542) Class224 local542 = Static221.aClass72_1.method1667(arg1.method3108());
									local531.method1548(local542.anInt6018, local542.anInt6017, local542.anInt6022, local542.anInt6015);
								}
								if (arg0.method3574() > 0) {
									@Pc(559) Class6_Sub6 local559 = local531.aClass6_Sub6_1;
									local106 = local559.method1163() + (arg4 << 7);
									local159 = local559.method1169() + (arg3 << 7);
									local391 = local106 >> 7;
									@Pc(585) int local585 = local159 >> 7;
									if (local391 >= 0 && local585 >= 0 && super.anInt5176 > local391 && local585 < super.anInt5178) {
										local559.method1171(local159, local106, super.anIntArrayArrayArray6[local531.anInt1662][local391][local585] - local559.method1170());
										if (arg0.method3574() > 0) {
											Static116.method1889(local531);
										}
									}
								}
							}
						}
					} else if (local32 == 2) {
						if (local21 == null) {
							local21 = new Class125();
						}
						local21.method2768(arg1);
					} else if (local32 != 128) {
						if (local32 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray13 == null) {
							super.aByteArrayArrayArray13 = new byte[4][][];
						}
						local19 = true;
						for (local82 = 0; local82 < 4; local82++) {
							@Pc(88) byte local88 = arg1.method3116();
							if (local88 == 0 && super.aByteArrayArrayArray13[local82] != null) {
								local100 = arg4;
								local104 = arg4 + 64;
								local106 = arg3;
								if (local104 < 0) {
									local104 = 0;
								} else if (local104 >= super.anInt5176) {
									local104 = super.anInt5176;
								}
								if (arg4 < 0) {
									local100 = 0;
								} else if (arg4 >= super.anInt5176) {
									local100 = super.anInt5176;
								}
								if (arg3 < 0) {
									local106 = 0;
								} else if (arg3 >= super.anInt5178) {
									local106 = super.anInt5178;
								}
								local159 = arg3 + 64;
								if (local159 < 0) {
									local159 = 0;
								} else if (local159 >= super.anInt5178) {
									local159 = super.anInt5178;
								}
								while (local100 < local104) {
									while (local159 > local106) {
										super.aByteArrayArrayArray13[local82][local100][local106] = 0;
										local106++;
									}
									local100++;
								}
							} else if (local88 == 1) {
								if (super.aByteArrayArrayArray13[local82] == null) {
									super.aByteArrayArrayArray13[local82] = new byte[super.anInt5176 + 1][super.anInt5178 + 1];
								}
								for (local100 = 0; local100 < 64; local100 += 4) {
									for (local104 = 0; local104 < 64; local104 += 4) {
										@Pc(380) byte local380 = arg1.method3116();
										for (local159 = local100 + arg4; local159 < local100 + arg4 + 4; local159++) {
											for (local391 = local104 + arg3; local391 < arg3 + local104 + 4; local391++) {
												if (local159 >= 0 && super.anInt5176 > local159 && local391 >= 0 && super.anInt5178 > local391) {
													super.aByteArrayArrayArray13[local82][local159][local391] = local380;
												}
											}
										}
									}
								}
							} else if (local88 == 2) {
								if (super.aByteArrayArrayArray13[local82] == null) {
									super.aByteArrayArrayArray13[local82] = new byte[super.anInt5176 + 1][super.anInt5178 + 1];
								}
								if (local82 > 0) {
									local100 = arg4;
									local104 = arg4 + 64;
									local106 = arg3;
									if (arg4 < 0) {
										local100 = 0;
									} else if (arg4 >= super.anInt5176) {
										local100 = super.anInt5176;
									}
									if (arg3 < 0) {
										local106 = 0;
									} else if (super.anInt5178 <= arg3) {
										local106 = super.anInt5178;
									}
									if (local104 < 0) {
										local104 = 0;
									} else if (local104 >= super.anInt5176) {
										local104 = super.anInt5176;
									}
									local159 = arg3 + 64;
									if (local159 < 0) {
										local159 = 0;
									} else if (super.anInt5178 <= local159) {
										local159 = super.anInt5178;
									}
									while (local100 < local104) {
										while (local159 > local106) {
											super.aByteArrayArrayArray13[local82][local100][local106] = super.aByteArrayArrayArray13[local82 - 1][local100][local106];
											local106++;
										}
										local100++;
									}
								}
							}
						}
					} else if (arg2 == null) {
						arg1.anInt3487 += 10;
					} else {
						arg2[0] = arg1.method3108();
						arg2[1] = arg1.method3103();
						arg2[2] = arg1.method3103();
						arg2[3] = arg1.method3103();
						arg2[4] = arg1.method3108();
					}
				}
			}
			if (local21 != null) {
				for (local32 = 0; local32 < 8; local32++) {
					for (local82 = 0; local82 < 8; local82++) {
						local522 = (arg4 >> 3) + local32;
						local100 = (arg3 >> 3) + local82;
						if (local522 >= 0 && super.anInt5176 >> 3 > local522 && local100 >= 0 && local100 < super.anInt5178 >> 3) {
							Static90.method1556(local522, local100, local21);
						}
					}
				}
			}
			if (!local19 && super.aByteArrayArrayArray13 != null) {
				for (local32 = 0; local32 < 4; local32++) {
					if (super.aByteArrayArrayArray13[local32] != null) {
						for (local82 = 0; local82 < 16; local82++) {
							for (local522 = 0; local522 < 16; local522++) {
								local100 = (arg4 >> 2) + local82;
								local104 = local522 + (arg3 >> 2);
								if (local100 >= 0 && local100 < 26 && local104 >= 0 && local104 < 26) {
									super.aByteArrayArrayArray13[local32][local100][local104] = 0;
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

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIILclient!ea;Lclient!qq;I)V")
	public void method4550(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class61 arg3, @OriginalArg(5) Class28 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface10 local7 = null;
		if (arg2 == 0) {
			local7 = (Interface10) Static428.method5836(arg5, arg1, arg0);
		}
		if (arg2 == 1) {
			local7 = (Interface10) Static64.method1227(arg5, arg1, arg0);
		}
		if (arg2 == 2) {
			local7 = (Interface10) Static49.method903(arg5, arg1, arg0, tf.class);
		}
		if (arg2 == 3) {
			local7 = (Interface10) Static91.method1566(arg5, arg1, arg0);
		}
		if (local7 == null) {
			return;
		}
		@Pc(67) Class118 local67 = Static113.aClass127_2.method2820(local7.method5812());
		@Pc(71) int local71 = local7.method5807();
		@Pc(75) int local75 = local7.method5811();
		if (local67.method2728()) {
			Static147.method5720(arg5, arg0, arg1, local67);
		}
		if (local7.method5806()) {
			local7.method5809(arg4);
		}
		if (arg2 != 0) {
			if (arg2 == 1) {
				@Pc(251) Class3_Sub4 local251 = Static64.method1227(arg5, arg1, arg0);
				if (local251 instanceof Class3_Sub4_Sub1) {
					((Class3_Sub4_Sub1) local251).aClass3_Sub4_1 = null;
					return;
				}
				Static1.method3(arg5, arg1, arg0);
			} else if (arg2 == 2) {
				@Pc(151) Class3_Sub3 local151 = Static49.method903(arg5, arg1, arg0, tf.class);
				if (local151 instanceof Class3_Sub3_Sub3 && local151.aShort97 == arg1 && arg0 == local151.aShort95) {
					((Class3_Sub3_Sub3) local151).aClass3_Sub3_1 = null;
				} else {
					Static71.method1389(arg5, arg1, arg0, tf.class);
				}
				if (local67.anInt2978 != 0 && super.anInt5176 > local67.anInt2997 + arg1 && super.anInt5178 > arg0 + local67.anInt2997 && super.anInt5176 > local67.anInt3025 + arg1 && super.anInt5178 > local67.anInt3025 + arg0) {
					arg3.method1488(local67.aBoolean214, local67.anInt3025, !local67.aBoolean220, arg0, arg1, local75, local67.anInt2997);
					return;
				}
			} else {
				if (arg2 == 3) {
					@Pc(113) Class3_Sub5 local113 = Static91.method1566(arg5, arg1, arg0);
					if (local113 instanceof Class3_Sub5_Sub3) {
						((Class3_Sub5_Sub3) local113).aClass3_Sub5_2 = null;
					} else {
						Static375.method5204(arg5, arg1, arg0);
					}
					if (local67.anInt2978 == 1) {
						arg3.method1484(arg0, arg1);
						return;
					}
				}
				return;
			}
			return;
		}
		@Pc(269) Class3_Sub1 local269 = Static428.method5836(arg5, arg1, arg0);
		if (local269 instanceof Class3_Sub1_Sub3) {
			((Class3_Sub1_Sub3) local269).aClass3_Sub1_3 = null;
		} else {
			Static246.method3786(arg5, arg1, arg0);
		}
		if (local67.anInt2978 != 0) {
			arg3.method1493(local71, arg1, local75, local67.aBoolean214, arg0, !local67.aBoolean220);
			return;
		}
	}
}
