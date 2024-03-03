import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 7)
	public static void method2697() {
		@Pc(18) boolean local18 = Class243.aClass161_14 != null || Class229.anInt6437 > 0;
		if (local18) {
			Class84.anInt2354 = 1;
		}
		if (Class105.aBoolean192 && Static163.aClass123_2.method3344(81) && Class2_Sub3_Sub24.anInt4949 > 2) {
			if (local18) {
				Static31.aClass2_Sub5_2 = (Class2_Sub5) Class92.aClass135_19.aClass2_130.aClass2_244.aClass2_244;
			} else {
				Static239.method4428((Class2_Sub5) Class92.aClass135_19.aClass2_130.aClass2_244.aClass2_244, Static345.aClass2_Sub24_1.method5244(), Static345.aClass2_Sub24_1.method5243());
			}
		} else if (local18) {
			Static31.aClass2_Sub5_2 = (Class2_Sub5) Class92.aClass135_19.aClass2_130.aClass2_244;
		} else {
			Static239.method4428((Class2_Sub5) Class92.aClass135_19.aClass2_130.aClass2_244, Static345.aClass2_Sub24_1.method5244(), Static345.aClass2_Sub24_1.method5243());
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!tl;Lclient!tl;Z)V", line = 45)
	public static void method2698(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) Class2_Sub2 arg1) {
		if (arg1.aClass2_Sub2_52 != null) {
			arg1.method6144();
		}
		arg1.aClass2_Sub2_51 = arg0.aClass2_Sub2_51;
		arg1.aClass2_Sub2_52 = arg0;
		arg1.aClass2_Sub2_52.aClass2_Sub2_51 = arg1;
		arg1.aClass2_Sub2_51.aClass2_Sub2_52 = arg1;
	}
}
