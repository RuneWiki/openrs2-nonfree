import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "[Lclient!lf;")
	public static Class90[] aClass90Array9;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!aa;I)V")
	public static void method3160(@OriginalArg(0) Class2 arg0) {
		arg0.method3250(0, 0, Static11.anInt5389, 350);
		arg0.method3300(0, 0, Static11.anInt5389, 350, Static29.anInt762 << 24 | 0x332277, 1);
		@Pc(36) int local36;
		@Pc(40) int local40;
		for (@Pc(30) int local30 = 0; local30 < 100; local30++) {
			local36 = Static177.anIntArray430[local30];
			local40 = Static79.anIntArray426[local30];
			arg0.method3300(local36, local40, 2, 2, Static152.anIntArray351[local30] << 24 | 0xFFFFFF, 1);
		}
		local36 = 350 / Static259.anInt5031;
		if (Static107.anInt2184 > 0) {
			local40 = 346 - Static259.anInt5031 - 4;
			@Pc(86) int local86 = local40 * local36 / (local36 + Static107.anInt2184 - 1);
			@Pc(88) int local88 = 4;
			if (Static107.anInt2184 > 1) {
				local88 = (local40 - local86) * (Static107.anInt2184 + (-1 - Static214.anInt4240)) / (Static107.anInt2184 - 1) + 4;
			}
			arg0.method3300(Static11.anInt5389 - 16, local88, 12, local86, Static29.anInt762 << 24 | 0x332277, 2);
			for (@Pc(126) int local126 = Static214.anInt4240; local126 < Static214.anInt4240 + local36 && local126 < Static107.anInt2184; local126++) {
				@Pc(135) String[] local135 = Static62.method1317(Static204.aStringArray29[local126], '\b');
				@Pc(144) int local144 = (Static11.anInt5389 - 16 - 8) / local135.length;
				for (@Pc(146) int local146 = 0; local146 < local135.length; local146++) {
					@Pc(154) int local154 = local146 * local144 + 8;
					arg0.method3250(local154, 0, local154 + local144 - 8, 350);
					Static9.aClass13_1.method4456(-1, 350 - Static259.anInt5031 * (local126 - Static214.anInt4240) - Static9.anInt219 - Static273.aClass38_8.anInt1355 - 2, -16777216, local135[local146], local154);
				}
			}
		}
		arg0.method3250(0, 0, Static11.anInt5389, 350);
		arg0.method3254(-1, 350 - Static9.anInt219, 0, Static11.anInt5389);
		Static302.aClass13_7.method4456(-1, 349 - Static180.aClass38_5.anInt1355, -16777216, "--> " + Static29.aString22, 10);
		local40 = -1;
		if (Static215.anInt4246 % 30 > 15) {
			local40 = 16777215;
		}
		arg0.method3335(Static180.aClass38_5.method1316("--> " + Static29.aString22.substring(0, Static157.anInt3135)) + 10, 12, 350 - Static180.aClass38_5.anInt1355 - 11, local40);
	}
}
