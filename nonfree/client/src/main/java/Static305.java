import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "Lclient!op;")
	public static Class238_Sub1 aClass238_Sub1_2;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
	public static int anInt1756 = 0;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static529.anInt9806 <= arg8 && Static205.anInt3906 >= arg8 && Static529.anInt9806 <= arg5 && arg5 <= Static205.anInt3906 && Static529.anInt9806 <= arg1 && Static205.anInt3906 >= arg1 && Static529.anInt9806 <= arg2 && Static205.anInt3906 >= arg2 && Static133.anInt2531 <= arg3 && arg3 <= Static52.anInt1226 && Static133.anInt2531 <= arg6 && arg6 <= Static52.anInt1226 && Static133.anInt2531 <= arg4 && arg4 <= Static52.anInt1226 && arg0 >= Static133.anInt2531 && arg0 <= Static52.anInt1226) {
			Static178.method2974(arg3, arg8, arg1, arg4, arg0, arg7, arg5, arg2, arg6);
		} else {
			Static338.method5194(arg2, arg6, arg3, arg5, arg0, arg8, arg7, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!sd;B)V")
	public static void method1619(@OriginalArg(0) Class6_Sub44 arg0) {
		if (Static113.aClass133ArrayArrayArray1 == null) {
			return;
		}
		@Pc(13) Interface22 local13 = null;
		if (arg0.anInt8230 == 0) {
			local13 = (Interface22) Static556.method7726(arg0.anInt8227, arg0.anInt8222, arg0.anInt8228);
		}
		if (arg0.anInt8230 == 1) {
			local13 = (Interface22) Static533.method7261(arg0.anInt8227, arg0.anInt8222, arg0.anInt8228);
		}
		if (arg0.anInt8230 == 2) {
			local13 = (Interface22) Static406.method5850(arg0.anInt8227, arg0.anInt8222, arg0.anInt8228, uq.class);
		}
		if (arg0.anInt8230 == 3) {
			local13 = (Interface22) Static361.method5373(arg0.anInt8227, arg0.anInt8222, arg0.anInt8228);
		}
		if (local13 == null) {
			arg0.anInt8226 = -1;
			arg0.anInt8233 = 0;
			arg0.anInt8224 = 0;
		} else {
			arg0.anInt8226 = local13.method7171();
			arg0.anInt8233 = local13.method7176();
			arg0.anInt8224 = local13.method7175();
		}
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
	public static void method1620() {
		if (Static252.anInt4624 == 0 || Static252.anInt4624 == 6) {
			return;
		}
		try {
			if (++Static52.anInt1207 > 2000) {
				if (Static354.aClass1_1 != null) {
					Static354.aClass1_1.method50();
					Static354.aClass1_1 = null;
				}
				if (Static86.anInt9996 >= 2) {
					Static252.anInt4624 = 0;
					Static36.method607(-5);
					return;
				}
				if (Static18.anInt5702 == 2 || Static18.anInt5702 == 3) {
					Static65.aClass297_1.method6804();
				} else {
					Static133.aClass297_3.method6804();
				}
				Static52.anInt1207 = 0;
				Static86.anInt9996++;
				Static252.anInt4624 = 1;
			}
			if (Static252.anInt4624 == 1) {
				if (Static18.anInt5702 == 2 || Static18.anInt5702 == 3) {
					Static129.aClass224_3 = Static65.aClass297_1.method6800(Static174.aClass313_24);
				} else {
					Static129.aClass224_3 = Static133.aClass297_3.method6800(Static174.aClass313_24);
				}
				Static252.anInt4624 = 2;
			}
			if (Static252.anInt4624 == 2) {
				if (Static129.aClass224_3.anInt6632 == 2) {
					throw new IOException();
				}
				if (Static129.aClass224_3.anInt6632 != 1) {
					return;
				}
				Static354.aClass1_1 = Static473.method6561((Socket) Static129.aClass224_3.anObject14);
				Static129.aClass224_3 = null;
				@Pc(128) long local128 = Static297.aLong123 = Static529.method7820(Static286.aString42);
				Static340.aClass6_Sub12_Sub2_1.anInt7556 = 0;
				@Pc(138) int local138 = (int) (local128 >> 16 & 0x1FL);
				Static340.aClass6_Sub12_Sub2_1.method6047(Static321.aClass252_1.anInt7316);
				Static340.aClass6_Sub12_Sub2_1.method6047(local138);
				Static354.aClass1_1.method53(Static340.aClass6_Sub12_Sub2_1.aByteArray97, 2);
				Static252.anInt4624 = 3;
			}
			@Pc(180) int local180;
			if (Static252.anInt4624 == 3) {
				if (!Static354.aClass1_1.method49(1)) {
					return;
				}
				Static354.aClass1_1.method52(1, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
				local180 = Static429.aClass6_Sub12_Sub2_2.aByteArray97[0] & 0xFF;
				if (local180 != 0) {
					Static252.anInt4624 = 0;
					Static36.method607(local180);
					Static354.aClass1_1.method50();
					Static354.aClass1_1 = null;
					Static249.method3889();
					return;
				}
				Static252.anInt4624 = 4;
			}
			if (Static252.anInt4624 == 4) {
				if (!Static354.aClass1_1.method49(8)) {
					return;
				}
				Static354.aClass1_1.method52(8, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
				Static429.aClass6_Sub12_Sub2_2.anInt7556 = 0;
				Static363.aLong168 = Static429.aClass6_Sub12_Sub2_2.method6016();
				@Pc(233) Class6_Sub12 local233 = new Class6_Sub12(518);
				@Pc(236) int[] local236 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static363.aLong168 >> 32), (int) Static363.aLong168 };
				local233.method6047(10);
				local233.method6042(local236[0]);
				local233.method6042(local236[1]);
				local233.method6042(local236[2]);
				local233.method6042(local236[3]);
				local233.method6026(Static529.method7820(Static286.aString42));
				local233.method6009(Static576.aString93);
				local233.method6026(Static326.aLong152);
				local233.method6026(Static498.aLong219);
				local233.method6017(Static371.aBigInteger7, Static4.aBigInteger1);
				@Pc(315) Class6_Sub12_Sub2 local315 = Static340.aClass6_Sub12_Sub2_1;
				local315.anInt7556 = 0;
				@Pc(340) int local340;
				if (Static18.anInt5702 == 2 || Static18.anInt5702 == 3) {
					if (Static375.anInt9162 == 13) {
						local315.method6047(Static321.aClass252_5.anInt7316);
					} else {
						local315.method6047(Static321.aClass252_3.anInt7316);
					}
					local315.method6032(0);
					local340 = local315.anInt7556;
					local315.method6042(614);
					local315.method6047(Static526.anInt9112);
					local315.method6047(Static278.method4179());
					local315.method6032(Static367.anInt6719);
					local315.method6032(Static154.anInt2867);
					local315.method6047(Static58.aClass6_Sub17_Sub1_1.anInt9282);
					Static4.method77(local315);
					local315.method6009(Static315.aString50);
					local315.method6042(Static543.anInt9322);
					@Pc(451) Class6_Sub12 local451 = new Class6_Sub12(Static457.method6387());
					Static58.aClass6_Sub17_Sub1_1.method7352(local451);
					local315.method6047(local451.anInt7556);
					local315.method6025(local451.anInt7556, local451.aByteArray97);
					Static252.aBoolean341 = true;
					@Pc(476) Class6_Sub12 local476 = new Class6_Sub12(Static571.method7835());
					(new Class6_Sub7(true, Static174.aClass313_24)).method513(local476);
					local315.method6025(local476.aByteArray97.length, local476.aByteArray97);
					local315.method6032(Static132.anInt2509);
					local315.method6026(Static184.aLong78);
					Static288.method6399();
					local315.method6025(local233.anInt7556, local233.aByteArray97);
					local315.method6024(local315.anInt7556 - local340);
				} else {
					local315.method6047(Static321.aClass252_6.anInt7316);
					local315.method6032(0);
					local340 = local315.anInt7556;
					local315.method6042(614);
					local315.method6047(Static172.aClass68_4.anInt1509);
					local315.method6047(Static188.anInt28);
					Static4.method77(local315);
					local315.method6009(Static315.aString50);
					local315.method6042(Static543.anInt9322);
					Static288.method6399();
					local315.method6025(local233.anInt7556, local233.aByteArray97);
					local315.method6024(local315.anInt7556 - local340);
				}
				Static354.aClass1_1.method53(local315.aByteArray97, local315.anInt7556);
				local315.method6064(local236);
				for (local340 = 0; local340 < 4; local340++) {
					local236[local340] += 50;
				}
				Static429.aClass6_Sub12_Sub2_2.method6064(local236);
				Static252.anInt4624 = 5;
			}
			if (Static252.anInt4624 == 5) {
				if (!Static354.aClass1_1.method49(1)) {
					return;
				}
				Static354.aClass1_1.method52(1, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
				local180 = Static429.aClass6_Sub12_Sub2_2.aByteArray97[0] & 0xFF;
				if (local180 == 21) {
					Static252.anInt4624 = 8;
				} else if (local180 == 29) {
					Static252.anInt4624 = 14;
				} else if (local180 == 1) {
					Static252.anInt4624 = 6;
					Static36.method607(local180);
					return;
				} else if (local180 == 2) {
					Static252.anInt4624 = 9;
				} else if (local180 == 15) {
					Static207.anInt3929 = -2;
					Static252.anInt4624 = 15;
				} else if (local180 == 23 && Static86.anInt9996 < 2) {
					Static252.anInt4624 = 1;
					Static86.anInt9996++;
					Static52.anInt1207 = 0;
					Static354.aClass1_1.method50();
					Static354.aClass1_1 = null;
					return;
				} else {
					Static252.anInt4624 = 0;
					Static36.method607(local180);
					Static354.aClass1_1.method50();
					Static354.aClass1_1 = null;
					Static249.method3889();
					return;
				}
			}
			if (Static252.anInt4624 == 7) {
				Static340.aClass6_Sub12_Sub2_1.anInt7556 = 0;
				Static340.aClass6_Sub12_Sub2_1.method6062(Static321.aClass252_13.anInt7316);
				Static354.aClass1_1.method53(Static340.aClass6_Sub12_Sub2_1.aByteArray97, Static340.aClass6_Sub12_Sub2_1.anInt7556);
				Static252.anInt4624 = 5;
			} else if (Static252.anInt4624 == 8) {
				if (Static354.aClass1_1.method49(1)) {
					Static354.aClass1_1.method52(1, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
					local180 = Static429.aClass6_Sub12_Sub2_2.aByteArray97[0] & 0xFF;
					Static252.anInt4624 = 0;
					Static56.anInt979 = (local180 + 3) * 60;
					Static36.method607(21);
					Static354.aClass1_1.method50();
					Static354.aClass1_1 = null;
					Static249.method3889();
				}
			} else if (Static252.anInt4624 == 14) {
				if (Static354.aClass1_1.method49(1)) {
					Static354.aClass1_1.method52(1, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
					Static252.anInt4624 = 0;
					Static496.anInt9104 = Static429.aClass6_Sub12_Sub2_2.aByteArray97[0] & 0xFF;
					Static36.method607(29);
					Static354.aClass1_1.method50();
					Static354.aClass1_1 = null;
					Static249.method3889();
				}
			} else if (Static252.anInt4624 != 9) {
				@Pc(815) Class6_Sub12_Sub2 local815;
				if (Static252.anInt4624 == 10) {
					if (Static18.anInt5702 == 3) {
						Static580.aBoolean672 = true;
					} else {
						Static580.aBoolean672 = false;
					}
					local815 = Static429.aClass6_Sub12_Sub2_2;
					if (Static18.anInt5702 == 2 || Static18.anInt5702 == 3) {
						if (!Static354.aClass1_1.method49(Static570.anInt9842)) {
							return;
						}
						Static354.aClass1_1.method52(Static570.anInt9842, 0, local815.aByteArray97);
						local815.anInt7556 = 0;
						Static113.anInt1927 = local815.method6019();
						Static362.anInt6657 = local815.method6019();
						Static352.aBoolean457 = local815.method6019() == 1;
						Static135.aBoolean192 = local815.method6019() == 1;
						Static463.aBoolean528 = local815.method6019() == 1;
						Static255.aBoolean345 = local815.method6019() == 1;
						Static517.anInt8881 = local815.method6044();
						Static241.aBoolean324 = local815.method6019() == 1;
						Static10.anInt138 = local815.method6054();
						Static485.aBoolean557 = local815.method6019() == 1;
						if (Static18.anInt5702 == 3) {
							@Pc(938) boolean local938 = local815.method6019() == 1;
							if (local938) {
								@Pc(944) long local944 = local815.method6016();
								@Pc(948) String local948 = Static383.method5604(local944);
								@Pc(952) int local952 = local815.method6019();
								@Pc(955) byte[] local955 = new byte[local952];
								local815.method6066(local955, local952);
								@Pc(967) String local967 = Static411.method5905(local955);
								@Pc(969) Class108 local969 = null;
								try {
									@Pc(977) Class224 local977 = Static174.aClass313_24.method6994("3", false);
									while (local977.anInt6632 == 0) {
										Static183.method3079(1L);
									}
									if (local977.anInt6632 == 1) {
										local969 = (Class108) local977.anObject14;
										@Pc(1009) int local1009 = local948.length() + local967.length() + 2 + 3 + 2 + 8 + 4;
										if (local1009 > 60) {
											throw new RuntimeException(">60");
										}
										@Pc(1027) Class6_Sub12 local1027 = new Class6_Sub12(local1009 + 1);
										local1027.method6047(local1009);
										local1027.method6047(2);
										local1027.method6035(local948);
										local1027.method6035(local967);
										local1027.method6032(Static543.anInt9322);
										local1027.method6026(Static184.aLong78);
										local1027.method6038();
										local969.method2447(local1027.aByteArray97, 0, local1027.anInt7556);
									}
								} catch (@Pc(1069) Exception local1069) {
								}
								try {
									if (local969 != null) {
										local969.method2453();
									}
								} catch (@Pc(1076) Exception local1076) {
								}
								try {
									Static594.method6348("demoaccountcreated", Static198.anApplet1);
								} catch (@Pc(1083) Throwable local1083) {
								}
							}
						}
						Static85.aClass27_1.method520(Static485.aBoolean557);
						Static119.aClass244_4.method5713(Static485.aBoolean557);
						Static119.aClass226_4.method5367(Static485.aBoolean557);
					} else if (Static354.aClass1_1.method49(Static570.anInt9842)) {
						Static354.aClass1_1.method52(Static570.anInt9842, 0, local815.aByteArray97);
						local815.anInt7556 = 0;
						Static113.anInt1927 = local815.method6019();
						Static362.anInt6657 = local815.method6019();
						Static352.aBoolean457 = local815.method6019() == 1;
						Static135.aBoolean192 = local815.method6019() == 1;
						Static463.aBoolean528 = local815.method6019() == 1;
						Static194.anInt3796 = local815.method6044();
						Static241.aBoolean324 = Static194.anInt3796 > 0;
						Static57.anInt992 = local815.method6044();
						Static251.anInt4615 = local815.method6044();
						Static318.anInt6122 = local815.method6044();
						Static407.anInt7325 = local815.method6015();
						Static154.aClass224_5 = Static174.aClass313_24.method6979(Static407.anInt7325);
						Static289.anInt5315 = local815.method6019();
						Static267.anInt5410 = local815.method6044();
						Static41.anInt766 = local815.method6044();
						Static501.aBoolean566 = local815.method6019() == 1;
						Static461.aClass15_Sub2_Sub4_Sub2_2.aString82 = Static461.aClass15_Sub2_Sub4_Sub2_2.aString83 = local815.method5999();
						Static241.anInt4411 = local815.method6019();
						Static496.anInt9105 = local815.method6015();
						Static105.aClass297_2 = new Class297();
						Static105.aClass297_2.anInt8579 = local815.method6044();
						if (Static105.aClass297_2.anInt8579 == 65535) {
							Static105.aClass297_2.anInt8579 = -1;
						}
						Static105.aClass297_2.aString70 = local815.method5999();
						if (Static101.aClass45_4 != Static338.aClass45_6) {
							Static105.aClass297_2.anInt8574 = Static105.aClass297_2.anInt8579 + 50000;
							Static105.aClass297_2.anInt8578 = Static105.aClass297_2.anInt8579 + 40000;
						}
						if (Static338.aClass45_6 != Static9.aClass45_1 && (Static65.aClass297_1.method6802(Static259.aClass297_4) || Static65.aClass297_1.method6802(Static416.aClass297_5))) {
							Static262.method3998();
						}
					} else {
						return;
					}
					if (Static352.aBoolean457 && !Static463.aBoolean528 || Static241.aBoolean324) {
						try {
							Static594.method6348("zap", Static198.anApplet1);
						} catch (@Pc(1295) Throwable local1295) {
							if (Static571.aBoolean664) {
								try {
									Static198.anApplet1.getAppletContext().showDocument(new URL(Static198.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1309) Exception local1309) {
								}
							}
						}
					} else {
						try {
							Static594.method6348("unzap", Static198.anApplet1);
						} catch (@Pc(1318) Throwable local1318) {
						}
					}
					if (Static101.aClass45_4 == Static338.aClass45_6) {
						try {
							Static594.method6348("loggedin", Static198.anApplet1);
						} catch (@Pc(1329) Throwable local1329) {
						}
					}
					if (Static18.anInt5702 != 2 && Static18.anInt5702 != 3) {
						Static252.anInt4624 = 0;
						Static36.method607(2);
						Static333.method5120();
						Static436.method6188(7);
						Static144.aClass98_147 = null;
						return;
					}
					Static252.anInt4624 = 12;
				}
				if (Static252.anInt4624 == 12) {
					if (!Static354.aClass1_1.method49(3)) {
						return;
					}
					Static354.aClass1_1.method52(3, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
					Static252.anInt4624 = 13;
				}
				if (Static252.anInt4624 == 13) {
					local815 = Static429.aClass6_Sub12_Sub2_2;
					local815.anInt7556 = 0;
					if (local815.method6060()) {
						if (!Static354.aClass1_1.method49(1)) {
							return;
						}
						Static354.aClass1_1.method52(1, 3, local815.aByteArray97);
					}
					Static144.aClass98_147 = Static315.method4916()[local815.method6063()];
					Static207.anInt3929 = local815.method6044();
					Static252.anInt4624 = 11;
				}
				if (Static252.anInt4624 == 11) {
					if (Static354.aClass1_1.method49(Static207.anInt3929)) {
						Static354.aClass1_1.method52(Static207.anInt3929, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
						Static429.aClass6_Sub12_Sub2_2.anInt7556 = 0;
						Static252.anInt4624 = 0;
						local180 = Static207.anInt3929;
						Static36.method607(2);
						Static469.method6534();
						Static570.method7830(Static429.aClass6_Sub12_Sub2_2);
						Static300.anInt5494 = -1;
						if (Static279.aClass98_69 == Static144.aClass98_147) {
							Static202.method3337();
						} else {
							Static394.method7812();
						}
						if (Static429.aClass6_Sub12_Sub2_2.anInt7556 != local180) {
							throw new RuntimeException("lswp pos:" + Static429.aClass6_Sub12_Sub2_2.anInt7556 + " psize:" + local180);
						}
						Static144.aClass98_147 = null;
					}
				} else if (Static252.anInt4624 == 15) {
					if (Static207.anInt3929 == -2) {
						if (!Static354.aClass1_1.method49(2)) {
							return;
						}
						Static354.aClass1_1.method52(2, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
						Static429.aClass6_Sub12_Sub2_2.anInt7556 = 0;
						Static207.anInt3929 = Static429.aClass6_Sub12_Sub2_2.method6044();
					}
					if (Static354.aClass1_1.method49(Static207.anInt3929)) {
						Static354.aClass1_1.method52(Static207.anInt3929, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
						Static429.aClass6_Sub12_Sub2_2.anInt7556 = 0;
						Static252.anInt4624 = 0;
						local180 = Static207.anInt3929;
						Static36.method607(15);
						Static133.method2174();
						Static570.method7830(Static429.aClass6_Sub12_Sub2_2);
						if (Static429.aClass6_Sub12_Sub2_2.anInt7556 != local180) {
							throw new RuntimeException("lswpr pos:" + Static429.aClass6_Sub12_Sub2_2.anInt7556 + " psize:" + local180);
						}
						Static144.aClass98_147 = null;
					}
				}
			} else if (Static354.aClass1_1.method49(1)) {
				Static354.aClass1_1.method52(1, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
				Static252.anInt4624 = 10;
				Static570.anInt9842 = Static429.aClass6_Sub12_Sub2_2.aByteArray97[0] & 0xFF;
			}
		} catch (@Pc(1571) IOException local1571) {
			if (Static354.aClass1_1 != null) {
				Static354.aClass1_1.method50();
				Static354.aClass1_1 = null;
			}
			if (Static86.anInt9996 >= 2) {
				Static252.anInt4624 = 0;
				Static36.method607(-4);
				Static249.method3889();
			} else {
				if (Static18.anInt5702 == 2 || Static18.anInt5702 == 3) {
					Static65.aClass297_1.method6804();
				} else {
					Static133.aClass297_3.method6804();
				}
				Static52.anInt1207 = 0;
				Static252.anInt4624 = 1;
				Static86.anInt9996++;
			}
		}
	}
}
