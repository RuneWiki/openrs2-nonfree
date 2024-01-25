import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!in", name = "o", descriptor = "I")
	public static int anInt4362;

	@OriginalMember(owner = "client!in", name = "t", descriptor = "I")
	public static int anInt4367;

	@OriginalMember(owner = "client!in", name = "x", descriptor = "I")
	public static final int anInt4371 = 1406;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)I")
	public static int method3659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 13;
		@Pc(35) int local35 = Integer.MAX_VALUE & (local21 * 15731 * local21 + 789221) * local21 + 1376312589;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
	public static void method3660() {
		Static408.aClass9_28 = null;
		Static352.aClass9Array105 = null;
		Static371.aClass9Array110 = null;
		Static494.aClass19_12 = null;
		Static156.aClass9Array47 = null;
		Static423.aClass19_9 = null;
		Static241.aClass9Array72 = null;
		Static272.aClass9Array82 = null;
		Static51.aClass19_4 = null;
		Static543.aClass9Array180 = null;
		Static417.aClass9Array124 = null;
		Static267.aClass9Array79 = null;
		Static605.aClass9Array165 = null;
		Static174.aClass9Array56 = null;
		Static566.aClass9Array152 = null;
		Static441.aClass9Array128 = null;
		Static3.aClass9_9 = null;
		Static418.aClass9Array125 = null;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
	public static void method3661() {
		Static151.aClass10_12.method375();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZII)I")
	public static int method3662(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub6 local14 = Static249.method3626(false, arg0);
		if (local14 == null) {
			return Static646.aClass388_1.method9031(arg0).anInt3128;
		}
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < local14.anIntArray55.length; local34++) {
			if (local14.anIntArray55[local34] == -1) {
				local32++;
			}
		}
		return local32 + Static646.aClass388_1.method9031(arg0).anInt3128 - local14.anIntArray55.length;
	}
}
