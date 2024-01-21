import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static122 {

	@OriginalMember(owner = "client!o", name = "sb", descriptor = "Lclient!ag;")
	public static Class4 aClass4_76;

	@OriginalMember(owner = "client!o", name = "Ab", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_40;

	@OriginalMember(owner = "client!o", name = "tb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1063 = Static161.method2971("");

	@OriginalMember(owner = "client!o", name = "eb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1057 = aClass13_1063;

	@OriginalMember(owner = "client!o", name = "fb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1058 = Static161.method2971("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!o", name = "gb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1059 = Static161.method2971("headicons_pk");

	@OriginalMember(owner = "client!o", name = "hb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1060 = aClass13_1063;

	@OriginalMember(owner = "client!o", name = "kb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1061 = aClass13_1063;

	@OriginalMember(owner = "client!o", name = "nb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1062 = aClass13_1063;

	@OriginalMember(owner = "client!o", name = "ob", descriptor = "I")
	public static int anInt3191 = 0;

	@OriginalMember(owner = "client!o", name = "vb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1064 = Static161.method2971("null");

	@OriginalMember(owner = "client!o", name = "wb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1065 = aClass13_1063;

	@OriginalMember(owner = "client!o", name = "xb", descriptor = "I")
	public static int anInt3195 = 0;

	@OriginalMember(owner = "client!o", name = "Bb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1066 = Static161.method2971(")1");

	@OriginalMember(owner = "client!o", name = "Cb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1067 = aClass13_1063;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
	public static void method2273() {
		aClass13_1065 = null;
		aClass13_1062 = null;
		aClass13_1061 = null;
		aClass13_1067 = null;
		aClass13_1057 = null;
		aClass13_1060 = null;
		aClass13_1064 = null;
		aClass4_76 = null;
		aClass13_1059 = null;
		aClass13_1066 = null;
		aClass4_Sub1_40 = null;
		aClass13_1058 = null;
		aClass13_1063 = null;
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(II)V")
	public static void method2275(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static162.aBoolean294) {
			Static15.method626();
		} else if (arg0 != -1 && (arg0 != Static182.anInt918 || !Static10.method442()) && Static62.anInt2602 != 0 && !Static162.aBoolean294) {
			Static139.method2502(Static62.anInt2602, arg0, Static144.aClass4_Sub1_47);
		}
		Static182.anInt918 = arg0;
	}
}
