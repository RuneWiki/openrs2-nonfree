import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static316 {

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "F")
	public static float aFloat134;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
	public static int anInt6013 = 0;

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "[Lclient!os;")
	public static final Class1_Sub17[] aClass1_Sub17Array1 = new Class1_Sub17[2048];

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "[I")
	public static int[] anIntArray473 = new int[1];

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "[Lclient!sba;")
	public static final Class1_Sub2_Sub17[] aClass1_Sub2_Sub17Array3 = new Class1_Sub2_Sub17[14];

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "([Ljava/lang/Object;[JZ)V")
	public static void method5450(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static235.method4192(arg1, arg0, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)V")
	public static void method5451(@OriginalArg(0) int arg0) {
		if (Static109.anIntArray179 == null || arg0 > Static109.anIntArray179.length) {
			Static109.anIntArray179 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V")
	public static void method5452() {
		if (Static458.aBoolean588) {
			return;
		}
		Static458.aBoolean588 = true;
		Static506.aBoolean670 = true;
		if (Static286.aClass1_Sub15_Sub1_1.aBoolean528) {
			Static49.aFloat29 = (int) Static49.aFloat29 - 17 & 0xFFFFFFF0;
		} else {
			Static349.aFloat136 += (-12.0F - Static349.aFloat136) / 2.0F;
		}
	}
}
