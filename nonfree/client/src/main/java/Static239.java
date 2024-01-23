import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
	public static int anInt4333;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!nk;")
	public static Class121 aClass121_103;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33 = new String[200];

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "[F")
	public static float[] aFloatArray14 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "[I")
	public static int[] anIntArray370 = new int[1000];

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Z")
	public static boolean aBoolean299 = true;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString247 = " is already on your ignore list.";

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	public static void method3681(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub11 local10 = Static5.method35(arg0, 5);
		local10.method2873();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3682(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static74.method1468("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIB)I")
	public static int method3683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = 0;
		while (arg0 > 0) {
			arg0--;
			local3 = local3 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Lclient!fe;")
	public static Class23_Sub1 method3684() {
		@Pc(21) Class23_Sub1 local21 = new Class23_Sub1(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[0], Static254.anIntArray412[0], Static160.anIntArray267[0], Static235.anIntArray468[0], Static69.aByteArrayArray15[0], Static83.anIntArray144);
		Static117.method2101();
		return local21;
	}
}
