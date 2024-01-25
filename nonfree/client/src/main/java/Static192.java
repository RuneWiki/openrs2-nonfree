import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!js", name = "i", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "I")
	public static int anInt3704;

	@OriginalMember(owner = "client!js", name = "n", descriptor = "Lclient!bm;")
	public static Class28 aClass28_6;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "Lclient!di;")
	public static final Class54 aClass54_54 = new Class54(68, -1);

	@OriginalMember(owner = "client!js", name = "d", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!js", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[8];

	@OriginalMember(owner = "client!js", name = "j", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_78 = new Class265(105, 6);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIZLclient!mg;III)V")
	public static void method3005(@OriginalArg(0) int arg0, @OriginalArg(3) Class160 arg1, @OriginalArg(4) int arg2) {
		Static332.anInt5719 = 2;
		Static237.anInt4548 = 1;
		Static71.anInt1577 = arg2;
		Static436.anInt7186 = 0;
		Static74.aClass160_9 = arg1;
		Static237.anInt4547 = arg0;
		Static263.aBoolean350 = false;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IB)I")
	public static int method3007(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)Z")
	public static boolean method3008(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(II)V")
	public static void method3009() {
		Static121.aClass171_19.method3933(50);
		Static440.aClass171_60.method3933(50);
		Static343.aClass171_48.method3933(50);
		Static237.aClass171_39.method3933(50);
		Static185.aClass171_30.method3933(50);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III)Lclient!eq;")
	public static Class70 method3010(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class70 local12 = new Class70();
		local12.anInt2305 = -1;
		local12.anInt2308 = arg0 + 5 + 1;
		local12.anInt2309 = arg1 + 6;
		local12.anInt2303 = -1;
		local12.anIntArrayArray17 = new int[local12.anInt2308][local12.anInt2309];
		local12.method1797();
		return local12;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([Ljava/lang/Object;IBI[J)V")
	public static void method3011(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg1) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) long local16 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local16;
		@Pc(30) Object local30 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local30;
		@Pc(50) int local50 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg2; local52 < arg1; local52++) {
			if ((long) (local52 & local50) + local16 > arg3[local52]) {
				@Pc(73) long local73 = arg3[local52];
				arg3[local52] = arg3[local12];
				arg3[local12] = local73;
				@Pc(87) Object local87 = arg0[local52];
				arg0[local52] = arg0[local12];
				arg0[local12++] = local87;
			}
		}
		arg3[arg1] = arg3[local12];
		arg3[local12] = local16;
		arg0[arg1] = arg0[local12];
		arg0[local12] = local30;
		method3011(arg0, local12 - 1, arg2, arg3);
		method3011(arg0, arg1, local12 + 1, arg3);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	public static void method3012() {
		if (!Static115.method2049()) {
			return;
		}
		if (Static311.aStringArray39 == null) {
			Static325.method4535();
		}
		Static50.anInt6160 = 0;
		Static437.aBoolean476 = true;
		try {
			Static283.aClipboard2 = Static148.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(16) Exception local16) {
		}
	}
}
