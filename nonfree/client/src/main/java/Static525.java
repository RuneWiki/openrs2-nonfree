import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!qla", name = "p", descriptor = "I")
	public static int anInt8330;

	@OriginalMember(owner = "client!qla", name = "h", descriptor = "Lclient!hma;")
	public static Class163 aClass163_5;

	@OriginalMember(owner = "client!qla", name = "e", descriptor = "(B)V")
	public static void method7391() {
		for (@Pc(6) Class4_Sub5 local6 = (Class4_Sub5) Static363.aClass320_4.method7604(); local6 != null; local6 = (Class4_Sub5) Static363.aClass320_4.method7604()) {
			Static237.method9877(local6);
		}
		@Pc(42) int local42;
		@Pc(44) int local44;
		if (Static650.aClass2_Sub30_29.aClass11_Sub12_1.method2753() == 1) {
			local42 = 0;
			local44 = 3;
		} else {
			local44 = Static597.anInt9295;
			local42 = Static597.anInt9295;
		}
		@Pc(56) int local56;
		if (Static166.anInt2884 == 3) {
			for (local56 = local42; local56 <= local44; local56++) {
				Static91.method1405(local56);
			}
			Static91.method1402();
			return;
		}
		Static91.method1397();
		for (local56 = local42; local56 <= local44; local56++) {
			Static91.method1417();
			Static91.method1410(local56);
			Static91.method1405(local56);
		}
		Static91.method1404();
		Static91.method1402();
	}

	@OriginalMember(owner = "client!qla", name = "a", descriptor = "(BLclient!iaa;)V")
	public static void method7392(@OriginalArg(1) Class4_Sub8 arg0) {
		arg0.aClass4_Sub2_13 = null;
		@Pc(12) int local12 = arg0.aClass4_Sub6Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local12; local19++) {
			arg0.aClass4_Sub6Array1[local19].aBoolean269 = false;
		}
		@Pc(39) Class320[] local39 = Class137.aClass320Array1;
		synchronized (Class137.aClass320Array1) {
			if (Class137.aClass320Array1.length > local12 && Static572.anIntArray659[local12] < 200) {
				Class137.aClass320Array1[local12].method7600(arg0);
				@Pc(72) int local72 = Static572.anIntArray659[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!qla", name = "a", descriptor = "(Lclient!d;ZLclient!nca;)V")
	public static void method7393(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Class254 arg1) {
		Static309.anInterface3_4 = arg0;
		Static544.aClass254_135 = arg1;
	}

	@OriginalMember(owner = "client!qla", name = "a", descriptor = "(III[B)I")
	public static int method7394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class125.anIntArray228[(arg2[local9] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!qla", name = "c", descriptor = "(B)V")
	public static void method7395() {
		Static337.aBoolean444 = false;
		Static166.anInt2884 = 4;
		Static515.anIntArrayArray53 = null;
		Static215.aClass2_Sub20_4 = null;
		Static124.method1845();
		Static487.aClass221_2.method5173(Static592.method8154(Static587.aClass349_121, Static487.aClass221_2.aClass48_1));
	}
}
