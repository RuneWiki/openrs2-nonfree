import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "[I")
	public static int[] anIntArray497;

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "Z")
	public static boolean aBoolean601 = false;

	@OriginalMember(owner = "client!vr", name = "I", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_117 = new Class242(26, 15);

	@OriginalMember(owner = "client!vr", name = "O", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_59 = new Class77(8);

	@OriginalMember(owner = "client!vr", name = "P", descriptor = "I")
	public static final int anInt6943 = 1;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "([ILclient!et;[II[I)V")
	public static void method5501(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class11_Sub1_Sub3_Sub1 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) int local13 = arg0[local7];
			@Pc(17) int local17 = arg3[local7];
			@Pc(21) int local21 = arg2[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && local23 < arg1.aClass9Array3.length; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass9Array3[local23] = null;
					} else {
						@Pc(40) Class64 local40 = Static402.aClass37_2.method665(local13);
						@Pc(43) int local43 = local40.anInt1204;
						@Pc(48) Class9 local48 = arg1.aClass9Array3[local23];
						if (local48 != null) {
							if (local13 == local48.anInt104) {
								if (local43 == 0) {
									local48 = arg1.aClass9Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt105 = 0;
									local48.anInt108 = 1;
									local48.anInt109 = 0;
									local48.anInt107 = 0;
									local48.anInt103 = local21;
									Static379.method131(0, arg1.anInt6428, local40, arg1.aByte90, false, arg1.anInt6430);
								} else if (local43 == 2) {
									local48.anInt107 = 0;
								}
							} else if (local40.anInt1199 >= Static402.aClass37_2.method665(local48.anInt104).anInt1199) {
								local48 = arg1.aClass9Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg1.aClass9Array3[local23] = new Class9();
							local48.anInt105 = 0;
							local48.anInt104 = local13;
							local48.anInt103 = local21;
							local48.anInt108 = 1;
							local48.anInt107 = 0;
							local48.anInt109 = 0;
							Static379.method131(0, arg1.anInt6428, local40, arg1.aByte90, false, arg1.anInt6430);
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZI[F)[F")
	public static float[] method5504(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(16) float[] local16 = new float[arg0];
		Static471.method3065(arg1, 0, local16, 0, arg0);
		return local16;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!vs;")
	public static Class1_Sub12 method5508(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class1_Sub12_Sub1");
			@Pc(15) Class1_Sub12 local15 = (Class1_Sub12) local11.getDeclaredConstructor().newInstance();
			local15.method2584(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class1_Sub12_Sub2 local26 = new Class1_Sub12_Sub2();
			local26.method2584(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V")
	public static void method5510(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static252.method3561(null, arg4, arg0, arg1, arg3, -1, arg2);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Z")
	public static boolean method5514() throws IOException {
		if (Static337.aClass110_2 == null) {
			return false;
		}
		@Pc(75) int local75;
		if (Static425.aClass67_257 == null) {
			if (Static70.aBoolean452) {
				if (!Static337.aClass110_2.method3777(1)) {
					return false;
				}
				Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 1);
				Static201.anInt3757++;
				Static417.anInt6744 = 0;
				Static70.aBoolean452 = false;
			}
			Static413.aClass1_Sub19_Sub2_1.anInt3698 = 0;
			if (Static413.aClass1_Sub19_Sub2_1.method2942()) {
				if (!Static337.aClass110_2.method3777(1)) {
					return false;
				}
				Static337.aClass110_2.method3779(1, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 1);
				Static201.anInt3757++;
				Static417.anInt6744 = 0;
			}
			Static70.aBoolean452 = true;
			@Pc(69) Class67[] local69 = Static136.method1743();
			local75 = Static413.aClass1_Sub19_Sub2_1.method2944();
			if (local75 < 0 || local75 >= local69.length) {
				throw new IOException("invo:" + local75 + " ip:" + Static413.aClass1_Sub19_Sub2_1.anInt3698);
			}
			Static425.aClass67_257 = local69[local75];
			Static379.anInt119 = Static425.aClass67_257.anInt1264;
		}
		if (Static379.anInt119 == -1) {
			if (!Static337.aClass110_2.method3777(1)) {
				return false;
			}
			Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 1);
			Static201.anInt3757++;
			Static379.anInt119 = Static413.aClass1_Sub19_Sub2_1.aByteArray38[0] & 0xFF;
			Static417.anInt6744 = 0;
		}
		if (Static379.anInt119 == -2) {
			if (!Static337.aClass110_2.method3777(2)) {
				return false;
			}
			Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 2);
			Static413.aClass1_Sub19_Sub2_1.anInt3698 = 0;
			Static379.anInt119 = Static413.aClass1_Sub19_Sub2_1.method2896();
			Static417.anInt6744 = 0;
			Static201.anInt3757 += 2;
		}
		if (Static379.anInt119 > 0) {
			if (!Static337.aClass110_2.method3777(Static379.anInt119)) {
				return false;
			}
			Static413.aClass1_Sub19_Sub2_1.anInt3698 = 0;
			Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, Static379.anInt119);
			Static417.anInt6744 = 0;
			Static201.anInt3757 += Static379.anInt119;
		}
		Static270.aClass67_88 = Static12.aClass67_8;
		Static12.aClass67_8 = Static153.aClass67_98;
		Static153.aClass67_98 = Static425.aClass67_257;
		@Pc(233) int local233;
		@Pc(212) int local212;
		@Pc(229) int local229;
		if (Static199.aClass67_126 == Static425.aClass67_257) {
			local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
			if (local212 == 65535) {
				local212 = -1;
			}
			local75 = Static413.aClass1_Sub19_Sub2_1.method2915();
			local229 = Static413.aClass1_Sub19_Sub2_1.method2896();
			local233 = Static413.aClass1_Sub19_Sub2_1.method2915();
			Static261.method3637(local75, local212, local233, local229);
			Static425.aClass67_257 = null;
			return true;
		} else if (Static440.aClass67_116 == Static425.aClass67_257) {
			local212 = Static413.aClass1_Sub19_Sub2_1.method2882();
			if (local212 == 65535) {
				local212 = -1;
			}
			local75 = Static413.aClass1_Sub19_Sub2_1.method2891();
			local229 = Static413.aClass1_Sub19_Sub2_1.method2938();
			if (Static192.method2777(local229)) {
				Static177.method2568(local75, local212);
			}
			Static425.aClass67_257 = null;
			return true;
		} else {
			@Pc(303) String local303;
			@Pc(349) String local349;
			@Pc(295) boolean local295;
			@Pc(301) String local301;
			if (Static329.aClass67_207 == Static425.aClass67_257) {
				local295 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
				local301 = Static413.aClass1_Sub19_Sub2_1.method2914();
				local303 = local301;
				if (local295) {
					local303 = Static413.aClass1_Sub19_Sub2_1.method2914();
				}
				local233 = Static413.aClass1_Sub19_Sub2_1.method2915();
				@Pc(315) boolean local315 = false;
				if (local233 <= 1) {
					if (Static10.aBoolean463 && !Static67.aBoolean619 || Static299.aBoolean459) {
						local315 = true;
					} else if (local233 <= 1 && Static227.method3225(local303)) {
						local315 = true;
					}
				}
				if (!local315 && Static305.anInt5076 == 0) {
					local349 = Static169.method4130(Static71.method917(Static413.aClass1_Sub19_Sub2_1));
					if (local233 == 2) {
						Static252.method3561(null, 0, local349, "<img=1>" + local303, 24, -1, "<img=1>" + local301);
					} else if (local233 == 1) {
						Static252.method3561(null, 0, local349, "<img=0>" + local303, 24, -1, "<img=0>" + local301);
					} else {
						Static252.method3561(null, 0, local349, local303, 24, -1, local301);
					}
				}
				Static425.aClass67_257 = null;
				return true;
			} else if (Static342.aClass67_214 == Static425.aClass67_257) {
				local212 = Static413.aClass1_Sub19_Sub2_1.method2928();
				local301 = Static413.aClass1_Sub19_Sub2_1.method2914();
				local229 = Static413.aClass1_Sub19_Sub2_1.method2884();
				local233 = Static413.aClass1_Sub19_Sub2_1.method2882();
				if (local233 == 65535) {
					local233 = -1;
				}
				if (local212 >= 1 && local212 <= 8) {
					if (local301.equalsIgnoreCase("null")) {
						local301 = null;
					}
					Static298.aStringArray36[local212 - 1] = local301;
					Static435.anIntArray455[local212 - 1] = local233;
					Static70.aBooleanArray111[local212 - 1] = local229 == 0;
				}
				Static425.aClass67_257 = null;
				return true;
			} else {
				@Pc(510) int local510;
				@Pc(514) int local514;
				if (Static425.aClass67_257 == Static295.aClass67_180) {
					local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
					local75 = Static413.aClass1_Sub19_Sub2_1.method2915();
					local229 = Static413.aClass1_Sub19_Sub2_1.method2915();
					local233 = Static413.aClass1_Sub19_Sub2_1.method2896() << 0;
					local510 = Static413.aClass1_Sub19_Sub2_1.method2915();
					local514 = Static413.aClass1_Sub19_Sub2_1.method2915();
					if (Static192.method2777(local212)) {
						Static184.method2680(local229, local510, local233, local75, local514);
					}
					Static425.aClass67_257 = null;
					return true;
				} else if (Static62.aClass67_45 == Static425.aClass67_257) {
					local295 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
					@Pc(548) byte[] local548 = new byte[Static379.anInt119 - 1];
					Static413.aClass1_Sub19_Sub2_1.method2937(Static379.anInt119 - 1, local548);
					Static218.method3119(local295, local548);
					Static425.aClass67_257 = null;
					return true;
				} else if (Static464.aClass67_254 == Static425.aClass67_257) {
					local212 = Static413.aClass1_Sub19_Sub2_1.method2877();
					Static90.aClass253_2 = Static259.aClass177_2.method3842(local212);
					Static425.aClass67_257 = null;
					return true;
				} else if (Static319.aClass67_199 == Static425.aClass67_257) {
					Static27.method390(Static443.aClass62_39);
					Static425.aClass67_257 = null;
					return true;
				} else if (Static425.aClass67_257 == Static213.aClass67_136) {
					local212 = Static413.aClass1_Sub19_Sub2_1.method2882();
					local75 = Static413.aClass1_Sub19_Sub2_1.method2882();
					local229 = Static413.aClass1_Sub19_Sub2_1.method2938();
					local233 = Static413.aClass1_Sub19_Sub2_1.method2882();
					local510 = Static413.aClass1_Sub19_Sub2_1.method2903();
					if (Static192.method2777(local75)) {
						Static333.method4385(local510, local229 | local233 << 16, 7, local212);
					}
					Static425.aClass67_257 = null;
					return true;
				} else if (Static229.aClass67_143 == Static425.aClass67_257) {
					if (Static309.method4100(Static135.anInt2114)) {
						Static175.anInt3046 = (int) ((float) Static413.aClass1_Sub19_Sub2_1.method2896() * 2.5F);
					} else {
						Static175.anInt3046 = Static413.aClass1_Sub19_Sub2_1.method2896() * 30;
					}
					Static425.aClass67_257 = null;
					Static356.anInt5794 = Static163.anInt5780;
					return true;
				} else {
					@Pc(727) long local727;
					@Pc(735) Class1_Sub27 local735;
					@Pc(744) Class1_Sub27 local744;
					if (Static396.aClass67_242 == Static425.aClass67_257) {
						local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
						if (local212 == 65535) {
							local212 = -1;
						}
						local75 = Static413.aClass1_Sub19_Sub2_1.method2882();
						local229 = Static413.aClass1_Sub19_Sub2_1.method2900();
						local233 = Static413.aClass1_Sub19_Sub2_1.method2882();
						if (local233 == 65535) {
							local233 = -1;
						}
						local510 = Static413.aClass1_Sub19_Sub2_1.method2938();
						if (Static192.method2777(local510)) {
							for (local514 = local233; local514 <= local212; local514++) {
								local727 = (long) local514 + ((long) local229 << 32);
								local735 = (Class1_Sub27) Static204.aClass208_22.method4405(local727);
								if (local735 != null) {
									local744 = new Class1_Sub27(local735.anInt3891, local75);
									local735.method5953();
								} else if (local514 == -1) {
									local744 = new Class1_Sub27(Static55.method754(local229).aClass1_Sub27_1.anInt3891, local75);
								} else {
									local744 = new Class1_Sub27(0, local75);
								}
								Static204.aClass208_22.method4413(local727, local744);
							}
						}
						Static425.aClass67_257 = null;
						return true;
					} else if (Static425.aClass67_257 == Static364.aClass67_229) {
						Static27.method390(Static209.aClass62_24);
						Static425.aClass67_257 = null;
						return true;
					} else if (Static425.aClass67_257 == Static455.aClass67_275) {
						Static27.method390(Static452.aClass62_40);
						Static425.aClass67_257 = null;
						return true;
					} else if (Static4.aClass67_4 == Static425.aClass67_257) {
						Static27.method390(Static427.aClass62_38);
						Static425.aClass67_257 = null;
						return true;
					} else {
						@Pc(856) int local856;
						@Pc(847) long local847;
						@Pc(852) long local852;
						@Pc(860) int local860;
						@Pc(870) int local870;
						if (Static425.aClass67_257 == Static290.aClass67_176) {
							local295 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
							local301 = Static413.aClass1_Sub19_Sub2_1.method2914();
							local303 = local301;
							if (local295) {
								local303 = Static413.aClass1_Sub19_Sub2_1.method2914();
							}
							local847 = Static413.aClass1_Sub19_Sub2_1.method2896();
							local852 = Static413.aClass1_Sub19_Sub2_1.method2881();
							local856 = Static413.aClass1_Sub19_Sub2_1.method2915();
							local860 = Static413.aClass1_Sub19_Sub2_1.method2896();
							@Pc(866) long local866 = (local847 << 32) + local852;
							@Pc(868) boolean local868 = false;
							local870 = 0;
							while (true) {
								if (local870 >= 100) {
									if (local856 <= 1 && Static227.method3225(local303)) {
										local868 = true;
									}
									break;
								}
								if (local866 == Static390.aLongArray8[local870]) {
									local868 = true;
									break;
								}
								local870++;
							}
							if (!local868 && Static305.anInt5076 == 0) {
								Static390.aLongArray8[Static271.anInt4846] = local866;
								Static271.anInt4846 = (Static271.anInt4846 + 1) % 100;
								@Pc(919) String local919 = Static187.aClass13_2.method198(local860).method2183(Static413.aClass1_Sub19_Sub2_1);
								if (local856 == 2) {
									Static252.method3561(null, 0, local919, "<img=1>" + local303, 18, local860, "<img=1>" + local301);
								} else if (local856 == 1) {
									Static252.method3561(null, 0, local919, "<img=0>" + local303, 18, local860, "<img=0>" + local301);
								} else {
									Static252.method3561(null, 0, local919, local303, 18, local860, local301);
								}
							}
							Static425.aClass67_257 = null;
							return true;
						} else if (Static425.aClass67_257 == Static81.aClass67_54) {
							local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
							local75 = Static413.aClass1_Sub19_Sub2_1.method2915();
							local229 = Static413.aClass1_Sub19_Sub2_1.method2915();
							local233 = Static413.aClass1_Sub19_Sub2_1.method2896() << 0;
							local510 = Static413.aClass1_Sub19_Sub2_1.method2915();
							local514 = Static413.aClass1_Sub19_Sub2_1.method2915();
							if (Static192.method2777(local212)) {
								Static14.method272(local75, local229, true, local233, local510, local514);
							}
							Static425.aClass67_257 = null;
							return true;
						} else {
							@Pc(1036) String local1036;
							if (Static425.aClass67_257 == Static163.aClass67_224) {
								local1036 = Static413.aClass1_Sub19_Sub2_1.method2914();
								local75 = Static413.aClass1_Sub19_Sub2_1.method2896();
								local303 = Static187.aClass13_2.method198(local75).method2183(Static413.aClass1_Sub19_Sub2_1);
								Static252.method3561(null, 0, local303, local1036, 19, local75, local1036);
								Static425.aClass67_257 = null;
								return true;
							} else if (Static235.aClass67_151 == Static425.aClass67_257) {
								Static208.method3014(Static379.anInt119, Static259.aClass177_2, Static413.aClass1_Sub19_Sub2_1);
								Static425.aClass67_257 = null;
								return true;
							} else if (Static228.aClass67_222 == Static425.aClass67_257) {
								local212 = Static413.aClass1_Sub19_Sub2_1.method2900();
								local75 = Static413.aClass1_Sub19_Sub2_1.method2882();
								local229 = Static413.aClass1_Sub19_Sub2_1.method2892();
								if (Static192.method2777(local229)) {
									Static396.method5138(local75, local212);
								}
								Static425.aClass67_257 = null;
								return true;
							} else if (Static425.aClass67_257 == Static174.aClass67_113) {
								local212 = Static413.aClass1_Sub19_Sub2_1.method2915();
								local75 = Static413.aClass1_Sub19_Sub2_1.method2882();
								local229 = Static413.aClass1_Sub19_Sub2_1.method2891();
								if (Static192.method2777(local75)) {
									Static249.method3535(local212, local229);
								}
								Static425.aClass67_257 = null;
								return true;
							} else if (Static441.aClass67_184 == Static425.aClass67_257) {
								local212 = Static413.aClass1_Sub19_Sub2_1.method2900();
								local75 = Static413.aClass1_Sub19_Sub2_1.method2896();
								local229 = Static413.aClass1_Sub19_Sub2_1.method2901();
								if (Static192.method2777(local75)) {
									Static203.method2958(local212, local229);
								}
								Static425.aClass67_257 = null;
								return true;
							} else if (Static425.aClass67_257 == Static170.aClass67_111) {
								Static282.aClass227_5 = Static317.method4197(Static413.aClass1_Sub19_Sub2_1.method2915());
								Static425.aClass67_257 = null;
								return true;
							} else if (Static316.aClass67_197 == Static425.aClass67_257) {
								local212 = Static413.aClass1_Sub19_Sub2_1.method2938();
								local75 = Static413.aClass1_Sub19_Sub2_1.method2928();
								local229 = Static413.aClass1_Sub19_Sub2_1.method2892();
								@Pc(1195) Class1_Sub44 local1195 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local212);
								if (local1195 != null) {
									Static182.method2672(local75, local1195.aClass11_Sub1_Sub3_Sub1_2, local229);
								}
								Static425.aClass67_257 = null;
								return true;
							} else if (Static425.aClass67_257 == Static231.aClass67_147) {
								local212 = Static413.aClass1_Sub19_Sub2_1.method2900();
								local75 = Static413.aClass1_Sub19_Sub2_1.method2877();
								local229 = Static413.aClass1_Sub19_Sub2_1.method2892();
								local233 = Static413.aClass1_Sub19_Sub2_1.method2882();
								if (Static192.method2777(local229)) {
									Static333.method4385(local75, local233, 5, local212);
								}
								Static425.aClass67_257 = null;
								return true;
							} else {
								@Pc(1281) Class1_Sub37 local1281;
								if (Static104.aClass67_69 == Static425.aClass67_257) {
									local212 = Static413.aClass1_Sub19_Sub2_1.method2903();
									local75 = Static413.aClass1_Sub19_Sub2_1.method2892();
									local229 = Static413.aClass1_Sub19_Sub2_1.method2900();
									if (Static192.method2777(local75)) {
										@Pc(1274) Class1_Sub37 local1274 = (Class1_Sub37) Static462.aClass208_42.method4405((long) local229);
										local1281 = (Class1_Sub37) Static462.aClass208_42.method4405((long) local212);
										if (local1281 != null) {
											Static393.method5106(local1281, local1274 == null || local1274.anInt5481 != local1281.anInt5481, false);
										}
										if (local1274 != null) {
											local1274.method5953();
											Static462.aClass208_42.method4413((long) local212, local1274);
										}
										@Pc(1318) Class107 local1318 = Static55.method754(local229);
										if (local1318 != null) {
											Static260.method3633(local1318);
										}
										local1318 = Static55.method754(local212);
										if (local1318 != null) {
											Static260.method3633(local1318);
											Static213.method3088(true, local1318);
										}
										if (Static118.anInt1785 != -1) {
											Static302.method4042(Static118.anInt1785, 1);
										}
									}
									Static425.aClass67_257 = null;
									return true;
								}
								@Pc(1396) int local1396;
								@Pc(1392) int local1392;
								@Pc(1388) long local1388;
								if (Static425.aClass67_257 == Static291.aClass67_177) {
									local295 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
									local301 = Static413.aClass1_Sub19_Sub2_1.method2914();
									local303 = local301;
									if (local295) {
										local303 = Static413.aClass1_Sub19_Sub2_1.method2914();
									}
									local847 = Static413.aClass1_Sub19_Sub2_1.method2909();
									local852 = Static413.aClass1_Sub19_Sub2_1.method2896();
									local1388 = Static413.aClass1_Sub19_Sub2_1.method2881();
									local1392 = Static413.aClass1_Sub19_Sub2_1.method2915();
									local1396 = Static413.aClass1_Sub19_Sub2_1.method2896();
									@Pc(1402) long local1402 = local1388 + (local852 << 32);
									@Pc(1404) boolean local1404 = false;
									@Pc(1406) int local1406 = 0;
									while (true) {
										if (local1406 >= 100) {
											if (local1392 <= 1 && Static227.method3225(local303)) {
												local1404 = true;
											}
											break;
										}
										if (Static390.aLongArray8[local1406] == local1402) {
											local1404 = true;
											break;
										}
										local1406++;
									}
									if (!local1404 && Static305.anInt5076 == 0) {
										Static390.aLongArray8[Static271.anInt4846] = local1402;
										Static271.anInt4846 = (Static271.anInt4846 + 1) % 100;
										@Pc(1460) String local1460 = Static187.aClass13_2.method198(local1396).method2183(Static413.aClass1_Sub19_Sub2_1);
										if (local1392 == 2) {
											Static252.method3561(Static284.method3785(local847), 0, local1460, "<img=1>" + local303, 20, local1396, "<img=1>" + local301);
										} else if (local1392 == 1) {
											Static252.method3561(Static284.method3785(local847), 0, local1460, "<img=0>" + local303, 20, local1396, "<img=0>" + local301);
										} else {
											Static252.method3561(Static284.method3785(local847), 0, local1460, local303, 20, local1396, local301);
										}
									}
									Static425.aClass67_257 = null;
									return true;
								} else if (Static231.aClass67_148 == Static425.aClass67_257) {
									local212 = Static413.aClass1_Sub19_Sub2_1.method2928();
									local75 = Static413.aClass1_Sub19_Sub2_1.method2919();
									if (local212 == 255) {
										local212 = -1;
										local75 = -1;
									}
									Static385.method4964(local212, local75);
									Static425.aClass67_257 = null;
									return true;
								} else if (Static124.aClass67_81 == Static425.aClass67_257) {
									local212 = Static413.aClass1_Sub19_Sub2_1.method2882();
									local75 = Static413.aClass1_Sub19_Sub2_1.method2928();
									if (Static192.method2777(local212)) {
										Static167.anInt2741 = local75;
									}
									Static425.aClass67_257 = null;
									return true;
								} else if (Static20.aClass67_14 == Static425.aClass67_257) {
									local212 = Static413.aClass1_Sub19_Sub2_1.method2882();
									local75 = Static413.aClass1_Sub19_Sub2_1.method2915();
									Static32.aClass4_1.method34(local212, local75);
									Static425.aClass67_257 = null;
									return true;
								} else {
									@Pc(1656) int local1656;
									if (Static420.aClass67_255 == Static425.aClass67_257) {
										local295 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
										local301 = Static413.aClass1_Sub19_Sub2_1.method2914();
										local303 = local301;
										if (local295) {
											local303 = Static413.aClass1_Sub19_Sub2_1.method2914();
										}
										local847 = Static413.aClass1_Sub19_Sub2_1.method2909();
										local852 = Static413.aClass1_Sub19_Sub2_1.method2896();
										local1388 = Static413.aClass1_Sub19_Sub2_1.method2881();
										local1392 = Static413.aClass1_Sub19_Sub2_1.method2915();
										@Pc(1652) long local1652 = local1388 + (local852 << 32);
										@Pc(1654) boolean local1654 = false;
										local1656 = 0;
										while (true) {
											if (local1656 >= 100) {
												if (local1392 <= 1) {
													if (Static10.aBoolean463 && !Static67.aBoolean619 || Static299.aBoolean459) {
														local1654 = true;
													} else if (Static227.method3225(local303)) {
														local1654 = true;
													}
												}
												break;
											}
											if (Static390.aLongArray8[local1656] == local1652) {
												local1654 = true;
												break;
											}
											local1656++;
										}
										if (!local1654 && Static305.anInt5076 == 0) {
											Static390.aLongArray8[Static271.anInt4846] = local1652;
											Static271.anInt4846 = (Static271.anInt4846 + 1) % 100;
											@Pc(1711) String local1711 = Static169.method4130(Static71.method917(Static413.aClass1_Sub19_Sub2_1));
											if (local1392 == 2 || local1392 == 3) {
												Static252.method3561(Static284.method3785(local847), 0, local1711, "<img=1>" + local303, 9, -1, "<img=1>" + local301);
											} else if (local1392 == 1) {
												Static252.method3561(Static284.method3785(local847), 0, local1711, "<img=0>" + local303, 9, -1, "<img=0>" + local301);
											} else {
												Static252.method3561(Static284.method3785(local847), 0, local1711, local303, 9, -1, local301);
											}
										}
										Static425.aClass67_257 = null;
										return true;
									}
									@Pc(1823) String local1823;
									@Pc(1837) int local1837;
									@Pc(1813) String local1813;
									if (Static425.aClass67_257 == Static62.aClass67_46) {
										local212 = Static413.aClass1_Sub19_Sub2_1.method2915();
										@Pc(1805) boolean local1805 = (local212 & 0x1) == 1;
										local303 = Static413.aClass1_Sub19_Sub2_1.method2914();
										local1813 = Static413.aClass1_Sub19_Sub2_1.method2914();
										if (local1813.equals("")) {
											local1813 = local303;
										}
										local1823 = Static413.aClass1_Sub19_Sub2_1.method2914();
										local349 = Static413.aClass1_Sub19_Sub2_1.method2914();
										if (local349.equals("")) {
											local349 = local1823;
										}
										if (local1805) {
											for (local1837 = 0; local1837 < Static316.anInt5221; local1837++) {
												if (Static273.aStringArray35[local1837].equals(local349)) {
													Static167.aStringArray18[local1837] = local303;
													Static273.aStringArray35[local1837] = local1813;
													Static100.aStringArray9[local1837] = local1823;
													Static332.aStringArray44[local1837] = local349;
													break;
												}
											}
										} else {
											Static167.aStringArray18[Static316.anInt5221] = local303;
											Static273.aStringArray35[Static316.anInt5221] = local1813;
											Static100.aStringArray9[Static316.anInt5221] = local1823;
											Static332.aStringArray44[Static316.anInt5221] = local349;
											Static185.aBooleanArray71[Static316.anInt5221] = (local212 & 0x2) == 2;
											Static316.anInt5221++;
										}
										Static425.aClass67_257 = null;
										Static75.anInt1071 = Static163.anInt5780;
										return true;
									} else if (Static425.aClass67_257 == Class1_Sub29.aClass67_273) {
										local212 = Static413.aClass1_Sub19_Sub2_1.method2915();
										if (Static413.aClass1_Sub19_Sub2_1.method2915() == 0) {
											Static269.aClass244Array1[local212] = new Class244();
										} else {
											Static413.aClass1_Sub19_Sub2_1.anInt3698--;
											Static269.aClass244Array1[local212] = new Class244(Static413.aClass1_Sub19_Sub2_1);
										}
										Static425.aClass67_257 = null;
										Static374.anInt6020 = Static163.anInt5780;
										return true;
									} else {
										@Pc(1959) byte local1959;
										if (Static425.aClass67_257 == Static125.aClass67_83) {
											local212 = Static413.aClass1_Sub19_Sub2_1.method2938();
											local1959 = Static413.aClass1_Sub19_Sub2_1.method2917();
											local229 = Static413.aClass1_Sub19_Sub2_1.method2892();
											if (Static192.method2777(local229)) {
												Static304.method735(local212, local1959);
											}
											Static425.aClass67_257 = null;
											return true;
										} else if (Static425.aClass67_257 == Static285.aClass67_171) {
											Static27.method390(Static308.aClass62_31);
											Static425.aClass67_257 = null;
											return true;
										} else if (Static425.aClass67_257 == Static404.aClass67_246) {
											local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
											local75 = Static413.aClass1_Sub19_Sub2_1.method2896();
											local229 = Static413.aClass1_Sub19_Sub2_1.method2896();
											local233 = Static413.aClass1_Sub19_Sub2_1.method2896();
											if (Static192.method2777(local212) && Static45.aClass107ArrayArray1[local75] != null) {
												for (local510 = local229; local510 < local233; local510++) {
													local514 = Static413.aClass1_Sub19_Sub2_1.method2881();
													if (Static45.aClass107ArrayArray1[local75].length > local510 && Static45.aClass107ArrayArray1[local75][local510] != null) {
														Static45.aClass107ArrayArray1[local75][local510].anInt2657 = local514;
													}
												}
											}
											Static425.aClass67_257 = null;
											return true;
										} else if (Static232.aClass67_149 == Static425.aClass67_257) {
											local212 = Static413.aClass1_Sub19_Sub2_1.method2900();
											local75 = Static413.aClass1_Sub19_Sub2_1.method2892();
											Static32.aClass4_1.method38(local75, local212);
											Static425.aClass67_257 = null;
											return true;
										} else if (Static341.aClass67_212 == Static425.aClass67_257) {
											local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
											local75 = Static413.aClass1_Sub19_Sub2_1.method2915();
											local229 = Static413.aClass1_Sub19_Sub2_1.method2915();
											local233 = Static413.aClass1_Sub19_Sub2_1.method2915();
											local510 = Static413.aClass1_Sub19_Sub2_1.method2915();
											local514 = Static413.aClass1_Sub19_Sub2_1.method2896();
											if (Static192.method2777(local212)) {
												Static269.aBooleanArray106[local75] = true;
												Static364.anIntArray446[local75] = local229;
												Static301.anIntArray379[local75] = local233;
												Static250.anIntArray330[local75] = local510;
												Static215.anIntArray71[local75] = local514;
											}
											Static425.aClass67_257 = null;
											return true;
										} else if (Static270.aClass67_87 == Static425.aClass67_257) {
											if (Static118.anInt1785 != -1) {
												Static302.method4042(Static118.anInt1785, 0);
											}
											Static425.aClass67_257 = null;
											return true;
										} else if (Static81.aClass67_55 == Static425.aClass67_257) {
											Static27.method390(Static169.aClass62_32);
											Static425.aClass67_257 = null;
											return true;
										} else if (Static425.aClass67_257 == Static135.aClass67_93) {
											Static32.aClass4_1.method32();
											Static46.anInt5440 += 32;
											Static425.aClass67_257 = null;
											return true;
										} else if (Static412.aClass67_250 == Static425.aClass67_257) {
											Static246.anInt4399 = Static413.aClass1_Sub19_Sub2_1.method2904();
											Static10.aBoolean463 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
											Static425.aClass67_257 = null;
											return true;
										} else if (Static425.aClass67_257 == Static52.aClass67_39) {
											local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
											if (local212 == 65535) {
												local212 = -1;
											}
											local75 = Static413.aClass1_Sub19_Sub2_1.method2915();
											local229 = Static413.aClass1_Sub19_Sub2_1.method2896();
											local233 = Static413.aClass1_Sub19_Sub2_1.method2915();
											Static318.method4199(local229, local212, local75, local233);
											Static425.aClass67_257 = null;
											return true;
										} else if (Static395.aClass67_241 == Static425.aClass67_257) {
											Static316.anInt5221 = Static413.aClass1_Sub19_Sub2_1.method2915();
											for (local212 = 0; local212 < Static316.anInt5221; local212++) {
												Static167.aStringArray18[local212] = Static413.aClass1_Sub19_Sub2_1.method2914();
												Static273.aStringArray35[local212] = Static413.aClass1_Sub19_Sub2_1.method2914();
												if (Static273.aStringArray35[local212].equals("")) {
													Static273.aStringArray35[local212] = Static167.aStringArray18[local212];
												}
												Static100.aStringArray9[local212] = Static413.aClass1_Sub19_Sub2_1.method2914();
												Static332.aStringArray44[local212] = Static413.aClass1_Sub19_Sub2_1.method2914();
												if (Static332.aStringArray44[local212].equals("")) {
													Static332.aStringArray44[local212] = Static100.aStringArray9[local212];
												}
												Static185.aBooleanArray71[local212] = false;
											}
											Static425.aClass67_257 = null;
											Static75.anInt1071 = Static163.anInt5780;
											return true;
										} else if (Static300.aClass67_189 == Static425.aClass67_257) {
											local212 = Static413.aClass1_Sub19_Sub2_1.method2938();
											local75 = Static413.aClass1_Sub19_Sub2_1.method2882();
											local303 = Static413.aClass1_Sub19_Sub2_1.method2914();
											if (Static192.method2777(local75)) {
												Static233.method3333(local303, local212);
											}
											Static425.aClass67_257 = null;
											return true;
										} else if (Static425.aClass67_257 == Static44.aClass67_35) {
											local212 = Static413.aClass1_Sub19_Sub2_1.method2903();
											local75 = Static413.aClass1_Sub19_Sub2_1.method2901();
											local229 = Static413.aClass1_Sub19_Sub2_1.method2929();
											local233 = Static413.aClass1_Sub19_Sub2_1.method2892();
											if (Static192.method2777(local233)) {
												Static406.method5232(local75, local212, local229);
											}
											Static425.aClass67_257 = null;
											return true;
										} else {
											@Pc(2387) boolean local2387;
											if (Static425.aClass67_257 == Static81.aClass67_56) {
												local212 = Static413.aClass1_Sub19_Sub2_1.method2892();
												local75 = Static413.aClass1_Sub19_Sub2_1.method2884();
												local2387 = (local75 & 0x1) == 1;
												Static243.method3492(local212, local2387);
												Static305.anIntArray380[Static210.anInt7228++ & 0x1F] = local212;
												Static425.aClass67_257 = null;
												return true;
											} else if (Static382.aClass67_187 == Static425.aClass67_257) {
												local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
												if (Static192.method2777(local212)) {
													Static37.method496();
												}
												Static425.aClass67_257 = null;
												return true;
											} else if (Static425.aClass67_257 == Static459.aClass67_277) {
												local212 = Static413.aClass1_Sub19_Sub2_1.method2928();
												local75 = Static413.aClass1_Sub19_Sub2_1.method2903();
												local229 = Static413.aClass1_Sub19_Sub2_1.method2884();
												Static402.anIntArray468[local229] = local75;
												Static377.anIntArray456[local229] = local212;
												Static426.anIntArray487[local229] = 1;
												local233 = Static230.anIntArray296[local229] - 1;
												for (local510 = 0; local510 < local233; local510++) {
													if (local75 >= Class20.anIntArray313[local510]) {
														Static426.anIntArray487[local229] = local510 + 2;
													}
												}
												Static395.anIntArray463[Static50.anInt722++ & 0x1F] = local229;
												Static425.aClass67_257 = null;
												return true;
											} else if (Static39.aClass67_29 == Static425.aClass67_257) {
												local212 = Static413.aClass1_Sub19_Sub2_1.method2903();
												local75 = Static413.aClass1_Sub19_Sub2_1.method2938();
												local229 = Static413.aClass1_Sub19_Sub2_1.method2896();
												if (local229 == 65535) {
													local229 = -1;
												}
												if (Static192.method2777(local75)) {
													Static333.method4385(local212, local229, 2, -1);
												}
												Static425.aClass67_257 = null;
												return true;
											} else if (Static425.aClass67_257 == Static379.aClass67_7) {
												Static176.method2566(Static379.anInt119, Static413.aClass1_Sub19_Sub2_1);
												Static425.aClass67_257 = null;
												return true;
											} else if (Static182.aClass67_119 == Static425.aClass67_257) {
												local212 = Static413.aClass1_Sub19_Sub2_1.method2891();
												local75 = Static413.aClass1_Sub19_Sub2_1.method2882();
												if (local75 == 65535) {
													local75 = -1;
												}
												local229 = Static413.aClass1_Sub19_Sub2_1.method2892();
												if (Static192.method2777(local229)) {
													Static333.method4385(local212, local75, 1, -1);
												}
												Static425.aClass67_257 = null;
												return true;
											} else {
												@Pc(2762) boolean local2762;
												@Pc(2785) Class180 local2785;
												if (Static425.aClass67_257 == Static50.aClass67_37) {
													Static386.anInt7154 = Static163.anInt5780;
													if (Static379.anInt119 == 0) {
														Static126.aClass180Array1 = null;
														Static362.anInt5836 = 0;
														Static425.aClass67_257 = null;
														Static163.aString61 = null;
														Static196.aString38 = null;
														return true;
													}
													Static163.aString61 = Static413.aClass1_Sub19_Sub2_1.method2914();
													local295 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
													if (local295) {
														Static413.aClass1_Sub19_Sub2_1.method2914();
													}
													@Pc(2628) long local2628 = Static413.aClass1_Sub19_Sub2_1.method2909();
													Static196.aString38 = Static396.method5137(local2628);
													Static75.aByte21 = Static413.aClass1_Sub19_Sub2_1.method2917();
													local233 = Static413.aClass1_Sub19_Sub2_1.method2915();
													if (local233 == 255) {
														Static425.aClass67_257 = null;
														return true;
													}
													Static362.anInt5836 = local233;
													@Pc(2652) Class180[] local2652 = new Class180[100];
													for (local514 = 0; local514 < Static362.anInt5836; local514++) {
														local2652[local514] = new Class180();
														local2652[local514].aString58 = Static413.aClass1_Sub19_Sub2_1.method2914();
														local295 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
														if (local295) {
															local2652[local514].aString56 = Static413.aClass1_Sub19_Sub2_1.method2914();
														} else {
															local2652[local514].aString56 = local2652[local514].aString58;
														}
														local2652[local514].aString55 = Static91.method1066(local2652[local514].aString56);
														local2652[local514].anInt4899 = Static413.aClass1_Sub19_Sub2_1.method2896();
														local2652[local514].aByte71 = Static413.aClass1_Sub19_Sub2_1.method2917();
														local2652[local514].aString57 = Static413.aClass1_Sub19_Sub2_1.method2914();
														if (local2652[local514].aString56.equals(Static94.aClass11_Sub1_Sub3_Sub2_1.aString32)) {
															Static14.aByte6 = local2652[local514].aByte71;
														}
													}
													local860 = Static362.anInt5836;
													while (local860 > 0) {
														local860--;
														local2762 = true;
														for (local1392 = 0; local1392 < local860; local1392++) {
															if (local2652[local1392].aString55.compareTo(local2652[local1392 + 1].aString55) > 0) {
																local2785 = local2652[local1392];
																local2652[local1392] = local2652[local1392 + 1];
																local2762 = false;
																local2652[local1392 + 1] = local2785;
															}
														}
														if (local2762) {
															break;
														}
													}
													Static126.aClass180Array1 = local2652;
													Static425.aClass67_257 = null;
													return true;
												} else if (Static206.aClass67_132 == Static425.aClass67_257) {
													local212 = Static413.aClass1_Sub19_Sub2_1.method2919();
													local75 = Static413.aClass1_Sub19_Sub2_1.method2882();
													local229 = Static413.aClass1_Sub19_Sub2_1.method2892();
													if (Static192.method2777(local75)) {
														if (local212 == 2) {
															Static278.method4442();
														}
														Static118.anInt1785 = local229;
														Static327.method4301(local229);
														Static428.method5437(false);
														Static198.method2835(Static118.anInt1785);
														for (local233 = 0; local233 < 100; local233++) {
															Static179.aBooleanArray69[local233] = true;
														}
													}
													Static425.aClass67_257 = null;
													return true;
												} else if (Static425.aClass67_257 == Static189.aClass67_122) {
													Static260.method3634();
													Static425.aClass67_257 = null;
													return false;
												} else if (Static231.aClass67_146 == Static425.aClass67_257) {
													local1036 = Static413.aClass1_Sub19_Sub2_1.method2914();
													local75 = Static413.aClass1_Sub19_Sub2_1.method2896();
													local229 = Static413.aClass1_Sub19_Sub2_1.method2900();
													if (Static192.method2777(local75)) {
														Static51.method684(local1036, local229);
													}
													Static425.aClass67_257 = null;
													return true;
												} else if (Static281.aClass67_170 == Static425.aClass67_257) {
													local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
													local75 = Static413.aClass1_Sub19_Sub2_1.method2877();
													if (Static192.method2777(local212)) {
														@Pc(2931) Class1_Sub37 local2931 = (Class1_Sub37) Static462.aClass208_42.method4405((long) local75);
														if (local2931 != null) {
															Static393.method5106(local2931, true, false);
														}
														if (Static414.aClass107_15 != null) {
															Static260.method3633(Static414.aClass107_15);
															Static414.aClass107_15 = null;
														}
													}
													Static425.aClass67_257 = null;
													return true;
												} else if (Static425.aClass67_257 == Static448.aClass67_268) {
													local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
													local75 = Static413.aClass1_Sub19_Sub2_1.method2915();
													local2387 = (local75 & 0x1) == 1;
													Static87.method1048(local2387, local212);
													local233 = Static413.aClass1_Sub19_Sub2_1.method2896();
													for (local510 = 0; local510 < local233; local510++) {
														local514 = Static413.aClass1_Sub19_Sub2_1.method2915();
														if (local514 == 255) {
															local514 = Static413.aClass1_Sub19_Sub2_1.method2900();
														}
														local1837 = Static413.aClass1_Sub19_Sub2_1.method2892();
														Static263.method3652(local2387, local514, local510, local1837 - 1, local212);
													}
													Static305.anIntArray380[Static210.anInt7228++ & 0x1F] = local212;
													Static425.aClass67_257 = null;
													return true;
												} else if (Static425.aClass67_257 == Static5.aClass67_5) {
													local212 = Static413.aClass1_Sub19_Sub2_1.method2883();
													local75 = Static413.aClass1_Sub19_Sub2_1.method2877();
													local229 = Static413.aClass1_Sub19_Sub2_1.method2915();
													local1813 = "";
													local1823 = local1813;
													if ((local229 & 0x1) != 0) {
														local1813 = Static413.aClass1_Sub19_Sub2_1.method2914();
														if ((local229 & 0x2) == 0) {
															local1823 = local1813;
														} else {
															local1823 = Static413.aClass1_Sub19_Sub2_1.method2914();
														}
													}
													local349 = Static413.aClass1_Sub19_Sub2_1.method2914();
													if (local212 == 99) {
														Static246.method3501(local349);
													} else if (local1823.equals("") || !Static227.method3225(local1823)) {
														method5510(local349, local1823, local1813, local212, local75);
													} else {
														Static425.aClass67_257 = null;
														return true;
													}
													Static425.aClass67_257 = null;
													return true;
												} else if (Static414.aClass67_251 == Static425.aClass67_257) {
													Static299.method3987();
													Static425.aClass67_257 = null;
													return true;
												} else {
													@Pc(3154) boolean local3154;
													@Pc(3178) String local3178;
													if (Static13.aClass67_10 == Static425.aClass67_257) {
														local295 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
														local301 = Static413.aClass1_Sub19_Sub2_1.method2914();
														local303 = local301;
														if (local295) {
															local303 = Static413.aClass1_Sub19_Sub2_1.method2914();
														}
														local233 = Static413.aClass1_Sub19_Sub2_1.method2915();
														local510 = Static413.aClass1_Sub19_Sub2_1.method2896();
														local3154 = false;
														if (local233 <= 1 && Static227.method3225(local303)) {
															local3154 = true;
														}
														if (!local3154 && Static305.anInt5076 == 0) {
															local3178 = Static187.aClass13_2.method198(local510).method2183(Static413.aClass1_Sub19_Sub2_1);
															if (local233 == 2) {
																Static252.method3561(null, 0, local3178, "<img=1>" + local303, 25, local510, "<img=1>" + local301);
															} else if (local233 == 1) {
																Static252.method3561(null, 0, local3178, "<img=0>" + local303, 25, local510, "<img=0>" + local301);
															} else {
																Static252.method3561(null, 0, local3178, local303, 25, local510, local301);
															}
														}
														Static425.aClass67_257 = null;
														return true;
													} else if (Static461.aClass67_280 == Static425.aClass67_257) {
														local212 = Static413.aClass1_Sub19_Sub2_1.method2892();
														local75 = Static413.aClass1_Sub19_Sub2_1.method2900();
														local229 = Static413.aClass1_Sub19_Sub2_1.method2938();
														local233 = Static413.aClass1_Sub19_Sub2_1.method2938();
														local510 = Static413.aClass1_Sub19_Sub2_1.method2896();
														if (Static192.method2777(local510)) {
															Static109.method1377(local229, local233, local75, local212);
														}
														Static425.aClass67_257 = null;
														return true;
													} else if (Static28.aClass67_24 == Static425.aClass67_257) {
														Static27.method390(Static229.aClass62_27);
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static199.aClass67_125) {
														Static100.anInt1341 = Static413.aClass1_Sub19_Sub2_1.method2915();
														Static356.anInt5794 = Static163.anInt5780;
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static332.aClass67_209) {
														Static27.method390(Static201.aClass62_22);
														Static425.aClass67_257 = null;
														return true;
													} else if (Static437.aClass67_263 == Static425.aClass67_257) {
														local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
														local75 = Static413.aClass1_Sub19_Sub2_1.method2915();
														local2387 = (local75 & 0x1) == 1;
														while (Static413.aClass1_Sub19_Sub2_1.anInt3698 < Static379.anInt119) {
															local233 = Static413.aClass1_Sub19_Sub2_1.method2883();
															local510 = Static413.aClass1_Sub19_Sub2_1.method2896();
															local514 = 0;
															if (local510 != 0) {
																local514 = Static413.aClass1_Sub19_Sub2_1.method2915();
																if (local514 == 255) {
																	local514 = Static413.aClass1_Sub19_Sub2_1.method2877();
																}
															}
															Static263.method3652(local2387, local514, local233, local510 - 1, local212);
														}
														Static305.anIntArray380[Static210.anInt7228++ & 0x1F] = local212;
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static87.aClass67_62) {
														local212 = Static413.aClass1_Sub19_Sub2_1.method2903();
														local75 = Static413.aClass1_Sub19_Sub2_1.method2938();
														local229 = Static413.aClass1_Sub19_Sub2_1.method2882();
														if (Static192.method2777(local229)) {
															Static394.method5132(local75, local212);
														}
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static360.aClass67_226) {
														Static416.method5320(true);
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static427.aClass67_258) {
														Static425.aClass67_257 = null;
														return false;
													} else if (Static166.aClass67_106 == Static425.aClass67_257) {
														local212 = Static413.aClass1_Sub19_Sub2_1.method2900();
														local75 = Static413.aClass1_Sub19_Sub2_1.method2882();
														Static32.aClass4_1.method34(local75, local212);
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static293.aClass67_179) {
														local212 = Static413.aClass1_Sub19_Sub2_1.method2892();
														local75 = Static413.aClass1_Sub19_Sub2_1.method2896();
														local229 = Static413.aClass1_Sub19_Sub2_1.method2896();
														if (Static192.method2777(local75)) {
															Static406.method5230(local212, local229);
														}
														Static425.aClass67_257 = null;
														return true;
													} else if (Static368.aClass67_265 == Static425.aClass67_257) {
														Static124.method1519(false);
														Static425.aClass67_257 = null;
														return false;
													} else if (Static171.aClass67_112 == Static425.aClass67_257) {
														Static27.method390(Static132.aClass62_37);
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static454.aClass67_274) {
														Static27.method390(Static233.aClass62_28);
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static20.aClass67_13) {
														Static416.method5320(false);
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static352.aClass67_221) {
														local212 = Static413.aClass1_Sub19_Sub2_1.method2892();
														local75 = Static413.aClass1_Sub19_Sub2_1.method2877();
														if (Static192.method2777(local212)) {
															Static333.method4385(local75, -1, 3, -1);
														}
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static288.aClass67_174) {
														local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
														if (Static192.method2777(local212)) {
															Static178.method2586();
														}
														Static425.aClass67_257 = null;
														return true;
													} else if (Static247.aClass67_164 == Static425.aClass67_257) {
														local1036 = Static413.aClass1_Sub19_Sub2_1.method2914();
														local75 = Static413.aClass1_Sub19_Sub2_1.method2892();
														local229 = Static413.aClass1_Sub19_Sub2_1.method2896();
														if (Static192.method2777(local229)) {
															Static233.method3333(local1036, local75);
														}
														Static425.aClass67_257 = null;
														return true;
													} else if (Static96.aClass67_65 == Static425.aClass67_257) {
														local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
														local75 = Static413.aClass1_Sub19_Sub2_1.method2877();
														local229 = Static413.aClass1_Sub19_Sub2_1.method2891();
														local233 = Static413.aClass1_Sub19_Sub2_1.method2882();
														if (local233 == 65535) {
															local233 = -1;
														}
														local510 = Static413.aClass1_Sub19_Sub2_1.method2892();
														if (local510 == 65535) {
															local510 = -1;
														}
														if (Static192.method2777(local212)) {
															for (local514 = local233; local514 <= local510; local514++) {
																local727 = ((long) local229 << 32) + (long) local514;
																local735 = (Class1_Sub27) Static204.aClass208_22.method4405(local727);
																if (local735 != null) {
																	local744 = new Class1_Sub27(local75, local735.anInt3884);
																	local735.method5953();
																} else if (local514 == -1) {
																	local744 = new Class1_Sub27(local75, Static55.method754(local229).aClass1_Sub27_1.anInt3884);
																} else {
																	local744 = new Class1_Sub27(local75, -1);
																}
																Static204.aClass208_22.method4413(local727, local744);
															}
														}
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static67.aClass67_267) {
														Static75.anInt1071 = Static163.anInt5780;
														Static94.anInt1261 = 1;
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static169.aClass67_194) {
														Static61.anInt7291 = Static413.aClass1_Sub19_Sub2_1.method2915();
														Static425.aClass67_257 = null;
														return true;
													} else if (Static65.aClass67_48 == Static425.aClass67_257) {
														local212 = Static413.aClass1_Sub19_Sub2_1.method2891();
														local75 = Static413.aClass1_Sub19_Sub2_1.method2896();
														if (Static192.method2777(local75)) {
															Static333.method4385(local212, Static220.anInt4038, 5, 0);
														}
														Static425.aClass67_257 = null;
														return true;
													} else if (Static235.aClass67_152 == Static425.aClass67_257) {
														local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
														local301 = Static413.aClass1_Sub19_Sub2_1.method2914();
														@Pc(3781) Object[] local3781 = new Object[local301.length() + 1];
														for (local233 = local301.length() - 1; local233 >= 0; local233--) {
															if (local301.charAt(local233) == 's') {
																local3781[local233 + 1] = Static413.aClass1_Sub19_Sub2_1.method2914();
															} else {
																local3781[local233 + 1] = Integer.valueOf(Static413.aClass1_Sub19_Sub2_1.method2877());
															}
														}
														local3781[0] = Integer.valueOf(Static413.aClass1_Sub19_Sub2_1.method2877());
														if (Static192.method2777(local212)) {
															@Pc(3836) Class1_Sub11 local3836 = new Class1_Sub11();
															local3836.anObjectArray2 = local3781;
															Static198.method2834(local3836);
														}
														Static425.aClass67_257 = null;
														return true;
													} else if (Static425.aClass67_257 == Static292.aClass67_178) {
														local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
														local75 = Static413.aClass1_Sub19_Sub2_1.method2891();
														local229 = Static413.aClass1_Sub19_Sub2_1.method2892();
														if (Static192.method2777(local212)) {
															Static20.method309(local75, local229);
														}
														Static425.aClass67_257 = null;
														return true;
													} else if (Static216.aClass67_137 == Static425.aClass67_257) {
														local212 = Static413.aClass1_Sub19_Sub2_1.method2915();
														local75 = local212 >> 5;
														local229 = local212 & 0x1F;
														if (local229 == 0) {
															Static13.aClass78Array1[local75] = null;
															Static425.aClass67_257 = null;
															return true;
														}
														@Pc(3901) Class78 local3901 = new Class78();
														local3901.anInt1697 = local229;
														local3901.anInt1701 = Static413.aClass1_Sub19_Sub2_1.method2915();
														if (local3901.anInt1701 >= 0 && Static277.aClass85Array9.length > local3901.anInt1701) {
															if (local3901.anInt1697 == 1 || local3901.anInt1697 == 10) {
																local3901.anInt1704 = Static413.aClass1_Sub19_Sub2_1.method2896();
																Static413.aClass1_Sub19_Sub2_1.anInt3698 += 6;
															} else if (local3901.anInt1697 >= 2 && local3901.anInt1697 <= 6) {
																if (local3901.anInt1697 == 2) {
																	local3901.anInt1700 = 64;
																	local3901.anInt1703 = 64;
																}
																if (local3901.anInt1697 == 3) {
																	local3901.anInt1700 = 64;
																	local3901.anInt1703 = 0;
																}
																if (local3901.anInt1697 == 4) {
																	local3901.anInt1700 = 64;
																	local3901.anInt1703 = 128;
																}
																if (local3901.anInt1697 == 5) {
																	local3901.anInt1700 = 0;
																	local3901.anInt1703 = 64;
																}
																if (local3901.anInt1697 == 6) {
																	local3901.anInt1700 = 128;
																	local3901.anInt1703 = 64;
																}
																local3901.anInt1697 = 2;
																local3901.anInt1702 = Static413.aClass1_Sub19_Sub2_1.method2915();
																local3901.anInt1703 += Static413.aClass1_Sub19_Sub2_1.method2896() - Static315.anInt5207 << 7;
																local3901.anInt1700 += Static413.aClass1_Sub19_Sub2_1.method2896() - Static47.anInt676 << 7;
																local3901.anInt1698 = Static413.aClass1_Sub19_Sub2_1.method2915() << 0;
																local3901.anInt1705 = Static413.aClass1_Sub19_Sub2_1.method2896();
															}
															local3901.anInt1707 = Static413.aClass1_Sub19_Sub2_1.method2896();
															if (local3901.anInt1707 == 65535) {
																local3901.anInt1707 = -1;
															}
															Static13.aClass78Array1[local75] = local3901;
														}
														Static425.aClass67_257 = null;
														return true;
													} else {
														@Pc(4127) int local4127;
														if (Static130.aClass67_91 == Static425.aClass67_257) {
															local295 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
															local301 = Static413.aClass1_Sub19_Sub2_1.method2914();
															local303 = local301;
															if (local295) {
																local303 = Static413.aClass1_Sub19_Sub2_1.method2914();
															}
															local847 = Static413.aClass1_Sub19_Sub2_1.method2896();
															local852 = Static413.aClass1_Sub19_Sub2_1.method2881();
															local856 = Static413.aClass1_Sub19_Sub2_1.method2915();
															@Pc(4123) long local4123 = local852 + (local847 << 32);
															@Pc(4125) boolean local4125 = false;
															local4127 = 0;
															while (true) {
																if (local4127 >= 100) {
																	if (local856 <= 1) {
																		if (Static10.aBoolean463 && !Static67.aBoolean619 || Static299.aBoolean459) {
																			local4125 = true;
																		} else if (Static227.method3225(local303)) {
																			local4125 = true;
																		}
																	}
																	break;
																}
																if (Static390.aLongArray8[local4127] == local4123) {
																	local4125 = true;
																	break;
																}
																local4127++;
															}
															if (!local4125 && Static305.anInt5076 == 0) {
																Static390.aLongArray8[Static271.anInt4846] = local4123;
																Static271.anInt4846 = (Static271.anInt4846 + 1) % 100;
																@Pc(4186) String local4186 = Static169.method4130(Static71.method917(Static413.aClass1_Sub19_Sub2_1));
																if (local856 == 2) {
																	Static252.method3561(null, 0, local4186, "<img=1>" + local303, 7, -1, "<img=1>" + local301);
																} else if (local856 == 1) {
																	Static252.method3561(null, 0, local4186, "<img=0>" + local303, 7, -1, "<img=0>" + local301);
																} else {
																	Static252.method3561(null, 0, local4186, local303, 3, -1, local301);
																}
															}
															Static425.aClass67_257 = null;
															return true;
														} else if (Static243.aClass67_161 == Static425.aClass67_257) {
															local212 = Static413.aClass1_Sub19_Sub2_1.method2882();
															local1959 = Static413.aClass1_Sub19_Sub2_1.method2910();
															Static32.aClass4_1.method38(local212, local1959);
															Static425.aClass67_257 = null;
															return true;
														} else if (Static76.aClass67_51 == Static425.aClass67_257) {
															local212 = Static413.aClass1_Sub19_Sub2_1.method2891();
															local75 = Static413.aClass1_Sub19_Sub2_1.method2896();
															local229 = Static413.aClass1_Sub19_Sub2_1.method2896();
															if (local229 == 65535) {
																local229 = -1;
															}
															local233 = Static413.aClass1_Sub19_Sub2_1.method2903();
															if (Static192.method2777(local75)) {
																Static210.method5856(local212, local233, local229);
																@Pc(4315) Class135 local4315 = Static285.aClass226_2.method4788(local229);
																Static109.method1377(local4315.anInt3815, local4315.anInt3833, local233, local4315.anInt3839);
																Static261.method3636(local4315.anInt3857, local4315.anInt3865, local233, local4315.anInt3862);
															}
															Static425.aClass67_257 = null;
															return true;
														} else if (Static3.aClass67_3 == Static425.aClass67_257) {
															Static124.method1519(Static297.aBoolean453);
															Static425.aClass67_257 = null;
															return false;
														} else if (Static425.aClass67_257 == Static59.aClass67_44) {
															Static27.method390(Static145.aClass62_16);
															Static425.aClass67_257 = null;
															return true;
														} else if (Static229.aClass67_144 == Static425.aClass67_257) {
															local212 = Static413.aClass1_Sub19_Sub2_1.method2938();
															if (local212 == 65535) {
																local212 = -1;
															}
															local75 = Static413.aClass1_Sub19_Sub2_1.method2915();
															local229 = Static413.aClass1_Sub19_Sub2_1.method2915();
															Static345.method4490(local75, local212, local229);
															Static425.aClass67_257 = null;
															return true;
														} else if (Static425.aClass67_257 == Static306.aClass67_190) {
															local212 = Static413.aClass1_Sub19_Sub2_1.method2938();
															if (local212 == 65535) {
																local212 = -1;
															}
															local75 = Static413.aClass1_Sub19_Sub2_1.method2920();
															local229 = Static413.aClass1_Sub19_Sub2_1.method2919();
															Static27.method394(local212, local229, local75);
															Static425.aClass67_257 = null;
															return true;
														} else if (Static425.aClass67_257 == Static106.aClass67_282) {
															Static28.anInt422 = Static413.aClass1_Sub19_Sub2_1.method2915();
															Static151.anInt2351 = Static413.aClass1_Sub19_Sub2_1.method2928();
															Static425.aClass67_257 = null;
															return true;
														} else {
															@Pc(4783) boolean local4783;
															if (Static425.aClass67_257 == Static315.aClass67_196) {
																local212 = Static413.aClass1_Sub19_Sub2_1.method2882();
																local75 = Static413.aClass1_Sub19_Sub2_1.method2928();
																local229 = Static413.aClass1_Sub19_Sub2_1.method2896();
																local233 = Static413.aClass1_Sub19_Sub2_1.method2900();
																local510 = Static413.aClass1_Sub19_Sub2_1.method2896();
																local3154 = (local75 & 0x80) != 0;
																if (local233 >> 30 == 0) {
																	@Pc(4519) Class121 local4519;
																	@Pc(4584) Class64 local4584;
																	@Pc(4534) Class64 local4534;
																	if (local233 >> 29 != 0) {
																		local1837 = local233 & 0xFFFF;
																		@Pc(4485) Class1_Sub44 local4485 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local1837);
																		if (local4485 != null) {
																			@Pc(4490) Class11_Sub1_Sub3_Sub1 local4490 = local4485.aClass11_Sub1_Sub3_Sub1_2;
																			if (local229 == 65535) {
																				local229 = -1;
																			}
																			@Pc(4497) boolean local4497 = true;
																			local1396 = local3154 ? local4490.anInt3328 : local4490.anInt3266;
																			if (local229 != -1 && local1396 != -1) {
																				if (local229 == local1396) {
																					local4519 = Static46.aClass123_5.method2677(local229);
																					if (local4519.aBoolean319 && local4519.anInt3204 != -1) {
																						local4534 = Static402.aClass37_2.method665(local4519.anInt3204);
																						local1656 = local4534.anInt1204;
																						if (local1656 == 0 || local1656 == 2) {
																							local4497 = false;
																						} else if (local1656 == 1) {
																							local4497 = true;
																						}
																					}
																				} else {
																					local4519 = Static46.aClass123_5.method2677(local229);
																					@Pc(4567) Class121 local4567 = Static46.aClass123_5.method2677(local1396);
																					if (local4519.anInt3204 != -1 && local4567.anInt3204 != -1) {
																						local4584 = Static402.aClass37_2.method665(local4519.anInt3204);
																						@Pc(4590) Class64 local4590 = Static402.aClass37_2.method665(local4567.anInt3204);
																						if (local4590.anInt1199 > local4584.anInt1199) {
																							local4497 = false;
																						}
																					}
																				}
																			}
																			if (local4497) {
																				if (local3154) {
																					local4490.anInt3281 = Static98.anInt1304 + local510;
																					local4490.anInt3328 = local229;
																					local4490.anInt3270 = local212;
																					local4490.anInt3304 = 0;
																					local4490.anInt3323 = 1;
																					local4490.anInt3340 = local75 & 0x7;
																					local4490.anInt3303 = 0;
																					if (local4490.anInt3281 > Static98.anInt1304) {
																						local4490.anInt3304 = -1;
																					}
																					if (local4490.anInt3328 != -1 && Static98.anInt1304 == local4490.anInt3281) {
																						local4127 = Static46.aClass123_5.method2677(local4490.anInt3328).anInt3204;
																						if (local4127 != -1) {
																							local4534 = Static402.aClass37_2.method665(local4127);
																							if (local4534 != null && local4534.anIntArray127 != null) {
																								Static379.method131(0, local4490.anInt6428, local4534, local4490.aByte90, false, local4490.anInt6430);
																							}
																						}
																					}
																				} else {
																					local4490.anInt3285 = local510 + Static98.anInt1304;
																					local4490.anInt3300 = 1;
																					local4490.anInt3267 = 0;
																					local4490.anInt3325 = local212;
																					local4490.anInt3271 = local75 & 0x7;
																					local4490.anInt3338 = 0;
																					local4490.anInt3266 = local229;
																					if (local4490.anInt3285 > Static98.anInt1304) {
																						local4490.anInt3338 = -1;
																					}
																					if (local4490.anInt3266 != -1 && local4490.anInt3285 == Static98.anInt1304) {
																						local4127 = Static46.aClass123_5.method2677(local4490.anInt3266).anInt3204;
																						if (local4127 != -1) {
																							local4534 = Static402.aClass37_2.method665(local4127);
																							if (local4534 != null && local4534.anIntArray127 != null) {
																								Static379.method131(0, local4490.anInt6428, local4534, local4490.aByte90, false, local4490.anInt6430);
																							}
																						}
																					}
																				}
																			}
																		}
																	} else if (local233 >> 28 != 0) {
																		local1837 = local233 & 0xFFFF;
																		@Pc(4768) Class11_Sub1_Sub3_Sub2 local4768;
																		if (local1837 == Static220.anInt4038) {
																			local4768 = Static94.aClass11_Sub1_Sub3_Sub2_1;
																		} else {
																			local4768 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local1837];
																		}
																		if (local4768 != null) {
																			if (local229 == 65535) {
																				local229 = -1;
																			}
																			local4783 = true;
																			local1392 = local3154 ? local4768.anInt3328 : local4768.anInt3266;
																			@Pc(4820) Class64 local4820;
																			if (local229 != -1 && local1392 != -1) {
																				@Pc(4807) Class121 local4807;
																				if (local229 == local1392) {
																					local4807 = Static46.aClass123_5.method2677(local229);
																					if (local4807.aBoolean319 && local4807.anInt3204 != -1) {
																						local4820 = Static402.aClass37_2.method665(local4807.anInt3204);
																						local870 = local4820.anInt1204;
																						if (local870 == 0 || local870 == 2) {
																							local4783 = false;
																						} else if (local870 == 1) {
																							local4783 = true;
																						}
																					}
																				} else {
																					local4807 = Static46.aClass123_5.method2677(local229);
																					local4519 = Static46.aClass123_5.method2677(local1392);
																					if (local4807.anInt3204 != -1 && local4519.anInt3204 != -1) {
																						local4534 = Static402.aClass37_2.method665(local4807.anInt3204);
																						local4584 = Static402.aClass37_2.method665(local4519.anInt3204);
																						if (local4534.anInt1199 < local4584.anInt1199) {
																							local4783 = false;
																						}
																					}
																				}
																			}
																			if (local4783) {
																				if (local3154) {
																					local4768.anInt3281 = local510 + Static98.anInt1304;
																					local4768.anInt3270 = local212;
																					local4768.anInt3328 = local229;
																					local4768.anInt3303 = 0;
																					local4768.anInt3323 = 1;
																					local4768.anInt3304 = 0;
																					local4768.anInt3340 = local75 & 0x7;
																					if (Static98.anInt1304 < local4768.anInt3281) {
																						local4768.anInt3304 = -1;
																					}
																					if (local4768.anInt3328 == 65535) {
																						local4768.anInt3328 = -1;
																					}
																					if (local4768.anInt3328 != -1 && local4768.anInt3281 == Static98.anInt1304) {
																						local1396 = Static46.aClass123_5.method2677(local4768.anInt3328).anInt3204;
																						if (local1396 != -1) {
																							local4820 = Static402.aClass37_2.method665(local1396);
																							if (local4820 != null && local4820.anIntArray127 != null) {
																								Static379.method131(0, local4768.anInt6428, local4820, local4768.aByte90, local4768 == Static94.aClass11_Sub1_Sub3_Sub2_1, local4768.anInt6430);
																							}
																						}
																					}
																				} else {
																					local4768.anInt3271 = local75 & 0x7;
																					local4768.anInt3325 = local212;
																					local4768.anInt3266 = local229;
																					local4768.anInt3267 = 0;
																					local4768.anInt3338 = 0;
																					local4768.anInt3300 = 1;
																					local4768.anInt3285 = Static98.anInt1304 + local510;
																					if (local4768.anInt3266 == 65535) {
																						local4768.anInt3266 = -1;
																					}
																					if (Static98.anInt1304 < local4768.anInt3285) {
																						local4768.anInt3338 = -1;
																					}
																					if (local4768.anInt3266 != -1 && local4768.anInt3285 == Static98.anInt1304) {
																						local1396 = Static46.aClass123_5.method2677(local4768.anInt3266).anInt3204;
																						if (local1396 != -1) {
																							local4820 = Static402.aClass37_2.method665(local1396);
																							if (local4820 != null && local4820.anIntArray127 != null) {
																								Static379.method131(0, local4768.anInt6428, local4820, local4768.aByte90, Static94.aClass11_Sub1_Sub3_Sub2_1 == local4768, local4768.anInt6430);
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																} else {
																	local1837 = local233 >> 28 & 0x3;
																	local856 = (local233 >> 14 & 0x3FFF) - Static315.anInt5207;
																	local860 = (local233 & 0x3FFF) - Static47.anInt676;
																	if (local856 >= 0 && local860 >= 0 && local856 < Static147.anInt2300 && Static293.anInt4886 > local860) {
																		local1392 = local856 * 128 + 64;
																		local1396 = local860 * 128 + 64;
																		local4127 = local1837;
																		if (local1837 < 3 && Static141.method4892(local860, local856)) {
																			local4127 = local1837 + 1;
																		}
																		@Pc(5154) Class11_Sub1_Sub6 local5154 = new Class11_Sub1_Sub6(local229, 0, Static98.anInt1304, local1837, local4127, local1392, Static135.method1732(local1392, local1396, local1837) - local212, local1396, local856, local856, local860, local860, local75);
																		Static170.aClass14_9.method205(new Class1_Sub3_Sub13(local5154));
																	}
																}
																Static425.aClass67_257 = null;
																return true;
															} else if (Static344.aClass67_220 == Static425.aClass67_257) {
																Static27.method390(Static345.aClass62_33);
																Static425.aClass67_257 = null;
																return true;
															} else if (Static409.aClass67_248 == Static425.aClass67_257) {
																local1036 = Static413.aClass1_Sub19_Sub2_1.method2914();
																local2387 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
																if (local2387) {
																	local301 = Static413.aClass1_Sub19_Sub2_1.method2914();
																} else {
																	local301 = local1036;
																}
																local233 = Static413.aClass1_Sub19_Sub2_1.method2896();
																@Pc(5215) byte local5215 = Static413.aClass1_Sub19_Sub2_1.method2917();
																local3154 = false;
																if (local5215 == -128) {
																	local3154 = true;
																}
																if (local3154) {
																	if (Static362.anInt5836 == 0) {
																		Static425.aClass67_257 = null;
																		return true;
																	}
																	for (local1837 = 0; local1837 < Static362.anInt5836 && (!Static126.aClass180Array1[local1837].aString56.equals(local301) || Static126.aClass180Array1[local1837].anInt4899 != local233); local1837++) {
																	}
																	if (local1837 < Static362.anInt5836) {
																		while (local1837 < Static362.anInt5836 - 1) {
																			Static126.aClass180Array1[local1837] = Static126.aClass180Array1[local1837 + 1];
																			local1837++;
																		}
																		Static362.anInt5836--;
																		Static126.aClass180Array1[Static362.anInt5836] = null;
																	}
																} else {
																	local3178 = Static413.aClass1_Sub19_Sub2_1.method2914();
																	local2785 = new Class180();
																	local2785.aString58 = local1036;
																	local2785.aString56 = local301;
																	local2785.aString55 = Static91.method1066(local2785.aString56);
																	local2785.aByte71 = local5215;
																	local2785.aString57 = local3178;
																	local2785.anInt4899 = local233;
																	for (local860 = Static362.anInt5836 - 1; local860 >= 0; local860--) {
																		local1392 = Static126.aClass180Array1[local860].aString55.compareTo(local2785.aString55);
																		if (local1392 == 0) {
																			Static126.aClass180Array1[local860].anInt4899 = local233;
																			Static126.aClass180Array1[local860].aByte71 = local5215;
																			Static126.aClass180Array1[local860].aString57 = local3178;
																			if (local301.equals(Static94.aClass11_Sub1_Sub3_Sub2_1.aString32)) {
																				Static14.aByte6 = local5215;
																			}
																			Static386.anInt7154 = Static163.anInt5780;
																			Static425.aClass67_257 = null;
																			return true;
																		}
																		if (local1392 < 0) {
																			break;
																		}
																	}
																	if (Static362.anInt5836 >= Static126.aClass180Array1.length) {
																		Static425.aClass67_257 = null;
																		return true;
																	}
																	for (local1392 = Static362.anInt5836 - 1; local1392 > local860; local1392--) {
																		Static126.aClass180Array1[local1392 + 1] = Static126.aClass180Array1[local1392];
																	}
																	if (Static362.anInt5836 == 0) {
																		Static126.aClass180Array1 = new Class180[100];
																	}
																	Static126.aClass180Array1[local860 + 1] = local2785;
																	Static362.anInt5836++;
																	if (local301.equals(Static94.aClass11_Sub1_Sub3_Sub2_1.aString32)) {
																		Static14.aByte6 = local5215;
																	}
																}
																Static425.aClass67_257 = null;
																Static386.anInt7154 = Static163.anInt5780;
																return true;
															} else if (Static461.aClass67_281 == Static425.aClass67_257) {
																for (local212 = 0; local212 < Static399.aClass11_Sub1_Sub3_Sub2Array1.length; local212++) {
																	if (Static399.aClass11_Sub1_Sub3_Sub2Array1[local212] != null) {
																		Static399.aClass11_Sub1_Sub3_Sub2Array1[local212].anInt3302 = -1;
																	}
																}
																for (local75 = 0; local75 < Static406.anInt6516; local75++) {
																	Static47.aClass1_Sub44Array1[local75].aClass11_Sub1_Sub3_Sub1_2.anInt3302 = -1;
																}
																Static425.aClass67_257 = null;
																return true;
															} else if (Static425.aClass67_257 == Static182.aClass67_118) {
																local1036 = Static413.aClass1_Sub19_Sub2_1.method2914();
																local301 = Static169.method4130(Static71.method917(Static413.aClass1_Sub19_Sub2_1));
																method5510(local301, local1036, local1036, 6, 0);
																Static425.aClass67_257 = null;
																return true;
															} else if (Static425.aClass67_257 == Static138.aClass67_94) {
																Static292.method3896(Static413.aClass1_Sub19_Sub2_1.method2914());
																Static425.aClass67_257 = null;
																return true;
															} else if (Static425.aClass67_257 == Static12.aClass67_9) {
																Static305.aString60 = Static379.anInt119 <= 2 ? Static102.aClass142_28.method3118(Static63.anInt981) : Static413.aClass1_Sub19_Sub2_1.method2914();
																Static176.anInt3165 = Static379.anInt119 <= 0 ? -1 : Static413.aClass1_Sub19_Sub2_1.method2896();
																if (Static176.anInt3165 == 65535) {
																	Static176.anInt3165 = -1;
																}
																Static425.aClass67_257 = null;
																return true;
															} else if (Static311.aClass67_192 == Static425.aClass67_257) {
																local212 = Static413.aClass1_Sub19_Sub2_1.method2938();
																if (local212 == 65535) {
																	local212 = -1;
																}
																local75 = Static413.aClass1_Sub19_Sub2_1.method2884();
																local229 = local75 >> 2;
																local233 = local75 & 0x3;
																local510 = Static17.anIntArray311[local229];
																local514 = Static413.aClass1_Sub19_Sub2_1.method2891();
																local1837 = local514 >> 28 & 0x3;
																local856 = local514 >> 14 & 0x3FFF;
																local860 = local514 & 0x3FFF;
																local856 -= Static315.anInt5207;
																@Pc(5608) int local5608 = local860 - Static47.anInt676;
																Static345.method4493(local856, local233, local5608, local229, local1837, local212, local510);
																Static425.aClass67_257 = null;
																return true;
															} else if (Static82.aClass67_58 == Static425.aClass67_257) {
																Static455.anInt7235 = Static413.aClass1_Sub19_Sub2_1.method2899() << 3;
																Static356.anInt5795 = Static413.aClass1_Sub19_Sub2_1.method2915();
																Static31.anInt477 = Static413.aClass1_Sub19_Sub2_1.method2910() << 3;
																while (Static413.aClass1_Sub19_Sub2_1.anInt3698 < Static379.anInt119) {
																	@Pc(5649) Class62 local5649 = Static263.method3650()[Static413.aClass1_Sub19_Sub2_1.method2915()];
																	Static27.method390(local5649);
																}
																Static425.aClass67_257 = null;
																return true;
															} else if (Static195.aClass67_124 == Static425.aClass67_257) {
																Static422.method5394();
																Static425.aClass67_257 = null;
																return false;
															} else if (Static425.aClass67_257 == Static53.aClass67_42) {
																Static413.aClass1_Sub19_Sub2_1.anInt3698 += 28;
																if (Static413.aClass1_Sub19_Sub2_1.method2886()) {
																	Static60.method839(Static413.aClass1_Sub19_Sub2_1.anInt3698 - 28, Static413.aClass1_Sub19_Sub2_1);
																}
																Static425.aClass67_257 = null;
																return true;
															} else if (Static425.aClass67_257 == Static175.aClass67_114) {
																local212 = Static413.aClass1_Sub19_Sub2_1.method2882();
																local75 = Static413.aClass1_Sub19_Sub2_1.method2928();
																local229 = Static413.aClass1_Sub19_Sub2_1.method2877();
																local233 = Static413.aClass1_Sub19_Sub2_1.method2896();
																if (Static192.method2777(local212)) {
																	local1281 = (Class1_Sub37) Static462.aClass208_42.method4405((long) local229);
																	if (local1281 != null) {
																		Static393.method5106(local1281, local233 != local1281.anInt5481, false);
																	}
																	Static163.method4678(local233, false, local229, local75);
																}
																Static425.aClass67_257 = null;
																return true;
															} else if (Static425.aClass67_257 == Static399.aClass67_244) {
																Static27.method390(Static109.aClass62_12);
																Static425.aClass67_257 = null;
																return true;
															} else if (Static425.aClass67_257 == Static410.aClass67_249) {
																while (Static413.aClass1_Sub19_Sub2_1.anInt3698 < Static379.anInt119) {
																	local295 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
																	local301 = Static413.aClass1_Sub19_Sub2_1.method2914();
																	local303 = Static413.aClass1_Sub19_Sub2_1.method2914();
																	local233 = Static413.aClass1_Sub19_Sub2_1.method2896();
																	local510 = Static413.aClass1_Sub19_Sub2_1.method2915();
																	local349 = "";
																	local2762 = false;
																	if (local233 > 0) {
																		local349 = Static413.aClass1_Sub19_Sub2_1.method2914();
																		local2762 = Static413.aClass1_Sub19_Sub2_1.method2915() == 1;
																	}
																	for (local856 = 0; local856 < Static148.anInt2307; local856++) {
																		if (local295) {
																			if (local303.equals(Static108.aStringArray10[local856])) {
																				Static108.aStringArray10[local856] = local301;
																				Static313.aStringArray41[local856] = local303;
																				local301 = null;
																				break;
																			}
																		} else if (local301.equals(Static108.aStringArray10[local856])) {
																			if (local233 != Static284.anIntArray359[local856]) {
																				local4783 = true;
																				for (@Pc(5840) Class111_Sub1_Sub1 local5840 = (Class111_Sub1_Sub1) Static230.aClass63_3.method1019(); local5840 != null; local5840 = (Class111_Sub1_Sub1) Static230.aClass63_3.method1022()) {
																					if (local5840.aString43.equals(local301)) {
																						if (local233 != 0 && local5840.aShort60 == 0) {
																							local5840.method5886();
																							local4783 = false;
																						} else if (local233 == 0 && local5840.aShort60 != 0) {
																							local4783 = false;
																							local5840.method5886();
																						}
																					}
																				}
																				if (local4783) {
																					Static230.aClass63_3.method1024(new Class111_Sub1_Sub1(local301, local233));
																				}
																				Static284.anIntArray359[local856] = local233;
																			}
																			Static313.aStringArray41[local856] = local303;
																			Static57.aStringArray5[local856] = local349;
																			Static402.anIntArray467[local856] = local510;
																			Static67.aBooleanArray155[local856] = local2762;
																			local301 = null;
																			break;
																		}
																	}
																	if (local301 != null && Static148.anInt2307 < 200) {
																		Static108.aStringArray10[Static148.anInt2307] = local301;
																		Static313.aStringArray41[Static148.anInt2307] = local303;
																		Static284.anIntArray359[Static148.anInt2307] = local233;
																		Static57.aStringArray5[Static148.anInt2307] = local349;
																		Static402.anIntArray467[Static148.anInt2307] = local510;
																		Static67.aBooleanArray155[Static148.anInt2307] = local2762;
																		Static148.anInt2307++;
																	}
																}
																Static75.anInt1071 = Static163.anInt5780;
																Static94.anInt1261 = 2;
																local75 = Static148.anInt2307;
																while (local75 > 0) {
																	local75--;
																	local295 = true;
																	for (local229 = 0; local229 < local75; local229++) {
																		if (Static440.aClass112_6.anInt2708 != Static284.anIntArray359[local229] && Static284.anIntArray359[local229 + 1] == Static440.aClass112_6.anInt2708 || Static284.anIntArray359[local229] == 0 && Static284.anIntArray359[local229 + 1] != 0) {
																			local233 = Static284.anIntArray359[local229];
																			Static284.anIntArray359[local229] = Static284.anIntArray359[local229 + 1];
																			Static284.anIntArray359[local229 + 1] = local233;
																			local1823 = Static57.aStringArray5[local229];
																			Static57.aStringArray5[local229] = Static57.aStringArray5[local229 + 1];
																			Static57.aStringArray5[local229 + 1] = local1823;
																			local349 = Static108.aStringArray10[local229];
																			Static108.aStringArray10[local229] = Static108.aStringArray10[local229 + 1];
																			Static108.aStringArray10[local229 + 1] = local349;
																			local3178 = Static313.aStringArray41[local229];
																			Static313.aStringArray41[local229] = Static313.aStringArray41[local229 + 1];
																			Static313.aStringArray41[local229 + 1] = local3178;
																			local856 = Static402.anIntArray467[local229];
																			Static402.anIntArray467[local229] = Static402.anIntArray467[local229 + 1];
																			Static402.anIntArray467[local229 + 1] = local856;
																			local4783 = Static67.aBooleanArray155[local229];
																			Static67.aBooleanArray155[local229] = Static67.aBooleanArray155[local229 + 1];
																			Static67.aBooleanArray155[local229 + 1] = local4783;
																			local295 = false;
																		}
																	}
																	if (local295) {
																		break;
																	}
																}
																Static425.aClass67_257 = null;
																return true;
															} else if (Static290.aClass67_175 == Static425.aClass67_257) {
																Static455.anInt7235 = Static413.aClass1_Sub19_Sub2_1.method2899() << 3;
																Static356.anInt5795 = Static413.aClass1_Sub19_Sub2_1.method2915();
																Static31.anInt477 = Static413.aClass1_Sub19_Sub2_1.method2923() << 3;
																Static425.aClass67_257 = null;
																return true;
															} else if (Static425.aClass67_257 == Static382.aClass67_188) {
																if (Static33.aFrame1 != null) {
																	Static461.method5951(-1, false, -1, Static126.aClass19_Sub1_1.anInt4220);
																}
																@Pc(6179) byte[] local6179 = new byte[Static379.anInt119];
																Static413.aClass1_Sub19_Sub2_1.method2947(local6179, Static379.anInt119);
																local301 = Static244.method236(Static379.anInt119, 0, local6179);
																Static445.method5632(Static259.aClass177_2, local301, true, Static214.anInt3968 == 1);
																Static425.aClass67_257 = null;
																return true;
															} else if (Static425.aClass67_257 == Static128.aClass67_85) {
																local212 = Static413.aClass1_Sub19_Sub2_1.method2938();
																local75 = Static413.aClass1_Sub19_Sub2_1.method2903();
																local229 = Static413.aClass1_Sub19_Sub2_1.method2882();
																local233 = Static413.aClass1_Sub19_Sub2_1.method2882();
																if (Static192.method2777(local212)) {
																	Static120.method1485((local233 << 16) + local229, local75);
																}
																Static425.aClass67_257 = null;
																return true;
															} else if (Static425.aClass67_257 == Static85.aClass67_239) {
																local212 = Static413.aClass1_Sub19_Sub2_1.method2896();
																local75 = Static413.aClass1_Sub19_Sub2_1.method2892();
																local229 = Static413.aClass1_Sub19_Sub2_1.method2891();
																if (Static192.method2777(local75)) {
																	Static304.method735(local212, local229);
																}
																Static425.aClass67_257 = null;
																return true;
															} else if (Static33.aClass67_27 == Static425.aClass67_257) {
																Static174.anInt2867 = Static413.aClass1_Sub19_Sub2_1.method2929();
																Static356.anInt5794 = Static163.anInt5780;
																Static425.aClass67_257 = null;
																return true;
															} else if (Static425.aClass67_257 == Static308.aClass67_191) {
																Static27.method390(Static208.aClass62_23);
																Static425.aClass67_257 = null;
																return true;
															} else if (Static452.aClass67_271 == Static425.aClass67_257) {
																Static27.method390(Static246.aClass62_29);
																Static425.aClass67_257 = null;
																return true;
															} else if (Static404.aClass67_245 == Static425.aClass67_257) {
																Static455.anInt7235 = Static413.aClass1_Sub19_Sub2_1.method2899() << 3;
																Static31.anInt477 = Static413.aClass1_Sub19_Sub2_1.method2899() << 3;
																Static356.anInt5795 = Static413.aClass1_Sub19_Sub2_1.method2884();
																for (@Pc(6331) Class1_Sub32 local6331 = (Class1_Sub32) Static402.aClass208_37.method4414(); local6331 != null; local6331 = (Class1_Sub32) Static402.aClass208_37.method4410()) {
																	local75 = (int) (local6331.aLong236 >> 28 & 0x3L);
																	local229 = (int) (local6331.aLong236 & 0x3FFFL);
																	local233 = local229 - Static315.anInt5207;
																	local510 = (int) (local6331.aLong236 >> 14 & 0x3FFFL);
																	local514 = local510 - Static47.anInt676;
																	if (local75 == Static356.anInt5795 && Static31.anInt477 <= local233 && local233 < Static31.anInt477 + 8 && Static455.anInt7235 <= local514 && local514 < Static455.anInt7235 + 8) {
																		local6331.method5953();
																		if (local233 >= 0 && local514 >= 0 && Static147.anInt2300 > local233 && Static293.anInt4886 > local514) {
																			Static370.method4827(local233, Static356.anInt5795, local514);
																		}
																	}
																}
																for (@Pc(6437) Class1_Sub20 local6437 = (Class1_Sub20) Static303.aClass14_33.method203(); local6437 != null; local6437 = (Class1_Sub20) Static303.aClass14_33.method208()) {
																	if (Static31.anInt477 <= local6437.anInt2536 && local6437.anInt2536 < Static31.anInt477 + 8 && local6437.anInt2539 >= Static455.anInt7235 && Static455.anInt7235 + 8 > local6437.anInt2539 && Static356.anInt5795 == local6437.anInt2542) {
																		local6437.anInt2541 = 0;
																	}
																}
																Static425.aClass67_257 = null;
																return true;
															} else {
																Static338.method4409(null, "T1 - " + (Static425.aClass67_257 == null ? -1 : Static425.aClass67_257.method1107()) + "," + (Static12.aClass67_8 == null ? -1 : Static12.aClass67_8.method1107()) + "," + (Static270.aClass67_88 == null ? -1 : Static270.aClass67_88.method1107()) + " - " + Static379.anInt119);
																Static124.method1519(false);
																return true;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
