import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString132;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	public static int anInt3189;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public static int anInt3184 = 0;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
	public static int anInt3185 = 0;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString133 = "Loading - please wait.";

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
	public static int anInt3191 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
	public static void method3326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(8, arg0);
		local8.method2648();
		local8.anInt2510 = arg1;
		local8.anInt2511 = arg2;
		local8.anInt2507 = arg3;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method3327() {
		Static268.aClass70_86.method1399();
	}
}
