import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ga", name = "cb", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!ga", name = "nb", descriptor = "Lclient!sb;")
	public static Class25 aClass25_47;

	@OriginalMember(owner = "client!ga", name = "qb", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_13;

	@OriginalMember(owner = "client!ga", name = "ub", descriptor = "I")
	public static int anInt1035;

	@OriginalMember(owner = "client!ga", name = "gb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_517 = Static75.method1216("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!ga", name = "hb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_518 = Static75.method1216("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!ga", name = "mb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_519 = null;

	@OriginalMember(owner = "client!ga", name = "ob", descriptor = "Lclient!ad;")
	public static Class4 aClass4_520 = aClass4_517;

	@OriginalMember(owner = "client!ga", name = "pb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_521 = Static75.method1216("Message");

	@OriginalMember(owner = "client!ga", name = "sb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_522 = Static75.method1216("@gre@");

	@OriginalMember(owner = "client!ga", name = "xb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_523 = aClass4_521;

	@OriginalMember(owner = "client!ga", name = "yb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_524 = Static75.method1216("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
	public static void method707() {
		for (@Pc(6) Class3_Sub8 local6 = (Class3_Sub8) Static7.aClass20_1.method308(); local6 != null; local6 = (Class3_Sub8) Static7.aClass20_1.method309()) {
			if (local6.aClass3_Sub1_Sub5_1 != null) {
				local6.method1284();
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(IB)V")
	public static void method708(@OriginalArg(0) int arg0) {
		if (Static8.aClass30_1 == null) {
			return;
		}
		if (Static9.anInt310 != 0) {
			if (Static56.aByteArray16 == null) {
				return;
			}
			Static87.anInt1450 = arg0;
		} else if (Static35.anInt640 >= 0) {
			Static35.anInt640 = arg0;
			Static8.aClass30_1.method1878(arg0, 0);
			return;
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	public static void method709() {
		Static53.aClass8_29.method198();
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
	public static void method710() {
		aClass4_523 = null;
		aClass4_524 = null;
		aClass4_522 = null;
		aClass4_520 = null;
		aClass25_47 = null;
		aClass4_521 = null;
		aClass4_517 = null;
		aClass4_519 = null;
		aClass3_Sub1_Sub4_Sub3_13 = null;
		anIntArray96 = null;
		aClass4_518 = null;
	}
}
