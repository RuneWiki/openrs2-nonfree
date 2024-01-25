import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "Lclient!lf;")
	public static final Class221 aClass221_1 = new Class221(14, 16);

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "[I")
	public static final int[] anIntArray8 = new int[4];

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "[[S")
	private static final short[][] aShortArrayArray1 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "[[S")
	private static final short[][] aShortArrayArray2 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "[[S")
	private static final short[][] aShortArrayArray3 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray1 = new short[][][] { aShortArrayArray2, aShortArrayArray1, aShortArrayArray3 };

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
	public static int anInt136 = 100;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)I")
	public static int method111(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!jka;B)V")
	public static void method113(@OriginalArg(0) Class6_Sub2_Sub11 arg0) {
		if (arg0 == null) {
			return;
		}
		Static116.aClass340_17.method8131(arg0);
		Static539.anInt8776++;
		@Pc(42) Class6_Sub2_Sub2 local42;
		if (arg0.aBoolean392 || "".equals(arg0.aString55)) {
			local42 = new Class6_Sub2_Sub2(arg0.aString55);
			Static574.anInt9192++;
		} else {
			@Pc(50) long local50 = arg0.aLong170;
			for (local42 = (Class6_Sub2_Sub2) Static548.aClass74_63.method1401(local50); local42 != null && !local42.aString10.equals(arg0.aString55); local42 = (Class6_Sub2_Sub2) Static548.aClass74_63.method1407()) {
			}
			if (local42 == null) {
				local42 = (Class6_Sub2_Sub2) Static519.aClass359_58.method8517(local50);
				if (local42 != null && !local42.aString10.equals(arg0.aString55)) {
					local42 = null;
				}
				if (local42 == null) {
					local42 = new Class6_Sub2_Sub2(arg0.aString55);
				}
				Static548.aClass74_63.method1399(local42, local50);
				Static574.anInt9192++;
			}
		}
		if (local42.method612(arg0)) {
			Static101.method1968(local42);
		}
	}
}
