import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static605 {

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "[[S")
	private static final short[][] aShortArrayArray16 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "[[S")
	private static final short[][] aShortArrayArray17 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "[[S")
	public static final short[][] aShortArrayArray18 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray4 = new short[][][] { aShortArrayArray16, aShortArrayArray17, aShortArrayArray18 };

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "Lclient!ef;")
	public static Class102 aClass102_70 = new Class102();

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!ffa;IIIIB)Lclient!gda;")
	public static Class32_Sub1_Sub1 method8677(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0.aBoolean228 || Static45.method8836(arg3) && Static45.method8836(arg2)) {
			return new Class32_Sub1_Sub1(arg0, 3553, arg4, arg1, arg3, arg2, true);
		} else if (arg0.aBoolean231) {
			return new Class32_Sub1_Sub1(arg0, 34037, arg4, arg1, arg3, arg2, true);
		} else {
			return new Class32_Sub1_Sub1(arg0, arg4, arg1, arg3, arg2, Static94.method1393(arg3), Static94.method1393(arg2), true);
		}
	}
}
