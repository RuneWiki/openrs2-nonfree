import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!j", name = "lb", descriptor = "I")
	public static int anInt1290;

	@OriginalMember(owner = "client!j", name = "nb", descriptor = "Lclient!re;")
	public static Class9 aClass9_27;

	@OriginalMember(owner = "client!j", name = "ob", descriptor = "[Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub1_Sub1Array7;

	@OriginalMember(owner = "client!j", name = "pb", descriptor = "I")
	public static int anInt1292;

	@OriginalMember(owner = "client!j", name = "qb", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_38;

	@OriginalMember(owner = "client!j", name = "rb", descriptor = "[Lclient!ve;")
	public static Class2_Sub2_Sub17[] aClass2_Sub2_Sub17Array1;

	@OriginalMember(owner = "client!j", name = "bb", descriptor = "Lclient!u;")
	public static Class74 aClass74_908 = Static72.method1077("scrollbar");

	@OriginalMember(owner = "client!j", name = "hb", descriptor = "Lclient!e;")
	public static Class16 aClass16_43 = new Class16(100);

	@OriginalMember(owner = "client!j", name = "kb", descriptor = "Lclient!u;")
	public static Class74 aClass74_909 = Static72.method1077("Schlie-8en");

	@OriginalMember(owner = "client!j", name = "mb", descriptor = "I")
	public static int anInt1291 = 0;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
	public static void method891() {
		Static99.aClass9_48.method1589();
		Static42.aClass2_Sub2_Sub1_Sub1_20.method97(0, 0);
		Static44.method728();
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Lclient!ne;")
	public static Class2_Sub2_Sub13 method892(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub13 local10 = (Class2_Sub2_Sub13) Static104.aClass16_91.method490((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static124.aClass26_31.method1358(arg0, 4);
		local10 = new Class2_Sub2_Sub13();
		if (local20 != null) {
			local10.method1245(new Class2_Sub10(local20), arg0);
		}
		local10.method1246();
		Static104.aClass16_91.method492(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
	public static void method893() {
		for (@Pc(15) Class2_Sub8 local15 = (Class2_Sub8) Static104.aClass13_66.method415(); local15 != null; local15 = (Class2_Sub8) Static104.aClass13_66.method414()) {
			if (local15.anInt932 > 0) {
				local15.anInt932--;
			}
			if (local15.anInt932 != 0) {
				if (local15.anInt937 > 0) {
					local15.anInt937--;
				}
				if (local15.anInt937 == 0 && local15.anInt921 >= 1 && local15.anInt933 >= 1 && local15.anInt921 <= 102 && local15.anInt933 <= 102 && (local15.anInt923 < 0 || Static87.method929(local15.anInt923, local15.anInt925))) {
					Static14.method334(local15.anInt923, local15.anInt921, local15.anInt924, local15.anInt925, local15.anInt933, local15.anInt919, local15.anInt930);
					local15.anInt937 = -1;
					if (local15.anInt935 == local15.anInt923 && local15.anInt935 == -1) {
						local15.method1930();
					} else if (local15.anInt935 == local15.anInt923 && local15.anInt930 == local15.anInt918 && local15.anInt925 == local15.anInt931) {
						local15.method1930();
					}
				}
			} else if (local15.anInt935 < 0 || Static87.method929(local15.anInt935, local15.anInt931)) {
				Static14.method334(local15.anInt935, local15.anInt921, local15.anInt924, local15.anInt931, local15.anInt933, local15.anInt919, local15.anInt918);
				local15.method1930();
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(JB)V")
	public static void method894(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)I")
	public static int method895() {
		return Static126.anInt2863++;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	public static void method896() {
		Static90.aClass16_68.method485();
		Static29.aClass16_28.method485();
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "(I)V")
	public static void method898() {
		aClass16_43 = null;
		aClass2_Sub2_Sub1_Sub1Array7 = null;
		aClass74_908 = null;
		aClass26_Sub1_38 = null;
		aClass2_Sub2_Sub17Array1 = null;
		aClass74_909 = null;
		aClass9_27 = null;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(II)Lclient!u;")
	public static Class74 method900(@OriginalArg(0) int arg0) {
		@Pc(14) Class74 local14 = Static56.method940(arg0);
		for (@Pc(20) int local20 = local14.method1695() - 3; local20 > 0; local20 -= 3) {
			local14 = Static91.method1340(new Class74[] { local14.method1706(0, local20), Static54.aClass74_934, local14.method1697(local20) });
		}
		if (local14.method1695() > 8) {
			local14 = Static91.method1340(new Class74[] { Static70.aClass74_1086, local14.method1706(0, local14.method1695() - 8), Static35.aClass74_1720, Static77.aClass74_1152, local14, Static61.aClass74_1109 });
		} else if (local14.method1695() > 4) {
			local14 = Static91.method1340(new Class74[] { Static110.aClass74_1532, local14.method1706(0, local14.method1695() - 4), Static1.aClass74_1405, Static77.aClass74_1152, local14, Static61.aClass74_1109 });
		}
		return Static91.method1340(new Class74[] { Static1.aClass74_1397, local14 });
	}
}
