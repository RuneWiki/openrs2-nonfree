import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!mb", name = "Ub", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_16;

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "Lclient!id;")
	public static Class34 aClass34_997 = Static9.method266("null");

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "[I")
	public static int[] anIntArray229 = new int[25];

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "Lclient!id;")
	public static Class34 aClass34_998 = Static9.method266("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!mb", name = "wb", descriptor = "I")
	public static int anInt2021 = 0;

	@OriginalMember(owner = "client!mb", name = "zb", descriptor = "Lclient!id;")
	public static Class34 aClass34_999 = Static9.method266("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!mb", name = "Qb", descriptor = "Lclient!id;")
	private static Class34 aClass34_1004 = Static9.method266("Malformed login packet)3");

	@OriginalMember(owner = "client!mb", name = "Gb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1000 = aClass34_1004;

	@OriginalMember(owner = "client!mb", name = "Kb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1001 = null;

	@OriginalMember(owner = "client!mb", name = "Ob", descriptor = "Lclient!id;")
	public static Class34 aClass34_1003 = Static9.method266(")2");

	@OriginalMember(owner = "client!mb", name = "Yb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1005 = Static9.method266("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public static void method1327() {
		aClass34_1005 = null;
		aClass35_Sub1_16 = null;
		aClass34_999 = null;
		aClass34_997 = null;
		aClass34_998 = null;
		aClass34_1001 = null;
		aClass34_1000 = null;
		anIntArray229 = null;
		aClass34_1004 = null;
		aClass34_1003 = null;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)Lclient!mb;")
	public static Class1_Sub1_Sub8 method1334(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub8 local12 = (Class1_Sub1_Sub8) Static100.aClass63_19.method1663((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static97.aClass35_24.method1573(10, arg0);
		local12 = new Class1_Sub1_Sub8();
		local12.anInt1999 = arg0;
		if (local22 != null) {
			local12.method1330(new Class1_Sub19(local22));
		}
		local12.method1332();
		if (local12.anInt2037 != -1) {
			local12.method1328(method1334(local12.anInt2022), method1334(local12.anInt2037));
		}
		if (!Static7.aBoolean23 && local12.aBoolean107) {
			local12.aClass34_1002 = Static110.aClass34_1261;
			local12.aClass34Array18 = null;
			local12.anInt2003 = 0;
			local12.aClass34Array17 = null;
		}
		Static100.aClass63_19.method1659(local12, (long) arg0);
		return local12;
	}
}
