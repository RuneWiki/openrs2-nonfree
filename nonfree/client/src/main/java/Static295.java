import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "[I")
	public static final int[] anIntArray441 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_183 = new Class217(34, 2);

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
	public static int anInt5680 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIZZLjava/lang/String;JLjava/lang/String;BII)V")
	public static void method5151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4, @OriginalArg(5) long arg5, @OriginalArg(6) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static217.aBoolean322 && Static224.anInt4512 < 500) {
			@Pc(23) int local23 = arg0 == -1 ? Static45.anInt1171 : arg0;
			@Pc(36) Class1_Sub22 local36 = new Class1_Sub22(arg4, arg6, local23, arg7, arg5, arg8, arg1, arg3, arg2);
			Static317.aClass42_43.method1549(local36);
			Static224.anInt4512++;
		}
	}
}
