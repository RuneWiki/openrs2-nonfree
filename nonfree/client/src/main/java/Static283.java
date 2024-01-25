import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "[I")
	public static final int[] anIntArray376 = new int[250];

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "[I")
	public static final int[] anIntArray377 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
	public static void method3948() {
		Static151.aClass181_3.method3758();
		Static474.aClass322_7.method7129();
		Static22.aClass71_1.method1493();
		Static518.aClass96_4.method1929();
		Static322.aClass326_2.method7241();
		Static175.aClass114_4.method2214();
		Static192.aClass211_1.method4278();
		Static107.aClass200_3.method3957();
		Static499.aClass241_5.method4891();
		Static409.aClass246_1.method5043();
		Static384.aClass305_1.method6492();
		Static521.aClass257_4.method5591();
		Static383.aClass273_3.method5841();
		Static591.aClass274_1.method5885();
		Static459.aClass38_2.method712();
		Static485.aClass318_1.method6996();
		Static321.aClass279_1.method6100();
		Static252.aClass205_3.method4124();
		Static348.aClass141_2.method2986();
		Static430.aClass265_1.method5654();
		Static410.method5648();
		Static326.method4465();
		Static265.method3798();
		Static164.method7475();
		if (Static357.aClass308_6 != Static199.aClass308_3) {
			for (@Pc(84) int local84 = 0; local84 < Static154.aByteArrayArray14.length; local84++) {
				Static154.aByteArrayArray14[local84] = null;
			}
			Static356.anInt5940 = 0;
		}
		Static152.method2208();
		Static345.method4709();
		Static428.method5940();
		Static70.method1225();
		Static21.method7707();
		Static80.aClass222_8.method4428();
		Static16.aClass134_1.method6904();
		Static511.method7105();
		Static222.method3419();
		Static588.aClass270_122.method5690();
		Static181.aClass270_39.method5690();
		Static462.aClass270_97.method5690();
		Static332.aClass270_88.method5690();
		Static71.aClass270_14.method5690();
		Static559.aClass270_116.method5690();
		Static358.aClass270_69.method5690();
		Static412.aClass270_84.method5690();
		Static463.aClass270_98.method5690();
		Static69.aClass270_13.method5690();
		Static172.aClass270_38.method5690();
		Static408.aClass270_81.method5690();
		Static410.aClass270_83.method5690();
		Static412.aClass270_85.method5690();
		Static360.aClass270_68.method5690();
		Static374.aClass270_72.method5690();
		Static416.aClass270_86.method5690();
		Static530.aClass270_111.method5690();
		Static82.aClass270_15.method5690();
		Static535.aClass270_112.method5690();
		Static513.aClass270_106.method5690();
		Static498.aClass270_102.method5690();
		Static521.aClass270_108.method5690();
		Static129.aClass270_30.method5690();
		Static171.aClass270_37.method5690();
		Static101.aClass270_22.method5690();
		Static103.aClass270_23.method5690();
		Static344.aClass270_66.method5690();
		Static416.aClass270_87.method5690();
		Static6.aClass270_1.method5690();
		Static442.aClass270_96.method5690();
		Static398.aClass270_78.method5690();
		Static467.aClass222_52.method4428();
		Static257.aClass222_27.method4428();
		Static574.aClass222_62.method4428();
		Static224.aClass222_48.method4428();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
	public static void method3950() {
		@Pc(7) int local7 = Static220.anInt4237;
		@Pc(9) int[] local9 = Static572.anIntArray717;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class8_Sub3_Sub3_Sub1_Sub1 local19 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt6815 > 0) {
				local19.anInt6815--;
				if (local19.anInt6815 == 0) {
					local19.aString68 = null;
				}
			}
		}
		for (@Pc(52) int local52 = 0; local52 < Static39.anInt609; local52++) {
			@Pc(59) long local59 = (long) Static17.anIntArray24[local52];
			@Pc(65) Class1_Sub42 local65 = (Class1_Sub42) Static84.aClass187_40.method3797(local59);
			if (local65 != null) {
				@Pc(70) Class8_Sub3_Sub3_Sub1_Sub2 local70 = local65.aClass8_Sub3_Sub3_Sub1_Sub2_2;
				if (local70.anInt6815 > 0) {
					local70.anInt6815--;
					if (local70.anInt6815 == 0) {
						local70.aString68 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILjava/awt/Component;Z)Lclient!nq;")
	public static Class25 method3951(@OriginalArg(1) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class25_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class25) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class25_Sub1(arg0, true);
		}
	}
}
