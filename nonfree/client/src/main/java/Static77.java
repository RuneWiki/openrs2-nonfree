import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	public static int anInt3996;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_43 = new Class218(82, 6);

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	public static int anInt3994 = 0;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IJ)V")
	public static void method3506(@OriginalArg(1) long arg0) {
		if (Static170.aClass106ArrayArrayArray1 != null) {
			if (Static516.anInt9019 == 1 || Static516.anInt9019 == 5) {
				Static406.method6411(arg0);
			} else if (Static516.anInt9019 == 4) {
				Static572.method8004(arg0);
			}
		}
		Static2.method30(Static47.aClass33_3, (long) Static251.anInt5580);
		if (Static530.anInt9144 != -1) {
			Static518.method8298(Static530.anInt9144);
		}
		for (@Pc(46) int local46 = 0; local46 < Static457.anInt8300; local46++) {
			if (Static178.aBooleanArray12[local46]) {
				Static441.aBooleanArray17[local46] = true;
			}
			Static73.aBooleanArray3[local46] = Static178.aBooleanArray12[local46];
			Static178.aBooleanArray12[local46] = false;
		}
		Static499.anInt8835 = Static251.anInt5580;
		Static484.method7112(null, -1, -1);
		Static169.method3524(null, -1, -1);
		if (Static530.anInt9144 != -1) {
			Static457.anInt8300 = 0;
			Static522.method7467();
		}
		Static47.aClass33_3.la();
		Static608.method6804(Static47.aClass33_3);
		@Pc(102) int local102 = Static439.method6673();
		if (local102 == -1) {
			local102 = Static548.anInt9367;
		}
		if (local102 == -1) {
			local102 = Static219.anInt5059;
		}
		Static529.method7519(local102);
		@Pc(124) int local124 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.method5308() << 8;
		Static624.method8484(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424 + local124, Static550.anInt9371, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428 + local124, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128);
		Static550.anInt9371 = 0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZIB)Lclient!di;")
	public static Class3_Sub17 method3511(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(12) long local12 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub17) Static127.aClass307_21.method7424(local12);
	}
}
