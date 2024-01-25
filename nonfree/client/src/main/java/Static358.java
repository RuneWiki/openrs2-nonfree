import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_92 = new Class376(53, 3);

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "[[S")
	private static final short[][] aShortArrayArray12 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "[[S")
	private static final short[][] aShortArrayArray13 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "[[S")
	private static final short[][] aShortArrayArray14 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray1 = new short[][][] { aShortArrayArray13, aShortArrayArray14, aShortArrayArray12 };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method5375(@OriginalArg(0) Class16 arg0) {
		if (Static463.aBoolean600) {
			Static367.method5449(arg0);
		} else {
			Static296.method6902(arg0);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZII)Lclient!gj;")
	public static Class143 method5377(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class313 local10 = null;
		if (Static670.aClass251_170 != null) {
			local10 = new Class313(arg0, Static670.aClass251_170, Static19.aClass251Array1[arg0], 1000000);
		}
		Static601.aClass89_Sub1Array2[arg0] = Static448.aClass317_1.method7436(arg0, Static584.aClass313_4, local10);
		Static601.aClass89_Sub1Array2[arg0].method2155();
		return new Class143(Static601.aClass89_Sub1Array2[arg0], arg1, arg2);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IF)F")
	public static float method5378(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}
}
