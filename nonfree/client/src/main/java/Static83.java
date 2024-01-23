import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "I")
	public static int anInt1871;

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString106;

	@OriginalMember(owner = "client!gb", name = "jb", descriptor = "I")
	public static int anInt1875;

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "[Lclient!om;")
	public static Class125[] aClass125Array2 = new Class125[14];

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "Ljava/lang/String;")
	public static String aString105 = "wave2:";

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "Z")
	public static boolean aBoolean132 = true;

	@OriginalMember(owner = "client!gb", name = "kb", descriptor = "[I")
	public static int[] anIntArray173 = new int[256];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method1454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg8 && arg4 == arg0 && arg3 == arg5 && arg1 == arg7) {
			Static237.method3662(arg1, arg6, arg4, arg2, arg5);
			return;
		}
		@Pc(28) int local28 = arg2;
		@Pc(30) int local30 = arg4;
		@Pc(34) int local34 = arg0 * 3;
		@Pc(38) int local38 = arg2 * 3;
		@Pc(42) int local42 = arg4 * 3;
		@Pc(46) int local46 = arg3 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(65) int local65 = arg5 + local50 - arg2 - local46;
		@Pc(74) int local74 = local34 + arg1 - local54 - arg4;
		@Pc(84) int local84 = local46 + local38 - local50 - local50;
		@Pc(88) int local88 = local50 - local38;
		@Pc(99) int local99 = local54 + local42 - local34 - local34;
		@Pc(104) int local104 = local34 - local42;
		for (@Pc(106) int local106 = 128; local106 <= 4096; local106 += 128) {
			@Pc(115) int local115 = local106 * local106 >> 12;
			@Pc(121) int local121 = local106 * local115 >> 12;
			@Pc(125) int local125 = local121 * local74;
			@Pc(129) int local129 = local121 * local65;
			@Pc(133) int local133 = local115 * local84;
			@Pc(137) int local137 = local115 * local99;
			@Pc(141) int local141 = local104 * local106;
			@Pc(152) int local152 = (local141 + local125 + local137 >> 12) + arg4;
			@Pc(156) int local156 = local106 * local88;
			@Pc(166) int local166 = (local156 + local133 + local129 >> 12) + arg2;
			Static237.method3662(local152, arg6, local30, local28, local166);
			local30 = local152;
			local28 = local166;
		}
	}

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)Lclient!wh;")
	public static Class77 method1455() {
		try {
			return (Class77) Class.forName("Class77_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return new Class77_Sub1();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method1456(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(18) String local18 = arg1[arg0];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg2 + arg0;
			@Pc(31) int local31 = 0;
			for (@Pc(41) int local41 = arg0; local41 < local29; local41++) {
				@Pc(52) String local52 = arg1[local41];
				if (local52 == null) {
					local31 += 4;
				} else {
					local31 += local52.length();
				}
			}
			@Pc(71) StringBuffer local71 = new StringBuffer(local31);
			for (@Pc(73) int local73 = arg0; local73 < local29; local73++) {
				@Pc(80) String local80 = arg1[local73];
				if (local80 == null) {
					local71.append("null");
				} else {
					local71.append(local80);
				}
			}
			return local71.toString();
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(II)V")
	public static void method1458(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub18 local12 = Static130.method2227(arg0, 3);
		local12.method3911();
	}
}
