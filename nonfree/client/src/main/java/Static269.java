import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	public static int anInt5047;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!dp;")
	public static Class53 aClass53_124;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public static int anInt5055;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString215 = "slide:";

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII)V")
	public static void method4643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class6_Sub2_Sub8 local15 = Static239.method5786(15, 0);
		local15.method2648();
		local15.anInt2511 = arg1;
		local15.anInt2507 = arg0;
	}
}
