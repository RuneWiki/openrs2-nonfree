import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
	public static void method3905() {
		Static525.aClass39_12.E(Static169.anInt3087, Static281.aClass2_Sub19_Sub1_1.aBoolean181 ? Static437.anInt7977 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!lba;")
	public static Class1_Sub1 method3907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class262 local7 = Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class187 local14 = local7.aClass187_3; local14 != null; local14 = local14.aClass187_1) {
			@Pc(18) Class1_Sub1 local18 = local14.aClass1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort127 == arg1 && local18.aShort128 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
	public static void method3909() {
		Static53.method968();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static207.aClass99Array1[local17].method2648();
		}
		Static469.method7062();
		Static209.method3332();
		System.gc();
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIILclient!cd;)V")
	public static void method3911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub2 arg3) {
		@Pc(9) Class24 local9 = arg3.method4393();
		@Pc(19) int local19 = arg3.anInt5069 - arg3.aClass151_7.anInt4209 & 0x3FFF;
		if (arg2 == -1) {
			if (local19 != 0 || arg3.anInt5044 > 25) {
				arg3.aBoolean385 = false;
				if (arg1 < 0 && local9.anInt660 != -1) {
					arg3.anInt5063 = local9.anInt660;
				} else if (arg1 <= 0 || local9.anInt679 == -1) {
					arg3.anInt5063 = local9.anInt687;
				} else {
					arg3.anInt5063 = local9.anInt679;
				}
			} else if (!arg3.aBoolean385 || !local9.method710(arg3.anInt5063)) {
				arg3.anInt5063 = local9.method709();
				arg3.aBoolean385 = arg3.anInt5063 != -1;
			}
		} else if (arg3.anInt5062 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(204) int local204 = Static186.anIntArray371[arg0] - arg3.aClass151_7.anInt4209 & 0x3FFF;
			if (arg2 == 2 && local9.anInt667 != -1) {
				if (local204 > 2048 && local204 <= 6144 && local9.anInt686 != -1) {
					arg3.anInt5063 = local9.anInt686;
				} else if (local204 >= 10240 && local204 < 14336 && local9.anInt656 != -1) {
					arg3.anInt5063 = local9.anInt656;
				} else if (local204 <= 6144 || local204 >= 10240 || local9.anInt685 == -1) {
					arg3.anInt5063 = local9.anInt667;
				} else {
					arg3.anInt5063 = local9.anInt685;
				}
			} else if (arg2 == 0 && local9.anInt665 != -1) {
				if (local204 > 2048 && local204 <= 6144 && local9.anInt653 != -1) {
					arg3.anInt5063 = local9.anInt653;
				} else if (local204 >= 10240 && local204 < 14336 && local9.anInt661 != -1) {
					arg3.anInt5063 = local9.anInt661;
				} else if (local204 <= 6144 || local204 >= 10240 || local9.anInt659 == -1) {
					arg3.anInt5063 = local9.anInt665;
				} else {
					arg3.anInt5063 = local9.anInt659;
				}
			} else if (local204 > 2048 && local204 <= 6144 && local9.anInt678 != -1) {
				arg3.anInt5063 = local9.anInt678;
			} else if (local204 >= 10240 && local204 < 14336 && local9.anInt648 != -1) {
				arg3.anInt5063 = local9.anInt648;
			} else if (local204 <= 6144 || local204 >= 10240 || local9.anInt680 == -1) {
				arg3.anInt5063 = local9.anInt687;
			} else {
				arg3.anInt5063 = local9.anInt680;
			}
			arg3.aBoolean385 = false;
		} else if (local19 == 0 && arg3.anInt5044 <= 25) {
			arg3.aBoolean385 = false;
			if (arg2 == 2 && local9.anInt667 != -1) {
				arg3.anInt5063 = local9.anInt667;
			} else if (arg2 == 0 && local9.anInt665 != -1) {
				arg3.anInt5063 = local9.anInt665;
			} else {
				arg3.anInt5063 = local9.anInt687;
			}
		} else {
			arg3.aBoolean385 = false;
			if (arg2 == 2 && local9.anInt667 != -1) {
				if (arg1 < 0 && local9.anInt682 != -1) {
					arg3.anInt5063 = local9.anInt682;
				} else if (arg1 <= 0 || local9.anInt689 == -1) {
					arg3.anInt5063 = local9.anInt667;
				} else {
					arg3.anInt5063 = local9.anInt689;
				}
			} else if (arg2 == 0 && local9.anInt665 != -1) {
				if (arg1 < 0 && local9.anInt671 != -1) {
					arg3.anInt5063 = local9.anInt671;
				} else if (arg1 <= 0 || local9.anInt672 == -1) {
					arg3.anInt5063 = local9.anInt665;
				} else {
					arg3.anInt5063 = local9.anInt672;
				}
			} else if (arg1 < 0 && local9.anInt663 != -1) {
				arg3.anInt5063 = local9.anInt663;
			} else if (arg1 <= 0 || local9.anInt650 == -1) {
				arg3.anInt5063 = local9.anInt687;
			} else {
				arg3.anInt5063 = local9.anInt650;
			}
		}
	}
}
