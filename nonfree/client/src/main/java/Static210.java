import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hha", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray51;

	@OriginalMember(owner = "client!hha", name = "f", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_168 = new Class145(61, 4);

	@OriginalMember(owner = "client!hha", name = "i", descriptor = "Lclient!et;")
	public static final Class104 aClass104_18 = new Class104(1);

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V")
	public static void method8324() {
		Static442.aClass114_39.method2768();
		Static570.anInt9341 = 0;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(II)V")
	public static void method8325() {
		Static246.aBoolean357 = false;
		Static275.anInt5095 = 1;
		Static40.anInt841 = 2;
		Static79.aClass2_Sub11_Sub1_1 = null;
		Static543.anInt8776 = -1;
		Static64.anInt1727 = 0;
		Static309.anInt7821 = -1;
		Static510.aClass238_229 = null;
	}

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)V")
	public static void method8326() {
		if (!Static557.aBoolean660) {
			return;
		}
		@Pc(11) Class303 local11 = Static71.method1631(Static252.anInt4804, Static454.anInt7419);
		if (local11 != null && local11.anObjectArray11 != null) {
			@Pc(20) Class2_Sub18 local20 = new Class2_Sub18();
			local20.aClass303_4 = local11;
			local20.anObjectArray1 = local11.anObjectArray11;
			Static156.method2728(local20);
		}
		Static264.anInt4966 = -1;
		Static557.aBoolean660 = false;
		Static398.anInt6843 = -1;
		if (local11 != null) {
			Static514.method7103(local11);
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IBI)Z")
	public static boolean method8327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static278.method4492(arg1, arg0) | (arg1 & 0x800) != 0 || Static591.method8346(arg1, arg0);
	}
}
