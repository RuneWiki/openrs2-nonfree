import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "[I")
	public static final int[] anIntArray514 = new int[14];

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
	public static void method6570() {
		Static415.aClass217_6.method4673();
		Static14.aClass160_1.method3541();
		Static511.aClass254_1.method5200();
		Static441.aClass74_169.method2071();
		Static255.aClass380_1.method8597();
		Static532.aClass255_2.method5211();
		Static99.aClass2_1.method20();
		Static341.aClass349_1.method7600();
		Static110.aClass184_1.method4121();
		Static522.aClass365_1.method8036();
		Static315.aClass135_1.method3027();
		Static116.aClass177_1.method3981();
		Static526.aClass59_4.method1792();
		Static623.aClass132_4.method2914();
		Static482.aClass84_2.method2147();
		Static431.aClass39_1.method1309();
		Static153.aClass344_1.method7518();
		Static422.aClass273_1.method6188();
		Static270.aClass299_1.method6591();
		Static87.aClass32_1.method1027();
		Static536.aClass148_1.method3261();
		Static204.aClass361_1.method7872();
		Static675.method8960();
		Static47.method832();
		Static555.method7388();
		Static464.method6457();
		Static585.method7689();
		Static307.aClass352_65.method7663(5);
		Static618.aClass352_70.method7663(5);
		Static158.aClass352_71.method7663(5);
		Static602.aClass352_68.method7663(5);
		Static237.aClass352_33.method7663(5);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIILclient!qja;)V")
	public static void method6572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub5 arg3) {
		@Pc(4) Class73 local4 = Static558.method7416(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass3_Sub1_Sub5_1 = arg3;
		@Pc(16) int local16 = Static140.aClass42Array4 == Static146.aClass42Array3 ? 1 : 0;
		if (arg3.method8500()) {
			if (arg3.method8501()) {
				arg3.aClass3_Sub1_23 = Static506.aClass3_Sub1Array3[local16];
				Static506.aClass3_Sub1Array3[local16] = arg3;
				return;
			}
			arg3.aClass3_Sub1_23 = Static114.aClass3_Sub1Array1[local16];
			Static114.aClass3_Sub1Array1[local16] = arg3;
			Static42.aBoolean73 = true;
			return;
		}
		arg3.aClass3_Sub1_23 = Static596.aClass3_Sub1Array4[local16];
		Static596.aClass3_Sub1Array4[local16] = arg3;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
	public static void method6573() {
		Static31.aClass66_43.method1988();
	}
}
