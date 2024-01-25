import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!maa", name = "f", descriptor = "[[S")
	private static final short[][] aShortArrayArray20 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!maa", name = "g", descriptor = "[[S")
	private static final short[][] aShortArrayArray21 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "[[S")
	private static final short[][] aShortArrayArray22 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray6 = new short[][][] { aShortArrayArray20, aShortArrayArray21, aShortArrayArray22 };

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_116 = new Class73(109, 11);

	@OriginalMember(owner = "client!maa", name = "l", descriptor = "J")
	public static long aLong184 = 0L;

	@OriginalMember(owner = "client!maa", name = "m", descriptor = "F")
	public static float aFloat133 = 0.0F;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLclient!rl;)Z")
	public static boolean method5608(@OriginalArg(1) Interface22 arg0) {
		@Pc(10) Class356 local10 = Static249.aClass310_1.method7474(arg0.method8436());
		if (local10.anInt10249 == -1) {
			return true;
		} else {
			@Pc(23) Class17 local23 = Static386.aClass341_2.method7998(local10.anInt10249);
			return local23.anInt639 == -1 ? true : local23.method606();
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIIILclient!eda;)V")
	public static void method5609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub17 arg3) {
		arg3.aClass6_Sub8_Sub1_2.method8202(arg1);
		arg3.aClass6_Sub8_Sub1_2.method8255(arg0);
		arg3.aClass6_Sub8_Sub1_2.method8241(arg2);
	}
}
