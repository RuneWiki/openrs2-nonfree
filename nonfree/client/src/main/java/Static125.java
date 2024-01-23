import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "C")
	public static char aChar2;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "[I")
	public static int[] anIntArray258 = new int[2];

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "F")
	public static float aFloat20 = 128.0F;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString164 = "";

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!cg;B)Lclient!wn;")
	public static Class15_Sub4 method2184(@OriginalArg(0) Class1_Sub11 arg0) {
		return new Class15_Sub4(arg0.method2632(), arg0.method2632(), arg0.method2632(), arg0.method2632(), arg0.method2632(), arg0.method2632(), arg0.method2632(), arg0.method2632(), arg0.method2681(), arg0.method2690());
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V")
	public static void method2186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub2_Sub18 local13 = Static130.method2227(arg3, 8);
		local13.method3905();
		local13.anInt5000 = arg1;
		local13.anInt5004 = arg2;
		local13.anInt5005 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V")
	public static void method2187() {
		Static279.aClass135_40.method3320(5);
	}
}
