import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
	public static int anInt2980;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "[Lclient!pn;")
	public static Class1_Sub2_Sub11[] aClass1_Sub2_Sub11Array3;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIB)V")
	public static void method2307(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static68.anInt1451 = arg1;
		Static49.anInt1129 = arg0;
		Static224.anInt4436 = 0;
		Static297.anInt5619 = 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method2309(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static24.method3641(Static93.method1658(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
