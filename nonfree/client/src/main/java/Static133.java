import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!hf;")
	public static Class32 aClass32_7;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public static int anInt3344 = 0;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[S")
	public static short[] aShortArray40 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1123 = Static161.method2971(":assist:");

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public static int anInt3347 = 0;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1124 = Static161.method2971("Cancel");

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	public static int anInt3348 = 0;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1125 = aClass13_1124;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method2389() {
		aShortArray40 = null;
		aClass32_7 = null;
		aClass13_1125 = null;
		aClass13_1124 = null;
		aClass13_1123 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!dd;Lclient!dd;ILclient!ag;)[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] method2390(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) Class4 arg2) {
		@Pc(8) int local8 = arg2.method2241(arg0);
		@Pc(19) int local19 = arg2.method2255(local8, arg1);
		return Static77.method1584(local8, local19, arg2);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(JB)Lclient!dd;")
	public static Class13 method2391(@OriginalArg(0) long arg0) {
		Static187.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static187.aCalendar2.get(7);
		@Pc(17) int local17 = Static187.aCalendar2.get(5);
		@Pc(21) int local21 = Static187.aCalendar2.get(2);
		@Pc(25) int local25 = Static187.aCalendar2.get(1);
		@Pc(29) int local29 = Static187.aCalendar2.get(11);
		@Pc(33) int local33 = Static187.aCalendar2.get(12);
		@Pc(42) int local42 = Static187.aCalendar2.get(13);
		return Static57.method1349(new Class13[] { Static5.aClass13Array1[local13 - 1], Static151.aClass13_1442, Static3.method75(local17 / 10), Static3.method75(local17 % 10), Static134.aClass13_1136, Static136.aClass13Array24[local21], Static134.aClass13_1136, Static3.method75(local25), Static1.aClass13_16, Static3.method75(local29 / 10), Static3.method75(local29 % 10), Static33.aClass13_393, Static3.method75(local33 / 10), Static3.method75(local33 % 10), Static33.aClass13_393, Static3.method75(local42 / 10), Static3.method75(local42 % 10), Static157.aClass13_1277 });
	}
}
