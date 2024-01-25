import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
	public static int anInt1990;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Z")
	public static boolean aBoolean111 = false;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "[I")
	public static final int[] anIntArray175 = new int[25];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!vh;Lclient!qa;Lclient!vh;Z)V")
	public static void method1659(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class250 arg2) {
		Static40.aClass101_1 = Static184.method2821(Static451.anInt7783, arg0);
		Static197.aClass129_2 = arg1.method4719(Static40.aClass101_1, Static459.method3750(arg2, Static451.anInt7783));
		Static98.aClass101_2 = Static184.method2821(Static40.anInt742, arg0);
		Static372.aClass129_6 = arg1.method4719(Static98.aClass101_2, Static459.method3750(arg2, Static40.anInt742));
		Static167.aClass101_3 = Static184.method2821(Static242.anInt4338, arg0);
		Static139.aClass129_1 = arg1.method4719(Static167.aClass101_3, Static459.method3750(arg2, Static242.anInt4338));
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method1664(@OriginalArg(1) Class109 arg0) {
		if (Static242.aClass266_36.method5992() == 0) {
			return;
		}
		@Pc(54) Class1_Sub30 local54;
		if (Static285.anInt7839 == 0) {
			for (local54 = (Class1_Sub30) Static242.aClass266_36.method6000(); local54 != null; local54 = (Class1_Sub30) Static242.aClass266_36.method5994()) {
				Static196.aClass139_1.method3232(local54.anInt4472, false, local54.anInt4476, local54.anInt4471, local54.anInt4475, arg0, Static197.aClass129_2, false, local54.anInt4474, arg0, local54.aBoolean306 ? Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1 : null);
				local54.method6071();
			}
			Static353.method4882();
			return;
		}
		if (Static349.aClass109_2 == null) {
			@Pc(24) Canvas local24 = new Canvas();
			local24.setSize(36, 32);
			Static349.aClass109_2 = Static315.method4727(Static119.aClass138_7, 0, local24, 0, Static184.anInterface7_8);
			Static240.aClass129_3 = Static349.aClass109_2.method4719(Static184.method2821(Static451.anInt7783, Static420.aClass250_87), Static459.method3750(Static384.aClass250_76, Static451.anInt7783));
		}
		for (local54 = (Class1_Sub30) Static242.aClass266_36.method6000(); local54 != null; local54 = (Class1_Sub30) Static242.aClass266_36.method5994()) {
			Static196.aClass139_1.method3232(local54.anInt4472, false, local54.anInt4476, local54.anInt4471, local54.anInt4475, Static349.aClass109_2, Static240.aClass129_3, false, local54.anInt4474, arg0, local54.aBoolean306 ? Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1 : null);
			local54.method6071();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIII)V")
	public static void method1666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1004) {
			Static104.method1600(Static24.aClass190_1, arg1, arg0);
		} else if (arg2 == 1001) {
			Static104.method1600(Static100.aClass190_6, arg1, arg0);
		} else if (arg2 == 1007) {
			Static104.method1600(Static32.aClass190_2, arg1, arg0);
		} else if (arg2 == 1006) {
			Static104.method1600(Static75.aClass190_4, arg1, arg0);
		} else if (arg2 == 1002) {
			Static104.method1600(Static419.aClass190_9, arg1, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)Z")
	public static boolean method1668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
