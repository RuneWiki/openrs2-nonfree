import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Lclient!rv;")
	public static Class212 aClass212_6;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "[[Lclient!jb;")
	public static Class126[][] aClass126ArrayArray4;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "[I")
	public static int[] anIntArray647;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "[I")
	public static final int[] anIntArray646 = new int[25];

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "Z")
	public static volatile boolean aBoolean488 = true;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_265 = new Class186(45, -2);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIJI)V")
	public static void method5670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(24) int local24 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static14.method4213(local10, local17, 0, true, 0, 0, arg1, arg0);
			return;
		}
		@Pc(44) Class71 local44 = Static2.aClass74_13.method1683(local24);
		@Pc(60) int local60;
		@Pc(57) int local57;
		if (local17 == 0 || local17 == 2) {
			local60 = local44.anInt2169;
			local57 = local44.anInt2198;
		} else {
			local57 = local44.anInt2169;
			local60 = local44.anInt2198;
		}
		@Pc(71) int local71 = local44.anInt2167;
		if (local17 != 0) {
			local71 = (local71 << local17 & 0xF) + (local71 >> 4 - local17);
		}
		Static14.method4213(0, 0, local71, true, local57, local60, arg1, arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
	public static void method5672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static40.aClass53ArrayArrayArray2[0][arg1][arg2] != null && Static40.aClass53ArrayArrayArray2[0][arg1][arg2].aClass53_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static40.aClass53ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class53 local46 = Static40.aClass53ArrayArrayArray2[local22][arg1][arg2] = new Class53(local22, arg1, arg2);
				if (local20) {
					local46.aByte37++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
	public static void method5673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static266.aClass215_8.method4976(Static379.aClass242_95.method5320(Static139.anInt2670));
		@Pc(28) int local28;
		for (@Pc(22) Class4_Sub21 local22 = (Class4_Sub21) Static126.aClass258_19.method5538(); local22 != null; local22 = (Class4_Sub21) Static126.aClass258_19.method5528()) {
			local28 = Static68.method3473(local22);
			if (local28 > local13) {
				local13 = local28;
			}
		}
		local13 += 8;
		local28 = Static83.anInt1893 * 16 + 21;
		@Pc(54) int local54 = arg1 - local13 / 2;
		if (Static87.anInt1948 < local13 + local54) {
			local54 = Static87.anInt1948 - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(77) int local77 = arg0;
		if (local28 + arg0 > Static349.anInt6303) {
			local77 = Static349.anInt6303 - local28;
		}
		if (local77 < 0) {
			local77 = 0;
		}
		Static104.anInt2229 = local54;
		Static171.anInt3173 = local77;
		Static434.anInt7227 = Static83.anInt1893 * 16 + (Static60.aBoolean103 ? 26 : 22);
		Static346.aBoolean427 = true;
		Static346.anInt6292 = local13;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[Ljava/lang/Object;[I)V")
	public static void method5677(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static372.method5825(arg0, 0, arg1, arg1.length - 1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IF)F")
	public static float method5681(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}
}
