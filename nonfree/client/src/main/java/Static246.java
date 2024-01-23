import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
	public static int anInt4882;

	@OriginalMember(owner = "client!rn", name = "C", descriptor = "[F")
	public static float[] aFloatArray28 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!rn", name = "D", descriptor = "[I")
	public static int[] anIntArray443 = new int[2000];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIBILclient!ei;)V")
	public static void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class43 arg3) {
		for (@Pc(10) Class1_Sub10 local10 = (Class1_Sub10) Static232.aClass24_20.method460(); local10 != null; local10 = (Class1_Sub10) Static232.aClass24_20.method464()) {
			if (local10.anInt963 == arg0 && arg1 * 128 == local10.anInt962 && arg2 * 128 == local10.anInt974 && local10.aClass43_1.anInt1198 == arg3.anInt1198) {
				if (local10.aClass1_Sub4_Sub1_2 != null) {
					Static303.aClass1_Sub4_Sub2_2.method774(local10.aClass1_Sub4_Sub1_2);
					local10.aClass1_Sub4_Sub1_2 = null;
				}
				if (local10.aClass1_Sub4_Sub1_1 != null) {
					Static303.aClass1_Sub4_Sub2_2.method774(local10.aClass1_Sub4_Sub1_1);
					local10.aClass1_Sub4_Sub1_1 = null;
				}
				local10.method4616();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!ph;B)V")
	public static void method3809(@OriginalArg(0) Class138 arg0) {
		Static157.aClass138_47 = arg0;
	}
}
