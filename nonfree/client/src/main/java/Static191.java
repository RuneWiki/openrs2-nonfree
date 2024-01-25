import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIJZIZLjava/lang/String;Ljava/lang/String;III)V")
	public static void method2806(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static346.aBoolean427 && Static83.anInt1893 < 500) {
			@Pc(16) int local16 = arg3 == -1 ? Static52.anInt1389 : arg3;
			@Pc(30) Class4_Sub21 local30 = new Class4_Sub21(arg5, arg6, local16, arg9, arg8, arg1, arg0, arg7, arg4, arg2);
			Static126.aClass258_19.method5526(local30);
			Static83.anInt1893++;
		}
	}
}
