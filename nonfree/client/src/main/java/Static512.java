import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!us;")
	public static final Class344 aClass344_109 = new Class344(18, -1);

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;IZIJLjava/lang/String;JZIIZI)V")
	public static void method7408(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) long arg4, @OriginalArg(6) String arg5, @OriginalArg(7) long arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11) {
		if (!Static433.aBoolean672 && Static443.anInt8026 < 500) {
			@Pc(27) int local27 = arg11 == -1 ? Static548.anInt9367 : arg11;
			@Pc(43) Class3_Sub1_Sub4 local43 = new Class3_Sub1_Sub4(arg5, arg1, local27, arg0, arg2, arg6, arg8, arg9, arg3, arg7, arg4, arg10);
			Static445.method6747(local43);
		}
	}
}
