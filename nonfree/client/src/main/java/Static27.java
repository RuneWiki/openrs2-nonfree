import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
	public static int anInt377;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
	public static int anInt379;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IJIZILjava/lang/String;ZIZLjava/lang/String;JII)V")
	public static void method371(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) String arg8, @OriginalArg(10) long arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (!Static189.aBoolean301 && Static535.anInt8486 < 500) {
			@Pc(23) int local23 = arg0 == -1 ? Static85.anInt1436 : arg0;
			@Pc(48) Class2_Sub6_Sub20 local48 = new Class2_Sub6_Sub20(arg4, arg8, local23, arg6, arg3, arg9, arg11, arg10, arg2, arg7, arg1, arg5);
			Static470.method6734(local48);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method373(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (arg0.length() > 320 || !Static121.method1814()) {
			return;
		}
		Static487.aClass221_1.method5170();
		Static617.method8386();
		Static376.aString64 = arg0;
		Static489.aString91 = arg1;
		Static261.method9374(-76, 5);
	}
}
