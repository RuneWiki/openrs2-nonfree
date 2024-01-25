import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
	public static int anInt3942;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "S")
	public static short aShort55 = 256;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
	public static int anInt3941 = 0;

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "Z")
	public static boolean aBoolean326 = true;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "[I")
	public static final int[] anIntArray327 = new int[4];

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	public static void method3566() {
		Static449.aBoolean627 = false;
		Static101.method1476();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Lclient!ih;")
	public static Class156 method3567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static535.aClass156ArrayArrayArray2[0][arg1][arg2] != null && Static535.aClass156ArrayArrayArray2[0][arg1][arg2].aClass156_1 != null;
			if (local28 && arg0 >= Static36.anInt662 - 1) {
				return null;
			}
			Static590.method8295(arg0, arg1, arg2);
		}
		return Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V")
	public static void method3569() {
		if (Static504.anInt8544 < 0) {
			Static486.anInt8186 = -1;
			Static100.anInt1573 = -1;
			Static504.anInt8544 = 0;
		}
		if (Static504.anInt8544 > Static203.anInt134) {
			Static100.anInt1573 = -1;
			Static486.anInt8186 = -1;
			Static504.anInt8544 = Static203.anInt134;
		}
		if (Static449.anInt7564 < 0) {
			Static486.anInt8186 = -1;
			Static449.anInt7564 = 0;
			Static100.anInt1573 = -1;
		}
		if (Static203.anInt130 < Static449.anInt7564) {
			Static100.anInt1573 = -1;
			Static486.anInt8186 = -1;
			Static449.anInt7564 = Static203.anInt130;
		}
	}
}
