import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
	public static int anInt3975;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "Lclient!tw;")
	public static final Class322 aClass322_4 = new Class322();

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
	public static int anInt3974 = 0;

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "Lclient!dc;")
	public static final Class68 aClass68_7 = new Class68(12, 0, 1, 0);

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IBI)Z")
	public static boolean method3138(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(BI)V")
	public static void method3139(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg0, 1);
		local8.method2302();
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILclient!is;I)Ljava/lang/String;")
	public static String method3140(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1) {
		if (!Static70.method1542(arg1).method6326(arg0) && arg1.anObjectArray28 == null) {
			return null;
		} else if (arg1.aStringArray18 == null || arg1.aStringArray18.length <= arg0 || arg1.aStringArray18[arg0] == null || arg1.aStringArray18[arg0].trim().length() == 0) {
			return Static80.aBoolean170 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray18[arg0];
		}
	}
}
