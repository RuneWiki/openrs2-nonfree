import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "Lclient!mf;")
	public static Class153 aClass153_1;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "Lclient!fa;")
	public static final Class77 aClass77_5 = new Class77(512);

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "[I")
	public static final int[] anIntArray144 = new int[500];

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/lang/String;IIBIII)V")
	public static void method889(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Class41_Sub4 local11 = new Class41_Sub4();
		local11.anInt4960 = arg3;
		local11.aString57 = arg1;
		local11.anInt4953 = arg6;
		local11.anInt4957 = arg2 + Static366.anInt5883;
		local11.anInt4952 = arg4;
		local11.anInt4955 = arg0;
		local11.anInt4958 = arg5;
		Static10.aClass208_1.method4664(local11);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method891(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static177.method1119(Static315.aClass48_190);
		Static209.aClass1_Sub33_Sub2_2.method5165(Static56.method903(arg1) + 1);
		Static209.aClass1_Sub33_Sub2_2.method5153(arg0);
		Static209.aClass1_Sub33_Sub2_2.method5143(arg1);
	}
}
