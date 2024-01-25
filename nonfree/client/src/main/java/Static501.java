import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!taa", name = "e", descriptor = "(B)V")
	public static void method6522() {
		Static401.aClass309_4.method6242();
		Static380.aClass211_7.method4400();
		Static25.aClass286_1.method5744();
		Static362.aClass290_2.method5803();
		Static76.aClass361_1.method7584();
		Static466.aClass130_2.method2316();
		Static117.aClass18_1.method293();
		Static62.aClass49_1.method1020();
		Static31.aClass145_1.method2546();
		Static572.aClass55_1.method1097();
		Static380.aClass221_3.method4668();
		Static8.aClass360_1.method7577();
		Static369.aClass212_6.method4412();
		Static537.aClass191_2.method3973();
		Static232.aClass176_1.method3611();
		Static403.aClass123_2.method2206();
		Static496.aClass39_1.method805();
		Static304.aClass304_1.method6146();
		Static23.aClass110_1.method2020();
		Static337.aClass26_1.method396();
		Static170.method2220();
		Static592.method7707();
		Static302.method4364();
		Static556.method7281();
		Static425.method5880();
		Static531.aClass21_83.method323(5);
		Static211.aClass21_34.method323(5);
		Static360.aClass21_56.method323(5);
		Static465.aClass21_71.method323(5);
		Static566.aClass21_91.method323(5);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI)V")
	public static void method6523(@OriginalArg(0) boolean arg0) {
		if (Static573.aClass264_1 == null) {
			Static506.method6590();
		}
		if (arg0) {
			Static573.aClass264_1.method5514();
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZIILjava/lang/Object;)[B")
	public static byte[] method6524(@OriginalArg(2) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static450.method5878(local13, arg0);
		} else if (arg1 instanceof Class272) {
			@Pc(25) Class272 local25 = (Class272) arg1;
			return local25.method5784(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
