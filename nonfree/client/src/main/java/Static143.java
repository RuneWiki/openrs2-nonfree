import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static143 {

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "[Lclient!qv;")
	public static Class210[] aClass210Array1;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "[S")
	public static final short[] aShortArray36 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!em;II)Ljava/lang/String;")
	public static String method2406(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1) {
		if (!Static47.method787(arg0).method5399(arg1) && arg0.anObjectArray15 == null) {
			return null;
		} else if (arg0.aStringArray11 == null || arg1 >= arg0.aStringArray11.length || arg0.aStringArray11[arg1] == null || arg0.aStringArray11[arg1].trim().length() == 0) {
			return Static154.aBoolean245 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray11[arg1];
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)[Lclient!wa;")
	public static Class258[] method2411() {
		return new Class258[] { Static76.aClass258_1, Static341.aClass258_3, Static146.aClass258_4 };
	}
}
