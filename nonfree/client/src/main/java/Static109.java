import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
	public static int anInt2057;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString63 = "Ok";

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	public static int anInt2050 = -2;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public static void method1719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static236.anIntArray578[arg0] = arg1;
		@Pc(22) Class1_Sub9 local22 = (Class1_Sub9) Static278.aClass22_21.method633((long) arg0);
		if (local22 == null) {
			local22 = new Class1_Sub9(4611686018427387905L);
			Static278.aClass22_21.method643((long) arg0, local22);
		} else if (local22.aLong51 != 4611686018427387905L) {
			local22.aLong51 = Static252.method3964() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
	public static void method1720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg2 + arg0);
		@Pc(18) int local18 = arg0;
		@Pc(27) int local27 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg2 - arg0);
		@Pc(30) int local30 = -arg0;
		Static288.method4405(arg3, local16, local27, Static151.anIntArrayArray26[arg1]);
		@Pc(42) int local42 = -1;
		while (local18 > local7) {
			local42 += 2;
			local30 += local42;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(97) int local97;
			@Pc(106) int local106;
			if (local30 > 0) {
				local18--;
				local64 = arg1 - local18;
				local68 = local18 + arg1;
				local30 -= local18 << 1;
				if (local68 >= Static24.anInt556 && Static284.anInt5643 >= local64) {
					local97 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg2 + local7);
					local106 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg2 - local7);
					if (local68 <= Static284.anInt5643) {
						Static288.method4405(arg3, local97, local106, Static151.anIntArrayArray26[local68]);
					}
					if (local64 >= Static24.anInt556) {
						Static288.method4405(arg3, local97, local106, Static151.anIntArrayArray26[local64]);
					}
				}
			}
			local7++;
			local64 = arg1 - local7;
			local68 = local7 + arg1;
			if (local68 >= Static24.anInt556 && local64 <= Static284.anInt5643) {
				local97 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg2 + local18);
				local106 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg2 - local18);
				if (local68 <= Static284.anInt5643) {
					Static288.method4405(arg3, local97, local106, Static151.anIntArrayArray26[local68]);
				}
				if (Static24.anInt556 <= local64) {
					Static288.method4405(arg3, local97, local106, Static151.anIntArrayArray26[local64]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V")
	public static void method1721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static245.anInt1237 <= arg2 && Static28.anInt606 >= arg0 && arg4 >= Static24.anInt556 && Static284.anInt5643 >= arg1) {
			Static97.method1592(arg4, arg1, arg2, arg3, arg0);
		} else {
			Static58.method1000(arg4, arg0, arg1, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public static void method1723() {
		@Pc(11) int local11 = Static47.anInt5869;
		@Pc(13) int local13 = Static125.anInt2380;
		@Pc(21) int local21 = Static139.anInt2621 - local11 - Static145.anInt2690;
		@Pc(28) int local28 = Static269.anInt5394 - Static166.anInt3046 - local13;
		if (local11 <= 0 && local21 <= 0 && local13 <= 0 && local28 <= 0) {
			return;
		}
		try {
			@Pc(50) Container local50;
			if (Static136.aFrame1 != null) {
				local50 = Static136.aFrame1;
			} else if (Static299.aFrame2 == null) {
				local50 = Static13.aClass84_3.anApplet1;
			} else {
				local50 = Static299.aFrame2;
			}
			@Pc(63) int local63 = 0;
			@Pc(65) int local65 = 0;
			if (local50 == Static299.aFrame2) {
				@Pc(71) Insets local71 = Static299.aFrame2.getInsets();
				local65 = local71.left;
				local63 = local71.top;
			}
			@Pc(80) Graphics local80 = local50.getGraphics();
			local80.setColor(Color.black);
			if (local11 > 0) {
				local80.fillRect(local65, local63, local11, Static269.anInt5394);
			}
			if (local13 > 0) {
				local80.fillRect(local65, local63, Static139.anInt2621, local13);
			}
			if (local21 > 0) {
				local80.fillRect(local65 + Static139.anInt2621 - local21, local63, local21, Static269.anInt5394);
			}
			if (local28 > 0) {
				local80.fillRect(local65, Static269.anInt5394 + local63 - local28, Static139.anInt2621, local28);
			}
		} catch (@Pc(134) Exception local134) {
		}
	}
}
