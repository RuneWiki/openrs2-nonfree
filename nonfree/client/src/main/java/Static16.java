import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!vh;")
	public static Class187 aClass187_158 = new Class187(5);

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString341 = "Hidden";

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "Lclient!mk;")
	public static Class111 aClass111_115 = new Class111();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZZZBI)Lclient!nk;")
	public static Class121 method4780(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Class138 local5 = null;
		if (Static72.aClass68_8 != null) {
			local5 = new Class138(arg3, Static72.aClass68_8, Static87.aClass68Array1[arg3], 1000000);
		}
		Static5.aClass21_Sub1Array1[arg3] = Static66.aClass109_3.method2913(Static135.aClass138_2, arg3, local5);
		if (arg2) {
			Static5.aClass21_Sub1Array1[arg3].method2414();
		}
		return new Class121(Static5.aClass21_Sub1Array1[arg3], arg0, arg1);
	}
}
