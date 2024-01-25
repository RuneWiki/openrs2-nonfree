import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!pt", name = "E", descriptor = "I")
	public static int anInt4857;

	@OriginalMember(owner = "client!pt", name = "O", descriptor = "Lclient!be;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!pt", name = "L", descriptor = "Lclient!o;")
	public static final Class169 aClass169_261 = new Class169("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!pt", name = "S", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_172 = new Class48(43, 3);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IBLclient!sk;II)V")
	public static void method4279(@OriginalArg(0) int arg0, @OriginalArg(2) Class25_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class8 local11 = arg1.method1880();
		@Pc(21) int local21 = arg1.anInt2352 - arg1.aClass99_7.anInt2556 & 0x3FFF;
		if (arg3 == -1) {
			if (local21 != 0 || arg1.anInt2337 > 25) {
				if (arg2 < 0 && local11.anInt149 != -1) {
					arg1.anInt2340 = local11.anInt149;
				} else if (arg2 <= 0 || local11.anInt158 == -1) {
					arg1.anInt2340 = local11.anInt148;
				} else {
					arg1.anInt2340 = local11.anInt158;
				}
				arg1.aBoolean191 = false;
			} else if (!arg1.aBoolean191 || !local11.method98(arg1.anInt2340)) {
				arg1.anInt2340 = local11.method96();
				arg1.aBoolean191 = arg1.anInt2340 != -1;
			}
		} else if (arg1.anInt2353 != -1 && (local21 >= 10240 || local21 <= 2048)) {
			@Pc(214) int local214 = Static280.anIntArray590[arg0] - arg1.aClass99_7.anInt2556 & 0x3FFF;
			arg1.aBoolean191 = false;
			if (arg3 == 2 && local11.anInt128 != -1) {
				if (local214 > 2048 && local214 <= 6144 && local11.anInt150 != -1) {
					arg1.anInt2340 = local11.anInt150;
				} else if (local214 >= 10240 && local214 < 14336 && local11.anInt133 != -1) {
					arg1.anInt2340 = local11.anInt133;
				} else if (local214 <= 6144 || local214 >= 10240 || local11.anInt138 == -1) {
					arg1.anInt2340 = local11.anInt128;
				} else {
					arg1.anInt2340 = local11.anInt138;
				}
			} else if (arg3 == 0 && local11.anInt151 != -1) {
				if (local214 > 2048 && local214 <= 6144 && local11.anInt122 != -1) {
					arg1.anInt2340 = local11.anInt122;
				} else if (local214 >= 10240 && local214 < 14336 && local11.anInt145 != -1) {
					arg1.anInt2340 = local11.anInt145;
				} else if (local214 <= 6144 || local214 >= 10240 || local11.anInt137 == -1) {
					arg1.anInt2340 = local11.anInt151;
				} else {
					arg1.anInt2340 = local11.anInt137;
				}
			} else if (local214 > 2048 && local214 <= 6144 && local11.anInt160 != -1) {
				arg1.anInt2340 = local11.anInt160;
			} else if (local214 >= 10240 && local214 < 14336 && local11.anInt132 != -1) {
				arg1.anInt2340 = local11.anInt132;
			} else if (local214 <= 6144 || local214 >= 10240 || local11.anInt156 == -1) {
				arg1.anInt2340 = local11.anInt148;
			} else {
				arg1.anInt2340 = local11.anInt156;
			}
		} else if (local21 == 0 && arg1.anInt2337 <= 25) {
			arg1.aBoolean191 = false;
			if (arg3 == 2 && local11.anInt128 != -1) {
				arg1.anInt2340 = local11.anInt128;
			} else if (arg3 == 0 && local11.anInt151 != -1) {
				arg1.anInt2340 = local11.anInt151;
			} else {
				arg1.anInt2340 = local11.anInt148;
			}
		} else {
			if (arg3 == 2 && local11.anInt128 != -1) {
				if (arg2 < 0 && local11.anInt144 != -1) {
					arg1.anInt2340 = local11.anInt144;
				} else if (arg2 <= 0 || local11.anInt134 == -1) {
					arg1.anInt2340 = local11.anInt128;
				} else {
					arg1.anInt2340 = local11.anInt134;
				}
			} else if (arg3 == 0 && local11.anInt151 != -1) {
				if (arg2 < 0 && local11.anInt127 != -1) {
					arg1.anInt2340 = local11.anInt127;
				} else if (arg2 <= 0 || local11.anInt143 == -1) {
					arg1.anInt2340 = local11.anInt151;
				} else {
					arg1.anInt2340 = local11.anInt143;
				}
			} else if (arg2 < 0 && local11.anInt131 != -1) {
				arg1.anInt2340 = local11.anInt131;
			} else if (arg2 <= 0 || local11.anInt136 == -1) {
				arg1.anInt2340 = local11.anInt148;
			} else {
				arg1.anInt2340 = local11.anInt136;
			}
			arg1.aBoolean191 = false;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([JB[Ljava/lang/Object;)V")
	public static void method4281(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static205.method2940(arg1, arg0.length - 1, 0, arg0);
	}
}
