import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public static int anInt6507 = 0;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Z")
	public static final boolean aBoolean451 = false;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZLjava/lang/String;JIILjava/lang/String;JZIIIZ)V")
	public static void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!Static532.aBoolean580 && Static166.anInt3037 < 500) {
			@Pc(16) int local16 = arg10 == -1 ? Static530.anInt8325 : arg10;
			@Pc(32) Class3_Sub5_Sub18 local32 = new Class3_Sub5_Sub18(arg2, arg6, local16, arg4, arg0, arg3, arg9, arg5, arg1, arg11, arg7, arg8);
			Static135.method2274(local32);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method5455(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static556.method7325(-1, arg1, arg0, (String) null, arg3, arg4, arg5, arg2);
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)Ljava/lang/String;")
	public static String method5461() {
		if (Static532.aBoolean580 || Static562.aClass3_Sub5_Sub18_7 == null) {
			return "";
		} else if ((Static562.aClass3_Sub5_Sub18_7.aString106 == null || Static562.aClass3_Sub5_Sub18_7.aString106.length() == 0) && Static562.aClass3_Sub5_Sub18_7.aString104 != null && Static562.aClass3_Sub5_Sub18_7.aString104.length() > 0) {
			return Static562.aClass3_Sub5_Sub18_7.aString104;
		} else {
			return Static562.aClass3_Sub5_Sub18_7.aString106;
		}
	}
}
