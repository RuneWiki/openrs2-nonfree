import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!je", name = "r", descriptor = "[S")
	private static final short[] aShortArray67 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!je", name = "B", descriptor = "[S")
	private static final short[] aShortArray69 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!je", name = "y", descriptor = "[S")
	private static final short[] aShortArray68 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!je", name = "v", descriptor = "[[S")
	public static final short[][] aShortArrayArray15 = new short[][] { aShortArray69, aShortArray67, aShortArray68 };

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)I")
	public static int method4629() {
		return Static552.anInt9486 == 1 ? Static84.anInt2618 : Static287.anInt5975;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Z")
	public static boolean method4631() {
		try {
			if (Static453.anInt8163 == 2) {
				if (Static152.aClass6_Sub12_1 == null) {
					Static152.aClass6_Sub12_1 = Static647.method2002(Static473.aClass223_111, Static224.anInt5036, Static309.anInt6223);
					if (Static152.aClass6_Sub12_1 == null) {
						return false;
					}
				}
				if (Static370.aClass315_1 == null) {
					Static370.aClass315_1 = new Class315(Static167.aClass223_45, Static426.aClass223_95);
				}
				@Pc(36) Class6_Sub4_Sub2 local36 = Static623.aClass6_Sub4_Sub2_4;
				if (Static214.aClass6_Sub4_Sub2_2 != null) {
					local36 = Static214.aClass6_Sub4_Sub2_2;
				}
				if (local36.method4793(Static152.aClass6_Sub12_1, Static370.aClass315_1, Static12.aClass223_4)) {
					Static623.aClass6_Sub4_Sub2_4 = local36;
					Static623.aClass6_Sub4_Sub2_4.method4799();
					@Pc(63) int local63;
					if (Static47.anInt1661 <= 0) {
						Static453.anInt8163 = 0;
						Static623.aClass6_Sub4_Sub2_4.method4807(Static619.anInt7284);
						for (local63 = 0; local63 < Static394.anIntArray369.length; local63++) {
							Static623.aClass6_Sub4_Sub2_4.method4804(local63, Static394.anIntArray369[local63]);
							Static394.anIntArray369[local63] = 255;
						}
					} else {
						Static453.anInt8163 = 3;
						Static623.aClass6_Sub4_Sub2_4.method4807(Static619.anInt7284 < Static47.anInt1661 ? Static619.anInt7284 : Static47.anInt1661);
						for (local63 = 0; local63 < Static394.anIntArray369.length; local63++) {
							Static623.aClass6_Sub4_Sub2_4.method4804(local63, Static394.anIntArray369[local63]);
							Static394.anIntArray369[local63] = 255;
						}
					}
					if (Static214.aClass6_Sub4_Sub2_2 == null) {
						if (Static257.aLong150 > 0L) {
							Static623.aClass6_Sub4_Sub2_4.method4782(Static3.aBoolean7, Static152.aClass6_Sub12_1, Static257.aLong150);
						} else {
							Static623.aClass6_Sub4_Sub2_4.method4773(Static3.aBoolean7, Static152.aClass6_Sub12_1);
						}
					}
					if (Static474.aClass114_3 != null) {
						Static474.aClass114_3.method4225(Static623.aClass6_Sub4_Sub2_4);
					}
					Static473.aClass223_111 = null;
					Static370.aClass315_1 = null;
					Static152.aClass6_Sub12_1 = null;
					Static257.aLong150 = 0L;
					Static214.aClass6_Sub4_Sub2_2 = null;
					return true;
				}
			}
		} catch (@Pc(161) Exception local161) {
			local161.printStackTrace();
			Static623.aClass6_Sub4_Sub2_4.method4805();
			Static473.aClass223_111 = null;
			Static370.aClass315_1 = null;
			Static453.anInt8163 = 0;
			Static152.aClass6_Sub12_1 = null;
			Static214.aClass6_Sub4_Sub2_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z")
	public static boolean method4632(@OriginalArg(0) int arg0) {
		return arg0 == 49 || arg0 == 59 || arg0 == 1006 || arg0 == 21 || arg0 == 9;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBIII)I")
	public static int method4633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23 = 65536 - Class78_Sub2_Sub2.anIntArray271[arg2 * 8192 / arg0] >> 1;
		return (local23 * arg3 >> 16) + (arg1 * (65536 - local23) >> 16);
	}
}
