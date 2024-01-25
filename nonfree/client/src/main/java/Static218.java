import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!iga", name = "I", descriptor = "I")
	public static int anInt4226;

	@OriginalMember(owner = "client!iga", name = "L", descriptor = "I")
	public static int anInt4229;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZZ)V")
	public static void method3611(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static219.anInt4263 != -1) {
				Static208.method7272(Static219.anInt4263);
			}
			for (@Pc(22) Class1_Sub16 local22 = (Class1_Sub16) Static68.aClass356_4.method7792(); local22 != null; local22 = (Class1_Sub16) Static68.aClass356_4.method7795()) {
				if (!local22.method7877()) {
					local22 = (Class1_Sub16) Static68.aClass356_4.method7792();
					if (local22 == null) {
						break;
					}
				}
				Static546.method7412(local22, true, false);
			}
			Static219.anInt4263 = -1;
			Static68.aClass356_4 = new Class356(8);
			Static384.method5934();
			Static219.anInt4263 = Static390.anInt6785;
			Static261.method4073(false);
			Static388.method5569();
			Static145.method2351(Static219.anInt4263);
		}
		Static578.aBoolean688 = false;
		Static77.aString86 = "";
		Static315.aString63 = "";
		Static61.method1400();
		Static325.anInt9473 = -1;
		Static441.method6334(Static316.anInt5680);
		Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 = new Class20_Sub2_Sub4_Sub1_Sub1();
		Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray437[0] = Static500.anInt6888 / 2;
		Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796 = Static500.anInt6888 * 512 / 2;
		Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795 = Static573.anInt9325 * 512 / 2;
		Static216.anInt4203 = 0;
		Static333.anInt5940 = 0;
		Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray436[0] = Static573.anInt9325 / 2;
		if (Static585.anInt9461 == 2) {
			Static333.anInt5940 = Static69.anInt1590 << 9;
			Static216.anInt4203 = Static267.anInt5015 << 9;
		} else {
			Static337.method5031();
		}
		Static224.method3681();
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(Z)V")
	public static void method3612() {
		for (@Pc(3) int local3 = 0; local3 < Static511.aByteArrayArrayArray19.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static511.aByteArrayArrayArray19[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static511.aByteArrayArrayArray19[0][0].length; local11++) {
					Static511.aByteArrayArrayArray19[local3][local7][local11] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ILclient!qw;)V")
	public static void method3614(@OriginalArg(1) Class20_Sub8 arg0) {
		arg0.aClass20_Sub2_1 = null;
		@Pc(12) int local12 = arg0.aClass20_Sub3Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass20_Sub3Array1[local14].aBoolean78 = false;
		}
		@Pc(32) Class349[] local32 = Class1_Sub3_Sub19.aClass349Array1;
		synchronized (Class1_Sub3_Sub19.aClass349Array1) {
			if (local12 < Class1_Sub3_Sub19.aClass349Array1.length && Static371.anIntArray440[local12] < 200) {
				Class1_Sub3_Sub19.aClass349Array1[local12].method7655(arg0);
				@Pc(59) int local59 = Static371.anIntArray440[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(BI)I")
	public static int method3615(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "(B)V")
	public static void method3616() {
		Static478.method6712(Static136.aClass12_8, (long) Static81.anInt1910);
		if (Static219.anInt4263 != -1) {
			Static81.method1661(Static219.anInt4263);
		}
		for (@Pc(18) int local18 = 0; local18 < Static288.anInt5333; local18++) {
			if (Static510.aBooleanArray29[local18]) {
				Static551.aBooleanArray28[local18] = true;
			}
			Static210.aBooleanArray10[local18] = Static510.aBooleanArray29[local18];
			Static510.aBooleanArray29[local18] = false;
		}
		Static466.anInt2594 = Static81.anInt1910;
		if (Static219.anInt4263 != -1) {
			Static288.anInt5333 = 0;
			Static460.method6538();
		}
		Static136.aClass12_8.JA();
		Static432.method6070(Static136.aClass12_8);
		@Pc(65) int local65 = Static430.method6015();
		if (local65 == -1) {
			local65 = Static325.anInt9473;
		}
		if (local65 == -1) {
			local65 = Static316.anInt5680;
		}
		Static441.method6334(local65);
		Static236.anInt4451 = 0;
	}
}
