import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fda", name = "h", descriptor = "Lclient!ub;")
	public static Class2_Sub42 aClass2_Sub42_1;

	@OriginalMember(owner = "client!fda", name = "m", descriptor = "Lclient!bu;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZII)Z")
	public static boolean method2686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
	public static void method2688() {
		if (Static141.aClass13_27 == null) {
			return;
		}
		if (Static148.aBoolean241) {
			Static352.method5271();
		}
		Static141.aClass25_2.method632();
		Static310.method4830();
		Static191.method3265();
		Static228.method3700();
		Static399.method5958();
		Static427.method6220();
		if (Static593.aClass224_1 != null) {
			Static593.aClass224_1.method5322();
		}
		Static163.method2805();
		Static116.method2086();
		Static493.method6908();
		Static29.method635();
		Static212.method3537(false);
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			@Pc(44) Class16_Sub1_Sub1_Sub3_Sub2 local44 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local39];
			if (local44 != null) {
				for (@Pc(48) int local48 = 0; local48 < local44.aClass193Array3.length; local48++) {
					local44.aClass193Array3[local48] = null;
				}
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static608.anInt10053; local68++) {
			@Pc(74) Class16_Sub1_Sub1_Sub3_Sub1 local74 = Static480.aClass2_Sub32Array1[local68].aClass16_Sub1_Sub1_Sub3_Sub1_2;
			if (local74 != null) {
				for (@Pc(78) int local78 = 0; local78 < local74.aClass193Array3.length; local78++) {
					local74.aClass193Array3[local78] = null;
				}
			}
		}
		Static46.aClass51_5 = null;
		Static113.aClass51_3 = null;
		Static141.aClass13_27.method8117();
		Static141.aClass13_27 = null;
	}
}
