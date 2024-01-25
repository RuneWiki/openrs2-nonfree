import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!md", name = "g", descriptor = "F")
	public static float aFloat112;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!kg;")
	public static Class200 aClass200_117 = null;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Z")
	public static boolean aBoolean404 = false;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!md", name = "n", descriptor = "I")
	public static int anInt5494 = 0;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
	public static void method4788() {
		Static64.aClass323_6.method7485();
		Static67.aClass290_1.method6675();
		Static103.aClass290_3.method6675();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
	public static void method4792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(17, arg0);
		local8.method925();
		local8.anInt852 = arg1;
	}
}
