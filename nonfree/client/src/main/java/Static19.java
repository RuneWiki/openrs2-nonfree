import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_3;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	public static int anInt623;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!r;")
	public static Class61 aClass61_183 = Static129.method2060("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!r;")
	public static Class61 aClass61_184 = Static129.method2060("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	public static void method449() {
		if (!Static32.aBoolean27) {
			return;
		}
		@Pc(11) Class5_Sub11 local11 = Static98.method1667(Static59.anInt1436, Static16.anInt491);
		if (local11 != null && local11.anObjectArray22 != null) {
			@Pc(20) Class5_Sub22 local20 = new Class5_Sub22();
			local20.aClass5_Sub11_12 = local11;
			local20.anObjectArray28 = local11.anObjectArray22;
			Static76.method1228(local20);
		}
		Static32.aBoolean27 = false;
		Static24.method505(local11);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	public static void method450() {
		aClass61_183 = null;
		aClass26_Sub1_3 = null;
		aClass61_184 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!r;I)Z")
	public static boolean method454(@OriginalArg(0) Class61 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static114.anInt2962; local19++) {
			if (arg0.method1709(Static104.aClass61Array18[local19])) {
				return true;
			}
		}
		return false;
	}
}
