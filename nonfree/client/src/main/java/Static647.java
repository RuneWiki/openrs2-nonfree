import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!rs;")
	public static Class3_Sub46 aClass3_Sub46_2;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public static int anInt10427;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!bla;Lclient!bg;II)V")
	public static void method8724(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2) {
		if (Static581.anInt9508 >= 50 || (arg1 == null || arg1.anIntArrayArray4 == null || arg2 >= arg1.anIntArrayArray4.length || arg1.anIntArrayArray4[arg2] == null)) {
			return;
		}
		@Pc(43) int local43 = arg1.anIntArrayArray4[arg2][0];
		@Pc(47) int local47 = local43 >> 8;
		@Pc(53) int local53 = local43 >> 5 & 0x7;
		@Pc(70) int local70;
		if (arg1.anIntArrayArray4[arg2].length > 1) {
			local70 = (int) ((double) arg1.anIntArrayArray4[arg2].length * Math.random());
			if (local70 > 0) {
				local47 = arg1.anIntArrayArray4[arg2][local70];
			}
		}
		@Pc(86) int local86 = local43 & 0x1F;
		local70 = 256;
		if (arg1.anIntArray49 != null && arg1.anIntArray47 != null) {
			local70 = (int) (Math.random() * (double) (arg1.anIntArray47[arg2] - arg1.anIntArray49[arg2])) + arg1.anIntArray49[arg2];
		}
		@Pc(127) int local127 = arg1.anIntArray48 == null ? 255 : arg1.anIntArray48[arg2];
		if (local86 == 0) {
			if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 == arg0) {
				if (arg1.aBoolean59) {
					Static146.method2412(local70, local127, 0, false, local53, local47);
					return;
				}
				Static700.method9158(local53, local47, 0, local70, local127);
			}
		} else if (Static713.aClass3_Sub55_31.aClass15_Sub8_2.method2888() != 0) {
			@Pc(177) int local177 = arg0.anInt11204 - 256 >> 9;
			@Pc(184) int local184 = arg0.anInt11211 - 256 >> 9;
			@Pc(207) int local207 = arg0 == Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 ? 0 : (local184 << 8) + ((arg0.aByte146 << 24) - (-(local177 << 16) - local86));
			Static326.aClass239Array1[Static581.anInt9508++] = new Class239((byte) (arg1.aBoolean59 ? 2 : 1), local47, local53, 0, local127, local207, local70, arg0);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	public static void method8725() {
		if (Static713.aClass3_Sub55_31.aClass15_Sub25_1.method8268() == 0 && Static712.anInt11117 != Static715.anInt7793) {
			Static524.method7459(Static650.anInt10443, false, Static82.anInt1266, 12);
		} else {
			Static386.method3991(Static488.aClass67_12);
			if (Static447.anInt7864 != Static712.anInt11117) {
				Static7.method109();
			}
		}
	}
}
