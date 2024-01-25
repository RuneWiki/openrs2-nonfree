import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
	public static void method4929() {
		Static231.anInt5230 = -1;
		Static331.anInt6610 = 1;
		if (Static226.aString47 == null) {
			Static142.method3164(35);
		} else {
			@Pc(20) Class3_Sub15 local20 = new Class3_Sub15(Static425.method7358(Static453.method6836(Static226.aString47)));
			@Pc(24) long local24 = local20.method8400();
			Static510.aLong222 = local20.method8400();
			Static192.method3818(Static123.method2859(local24), true, "");
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!kba;I)V")
	public static void method4934(@OriginalArg(0) Class2_Sub3_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static251.anInt5580 == arg0.anInt6290 || arg0.anInt6306 == -1 || arg0.anInt6297 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class290 local29 = Static618.aClass222_2.method5867(arg0.anInt6306);
			if (local29.aBoolean737 || local29.anIntArray548[arg0.anInt6315] < arg0.anInt6267 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(65) int local65 = arg0.anInt6290 - arg0.anInt6278;
			@Pc(71) int local71 = Static251.anInt5580 - arg0.anInt6278;
			@Pc(83) int local83 = arg0.anInt6330 * 512 + arg0.method5308() * 256;
			@Pc(94) int local94 = arg0.anInt6298 * 512 + arg0.method5308() * 256;
			@Pc(105) int local105 = arg0.anInt6280 * 512 + arg0.method5308() * 256;
			@Pc(116) int local116 = arg0.lb * 512 + arg0.method5308() * 256;
			arg0.anInt10424 = (local116 * local71 + (local65 - local71) * local94) / local65;
			arg0.anInt10428 = (local105 * local71 + (local65 - local71) * local83) / local65;
		}
		arg0.anInt6345 = 0;
		if (arg0.anInt6271 == 0) {
			arg0.method5322(8192, false);
		}
		if (arg0.anInt6271 == 1) {
			arg0.method5322(12288, false);
		}
		if (arg0.anInt6271 == 2) {
			arg0.method5322(0, false);
		}
		if (arg0.anInt6271 == 3) {
			arg0.method5322(4096, false);
		}
	}
}
