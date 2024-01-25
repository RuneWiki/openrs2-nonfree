import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static58 {

	@OriginalMember(owner = "client!bu", name = "y", descriptor = "Lclient!me;")
	public static Class230 aClass230_1;

	@OriginalMember(owner = "client!bu", name = "n", descriptor = "Lclient!ep;")
	public static final Class103 aClass103_1 = new Class103("LIVE", 0);

	@OriginalMember(owner = "client!bu", name = "z", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_44 = new Class196(101, -2);

	@OriginalMember(owner = "client!bu", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString7 = null;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IBIIIIII)V")
	public static void method875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg1) {
			Static531.method7413(arg4, arg0, arg2, arg6, arg5, arg3);
		} else if (Static361.anInt6317 <= arg0 - arg6 && arg0 + arg6 <= Static651.anInt10267 && arg3 - arg1 >= Static128.anInt2200 && Static380.anInt6585 >= arg1 + arg3) {
			Static73.method1087(arg4, arg5, arg0, arg3, arg2, arg1, arg6);
		} else {
			Static307.method4722(arg4, arg0, arg1, arg3, arg2, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!cb;I)V")
	public static void method876(@OriginalArg(0) Class50 arg0) {
		Static441.aClass50_125 = arg0;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
	public static void method877() {
		Static371.aClass143_7.method6222(Static563.aClass56_13);
		Static371.aClass143_7.DA(Static506.anInt8606, Static127.anInt2188, Static520.anInt8706, Static233.anInt3760);
	}
}
