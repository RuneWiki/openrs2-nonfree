import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static377 {

	@OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
	public static int anInt7134;

	@OriginalMember(owner = "client!nj", name = "K", descriptor = "[[S")
	private static final short[][] aShortArrayArray17 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!nj", name = "J", descriptor = "[[S")
	private static final short[][] aShortArrayArray16 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "[[S")
	private static final short[][] aShortArrayArray15 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!nj", name = "E", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray4 = new short[][][] { aShortArrayArray17, aShortArrayArray16, aShortArrayArray15 };

	@OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
	public static int anInt7132 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIZIII)V")
	public static void method5988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static267.anInt5781 = arg3;
		Static258.anInt5690 = arg2;
		Static138.anInt3526 = arg4;
		Static263.anInt5756 = arg0;
		Static528.anInt4820 = arg1;
		Static622.anInt9510 = arg5;
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(B)V")
	public static void method5989() {
		Static261.aClass112_32.method3638();
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(III)Z")
	public static boolean method5990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static487.method7149(arg0, arg1) | (arg1 & 0x70000) != 0 || Static631.method8541(arg1, arg0);
	}
}
