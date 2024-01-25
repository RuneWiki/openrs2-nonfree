import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public static int anInt2830;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_85 = new Class194(111, 0);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z")
	public static boolean method2359() {
		try {
			return Static416.method6440();
		} catch (@Pc(14) IOException local14) {
			Static114.method2111();
			return true;
		} catch (@Pc(21) Exception local21) {
			@Pc(81) String local81 = "T2 - " + (Static180.aClass194_100 == null ? -1 : Static180.aClass194_100.method5152()) + "," + (Static427.aClass194_241 == null ? -1 : Static427.aClass194_241.method5152()) + "," + (Static278.aClass194_159 == null ? -1 : Static278.aClass194_159.method5152()) + " - " + Static94.anInt1852 + "," + (Static427.anInt7462 + Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray675[0]) + "," + (Static22.anInt329 + Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray676[0]) + " - ";
			for (@Pc(83) int local83 = 0; Static94.anInt1852 > local83 && local83 < 50; local83++) {
				local81 = local81 + Static47.aClass3_Sub9_Sub2_1.aByteArray51[local83] + ",";
			}
			Static296.method5075(local21, local81);
			Static416.method6442(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)V")
	public static void method2361(@OriginalArg(1) int arg0) {
		if (Static259.anInt5050 == arg0) {
			return;
		}
		Static399.anInt7121 = Static24.anInt345 = Static413.anIntArray432[arg0];
		Static129.method2279();
		Static314.anIntArrayArray25 = new int[Static399.anInt7121][Static24.anInt345];
		Static65.anIntArrayArrayArray6 = new int[4][Static399.anInt7121 >> 3][Static24.anInt345 >> 3];
		Static273.anIntArrayArray24 = new int[Static399.anInt7121][Static24.anInt345];
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			Static174.aClass237Array1[local38] = Static521.method7581(Static399.anInt7121, Static24.anInt345);
		}
		Static171.aByteArrayArrayArray10 = new byte[4][Static399.anInt7121][Static24.anInt345];
		Static111.method1838(Static399.anInt7121, Static24.anInt345);
		Static543.method7819(Static399.anInt7121 >> 3, Static266.aClass82_8, Static24.anInt345 >> 3);
		Static259.anInt5050 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V")
	public static void method2363() {
		Static642.aClass136_73.method3142();
	}
}
