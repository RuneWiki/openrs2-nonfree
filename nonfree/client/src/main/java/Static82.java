import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
	public static int anInt2148 = -1;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Z")
	public static final boolean aBoolean148 = false;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!rk;B)V")
	public static void method1753(@OriginalArg(0) Class180 arg0) {
		Static312.aClass180_90 = arg0;
		Static78.anInt6343 = Static312.aClass180_90.method4553(4);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method1754() {
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			Static341.aBooleanArray31[local5] = false;
		}
		Static138.anInt3018 = -1;
		Static136.anInt2916 = 0;
		anInt2148 = -1;
		Static118.anInt6324 = 1;
		Static126.anInt2791 = 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I")
	public static int method1755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static72.method1409(arg1 - 1, arg0 - 1) + Static72.method1409(arg1 - 1, arg0 + 1) + Static72.method1409(arg1 + 1, arg0 + -1) + Static72.method1409(arg1 - -1, arg0 + 1);
		@Pc(73) int local73 = Static72.method1409(arg1, arg0 - 1) + Static72.method1409(arg1, arg0 + 1) + Static72.method1409(arg1 - 1, arg0) + Static72.method1409(arg1 + 1, arg0);
		@Pc(83) int local83 = Static72.method1409(arg1, arg0);
		return local42 / 16 + local73 / 8 + local83 / 4;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
	public static int method1756(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Lclient!al;")
	public static Class12 method1757(@OriginalArg(0) int arg0) {
		@Pc(10) Class12 local10 = (Class12) Static239.aClass103_46.method2682((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static145.aClass180_38.method4560(arg0, 0);
		local10 = new Class12();
		if (local20 != null) {
			local10.method175(new Class7_Sub3(local20));
		}
		local10.method176();
		Static239.aClass103_46.method2687(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
	public static void method1759(@OriginalArg(0) int arg0) {
		if (arg0 == Static85.anInt2215) {
			return;
		}
		if (Static85.anInt2215 == 0) {
			Static74.method1487();
		}
		if (arg0 == 40) {
			Static314.method5101();
		}
		if (arg0 != 40 && Static229.aClass61_2 != null) {
			Static229.aClass61_2.method1376();
			Static229.aClass61_2 = null;
		}
		if (Static85.anInt2215 == 25 || Static85.anInt2215 == 28) {
			Static282.aClass180_75.anInt5411 = 2;
			Static257.aClass180_67.anInt5411 = 2;
			Static36.aClass180_9.anInt5411 = 2;
			Static131.aClass180_35.anInt5411 = 2;
			Static284.aClass180_76.anInt5411 = 2;
			Static200.aClass180_53.anInt5411 = 2;
			Static273.aClass180_72.anInt5411 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static309.anInt5898 = 0;
			Static153.anInt3265 = 1;
			Static323.anInt6142 = 0;
			Static288.anInt1245 = 1;
			Static254.anInt4941 = 0;
			Static319.method5154(true);
			Static282.aClass180_75.anInt5411 = 1;
			Static257.aClass180_67.anInt5411 = 1;
			Static36.aClass180_9.anInt5411 = 1;
			Static131.aClass180_35.anInt5411 = 1;
			Static284.aClass180_76.anInt5411 = 1;
			Static200.aClass180_53.anInt5411 = 1;
			Static273.aClass180_72.anInt5411 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static276.method4610();
		}
		if (arg0 == 5) {
			Static251.method5279(Static312.aClass180_89, Static128.aClass89_3);
		} else {
			Static336.method3726();
		}
		@Pc(150) boolean local150 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(165) boolean local165 = Static85.anInt2215 == 5 || Static85.anInt2215 == 10 || Static85.anInt2215 == 28;
		if (local165 != local150) {
			if (local150) {
				Static149.anInt3231 = Static229.anInt4562;
				if (Static254.anInt4943 == 0) {
					Static203.method3600();
				} else {
					Static184.method3379(255, Static226.aClass180_57, Static229.anInt4562);
				}
				Static229.aClass160_3.method4114(false);
			} else {
				Static203.method3600();
				Static229.aClass160_3.method4114(true);
				if (Static162.aClass123_4 != null) {
					Static162.aClass123_4.method3243();
					Static162.aClass123_4 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static128.aClass89_3.method5450();
		}
		Static85.anInt2215 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public static void method1760() {
		if (Static142.aBoolean235) {
			return;
		}
		Static13.aBoolean10 = true;
		if (Static268.aBoolean393) {
			Static351.aFloat80 = (int) Static351.aFloat80 - 65 & 0xFFFFFF80;
		} else {
			Static290.aFloat73 += (-Static290.aFloat73 - 24.0F) / 2.0F;
		}
		Static142.aBoolean235 = true;
	}
}
