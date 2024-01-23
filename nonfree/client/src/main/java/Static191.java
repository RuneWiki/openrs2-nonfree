import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	public static int anInt4237;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	public static int anInt4238;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!jb;")
	public static Class28 aClass28_66;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Lclient!mb;")
	public static Class1_Sub2_Sub12 aClass1_Sub2_Sub12_1;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "[I")
	public static int[] anIntArray348 = new int[2];

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1105 = Static231.method3737(")4l=");

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1106 = Static231.method3737("Choose Option");

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	public static int anInt4239 = 20;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	public static int anInt4240 = 0;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "B")
	public static byte aByte16 = 0;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1107 = aClass107_1106;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "Z")
	public static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	public static void method3118() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static39.aBooleanArray5[local3] = true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([IIIIII)V")
	public static void method3120(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class117 local13 = local7.aClass117_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4431;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class49 local58 = local7.aClass49_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt1736;
		@Pc(67) int local67 = local58.anInt1734;
		@Pc(70) int local70 = local58.anInt1735;
		@Pc(73) int local73 = local58.anInt1733;
		@Pc(77) int[] local77 = Static66.anIntArrayArray21[local23];
		@Pc(81) int[] local81 = Static154.anIntArrayArray33[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZILclient!jb;I)[Lclient!ka;")
	public static Class64_Sub1[] method3122(@OriginalArg(2) Class28 arg0, @OriginalArg(3) int arg1) {
		return Static83.method1393(arg1, arg0) ? Static39.method743() : null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!vf;B)Lclient!ma;")
	public static Class77 method3125(@OriginalArg(0) Class1_Sub26 arg0) {
		@Pc(7) Class77 local7 = new Class77();
		local7.anInt2811 = arg0.method2964();
		local7.aClass1_Sub2_Sub10_1 = Static58.method1124(local7.anInt2811);
		return local7;
	}
}
