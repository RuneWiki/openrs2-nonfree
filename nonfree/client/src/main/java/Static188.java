import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!je", name = "L", descriptor = "[I")
	public static int[] anIntArray214;

	@OriginalMember(owner = "client!je", name = "P", descriptor = "Lclient!uu;")
	public static Class250 aClass250_58;

	@OriginalMember(owner = "client!je", name = "U", descriptor = "Lclient!l;")
	public static Interface7 anInterface7_3;

	@OriginalMember(owner = "client!je", name = "K", descriptor = "Lclient!of;")
	public static final Class174 aClass174_105 = new Class174("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!je", name = "O", descriptor = "I")
	public static int anInt3444 = 0;

	@OriginalMember(owner = "client!je", name = "S", descriptor = "I")
	public static int anInt3447 = 0;

	@OriginalMember(owner = "client!je", name = "T", descriptor = "Z")
	public static boolean aBoolean262 = false;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)V")
	public static void method2951() {
		Static89.aClass268_15.method6173(50);
		Static425.aClass268_21.method6173(50);
		Static76.aClass268_13.method6173(50);
		Static29.aClass268_49.method6173(50);
		Static226.aClass268_57.method6173(50);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!uo;IBZLclient!uo;)I")
	public static int method2952(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class41_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local9 = arg3.anInt7094;
			local12 = arg0.anInt7094;
			if (!arg2) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg1 == 2) {
			return Static176.method2834(arg3.method5757().aString35, arg0.method5757().aString35, Static300.anInt5192);
		} else if (arg1 == 3) {
			if (arg3.aString66.equals("-")) {
				if (arg0.aString66.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString66.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static176.method2834(arg3.aString66, arg0.aString66, Static300.anInt5192);
			}
		} else if (arg1 == 4) {
			if (arg3.method5748()) {
				return arg0.method5748() ? 0 : 1;
			} else if (arg0.method5748()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg3.method5750()) {
				return arg0.method5750() ? 0 : 1;
			} else if (arg0.method5750()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg3.method5752()) {
				return arg0.method5752() ? 0 : 1;
			} else if (arg0.method5752()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg3.method5751()) {
				return arg0.method5751() ? 0 : 1;
			} else if (arg0.method5751()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local9 = arg3.anInt7104;
			local12 = arg0.anInt7104;
			if (arg2) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg3.anInt7107 - arg0.anInt7107;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZIII)V")
	public static void method2953(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static402.anInt6656 == 0) {
			Static126.method1992(false);
		} else {
			Static124.anInt2275 = Static402.anInt6656;
			Static299.method4264(0);
		}
		Static368.anInt6236 = arg3;
		Static22.aBoolean21 = arg1;
		Static167.anInt3017 = arg0;
		Static211.method294(arg2);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!uu;I)V")
	public static void method2954(@OriginalArg(0) Class250 arg0) {
		aClass250_58 = arg0;
	}
}
