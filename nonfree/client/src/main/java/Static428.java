import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "Lclient!tr;")
	public static final Class237 aClass237_18 = new Class237(10, 7);

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(III)Z")
	public static boolean method5677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIILclient!se;)V")
	public static void method5679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31_Sub1 arg3) {
		@Pc(4) Class80 local4 = Static317.method4490(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass31_Sub1_2 = arg3;
		}
	}
}
