import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "F")
	public static float aFloat111;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!sn;")
	public static final Class308 aClass308_6 = new Class308();

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
	public static final int[] anIntArray287 = new int[1];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!wr;IIB)Z")
	public static boolean method3503(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static417.aBoolean571 || !Static253.aBoolean399) {
			return false;
		} else if (Static141.anInt3106 < 100) {
			return false;
		} else if (Static182.method3302(arg3, arg0, arg2)) {
			@Pc(28) int local28 = arg2 << Static415.anInt7579;
			@Pc(32) int local32 = arg0 << Static415.anInt7579;
			@Pc(44) int local44 = Static331.aClass112Array3[arg3].method7819(arg0, arg2) - 1;
			@Pc(50) int local50 = local44 + arg1.method8315();
			if (arg1.aShort102 == 1) {
				if (!Static99.method1690(local32, Static312.anInt5690 + local32, local28, local50, local32, local50, local28, local28, local44)) {
					return false;
				} else if (Static99.method1690(local32 + Static312.anInt5690, Static312.anInt5690 + local32, local28, local44, local32, local50, local28, local28, local44)) {
					Static120.anInt5454++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort102 == 2) {
				if (!Static99.method1690(local32 + Static312.anInt5690, local32 + Static312.anInt5690, local28 + Static312.anInt5690, local50, Static312.anInt5690 + local32, local50, local28, local28, local44)) {
					return false;
				} else if (Static99.method1690(Static312.anInt5690 + local32, local32 + Static312.anInt5690, local28 + Static312.anInt5690, local50, Static312.anInt5690 + local32, local44, local28 + Static312.anInt5690, local28, local44)) {
					Static120.anInt5454++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort102 == 4) {
				if (!Static99.method1690(local32, local32 + Static312.anInt5690, local28 - -Static312.anInt5690, local50, local32, local50, Static312.anInt5690 + local28, local28 - -Static312.anInt5690, local44)) {
					return false;
				} else if (Static99.method1690(local32 + Static312.anInt5690, local32 + Static312.anInt5690, Static312.anInt5690 + local28, local44, local32, local50, local28 + Static312.anInt5690, Static312.anInt5690 + local28, local44)) {
					Static120.anInt5454++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort102 == 8) {
				if (!Static99.method1690(local32, local32, local28 + Static312.anInt5690, local50, local32, local50, local28, local28, local44)) {
					return false;
				} else if (Static99.method1690(local32, local32, local28 + Static312.anInt5690, local50, local32, local44, local28 + Static312.anInt5690, local28, local44)) {
					Static120.anInt5454++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort102 == 16) {
				if (Static24.method592(Static290.anInt5464, local28, local44, Static290.anInt5464, Static290.anInt5464 + local32, local50)) {
					Static120.anInt5454++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort102 == 32) {
				if (Static24.method592(Static290.anInt5464, local28 + Static290.anInt5464, local44, Static290.anInt5464, Static290.anInt5464 + local32, local50)) {
					Static120.anInt5454++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort102 == 64) {
				if (Static24.method592(Static290.anInt5464, Static290.anInt5464 + local28, local44, Static290.anInt5464, local32, local50)) {
					Static120.anInt5454++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort102 != 128) {
				return true;
			} else if (Static24.method592(Static290.anInt5464, local28, local44, Static290.anInt5464, local32, local50)) {
				Static120.anInt5454++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method3504() {
		Static51.method997(11);
		Static146.method2808();
		System.gc();
	}
}
