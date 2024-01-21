import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!ac;")
	public static Class3 aClass3_9;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "[[Lclient!ed;")
	public static Class2_Sub1_Sub6[][] aClass2_Sub1_Sub6ArrayArray1;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
	public static int anInt1107 = 0;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "[I")
	public static int[] anIntArray157 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
	public static int anInt1111 = 0;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "Lclient!kc;")
	public static Class36 aClass36_555 = Static14.method2017("p11_full");

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Lclient!kc;")
	public static Class36 aClass36_556 = Static14.method2017("mapmarker");

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "Lclient!oc;")
	public static Class2_Sub12_Sub1 aClass2_Sub12_Sub1_1 = new Class2_Sub12_Sub1(5000);

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "[I")
	public static int[] anIntArray158 = new int[2000];

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	public static int anInt1116 = 127;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "[I")
	public static int[] anIntArray159 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ib", name = "Q", descriptor = "Lclient!kc;")
	public static Class36 aClass36_557 = Static14.method2017("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!ib", name = "R", descriptor = "Lclient!kc;")
	public static Class36 aClass36_558 = Static14.method2017("Angreifen");

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
	public static void method820() {
		aClass36_556 = null;
		aClass36_558 = null;
		aClass3_9 = null;
		anIntArray158 = null;
		aByteArrayArray19 = null;
		aClass2_Sub12_Sub1_1 = null;
		aClass2_Sub1_Sub6ArrayArray1 = null;
		anIntArray157 = null;
		aClass2_Sub1_Sub1_Sub3_4 = null;
		aClass36_555 = null;
		anIntArray159 = null;
		aClass36_557 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)Lclient!kc;")
	public static Class36 method821(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static57.method1055(arg0);
		} else if (arg0 < 10000000) {
			return Static49.method949(new Class36[] { Static57.method1055(arg0 / 1000), Static29.aClass36_419 });
		} else {
			return Static49.method949(new Class36[] { Static57.method1055(arg0 / 1000000), Static39.aClass36_502 });
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
	public static void method822() {
		if (Static64.aClass19_1 == null) {
			return;
		}
		@Pc(14) long local14 = Static66.method1158();
		if (local14 <= Static59.aLong47) {
			return;
		}
		Static64.aClass19_1.method1259(local14);
		@Pc(27) int local27 = (int) (local14 - Static59.aLong47);
		Static59.aLong47 = local14;
		@Pc(38) Class local38 = wb.class;
		synchronized (wb.class) {
			Static24.anInt618 += local27 * Static3.anInt1282;
			@Pc(55) int local55 = (Static24.anInt618 - Static3.anInt1282 * 2000) / 1000;
			if (local55 > 0) {
				if (Static92.aClass2_Sub3_1 != null) {
					Static92.aClass2_Sub3_1.method2059(local55);
				}
				Static24.anInt618 -= local55 * 1000;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method823() {
		Static23.aClass22_6.method716();
		Static26.aClass22_8.method716();
	}
}
