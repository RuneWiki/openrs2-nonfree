import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "Lclient!ps;")
	public static Class252 aClass252_6;

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "F")
	public static float aFloat175;

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "[I")
	public static int[] anIntArray634;

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
	public static int anInt8191;

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_112 = new Class160(49, 4);

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "J")
	public static long aLong209 = 0L;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "([J[IB)V")
	public static void method6761(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static297.method4139(arg0, arg1, arg0.length - 1, 0);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIB)V")
	public static void method6762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg2 - arg1;
		@Pc(14) int local14 = arg3 - arg0;
		if (local9 == 0) {
			if (local14 != 0) {
				Static255.method3609(arg3, arg0, arg1, arg4);
			}
		} else if (local14 == 0) {
			Static134.method1998(arg4, arg2, arg1, arg0);
		} else {
			@Pc(43) int local43 = (local14 << 12) / local9;
			@Pc(52) int local52 = arg0 - (arg1 * local43 >> 12);
			@Pc(69) int local69;
			@Pc(67) int local67;
			if (arg2 < Static235.anInt3970) {
				local67 = (Static235.anInt3970 * local43 >> 12) + local52;
				local69 = Static235.anInt3970;
			} else if (Static151.anInt2683 < arg2) {
				local69 = Static151.anInt2683;
				local67 = local52 + (Static151.anInt2683 * local43 >> 12);
			} else {
				local69 = arg2;
				local67 = arg3;
			}
			@Pc(110) int local110;
			@Pc(108) int local108;
			if (arg1 < Static235.anInt3970) {
				local108 = local52 + (Static235.anInt3970 * local43 >> 12);
				local110 = Static235.anInt3970;
			} else if (Static151.anInt2683 >= arg1) {
				local110 = arg1;
				local108 = arg0;
			} else {
				local108 = (Static151.anInt2683 * local43 >> 12) + local52;
				local110 = Static151.anInt2683;
			}
			if (Static134.anInt2364 > local67) {
				local69 = (Static134.anInt2364 - local52 << 12) / local43;
				local67 = Static134.anInt2364;
			} else if (Static60.anInt971 < local67) {
				local69 = (Static60.anInt971 - local52 << 12) / local43;
				local67 = Static60.anInt971;
			}
			if (local108 < Static134.anInt2364) {
				local110 = (Static134.anInt2364 - local52 << 12) / local43;
				local108 = Static134.anInt2364;
			} else if (local108 > Static60.anInt971) {
				local110 = (Static60.anInt971 - local52 << 12) / local43;
				local108 = Static60.anInt971;
			}
			Static283.method2973(local67, local69, arg4, local108, local110);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public static void method6763(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub1_Sub5 local8 = Static77.method1176(arg0, 14);
		local8.method770();
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
	public static void method6766() {
		Static218.aClass6_Sub14_Sub2_1.anInt7244 = 0;
		Static105.anInt1967 = 0;
		Static418.anInt7398 = 0;
		Static420.aClass6_Sub14_Sub2_2.anInt7244 = 0;
		Static218.aClass40_86 = null;
		Static244.aClass40_99 = null;
		Static163.aClass40_71 = null;
		Static142.aClass40_65 = null;
		Static567.anInt9502 = 0;
		Static322.method4982();
		Static88.method1429();
		for (@Pc(35) int local35 = 0; local35 < 2048; local35++) {
			Static346.aClass29_Sub2_Sub1_Sub2Array1[local35] = null;
		}
		Static426.aClass29_Sub2_Sub1_Sub2_2 = null;
		for (@Pc(51) int local51 = 0; local51 < Static505.anInt8419; local51++) {
			@Pc(58) Class29_Sub2_Sub1_Sub1 local58 = Static354.aClass6_Sub28Array1[local51].aClass29_Sub2_Sub1_Sub1_2;
			if (local58 != null) {
				local58.anInt8513 = -1;
			}
		}
		Static397.method267();
		Static354.anInt6233 = 1;
		Static99.method1593(10);
		for (@Pc(76) int local76 = 0; local76 < 100; local76++) {
			Static258.aBooleanArray27[local76] = true;
		}
		Static507.method6978();
		Static404.aLong185 = 0L;
		Static154.aClass6_Sub15_2 = null;
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)Ljava/lang/String;")
	public static String method6767() {
		return Static330.aBoolean415 || Static185.aClass6_Sub48_1 == null ? "" : Static185.aClass6_Sub48_1.aString103;
	}
}
