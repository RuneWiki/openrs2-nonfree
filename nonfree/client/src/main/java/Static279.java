import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
	public static int anInt5189;

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "Lclient!qe;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
	public static int anInt5195;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "Lclient!g;")
	public static Class83 aClass83_95;

	@OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
	public static int anInt5198;

	@OriginalMember(owner = "client!qb", name = "Q", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_76 = new Class183(23, 8);

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
	public static int anInt5197 = 0;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
	public static int method4638(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!vt;)Lclient!gd;")
	public static Class43_Sub4 method4640(@OriginalArg(1) Class2_Sub24 arg0) {
		return new Class43_Sub4(arg0.method5743(), arg0.method5743(), arg0.method5743(), arg0.method5743(), arg0.method5743(), arg0.method5743(), arg0.method5743(), arg0.method5743(), arg0.method5736(), arg0.method5732());
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!oj;BJ)V")
	public static void method4641(@OriginalArg(0) Class48 arg0, @OriginalArg(2) long arg1) {
		Static334.anInt6174 = 0;
		Static260.anInt4976 = Static300.anInt5587;
		Static300.anInt5587 = 0;
		@Pc(22) long local22 = Static101.method1805();
		for (@Pc(27) Class7_Sub3 local27 = (Class7_Sub3) Static228.aClass199_4.method4896(); local27 != null; local27 = (Class7_Sub3) Static228.aClass199_4.method4902()) {
			if (local27.method520(arg0, arg1)) {
				Static334.anInt6174++;
			}
		}
		if (Static202.aBoolean307 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static228.aClass199_4.method4899() + ", running: " + Static334.anInt6174 + ". Particles: " + Static300.anInt5587 + ". Time taken: " + (Static101.method1805() - local22) + "ms");
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(III)I")
	public static int method4642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}
}
