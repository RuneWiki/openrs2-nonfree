import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!ni", name = "ib", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_84;

	@OriginalMember(owner = "client!ni", name = "nb", descriptor = "Z")
	public static boolean aBoolean438;

	@OriginalMember(owner = "client!ni", name = "eb", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_98 = new Class47(2, 6);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V")
	public static void method5290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static401.method5861(arg1, 10);
		local8.method2582();
		local8.anInt2944 = arg0;
		local8.anInt2947 = arg3;
		local8.anInt2942 = arg2;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method5291(@OriginalArg(1) String arg0) {
		System.exit(1);
	}
}
