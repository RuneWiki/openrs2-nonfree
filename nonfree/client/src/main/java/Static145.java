import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "Lclient!ui;")
	public static Class230 aClass230_41;

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
	public static int anInt2703;

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "Lclient!o;")
	public static final Class169 aClass169_130 = new Class169("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!hr", name = "A", descriptor = "I")
	public static int anInt2705 = 0;

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)[Lclient!eh;")
	public static Class66[] method2191() {
		return new Class66[] { Static159.aClass66_1, Static159.aClass66_2, Static159.aClass66_3, Static159.aClass66_4, Static159.aClass66_5, Static159.aClass66_6, Static159.aClass66_7, Static159.aClass66_8, Static159.aClass66_9, Static159.aClass66_10 };
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!vc;III)V")
	public static void method2193(@OriginalArg(0) int arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class1_Sub18 local16 = (Class1_Sub18) Static67.aClass17_11.method202(); local16 != null; local16 = (Class1_Sub18) Static67.aClass17_11.method207()) {
			if (local16.anInt2850 == arg2 && arg3 * 128 == local16.anInt2854 && arg0 * 128 == local16.anInt2855 && arg1.anInt5911 == local16.aClass236_1.anInt5911) {
				if (local16.aClass1_Sub7_Sub2_2 != null) {
					Static366.aClass1_Sub7_Sub4_2.method4410(local16.aClass1_Sub7_Sub2_2);
					local16.aClass1_Sub7_Sub2_2 = null;
				}
				if (local16.aClass1_Sub7_Sub2_3 != null) {
					Static366.aClass1_Sub7_Sub4_2.method4410(local16.aClass1_Sub7_Sub2_3);
					local16.aClass1_Sub7_Sub2_3 = null;
				}
				local16.method5577();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIII)V")
	public static void method2194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class41_Sub4 local10 = (Class41_Sub4) Static10.aClass208_1.method4661(); local10 != null; local10 = (Class41_Sub4) Static10.aClass208_1.method4663()) {
			if (Static366.anInt5883 >= local10.anInt4957) {
				local10.method5475();
			} else {
				Static135.method2024((local10.anInt4958 << 7) + 64, local10.anInt4952, arg3 >> 1, local10.anInt4955 * 2, (local10.anInt4953 << 7) + 64, arg0 >> 1);
				Static101.aClass137_2.method5098(0, local10.anInt4960 | 0xFF000000, Static202.anIntArray421[0] + arg2, local10.aString57, Static202.anIntArray421[1] + arg1);
			}
		}
	}
}
