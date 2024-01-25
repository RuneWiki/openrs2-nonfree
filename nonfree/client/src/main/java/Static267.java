import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!ee;")
	public static Class86 aClass86_7;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "F")
	public static float aFloat190;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Lclient!kr;")
	public static Class20 aClass20_32;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_36 = new Class233(20);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIB[J[I)V")
	public static void method6451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) long local16 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local16;
		@Pc(30) int local30 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local30;
		@Pc(48) int local48 = local16 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(50) int local50 = arg0; local50 < arg1; local50++) {
			if (local16 + (long) (local50 & local48) > arg2[local50]) {
				@Pc(71) long local71 = arg2[local50];
				arg2[local50] = arg2[local12];
				arg2[local12] = local71;
				@Pc(85) int local85 = arg3[local50];
				arg3[local50] = arg3[local12];
				arg3[local12++] = local85;
			}
		}
		arg2[arg1] = arg2[local12];
		arg2[local12] = local16;
		arg3[arg1] = arg3[local12];
		arg3[local12] = local30;
		method6451(arg0, local12 - 1, arg2, arg3);
		method6451(local12 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIILclient!qn;)V")
	public static void method6453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11_Sub1_Sub5 arg4) {
		@Pc(4) Class217 local4 = Static334.method5171(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt9925 = (arg1 << Static415.anInt7579) + Static290.anInt5464;
		arg4.anInt9930 = arg3;
		arg4.anInt9929 = (arg2 << Static415.anInt7579) + Static290.anInt5464;
		local4.aClass11_Sub1_Sub5_1 = arg4;
		@Pc(33) int local33 = Static331.aClass112Array3 == Static164.aClass112Array1 ? 1 : 0;
		if (arg4.method8306()) {
			if (arg4.method8310()) {
				Static146.aClass11_Sub1ArrayArray1[local33][Static442.anIntArray535[local33]++] = arg4;
				return;
			}
			Static317.aClass11_Sub1ArrayArray2[local33][Static336.anIntArray411[local33]++] = arg4;
			Static445.aBoolean594 = true;
			return;
		}
		Static483.aClass11_Sub1ArrayArray3[local33][Static429.anIntArray527[local33]++] = arg4;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Z")
	public static boolean method6455() throws IOException {
		if (Static439.aClass210_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static398.aClass274_115 == null) {
			if (Static248.aBoolean396) {
				if (!Static439.aClass210_1.method8029(1)) {
					return false;
				}
				Static439.aClass210_1.method8031(0, 1, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
				Static446.anInt7904 = 0;
				Static371.anInt6619++;
				Static248.aBoolean396 = false;
			}
			Static313.aClass2_Sub34_Sub2_1.anInt8188 = 0;
			if (Static313.aClass2_Sub34_Sub2_1.method6924()) {
				if (!Static439.aClass210_1.method8029(1)) {
					return false;
				}
				Static439.aClass210_1.method8031(1, 1, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
				Static371.anInt6619++;
				Static446.anInt7904 = 0;
			}
			Static248.aBoolean396 = true;
			@Pc(69) Class274[] local69 = Static336.method5209();
			local73 = Static313.aClass2_Sub34_Sub2_1.method6934();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static313.aClass2_Sub34_Sub2_1.anInt8188);
			}
			Static398.aClass274_115 = local69[local73];
			Static44.anInt971 = Static398.aClass274_115.anInt7957;
		}
		if (Static44.anInt971 == -1) {
			if (!Static439.aClass210_1.method8029(1)) {
				return false;
			}
			Static439.aClass210_1.method8031(0, 1, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
			Static446.anInt7904 = 0;
			Static371.anInt6619++;
			Static44.anInt971 = Static313.aClass2_Sub34_Sub2_1.aByteArray77[0] & 0xFF;
		}
		if (Static44.anInt971 == -2) {
			if (!Static439.aClass210_1.method8029(2)) {
				return false;
			}
			Static439.aClass210_1.method8031(0, 2, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
			Static313.aClass2_Sub34_Sub2_1.anInt8188 = 0;
			Static44.anInt971 = Static313.aClass2_Sub34_Sub2_1.method6884();
			Static446.anInt7904 = 0;
			Static371.anInt6619 += 2;
		}
		if (Static44.anInt971 > 0) {
			if (!Static439.aClass210_1.method8029(Static44.anInt971)) {
				return false;
			}
			Static313.aClass2_Sub34_Sub2_1.anInt8188 = 0;
			Static439.aClass210_1.method8031(0, Static44.anInt971, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
			Static371.anInt6619 += Static44.anInt971;
			Static446.anInt7904 = 0;
		}
		Static287.aClass274_86 = Static136.aClass274_35;
		Static136.aClass274_35 = Static394.aClass274_114;
		Static394.aClass274_114 = Static398.aClass274_115;
		@Pc(256) int local256;
		@Pc(270) int local270;
		@Pc(367) int local367;
		@Pc(374) int local374;
		@Pc(234) boolean local234;
		@Pc(372) boolean local372;
		@Pc(395) Class345 local395;
		if (Static398.aClass274_115 == Static3.aClass274_1) {
			Static229.anInt4654 = Static44.anInt975;
			if (Static44.anInt971 == 0) {
				Static466.aString48 = null;
				Static69.aString17 = null;
				Static531.anInt8877 = 0;
				Static398.aClass274_115 = null;
				Static561.aClass345Array1 = null;
				return true;
			}
			Static466.aString48 = Static313.aClass2_Sub34_Sub2_1.method6903();
			local234 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
			if (local234) {
				Static313.aClass2_Sub34_Sub2_1.method6903();
			}
			@Pc(244) long local244 = Static313.aClass2_Sub34_Sub2_1.method6877();
			Static69.aString17 = Static400.method6053(local244);
			Static380.aByte95 = Static313.aClass2_Sub34_Sub2_1.method6908();
			local256 = Static313.aClass2_Sub34_Sub2_1.method6904();
			if (local256 == 255) {
				Static398.aClass274_115 = null;
				return true;
			}
			Static531.anInt8877 = local256;
			@Pc(268) Class345[] local268 = new Class345[100];
			for (local270 = 0; local270 < Static531.anInt8877; local270++) {
				local268[local270] = new Class345();
				local268[local270].aString87 = Static313.aClass2_Sub34_Sub2_1.method6903();
				local234 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
				if (local234) {
					local268[local270].aString85 = Static313.aClass2_Sub34_Sub2_1.method6903();
				} else {
					local268[local270].aString85 = local268[local270].aString87;
				}
				local268[local270].aString86 = Static70.method1355(local268[local270].aString85);
				local268[local270].anInt9540 = Static313.aClass2_Sub34_Sub2_1.method6884();
				local268[local270].aByte117 = Static313.aClass2_Sub34_Sub2_1.method6908();
				local268[local270].aString88 = Static313.aClass2_Sub34_Sub2_1.method6903();
				if (local268[local270].aString85.equals(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString4)) {
					Static612.aByte126 = local268[local270].aByte117;
				}
			}
			local367 = Static531.anInt8877;
			while (local367 > 0) {
				local367--;
				local372 = true;
				for (local374 = 0; local374 < local367; local374++) {
					if (local268[local374].aString86.compareTo(local268[local374 + 1].aString86) > 0) {
						local395 = local268[local374];
						local268[local374] = local268[local374 + 1];
						local268[local374 + 1] = local395;
						local372 = false;
					}
				}
				if (local372) {
					break;
				}
			}
			Static561.aClass345Array1 = local268;
			Static398.aClass274_115 = null;
			return true;
		}
		@Pc(453) int local453;
		@Pc(438) int local438;
		if (Static398.aClass274_115 == Static364.aClass274_104) {
			local438 = Static313.aClass2_Sub34_Sub2_1.method6911();
			if (local438 == 65535) {
				local438 = -1;
			}
			local73 = Static313.aClass2_Sub34_Sub2_1.method6893();
			local453 = Static313.aClass2_Sub34_Sub2_1.method6865();
			Static249.method4058();
			Static402.method5416(local73, local438, local453);
			@Pc(466) Class245 local466 = Static570.aClass267_2.method6597(local438);
			Static559.method7759(local466.anInt7450, local453, local466.anInt7477, local466.anInt7448);
			Static13.method4547(local466.anInt7453, local466.anInt7508, local453, local466.anInt7498);
			Static398.aClass274_115 = null;
			return true;
		} else if (Static326.aClass274_94 == Static398.aClass274_115) {
			Static42.method844(Static589.aClass266_15);
			Static398.aClass274_115 = null;
			return true;
		} else if (Static462.aClass274_130 == Static398.aClass274_115) {
			Static394.anInt7090 = Static313.aClass2_Sub34_Sub2_1.method6856();
			Static366.anInt6576 = Static44.anInt975;
			Static398.aClass274_115 = null;
			return true;
		} else {
			@Pc(543) int local543;
			@Pc(527) String local527;
			@Pc(545) boolean local545;
			@Pc(568) String local568;
			@Pc(529) String local529;
			if (Static398.aClass274_115 == Static365.aClass274_105) {
				local234 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
				local527 = Static313.aClass2_Sub34_Sub2_1.method6903();
				local529 = local527;
				if (local234) {
					local529 = Static313.aClass2_Sub34_Sub2_1.method6903();
				}
				local256 = Static313.aClass2_Sub34_Sub2_1.method6904();
				local543 = Static313.aClass2_Sub34_Sub2_1.method6884();
				local545 = false;
				if (local256 <= 1 && Static169.method8417(local529)) {
					local545 = true;
				}
				if (!local545 && Static252.anInt4998 == 0) {
					local568 = Static249.aClass111_1.method2928(local543).method6312(Static313.aClass2_Sub34_Sub2_1);
					if (local256 == 2) {
						Static278.method4448(null, local543, "<img=1>" + local527, "<img=1>" + local529, 25, 0, local527, local568);
					} else if (local256 == 1) {
						Static278.method4448(null, local543, "<img=0>" + local527, "<img=0>" + local529, 25, 0, local527, local568);
					} else {
						Static278.method4448(null, local543, local527, local529, 25, 0, local527, local568);
					}
				}
				Static398.aClass274_115 = null;
				return true;
			} else if (Static398.aClass274_115 == Static333.aClass274_98) {
				local438 = Static313.aClass2_Sub34_Sub2_1.method6896();
				local73 = Static313.aClass2_Sub34_Sub2_1.method6859();
				Static249.method4058();
				Static3.method54(local438, local73);
				Static398.aClass274_115 = null;
				return true;
			} else if (Static95.aClass274_23 == Static398.aClass274_115) {
				Static42.method844(Static538.aClass266_11);
				Static398.aClass274_115 = null;
				return true;
			} else {
				@Pc(675) String local675;
				if (Static398.aClass274_115 == Static246.aClass274_170) {
					local675 = Static313.aClass2_Sub34_Sub2_1.method6903();
					local527 = Static386.method5817(Static294.method4603(Static313.aClass2_Sub34_Sub2_1));
					Static369.method5571(local675, local675, local527, 0, 6, local675);
					Static398.aClass274_115 = null;
					return true;
				} else if (Static442.aClass274_124 == Static398.aClass274_115) {
					local438 = Static313.aClass2_Sub34_Sub2_1.method6884();
					local527 = Static313.aClass2_Sub34_Sub2_1.method6903();
					Static249.method4058();
					Static326.method4907(local438, local527);
					Static398.aClass274_115 = null;
					return true;
				} else {
					@Pc(794) int local794;
					@Pc(758) boolean local758;
					if (Static398.aClass274_115 == Static45.aClass274_109) {
						local438 = Static313.aClass2_Sub34_Sub2_1.method6884();
						@Pc(729) Class11_Sub1_Sub1_Sub2_Sub1 local729;
						if (local438 == Static182.anInt4021) {
							local729 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2;
						} else {
							local729 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local438];
						}
						if (local729 == null) {
							Static398.aClass274_115 = null;
							return true;
						}
						local453 = Static313.aClass2_Sub34_Sub2_1.method6884();
						local256 = Static313.aClass2_Sub34_Sub2_1.method6904();
						local758 = (local453 & 0x8000) != 0;
						if (local729.aString4 != null && local729.aClass163_1 != null) {
							local545 = false;
							if (local256 <= 1) {
								if (!local758 && (Static95.aBoolean160 && !Static392.aBoolean523 || Static408.aBoolean565)) {
									local545 = true;
								} else if (Static169.method8417(local729.aString4)) {
									local545 = true;
								}
							}
							if (!local545 && Static252.anInt4998 == 0) {
								local794 = -1;
								if (local758) {
									local453 &= 0x7FFF;
									@Pc(812) Class133 local812 = Static176.method3261(Static313.aClass2_Sub34_Sub2_1);
									local794 = local812.anInt4054;
									local568 = local812.aClass2_Sub5_Sub17_1.method6312(Static313.aClass2_Sub34_Sub2_1);
								} else {
									local568 = Static386.method5817(Static294.method4603(Static313.aClass2_Sub34_Sub2_1));
								}
								local729.aString33 = local568.trim();
								local729.anInt3249 = 150;
								local729.anInt3212 = local453 & 0xFF;
								local729.anInt3277 = local453 >> 8;
								if (local256 == 1 || local256 == 2) {
									local367 = local758 ? 17 : 1;
								} else {
									local367 = local758 ? 17 : 2;
								}
								if (local256 == 2) {
									Static278.method4448(null, local794, "<img=1>" + local729.method421(), "<img=1>" + local729.method425(), local367, 0, local729.aString3, local568);
								} else if (local256 == 1) {
									Static278.method4448(null, local794, "<img=0>" + local729.method421(), "<img=0>" + local729.method425(), local367, 0, local729.aString3, local568);
								} else {
									Static278.method4448(null, local794, local729.method421(), local729.method425(), local367, 0, local729.aString3, local568);
								}
							}
						}
						Static398.aClass274_115 = null;
						return true;
					} else if (Static280.aClass274_81 == Static398.aClass274_115) {
						local438 = Static313.aClass2_Sub34_Sub2_1.method6865();
						Static258.aClass26_38 = Static375.aClass359_4.method8268(local438);
						Static398.aClass274_115 = null;
						return true;
					} else {
						@Pc(999) Class2_Sub37 local999;
						if (Static226.aClass274_62 == Static398.aClass274_115) {
							local438 = Static313.aClass2_Sub34_Sub2_1.method6898();
							local73 = Static313.aClass2_Sub34_Sub2_1.method6865();
							Static249.method4058();
							@Pc(992) Class2_Sub37 local992 = (Class2_Sub37) Static206.aClass222_14.method5468((long) local438);
							local999 = (Class2_Sub37) Static206.aClass222_14.method5468((long) local73);
							if (local999 != null) {
								Static450.method4870(local999, local992 == null || local992.anInt6848 != local999.anInt6848, false);
							}
							if (local992 != null) {
								local992.method8599();
								Static206.aClass222_14.method5476(local992, (long) local73);
							}
							@Pc(1030) Class78 local1030 = Static180.method3291(local438);
							if (local1030 != null) {
								Static397.method6022(local1030);
							}
							local1030 = Static180.method3291(local73);
							if (local1030 != null) {
								Static397.method6022(local1030);
								Static630.method8478(true, local1030);
							}
							if (Static387.anInt6978 != -1) {
								Static446.method6622(1, Static387.anInt6978);
							}
							Static398.aClass274_115 = null;
							return true;
						} else if (Static504.aClass274_159 == Static398.aClass274_115) {
							local438 = Static313.aClass2_Sub34_Sub2_1.method6867();
							local73 = Static313.aClass2_Sub34_Sub2_1.method6909();
							local453 = Static313.aClass2_Sub34_Sub2_1.method6911();
							if (local453 == 65535) {
								local453 = -1;
							}
							Static530.method7410(local438, local453, local73);
							Static398.aClass274_115 = null;
							return true;
						} else if (Static336.aClass274_99 == Static398.aClass274_115) {
							local438 = Static313.aClass2_Sub34_Sub2_1.method6870();
							local73 = Static313.aClass2_Sub34_Sub2_1.method6909();
							local453 = Static313.aClass2_Sub34_Sub2_1.method6911();
							if (local453 == 65535) {
								local453 = -1;
							}
							Static523.method7317(local453, local73, local438);
							Static398.aClass274_115 = null;
							return true;
						} else if (Static398.aClass274_115 == Static363.aClass274_103) {
							local438 = Static313.aClass2_Sub34_Sub2_1.method6865();
							local73 = Static313.aClass2_Sub34_Sub2_1.method6884();
							Static249.method4058();
							Static343.method5243(local73, local438);
							Static398.aClass274_115 = null;
							return true;
						} else if (Static42.aClass274_12 == Static398.aClass274_115) {
							Static369.method5569(Static313.aClass2_Sub34_Sub2_1, Static44.anInt971);
							Static398.aClass274_115 = null;
							return true;
						} else if (Static498.aClass274_140 == Static398.aClass274_115) {
							local438 = Static313.aClass2_Sub34_Sub2_1.method6879();
							local73 = Static313.aClass2_Sub34_Sub2_1.method6919();
							local453 = Static313.aClass2_Sub34_Sub2_1.method6919();
							local256 = Static313.aClass2_Sub34_Sub2_1.method6867();
							local543 = Static313.aClass2_Sub34_Sub2_1.method6867();
							Static249.method4058();
							Static276.aBooleanArray32[local256] = true;
							Static557.anIntArray647[local256] = local453;
							Static311.anIntArray387[local256] = local73;
							Static376.anIntArray448[local256] = local543;
							Static416.anIntArray510[local256] = local438;
							Static398.aClass274_115 = null;
							return true;
						} else {
							@Pc(1257) int local1257;
							@Pc(1238) long local1238;
							@Pc(1233) long local1233;
							@Pc(1243) long local1243;
							@Pc(1255) boolean local1255;
							if (Static398.aClass274_115 == Static321.aClass274_183) {
								local234 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
								local527 = Static313.aClass2_Sub34_Sub2_1.method6903();
								local529 = local527;
								if (local234) {
									local529 = Static313.aClass2_Sub34_Sub2_1.method6903();
								}
								local1233 = Static313.aClass2_Sub34_Sub2_1.method6877();
								local1238 = Static313.aClass2_Sub34_Sub2_1.method6884();
								local1243 = Static313.aClass2_Sub34_Sub2_1.method6870();
								local374 = Static313.aClass2_Sub34_Sub2_1.method6904();
								@Pc(1253) long local1253 = local1243 + (local1238 << 32);
								local1255 = false;
								local1257 = 0;
								while (true) {
									if (local1257 >= 100) {
										if (local374 <= 1) {
											if (Static95.aBoolean160 && !Static392.aBoolean523 || Static408.aBoolean565) {
												local1255 = true;
											} else if (Static169.method8417(local529)) {
												local1255 = true;
											}
										}
										break;
									}
									if (Static609.aLongArray15[local1257] == local1253) {
										local1255 = true;
										break;
									}
									local1257++;
								}
								if (!local1255 && Static252.anInt4998 == 0) {
									Static609.aLongArray15[Static631.anInt10152] = local1253;
									Static631.anInt10152 = (Static631.anInt10152 + 1) % 100;
									@Pc(1314) String local1314 = Static386.method5817(Static294.method4603(Static313.aClass2_Sub34_Sub2_1));
									if (local374 == 2 || local374 == 3) {
										Static278.method4448(Static252.method4164(local1233), -1, "<img=1>" + local527, "<img=1>" + local529, 9, 0, local527, local1314);
									} else if (local374 == 1) {
										Static278.method4448(Static252.method4164(local1233), -1, "<img=0>" + local527, "<img=0>" + local529, 9, 0, local527, local1314);
									} else {
										Static278.method4448(Static252.method4164(local1233), -1, local527, local529, 9, 0, local527, local1314);
									}
								}
								Static398.aClass274_115 = null;
								return true;
							} else if (Static268.aClass274_77 == Static398.aClass274_115) {
								local438 = Static313.aClass2_Sub34_Sub2_1.method6898();
								local73 = Static313.aClass2_Sub34_Sub2_1.method6879();
								Static249.method4058();
								if (local73 == 65535) {
									local73 = -1;
								}
								Static474.method6798(local73, local438);
								Static398.aClass274_115 = null;
								return true;
							} else if (Static122.aClass274_33 == Static398.aClass274_115) {
								local438 = Static313.aClass2_Sub34_Sub2_1.method6879();
								local73 = Static313.aClass2_Sub34_Sub2_1.method6893();
								local453 = Static313.aClass2_Sub34_Sub2_1.method6911();
								Static249.method4058();
								Static309.method4740(local453 + (local438 << 16), local73);
								Static398.aClass274_115 = null;
								return true;
							} else {
								@Pc(1499) String local1499;
								@Pc(1469) String local1469;
								@Pc(1467) String local1467;
								if (Static398.aClass274_115 == Static155.aClass274_42) {
									local438 = Static313.aClass2_Sub34_Sub2_1.method6863();
									local73 = Static313.aClass2_Sub34_Sub2_1.method6865();
									local453 = Static313.aClass2_Sub34_Sub2_1.method6904();
									local1467 = "";
									local1469 = local1467;
									if ((local453 & 0x1) != 0) {
										local1467 = Static313.aClass2_Sub34_Sub2_1.method6903();
										if ((local453 & 0x2) == 0) {
											local1469 = local1467;
										} else {
											local1469 = Static313.aClass2_Sub34_Sub2_1.method6903();
										}
									}
									local1499 = Static313.aClass2_Sub34_Sub2_1.method6903();
									if (local438 == 99) {
										Static576.method8008(local1499);
									} else if (local1469.equals("") || !Static169.method8417(local1469)) {
										Static369.method5571(local1467, local1467, local1499, local73, local438, local1469);
									} else {
										Static398.aClass274_115 = null;
										return true;
									}
									Static398.aClass274_115 = null;
									return true;
								} else if (Static607.aClass274_173 == Static398.aClass274_115) {
									Static438.aClass198_1.method4753();
									Static398.aClass274_115 = null;
									Static372.anInt6644 += 32;
									return true;
								} else {
									@Pc(1595) int local1595;
									@Pc(1606) int local1606;
									if (Static225.aClass274_60 == Static398.aClass274_115) {
										local234 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
										local527 = Static313.aClass2_Sub34_Sub2_1.method6903();
										local529 = local527;
										if (local234) {
											local529 = Static313.aClass2_Sub34_Sub2_1.method6903();
										}
										local1233 = Static313.aClass2_Sub34_Sub2_1.method6877();
										local1238 = Static313.aClass2_Sub34_Sub2_1.method6884();
										local1243 = Static313.aClass2_Sub34_Sub2_1.method6870();
										local374 = Static313.aClass2_Sub34_Sub2_1.method6904();
										local1595 = Static313.aClass2_Sub34_Sub2_1.method6884();
										@Pc(1602) long local1602 = (local1238 << 32) + local1243;
										@Pc(1604) boolean local1604 = false;
										local1606 = 0;
										while (true) {
											if (local1606 >= 100) {
												if (local374 <= 1 && Static169.method8417(local529)) {
													local1604 = true;
												}
												break;
											}
											if (local1602 == Static609.aLongArray15[local1606]) {
												local1604 = true;
												break;
											}
											local1606++;
										}
										if (!local1604 && Static252.anInt4998 == 0) {
											Static609.aLongArray15[Static631.anInt10152] = local1602;
											Static631.anInt10152 = (Static631.anInt10152 + 1) % 100;
											@Pc(1661) String local1661 = Static249.aClass111_1.method2928(local1595).method6312(Static313.aClass2_Sub34_Sub2_1);
											if (local374 == 2) {
												Static278.method4448(Static252.method4164(local1233), local1595, "<img=1>" + local527, "<img=1>" + local529, 20, 0, local527, local1661);
											} else if (local374 == 1) {
												Static278.method4448(Static252.method4164(local1233), local1595, "<img=0>" + local527, "<img=0>" + local529, 20, 0, local527, local1661);
											} else {
												Static278.method4448(Static252.method4164(local1233), local1595, local527, local529, 20, 0, local527, local1661);
											}
										}
										Static398.aClass274_115 = null;
										return true;
									} else if (Static405.aClass274_116 == Static398.aClass274_115) {
										Static363.aClass159_4 = Static86.method1552(Static313.aClass2_Sub34_Sub2_1.method6904());
										Static398.aClass274_115 = null;
										return true;
									} else if (Static398.aClass274_115 == Static55.aClass274_15) {
										Static42.method844(Static548.aClass266_12);
										Static398.aClass274_115 = null;
										return true;
									} else if (Static9.aClass274_3 == Static398.aClass274_115) {
										local675 = Static313.aClass2_Sub34_Sub2_1.method6903();
										local73 = Static313.aClass2_Sub34_Sub2_1.method6911();
										Static249.method4058();
										Static326.method4907(local73, local675);
										Static398.aClass274_115 = null;
										return true;
									} else if (Static627.aClass274_179 == Static398.aClass274_115) {
										Static391.method5864();
										Static398.aClass274_115 = null;
										return true;
									} else if (Static398.aClass274_115 == Static21.aClass274_8) {
										local438 = Static313.aClass2_Sub34_Sub2_1.method6896();
										Static249.method4058();
										@Pc(1808) Class2_Sub37 local1808 = (Class2_Sub37) Static206.aClass222_14.method5468((long) local438);
										if (local1808 != null) {
											Static450.method4870(local1808, true, false);
										}
										if (Static97.aClass78_2 != null) {
											Static397.method6022(Static97.aClass78_2);
											Static97.aClass78_2 = null;
										}
										Static398.aClass274_115 = null;
										return true;
									} else if (Static398.aClass274_115 == Static282.aClass274_82) {
										local438 = Static313.aClass2_Sub34_Sub2_1.method6909();
										local73 = Static313.aClass2_Sub34_Sub2_1.method6879();
										local453 = Static313.aClass2_Sub34_Sub2_1.method6898();
										Static249.method4058();
										local999 = (Class2_Sub37) Static206.aClass222_14.method5468((long) local453);
										if (local999 != null) {
											Static450.method4870(local999, local73 != local999.anInt6848, false);
										}
										Static97.method1672(local438, local73, local453, false);
										Static398.aClass274_115 = null;
										return true;
									} else if (Static256.aClass274_74 == Static398.aClass274_115) {
										Static42.method844(Static430.aClass266_8);
										Static398.aClass274_115 = null;
										return true;
									} else if (Static260.aClass274_75 == Static398.aClass274_115) {
										local438 = Static313.aClass2_Sub34_Sub2_1.method6865();
										Static249.method4058();
										Static193.method3435(local438, Static182.anInt4021, 5, 0);
										Static398.aClass274_115 = null;
										return true;
									} else if (Static535.aClass274_151 == Static398.aClass274_115) {
										Static42.method844(Static37.aClass266_1);
										Static398.aClass274_115 = null;
										return true;
									} else if (Static398.aClass274_115 == Static541.aClass274_155) {
										Static194.anInt4180 = Static313.aClass2_Sub34_Sub2_1.method6904();
										Static366.anInt6576 = Static44.anInt975;
										Static398.aClass274_115 = null;
										return true;
									} else if (Static620.aClass274_177 == Static398.aClass274_115) {
										if (Static562.method7785(Static538.anInt8985)) {
											Static226.anInt4630 = (int) ((float) Static313.aClass2_Sub34_Sub2_1.method6884() * 2.5F);
										} else {
											Static226.anInt4630 = Static313.aClass2_Sub34_Sub2_1.method6884() * 30;
										}
										Static366.anInt6576 = Static44.anInt975;
										Static398.aClass274_115 = null;
										return true;
									} else if (Static247.aClass274_83 == Static398.aClass274_115) {
										local438 = Static313.aClass2_Sub34_Sub2_1.method6904();
										local73 = local438 >> 5;
										local453 = local438 & 0x1F;
										if (local453 == 0) {
											Static388.aClass60Array1[local73] = null;
											Static398.aClass274_115 = null;
											return true;
										}
										@Pc(1989) Class60 local1989 = new Class60();
										local1989.anInt1599 = local453;
										local1989.anInt1605 = Static313.aClass2_Sub34_Sub2_1.method6904();
										if (local1989.anInt1605 >= 0 && Static409.aClass20Array9.length > local1989.anInt1605) {
											if (local1989.anInt1599 == 1 || local1989.anInt1599 == 10) {
												local1989.anInt1606 = Static313.aClass2_Sub34_Sub2_1.method6884();
												Static313.aClass2_Sub34_Sub2_1.anInt8188 += 6;
											} else if (local1989.anInt1599 >= 2 && local1989.anInt1599 <= 6) {
												if (local1989.anInt1599 == 2) {
													local1989.anInt1602 = 256;
													local1989.anInt1600 = 256;
												}
												if (local1989.anInt1599 == 3) {
													local1989.anInt1602 = 0;
													local1989.anInt1600 = 256;
												}
												if (local1989.anInt1599 == 4) {
													local1989.anInt1602 = 512;
													local1989.anInt1600 = 256;
												}
												if (local1989.anInt1599 == 5) {
													local1989.anInt1600 = 0;
													local1989.anInt1602 = 256;
												}
												if (local1989.anInt1599 == 6) {
													local1989.anInt1600 = 512;
													local1989.anInt1602 = 256;
												}
												local1989.anInt1599 = 2;
												local1989.anInt1607 = Static313.aClass2_Sub34_Sub2_1.method6904();
												local1989.anInt1602 += Static313.aClass2_Sub34_Sub2_1.method6884() - Static451.anInt7933 << 9;
												local1989.anInt1600 += Static313.aClass2_Sub34_Sub2_1.method6884() - Static470.anInt8063 << 9;
												local1989.anInt1601 = Static313.aClass2_Sub34_Sub2_1.method6904() << 2;
												local1989.anInt1603 = Static313.aClass2_Sub34_Sub2_1.method6884();
											}
											local1989.anInt1604 = Static313.aClass2_Sub34_Sub2_1.method6884();
											if (local1989.anInt1604 == 65535) {
												local1989.anInt1604 = -1;
											}
											Static388.aClass60Array1[local73] = local1989;
										}
										Static398.aClass274_115 = null;
										return true;
									} else if (Static398.aClass274_115 == Static598.aClass274_36) {
										local438 = Static313.aClass2_Sub34_Sub2_1.method6898();
										local73 = Static313.aClass2_Sub34_Sub2_1.method6909();
										local453 = Static313.aClass2_Sub34_Sub2_1.method6919();
										Static516.anIntArray594[local453] = local438;
										Static459.anIntArray583[local453] = local73;
										Static206.anIntArray296[local453] = 1;
										local256 = Static377.anIntArray450[local453] - 1;
										for (local543 = 0; local543 < local256; local543++) {
											if (Class57.anIntArray149[local543] <= local438) {
												Static206.anIntArray296[local453] = local543 + 2;
											}
										}
										Static89.anIntArray164[Static596.anInt9835++ & 0x1F] = local453;
										Static398.aClass274_115 = null;
										return true;
									} else if (Static180.aClass274_51 == Static398.aClass274_115) {
										Static249.method4058();
										Static386.method5818();
										Static398.aClass274_115 = null;
										return true;
									} else if (Static398.aClass274_115 == Static226.aClass274_61) {
										Static75.method1450(Static457.aBoolean598);
										Static398.aClass274_115 = null;
										return false;
									} else if (Static398.aClass274_115 == Static628.aClass274_180) {
										local438 = Static313.aClass2_Sub34_Sub2_1.method6867();
										local73 = Static313.aClass2_Sub34_Sub2_1.method6867();
										if (local73 == 255) {
											local73 = -1;
											local438 = -1;
										}
										Static570.method7843(local438, local73);
										Static398.aClass274_115 = null;
										return true;
									} else if (Static172.aClass274_50 == Static398.aClass274_115) {
										local438 = Static313.aClass2_Sub34_Sub2_1.method6911();
										@Pc(2280) int[] local2280 = new int[4];
										for (local453 = 0; local453 < 4; local453++) {
											local2280[local453] = Static313.aClass2_Sub34_Sub2_1.method6879();
										}
										local256 = Static313.aClass2_Sub34_Sub2_1.method6909();
										@Pc(2305) Class2_Sub51 local2305 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local438);
										if (local2305 != null) {
											Static577.method8014(local2280, local2305.aClass11_Sub1_Sub1_Sub2_Sub2_2, local256);
										}
										Static398.aClass274_115 = null;
										return true;
									} else if (Static537.aClass274_152 == Static398.aClass274_115) {
										Static42.method844(Static466.aClass266_3);
										Static398.aClass274_115 = null;
										return true;
									} else if (Static101.aClass274_26 == Static398.aClass274_115) {
										local438 = Static313.aClass2_Sub34_Sub2_1.method6904();
										local73 = Static313.aClass2_Sub34_Sub2_1.method6865();
										Static249.method4058();
										Static34.method772(local73, local438);
										Static398.aClass274_115 = null;
										return true;
									} else if (Static398.aClass274_115 == Static640.aClass274_184) {
										Static42.method844(Static431.aClass266_9);
										Static398.aClass274_115 = null;
										return true;
									} else {
										@Pc(2370) byte local2370;
										if (Static619.aClass274_176 == Static398.aClass274_115) {
											local438 = Static313.aClass2_Sub34_Sub2_1.method6904();
											local2370 = Static313.aClass2_Sub34_Sub2_1.method6917();
											Static249.method4058();
											Static344.method5204(local2370, local438);
											Static398.aClass274_115 = null;
											return true;
										} else if (Static398.aClass274_115 == Static573.aClass274_161) {
											local675 = Static313.aClass2_Sub34_Sub2_1.method6903();
											local73 = Static313.aClass2_Sub34_Sub2_1.method6884();
											local529 = Static249.aClass111_1.method2928(local73).method6312(Static313.aClass2_Sub34_Sub2_1);
											Static278.method4448(null, local73, local675, local675, 19, 0, local675, local529);
											Static398.aClass274_115 = null;
											return true;
										} else {
											@Pc(2497) int local2497;
											@Pc(2430) boolean local2430;
											if (Static609.aClass274_174 == Static398.aClass274_115) {
												local438 = Static313.aClass2_Sub34_Sub2_1.method6904();
												local2430 = (local438 & 0x1) == 1;
												local529 = Static313.aClass2_Sub34_Sub2_1.method6903();
												local1467 = Static313.aClass2_Sub34_Sub2_1.method6903();
												if (local1467.equals("")) {
													local1467 = local529;
												}
												local1469 = Static313.aClass2_Sub34_Sub2_1.method6903();
												local1499 = Static313.aClass2_Sub34_Sub2_1.method6903();
												if (local1499.equals("")) {
													local1499 = local1469;
												}
												if (local2430) {
													for (local2497 = 0; local2497 < Static449.anInt7920; local2497++) {
														if (Static17.aStringArray4[local2497].equals(local1499)) {
															Static7.aStringArray3[local2497] = local529;
															Static17.aStringArray4[local2497] = local1467;
															Static525.aStringArray38[local2497] = local1469;
															Static417.aStringArray29[local2497] = local1499;
															break;
														}
													}
												} else {
													Static7.aStringArray3[Static449.anInt7920] = local529;
													Static17.aStringArray4[Static449.anInt7920] = local1467;
													Static525.aStringArray38[Static449.anInt7920] = local1469;
													Static417.aStringArray29[Static449.anInt7920] = local1499;
													Static575.aBooleanArray48[Static449.anInt7920] = (local438 & 0x2) == 2;
													Static449.anInt7920++;
												}
												Static398.aClass274_115 = null;
												Static207.anInt4343 = Static44.anInt975;
												return true;
											} else if (Static328.aClass274_96 == Static398.aClass274_115) {
												local438 = Static313.aClass2_Sub34_Sub2_1.method6879();
												local73 = Static313.aClass2_Sub34_Sub2_1.method6879();
												Static249.method4058();
												Static496.method7082(local438, local73);
												Static398.aClass274_115 = null;
												return true;
											} else if (Static398.aClass274_115 == Static498.aClass274_139) {
												Static42.method844(Static309.aClass266_7);
												Static398.aClass274_115 = null;
												return true;
											} else if (Static398.aClass274_115 == Static212.aClass274_56) {
												local438 = Static313.aClass2_Sub34_Sub2_1.method6884();
												if (local438 == 65535) {
													local438 = -1;
												}
												local73 = Static313.aClass2_Sub34_Sub2_1.method6909();
												local529 = Static313.aClass2_Sub34_Sub2_1.method6903();
												local256 = Static313.aClass2_Sub34_Sub2_1.method6867();
												if (local256 >= 1 && local256 <= 8) {
													if (local529.equalsIgnoreCase("null")) {
														local529 = null;
													}
													Static182.aStringArray10[local256 - 1] = local529;
													Static117.anIntArray202[local256 - 1] = local438;
													Static433.aBooleanArray39[local256 - 1] = local73 == 0;
												}
												Static398.aClass274_115 = null;
												return true;
											} else {
												@Pc(2687) int local2687;
												if (Static398.aClass274_115 == Static256.aClass274_73) {
													local234 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
													local527 = Static313.aClass2_Sub34_Sub2_1.method6903();
													local529 = local527;
													if (local234) {
														local529 = Static313.aClass2_Sub34_Sub2_1.method6903();
													}
													local1233 = Static313.aClass2_Sub34_Sub2_1.method6884();
													local1238 = Static313.aClass2_Sub34_Sub2_1.method6870();
													local794 = Static313.aClass2_Sub34_Sub2_1.method6904();
													@Pc(2683) long local2683 = local1238 + (local1233 << 32);
													@Pc(2685) boolean local2685 = false;
													local2687 = 0;
													while (true) {
														if (local2687 >= 100) {
															if (local794 <= 1) {
																if (Static95.aBoolean160 && !Static392.aBoolean523 || Static408.aBoolean565) {
																	local2685 = true;
																} else if (Static169.method8417(local529)) {
																	local2685 = true;
																}
															}
															break;
														}
														if (local2683 == Static609.aLongArray15[local2687]) {
															local2685 = true;
															break;
														}
														local2687++;
													}
													if (!local2685 && Static252.anInt4998 == 0) {
														Static609.aLongArray15[Static631.anInt10152] = local2683;
														Static631.anInt10152 = (Static631.anInt10152 + 1) % 100;
														@Pc(2749) String local2749 = Static386.method5817(Static294.method4603(Static313.aClass2_Sub34_Sub2_1));
														if (local794 == 2) {
															Static278.method4448(null, -1, "<img=1>" + local527, "<img=1>" + local529, 7, 0, local527, local2749);
														} else if (local794 == 1) {
															Static278.method4448(null, -1, "<img=0>" + local527, "<img=0>" + local529, 7, 0, local527, local2749);
														} else {
															Static278.method4448(null, -1, local527, local529, 3, 0, local527, local2749);
														}
													}
													Static398.aClass274_115 = null;
													return true;
												}
												@Pc(2843) boolean local2843;
												if (Static398.aClass274_115 == Static509.aClass274_143) {
													local438 = Static313.aClass2_Sub34_Sub2_1.method6884();
													local73 = Static313.aClass2_Sub34_Sub2_1.method6904();
													local2843 = (local73 & 0x1) == 1;
													while (Static313.aClass2_Sub34_Sub2_1.anInt8188 < Static44.anInt971) {
														local256 = Static313.aClass2_Sub34_Sub2_1.method6863();
														local543 = Static313.aClass2_Sub34_Sub2_1.method6884();
														local270 = 0;
														if (local543 != 0) {
															local270 = Static313.aClass2_Sub34_Sub2_1.method6904();
															if (local270 == 255) {
																local270 = Static313.aClass2_Sub34_Sub2_1.method6865();
															}
														}
														Static522.method7304(local543 - 1, local438, local270, local2843, local256);
													}
													Static18.anIntArray46[Static440.anInt7805++ & 0x1F] = local438;
													Static398.aClass274_115 = null;
													return true;
												} else if (Static398.aClass274_115 == Static251.aClass274_69) {
													Static256.aString51 = Static44.anInt971 <= 2 ? Static628.aClass369_26.method8475(Static377.anInt6756) : Static313.aClass2_Sub34_Sub2_1.method6903();
													Static350.anInt6442 = Static44.anInt971 <= 0 ? -1 : Static313.aClass2_Sub34_Sub2_1.method6884();
													Static398.aClass274_115 = null;
													if (Static350.anInt6442 == 65535) {
														Static350.anInt6442 = -1;
													}
													return true;
												} else if (Static490.aClass274_137 == Static398.aClass274_115) {
													Static313.aClass2_Sub34_Sub2_1.anInt8188 += 28;
													if (Static313.aClass2_Sub34_Sub2_1.method6872()) {
														Static69.method1342(Static313.aClass2_Sub34_Sub2_1, Static313.aClass2_Sub34_Sub2_1.anInt8188 - 28);
													}
													Static398.aClass274_115 = null;
													return true;
												} else if (Static398.aClass274_115 == Static367.aClass274_106) {
													Static75.method1450(false);
													Static398.aClass274_115 = null;
													return false;
												} else if (Static398.aClass274_115 == Static585.aClass274_166) {
													if (Static387.anInt6978 != -1) {
														Static446.method6622(0, Static387.anInt6978);
													}
													Static398.aClass274_115 = null;
													return true;
												} else if (Static218.aClass274_57 == Static398.aClass274_115) {
													Static257.method4231();
													Static398.aClass274_115 = null;
													return false;
												} else if (Static596.aClass274_171 == Static398.aClass274_115) {
													Static42.method844(Static551.aClass266_13);
													Static398.aClass274_115 = null;
													return true;
												} else if (Static398.aClass274_115 == Static625.aClass274_178) {
													local438 = Static313.aClass2_Sub34_Sub2_1.method6859();
													local73 = Static313.aClass2_Sub34_Sub2_1.method6865();
													Static438.aClass198_1.method4747(local438, local73);
													Static398.aClass274_115 = null;
													return true;
												} else if (Static277.aClass274_79 == Static398.aClass274_115) {
													Static339.anInt6232 = Static313.aClass2_Sub34_Sub2_1.method6909();
													Static21.anInt688 = Static313.aClass2_Sub34_Sub2_1.method6919();
													Static398.aClass274_115 = null;
													return true;
												} else if (Static61.aClass274_17 == Static398.aClass274_115) {
													local234 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
													local527 = Static313.aClass2_Sub34_Sub2_1.method6903();
													local529 = local527;
													if (local234) {
														local529 = Static313.aClass2_Sub34_Sub2_1.method6903();
													}
													local256 = Static313.aClass2_Sub34_Sub2_1.method6904();
													local758 = false;
													if (local256 <= 1) {
														if (Static95.aBoolean160 && !Static392.aBoolean523 || Static408.aBoolean565) {
															local758 = true;
														} else if (local256 <= 1 && Static169.method8417(local529)) {
															local758 = true;
														}
													}
													if (!local758 && Static252.anInt4998 == 0) {
														local1499 = Static386.method5817(Static294.method4603(Static313.aClass2_Sub34_Sub2_1));
														if (local256 == 2) {
															Static278.method4448(null, -1, "<img=1>" + local527, "<img=1>" + local529, 24, 0, local527, local1499);
														} else if (local256 == 1) {
															Static278.method4448(null, -1, "<img=0>" + local527, "<img=0>" + local529, 24, 0, local527, local1499);
														} else {
															Static278.method4448(null, -1, local527, local529, 24, 0, local527, local1499);
														}
													}
													Static398.aClass274_115 = null;
													return true;
												} else if (Static96.aClass274_24 == Static398.aClass274_115) {
													local438 = Static313.aClass2_Sub34_Sub2_1.method6884();
													if (local438 == 65535) {
														local438 = -1;
													}
													local73 = Static313.aClass2_Sub34_Sub2_1.method6904();
													local453 = Static313.aClass2_Sub34_Sub2_1.method6884();
													local256 = Static313.aClass2_Sub34_Sub2_1.method6904();
													Static411.method6320(256, local438, local256, local73, true, local453);
													Static398.aClass274_115 = null;
													return true;
												} else if (Static527.aClass274_145 == Static398.aClass274_115) {
													local438 = Static313.aClass2_Sub34_Sub2_1.method6919();
													Static249.method4058();
													Static398.aClass274_115 = null;
													Static323.anInt5856 = local438;
													return true;
												} else if (Static398.aClass274_115 == Static443.aClass274_126) {
													local438 = Static313.aClass2_Sub34_Sub2_1.method6884();
													local73 = Static313.aClass2_Sub34_Sub2_1.method6904();
													local2843 = (local73 & 0x1) == 1;
													Static564.method6886(local438, local2843);
													local256 = Static313.aClass2_Sub34_Sub2_1.method6884();
													for (local543 = 0; local543 < local256; local543++) {
														local270 = Static313.aClass2_Sub34_Sub2_1.method6884();
														local2497 = Static313.aClass2_Sub34_Sub2_1.method6909();
														if (local2497 == 255) {
															local2497 = Static313.aClass2_Sub34_Sub2_1.method6898();
														}
														Static522.method7304(local270 - 1, local438, local2497, local2843, local543);
													}
													Static18.anIntArray46[Static440.anInt7805++ & 0x1F] = local438;
													Static398.aClass274_115 = null;
													return true;
												} else if (Static451.aClass274_128 == Static398.aClass274_115) {
													local438 = Static313.aClass2_Sub34_Sub2_1.method6893();
													local73 = local438 >> 28 & 0x3;
													local453 = local438 >> 14 & 0x3FFF;
													local256 = local438 & 0x3FFF;
													local543 = Static313.aClass2_Sub34_Sub2_1.method6859();
													if (local543 == 65535) {
														local543 = -1;
													}
													local270 = Static313.aClass2_Sub34_Sub2_1.method6909();
													local2497 = local270 >> 2;
													local794 = local270 & 0x3;
													local453 -= Static451.anInt7933;
													local367 = Static473.anIntArray552[local2497];
													local256 -= Static470.anInt8063;
													Static186.method3336(local543, local794, local453, local256, local2497, local73, local367);
													Static398.aClass274_115 = null;
													return true;
												} else if (Static343.aClass274_100 == Static398.aClass274_115) {
													local675 = Static313.aClass2_Sub34_Sub2_1.method6903();
													@Pc(3386) Object[] local3386 = new Object[local675.length() + 1];
													for (local453 = local675.length() - 1; local453 >= 0; local453--) {
														if (local675.charAt(local453) == 's') {
															local3386[local453 + 1] = Static313.aClass2_Sub34_Sub2_1.method6903();
														} else {
															local3386[local453 + 1] = Integer.valueOf(Static313.aClass2_Sub34_Sub2_1.method6865());
														}
													}
													local3386[0] = Integer.valueOf(Static313.aClass2_Sub34_Sub2_1.method6865());
													Static249.method4058();
													@Pc(3438) Class2_Sub42 local3438 = new Class2_Sub42();
													local3438.anObjectArray33 = local3386;
													Static639.method8539(local3438);
													Static398.aClass274_115 = null;
													return true;
												} else if (Static233.aClass274_63 == Static398.aClass274_115) {
													Static42.method844(Static290.aClass266_6);
													Static398.aClass274_115 = null;
													return true;
												} else if (Static398.aClass274_115 == Static369.aClass274_107) {
													local438 = Static313.aClass2_Sub34_Sub2_1.method6879();
													Static249.method4058();
													Static621.method8440(local438);
													Static398.aClass274_115 = null;
													return true;
												} else if (Static436.aClass274_123 == Static398.aClass274_115) {
													local438 = Static313.aClass2_Sub34_Sub2_1.method6904();
													if (Static313.aClass2_Sub34_Sub2_1.method6904() == 0) {
														Static470.aClass37Array1[local438] = new Class37();
													} else {
														Static313.aClass2_Sub34_Sub2_1.anInt8188--;
														Static470.aClass37Array1[local438] = new Class37(Static313.aClass2_Sub34_Sub2_1);
													}
													Static181.anInt4008 = Static44.anInt975;
													Static398.aClass274_115 = null;
													return true;
												} else {
													@Pc(3569) int local3569;
													@Pc(3567) boolean local3567;
													if (Static423.aClass274_175 == Static398.aClass274_115) {
														local234 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
														local527 = Static313.aClass2_Sub34_Sub2_1.method6903();
														local529 = local527;
														if (local234) {
															local529 = Static313.aClass2_Sub34_Sub2_1.method6903();
														}
														local1233 = Static313.aClass2_Sub34_Sub2_1.method6884();
														local1238 = Static313.aClass2_Sub34_Sub2_1.method6870();
														local794 = Static313.aClass2_Sub34_Sub2_1.method6904();
														local367 = Static313.aClass2_Sub34_Sub2_1.method6884();
														@Pc(3565) long local3565 = (local1233 << 32) + local1238;
														local3567 = false;
														local3569 = 0;
														while (true) {
															if (local3569 >= 100) {
																if (local794 <= 1 && Static169.method8417(local529)) {
																	local3567 = true;
																}
																break;
															}
															if (local3565 == Static609.aLongArray15[local3569]) {
																local3567 = true;
																break;
															}
															local3569++;
														}
														if (!local3567 && Static252.anInt4998 == 0) {
															Static609.aLongArray15[Static631.anInt10152] = local3565;
															Static631.anInt10152 = (Static631.anInt10152 + 1) % 100;
															@Pc(3621) String local3621 = Static249.aClass111_1.method2928(local367).method6312(Static313.aClass2_Sub34_Sub2_1);
															if (local794 == 2) {
																Static278.method4448(null, local367, "<img=1>" + local527, "<img=1>" + local529, 18, 0, local527, local3621);
															} else if (local794 == 1) {
																Static278.method4448(null, local367, "<img=0>" + local527, "<img=0>" + local529, 18, 0, local527, local3621);
															} else {
																Static278.method4448(null, local367, local527, local529, 18, 0, local527, local3621);
															}
														}
														Static398.aClass274_115 = null;
														return true;
													} else if (Static398.aClass274_115 == Static461.aClass274_129) {
														@Pc(3764) boolean local3764;
														while (Static44.anInt971 > Static313.aClass2_Sub34_Sub2_1.anInt8188) {
															local234 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
															local527 = Static313.aClass2_Sub34_Sub2_1.method6903();
															local529 = Static313.aClass2_Sub34_Sub2_1.method6903();
															local256 = Static313.aClass2_Sub34_Sub2_1.method6884();
															local543 = Static313.aClass2_Sub34_Sub2_1.method6904();
															local1499 = "";
															local372 = false;
															if (local256 > 0) {
																local1499 = Static313.aClass2_Sub34_Sub2_1.method6903();
																local372 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
															}
															for (local794 = 0; local794 < Static446.anInt7901; local794++) {
																if (local234) {
																	if (local529.equals(Static391.aStringArray25[local794])) {
																		Static391.aStringArray25[local794] = local527;
																		Static488.aStringArray35[local794] = local529;
																		local527 = null;
																		break;
																	}
																} else if (local527.equals(Static391.aStringArray25[local794])) {
																	if (Static59.anIntArray128[local794] != local256) {
																		local3764 = true;
																		for (@Pc(3769) Class11_Sub5_Sub2 local3769 = (Class11_Sub5_Sub2) Static263.aClass143_6.method3536(); local3769 != null; local3769 = (Class11_Sub5_Sub2) Static263.aClass143_6.method3528()) {
																			if (local3769.aString57.equals(local527)) {
																				if (local256 != 0 && local3769.aShort84 == 0) {
																					local3764 = false;
																					local3769.method8372();
																				} else if (local256 == 0 && local3769.aShort84 != 0) {
																					local3769.method8372();
																					local3764 = false;
																				}
																			}
																		}
																		if (local3764) {
																			Static263.aClass143_6.method3529(new Class11_Sub5_Sub2(local527, local256));
																		}
																		Static59.anIntArray128[local794] = local256;
																	}
																	Static488.aStringArray35[local794] = local529;
																	Static365.aStringArray23[local794] = local1499;
																	Static22.anIntArray731[local794] = local543;
																	Static446.aBooleanArray41[local794] = local372;
																	local527 = null;
																	break;
																}
															}
															if (local527 != null && Static446.anInt7901 < 200) {
																Static391.aStringArray25[Static446.anInt7901] = local527;
																Static488.aStringArray35[Static446.anInt7901] = local529;
																Static59.anIntArray128[Static446.anInt7901] = local256;
																Static365.aStringArray23[Static446.anInt7901] = local1499;
																Static22.anIntArray731[Static446.anInt7901] = local543;
																Static446.aBooleanArray41[Static446.anInt7901] = local372;
																Static446.anInt7901++;
															}
														}
														Static384.anInt6890 = 2;
														Static207.anInt4343 = Static44.anInt975;
														local73 = Static446.anInt7901;
														while (local73 > 0) {
															local234 = true;
															local73--;
															for (local453 = 0; local453 < local73; local453++) {
																if (Static59.anIntArray128[local453] != Static460.aClass322_3.anInt9045 && Static59.anIntArray128[local453 + 1] == Static460.aClass322_3.anInt9045 || Static59.anIntArray128[local453] == 0 && Static59.anIntArray128[local453 + 1] != 0) {
																	local256 = Static59.anIntArray128[local453];
																	Static59.anIntArray128[local453] = Static59.anIntArray128[local453 + 1];
																	Static59.anIntArray128[local453 + 1] = local256;
																	local1469 = Static365.aStringArray23[local453];
																	Static365.aStringArray23[local453] = Static365.aStringArray23[local453 + 1];
																	Static365.aStringArray23[local453 + 1] = local1469;
																	local1499 = Static391.aStringArray25[local453];
																	Static391.aStringArray25[local453] = Static391.aStringArray25[local453 + 1];
																	Static391.aStringArray25[local453 + 1] = local1499;
																	local568 = Static488.aStringArray35[local453];
																	Static488.aStringArray35[local453] = Static488.aStringArray35[local453 + 1];
																	Static488.aStringArray35[local453 + 1] = local568;
																	local794 = Static22.anIntArray731[local453];
																	Static22.anIntArray731[local453] = Static22.anIntArray731[local453 + 1];
																	Static22.anIntArray731[local453 + 1] = local794;
																	local3764 = Static446.aBooleanArray41[local453];
																	Static446.aBooleanArray41[local453] = Static446.aBooleanArray41[local453 + 1];
																	Static446.aBooleanArray41[local453 + 1] = local3764;
																	local234 = false;
																}
															}
															if (local234) {
																break;
															}
														}
														Static398.aClass274_115 = null;
														return true;
													} else if (Static243.aClass274_65 == Static398.aClass274_115) {
														local438 = Static313.aClass2_Sub34_Sub2_1.method6884();
														local73 = Static313.aClass2_Sub34_Sub2_1.method6904();
														Static249.method4058();
														Static536.method7488(true, local73, local438);
														Static398.aClass274_115 = null;
														return true;
													} else if (Static398.aClass274_115 == Static298.aClass274_88) {
														Static134.method2606(Static44.anInt971, Static313.aClass2_Sub34_Sub2_1, Static375.aClass359_4);
														Static398.aClass274_115 = null;
														return true;
													} else if (Static353.aClass274_102 == Static398.aClass274_115) {
														Static384.anInt6890 = 1;
														Static398.aClass274_115 = null;
														Static207.anInt4343 = Static44.anInt975;
														return true;
													} else {
														@Pc(4187) Class2_Sub40 local4187;
														@Pc(4178) Class2_Sub40 local4178;
														if (Static398.aClass274_115 == Static631.aClass274_181) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6859();
															if (local438 == 65535) {
																local438 = -1;
															}
															local73 = Static313.aClass2_Sub34_Sub2_1.method6896();
															local453 = Static313.aClass2_Sub34_Sub2_1.method6879();
															if (local453 == 65535) {
																local453 = -1;
															}
															local256 = Static313.aClass2_Sub34_Sub2_1.method6896();
															Static249.method4058();
															for (local543 = local438; local543 <= local453; local543++) {
																local1238 = (long) local543 + ((long) local256 << 32);
																local4178 = (Class2_Sub40) Static297.aClass222_20.method5468(local1238);
																if (local4178 != null) {
																	local4187 = new Class2_Sub40(local73, local4178.anInt7657);
																	local4178.method8599();
																} else if (local543 == -1) {
																	local4187 = new Class2_Sub40(local73, Static180.method3291(local256).aClass2_Sub40_1.anInt7657);
																} else {
																	local4187 = new Class2_Sub40(local73, -1);
																}
																Static297.aClass222_20.method5476(local4187, local1238);
															}
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static583.aClass274_164) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6911();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6859();
															local453 = Static313.aClass2_Sub34_Sub2_1.method6898();
															local256 = Static313.aClass2_Sub34_Sub2_1.method6884();
															Static249.method4058();
															Static559.method7759(local438, local453, local256, local73);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static534.aClass274_150 == Static398.aClass274_115) {
															Static42.method844(Static237.aClass266_4);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static580.aClass274_163 == Static398.aClass274_115) {
															local675 = Static313.aClass2_Sub34_Sub2_1.method6903();
															local2843 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
															if (local2843) {
																local527 = Static313.aClass2_Sub34_Sub2_1.method6903();
															} else {
																local527 = local675;
															}
															local256 = Static313.aClass2_Sub34_Sub2_1.method6884();
															@Pc(4303) byte local4303 = Static313.aClass2_Sub34_Sub2_1.method6908();
															local545 = false;
															if (local4303 == -128) {
																local545 = true;
															}
															if (local545) {
																if (Static531.anInt8877 == 0) {
																	Static398.aClass274_115 = null;
																	return true;
																}
																for (local2497 = 0; Static531.anInt8877 > local2497 && (!Static561.aClass345Array1[local2497].aString85.equals(local527) || local256 != Static561.aClass345Array1[local2497].anInt9540); local2497++) {
																}
																if (local2497 < Static531.anInt8877) {
																	while (Static531.anInt8877 - 1 > local2497) {
																		Static561.aClass345Array1[local2497] = Static561.aClass345Array1[local2497 + 1];
																		local2497++;
																	}
																	Static531.anInt8877--;
																	Static561.aClass345Array1[Static531.anInt8877] = null;
																}
															} else {
																local568 = Static313.aClass2_Sub34_Sub2_1.method6903();
																local395 = new Class345();
																local395.aString87 = local675;
																local395.aString85 = local527;
																local395.aString86 = Static70.method1355(local395.aString85);
																local395.anInt9540 = local256;
																local395.aByte117 = local4303;
																local395.aString88 = local568;
																for (local367 = Static531.anInt8877 - 1; local367 >= 0; local367--) {
																	local374 = Static561.aClass345Array1[local367].aString86.compareTo(local395.aString86);
																	if (local374 == 0) {
																		Static561.aClass345Array1[local367].anInt9540 = local256;
																		Static561.aClass345Array1[local367].aByte117 = local4303;
																		Static561.aClass345Array1[local367].aString88 = local568;
																		if (local527.equals(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString4)) {
																			Static612.aByte126 = local4303;
																		}
																		Static229.anInt4654 = Static44.anInt975;
																		Static398.aClass274_115 = null;
																		return true;
																	}
																	if (local374 < 0) {
																		break;
																	}
																}
																if (Static531.anInt8877 >= Static561.aClass345Array1.length) {
																	Static398.aClass274_115 = null;
																	return true;
																}
																for (local374 = Static531.anInt8877 - 1; local374 > local367; local374--) {
																	Static561.aClass345Array1[local374 + 1] = Static561.aClass345Array1[local374];
																}
																if (Static531.anInt8877 == 0) {
																	Static561.aClass345Array1 = new Class345[100];
																}
																Static561.aClass345Array1[local367 + 1] = local395;
																Static531.anInt8877++;
																if (local527.equals(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString4)) {
																	Static612.aByte126 = local4303;
																}
															}
															Static229.anInt4654 = Static44.anInt975;
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static18.aClass274_7) {
															@Pc(4537) byte local4537 = Static313.aClass2_Sub34_Sub2_1.method6905();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6879();
															Static249.method4058();
															Static525.method7331(local73, local4537);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static532.aClass274_147) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6893();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6865();
															local453 = Static313.aClass2_Sub34_Sub2_1.method6911();
															Static249.method4058();
															Static193.method3435(local438, local453, 5, local73);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static304.aClass274_90 == Static398.aClass274_115) {
															Static398.aClass274_115 = null;
															return false;
														} else if (Static171.aClass274_49 == Static398.aClass274_115) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6867();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6859();
															Static249.method4058();
															if (local438 == 2) {
																Static199.method3504();
															}
															Static387.anInt6978 = local73;
															Static365.method5555(local73);
															Static146.method2807(false);
															Static639.method8547(Static387.anInt6978);
															for (local453 = 0; local453 < 100; local453++) {
																Static618.aBooleanArray50[local453] = true;
															}
															Static398.aClass274_115 = null;
															return true;
														} else if (Static191.aClass274_97 == Static398.aClass274_115) {
															Static511.anInt7699 = Static313.aClass2_Sub34_Sub2_1.method6904();
															Static398.aClass274_115 = null;
															return true;
														} else if (Static560.aClass274_157 == Static398.aClass274_115) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6879();
															Static249.method4058();
															Static179.method3289(local438);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static249.aClass274_68 == Static398.aClass274_115) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6898();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6884();
															if (local73 == 65535) {
																local73 = -1;
															}
															local453 = Static313.aClass2_Sub34_Sub2_1.method6859();
															if (local453 == 65535) {
																local453 = -1;
															}
															local256 = Static313.aClass2_Sub34_Sub2_1.method6859();
															Static249.method4058();
															for (local543 = local453; local543 <= local73; local543++) {
																local1238 = (long) local543 + ((long) local438 << 32);
																local4178 = (Class2_Sub40) Static297.aClass222_20.method5468(local1238);
																if (local4178 != null) {
																	local4187 = new Class2_Sub40(local4178.anInt7661, local256);
																	local4178.method8599();
																} else if (local543 == -1) {
																	local4187 = new Class2_Sub40(Static180.method3291(local438).aClass2_Sub40_1.anInt7661, local256);
																} else {
																	local4187 = new Class2_Sub40(0, local256);
																}
																Static297.aClass222_20.method5476(local4187, local1238);
															}
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static263.aClass274_76) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6865();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6884();
															Static249.method4058();
															Static525.method7331(local73, local438);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static577.aClass274_162) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6880();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6898();
															Static249.method4058();
															Static128.method2528(local438, local73);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static17.aClass274_6 == Static398.aClass274_115) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6896();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6859();
															Static249.method4058();
															Static484.method6946(local73, local438);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static285.aClass274_85) {
															Static249.method4058();
															Static306.method4190();
															Static398.aClass274_115 = null;
															return true;
														} else if (Static533.aClass274_148 == Static398.aClass274_115) {
															if (Static275.aFrame2 != null) {
																Static227.method3850(Static404.aClass2_Sub13_2.aClass33_Sub7_2.method3189(), false, -1, -1);
															}
															@Pc(4855) byte[] local4855 = new byte[Static44.anInt971];
															Static313.aClass2_Sub34_Sub2_1.method6930(local4855, Static44.anInt971);
															local527 = Static307.method4720(local4855, Static44.anInt971, 0);
															Static382.method5748(local527, Static375.aClass359_4, Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() == 1, true);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static541.aClass274_154) {
															Static535.method7476(Static313.aClass2_Sub34_Sub2_1.method6903());
															Static398.aClass274_115 = null;
															return true;
														} else if (Static474.aClass274_131 == Static398.aClass274_115) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6896();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6884();
															Static438.aClass198_1.method4749(local438, local73);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static107.aClass274_27) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6884();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6896();
															local453 = Static313.aClass2_Sub34_Sub2_1.method6859();
															local256 = Static313.aClass2_Sub34_Sub2_1.method6859();
															Static249.method4058();
															Static193.method3435(local73, local453 | local256 << 16, 7, local438);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static153.aClass274_41 == Static398.aClass274_115) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6898();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6911();
															Static249.method4058();
															Static399.method6040(local73, local438);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static395.aClass274_40 == Static398.aClass274_115) {
															Static32.method750();
															Static398.aClass274_115 = null;
															return true;
														} else if (Static7.aClass274_2 == Static398.aClass274_115) {
															Static276.method4437();
															Static398.aClass274_115 = null;
															return false;
														} else if (Static161.aClass274_48 == Static398.aClass274_115) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6884();
															if (local438 == 65535) {
																local438 = -1;
															}
															local73 = Static313.aClass2_Sub34_Sub2_1.method6904();
															local453 = Static313.aClass2_Sub34_Sub2_1.method6884();
															local256 = Static313.aClass2_Sub34_Sub2_1.method6904();
															local543 = Static313.aClass2_Sub34_Sub2_1.method6884();
															Static447.method6629(local543, local73, local256, local438, local453);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static32.aClass274_11) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6884();
															if (local438 == 65535) {
																local438 = -1;
															}
															local73 = Static313.aClass2_Sub34_Sub2_1.method6896();
															Static249.method4058();
															Static193.method3435(local73, local438, 2, -1);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static483.aClass274_134) {
															for (local438 = 0; local438 < Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1.length; local438++) {
																if (Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local438] != null) {
																	Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local438].anIntArray226 = null;
																	Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local438].anInt3258 = -1;
																}
															}
															for (local73 = 0; local73 < Static225.anInt4616; local73++) {
																Static86.aClass2_Sub51Array1[local73].aClass11_Sub1_Sub1_Sub2_Sub2_2.anIntArray226 = null;
																Static86.aClass2_Sub51Array1[local73].aClass11_Sub1_Sub1_Sub2_Sub2_2.anInt3258 = -1;
															}
															Static398.aClass274_115 = null;
															return true;
														} else if (Static505.aClass274_142 == Static398.aClass274_115) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6867();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6884() << 2;
															local453 = Static313.aClass2_Sub34_Sub2_1.method6867();
															local256 = Static313.aClass2_Sub34_Sub2_1.method6867();
															local543 = Static313.aClass2_Sub34_Sub2_1.method6904();
															Static249.method4058();
															Static625.method8454(local73, local256, local543, local438, local453);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static116.aClass274_30 == Static398.aClass274_115) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6911();
															local2370 = Static313.aClass2_Sub34_Sub2_1.method6873();
															Static438.aClass198_1.method4747(local438, local2370);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static328.aClass274_95) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6898();
															Static249.method4058();
															if (local438 == -1) {
																Static644.anInt10296 = -1;
																Static23.anInt718 = -1;
															} else {
																local73 = local438 >> 14 & 0x3FFF;
																local453 = local438 & 0x3FFF;
																local73 -= Static451.anInt7933;
																local453 -= Static470.anInt8063;
																if (local73 < 0) {
																	local73 = 0;
																} else if (Static3.anInt46 <= local73) {
																	local73 = Static3.anInt46;
																}
																if (local453 < 0) {
																	local453 = 0;
																} else if (local453 >= Static270.anInt5194) {
																	local453 = Static270.anInt5194;
																}
																Static23.anInt718 = (local73 << 9) + 256;
																Static644.anInt10296 = (local453 << 9) + 256;
															}
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static417.aClass274_118) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6884();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6884();
															local453 = Static313.aClass2_Sub34_Sub2_1.method6884();
															Static249.method4058();
															if (Static399.aClass78ArrayArray1[local438] != null) {
																for (local256 = local73; local256 < local453; local256++) {
																	local543 = Static313.aClass2_Sub34_Sub2_1.method6870();
																	if (Static399.aClass78ArrayArray1[local438].length > local256 && Static399.aClass78ArrayArray1[local438][local256] != null) {
																		Static399.aClass78ArrayArray1[local438][local256].anInt1942 = local543;
																	}
																}
															}
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static311.aClass274_91) {
															Static367.anInt6583 = Static313.aClass2_Sub34_Sub2_1.method6904();
															Static228.anInt4648 = Static313.aClass2_Sub34_Sub2_1.method6905() << 3;
															Static523.anInt8742 = Static313.aClass2_Sub34_Sub2_1.method6917() << 3;
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static285.aClass274_84) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6919();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6911();
															local2843 = (local438 & 0x1) == 1;
															Static480.method6929(local73, local2843);
															Static18.anIntArray46[Static440.anInt7805++ & 0x1F] = local73;
															Static398.aClass274_115 = null;
															return true;
														} else if (Static277.aClass274_80 == Static398.aClass274_115) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6879();
															local73 = Static313.aClass2_Sub34_Sub2_1.method6909();
															Static438.aClass198_1.method4749(local73, local438);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static584.aClass274_165 == Static398.aClass274_115) {
															Static85.anInt1779 = Static313.aClass2_Sub34_Sub2_1.method6875();
															Static95.aBoolean160 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static435.aClass274_122) {
															Static42.method844(Static269.aClass266_5);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static134.aClass274_34) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6879();
															if (local438 == 65535) {
																local438 = -1;
															}
															local73 = Static313.aClass2_Sub34_Sub2_1.method6896();
															Static249.method4058();
															Static193.method3435(local73, local438, 1, -1);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static631.aClass274_182 == Static398.aClass274_115) {
															local438 = Static313.aClass2_Sub34_Sub2_1.method6884();
															if (local438 == 65535) {
																local438 = -1;
															}
															local73 = Static313.aClass2_Sub34_Sub2_1.method6904();
															local453 = Static313.aClass2_Sub34_Sub2_1.method6884();
															local256 = Static313.aClass2_Sub34_Sub2_1.method6904();
															local543 = Static313.aClass2_Sub34_Sub2_1.method6884();
															Static411.method6320(local543, local438, local256, local73, false, local453);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static489.aClass274_135) {
															local234 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
															@Pc(5521) byte[] local5521 = new byte[Static44.anInt971 - 1];
															Static313.aClass2_Sub34_Sub2_1.method6891(local5521, Static44.anInt971 - 1, 0);
															Static108.method1812(local234, local5521);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static431.aClass274_120 == Static398.aClass274_115) {
															local73 = Static313.aClass2_Sub34_Sub2_1.method6865();
															local453 = Static313.aClass2_Sub34_Sub2_1.method6884();
															local256 = Static313.aClass2_Sub34_Sub2_1.method6884();
															local543 = Static313.aClass2_Sub34_Sub2_1.method6904();
															local270 = Static313.aClass2_Sub34_Sub2_1.method6879();
															local372 = (local543 & 0x80) != 0;
															local794 = local543 & 0x7;
															local367 = local543 >> 3 & 0xF;
															if (local367 == 15) {
																local367 = -1;
															}
															if (local73 >> 30 == 0) {
																@Pc(5775) Class149 local5775;
																@Pc(5755) Class69 local5755;
																@Pc(5769) Class149 local5769;
																if (local73 >> 29 != 0) {
																	local374 = local73 & 0xFFFF;
																	@Pc(6007) Class2_Sub51 local6007 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local374);
																	if (local6007 != null) {
																		@Pc(6012) Class11_Sub1_Sub1_Sub2_Sub2 local6012 = local6007.aClass11_Sub1_Sub1_Sub2_Sub2_2;
																		if (local256 == 65535) {
																			local256 = -1;
																		}
																		local1255 = true;
																		local1257 = local372 ? local6012.anInt3229 : local6012.anInt3270;
																		if (local256 != -1 && local1257 != -1) {
																			if (local1257 == local256) {
																				local5755 = Static414.aClass356_2.method8213(local256);
																				if (local5755.aBoolean152 && local5755.anInt1820 != -1) {
																					local5769 = Static185.aClass303_1.method7201(local5755.anInt1820);
																					@Pc(6103) int local6103 = local5769.anInt4516;
																					if (local6103 == 0 || local6103 == 2) {
																						local1255 = false;
																					} else if (local6103 == 1) {
																						local1255 = true;
																					}
																				}
																			} else {
																				local5755 = Static414.aClass356_2.method8213(local256);
																				@Pc(6048) Class69 local6048 = Static414.aClass356_2.method8213(local1257);
																				if (local5755.anInt1820 != -1 && local6048.anInt1820 != -1) {
																					local5775 = Static185.aClass303_1.method7201(local5755.anInt1820);
																					@Pc(6068) Class149 local6068 = Static185.aClass303_1.method7201(local6048.anInt1820);
																					if (local5775.anInt4518 < local6068.anInt4518) {
																						local1255 = false;
																					}
																				}
																			}
																		}
																		if (local1255) {
																			if (local372) {
																				local6012.anInt3229 = local256;
																				local6012.anInt3244 = local453;
																				local6012.anInt3208 = 0;
																				local6012.anInt3210 = 0;
																				local6012.anInt3218 = local367;
																				local6012.anInt3247 = local794;
																				local6012.anInt3231 = 1;
																				local6012.anInt3221 = local270 + Static325.anInt5888;
																				if (local6012.anInt3221 > Static325.anInt5888) {
																					local6012.anInt3208 = -1;
																				}
																				if (local6012.anInt3229 != -1 && local6012.anInt3221 == Static325.anInt5888) {
																					local1606 = Static414.aClass356_2.method8213(local6012.anInt3229).anInt1820;
																					if (local1606 != -1) {
																						local5769 = Static185.aClass303_1.method7201(local1606);
																						if (local5769 != null && local5769.anIntArray308 != null && !local6012.aBoolean276) {
																							Static330.method3630(0, local5769, local6012);
																						}
																					}
																				}
																			} else {
																				local6012.anInt3268 = local453;
																				local6012.anInt3227 = 0;
																				local6012.anInt3230 = local794;
																				local6012.anInt3273 = Static325.anInt5888 + local270;
																				local6012.anInt3214 = 0;
																				local6012.anInt3270 = local256;
																				local6012.anInt3254 = 1;
																				local6012.anInt3242 = local367;
																				if (local6012.anInt3273 > Static325.anInt5888) {
																					local6012.anInt3214 = -1;
																				}
																				if (local6012.anInt3270 != -1 && local6012.anInt3273 == Static325.anInt5888) {
																					local1606 = Static414.aClass356_2.method8213(local6012.anInt3270).anInt1820;
																					if (local1606 != -1) {
																						local5769 = Static185.aClass303_1.method7201(local1606);
																						if (local5769 != null && local5769.anIntArray308 != null && !local6012.aBoolean276) {
																							Static330.method3630(0, local5769, local6012);
																						}
																					}
																				}
																			}
																		}
																	}
																} else if (local73 >> 28 != 0) {
																	local374 = local73 & 0xFFFF;
																	@Pc(5708) Class11_Sub1_Sub1_Sub2_Sub1 local5708;
																	if (Static182.anInt4021 == local374) {
																		local5708 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2;
																	} else {
																		local5708 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local374];
																	}
																	if (local5708 != null) {
																		if (local256 == 65535) {
																			local256 = -1;
																		}
																		local3567 = true;
																		local3569 = local372 ? local5708.anInt3229 : local5708.anInt3270;
																		@Pc(5807) Class149 local5807;
																		if (local256 != -1 && local3569 != -1) {
																			@Pc(5750) Class69 local5750;
																			if (local3569 == local256) {
																				local5750 = Static414.aClass356_2.method8213(local256);
																				if (local5750.aBoolean152 && local5750.anInt1820 != -1) {
																					local5807 = Static185.aClass303_1.method7201(local5750.anInt1820);
																					@Pc(5810) int local5810 = local5807.anInt4516;
																					if (local5810 == 0 || local5810 == 2) {
																						local3567 = false;
																					} else if (local5810 == 1) {
																						local3567 = true;
																					}
																				}
																			} else {
																				local5750 = Static414.aClass356_2.method8213(local256);
																				local5755 = Static414.aClass356_2.method8213(local3569);
																				if (local5750.anInt1820 != -1 && local5755.anInt1820 != -1) {
																					local5769 = Static185.aClass303_1.method7201(local5750.anInt1820);
																					local5775 = Static185.aClass303_1.method7201(local5755.anInt1820);
																					if (local5775.anInt4518 > local5769.anInt4518) {
																						local3567 = false;
																					}
																				}
																			}
																		}
																		if (local3567) {
																			if (local372) {
																				local5708.anInt3210 = 0;
																				local5708.anInt3247 = local794;
																				local5708.anInt3218 = local367;
																				local5708.anInt3244 = local453;
																				local5708.anInt3229 = local256;
																				local5708.anInt3208 = 0;
																				local5708.anInt3231 = 1;
																				local5708.anInt3221 = local270 + Static325.anInt5888;
																				if (local5708.anInt3221 > Static325.anInt5888) {
																					local5708.anInt3208 = -1;
																				}
																				if (local5708.anInt3229 == 65535) {
																					local5708.anInt3229 = -1;
																				}
																				if (local5708.anInt3229 != -1 && local5708.anInt3221 == Static325.anInt5888) {
																					local1257 = Static414.aClass356_2.method8213(local5708.anInt3229).anInt1820;
																					if (local1257 != -1) {
																						local5807 = Static185.aClass303_1.method7201(local1257);
																						if (local5807 != null && local5807.anIntArray308 != null && !local5708.aBoolean276) {
																							Static330.method3630(0, local5807, local5708);
																						}
																					}
																				}
																			} else {
																				local5708.anInt3254 = 1;
																				local5708.anInt3273 = Static325.anInt5888 + local270;
																				local5708.anInt3227 = 0;
																				local5708.anInt3214 = 0;
																				local5708.anInt3242 = local367;
																				local5708.anInt3270 = local256;
																				local5708.anInt3230 = local794;
																				local5708.anInt3268 = local453;
																				if (Static325.anInt5888 < local5708.anInt3273) {
																					local5708.anInt3214 = -1;
																				}
																				if (local5708.anInt3270 == 65535) {
																					local5708.anInt3270 = -1;
																				}
																				if (local5708.anInt3270 != -1 && local5708.anInt3273 == Static325.anInt5888) {
																					local1257 = Static414.aClass356_2.method8213(local5708.anInt3270).anInt1820;
																					if (local1257 != -1) {
																						local5807 = Static185.aClass303_1.method7201(local1257);
																						if (local5807 != null && local5807.anIntArray308 != null && !local5708.aBoolean276) {
																							Static330.method3630(0, local5807, local5708);
																						}
																					}
																				}
																			}
																		}
																	}
																}
															} else {
																local374 = local73 >> 28 & 0x3;
																local1595 = (local73 >> 14 & 0x3FFF) - Static451.anInt7933;
																local2687 = (local73 & 0x3FFF) - Static470.anInt8063;
																if (local1595 >= 0 && local2687 >= 0 && local1595 < Static3.anInt46 && Static270.anInt5194 > local2687) {
																	local3569 = local1595 * 512 + 256;
																	local1257 = local2687 * 512 + 256;
																	local1606 = local374;
																	if (local374 < 3 && Static471.method6782(local2687, local1595)) {
																		local1606 = local374 + 1;
																	}
																	@Pc(5680) Class11_Sub1_Sub1_Sub4 local5680 = new Class11_Sub1_Sub1_Sub4(local256, local270, Static325.anInt5888, local374, local1606, local3569, Static582.method8038(local374, local3569, local1257) - local453, local1257, local1595, local1595, local2687, local2687, local794);
																	Static147.aClass238_25.method5837(new Class2_Sub5_Sub1(local5680));
																}
															}
															Static398.aClass274_115 = null;
															return true;
														} else if (Static476.aClass274_132 == Static398.aClass274_115) {
															local73 = Static313.aClass2_Sub34_Sub2_1.method6867();
															local453 = Static313.aClass2_Sub34_Sub2_1.method6884() << 2;
															local256 = Static313.aClass2_Sub34_Sub2_1.method6919();
															local543 = Static313.aClass2_Sub34_Sub2_1.method6909();
															local270 = Static313.aClass2_Sub34_Sub2_1.method6909();
															Static249.method4058();
															Static265.method4296(local453, local543, local73, local256, true, local270);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static254.aClass274_71 == Static398.aClass274_115) {
															Static228.anInt4648 = Static313.aClass2_Sub34_Sub2_1.method6873() << 3;
															Static523.anInt8742 = Static313.aClass2_Sub34_Sub2_1.method6905() << 3;
															Static367.anInt6583 = Static313.aClass2_Sub34_Sub2_1.method6904();
															for (@Pc(6347) Class2_Sub44 local6347 = (Class2_Sub44) Static64.aClass222_5.method5474(); local6347 != null; local6347 = (Class2_Sub44) Static64.aClass222_5.method5472()) {
																local453 = (int) (local6347.aLong287 >> 28 & 0x3L);
																local256 = (int) (local6347.aLong287 & 0x3FFFL);
																local543 = local256 - Static451.anInt7933;
																local270 = (int) (local6347.aLong287 >> 14 & 0x3FFFL);
																local2497 = local270 - Static470.anInt8063;
																if (local453 == Static367.anInt6583 && local543 >= Static228.anInt4648 && Static228.anInt4648 + 8 > local543 && Static523.anInt8742 <= local2497 && Static523.anInt8742 + 8 > local2497) {
																	local6347.method8599();
																	if (local543 >= 0 && local2497 >= 0 && local543 < Static3.anInt46 && local2497 < Static270.anInt5194) {
																		Static228.method3855(Static367.anInt6583, local543, local2497);
																	}
																}
															}
															for (@Pc(6451) Class2_Sub3 local6451 = (Class2_Sub3) Static234.aClass238_27.method5833(); local6451 != null; local6451 = (Class2_Sub3) Static234.aClass238_27.method5838()) {
																if (Static228.anInt4648 <= local6451.anInt296 && Static228.anInt4648 + 8 > local6451.anInt296 && Static523.anInt8742 <= local6451.anInt286 && Static523.anInt8742 + 8 > local6451.anInt286 && Static367.anInt6583 == local6451.anInt294) {
																	local6451.anInt293 = 0;
																}
															}
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static224.aClass274_59) {
															local73 = Static313.aClass2_Sub34_Sub2_1.method6893();
															Static249.method4058();
															Static193.method3435(local73, -1, 3, -1);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static638.aClass274_125 == Static398.aClass274_115) {
															local2430 = Static313.aClass2_Sub34_Sub2_1.method6904() == 1;
															Static249.method4058();
															Static206.aBoolean362 = local2430;
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static244.aClass274_66) {
															Static42.method844(Static438.aClass266_10);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static394.aClass274_113 == Static398.aClass274_115) {
															local527 = Static313.aClass2_Sub34_Sub2_1.method6903();
															local453 = Static313.aClass2_Sub34_Sub2_1.method6898();
															Static249.method4058();
															Static158.method2967(local453, local527);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static96.aClass274_25) {
															local73 = Static313.aClass2_Sub34_Sub2_1.method6896();
															local453 = Static313.aClass2_Sub34_Sub2_1.method6856();
															local256 = Static313.aClass2_Sub34_Sub2_1.method6920();
															Static249.method4058();
															Static93.method1623(local453, local256, local73);
															Static398.aClass274_115 = null;
															return true;
														} else if (Static417.aClass274_119 == Static398.aClass274_115) {
															Static449.anInt7920 = Static313.aClass2_Sub34_Sub2_1.method6904();
															for (local73 = 0; local73 < Static449.anInt7920; local73++) {
																Static7.aStringArray3[local73] = Static313.aClass2_Sub34_Sub2_1.method6903();
																Static17.aStringArray4[local73] = Static313.aClass2_Sub34_Sub2_1.method6903();
																if (Static17.aStringArray4[local73].equals("")) {
																	Static17.aStringArray4[local73] = Static7.aStringArray3[local73];
																}
																Static525.aStringArray38[local73] = Static313.aClass2_Sub34_Sub2_1.method6903();
																Static417.aStringArray29[local73] = Static313.aClass2_Sub34_Sub2_1.method6903();
																if (Static417.aStringArray29[local73].equals("")) {
																	Static417.aStringArray29[local73] = Static525.aStringArray38[local73];
																}
																Static575.aBooleanArray48[local73] = false;
															}
															Static398.aClass274_115 = null;
															Static207.anInt4343 = Static44.anInt975;
															return true;
														} else if (Static118.aClass274_31 == Static398.aClass274_115) {
															Static523.anInt8742 = Static313.aClass2_Sub34_Sub2_1.method6908() << 3;
															Static367.anInt6583 = Static313.aClass2_Sub34_Sub2_1.method6919();
															Static228.anInt4648 = Static313.aClass2_Sub34_Sub2_1.method6908() << 3;
															while (Static313.aClass2_Sub34_Sub2_1.anInt8188 < Static44.anInt971) {
																@Pc(6710) Class266 local6710 = Static488.method6994()[Static313.aClass2_Sub34_Sub2_1.method6904()];
																Static42.method844(local6710);
															}
															Static398.aClass274_115 = null;
															return true;
														} else if (Static398.aClass274_115 == Static161.aClass274_47) {
															Static42.method844(Static555.aClass266_14);
															Static398.aClass274_115 = null;
															return true;
														} else {
															Static420.method6396("T1 - " + (Static398.aClass274_115 == null ? -1 : Static398.aClass274_115.method6661()) + "," + (Static136.aClass274_35 == null ? -1 : Static136.aClass274_35.method6661()) + "," + (Static287.aClass274_86 == null ? -1 : Static287.aClass274_86.method6661()) + " - " + Static44.anInt971, null);
															Static75.method1450(false);
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
