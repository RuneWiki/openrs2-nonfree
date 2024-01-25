import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)I")
	public static int method7641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static125.aByteArrayArray9 == null ? 0 : Static125.aByteArrayArray9[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;IZIIZIJ)V")
	public static void method7642(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) long arg9) {
		if (!Static228.aBoolean342 && Static179.anInt4933 < 500) {
			@Pc(16) int local16 = arg4 == -1 ? Static7.anInt488 : arg4;
			@Pc(30) Class3_Sub11 local30 = new Class3_Sub11(arg3, arg1, local16, arg8, arg2, arg9, arg6, arg5, arg0, arg7);
			Static255.aClass71_43.method2076(local30);
			Static179.anInt4933++;
		}
	}
}
