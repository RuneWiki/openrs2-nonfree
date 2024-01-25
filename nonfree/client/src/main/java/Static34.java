import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray40;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public static int anInt9208;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!db;")
	public static final Class64 aClass64_459 = new Class64(60, -2);

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_126 = new Class61(70, -1);

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!qw;")
	public static final Class284 aClass284_25 = new Class284(9, 7);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
	public static void method7576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static97.aByteArrayArrayArray19 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method7577(@OriginalArg(0) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static275.aClass198_32.method4407(Static56.anInt953) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static275.aClass198_34.method4407(Static56.anInt953) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method7578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg7 < arg4 + arg3 && arg7 + arg5 > arg4) {
			return arg2 + arg6 > arg0 && arg0 + arg1 > arg6;
		} else {
			return false;
		}
	}
}
