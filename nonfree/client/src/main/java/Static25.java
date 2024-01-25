import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
	public static int anInt451 = -1;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_12 = new Class211(99, -1);

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "[I")
	public static final int[] anIntArray41 = new int[250];

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
	public static void method362() {
		if (Static396.anInt7302 != -1) {
			Static219.method4784(false, -1, -1, Static396.anInt7302);
			Static396.anInt7302 = -1;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;ZZBLclient!or;)V")
	public static void method363(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class183 arg3) {
		if (!arg1) {
			Static290.method3869(arg3, 3, arg0);
			return;
		}
		@Pc(21) String local21;
		if (Static293.aString142.startsWith("win") && Static293.anInt4810 != 3) {
			local21 = null;
			if (arg3.anApplet1 != null) {
				local21 = arg3.anApplet1.getParameter("haveie6");
			}
			if (local21 == null || !local21.equals("1")) {
				@Pc(41) Class91 local41 = Static290.method3869(arg3, 0, arg0);
				Static228.aClass91_4 = local41;
				Static360.aClass183_4 = arg3;
				Static170.aString90 = arg0;
				return;
			}
		}
		if (Static293.aString142.startsWith("mac")) {
			local21 = null;
			if (arg3.anApplet1 != null) {
				local21 = arg3.anApplet1.getParameter("havefirefox");
			}
			if (local21 != null && local21.equals("1") && arg2) {
				Static290.method3869(arg3, 1, arg0);
				return;
			}
		}
		Static290.method3869(arg3, 2, arg0);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)[Lclient!kb;")
	public static Class133[] method364() {
		return new Class133[] { Static400.aClass133_4, Static285.aClass133_2, Static47.aClass133_1 };
	}
}
