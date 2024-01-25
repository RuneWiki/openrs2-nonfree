import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static392 {

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
	public static int anInt6964;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
	public static int anInt6966;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "Lclient!rh;")
	public static final Class275 aClass275_145 = new Class275();

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!fca;BI)Ljava/lang/String;")
	public static String method5805(@OriginalArg(0) Class97 arg0, @OriginalArg(2) int arg1) {
		if (!Static65.method862(arg0).method6473(arg1) && arg0.anObjectArray20 == null) {
			return null;
		} else if (arg0.aStringArray11 == null || arg0.aStringArray11.length <= arg1 || arg0.aStringArray11[arg1] == null || arg0.aStringArray11[arg1].trim().length() == 0) {
			return Static446.aBoolean529 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray11[arg1];
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBI)Z")
	public static boolean method5806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)Z")
	public static boolean method5808(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
