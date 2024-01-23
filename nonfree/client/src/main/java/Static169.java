import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "J")
	public static long aLong132 = 0L;

	@OriginalMember(owner = "client!mh", name = "O", descriptor = "Z")
	public static boolean aBoolean251 = false;

	@OriginalMember(owner = "client!mh", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString109 = "Attack";

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)V")
	public static void method2847() {
		if (Static152.anInt3136 == 0) {
			return;
		}
		try {
			if (++Static57.anInt1127 > 1500) {
				if (Static81.aClass7_2 != null) {
					Static81.aClass7_2.method105();
					Static81.aClass7_2 = null;
				}
				if (Static207.anInt4071 >= 1) {
					Static213.anInt4207 = -5;
					Static152.anInt3136 = 0;
					return;
				}
				Static207.anInt4071++;
				Static152.anInt3136 = 1;
				Static57.anInt1127 = 0;
				if (Static122.anInt2459 == Static66.anInt1306) {
					Static122.anInt2459 = Static215.anInt4229;
				} else {
					Static122.anInt2459 = Static66.anInt1306;
				}
			}
			if (Static152.anInt3136 == 1) {
				Static110.aClass10_5 = Static117.aClass117_3.method2996(Static122.anInt2459, Static121.aString88);
				Static152.anInt3136 = 2;
			}
			@Pc(131) int local131;
			if (Static152.anInt3136 == 2) {
				if (Static110.aClass10_5.anInt151 == 2) {
					throw new IOException();
				}
				if (Static110.aClass10_5.anInt151 != 1) {
					return;
				}
				Static81.aClass7_2 = new Class7((Socket) Static110.aClass10_5.anObject1, Static117.aClass117_3);
				Static110.aClass10_5 = null;
				Static81.aClass7_2.method108(Static137.aClass1_Sub14_Sub1_6.aByteArray34, Static137.aClass1_Sub14_Sub1_6.anInt3290);
				if (Static313.aClass101_2 != null) {
					Static313.aClass101_2.method2811();
				}
				if (Static199.aClass101_1 != null) {
					Static199.aClass101_1.method2811();
				}
				local131 = Static81.aClass7_2.method103();
				if (Static313.aClass101_2 != null) {
					Static313.aClass101_2.method2811();
				}
				if (Static199.aClass101_1 != null) {
					Static199.aClass101_1.method2811();
				}
				if (local131 != 101) {
					Static213.anInt4207 = local131;
					Static152.anInt3136 = 0;
					Static81.aClass7_2.method105();
					Static81.aClass7_2 = null;
					return;
				}
				Static152.anInt3136 = 3;
			}
			if (Static152.anInt3136 == 3) {
				if (Static81.aClass7_2.method104() >= 2) {
					local131 = Static81.aClass7_2.method103() << 8 | Static81.aClass7_2.method103();
					Static23.method451(local131);
					if (Static108.anInt2138 != -1) {
						Static152.anInt3136 = 0;
						Static81.aClass7_2.method105();
						Static81.aClass7_2 = null;
						Static115.method1842();
						return;
					}
					Static152.anInt3136 = 0;
					Static213.anInt4207 = 6;
					Static81.aClass7_2.method105();
					Static81.aClass7_2 = null;
					return;
				}
				return;
			}
		} catch (@Pc(217) IOException local217) {
			if (Static81.aClass7_2 != null) {
				Static81.aClass7_2.method105();
				Static81.aClass7_2 = null;
			}
			if (Static207.anInt4071 >= 1) {
				Static213.anInt4207 = -4;
				Static152.anInt3136 = 0;
			} else {
				if (Static66.anInt1306 == Static122.anInt2459) {
					Static122.anInt2459 = Static215.anInt4229;
				} else {
					Static122.anInt2459 = Static66.anInt1306;
				}
				Static207.anInt4071++;
				Static57.anInt1127 = 0;
				Static152.anInt3136 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)V")
	public static void method2848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg2 + 1;
		Static109.method1795(arg4, Static51.anIntArrayArray1[arg2], arg3, arg1);
		@Pc(18) int local18 = arg0 - 1;
		Static109.method1795(arg4, Static51.anIntArrayArray1[arg0], arg3, arg1);
		for (@Pc(30) int local30 = local5; local30 <= local18; local30++) {
			@Pc(41) int[] local41 = Static51.anIntArrayArray1[local30];
			local41[arg4] = local41[arg3] = arg1;
		}
	}
}
