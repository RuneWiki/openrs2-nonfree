import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
	public static int anInt5539;

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_119 = new Class136(12, 3);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILclient!kn;BII)V")
	public static void method4977(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub1_Sub1_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class295 local9 = arg1.method2519();
		@Pc(24) int local24 = arg1.lb - arg1.aClass130_7.anInt3301 & 0x3FFF;
		if (arg3 == -1) {
			if (local24 != 0 || arg1.anInt2905 > 25) {
				if (arg2 < 0 && local9.anInt7966 != -1) {
					arg1.anInt2924 = local9.anInt7966;
					arg1.aBoolean257 = false;
				} else if (arg2 <= 0 || local9.anInt7960 == -1) {
					arg1.anInt2924 = local9.anInt7968;
				} else {
					arg1.anInt2924 = local9.anInt7960;
				}
				arg1.aBoolean257 = false;
			} else if (!arg1.aBoolean257 || !local9.method6936(arg1.anInt2924)) {
				arg1.anInt2924 = local9.method6937();
				arg1.aBoolean257 = arg1.anInt2924 != -1;
			}
		} else if (arg1.anInt2951 != -1 && (local24 >= 10240 || local24 <= 2048)) {
			@Pc(120) int local120 = Static39.anIntArray53[arg0] - arg1.aClass130_7.anInt3301 & 0x3FFF;
			arg1.aBoolean257 = false;
			if (arg3 == 2 && local9.anInt7956 != -1) {
				if (local120 > 2048 && local120 <= 6144 && local9.anInt7984 != -1) {
					arg1.anInt2924 = local9.anInt7984;
				} else if (local120 >= 10240 && local120 < 14336 && local9.anInt7970 != -1) {
					arg1.anInt2924 = local9.anInt7970;
				} else if (local120 <= 6144 || local120 >= 10240 || local9.anInt7959 == -1) {
					arg1.anInt2924 = local9.anInt7956;
				} else {
					arg1.anInt2924 = local9.anInt7959;
				}
			} else if (arg3 == 0 && local9.anInt7969 != -1) {
				if (local120 > 2048 && local120 <= 6144 && local9.anInt7997 != -1) {
					arg1.anInt2924 = local9.anInt7997;
				} else if (local120 >= 10240 && local120 < 14336 && local9.anInt7958 != -1) {
					arg1.anInt2924 = local9.anInt7958;
				} else if (local120 <= 6144 || local120 >= 10240 || local9.anInt8001 == -1) {
					arg1.anInt2924 = local9.anInt7969;
				} else {
					arg1.anInt2924 = local9.anInt8001;
				}
			} else if (local120 > 2048 && local120 <= 6144 && local9.anInt7999 != -1) {
				arg1.anInt2924 = local9.anInt7999;
			} else if (local120 >= 10240 && local120 < 14336 && local9.anInt7964 != -1) {
				arg1.anInt2924 = local9.anInt7964;
			} else if (local120 <= 6144 || local120 >= 10240 || local9.anInt7989 == -1) {
				arg1.anInt2924 = local9.anInt7968;
			} else {
				arg1.anInt2924 = local9.anInt7989;
			}
		} else if (local24 == 0 && arg1.anInt2905 <= 25) {
			if (arg3 == 2 && local9.anInt7956 != -1) {
				arg1.anInt2924 = local9.anInt7956;
			} else if (arg3 == 0 && local9.anInt7969 != -1) {
				arg1.anInt2924 = local9.anInt7969;
			} else {
				arg1.anInt2924 = local9.anInt7968;
			}
			arg1.aBoolean257 = false;
		} else {
			if (arg3 == 2 && local9.anInt7956 != -1) {
				if (arg2 < 0 && local9.anInt7986 != -1) {
					arg1.anInt2924 = local9.anInt7986;
				} else if (arg2 <= 0 || local9.anInt7967 == -1) {
					arg1.anInt2924 = local9.anInt7956;
				} else {
					arg1.anInt2924 = local9.anInt7967;
				}
			} else if (arg3 == 0 && local9.anInt7969 != -1) {
				if (arg2 < 0 && local9.anInt7961 != -1) {
					arg1.anInt2924 = local9.anInt7961;
				} else if (arg2 <= 0 || local9.anInt7973 == -1) {
					arg1.anInt2924 = local9.anInt7969;
				} else {
					arg1.anInt2924 = local9.anInt7973;
				}
			} else if (arg2 < 0 && local9.anInt7957 != -1) {
				arg1.anInt2924 = local9.anInt7957;
			} else if (arg2 <= 0 || local9.anInt8002 == -1) {
				arg1.anInt2924 = local9.anInt7968;
			} else {
				arg1.anInt2924 = local9.anInt8002;
			}
			arg1.aBoolean257 = false;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
	public static void method4978() {
		Static645.aClass293_77.method6927();
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)V")
	public static void method4980() {
		Static464.aClass195Array1 = null;
	}
}
