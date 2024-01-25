import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!md", name = "C", descriptor = "F")
	public static float aFloat137;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "[I")
	public static int[] anIntArray366 = new int[4];

	@OriginalMember(owner = "client!md", name = "z", descriptor = "I")
	public static int anInt5733 = 0;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V")
	public static void method4844() {
		Static174.aClass12_9.ra(((float) Static479.aClass1_Sub7_Sub1_1.anInt3091 * 0.1F + 0.7F) * Static169.aFloat68);
		Static174.aClass12_9.VA(Static50.anInt1278, Static125.aFloat60, aFloat137, (float) (Static236.anInt4450 << 2), (float) (Static376.anInt6628 << 2), (float) (Static122.anInt2478 << 2));
		Static174.aClass12_9.method6421(Static277.aClass36_1);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4845(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + arg0.charAt(local17) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIII)V")
	public static void method4846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3 - arg2;
		@Pc(14) int local14 = arg0 - arg1;
		if (local9 == 0) {
			if (local14 != 0) {
				Static527.method7213(arg2, arg0, arg1, arg4);
			}
		} else if (local14 == 0) {
			Static319.method4853(arg3, arg1, arg2, arg4);
		} else {
			@Pc(43) int local43 = (local14 << 12) / local9;
			@Pc(52) int local52 = arg1 - (arg2 * local43 >> 12);
			@Pc(68) int local68;
			@Pc(76) int local76;
			if (Static487.anInt8210 > arg2) {
				local68 = Static487.anInt8210;
				local76 = (local43 * Static487.anInt8210 >> 12) + local52;
			} else if (arg2 > Static278.anInt5111) {
				local68 = Static278.anInt5111;
				local76 = local52 + (local43 * Static278.anInt5111 >> 12);
			} else {
				local76 = arg1;
				local68 = arg2;
			}
			@Pc(108) int local108;
			@Pc(106) int local106;
			if (arg3 < Static487.anInt8210) {
				local108 = Static487.anInt8210;
				local106 = local52 + (local43 * Static487.anInt8210 >> 12);
			} else if (Static278.anInt5111 >= arg3) {
				local106 = arg0;
				local108 = arg3;
			} else {
				local106 = local52 + (Static278.anInt5111 * local43 >> 12);
				local108 = Static278.anInt5111;
			}
			if (local76 < Static126.anInt6658) {
				local68 = (Static126.anInt6658 - local52 << 12) / local43;
				local76 = Static126.anInt6658;
			} else if (Static494.anInt8295 < local76) {
				local76 = Static494.anInt8295;
				local68 = (Static494.anInt8295 - local52 << 12) / local43;
			}
			if (local106 < Static126.anInt6658) {
				local108 = (Static126.anInt6658 - local52 << 12) / local43;
				local106 = Static126.anInt6658;
			} else if (Static494.anInt8295 < local106) {
				local108 = (Static494.anInt8295 - local52 << 12) / local43;
				local106 = Static494.anInt8295;
			}
			Static95.method1801(local76, local108, arg4, local106, local68);
		}
	}
}
