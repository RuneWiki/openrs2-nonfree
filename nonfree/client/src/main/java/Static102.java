import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
	public static int anInt3165;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "Lclient!is;")
	public static Class110 aClass110_3;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
	public static int anInt3166;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
	public static int anInt3167;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "Lclient!at;")
	public static final Class17 aClass17_30 = new Class17();

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "[I")
	public static final int[] anIntArray371 = new int[5];

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "[I")
	public static final int[] anIntArray372 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "Lclient!o;")
	public static final Class169 aClass169_167 = new Class169("K", "T", "K", "K");

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "[I")
	public static final int[] anIntArray373 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIZZB)V")
	public static void method2553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		Static284.method4329(Static52.aClass124_Sub1Array1.length - 1, 0, arg3, arg0, arg1, arg2);
		Static78.anInt1494 = 0;
		Static300.aClass1_Sub21_2 = null;
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
	public static void method2555() {
		Static240.aClass227_32.method4871();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZIIIII)V")
	public static void method2560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static128.method1853(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(32) int local32 = arg1;
		@Pc(35) int local35 = -arg1;
		@Pc(37) int local37 = local15;
		@Pc(40) int local40 = -local15;
		@Pc(42) int local42 = -1;
		@Pc(44) int local44 = -1;
		@Pc(67) int local67;
		@Pc(75) int local75;
		@Pc(84) int local84;
		@Pc(92) int local92;
		if (Static194.anInt3448 <= arg4 && Static264.anInt4589 >= arg4) {
			@Pc(58) int[] local58 = Static369.anIntArrayArray35[arg4];
			local67 = Static140.method5231(arg2 - arg1, Static98.anInt1774, Static372.anInt1561);
			local75 = Static140.method5231(arg1 + arg2, Static98.anInt1774, Static372.anInt1561);
			local84 = Static140.method5231(arg2 - local15, Static98.anInt1774, Static372.anInt1561);
			local92 = Static140.method5231(local15 + arg2, Static98.anInt1774, Static372.anInt1561);
			Static382.method5419(local58, local67, local84, arg0);
			Static382.method5419(local58, local84, local92, arg3);
			Static382.method5419(local58, local92, local75, arg0);
		}
		while (local32 > local10) {
			local42 += 2;
			local44 += 2;
			local40 += local44;
			local35 += local42;
			if (local40 >= 0 && local37 >= 1) {
				local37--;
				Static306.anIntArray619[local37] = local10;
				local40 -= local37 << 1;
			}
			local10++;
			@Pc(212) int local212;
			@Pc(220) int local220;
			@Pc(227) int[] local227;
			@Pc(160) int local160;
			if (local35 >= 0) {
				local32--;
				local35 -= local32 << 1;
				local160 = arg4 - local32;
				local67 = arg4 + local32;
				if (local67 >= Static194.anInt3448 && Static264.anInt4589 >= local160) {
					if (local15 > local32) {
						local75 = Static306.anIntArray619[local32];
						local84 = Static140.method5231(local10 + arg2, Static98.anInt1774, Static372.anInt1561);
						local92 = Static140.method5231(arg2 - local10, Static98.anInt1774, Static372.anInt1561);
						local212 = Static140.method5231(arg2 + local75, Static98.anInt1774, Static372.anInt1561);
						local220 = Static140.method5231(arg2 - local75, Static98.anInt1774, Static372.anInt1561);
						if (local67 <= Static264.anInt4589) {
							local227 = Static369.anIntArrayArray35[local67];
							Static382.method5419(local227, local92, local220, arg0);
							Static382.method5419(local227, local220, local212, arg3);
							Static382.method5419(local227, local212, local84, arg0);
						}
						if (Static194.anInt3448 <= local160) {
							local227 = Static369.anIntArrayArray35[local160];
							Static382.method5419(local227, local92, local220, arg0);
							Static382.method5419(local227, local220, local212, arg3);
							Static382.method5419(local227, local212, local84, arg0);
						}
					} else {
						local75 = Static140.method5231(arg2 + local10, Static98.anInt1774, Static372.anInt1561);
						local84 = Static140.method5231(arg2 - local10, Static98.anInt1774, Static372.anInt1561);
						if (Static264.anInt4589 >= local67) {
							Static382.method5419(Static369.anIntArrayArray35[local67], local84, local75, arg0);
						}
						if (local160 >= Static194.anInt3448) {
							Static382.method5419(Static369.anIntArrayArray35[local160], local84, local75, arg0);
						}
					}
				}
			}
			local160 = arg4 - local10;
			local67 = arg4 + local10;
			if (local67 >= Static194.anInt3448 && local160 <= Static264.anInt4589) {
				local75 = arg2 + local32;
				local84 = arg2 - local32;
				if (Static372.anInt1561 <= local75 && Static98.anInt1774 >= local84) {
					local75 = Static140.method5231(local75, Static98.anInt1774, Static372.anInt1561);
					local84 = Static140.method5231(local84, Static98.anInt1774, Static372.anInt1561);
					if (local10 < local15) {
						local92 = local10 <= local37 ? local37 : Static306.anIntArray619[local10];
						local212 = Static140.method5231(local92 + arg2, Static98.anInt1774, Static372.anInt1561);
						local220 = Static140.method5231(arg2 - local92, Static98.anInt1774, Static372.anInt1561);
						if (Static264.anInt4589 >= local67) {
							local227 = Static369.anIntArrayArray35[local67];
							Static382.method5419(local227, local84, local220, arg0);
							Static382.method5419(local227, local220, local212, arg3);
							Static382.method5419(local227, local212, local75, arg0);
						}
						if (local160 >= Static194.anInt3448) {
							local227 = Static369.anIntArrayArray35[local160];
							Static382.method5419(local227, local84, local220, arg0);
							Static382.method5419(local227, local220, local212, arg3);
							Static382.method5419(local227, local212, local75, arg0);
						}
					} else {
						if (Static264.anInt4589 >= local67) {
							Static382.method5419(Static369.anIntArrayArray35[local67], local84, local75, arg0);
						}
						if (local160 >= Static194.anInt3448) {
							Static382.method5419(Static369.anIntArrayArray35[local160], local84, local75, arg0);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "(I)V")
	public static void method2561() {
		if (Static354.anInt5766 == 0 || Static354.anInt5766 == 5) {
			return;
		}
		try {
			if (++Static117.anInt2087 > 2000) {
				if (Static6.aClass130_1 != null) {
					Static6.aClass130_1.method2668();
					Static6.aClass130_1 = null;
				}
				if (Static331.anInt5552 >= 1) {
					Static354.anInt5766 = 0;
					Static288.anInt4959 = -5;
					return;
				}
				Static354.anInt5766 = 1;
				Static331.anInt5552++;
				Static117.anInt2087 = 0;
				if (Static91.anInt1662 == Static394.anInt6422) {
					Static394.anInt6422 = Static128.anInt2264;
				} else {
					Static394.anInt6422 = Static91.anInt1662;
				}
			}
			if (Static354.anInt5766 == 1) {
				Static41.aClass112_1 = Static341.aClass162_5.method3289(Static394.anInt6422, Static314.aString60);
				Static354.anInt5766 = 2;
			}
			@Pc(114) int local114;
			if (Static354.anInt5766 == 2) {
				if (Static41.aClass112_1.anInt2969 == 2) {
					throw new IOException();
				}
				if (Static41.aClass112_1.anInt2969 != 1) {
					return;
				}
				Static6.aClass130_1 = new Class130((Socket) Static41.aClass112_1.anObject5, Static341.aClass162_5);
				Static41.aClass112_1 = null;
				@Pc(104) long local104 = Static161.aLong90 = Static229.method3191(Static8.aString1);
				Static209.aClass1_Sub33_Sub2_2.lb = 0;
				local114 = (int) (local104 >> 16 & 0x1FL);
				Static209.aClass1_Sub33_Sub2_2.method5165(Static159.aClass66_1.anInt1518);
				Static209.aClass1_Sub33_Sub2_2.method5165(local114);
				Static6.aClass130_1.method2670(2, Static209.aClass1_Sub33_Sub2_2.aByteArray86);
				if (Static216.aClass14_1 != null) {
					Static216.aClass14_1.method4896();
				}
				if (Static296.aClass14_2 != null) {
					Static296.aClass14_2.method4896();
				}
				@Pc(144) int local144 = Static6.aClass130_1.method2672();
				if (Static216.aClass14_1 != null) {
					Static216.aClass14_1.method4896();
				}
				if (Static296.aClass14_2 != null) {
					Static296.aClass14_2.method4896();
				}
				if (local144 != 0) {
					Static288.anInt4959 = local144;
					Static354.anInt5766 = 0;
					Static6.aClass130_1.method2668();
					Static6.aClass130_1 = null;
					return;
				}
				Static354.anInt5766 = 3;
			}
			if (Static354.anInt5766 == 3) {
				if (Static6.aClass130_1.method2675() < 8) {
					return;
				}
				Static6.aClass130_1.method2666(8, Static139.aClass1_Sub33_Sub2_1.aByteArray86, 0);
				Static139.aClass1_Sub33_Sub2_1.lb = 0;
				Static188.aLong104 = Static139.aClass1_Sub33_Sub2_1.method5178();
				@Pc(196) Class1_Sub33 local196 = new Class1_Sub33(70);
				@Pc(199) int[] local199 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static188.aLong104 >> 32), (int) Static188.aLong104 };
				local196.method5165(10);
				local196.method5142(local199[0]);
				local196.method5142(local199[1]);
				local196.method5142(local199[2]);
				local196.method5142(local199[3]);
				local196.method5127(Static229.method3191(Static8.aString1));
				local196.method5143(Static203.aString38);
				local196.method5130(Static356.aBigInteger3, Static122.aBigInteger1);
				Static209.aClass1_Sub33_Sub2_2.lb = 0;
				if (Static142.anInt2665 == 40) {
					Static209.aClass1_Sub33_Sub2_2.method5165(Static159.aClass66_5.anInt1518);
				} else {
					Static209.aClass1_Sub33_Sub2_2.method5165(Static159.aClass66_3.anInt1518);
				}
				Static209.aClass1_Sub33_Sub2_2.method5138(0);
				local114 = Static209.aClass1_Sub33_Sub2_2.lb;
				Static209.aClass1_Sub33_Sub2_2.method5142(575);
				Static209.aClass1_Sub33_Sub2_2.method5165(Static275.anInt4798);
				Static209.aClass1_Sub33_Sub2_2.method5165(Static254.method3903());
				Static209.aClass1_Sub33_Sub2_2.method5138(Static136.anInt6304);
				Static209.aClass1_Sub33_Sub2_2.method5138(Static218.anInt3871);
				Static209.aClass1_Sub33_Sub2_2.method5165(Static188.aClass135_Sub1_1.anInt3372);
				Static177.method1113(Static209.aClass1_Sub33_Sub2_2);
				Static209.aClass1_Sub33_Sub2_2.method5143(Static348.aString68);
				Static209.aClass1_Sub33_Sub2_2.method5142(Static380.anInt6150);
				@Pc(334) Class1_Sub33 local334 = Static188.aClass135_Sub1_1.method2748();
				Static209.aClass1_Sub33_Sub2_2.method5165(local334.lb);
				Static209.aClass1_Sub33_Sub2_2.method5152(local334.lb, local334.aByteArray86);
				Static247.aBoolean423 = true;
				Static209.aClass1_Sub33_Sub2_2.method5138(Static68.anInt1378);
				Static209.aClass1_Sub33_Sub2_2.method5142(Static13.aClass230_2.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static388.aClass230_90.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static307.aClass230_79.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static268.aClass230_64.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static134.aClass230_35.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static25.aClass230_5.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static156.aClass230_44.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static350.aClass230_78.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static145.aClass230_41.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static79.aClass230_28.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static281.aClass230_67.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static339.aClass230_76.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static98.aClass230_32.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static27.aClass230_8.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static70.aClass230_26.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static177.aClass230_25.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static226.aClass230_58.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static94.aClass230_31.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static22.aClass230_59.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static358.aClass230_80.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static185.aClass230_49.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static55.aClass230_19.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static87.aClass230_30.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static314.aClass230_70.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static332.aClass230_75.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static39.aClass230_13.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static34.aClass230_11.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static163.aClass230_47.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5142(Static12.aClass230_1.method4960());
				Static209.aClass1_Sub33_Sub2_2.method5152(local196.lb, local196.aByteArray86);
				Static209.aClass1_Sub33_Sub2_2.method5148(Static209.aClass1_Sub33_Sub2_2.lb - local114);
				Static6.aClass130_1.method2670(Static209.aClass1_Sub33_Sub2_2.lb, Static209.aClass1_Sub33_Sub2_2.aByteArray86);
				Static209.aClass1_Sub33_Sub2_2.method5194(local199);
				for (@Pc(559) int local559 = 0; local559 < 4; local559++) {
					local199[local559] += 50;
				}
				Static139.aClass1_Sub33_Sub2_1.method5194(local199);
				Static354.anInt5766 = 4;
			}
			@Pc(593) int local593;
			if (Static354.anInt5766 == 4) {
				if (Static6.aClass130_1.method2675() < 1) {
					return;
				}
				local593 = Static6.aClass130_1.method2672();
				if (local593 == 21) {
					Static354.anInt5766 = 7;
				} else if (local593 == 29) {
					Static354.anInt5766 = 11;
				} else if (local593 == 1) {
					Static354.anInt5766 = 5;
					Static288.anInt4959 = local593;
					return;
				} else if (local593 == 2) {
					Static354.anInt5766 = 8;
				} else if (local593 == 15) {
					Static121.anInt2167 = -2;
					Static354.anInt5766 = 12;
				} else if (local593 == 23 && Static331.anInt5552 < 1) {
					Static331.anInt5552++;
					Static117.anInt2087 = 0;
					Static354.anInt5766 = 1;
					Static6.aClass130_1.method2668();
					Static6.aClass130_1 = null;
					return;
				} else {
					Static288.anInt4959 = local593;
					Static354.anInt5766 = 0;
					Static6.aClass130_1.method2668();
					Static6.aClass130_1 = null;
					return;
				}
			}
			if (Static354.anInt5766 == 6) {
				Static209.aClass1_Sub33_Sub2_2.lb = 0;
				Static209.aClass1_Sub33_Sub2_2.method5198(Static159.aClass66_4.anInt1518);
				Static6.aClass130_1.method2670(Static209.aClass1_Sub33_Sub2_2.lb, Static209.aClass1_Sub33_Sub2_2.aByteArray86);
				Static354.anInt5766 = 4;
			} else if (Static354.anInt5766 == 7) {
				if (Static6.aClass130_1.method2675() >= 1) {
					Static133.anInt2478 = (Static6.aClass130_1.method2672() + 3) * 60;
					Static288.anInt4959 = 21;
					Static354.anInt5766 = 0;
					Static6.aClass130_1.method2668();
					Static6.aClass130_1 = null;
				}
			} else if (Static354.anInt5766 != 11) {
				if (Static354.anInt5766 == 8) {
					if (Static6.aClass130_1.method2675() < 13) {
						return;
					}
					Static6.aClass130_1.method2666(13, Static139.aClass1_Sub33_Sub2_1.aByteArray86, 0);
					Static139.aClass1_Sub33_Sub2_1.lb = 0;
					Static284.anInt4919 = Static139.aClass1_Sub33_Sub2_1.method5174();
					Static61.anInt1224 = Static139.aClass1_Sub33_Sub2_1.method5174();
					Static357.aBoolean558 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
					Static201.aBoolean347 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
					Static11.aBoolean348 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
					Static54.aBoolean102 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
					Static43.anInt861 = Static139.aClass1_Sub33_Sub2_1.method5177();
					Static254.aBoolean435 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
					Static104.aBoolean157 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
					Static54.aClass153_1.method3086(Static104.aBoolean157);
					Static263.aClass102_2.method2177(Static104.aBoolean157);
					Static168.aClass196_2.method4453(Static104.aBoolean157);
					if (Static357.aBoolean558 && !Static11.aBoolean348 || Static254.aBoolean435) {
						try {
							Static396.method1248(Static341.aClass162_5.anApplet1, "zap");
						} catch (@Pc(884) Throwable local884) {
							if (Static392.aBoolean593) {
								try {
									Static341.aClass162_5.anApplet1.getAppletContext().showDocument(new URL(Static341.aClass162_5.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(900) Exception local900) {
								}
							}
						}
					} else {
						try {
							Static396.method1248(Static341.aClass162_5.anApplet1, "unzap");
						} catch (@Pc(874) Throwable local874) {
						}
					}
					if (Static96.aClass73_2 == Static314.aClass73_5) {
						try {
							Static396.method1248(Static341.aClass162_5.anApplet1, "loggedin");
						} catch (@Pc(912) Throwable local912) {
						}
					}
					Static354.anInt5766 = 10;
				}
				if (Static354.anInt5766 == 10) {
					if (Static139.aClass1_Sub33_Sub2_1.method5196()) {
						if (Static6.aClass130_1.method2675() < 1) {
							return;
						}
						Static6.aClass130_1.method2666(1, Static139.aClass1_Sub33_Sub2_1.aByteArray86, Static139.aClass1_Sub33_Sub2_1.lb + 2);
					}
					Static186.aClass211_85 = Static129.method1894()[Static139.aClass1_Sub33_Sub2_1.method5190()];
					Static121.anInt2167 = Static139.aClass1_Sub33_Sub2_1.method5177();
					Static354.anInt5766 = 9;
				}
				if (Static354.anInt5766 == 9) {
					if (Static6.aClass130_1.method2675() >= Static121.anInt2167) {
						Static6.aClass130_1.method2666(Static121.anInt2167, Static139.aClass1_Sub33_Sub2_1.aByteArray86, 0);
						Static139.aClass1_Sub33_Sub2_1.lb = 0;
						local593 = Static121.anInt2167;
						Static288.anInt4959 = 2;
						Static354.anInt5766 = 0;
						Static269.method789();
						Static275.method4233(Static139.aClass1_Sub33_Sub2_1);
						Static275.anInt4800 = -1;
						Static348.method5100(false);
						if (Static139.aClass1_Sub33_Sub2_1.lb != local593) {
							throw new RuntimeException("lswp pos:" + Static139.aClass1_Sub33_Sub2_1.lb + " psize:" + local593);
						}
						Static186.aClass211_85 = null;
					}
				} else if (Static354.anInt5766 == 12) {
					if (Static121.anInt2167 == -2) {
						if (Static6.aClass130_1.method2675() < 2) {
							return;
						}
						Static6.aClass130_1.method2666(2, Static139.aClass1_Sub33_Sub2_1.aByteArray86, 0);
						Static139.aClass1_Sub33_Sub2_1.lb = 0;
						Static121.anInt2167 = Static139.aClass1_Sub33_Sub2_1.method5177();
					}
					if (Static6.aClass130_1.method2675() >= Static121.anInt2167) {
						Static6.aClass130_1.method2666(Static121.anInt2167, Static139.aClass1_Sub33_Sub2_1.aByteArray86, 0);
						Static139.aClass1_Sub33_Sub2_1.lb = 0;
						local593 = Static121.anInt2167;
						Static354.anInt5766 = 0;
						Static288.anInt4959 = 15;
						Static62.method1011();
						Static275.method4233(Static139.aClass1_Sub33_Sub2_1);
						if (Static139.aClass1_Sub33_Sub2_1.lb != local593) {
							throw new RuntimeException("lswpr pos:" + Static139.aClass1_Sub33_Sub2_1.lb + " psize:" + local593);
						}
						Static186.aClass211_85 = null;
					}
				}
			} else if (Static6.aClass130_1.method2675() >= 1) {
				Static266.anInt4615 = Static6.aClass130_1.method2672();
				Static354.anInt5766 = 0;
				Static288.anInt4959 = 29;
				Static6.aClass130_1.method2668();
				Static6.aClass130_1 = null;
			}
		} catch (@Pc(1110) IOException local1110) {
			if (Static6.aClass130_1 != null) {
				Static6.aClass130_1.method2668();
				Static6.aClass130_1 = null;
			}
			if (Static331.anInt5552 >= 1) {
				Static288.anInt4959 = -4;
				Static354.anInt5766 = 0;
			} else {
				Static117.anInt2087 = 0;
				Static354.anInt5766 = 1;
				Static331.anInt5552++;
				if (Static91.anInt1662 == Static394.anInt6422) {
					Static394.anInt6422 = Static128.anInt2264;
				} else {
					Static394.anInt6422 = Static91.anInt1662;
				}
			}
		}
	}
}
