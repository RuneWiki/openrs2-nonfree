import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!mw", name = "Ob", descriptor = "I")
	public static int anInt6150;

	@OriginalMember(owner = "client!mw", name = "Fb", descriptor = "I")
	public static int anInt6141 = 0;

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "(Z)V")
	public static void method4988() {
		if (Static55.anInt1068 == 7) {
			Static136.method2372(false);
		} else {
			Static501.aClass43_2 = Static485.aClass43_1;
			Static485.aClass43_1 = null;
			Static318.method4726(13);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILclient!ls;III)V")
	public static void method4995(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) Class114 local11 = arg1.method6073();
		@Pc(20) int local20 = arg1.anInt7522 - arg1.aClass106_7.anInt2824 & 0x3FFF;
		if (arg2 == -1) {
			if (local20 != 0 || arg1.anInt7541 > 25) {
				if (arg3 < 0 && local11.anInt3020 != -1) {
					arg1.anInt7577 = local11.anInt3020;
					arg1.aBoolean575 = false;
				} else if (arg3 <= 0 || local11.anInt3005 == -1) {
					arg1.anInt7577 = local11.anInt2998;
				} else {
					arg1.anInt7577 = local11.anInt3005;
				}
				arg1.aBoolean575 = false;
			} else if (!arg1.aBoolean575 || !local11.method2603(arg1.anInt7577)) {
				arg1.anInt7577 = local11.method2600();
				arg1.aBoolean575 = arg1.anInt7577 != -1;
			}
		} else if (arg1.anInt7528 != -1 && (local20 >= 10240 || local20 <= 2048)) {
			@Pc(47) int local47 = Static71.anIntArray60[arg0] - arg1.aClass106_7.anInt2824 & 0x3FFF;
			if (arg2 == 2 && local11.anInt2994 != -1) {
				if (local47 > 2048 && local47 <= 6144 && local11.anInt3023 != -1) {
					arg1.anInt7577 = local11.anInt3023;
				} else if (local47 >= 10240 && local47 < 14336 && local11.anInt2993 != -1) {
					arg1.anInt7577 = local11.anInt2993;
				} else if (local47 <= 6144 || local47 >= 10240 || local11.anInt3009 == -1) {
					arg1.anInt7577 = local11.anInt2994;
				} else {
					arg1.anInt7577 = local11.anInt3009;
				}
			} else if (arg2 == 0 && local11.anInt3006 != -1) {
				if (local47 > 2048 && local47 <= 6144 && local11.anInt3002 != -1) {
					arg1.anInt7577 = local11.anInt3002;
				} else if (local47 >= 10240 && local47 < 14336 && local11.anInt3018 != -1) {
					arg1.anInt7577 = local11.anInt3018;
				} else if (local47 <= 6144 || local47 >= 10240 || local11.anInt2989 == -1) {
					arg1.anInt7577 = local11.anInt3006;
				} else {
					arg1.anInt7577 = local11.anInt2989;
				}
			} else if (local47 > 2048 && local47 <= 6144 && local11.anInt2984 != -1) {
				arg1.anInt7577 = local11.anInt2984;
			} else if (local47 >= 10240 && local47 < 14336 && local11.anInt3013 != -1) {
				arg1.anInt7577 = local11.anInt3013;
			} else if (local47 <= 6144 || local47 >= 10240 || local11.anInt2992 == -1) {
				arg1.anInt7577 = local11.anInt2998;
			} else {
				arg1.anInt7577 = local11.anInt2992;
			}
			arg1.aBoolean575 = false;
		} else if (local20 == 0 && arg1.anInt7541 <= 25) {
			arg1.aBoolean575 = false;
			if (arg2 == 2 && local11.anInt2994 != -1) {
				arg1.anInt7577 = local11.anInt2994;
			} else if (arg2 == 0 && local11.anInt3006 != -1) {
				arg1.anInt7577 = local11.anInt3006;
			} else {
				arg1.anInt7577 = local11.anInt2998;
			}
		} else {
			arg1.aBoolean575 = false;
			if (arg2 == 2 && local11.anInt2994 != -1) {
				if (arg3 < 0 && local11.anInt2987 != -1) {
					arg1.anInt7577 = local11.anInt2987;
				} else if (arg3 <= 0 || local11.anInt2997 == -1) {
					arg1.anInt7577 = local11.anInt2994;
				} else {
					arg1.anInt7577 = local11.anInt2997;
				}
			} else if (arg2 == 0 && local11.anInt3006 != -1) {
				if (arg3 < 0 && local11.anInt3022 != -1) {
					arg1.anInt7577 = local11.anInt3022;
				} else if (arg3 <= 0 || local11.anInt3012 == -1) {
					arg1.anInt7577 = local11.anInt3006;
				} else {
					arg1.anInt7577 = local11.anInt3012;
				}
			} else if (arg3 < 0 && local11.anInt3010 != -1) {
				arg1.anInt7577 = local11.anInt3010;
			} else if (arg3 <= 0 || local11.anInt3024 == -1) {
				arg1.anInt7577 = local11.anInt2998;
			} else {
				arg1.anInt7577 = local11.anInt3024;
			}
		}
	}
}
