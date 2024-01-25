import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_124 = new Class55("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "[B")
	public static final byte[] aByteArray86 = new byte[2048];

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
	public static int anInt5973 = 0;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/awt/Component;IBLclient!ec;I)Lclient!wd;")
	public static Class116 method4779(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class61 arg2, @OriginalArg(4) int arg3) {
		if (Static208.anInt3680 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(40) Class116 local40 = (Class116) Class.forName("Class116_Sub2").getDeclaredConstructor().newInstance();
			local40.anIntArray610 = new int[(Static213.aBoolean232 ? 2 : 1) * 256];
			local40.anInt7255 = arg3;
			local40.method5585(arg0);
			local40.anInt7257 = (arg3 & 0xFFFFFC00) + 1024;
			if (local40.anInt7257 > 16384) {
				local40.anInt7257 = 16384;
			}
			local40.method5572(local40.anInt7257);
			if (Static59.anInt1065 > 0 && Static194.aClass43_1 == null) {
				Static194.aClass43_1 = new Class43();
				Static194.aClass43_1.aClass61_2 = arg2;
				arg2.method1459(Static194.aClass43_1, Static59.anInt1065);
			}
			if (Static194.aClass43_1 != null) {
				if (Static194.aClass43_1.aClass116Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static194.aClass43_1.aClass116Array1[arg1] = local40;
			}
			return local40;
		} catch (@Pc(113) Throwable local113) {
			try {
				@Pc(119) Class116_Sub1 local119 = new Class116_Sub1(arg2, arg1);
				local119.anInt7255 = arg3;
				local119.anIntArray610 = new int[(Static213.aBoolean232 ? 2 : 1) * 256];
				local119.method5585(arg0);
				local119.anInt7257 = 16384;
				local119.method5572(local119.anInt7257);
				if (Static59.anInt1065 > 0 && Static194.aClass43_1 == null) {
					Static194.aClass43_1 = new Class43();
					Static194.aClass43_1.aClass61_2 = arg2;
					arg2.method1459(Static194.aClass43_1, Static59.anInt1065);
				}
				if (Static194.aClass43_1 != null) {
					if (Static194.aClass43_1.aClass116Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static194.aClass43_1.aClass116Array1[arg1] = local119;
				}
				return local119;
			} catch (@Pc(181) Throwable local181) {
				return new Class116();
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)Z")
	public static boolean method4780(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static352.anInt5643; local1 < Static315.anInt5183; local1++) {
			@Pc(6) Class223[][] local6 = Static19.aClass223ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static133.anInt2523; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static408.anInt6461 + local9;
				@Pc(18) int local18 = Static408.anInt6461 - local9;
				if (local14 >= Static16.anInt6421 || local18 < Static269.anInt4577) {
					for (@Pc(27) int local27 = -Static133.anInt2523; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static72.anInt1379 + local27;
						@Pc(36) int local36 = Static72.anInt1379 - local27;
						@Pc(48) Class223 local48;
						if (local14 >= Static16.anInt6421) {
							if (local32 >= Static98.anInt1989) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean384) {
									Static429.aBoolean483 = arg0;
									Static223.aClass92_1.method3220(local48);
									Static223.aClass92_1.method3216();
								}
							}
							if (local36 < Static226.anInt3936) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean384) {
									Static429.aBoolean483 = arg0;
									Static223.aClass92_1.method3220(local48);
									Static223.aClass92_1.method3216();
								}
							}
						}
						if (local18 < Static269.anInt4577) {
							if (local32 >= Static98.anInt1989) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean384) {
									Static429.aBoolean483 = arg0;
									Static223.aClass92_1.method3220(local48);
									Static223.aClass92_1.method3216();
								}
							}
							if (local36 < Static226.anInt3936) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean384) {
									Static429.aBoolean483 = arg0;
									Static223.aClass92_1.method3220(local48);
									Static223.aClass92_1.method3216();
								}
							}
						}
						if (Static69.anInt1360 == 0) {
							if (Static60.aBoolean67) {
								Static223.aClass92_1.method3222(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!kh;IBII)V")
	public static void method4781(@OriginalArg(0) int arg0, @OriginalArg(2) Class26_Sub2_Sub4 arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		Static124.method2021(arg0, arg1.anInt7388, arg2, 0, arg1.aByte102, arg3, arg1.anInt7383);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4782(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[B[BIIII)V")
	public static void method4783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(22) int local22 = -arg0; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg7++;
				arg3[local30] += arg2[arg5++];
				@Pc(42) int local42 = arg7++;
				arg3[local42] += arg2[arg5++];
				@Pc(54) int local54 = arg7++;
				arg3[local54] += arg2[arg5++];
				@Pc(66) int local66 = arg7++;
				arg3[local66] += arg2[arg5++];
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local30 = arg7++;
				arg3[local30] += arg2[arg5++];
			}
			arg5 += arg4;
			arg7 += arg6;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(CLjava/lang/String;Z)I")
	public static int method4784(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg1.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg1.charAt(local10) == arg0) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[[I)V")
	public static void method4785(@OriginalArg(1) int[][] arg0) {
		Static353.anIntArrayArray48 = arg0;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!dr;I)I")
	public static int method4786(@OriginalArg(0) Class7_Sub14_Sub1 arg0) {
		@Pc(15) int local15 = arg0.method1358(2);
		@Pc(19) int local19;
		if (local15 == 0) {
			local19 = 0;
		} else if (local15 == 1) {
			local19 = arg0.method1358(5);
		} else if (local15 == 2) {
			local19 = arg0.method1358(8);
		} else {
			local19 = arg0.method1358(11);
		}
		return local19;
	}
}
