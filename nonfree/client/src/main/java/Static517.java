import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static517 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "Lclient!kca;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "F")
	public static float aFloat207;

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "Z")
	public static boolean aBoolean697;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "[I")
	public static int[] anIntArray554 = new int[1];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILclient!lr;)V")
	public static void method6673(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub7_Sub2 arg1) {
		Static363.aBoolean479 = false;
		Static179.anInt2668 = 0;
		Static347.method5022(arg1);
		Static295.method4258(arg1);
		if (Static363.aBoolean479) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt5186) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt5186 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
	public static void method6674(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static138.method1904(arg1.length - 1, 0, arg1, arg0);
	}
}
