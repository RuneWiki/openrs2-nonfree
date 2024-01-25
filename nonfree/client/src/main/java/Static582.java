import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static582 {

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "Lclient!ae;")
	public static Class8 aClass8_127;

	@OriginalMember(owner = "client!tr", name = "r", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_337 = new Class179(16, 2);

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_338 = new Class179(60, 2);

	@OriginalMember(owner = "client!tr", name = "u", descriptor = "[Lclient!gf;")
	public static final Class119[] aClass119Array1 = new Class119[14];

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
	public static void method8066(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static643.aBooleanArray35[arg0]) {
			aClass8_127.method270(arg0);
			Static109.aClass321ArrayArray1[arg0] = null;
			Static202.aClass321ArrayArray2[arg0] = null;
			Static643.aBooleanArray35[arg0] = false;
		}
	}
}
