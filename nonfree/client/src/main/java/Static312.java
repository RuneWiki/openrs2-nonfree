import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_140 = new Class263(41, 5);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	public static void method4476() {
		Static365.aClass251_6.method5609();
		Static331.aClass191_5.method4338();
		Static19.aClass143_1.method3316();
		Static455.aClass161_4.method3633();
		Static300.aClass44_2.method1007();
		Static43.aClass57_1.method1409();
		Static107.aClass239_1.method5421();
		Static145.aClass63_1.method1526();
		Static303.aClass152_1.method3465();
		Static204.aClass46_1.method1077();
		Static241.aClass258_1.method5774();
		Static420.aClass84_2.method1798();
		Static163.aClass170_2.method3741();
		Static201.aClass5_1.method56();
		Static53.aClass32_1.method723();
		Static106.aClass53_1.method1334();
		Static100.aClass42_1.method899();
		Static447.aClass270_1.method6168();
		Static60.aClass133_1.method3162();
		Static257.aClass115_1.method2705();
		Static81.method1499();
		Static330.method4672();
		Static86.method1532();
		if (Static59.aClass248_1 != Static314.aClass248_7) {
			for (@Pc(80) int local80 = 0; local80 < Static166.aByteArrayArray13.length; local80++) {
				Static166.aByteArrayArray13[local80] = null;
			}
			Static348.anInt6431 = 0;
		}
		Static149.method2368();
		Static39.method742();
		Static153.method3993();
		Static433.method6152();
		Static419.method5696();
		Static178.aClass91_52.method1999();
		Static30.aClass106_3.method5950();
		Static96.aClass215_2.method4927();
		Static343.method4833();
		Static382.aClass211_77.method4764();
		Static383.aClass211_79.method4764();
		Static37.aClass211_13.method4764();
		Static126.aClass211_34.method4764();
		Static125.aClass211_33.method4764();
		Static136.aClass211_36.method4764();
		Static362.aClass211_75.method4764();
		Static227.aClass211_59.method4764();
		Static140.aClass211_38.method4764();
		Static166.aClass211_43.method4764();
		Static192.aClass211_49.method4764();
		Static238.aClass211_60.method4764();
		Static10.aClass211_91.method4764();
		Static24.aClass211_8.method4764();
		Static68.aClass211_20.method4764();
		Static112.aClass211_31.method4764();
		Static386.aClass211_80.method4764();
		Static140.aClass211_37.method4764();
		Static65.aClass211_19.method4764();
		Static355.aClass211_74.method4764();
		Static136.aClass211_35.method4764();
		Static437.aClass211_88.method4764();
		Static173.aClass211_46.method4764();
		Static263.aClass211_69.method4764();
		Static152.aClass211_40.method4764();
		Static216.aClass211_56.method4764();
		Static6.aClass211_2.method4764();
		Static193.aClass211_50.method4764();
		Static382.aClass211_78.method4764();
		Static114.aClass211_32.method4764();
		Static434.aClass91_99.method1999();
		Static276.aClass91_73.method1999();
		Static300.aClass91_77.method1999();
		Static329.aClass91_83.method1999();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([BB)Z")
	public static boolean method4477(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub3 local8 = new Class1_Sub3(arg0);
		@Pc(12) int local12 = local8.method1171();
		if (local12 != 2) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method1171() == 1;
		if (local28) {
			Static303.method4392(local8);
		}
		Static275.method4077(local8);
		return true;
	}
}
