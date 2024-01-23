import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "[[[Lclient!en;")
	public static Class44[][][] aClass44ArrayArrayArray1;

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "Lclient!ek;")
	public static Class42 aClass42_32;

	@OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
	public static int anInt2669 = 0;

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
	public static int anInt2672 = 50;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)Z")
	public static boolean method2021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static87.method1552(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static294.method4514(local10 + 1, Static9.anIntArrayArrayArray7[arg0][arg1][arg2] + arg3, local14 + 1) && Static294.method4514(local10 + 128 - 1, Static9.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static294.method4514(local10 + 128 - 1, Static9.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static294.method4514(local10 + 1, Static9.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
	public static void method2022() {
		if (Static6.anInt113 == 2) {
			if (Static169.anInt3744 == Static273.anInt5425 && Static132.anInt3027 == Static75.anInt1867) {
				Static6.anInt113 = 0;
				if (Static72.aBoolean117 && Static145.aBooleanArray13[81] && Static68.anInt1741 > 2) {
					Static73.method1397(Static68.anInt1741 - 2);
				} else {
					Static73.method1397(Static68.anInt1741 - 1);
				}
			}
		} else if (Static86.anInt2010 == Static169.anInt3744 && Static252.anInt4933 == Static75.anInt1867) {
			Static6.anInt113 = 0;
			if (Static72.aBoolean117 && Static145.aBooleanArray13[81] && Static68.anInt1741 > 2) {
				Static73.method1397(Static68.anInt1741 - 2);
			} else {
				Static73.method1397(Static68.anInt1741 - 1);
			}
		} else {
			Static132.anInt3027 = Static252.anInt4933;
			Static6.anInt113 = 2;
			Static273.anInt5425 = Static86.anInt2010;
		}
	}
}
