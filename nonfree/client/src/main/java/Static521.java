import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)V")
	public static void method7461(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg0, 14);
		local8.method8628();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIBLclient!kba;)V")
	public static void method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub3_Sub1_Sub2 arg3) {
		@Pc(9) Class232 local9 = arg3.method5304();
		@Pc(18) int local18 = arg3.anInt6302 - arg3.aClass145_7.anInt5347 & 0x3FFF;
		if (arg0 == -1) {
			if (local18 != 0 || arg3.anInt6261 > 25) {
				if (arg2 < 0 && local9.anInt7176 != -1) {
					arg3.anInt6273 = local9.anInt7176;
					arg3.aBoolean531 = false;
				} else if (arg2 <= 0 || local9.anInt7186 == -1) {
					arg3.anInt6273 = local9.anInt7160;
				} else {
					arg3.anInt6273 = local9.anInt7186;
				}
				arg3.aBoolean531 = false;
			} else if (!arg3.aBoolean531 || !local9.method5994(arg3.anInt6273)) {
				arg3.anInt6273 = local9.method5991();
				arg3.aBoolean531 = arg3.anInt6273 != -1;
			}
		} else if (arg3.anInt6331 != -1 && (local18 >= 10240 || local18 <= 2048)) {
			@Pc(116) int local116 = Static337.anIntArray391[arg1] - arg3.aClass145_7.anInt5347 & 0x3FFF;
			if (arg0 == 2 && local9.anInt7157 != -1) {
				if (local116 > 2048 && local116 <= 6144 && local9.anInt7153 != -1) {
					arg3.anInt6273 = local9.anInt7153;
				} else if (local116 >= 10240 && local116 < 14336 && local9.anInt7161 != -1) {
					arg3.anInt6273 = local9.anInt7161;
				} else if (local116 <= 6144 || local116 >= 10240 || local9.anInt7185 == -1) {
					arg3.anInt6273 = local9.anInt7157;
				} else {
					arg3.anInt6273 = local9.anInt7185;
				}
			} else if (arg0 == 0 && local9.anInt7175 != -1) {
				if (local116 > 2048 && local116 <= 6144 && local9.anInt7178 != -1) {
					arg3.anInt6273 = local9.anInt7178;
				} else if (local116 >= 10240 && local116 < 14336 && local9.anInt7150 != -1) {
					arg3.anInt6273 = local9.anInt7150;
				} else if (local116 <= 6144 || local116 >= 10240 || local9.anInt7188 == -1) {
					arg3.anInt6273 = local9.anInt7175;
				} else {
					arg3.anInt6273 = local9.anInt7188;
				}
			} else if (local116 > 2048 && local116 <= 6144 && local9.anInt7173 != -1) {
				arg3.anInt6273 = local9.anInt7173;
			} else if (local116 >= 10240 && local116 < 14336 && local9.anInt7158 != -1) {
				arg3.anInt6273 = local9.anInt7158;
			} else if (local116 <= 6144 || local116 >= 10240 || local9.anInt7183 == -1) {
				arg3.anInt6273 = local9.anInt7160;
			} else {
				arg3.anInt6273 = local9.anInt7183;
			}
			arg3.aBoolean531 = false;
		} else if (local18 == 0 && arg3.anInt6261 <= 25) {
			if (arg0 == 2 && local9.anInt7157 != -1) {
				arg3.anInt6273 = local9.anInt7157;
			} else if (arg0 == 0 && local9.anInt7175 != -1) {
				arg3.anInt6273 = local9.anInt7175;
			} else {
				arg3.anInt6273 = local9.anInt7160;
			}
			arg3.aBoolean531 = false;
		} else {
			arg3.aBoolean531 = false;
			if (arg0 == 2 && local9.anInt7157 != -1) {
				if (arg2 < 0 && local9.anInt7174 != -1) {
					arg3.anInt6273 = local9.anInt7174;
				} else if (arg2 <= 0 || local9.anInt7151 == -1) {
					arg3.anInt6273 = local9.anInt7157;
				} else {
					arg3.anInt6273 = local9.anInt7151;
				}
			} else if (arg0 == 0 && local9.anInt7175 != -1) {
				if (arg2 < 0 && local9.anInt7187 != -1) {
					arg3.anInt6273 = local9.anInt7187;
				} else if (arg2 <= 0 || local9.anInt7167 == -1) {
					arg3.anInt6273 = local9.anInt7175;
				} else {
					arg3.anInt6273 = local9.anInt7167;
				}
			} else if (arg2 < 0 && local9.anInt7171 != -1) {
				arg3.anInt6273 = local9.anInt7171;
			} else if (arg2 <= 0 || local9.anInt7181 == -1) {
				arg3.anInt6273 = local9.anInt7160;
			} else {
				arg3.anInt6273 = local9.anInt7181;
			}
		}
	}
}
