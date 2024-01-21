import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!od", name = "L", descriptor = "Lclient!eh;")
	private static Class28 aClass28_927 = Static170.method3101("wave2:");

	@OriginalMember(owner = "client!od", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_925 = aClass28_927;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!od", name = "x", descriptor = "Lclient!eh;")
	public static Class28 aClass28_926 = Static170.method3101("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!od", name = "C", descriptor = "[I")
	public static int[] anIntArray502 = new int[32];

	@OriginalMember(owner = "client!od", name = "P", descriptor = "I")
	public static int anInt2869 = 0;

	@OriginalMember(owner = "client!od", name = "T", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "Lclient!eh;")
	public static Class28 aClass28_928 = aClass28_927;

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "[I")
	public static int[] anIntArray503 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIBLclient!gf;)V")
	public static void method2248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		if (Static22.aClass33_2 != null || Static69.aBoolean112 || (arg2 == null || Static76.method1733(arg2) == null)) {
			return;
		}
		Static22.aClass33_2 = arg2;
		Static54.aClass33_8 = Static76.method1733(arg2);
		Static122.anInt3147 = arg0;
		Static155.anInt3860 = arg1;
		Static58.aBoolean106 = false;
		Static167.anInt4075 = 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIZ)I")
	public static int method2249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!hd;I)Lclient!lf;")
	public static Class3_Sub1 method2251(@OriginalArg(0) Class3_Sub8 arg0) {
		@Pc(9) int local9 = arg0.method1545();
		@Pc(13) int local13 = arg0.method1545();
		@Pc(17) Class local17 = Static54.method1222(local13);
		try {
			@Pc(21) Class3_Sub1 local21 = (Class3_Sub1) local17.getDeclaredConstructor().newInstance();
			if (local21 != null) {
				local21.anInt4122 = local9;
				local21.anInt4128 = arg0.method1545();
				@Pc(35) int local35 = arg0.method1545();
				for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
					@Pc(43) int local43 = arg0.method1545();
					local21.method3118(local43, arg0);
				}
			}
			local21.method3131();
			return local21;
		} catch (@Pc(67) IllegalAccessException local67) {
			throw new RuntimeException();
		} catch (@Pc(72) InstantiationException local72) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	public static void method2252() {
		for (@Pc(8) Class3_Sub25 local8 = (Class3_Sub25) Static24.aClass23_3.method858(); local8 != null; local8 = (Class3_Sub25) Static24.aClass23_3.method861()) {
			if (local8.anInt4182 == -1) {
				local8.anInt4179 = 0;
				Static12.method475(local8);
			} else {
				local8.method3167();
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	public static void method2253() {
		aClass28_927 = null;
		anIntArray503 = null;
		aClass28_925 = null;
		anIntArray502 = null;
		anIntArrayArray24 = null;
		aClass28_926 = null;
		aClass28_928 = null;
	}
}
