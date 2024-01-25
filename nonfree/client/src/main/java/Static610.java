import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "[I")
	public static int[] anIntArray675;

	@OriginalMember(owner = "client!vr", name = "u", descriptor = "I")
	public static int anInt9840 = -1;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!ei;IIZLclient!ei;)I")
	public static int method8215(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class89_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local11 = arg0.anInt2234;
			local14 = arg3.anInt2234;
			if (!arg2) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return Static410.method5511(Static483.anInt7694, arg3.method1829().aString101, arg0.method1829().aString101);
		} else if (arg1 == 3) {
			if (arg0.aString19.equals("-")) {
				if (arg3.aString19.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString19.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static410.method5511(Static483.anInt7694, arg3.aString19, arg0.aString19);
			}
		} else if (arg1 == 4) {
			if (arg0.method1821()) {
				return arg3.method1821() ? 0 : 1;
			} else if (arg3.method1821()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg0.method1827()) {
				return arg3.method1827() ? 0 : 1;
			} else if (arg3.method1827()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg0.method1824()) {
				return arg3.method1824() ? 0 : 1;
			} else if (arg3.method1824()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg0.method1823()) {
				return arg3.method1823() ? 0 : 1;
			} else if (arg3.method1823()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local11 = arg0.anInt2236;
			local14 = arg3.anInt2236;
			if (arg2) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg0.anInt2240 - arg3.anInt2240;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)V")
	public static void method8217() {
		Static620.method8305();
		Static425.method5667(Static234.aClass2_Sub5_48.aClass6_Sub2_1.method252() == 1);
		Static123.aClass35_1 = Static401.method5453(Static504.aCanvas11, 22050, 0, Static452.aClass226_6);
		Static338.method4548(Static629.method8440(null));
		Static313.aClass35_3 = Static401.method5453(Static504.aCanvas11, 2048, 1, Static452.aClass226_6);
		Static313.aClass35_3.method2738(Static586.aClass2_Sub13_Sub4_2);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BIIIIIII)V")
	public static void method8218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg4 - arg0;
		@Pc(14) int local14 = arg0 + arg5;
		for (@Pc(16) int local16 = arg5; local16 < local14; local16++) {
			Static134.method1841(Static543.anIntArrayArray57[local16], arg1, arg3, arg2);
		}
		for (@Pc(37) int local37 = arg4; local37 > local10; local37--) {
			Static134.method1841(Static543.anIntArrayArray57[local37], arg1, arg3, arg2);
		}
		@Pc(55) int local55 = arg0 + arg1;
		@Pc(60) int local60 = arg3 - arg0;
		for (@Pc(62) int local62 = local14; local62 <= local10; local62++) {
			@Pc(68) int[] local68 = Static543.anIntArrayArray57[local62];
			Static134.method1841(local68, arg1, local55, arg2);
			Static134.method1841(local68, local55, local60, arg6);
			Static134.method1841(local68, local60, arg3, arg2);
		}
	}
}
