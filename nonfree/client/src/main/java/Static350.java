import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static350 {

	@OriginalMember(owner = "client!kla", name = "c", descriptor = "Lclient!bt;")
	public static final Class3_Sub12 aClass3_Sub12_1 = new Class3_Sub12(0, 0);

	@OriginalMember(owner = "client!kla", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4930(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!kla", name = "a", descriptor = "(BII)Z")
	public static boolean method4931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static688.method9111(arg1, arg0) | (arg0 & 0x70000) != 0 || Static401.method5419(arg1, arg0);
	}
}
