import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
	public static int anInt1291;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_28 = new Class47(15, 7);

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "Z")
	public static boolean aBoolean69 = true;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "[Lclient!ps;")
	public static final Class257[] aClass257Array1 = new Class257[35];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method1269(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class6_Sub2_Sub7 local12 = Static401.method5861(arg0, 3);
		local12.method2582();
		local12.aString24 = arg1;
	}
}
