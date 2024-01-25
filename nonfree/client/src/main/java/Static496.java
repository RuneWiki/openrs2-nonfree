import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "F")
	public static float aFloat202;

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "Lclient!li;")
	public static final Class209 aClass209_6 = new Class209();

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "Z")
	public static final boolean aBoolean661 = false;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!paa;[IIZ)V")
	public static void method6893(@OriginalArg(0) Class8_Sub3_Sub3_Sub1_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray532 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray532.length; local8++) {
				if (arg1[local8] != arg0.anIntArray532[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt6822 != -1) {
				@Pc(44) Class290 local44 = Static192.aClass211_1.method4277(arg0.anInt6822);
				@Pc(47) int local47 = local44.anInt7801;
				if (local47 == 1) {
					arg0.anInt6825 = 1;
					arg0.anInt6849 = 0;
					arg0.anInt6785 = arg2;
					arg0.anInt6803 = 0;
					arg0.anInt6850 = 0;
					Static137.method2090(local44, arg0.anInt9365, arg0.anInt6803, false, arg0.anInt9370, arg0.aByte123);
				}
				if (local47 == 2) {
					arg0.anInt6850 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg1.length; local8++) {
			if (arg1[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray532 == null || arg0.anIntArray532[local8] == -1 || Static192.aClass211_1.method4277(arg1[local8]).anInt7802 >= Static192.aClass211_1.method4277(arg0.anIntArray532[local8]).anInt7802) {
				arg0.anInt6858 = arg0.anInt6859;
				arg0.anIntArray532 = arg1;
				arg0.anInt6785 = arg2;
			}
		}
		if (local6) {
			arg0.anInt6858 = arg0.anInt6859;
			arg0.anInt6785 = arg2;
			arg0.anIntArray532 = arg1;
		}
	}
}
