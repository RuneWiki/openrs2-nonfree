import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_84 = new Class154(16);

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "Z")
	public static boolean aBoolean495 = true;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString205 = "green:";

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "[I")
	public static final int[] anIntArray454 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!lh;ZILjava/lang/String;Z)V")
	public static void method4768(@OriginalArg(0) Class120 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static184.method3415(3, arg2, arg0);
			return;
		}
		@Pc(18) String local18;
		if (Static172.aString129.startsWith("win") && Static172.anInt3803 != 3) {
			local18 = null;
			if (arg0.anApplet1 != null) {
				local18 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local18 == null || !local18.equals("1")) {
				@Pc(38) Class51 local38 = Static184.method3415(0, arg2, arg0);
				Static181.aClass51_5 = local38;
				Static211.aString160 = arg2;
				Static281.aClass120_5 = arg0;
				return;
			}
		}
		if (Static172.aString129.startsWith("mac")) {
			local18 = null;
			if (arg0.anApplet1 != null) {
				local18 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local18 != null && local18.equals("1") && arg1) {
				Static184.method3415(1, arg2, arg0);
				return;
			}
		}
		Static184.method3415(2, arg2, arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)V")
	public static void method4769(@OriginalArg(1) int arg0) {
		Static241.anInt5033 = arg0;
		Static110.aClass154_37.method4219();
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
	public static void method4770() {
		Static220.aClass4_Sub18_1 = new Class4_Sub18(Static285.aString211, "", Static23.anInt410, 1007, 0L, 0, 0);
	}
}
