import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
	public static int[] anIntArray5;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "[Lclient!f;")
	public static Class80[] aClass80Array1;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "[Lclient!vq;")
	public static Class196_Sub1[] aClass196_Sub1Array1;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_1 = new Class146(7, 16);

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "J")
	public static long aLong4 = 0L;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "[I")
	public static final int[] anIntArray4 = new int[100];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Z")
	public static boolean method162() {
		if (Static45.aBoolean36) {
			try {
				if ((Boolean) Static456.method694(Static119.aClass138_7.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method164(@OriginalArg(0) Class109 arg0) {
		arg0.pa(0, 0, Static207.anInt3842, 350);
		arg0.NA(0, 0, Static207.anInt3842, 350, Static415.anInt7240 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static397.anInt6904;
		@Pc(36) int local36;
		if (Static241.anInt4308 > 0) {
			local36 = 346 - Static397.anInt6904 - 4;
			@Pc(46) int local46 = local36 * local27 / (Static241.anInt4308 + local27 - 1);
			@Pc(48) int local48 = 4;
			if (Static241.anInt4308 > 1) {
				local48 = (local36 - local46) * ((Static241.anInt4308 - Static381.anInt5293) + -1) / (Static241.anInt4308 - 1) + 4;
			}
			arg0.NA(Static207.anInt3842 - 16, local48, 12, local46, Static415.anInt7240 << 24 | 0x332277, 2);
			for (@Pc(84) int local84 = Static381.anInt5293; local84 < Static381.anInt5293 + local27 && local84 < Static241.anInt4308; local84++) {
				@Pc(93) String[] local93 = Static326.method4592(Static35.aStringArray21[local84], '\b');
				@Pc(102) int local102 = (Static207.anInt3842 - 8 - 16) / local93.length;
				for (@Pc(104) int local104 = 0; local104 < local93.length; local104++) {
					@Pc(112) int local112 = local102 * local104 + 8;
					arg0.pa(local112, 0, local102 + local112 - 8, 350);
					Static372.aClass129_6.method5825(local93[local104], -1, local112, -16777216, 348 - (local84 - Static381.anInt5293) * Static397.anInt6904 - Static98.aClass101_2.anInt2376 - Static416.anInt7247);
				}
			}
		}
		arg0.pa(0, 0, Static207.anInt3842, 350);
		arg0.method4689(350 - Static416.anInt7247, -1, 0, Static207.anInt3842);
		Static139.aClass129_1.method5825("--> " + Static295.aString39, -1, 10, -16777216, 350 - Static167.aClass101_3.anInt2376 - 1);
		local36 = -1;
		if (Static403.anInt6978 % 30 > 15) {
			local36 = 16777215;
		}
		arg0.method4720(350 - Static167.aClass101_3.anInt2376 - 11, 12, local36, Static167.aClass101_3.method1963("--> " + Static295.aString39.substring(0, Static27.anInt561)) + 10);
	}
}
