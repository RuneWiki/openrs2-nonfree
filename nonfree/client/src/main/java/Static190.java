import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	public static int anInt3834;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	public static int anInt3835;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	public static int anInt3828 = 0;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!s;")
	public static final Class217 aClass217_85 = new Class217(60, -1);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZ)V")
	public static void method3038(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) Class10_Sub44 local13 = Static40.method555(arg0, arg1);
		if (local13 != null) {
			local13.method6033();
		}
	}
}
