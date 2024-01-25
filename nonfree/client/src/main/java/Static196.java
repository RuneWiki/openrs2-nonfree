import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "J")
	public static long aLong98;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Lclient!em;")
	public static final Class83 aClass83_82 = new Class83(48, 8);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V")
	public static void method3084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static287.aFloat106 > Static287.aFloat105) {
			Static287.aFloat105 = (float) ((double) Static287.aFloat105 + (double) Static287.aFloat105 / 30.0D);
			if (Static287.aFloat106 < Static287.aFloat105) {
				Static287.aFloat105 = Static287.aFloat106;
			}
			Static434.method6193();
			Static287.anInt3850 = (int) Static287.aFloat105 >> 1;
			Static287.aByteArrayArrayArray3 = Static351.method5245(Static287.anInt3850);
		} else if (Static287.aFloat105 > Static287.aFloat106) {
			Static287.aFloat105 = (float) ((double) Static287.aFloat105 - (double) Static287.aFloat105 / 30.0D);
			if (Static287.aFloat106 > Static287.aFloat105) {
				Static287.aFloat105 = Static287.aFloat106;
			}
			Static434.method6193();
			Static287.anInt3850 = (int) Static287.aFloat105 >> 1;
			Static287.aByteArrayArrayArray3 = Static351.method5245(Static287.anInt3850);
		}
		if (Static264.anInt4867 != -1 && Static100.anInt1767 != -1) {
			@Pc(82) int local82 = Static264.anInt4867 - Static500.anInt8734;
			if (local82 < 2 || local82 > 2) {
				local82 /= 8;
			}
			@Pc(99) int local99 = Static100.anInt1767 - Static249.anInt4547;
			Static500.anInt8734 += local82;
			if (local99 < 2 || local99 > 2) {
				local99 /= 8;
			}
			if (local82 == 0 && local99 == 0) {
				Static264.anInt4867 = -1;
				Static100.anInt1767 = -1;
			}
			Static249.anInt4547 += local99;
			Static434.method6193();
		}
		if (Static413.anInt7319 > 0) {
			Static24.anInt582--;
			if (Static24.anInt582 == 0) {
				Static24.anInt582 = 100;
				Static413.anInt7319--;
			}
		} else {
			Static514.anInt8865 = -1;
			Static69.anInt1339 = -1;
		}
		if (!Static81.aBoolean99 || Static49.aClass111_4 == null) {
			return;
		}
		for (@Pc(163) Class1_Sub39 local163 = (Class1_Sub39) Static49.aClass111_4.method2547(); local163 != null; local163 = (Class1_Sub39) Static49.aClass111_4.method2554()) {
			@Pc(172) Class345 local172 = Static287.aClass113_3.method2595(local163.aClass1_Sub51_1.anInt9675);
			if (local163.method6213(arg0, arg1)) {
				if (local172.aStringArray38 != null) {
					if (local172.aStringArray38[4] != null) {
						Static385.method5573(1002, 0, local172.aStringArray38[4], -1, false, true, local172.aString100, (long) local163.aClass1_Sub51_1.anInt9675, local172.anInt9198, -1);
					}
					if (local172.aStringArray38[3] != null) {
						Static385.method5573(1008, 0, local172.aStringArray38[3], -1, false, true, local172.aString100, (long) local163.aClass1_Sub51_1.anInt9675, local172.anInt9198, -1);
					}
					if (local172.aStringArray38[2] != null) {
						Static385.method5573(1001, 0, local172.aStringArray38[2], -1, false, true, local172.aString100, (long) local163.aClass1_Sub51_1.anInt9675, local172.anInt9198, -1);
					}
					if (local172.aStringArray38[1] != null) {
						Static385.method5573(1009, 0, local172.aStringArray38[1], -1, false, true, local172.aString100, (long) local163.aClass1_Sub51_1.anInt9675, local172.anInt9198, -1);
					}
					if (local172.aStringArray38[0] != null) {
						Static385.method5573(1004, 0, local172.aStringArray38[0], -1, false, true, local172.aString100, (long) local163.aClass1_Sub51_1.anInt9675, local172.anInt9198, -1);
					}
				}
				if (!local163.aClass1_Sub51_1.aBoolean715) {
					local163.aClass1_Sub51_1.aBoolean715 = true;
					Static451.method6304(Static500.aClass84_8, local163.aClass1_Sub51_1.anInt9675, local172.anInt9198);
				}
				if (local163.aClass1_Sub51_1.aBoolean715) {
					Static451.method6304(Static563.aClass84_9, local163.aClass1_Sub51_1.anInt9675, local172.anInt9198);
				}
			} else if (local163.aClass1_Sub51_1.aBoolean715) {
				local163.aClass1_Sub51_1.aBoolean715 = false;
				Static451.method6304(Static427.aClass84_7, local163.aClass1_Sub51_1.anInt9675, local172.anInt9198);
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V")
	public static void method3085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = Static86.aClass1_Sub30_Sub1_1.anInt6189 * arg0 >> 8;
		if (local14 == 0 || arg2 == -1) {
			return;
		}
		if (!Static11.aBoolean8 && Static106.anInt1789 != -1 && Static389.method5594()) {
			Static80.aClass1_Sub6_Sub2_3 = Static205.method3165();
			@Pc(37) Class1_Sub6_Sub2 local37 = Static9.method235(Static80.aClass1_Sub6_Sub2_3);
			Static231.method3440(local37);
		}
		Static33.method637(arg2, local14, Static303.aClass308_109);
		Static497.method4591(-1, 255);
		Static11.aBoolean8 = true;
	}
}
