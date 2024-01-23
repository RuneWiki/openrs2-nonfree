import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "[Lclient!pn;")
	public static Class1_Sub2_Sub11[] aClass1_Sub2_Sub11Array2;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	public static int anInt2557 = 0;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Z")
	public static boolean aBoolean184 = true;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString148 = "Close";

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
	public static int anInt2559 = 0;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "[I")
	public static int[] anIntArray230 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
	public static void method2040() {
		Static246.aClass135_31.method3324();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!fj;III)V")
	public static void method2041(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt4620 == arg2 && arg2 != -1) {
			@Pc(19) Class125 local19 = Static90.method1591(arg2);
			@Pc(22) int local22 = local19.anInt3941;
			if (local22 == 1) {
				arg0.anInt4695 = arg1;
				arg0.anInt4662 = 1;
				arg0.anInt4637 = 0;
				arg0.anInt4633 = 0;
				arg0.anInt4693 = 0;
				Static77.method1354(arg0.anInt4633, arg0 == Static197.aClass14_Sub2_Sub1_2, arg0.anInt4680, local19, arg0.anInt4630);
			}
			if (local22 == 2) {
				arg0.anInt4693 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt4620 == -1 || Static90.method1591(arg2).anInt3944 >= Static90.method1591(arg0.anInt4620).anInt3944) {
			arg0.anInt4637 = 0;
			arg0.anInt4693 = 0;
			arg0.anInt4633 = 0;
			arg0.anInt4662 = 1;
			arg0.anInt4665 = arg0.anInt4678;
			arg0.anInt4620 = arg2;
			arg0.anInt4695 = arg1;
			if (arg0.anInt4620 != -1) {
				Static77.method1354(arg0.anInt4633, Static197.aClass14_Sub2_Sub1_2 == arg0, arg0.anInt4680, Static90.method1591(arg0.anInt4620), arg0.anInt4630);
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)[F")
	public static float[] method2042() {
		@Pc(13) float local13 = Static28.method561() + Static28.method557();
		@Pc(15) int local15 = Static28.method562();
		@Pc(22) float local22 = (float) (local15 & 0xFF) / 255.0F;
		@Pc(31) float local31 = (float) (local15 >> 8 & 0xFF) / 255.0F;
		Static278.aFloatArray28[3] = 1.0F;
		@Pc(37) float local37 = 0.58823526F;
		Static278.aFloatArray28[2] = local13 * local37 * local22 * Static279.aFloatArray29[2];
		@Pc(58) float local58 = (float) (local15 >> 16 & 0xFF) / 255.0F;
		Static278.aFloatArray28[1] = local13 * local37 * local31 * Static279.aFloatArray29[1];
		Static278.aFloatArray28[0] = Static279.aFloatArray29[0] * local58 * local37 * local13;
		return Static278.aFloatArray28;
	}
}
