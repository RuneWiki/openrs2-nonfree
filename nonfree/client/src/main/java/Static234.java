import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "Lclient!qj;")
	public static Class165 aClass165_71;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "Lclient!cq;")
	public static final Class33 aClass33_1 = new Class33(100);

	@OriginalMember(owner = "client!pe", name = "E", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_121 = new Class140(100);

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
	public static int anInt4602 = 0;

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_122 = new Class140(64);

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)I")
	public static int method4207() {
		return 6;
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
	public static void method4209() {
		if (Static29.aString22.length() == 0) {
			return;
		}
		Static276.method4789("--> " + Static29.aString22);
		Static280.method4824(false, Static29.aString22);
		Static157.anInt3130 = 0;
		Static29.aString22 = "";
		Static157.anInt3135 = 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!qj;)I")
	public static int method4211(@OriginalArg(1) Class165 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method4486(Static311.anInt5989)) {
			local10++;
		}
		if (arg0.method4486(Static81.anInt1604)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
	public static void method4212() {
		Static152.anInt3053 = -1;
		Static298.anInt5959 = 0;
		Static99.anInt1954 = -1;
		Static94.anInt1845 = -1;
	}
}
