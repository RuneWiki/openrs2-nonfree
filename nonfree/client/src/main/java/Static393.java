import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static393 {

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[Lclient!f;")
	public static Class88[] aClass88Array9;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public static int anInt7666;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
	public static final int[] anIntArray412 = new int[3];

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!au;")
	public static final Class22 aClass22_52 = new Class22();

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString154 = null;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Z")
	public static boolean aBoolean559 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
	public static boolean method6013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static345.method5260(arg0, arg1) || Static363.method5477(arg1, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6014(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V")
	public static void method6015(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static247.anInt5090 = arg3;
		Static587.anInt10509 = arg4;
		Static447.anInt10076 = arg0;
		Static556.anInt10149 = arg1;
		Static205.anInt4300 = arg5;
		Static95.anInt2390 = arg2;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method6016(@OriginalArg(0) String arg0) {
		return Static281.method4483(arg0, 10);
	}
}
