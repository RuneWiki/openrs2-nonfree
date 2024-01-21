import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
	public static int anInt2810;

	@OriginalMember(owner = "client!sa", name = "M", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_25;

	@OriginalMember(owner = "client!sa", name = "I", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1528 = Static80.method1463(": ");

	@OriginalMember(owner = "client!sa", name = "J", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1529 = Static80.method1463("Fps:");

	@OriginalMember(owner = "client!sa", name = "K", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1530 = Static80.method1463("Your profile will be transferred in:");

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1531 = aClass63_1530;

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1532 = Static80.method1463("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!sa", name = "eb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1533 = aClass63_1532;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
	public static void method1851() {
		aClass63_1531 = null;
		aClass6_Sub3_Sub3_Sub3_25 = null;
		aClass63_1530 = null;
		aClass63_1529 = null;
		aClass63_1532 = null;
		aClass63_1533 = null;
		aClass63_1528 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)V")
	public static void method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class6_Sub17 local10 = (Class6_Sub17) Static81.aClass1_4.method3(); local10 != null; local10 = (Class6_Sub17) Static81.aClass1_4.method14()) {
			if (local10.anInt2816 != -1 || local10.anIntArray297 != null) {
				@Pc(22) int local22 = 0;
				if (arg0 > local10.anInt2819) {
					local22 = arg0 - local10.anInt2819;
				} else if (local10.anInt2811 > arg0) {
					local22 = local10.anInt2811 - arg0;
				}
				if (arg3 > local10.anInt2815) {
					local22 += arg3 - local10.anInt2815;
				} else if (arg3 < local10.anInt2818) {
					local22 += local10.anInt2818 - arg3;
				}
				if (local22 - 64 > local10.anInt2808 || Static56.anInt1713 == 0 || local10.anInt2820 != arg1) {
					if (local10.aClass6_Sub6_Sub1_3 != null) {
						Static54.aClass6_Sub6_Sub2_1.method1629(local10.aClass6_Sub6_Sub1_3);
						local10.aClass6_Sub6_Sub1_3 = null;
					}
					if (local10.aClass6_Sub6_Sub1_2 != null) {
						Static54.aClass6_Sub6_Sub2_1.method1629(local10.aClass6_Sub6_Sub1_2);
						local10.aClass6_Sub6_Sub1_2 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(130) int local130 = Static56.anInt1713 * (local10.anInt2808 - local22) / local10.anInt2808;
					if (local10.aClass6_Sub6_Sub1_3 != null) {
						local10.aClass6_Sub6_Sub1_3.method759(local130);
					} else if (local10.anInt2816 >= 0) {
						@Pc(148) Class62 local148 = Static130.method1730(Static86.aClass7_Sub1_16, local10.anInt2816);
						if (local148 != null) {
							@Pc(155) Class6_Sub11_Sub1 local155 = local148.method1728().method1879(Static69.aClass43_1);
							@Pc(160) Class6_Sub6_Sub1 local160 = Static126.method772(local155, local130);
							local160.method784(-1);
							Static54.aClass6_Sub6_Sub2_1.method1625(local160);
							local10.aClass6_Sub6_Sub1_3 = local160;
						}
					}
					if (local10.aClass6_Sub6_Sub1_2 != null) {
						local10.aClass6_Sub6_Sub1_2.method759(local130);
						if (!local10.aClass6_Sub6_Sub1_2.method2124()) {
							local10.aClass6_Sub6_Sub1_2 = null;
						}
					} else if (local10.anIntArray297 != null && (local10.anInt2812 -= arg2) <= 0) {
						@Pc(205) int local205 = (int) ((double) local10.anIntArray297.length * Math.random());
						@Pc(213) Class62 local213 = Static130.method1730(Static86.aClass7_Sub1_16, local10.anIntArray297[local205]);
						if (local213 != null) {
							@Pc(220) Class6_Sub11_Sub1 local220 = local213.method1728().method1879(Static69.aClass43_1);
							@Pc(225) Class6_Sub6_Sub1 local225 = Static126.method772(local220, local130);
							local225.method784(0);
							Static54.aClass6_Sub6_Sub2_1.method1625(local225);
							local10.anInt2812 = (int) (Math.random() * (double) (local10.anInt2809 - local10.anInt2813)) + local10.anInt2813;
							local10.aClass6_Sub6_Sub1_2 = local225;
						}
					}
				}
			}
		}
	}
}
