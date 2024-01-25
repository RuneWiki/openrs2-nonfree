import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!ot", name = "K", descriptor = "I")
	public static int anInt6906;

	@OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
	public static int anInt6900 = 0;

	@OriginalMember(owner = "client!ot", name = "F", descriptor = "Lclient!fc;")
	public static final Class93 aClass93_4 = new Class93("LOCAL", 4);

	@OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
	public static int anInt6903 = 0;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILjava/lang/String;IZZLjava/lang/String;JIII)V")
	public static void method5573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) String arg6, @OriginalArg(7) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static406.aBoolean553 && Static22.anInt572 < 500) {
			@Pc(22) int local22 = arg3 == -1 ? Static422.anInt7430 : arg3;
			@Pc(36) Class1_Sub40 local36 = new Class1_Sub40(arg2, arg6, local22, arg0, arg9, arg7, arg8, arg1, arg5, arg4);
			Static166.aClass111_49.method2552(local36);
			Static22.anInt572++;
		}
	}
}
