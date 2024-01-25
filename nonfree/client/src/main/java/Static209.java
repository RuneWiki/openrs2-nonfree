import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!haa", name = "h", descriptor = "J")
	public static long aLong112;

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
	public static int anInt4333 = 0;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!uf;BI)Ljava/lang/String;")
	public static String method3954(@OriginalArg(0) Class357 arg0, @OriginalArg(2) int arg1) {
		if (!Static85.method1469(arg0).method1135(arg1) && arg0.anObjectArray5 == null) {
			return null;
		} else if (arg0.aStringArray77 == null || arg0.aStringArray77.length <= arg1 || arg0.aStringArray77[arg1] == null || arg0.aStringArray77[arg1].trim().length() == 0) {
			return Static214.aBoolean351 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray77[arg1];
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIII)V")
	public static void method3955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static198.method3808(Static631.anInt10922, Static427.anInt7845, arg1);
		@Pc(21) int local21 = Static198.method3808(Static631.anInt10922, Static427.anInt7845, arg3);
		@Pc(27) int local27 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg0);
		@Pc(33) int local33 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg2);
		for (@Pc(35) int local35 = local11; local35 <= local21; local35++) {
			Static567.method8614(local27, local33, Static186.anIntArrayArray12[local35], arg4);
		}
	}
}
