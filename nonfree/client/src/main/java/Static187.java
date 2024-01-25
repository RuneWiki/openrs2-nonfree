import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static187 {

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
	public static int anInt6938 = 0;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Z")
	public static boolean aBoolean588 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZI)V")
	public static void method5442(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		Static226.method3487(arg3, arg2, arg0, -1, arg4, null, arg1);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public static void method5443() {
		if (Static398.anInt5978 == 5) {
			Static398.anInt5978 = 6;
		}
	}
}
