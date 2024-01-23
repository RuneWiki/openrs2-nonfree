import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	public static int anInt3201;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "[[S")
	public static short[][] aShortArrayArray2 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25 = new String[8];

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	public static int anInt3204 = -1;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!p;)Ljava/lang/String;")
	public static String method2509(@OriginalArg(2) Class4_Sub17 arg0) {
		try {
			@Pc(14) int local14 = arg0.method1856();
			if (local14 > 32767) {
				local14 = 32767;
			}
			@Pc(22) byte[] local22 = new byte[local14];
			arg0.anInt2400 += Static173.aClass31_1.method713(0, local22, local14, arg0.anInt2400, arg0.aByteArray30);
			return Static259.method3911(local14, 0, local22);
		} catch (@Pc(46) Exception local46) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Lclient!af;")
	public static Class4_Sub2_Sub1_Sub1 method2511() {
		@Pc(13) int local13 = Static46.anIntArray120[0] * Static159.anIntArray285[0];
		@Pc(17) byte[] local17 = Static274.aByteArrayArray20[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(30) int local30 = 0; local30 < local13; local30++) {
			local20[local30] = Static6.anIntArray14[local17[local30] & 0xFF];
		}
		@Pc(69) Class4_Sub2_Sub1_Sub1 local69 = new Class4_Sub2_Sub1_Sub1(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[0], Static100.anIntArray223[0], Static159.anIntArray285[0], Static46.anIntArray120[0], local20);
		Static268.method4006();
		return local69;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public static void method2513() {
		aStringArray25 = null;
		aShortArrayArray2 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!cc;ZI)V")
	public static void method2514(@OriginalArg(0) Class22 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(13) int local13 = arg0.anInt544 == 0 ? arg0.anInt546 : arg0.anInt544;
		@Pc(28) int local28 = arg0.anInt583 == 0 ? arg0.anInt602 : arg0.anInt583;
		Static93.method1495(local28, local13, Static148.aClass22ArrayArray1[arg0.anInt596 >> 16], arg1, arg0.anInt596);
		if (arg0.aClass22Array1 != null) {
			Static93.method1495(local28, local13, arg0.aClass22Array1, arg1, arg0.anInt596);
		}
		@Pc(61) Class4_Sub10 local61 = (Class4_Sub10) Static227.aClass97_16.method2360((long) arg0.anInt596);
		if (local61 != null) {
			Static34.method487(arg1, local13, local28, local61.anInt1032);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2516(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static260.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(20) Throwable local20) {
			}
		}
		arg0.addKeyListener(Static210.aClass61_1);
		arg0.addFocusListener(Static210.aClass61_1);
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public static void method2517() {
		Static137.aClass33_22.method843();
		Static116.aClass33_21.method843();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
	public static void method2519(@OriginalArg(1) boolean arg0) {
		Static34.method487(arg0, Static111.anInt2450, Static216.anInt4287, Static25.anInt448);
	}
}
