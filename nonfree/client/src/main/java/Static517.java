import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "Lclient!ai;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method7210() {
		for (@Pc(14) Class2_Sub21 local14 = (Class2_Sub21) Static242.aClass118_21.method2596(); local14 != null; local14 = (Class2_Sub21) Static242.aClass118_21.method2597()) {
			if (local14.aClass209_Sub1_1.method4368()) {
				Static183.method2678(local14.anInt4043);
			} else {
				local14.aClass209_Sub1_1.method4372();
				try {
					local14.aClass209_Sub1_1.method4358();
				} catch (@Pc(37) Exception local37) {
					Static163.method2447(local37, "TV: " + local14.anInt4043);
					Static183.method2678(local14.anInt4043);
				}
				if (!local14.aBoolean285 && !local14.aBoolean287) {
					@Pc(65) Class2_Sub7_Sub4 local65 = local14.aClass209_Sub1_1.method4370();
					if (local65 != null) {
						@Pc(71) Class2_Sub13_Sub5 local71 = local65.method8322();
						if (local71 != null) {
							local71.method8185(local14.anInt4041);
							Static586.aClass2_Sub13_Sub4_2.method7225(local71);
							local14.aBoolean285 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!wu;Lclient!hh;BLclient!wu;Lclient!qc;Lclient!wu;)Z")
	public static boolean method7212(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(3) Class380 arg2, @OriginalArg(4) Class2_Sub13_Sub3 arg3, @OriginalArg(5) Class380 arg4) {
		Static68.aClass380_20 = arg2;
		Static501.anIntArray574 = new int[16];
		Static522.aClass380_117 = arg4;
		Static501.aClass380_113 = arg0;
		Static267.aClass2_Sub13_Sub3_3 = arg3;
		Static223.aClass35_2 = arg1;
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			Static501.anIntArray574[local31] = 255;
		}
		return true;
	}
}
