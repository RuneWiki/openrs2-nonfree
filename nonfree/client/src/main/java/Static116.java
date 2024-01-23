import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!im", name = "l", descriptor = "Lclient!bi;")
	public static Class4_Sub2_Sub1 aClass4_Sub2_Sub1_4;

	@OriginalMember(owner = "client!im", name = "Q", descriptor = "Lclient!lc;")
	public static Class98 aClass98_73;

	@OriginalMember(owner = "client!im", name = "B", descriptor = "I")
	public static int anInt2573 = 0;

	@OriginalMember(owner = "client!im", name = "D", descriptor = "Lclient!dh;")
	public static Class33 aClass33_21 = new Class33(30);

	@OriginalMember(owner = "client!im", name = "R", descriptor = "I")
	public static int anInt2585 = 0;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
	public static void method1999() {
		Static286.method4299();
		Static224.method3581();
		Static184.method2876();
		Static120.method2044();
		Static265.method3988();
		Static134.method2175();
		Static68.method1045();
		Static257.method3882();
		Static249.method3768();
		Static96.method1557();
		Static254.method3833();
		Static200.method3111();
		Static89.method1427();
		Static183.method2857();
		Static146.method2350();
		Static261.method3959();
		Static227.method3212();
		Static85.method1338();
		if (Static275.anInt5146 != 0) {
			for (@Pc(54) int local54 = 0; local54 < Static175.aByteArrayArray14.length; local54++) {
				Static175.aByteArrayArray14[local54] = null;
			}
			Static269.anInt5027 = 0;
		}
		Static90.method1439();
		Static183.method2856();
		Static95.aClass33_14.method839();
		if (!Static178.aBoolean216) {
			((Class71_Sub1) Static204.anInterface2_1).method1986();
		}
		Static129.aClass69_5.method1932();
		Static125.aClass98_77.method2383();
		Static262.aClass98_152.method2383();
		Static34.aClass98_18.method2383();
		Static35.aClass98_22.method2383();
		Static106.aClass98_65.method2383();
		Static94.aClass98_56.method2383();
		Static34.aClass98_19.method2383();
		Static288.aClass98_66.method2383();
		Static218.aClass98_168.method2383();
		Static28.aClass98_17.method2383();
		Static80.aClass98_49.method2383();
		Static3.aClass33_1.method839();
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V")
	public static void method2001() {
		aClass33_21 = null;
		aClass98_73 = null;
		aClass4_Sub2_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "([BI)[B")
	public static byte[] method2003(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub17 local8 = new Class4_Sub17(arg0);
		@Pc(20) int local20 = local8.method1874();
		@Pc(24) int local24 = local8.method1889();
		if (local24 < 0 || Static49.anInt1021 != 0 && Static49.anInt1021 < local24) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(49) byte[] local49 = new byte[local24];
			local8.method1839(local24, local49);
			return local49;
		} else {
			@Pc(61) int local61 = local8.method1889();
			if (local61 < 0 || Static49.anInt1021 != 0 && Static49.anInt1021 < local61) {
				throw new RuntimeException();
			}
			@Pc(84) byte[] local84 = new byte[local61];
			if (local20 == 1) {
				Static8.method153(local84, local61, arg0, local24);
			} else {
				Static256.aClass92_1.method2285(local84, local8);
			}
			return local84;
		}
	}
}
