import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!em", name = "d", descriptor = "I")
	public static int anInt2507;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "J")
	public static long aLong66;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "client!em", name = "k", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_2 = new Class295(4, 3);

	@OriginalMember(owner = "client!em", name = "n", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_1 = new Class325(14, 1);

	@OriginalMember(owner = "client!em", name = "o", descriptor = "[I")
	public static final int[] anIntArray96 = new int[1];

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_2 = new Class325(15, 4);

	@OriginalMember(owner = "client!em", name = "q", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_3 = new Class325(16, -2);

	@OriginalMember(owner = "client!em", name = "r", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_4 = new Class325(17, 0);

	@OriginalMember(owner = "client!em", name = "s", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_5 = new Class325(18, -2);

	@OriginalMember(owner = "client!em", name = "t", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_6 = new Class325(19, -2);

	@OriginalMember(owner = "client!em", name = "u", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_7 = new Class325(20, 6);

	@OriginalMember(owner = "client!em", name = "v", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_8 = new Class325(21, 9);

	@OriginalMember(owner = "client!em", name = "w", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_9 = new Class325(22, -2);

	@OriginalMember(owner = "client!em", name = "x", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_10 = new Class325(23, 4);

	@OriginalMember(owner = "client!em", name = "y", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_11 = new Class325(24, -1);

	@OriginalMember(owner = "client!em", name = "z", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_12 = new Class325(25, -2);

	@OriginalMember(owner = "client!em", name = "A", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_13 = new Class325(26, 0);

	@OriginalMember(owner = "client!em", name = "B", descriptor = "Lclient!ts;")
	public static final Class325 aClass325_14 = new Class325(27, 0);

	@OriginalMember(owner = "client!em", name = "D", descriptor = "Z")
	public static final boolean aBoolean191 = false;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)I")
	public static int method2187(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I[Ljava/lang/Object;I[II)V")
	public static void method2188(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg3) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg2[local15];
		arg2[local15] = arg2[arg3];
		arg2[arg3] = local21;
		@Pc(35) Object local35 = arg1[local15];
		arg1[local15] = arg1[arg3];
		arg1[arg3] = local35;
		@Pc(52) int local52 = local21 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg0; local54 < arg3; local54++) {
			if (local21 + (local52 & local54) > arg2[local54]) {
				@Pc(70) int local70 = arg2[local54];
				arg2[local54] = arg2[local17];
				arg2[local17] = local70;
				@Pc(84) Object local84 = arg1[local54];
				arg1[local54] = arg1[local17];
				arg1[local17++] = local84;
			}
		}
		arg2[arg3] = arg2[local17];
		arg2[local17] = local21;
		arg1[arg3] = arg1[local17];
		arg1[local17] = local35;
		method2188(arg0, arg1, arg2, local17 - 1);
		method2188(local17 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
	public static void method2189() {
		Static266.aBoolean369 = false;
		Static506.method7088();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!in;II)Ljava/lang/String;")
	public static String method2192(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1) {
		if (!Static67.method1098(arg0).method572(arg1) && arg0.lb == null) {
			return null;
		} else if (arg0.aStringArray9 == null || arg1 >= arg0.aStringArray9.length || arg0.aStringArray9[arg1] == null || arg0.aStringArray9[arg1].trim().length() == 0) {
			return Static506.aBoolean659 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray9[arg1];
		}
	}
}
