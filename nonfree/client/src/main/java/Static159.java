import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!gf;")
	public static Class33 aClass33_12;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "[Lclient!fd;")
	public static Class7_Sub1[] aClass7_Sub1Array1 = new Class7_Sub1[256];

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1311 = Static170.method3101("Ok");

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1313 = Static170.method3101("wave:");

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1312 = aClass28_1313;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	public static int anInt3902 = 1;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray29 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1314 = aClass28_1311;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1315 = aClass28_1313;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1316 = Static170.method3101("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
	public static int anInt3903 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!gf;Lclient!eh;)Lclient!eh;")
	public static Class28 method2977(@OriginalArg(1) Class33 arg0, @OriginalArg(2) Class28 arg1) {
		if (arg1.method903(Static22.aClass28_244) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(20) int local20 = arg1.method903(Static124.aClass28_1047);
			if (local20 == -1) {
				while (true) {
					local20 = arg1.method903(Static142.aClass28_1209);
					if (local20 == -1) {
						while (true) {
							local20 = arg1.method903(Static179.aClass28_1492);
							if (local20 == -1) {
								while (true) {
									local20 = arg1.method903(Static27.aClass28_298);
									if (local20 == -1) {
										while (true) {
											local20 = arg1.method903(Static114.aClass28_942);
											if (local20 == -1) {
												while (true) {
													local20 = arg1.method903(Static15.aClass28_363);
													if (local20 == -1) {
														return arg1;
													}
													@Pc(238) Class28 local238 = Static156.aClass28_1306;
													if (Static119.aClass61_4 != null) {
														local238 = Static181.method3213(Static119.aClass61_4.anInt2847);
														try {
															if (Static119.aClass61_4.anObject4 != null) {
																@Pc(254) byte[] local254 = ((String) Static119.aClass61_4.anObject4).getBytes("ISO-8859-1");
																local238 = Static33.method845(local254, local254.length, 0);
															}
														} catch (@Pc(263) UnsupportedEncodingException local263) {
														}
													}
													arg1 = Static4.method96(new Class28[] { arg1.method926(local20, 0), local238, arg1.method905(local20 + 4) });
												}
											}
											arg1 = Static4.method96(new Class28[] { arg1.method926(local20, 0), Static154.method2922(Static66.method1601(4, arg0)), arg1.method905(local20 + 2) });
										}
									}
									arg1 = Static4.method96(new Class28[] { arg1.method926(local20, 0), Static154.method2922(Static66.method1601(3, arg0)), arg1.method905(local20 + 2) });
								}
							}
							arg1 = Static4.method96(new Class28[] { arg1.method926(local20, 0), Static154.method2922(Static66.method1601(2, arg0)), arg1.method905(local20 + 2) });
						}
					}
					arg1 = Static4.method96(new Class28[] { arg1.method926(local20, 0), Static154.method2922(Static66.method1601(1, arg0)), arg1.method905(local20 + 2) });
				}
			}
			arg1 = Static4.method96(new Class28[] { arg1.method926(local20, 0), Static154.method2922(Static66.method1601(0, arg0)), arg1.method905(local20 + 2) });
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[B)Lclient!jh;")
	public static Class3_Sub2_Sub2_Sub1_Sub1 method2978(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(26) Class3_Sub2_Sub2_Sub1_Sub1 local26 = new Class3_Sub2_Sub2_Sub1_Sub1(arg0, Static59.anIntArray293, Static173.anIntArray690, Static83.anIntArray394, Static95.anIntArray452, Static55.anIntArray272, Static59.aByteArrayArray41);
			Static82.method1880();
			return local26;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method2979() {
		aClass7_Sub1Array1 = null;
		aClass28_1314 = null;
		aClass33_12 = null;
		aCalendar1 = null;
		aClass28_1316 = null;
		anIntArrayArray29 = null;
		aClass28_1313 = null;
		aClass28_1315 = null;
		aClass28_1311 = null;
		aClass28_1312 = null;
	}
}
