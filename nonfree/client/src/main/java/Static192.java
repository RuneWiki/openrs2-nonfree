import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "Lclient!qs;")
	public static Class211 aClass211_49;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "Lclient!hn;")
	public static Class108 aClass108_1;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_104 = new Class158("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "J")
	public static long aLong110 = 0L;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
	public static void method3103() {
		if (!Static293.aBoolean300) {
			return;
		}
		@Pc(11) Class68 local11 = Static115.method1866(Static132.anInt2941, Static118.anInt2743);
		if (local11 != null && local11.anObjectArray25 != null) {
			@Pc(20) Class1_Sub10 local20 = new Class1_Sub10();
			local20.aClass68_3 = local11;
			local20.anObjectArray2 = local11.anObjectArray25;
			Static178.method3000(local20);
		}
		Static49.anInt1209 = -1;
		Static189.anInt3984 = -1;
		Static293.aBoolean300 = false;
		if (local11 != null) {
			Static446.method6042(local11);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3105(@OriginalArg(0) String arg0) {
		Static227.method3471("", 0, arg0, 0, "");
	}
}
