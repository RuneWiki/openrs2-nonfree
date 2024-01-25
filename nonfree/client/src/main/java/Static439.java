import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray47;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "Z")
	public static boolean aBoolean490;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_115 = new Class25(47, 2);

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_132 = new Class186(86, -2);

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Lclient!ft;")
	public static final Class88 aClass88_46 = new Class88();

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_133 = new Class186(71, 14);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!gr;III)V")
	public static void method5908(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub14 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt2361 == -1 && arg1.anIntArray240 == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		@Pc(28) int local28 = Static8.aClass173_Sub1_1.anInt4411 * arg1.anInt2373 >> 8;
		if (arg1.anInt2368 < arg3) {
			local20 = arg3 - arg1.anInt2368;
		} else if (arg1.anInt2370 > arg3) {
			local20 = arg1.anInt2370 - arg3;
		}
		if (arg0 > arg1.anInt2363) {
			local20 += arg0 - arg1.anInt2363;
		} else if (arg1.anInt2369 > arg0) {
			local20 += arg1.anInt2369 - arg0;
		}
		if (arg1.anInt2360 == 0 || local20 - 64 > arg1.anInt2360 || Static8.aClass173_Sub1_1.anInt4411 == 0 || arg1.anInt2366 != arg4) {
			if (arg1.aClass6_Sub5_Sub4_1 != null) {
				Static371.aClass6_Sub5_Sub2_2.method2168(arg1.aClass6_Sub5_Sub4_1);
				arg1.aClass6_Sub5_Sub4_1 = null;
			}
			if (arg1.aClass6_Sub5_Sub4_2 != null) {
				Static371.aClass6_Sub5_Sub2_2.method2168(arg1.aClass6_Sub5_Sub4_2);
				arg1.aClass6_Sub5_Sub4_2 = null;
			}
			return;
		}
		local20 -= 64;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(144) int local144 = local28 * (arg1.anInt2360 - local20) / arg1.anInt2360;
		if (arg1.aClass6_Sub5_Sub4_1 != null) {
			arg1.aClass6_Sub5_Sub4_1.method5763(local144);
		} else if (arg1.anInt2361 >= 0) {
			@Pc(162) Class109 local162 = Static456.method2473(Static144.aClass158_30, arg1.anInt2361, 0);
			if (local162 != null) {
				@Pc(169) Class6_Sub4_Sub1 local169 = local162.method2474().method2221(Static379.aClass213_1);
				@Pc(174) Class6_Sub5_Sub4 local174 = Static460.method5761(local169, local144);
				local174.method5745(-1);
				Static371.aClass6_Sub5_Sub2_2.method2166(local174);
				arg1.aClass6_Sub5_Sub4_1 = local174;
			}
		}
		if (arg1.aClass6_Sub5_Sub4_2 != null) {
			arg1.aClass6_Sub5_Sub4_2.method5763(local144);
			if (!arg1.aClass6_Sub5_Sub4_2.method5980()) {
				arg1.aClass6_Sub5_Sub4_2 = null;
			}
		} else if (arg1.anIntArray240 != null && (arg1.anInt2374 -= arg2) <= 0) {
			@Pc(218) int local218 = (int) ((double) arg1.anIntArray240.length * Math.random());
			@Pc(226) Class109 local226 = Static456.method2473(Static144.aClass158_30, arg1.anIntArray240[local218], 0);
			if (local226 != null) {
				@Pc(233) Class6_Sub4_Sub1 local233 = local226.method2474().method2221(Static379.aClass213_1);
				@Pc(238) Class6_Sub5_Sub4 local238 = Static460.method5761(local233, local144);
				local238.method5745(0);
				Static371.aClass6_Sub5_Sub2_2.method2166(local238);
				arg1.anInt2374 = arg1.anInt2364 + (int) (Math.random() * (double) (arg1.anInt2371 - arg1.anInt2364));
				arg1.aClass6_Sub5_Sub4_2 = local238;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIII)Lclient!lf;")
	public static Class133 method5909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg0 * 76724863L ^ (long) arg5 * 475427L ^ (long) arg4 * 97549L ^ (long) arg3 * 67481L ^ (long) arg2 * 986053L ^ (long) arg1 * 32147369L;
		@Pc(44) Class133 local44 = (Class133) Static435.aClass220_58.method4990(local33);
		if (local44 == null) {
			local44 = Static307.aClass28_42.method3486(arg3, arg4, arg5, arg2, arg1, arg0);
			Static435.aClass220_58.method4996(local44, local33);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)I")
	public static int method5910() {
		@Pc(10) Class220 local10 = Static135.aClass220_16;
		synchronized (Static135.aClass220_16) {
			return Static135.aClass220_16.method5000();
		}
	}
}
