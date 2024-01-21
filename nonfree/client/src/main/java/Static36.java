import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	public static int anInt1081;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public static int anInt1076 = 0;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_247 = Static158.method3034(" <col=ffffff>");

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_253 = Static158.method3034("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Lclient!ob;")
	public static Class60 aClass60_248 = aClass60_253;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_249 = Static158.method3034("Registrierter Benutzer");

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!ob;")
	public static Class60 aClass60_250 = aClass60_253;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_252 = Static158.method3034("Members object");

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!ob;")
	public static Class60 aClass60_251 = aClass60_252;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public static int anInt1079 = 1;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
	public static int anInt1080 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ud;I)V")
	public static void method828(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0) {
		@Pc(8) int local8 = arg0.anInt3263 - Static20.anInt580;
		@Pc(19) int local19 = arg0.anInt3298 * 128 + arg0.anInt3286 * 64;
		@Pc(29) int local29 = arg0.anInt3257 * 128 + arg0.anInt3286 * 64;
		arg0.anInt3273 += (local29 - arg0.anInt3273) / local8;
		arg0.anInt3302 += (local19 - arg0.anInt3302) / local8;
		arg0.anInt3275 = 0;
		if (arg0.anInt3267 == 0) {
			arg0.anInt3255 = 1024;
		}
		if (arg0.anInt3267 == 1) {
			arg0.anInt3255 = 1536;
		}
		if (arg0.anInt3267 == 2) {
			arg0.anInt3255 = 0;
		}
		if (arg0.anInt3267 == 3) {
			arg0.anInt3255 = 512;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method830() {
		if (!Static58.aBoolean74) {
			return;
		}
		@Pc(11) Class72 local11 = Static181.method3381(Static115.anInt3208, Static141.anInt3690);
		if (local11 != null && local11.anObjectArray19 != null) {
			@Pc(20) Class2_Sub25 local20 = new Class2_Sub25();
			local20.aClass72_15 = local11;
			local20.anObjectArray29 = local11.anObjectArray19;
			Static197.method3578(local20);
		}
		Static58.aBoolean74 = false;
		Static39.method900(local11);
	}
}
