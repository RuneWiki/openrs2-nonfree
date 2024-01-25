import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "Lclient!iq;")
	public static Class104 aClass104_22;

	@OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
	public static int anInt435;

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "[B")
	public static final byte[] aByteArray5 = new byte[2048];

	@OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
	public static int anInt436 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!iq;Lclient!iq;Z)V")
	public static void method368(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class104 arg1) {
		Static200.aClass104_110 = arg0;
		Static44.aClass104_190 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
	public static void method374() {
		Static18.method268(false);
		Static251.anInt5243 = 0;
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < Static238.aByteArrayArray12.length; local16++) {
			if (Static134.anIntArray230[local16] != -1 && Static238.aByteArrayArray12[local16] == null) {
				Static238.aByteArrayArray12[local16] = Static63.aClass104_43.method2756(Static134.anIntArray230[local16], 0);
				if (Static238.aByteArrayArray12[local16] == null) {
					Static251.anInt5243++;
					local14 = false;
				}
			}
			if (Static348.anIntArray219[local16] != -1 && Static84.aByteArrayArray4[local16] == null) {
				Static84.aByteArrayArray4[local16] = Static63.aClass104_43.method2741(Static348.anIntArray219[local16], Static307.anIntArrayArray53[local16], 0);
				if (Static84.aByteArrayArray4[local16] == null) {
					Static251.anInt5243++;
					local14 = false;
				}
			}
			if (Static356.anIntArray525[local16] != -1 && Static80.aByteArrayArray3[local16] == null) {
				Static80.aByteArrayArray3[local16] = Static63.aClass104_43.method2756(Static356.anIntArray525[local16], 0);
				if (Static80.aByteArrayArray3[local16] == null) {
					Static251.anInt5243++;
					local14 = false;
				}
			}
			if (Static351.anIntArray518[local16] != -1 && Static121.aByteArrayArray8[local16] == null) {
				Static121.aByteArrayArray8[local16] = Static63.aClass104_43.method2756(Static351.anIntArray518[local16], 0);
				if (Static121.aByteArrayArray8[local16] == null) {
					Static251.anInt5243++;
					local14 = false;
				}
			}
			if (Static107.anIntArray176 != null && Static77.aByteArrayArray2[local16] == null && Static107.anIntArray176[local16] != -1) {
				Static77.aByteArrayArray2[local16] = Static63.aClass104_43.method2741(Static107.anIntArray176[local16], Static307.anIntArrayArray53[local16], 0);
				if (Static77.aByteArrayArray2[local16] == null) {
					Static251.anInt5243++;
					local14 = false;
				}
			}
		}
		if (Static283.aClass194_3 == null) {
			if (Static350.aClass2_Sub9_Sub17_3 == null || !Static92.aClass104_63.method2748(Static350.aClass2_Sub9_Sub17_3.aString50 + "_staticelements")) {
				Static283.aClass194_3 = new Class194(0);
			} else if (Static92.aClass104_63.method2753(Static350.aClass2_Sub9_Sub17_3.aString50 + "_staticelements")) {
				Static283.aClass194_3 = Static287.method4846(Static235.aBoolean440, Static350.aClass2_Sub9_Sub17_3.aString50 + "_staticelements", Static92.aClass104_63);
			} else {
				Static251.anInt5243++;
				local14 = false;
			}
		}
		if (!local14) {
			Static8.anInt171 = 1;
			return;
		}
		Static230.anInt5822 = 0;
		local14 = true;
		@Pc(271) int local271;
		@Pc(282) int local282;
		for (@Pc(253) int local253 = 0; local253 < Static238.aByteArrayArray12.length; local253++) {
			@Pc(259) byte[] local259 = Static84.aByteArrayArray4[local253];
			if (local259 != null) {
				local271 = (Static25.anIntArray50[local253] >> 8) * 64 - Static150.anInt3453;
				local282 = (Static25.anIntArray50[local253] & 0xFF) * 64 - Static287.anInt5776;
				if (Static219.aBoolean424) {
					local271 = 10;
					local282 = 10;
				}
				local14 &= Static64.method1321(local271, local259, local282);
			}
			local259 = Static121.aByteArrayArray8[local253];
			if (local259 != null) {
				local271 = (Static25.anIntArray50[local253] >> 8) * 64 - Static150.anInt3453;
				local282 = (Static25.anIntArray50[local253] & 0xFF) * 64 - Static287.anInt5776;
				if (Static219.aBoolean424) {
					local282 = 10;
					local271 = 10;
				}
				local14 &= Static64.method1321(local271, local259, local282);
			}
		}
		if (!local14) {
			Static8.anInt171 = 2;
			return;
		}
		if (Static8.anInt171 != 0) {
			Static105.method2078(Static272.aClass71_4, Static281.aClass140_135.method4155(Static239.anInt2803) + "<br>(100%)", true);
		}
		Static276.method4761();
		Static51.method1022();
		@Pc(380) boolean local380 = false;
		if (Static51.aClass37_1.method3722() && Static134.aBoolean271) {
			for (local271 = 0; local271 < Static238.aByteArrayArray12.length; local271++) {
				if (Static121.aByteArrayArray8[local271] != null || Static80.aByteArrayArray3[local271] != null) {
					local380 = true;
					break;
				}
			}
		}
		if (Static245.aBoolean453) {
			local271 = Static255.anIntArray413[Static294.anInt5840];
		} else {
			local271 = Static30.anIntArray59[Static294.anInt5840];
		}
		if (Static51.aClass37_1.method3727()) {
			local271++;
		}
		Static178.method5755(Static66.anInt1177, Static12.anInt213, local271, local380, Static51.aClass37_1.method3740() > 0);
		for (local282 = 0; local282 < 4; local282++) {
			Static182.aClass61Array2[local282].method1611();
		}
		Static165.method3281();
		Static17.method254(false);
		Static53.method1174();
		Static276.method4761();
		System.gc();
		Static18.method268(true);
		Static234.method4283(4, false);
		@Pc(480) int[][] local480 = null;
		if (!Static219.aBoolean424) {
			Static307.method5137(false);
			Static8.method142(Static66.anInt1177 >> 4, Static12.anInt213 >> 4);
			Static274.method4755();
			Static251.method4440(null, 4, Static51.aClass37_1, false);
			local480 = Static327.anIntArrayArrayArray12[0];
			Static18.method268(true);
			Static261.method4466(false);
			if (Static77.aByteArrayArray2 != null) {
				Static180.method3466();
			}
		}
		if (Static219.aBoolean424) {
			Static21.method2848(false);
			Static8.method142(Static66.anInt1177 >> 4, Static12.anInt213 >> 4);
			Static274.method4755();
			Static251.method4440(null, 4, Static51.aClass37_1, false);
			local480 = Static327.anIntArrayArrayArray12[0];
			Static18.method268(true);
			Static147.method2851(false);
		}
		Static51.method1022();
		Static18.method268(true);
		Static302.method5088(4, false, null, Static51.aClass37_1, Static182.aClass61Array2);
		Static227.method4207(4, Static51.aClass37_1);
		Static18.method268(true);
		@Pc(569) int local569 = Static306.anInt4214;
		if (Static291.anInt5263 < local569) {
			local569 = Static291.anInt5263;
		}
		if (Static291.anInt5263 - 1 > local569) {
			local569 = Static291.anInt5263 - 1;
		}
		if (Static230.method4872()) {
			Static47.method903(0);
		} else {
			Static47.method903(local569);
		}
		Static353.method5002();
		if (local380) {
			Static297.method4934(true);
			Static234.method4283(1, true);
			if (!Static219.aBoolean424) {
				Static307.method5137(true);
				Static251.method4440(local480, 1, Static51.aClass37_1, true);
				Static18.method268(true);
				Static261.method4466(true);
				Static227.method4207(1, Static51.aClass37_1);
			}
			if (Static219.aBoolean424) {
				Static21.method2848(true);
				Static251.method4440(local480, 1, Static51.aClass37_1, true);
				Static18.method268(true);
				Static147.method2851(true);
			}
			Static51.method1022();
			Static18.method268(true);
			Static302.method5088(1, true, Static101.aClass105Array2[0], Static51.aClass37_1, Static182.aClass61Array2);
			Static227.method4207(1, Static51.aClass37_1);
			Static18.method268(true);
			Static353.method5002();
			Static297.method4934(false);
		}
		@Pc(679) int local679;
		@Pc(683) int local683;
		for (@Pc(675) int local675 = 0; local675 < 4; local675++) {
			for (local679 = 0; local679 < Static66.anInt1177; local679++) {
				for (local683 = 0; local683 < Static12.anInt213; local683++) {
					Static364.method5815(local679, local683, local675);
				}
			}
		}
		Static10.method154();
		Static276.method4761();
		Static55.method1207();
		Static51.method1022();
		Static281.aBoolean502 = false;
		Static25.method329();
		if (Static291.aFrame4 != null && Static129.aClass117_2 != null && Static176.anInt3971 == 25) {
			Static300.method5057(Static221.aClass157_146);
			Static197.aClass2_Sub12_Sub2_2.method3162(1057001181);
		}
		if (!Static219.aBoolean424) {
			local679 = (Static208.anInt4568 - (Static66.anInt1177 >> 4)) / 8;
			local683 = (Static208.anInt4568 + (Static66.anInt1177 >> 4)) / 8;
			@Pc(764) int local764 = (Static190.anInt6232 - (Static12.anInt213 >> 4)) / 8;
			@Pc(772) int local772 = ((Static12.anInt213 >> 4) + Static190.anInt6232) / 8;
			for (@Pc(776) int local776 = local679 - 1; local776 <= local683 + 1; local776++) {
				for (@Pc(782) int local782 = local764 - 1; local782 <= local772 + 1; local782++) {
					if (local776 < local679 || local776 > local683 || local764 > local782 || local772 < local782) {
						Static63.aClass104_43.method2765("m" + local776 + "_" + local782);
						Static63.aClass104_43.method2765("l" + local776 + "_" + local782);
					}
				}
			}
		}
		if (Static176.anInt3971 == 28) {
			Static224.method5495(10);
		} else {
			Static224.method5495(30);
			if (Static129.aClass117_2 != null) {
				Static300.method5057(Static223.aClass157_147);
			}
		}
		Static226.method4193();
		Static276.method4761();
		Static243.method4362();
	}
}
