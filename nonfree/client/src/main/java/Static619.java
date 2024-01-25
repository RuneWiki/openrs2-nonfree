import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "Z")
	public static boolean aBoolean273 = false;

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "[B")
	public static final byte[] aByteArray17 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZII)V")
	public static void method3009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 + Static622.anInt10188;
		@Pc(14) int local14 = Static668.anInt10683 + arg0;
		if (Static260.aClass174ArrayArrayArray2 == null || arg1 < 0 || arg0 < 0 || arg1 >= Static544.anInt9261 || Static282.anInt4887 <= arg0 || Static637.aClass5_Sub20_31.aClass24_Sub25_2.method7146() == 0 && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 != arg2) {
			return;
		}
		@Pc(74) long local74 = (long) (arg2 << 28 | local14 << 14 | local10);
		@Pc(80) Class5_Sub25 local80 = (Class5_Sub25) Static466.aClass291_33.method6993(local74, 1);
		if (local80 == null) {
			Static8.method96(arg2, arg1, arg0);
			return;
		}
		@Pc(95) Class5_Sub15 local95 = (Class5_Sub15) local80.aClass102_34.method1916();
		if (local95 == null) {
			Static8.method96(arg2, arg1, arg0);
			return;
		}
		@Pc(110) Class8_Sub1_Sub5_Sub1 local110 = (Class8_Sub1_Sub5_Sub1) Static8.method96(arg2, arg1, arg0);
		if (local110 == null) {
			local110 = new Class8_Sub1_Sub5_Sub1(arg1 << 9, Static242.aClass22Array3[arg2].method8038(arg0, arg1), arg0 << 9, arg2, arg2);
		} else {
			local110.anInt10386 = local110.anInt10377 = -1;
		}
		local110.anInt10374 = local95.anInt2422;
		local110.anInt10388 = local95.anInt2420;
		label56: while (true) {
			@Pc(155) Class5_Sub15 local155 = (Class5_Sub15) local80.aClass102_34.method1915();
			if (local155 == null) {
				break;
			}
			if (local110.anInt10388 != local155.anInt2420) {
				local110.anInt10386 = local155.anInt2420;
				local110.anInt10385 = local155.anInt2422;
				while (true) {
					@Pc(186) Class5_Sub15 local186 = (Class5_Sub15) local80.aClass102_34.method1915();
					if (local186 == null) {
						break label56;
					}
					if (local110.anInt10388 != local186.anInt2420 && local186.anInt2420 != local110.anInt10386) {
						local110.anInt10377 = local186.anInt2420;
						local110.anInt10382 = local186.anInt2422;
					}
				}
			}
		}
		@Pc(236) int local236 = Static380.method5559((arg1 << 9) + 256, arg2, (arg0 << 9) + 256, 0);
		local110.anInt10379 = 0;
		local110.anInt10363 = arg0 << 9;
		local110.anInt10357 = local236;
		local110.aByte146 = (byte) arg2;
		local110.aByte145 = (byte) arg2;
		local110.anInt10355 = arg1 << 9;
		if (Static90.method1353(1, arg0, arg1)) {
			local110.aByte146++;
		}
		Static327.method4981(arg2, arg1, arg0, local236, local110);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3013(@OriginalArg(1) String arg0) {
		if (Static117.aStringArray15 == null) {
			Static45.method8839();
		}
		Static464.aCalendar3.setTime(new Date(Static515.method7499(74)));
		@Pc(22) int local22 = Static464.aCalendar3.get(11);
		@Pc(26) int local26 = Static464.aCalendar3.get(12);
		@Pc(30) int local30 = Static464.aCalendar3.get(13);
		@Pc(64) String local64 = Integer.toString(local22 / 10) + local22 % 10 + ":" + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
		@Pc(79) String[] local79 = Static439.method6502(arg0, '\n');
		for (@Pc(81) int local81 = 0; local81 < local79.length; local81++) {
			for (@Pc(85) int local85 = Static503.anInt8655; local85 > 0; local85--) {
				Static117.aStringArray15[local85] = Static117.aStringArray15[local85 - 1];
			}
			Static117.aStringArray15[0] = local64 + ": " + local79[local81];
			if (Static2.aFileOutputStream1 != null) {
				try {
					Static2.aFileOutputStream1.write(Static468.method6845(Static117.aStringArray15[0] + "\n"));
				} catch (@Pc(140) IOException local140) {
				}
			}
			if (Static117.aStringArray15.length - 1 > Static503.anInt8655) {
				if (Static154.anInt2438 > 0) {
					Static154.anInt2438++;
				}
				Static503.anInt8655++;
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(FIIFF)F")
	public static float method3021(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static196.aFloatArrayArray4[arg1];
		return arg3 * local7[2] + local7[1] * arg0 + arg2 * local7[0];
	}
}
