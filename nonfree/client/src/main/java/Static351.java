import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
	public static int anInt6507;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString258 = "Connected to update server";

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "[S")
	public static final short[] aShortArray113 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	public static int anInt6505 = 0;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	public static int anInt6506 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public static void method5672() {
		Static161.method3069();
		Static99.aClass113_2 = null;
		Static56.aClass113_1 = null;
		Static152.aClass186ArrayArray1 = null;
		Static261.aClass113_3 = null;
		Static176.aClass2_9 = null;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIII)V")
	public static void method5673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 > Static291.anInt5657 || Static49.anInt1124 > arg1) {
			return;
		}
		@Pc(28) boolean local28;
		if (arg0 < Static106.anInt2157) {
			local28 = false;
			arg0 = Static106.anInt2157;
		} else if (arg0 > Static251.anInt6512) {
			arg0 = Static251.anInt6512;
			local28 = false;
		} else {
			local28 = true;
		}
		@Pc(48) boolean local48;
		if (arg2 < Static106.anInt2157) {
			local48 = false;
			arg2 = Static106.anInt2157;
		} else if (arg2 > Static251.anInt6512) {
			arg2 = Static251.anInt6512;
			local48 = false;
		} else {
			local48 = true;
		}
		if (Static49.anInt1124 <= arg3) {
			Static97.method1784(arg0, Static327.anIntArrayArray63[arg3++], arg4, arg2);
		} else {
			arg3 = Static49.anInt1124;
		}
		if (arg1 <= Static291.anInt5657) {
			Static97.method1784(arg0, Static327.anIntArrayArray63[arg1--], arg4, arg2);
		} else {
			arg1 = Static291.anInt5657;
		}
		@Pc(117) int local117;
		if (local28 && local48) {
			for (local117 = arg3; local117 <= arg1; local117++) {
				@Pc(157) int[] local157 = Static327.anIntArrayArray63[local117];
				local157[arg0] = local157[arg2] = arg4;
			}
		} else if (local28) {
			for (local117 = arg3; local117 <= arg1; local117++) {
				Static327.anIntArrayArray63[local117][arg0] = arg4;
			}
		} else if (local48) {
			for (local117 = arg3; local117 <= arg1; local117++) {
				Static327.anIntArrayArray63[local117][arg2] = arg4;
			}
			return;
		}
	}
}
