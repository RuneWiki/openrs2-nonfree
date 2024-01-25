import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	public static int anInt3620;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	public static int anInt3616 = 0;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
	public static int anInt3627 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lclient!ii;")
	public static Class111 method3166(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static42.aFloat4 == 3.0D) {
				return Static156.aClass111_6;
			}
			if ((double) Static42.aFloat4 == 4.0D) {
				return Static127.aClass111_5;
			}
			if ((double) Static42.aFloat4 == 6.0D) {
				return Static98.aClass111_2;
			}
			if ((double) Static42.aFloat4 >= 8.0D) {
				return Static16.aClass111_1;
			}
		} else if (arg0 == 1) {
			if ((double) Static42.aFloat4 == 3.0D) {
				return Static98.aClass111_2;
			}
			if ((double) Static42.aFloat4 == 4.0D) {
				return Static16.aClass111_1;
			}
			if ((double) Static42.aFloat4 == 6.0D) {
				return Static291.aClass111_8;
			}
			if ((double) Static42.aFloat4 >= 8.0D) {
				return Static114.aClass111_4;
			}
		} else if (arg0 == 2) {
			if ((double) Static42.aFloat4 == 3.0D) {
				return Static291.aClass111_8;
			}
			if ((double) Static42.aFloat4 == 4.0D) {
				return Static114.aClass111_4;
			}
			if ((double) Static42.aFloat4 == 6.0D) {
				return Static105.aClass111_3;
			}
			if ((double) Static42.aFloat4 >= 8.0D) {
				return Static233.aClass111_7;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public static void method3169() {
		if (!Static68.aBoolean81) {
			return;
		}
		@Pc(16) Class62 local16 = Static80.method1338(Static242.anInt4268, Static127.anInt2413);
		if (local16 != null && local16.anObjectArray8 != null) {
			@Pc(25) Class3_Sub23 local25 = new Class3_Sub23();
			local25.aClass62_11 = local16;
			local25.anObjectArray31 = local16.anObjectArray8;
			Static124.method2006(local25);
		}
		Static109.anInt2149 = -1;
		Static68.aBoolean81 = false;
		Static103.anInt2047 = -1;
		if (local16 != null) {
			Static158.method2441(local16);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIII)V")
	public static void method3170(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static298.anInt5150; local7++) {
			@Pc(13) Rectangle local13 = Class3_Sub1_Sub15.aRectangleArray4[local7];
			if (arg1 < local13.width + local13.x && arg2 + arg1 > local13.x && arg0 < local13.height + local13.y && arg3 + arg0 > local13.y) {
				Static109.aBooleanArray45[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)V")
	public static void method3172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(40) String local40 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local40);
		Static296.method4571(true, local40);
	}
}
