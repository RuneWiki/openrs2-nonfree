import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
	public static int anInt9763 = 0;

	@OriginalMember(owner = "client!uk", name = "G", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_308 = new Class196(77, -1);

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!ha;Lclient!nba;IIIIIIIII)V")
	public static void method8127(@OriginalArg(1) Class143 arg0, @OriginalArg(2) Class5_Sub2_Sub13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 < arg10 && arg10 < arg2 + arg7 && arg5 - 13 < arg3 && arg3 < arg5 + 3 && arg1.aBoolean479) {
			arg6 = arg9;
		}
		@Pc(40) int[] local40 = null;
		if (Static613.method8234(arg1.anInt6711)) {
			local40 = Static259.aClass135_1.method2776((int) arg1.aLong198).anIntArray351;
		} else if (arg1.anInt6709 != -1) {
			local40 = Static259.aClass135_1.method2776(arg1.anInt6709).anIntArray351;
		} else if (Static152.method2244(arg1.anInt6711)) {
			@Pc(63) Class5_Sub34 local63 = (Class5_Sub34) Static223.aClass335_19.method7766((long) (int) arg1.aLong198);
			if (local63 != null) {
				@Pc(68) Class41_Sub1_Sub1_Sub3_Sub1 local68 = local63.aClass41_Sub1_Sub1_Sub3_Sub1_1;
				@Pc(71) Class311 local71 = local68.aClass311_1;
				if (local71.anIntArray476 != null) {
					local71 = local71.method7325(Static413.aClass63_1);
				}
				if (local71 != null) {
					local40 = local71.anIntArray474;
				}
			}
		} else if (Static63.method930(arg1.anInt6711)) {
			@Pc(107) Class81 local107;
			if (arg1.anInt6711 == 1007) {
				local107 = Static400.aClass140_4.method2839((int) arg1.aLong198);
			} else {
				local107 = Static400.aClass140_4.method2839((int) (arg1.aLong198 >>> 32 & 0x7FFFFFFFL));
			}
			if (local107.anIntArray100 != null) {
				local107 = local107.method1760(Static413.aClass63_1);
			}
			if (local107 != null) {
				local40 = local107.anIntArray96;
			}
		}
		@Pc(149) String local149 = Static554.method3435(arg1);
		if (local40 != null) {
			local149 = local149 + Static216.method3090(local40);
		}
		Static32.aClass72_2.method6918(arg6, Static113.aClass59Array2, local149, arg2 + 3, Static558.anIntArray502, arg5);
		if (arg1.aBoolean481) {
			Static649.aClass59_39.method8057(arg2 + Static358.aClass198_7.method4076(local149) + 5, arg5 - 12);
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)[Lclient!dba;")
	public static Class74[] method8129() {
		return new Class74[] { Static600.aClass74_18, Static463.aClass74_16, Static447.aClass74_14, Static412.aClass74_13, Static202.aClass74_8, Static125.aClass74_5, Static248.aClass74_10, Static674.aClass74_4, Static549.aClass74_17, Static455.aClass74_15, Static637.aClass74_20, Static625.aClass74_19, Static149.aClass74_7, Static12.aClass74_21, Static233.aClass74_9 };
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "(B)V")
	public static void method8130() {
		if (Static655.aClass5_Sub36_29.aClass2_Sub19_1.method7172() == 0 && Static326.anInt5965 != Static458.anInt7955) {
			Static505.method7281(false, Static544.anInt8919, 11, Static216.anInt3459);
		} else {
			Static554.method3434(Static563.aClass143_13);
			if (Static658.anInt9444 != Static458.anInt7955) {
				Static494.method7191();
			}
		}
	}
}
