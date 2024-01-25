import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "F")
	public static float aFloat53;

	@OriginalMember(owner = "client!id", name = "O", descriptor = "Lclient!of;")
	public static final Class174 aClass174_96 = new Class174("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!id", name = "X", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIB)I")
	public static int method2579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(16) int local16 = arg2;
			arg2 = arg1;
			arg1 = local16;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return 1 + 7 - arg2 - arg0;
		} else if (local3 == 2) {
			return 1 + 7 - arg1 - arg4;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "(I)V")
	public static void method2580() {
		Static89.aClass268_15.method6168();
		Static425.aClass268_21.method6168();
		Static76.aClass268_13.method6168();
		Static29.aClass268_49.method6168();
		Static226.aClass268_57.method6168();
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)Z")
	public static boolean method2582() {
		if (Static429.aBoolean487) {
			try {
				Static473.method5059(Static32.aClass51_1.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)V")
	public static void method2583(@OriginalArg(1) boolean arg0) {
		if (Static328.aClass116_1 != null) {
			Static328.aClass116_1.method2920();
			Static328.aClass116_1 = null;
		}
		Static423.anInt7131 = 0;
		Static342.method4772();
		Static443.method6070();
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			Static250.aClass128Array1[local23].method3177();
		}
		Static126.method1992(false);
		System.gc();
		Static60.method1134();
		Static240.aBoolean428 = false;
		Static81.anInt1464 = -1;
		Static273.method3790(true);
		Static149.anInt2745 = 0;
		Static59.anInt1127 = 0;
		Static49.anInt873 = 0;
		Static37.anInt629 = 0;
		Static337.anInt5635 = 0;
		Static290.anInt5053 = 0;
		for (@Pc(66) int local66 = 0; local66 < Static138.aClass36Array1.length; local66++) {
			Static138.aClass36Array1[local66] = null;
		}
		Static149.method2330();
		for (@Pc(81) int local81 = 0; local81 < 2048; local81++) {
			Static216.aClass1_Sub2_Sub6_Sub2Array1[local81] = null;
		}
		Static379.anInt6398 = 0;
		Static63.aClass140_37.method3488();
		Static76.anInt1390 = 0;
		Static242.aClass140_26.method3488();
		Static371.method5204();
		Static179.anInt3324 = 0;
		Static119.aClass47_1.method1272();
		Static235.method3435();
		Static145.method2267();
		Static76.aLong53 = 0L;
		Static39.aClass3_Sub23_1 = null;
		if (arg0) {
			Static393.method5432(11);
			return;
		}
		Static393.method5432(2);
		try {
			Static473.method5059(Static32.aClass51_1.anApplet1, "loggedout");
		} catch (@Pc(137) Throwable local137) {
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!wj;B)V")
	public static void method2584(@OriginalArg(0) Class1_Sub2_Sub6 arg0) {
		if (arg0 instanceof Class1_Sub2_Sub6_Sub1) {
			@Pc(9) Class1_Sub2_Sub6_Sub1 local9 = (Class1_Sub2_Sub6_Sub1) arg0;
			if (local9.aClass158_1 != null) {
				Static26.method473(local9, Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 != local9.aByte101);
			}
		} else if (arg0 instanceof Class1_Sub2_Sub6_Sub2) {
			@Pc(35) Class1_Sub2_Sub6_Sub2 local35 = (Class1_Sub2_Sub6_Sub2) arg0;
			Static355.method3688(Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 != local35.aByte101, local35);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[[[BIIILclient!qa;IIIIIII)V")
	public static void method2585(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg2 == 0 || arg10 == 0) {
			return;
		}
		if (arg2 == 9) {
			arg8 = arg8 + 1 & 0x3;
			arg2 = 1;
		}
		if (arg2 == 10) {
			arg8 = arg8 + 3 & 0x3;
			arg2 = 1;
		}
		if (arg2 == 11) {
			arg8 = arg8 + 3 & 0x3;
			arg2 = 8;
		}
		arg4.ua(arg3, arg7, arg6, arg0, arg5, arg11, arg1[arg2 - 1][arg8], arg10, arg9);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IIIII)V")
	public static void method2586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static328.anIntArrayArray46 != null) {
			Static328.anIntArrayArray46[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static404.aShortArrayArray6 != null) {
			Static404.aShortArrayArray6[arg0][arg1] = (short) arg3;
		}
		if (Static422.aByteArrayArray23 != null) {
			Static422.aByteArrayArray23[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZ)V")
	public static void method2587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static427.aClass113_4 == Static154.aClass113_3) {
			if (!Static39.method636(0, arg0, 1, -2, 0, 1, false, arg1)) {
				Static39.method636(0, arg0, 1, -3, 0, 1, false, arg1);
			}
		} else if (!Static39.method636(0, arg0, 1, -3, 0, 1, false, arg1)) {
			Static39.method636(0, arg0, 1, -2, 0, 1, false, arg1);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!uu;)Lclient!gg;")
	public static Class3_Sub21 method2588(@OriginalArg(1) int arg0, @OriginalArg(2) Class250 arg1) {
		@Pc(10) byte[] local10 = arg1.method5814(arg0);
		return local10 == null ? null : new Class3_Sub21(local10);
	}
}
