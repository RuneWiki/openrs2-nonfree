import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static321 {

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
	public static int anInt3403;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_45 = new Class244(34, 7);

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "Lclient!vp;")
	public static final Class240 aClass240_73 = new Class240("", 17);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2984(@OriginalArg(0) String arg0) {
		return Static259.method2661(arg0, 10);
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method2985(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
