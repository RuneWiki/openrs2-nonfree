import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
	public static int anInt4697;

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "Lclient!is;")
	public static Interface14 anInterface14_1;

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "[I")
	public static int[] anIntArray239;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "Z")
	public static boolean aBoolean348 = false;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_93 = new Class215(4, 1);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = local7 * (Static80.aShort10 - Static431.aShort99) / 100 + Static431.aShort99;
		@Pc(37) int local37 = arg6 * local31 >> 8;
		Static380.anInt7419 = Static380.anInt7422 * local31 >> 8;
		@Pc(49) int local49 = 16384 - arg0 & 0x3FFF;
		@Pc(55) int local55 = 16384 - arg2 & 0x3FFF;
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = 0;
		@Pc(66) int local66 = local37;
		if (local49 != 0) {
			local64 = -local37 * Class177.anIntArray361[local49] >> 14;
			local66 = Class177.anIntArray360[local49] * local37 >> 14;
		}
		if (local55 != 0) {
			local62 = Class177.anIntArray361[local55] * local66 >> 14;
			local66 = local66 * Class177.anIntArray360[local55] >> 14;
		}
		Static189.anInt11070 = arg2;
		Static113.anInt3037 = 0;
		Static621.anInt10870 = arg3 - local66;
		Static639.anInt11034 = arg1 - local64;
		Static135.anInt3347 = arg5 - local62;
		Static266.anInt5673 = arg0;
	}
}
