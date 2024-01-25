import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_19 = new Class143(14, 2);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5227(@OriginalArg(0) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static209.aClass140_165.method4155(Static239.anInt2803) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static150.aClass140_82.method4155(Static239.anInt2803) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZI)V")
	public static void method5228(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static269.anInt6658 != -1) {
				Static25.method324(Static269.anInt6658);
			}
			for (@Pc(15) Class2_Sub40 local15 = (Class2_Sub40) Static303.aClass41_32.method896(); local15 != null; local15 = (Class2_Sub40) Static303.aClass41_32.method904()) {
				if (!local15.method5722()) {
					local15 = (Class2_Sub40) Static303.aClass41_32.method896();
					if (local15 == null) {
						break;
					}
				}
				Static357.method5709(true, false, local15);
			}
			Static269.anInt6658 = -1;
			Static303.aClass41_32 = new Class41(8);
			Static328.method5595();
			Static269.anInt6658 = Static124.anInt2618;
			Static205.method3918(false);
			Static35.method5765();
			Static367.method5888(Static269.anInt6658);
		}
		Static285.method4833();
		Static145.anInt3131 = -1;
		Static32.method441(Static128.anInt2760);
		Static177.aClass1_Sub2_Sub3_Sub1_1 = new Class1_Sub2_Sub3_Sub1();
		Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 = 6656;
		Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0] = 52;
		Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 = 6656;
		Static51.anInt879 = 0;
		Static166.anInt3804 = 0;
		Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0] = 52;
		if (Static135.anInt2910 == 2) {
			Static166.anInt3804 = Static132.anInt2841 << 7;
			Static51.anInt879 = Static243.anInt5174 << 7;
		} else {
			Static125.method2441();
		}
		Static225.method4189();
		if (Static166.anInt3804 == 0 || Static51.anInt879 == 0) {
			Static224.method5495(10);
		} else {
			Static92.method1836();
			Static224.method5495(28);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)I")
	public static int method5229() {
		return 6;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V")
	public static void method5230() {
		Static41.aClass107_41.method3011(5);
		Static84.aClass107_9.method3011(5);
	}
}
