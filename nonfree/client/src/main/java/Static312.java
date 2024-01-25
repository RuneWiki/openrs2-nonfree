import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_88 = new Class90(82, -1);

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public static int anInt6272 = 0;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
	public static final int[] anIntArray347 = new int[14];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BZ)V")
	public static void method4930(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static572.aClass4_Sub6_Sub16_3 != null) {
			Static568.anInt10299 = Static572.aClass4_Sub6_Sub16_3.anInt8098;
		} else {
			Static568.anInt10299 = -1;
		}
		Static571.aClass155_17 = null;
		Static572.aClass4_Sub6_Sub16_3 = null;
		Static308.aClass22_40 = null;
		Static142.anInt3092 = 0;
		Static572.method7768();
		Static572.aClass22_64.method886();
		Static233.aClass202_3 = null;
		Static239.aClass88_15 = null;
		Static343.aClass202_6 = null;
		Static270.aClass202_4 = null;
		Static465.anInt8867 = -1;
		Static315.anInt6308 = -1;
		Static280.aClass202_5 = null;
		Static399.aClass202_7 = null;
		Static572.aClass42_3 = null;
		Static229.aClass202_2 = null;
		Static409.aClass202_8 = null;
		Static79.aClass202_1 = null;
		if (Static572.aClass121_4 != null) {
			Static572.aClass121_4.method2683();
			Static572.aClass121_4.method2679(64, 128);
		}
		if (Static572.aClass249_4 != null) {
			Static572.aClass249_4.method5887(64, 64);
		}
		if (Static572.aClass298_4 != null) {
			Static572.aClass298_4.method6818(64);
		}
		Static420.aClass60_1.method1603(64);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBILclient!hw;)V")
	public static void method4931(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class21_Sub1_Sub1_Sub1_Sub2 arg2) {
		@Pc(11) int[] local11 = new int[4];
		Static599.method3056(local11, 0, local11.length, arg1);
		Static256.method4060(arg2, arg0, local11);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ek;I)Lclient!fga;")
	public static Class50_Sub2 method4932(@OriginalArg(0) Class4_Sub13 arg0) {
		@Pc(7) Class50 local7 = Static279.method4475(arg0);
		@Pc(16) int local16 = arg0.method6990();
		@Pc(20) int local20 = arg0.method6990();
		@Pc(24) int local24 = arg0.method7054();
		return new Class50_Sub2(local7.aClass347_11, local7.aClass214_11, local7.anInt7638, local7.anInt7633, local7.anInt7637, local7.anInt7630, local7.anInt7631, local7.anInt7632, local7.anInt7635, local16, local20, local24);
	}
}
