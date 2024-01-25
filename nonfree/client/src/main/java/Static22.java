import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!av", name = "a", descriptor = "I")
	public static int anInt397;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_5 = new Class186(85, 1);

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZ)V")
	public static void method312(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static36.aClass6_Sub1_Sub4_2 != null) {
			Static389.anInt6472 = Static36.aClass6_Sub1_Sub4_2.anInt1189;
		} else {
			Static389.anInt6472 = -1;
		}
		Static200.aClass88_31 = null;
		Static36.aClass6_Sub1_Sub4_2 = null;
		Static126.anInt4528 = 0;
		Static332.aClass239_11 = null;
		Static36.method2051();
		Static36.aClass88_24.method1887();
		Static340.anInt5720 = -1;
		Static207.aClass152_7 = null;
		Static336.aClass152_10 = null;
		Static321.aClass152_8 = null;
		Static116.aClass12_3 = null;
		Static343.aClass152_11 = null;
		Static393.aClass152_9 = null;
		Static178.aClass152_2 = null;
		Static36.aClass267_3 = null;
		Static212.anInt3671 = -1;
		Static125.aClass152_5 = null;
		Static165.aClass152_6 = null;
		Static36.aClass254_5.method5835();
		Static36.aClass190_2.method4322(64, 64);
		Static36.aClass254_5.method5842(64, 128);
		Static36.aClass127_3.method2826(64);
		Static427.aClass58_1.method1466(64);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BLclient!ia;)I")
	public static int method313(@OriginalArg(1) Class6_Sub15_Sub1 arg0) {
		@Pc(14) int local14 = arg0.method2604(2);
		@Pc(18) int local18;
		if (local14 == 0) {
			local18 = 0;
		} else if (local14 == 1) {
			local18 = arg0.method2604(5);
		} else if (local14 == 2) {
			local18 = arg0.method2604(8);
		} else {
			local18 = arg0.method2604(11);
		}
		return local18;
	}
}
