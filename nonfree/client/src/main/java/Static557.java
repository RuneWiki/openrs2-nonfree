import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!taa", name = "t", descriptor = "Z")
	public static boolean aBoolean777 = false;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIB)Z")
	public static boolean method7719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static270.method4167(arg1, arg0) | (arg0 & 0x70000) != 0 || Static399.method5900(arg0, arg1);
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(IIB)V")
	public static void method7722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static330.aFloat8 < Static330.aFloat9) {
			Static330.aFloat8 = (float) ((double) Static330.aFloat8 + (double) Static330.aFloat8 / 30.0D);
			if (Static330.aFloat8 > Static330.aFloat9) {
				Static330.aFloat8 = Static330.aFloat9;
			}
			Static126.method2284();
			Static330.anInt751 = (int) Static330.aFloat8 >> 1;
			Static330.aByteArrayArrayArray3 = Static320.method9050(Static330.anInt751);
		} else if (Static330.aFloat8 > Static330.aFloat9) {
			Static330.aFloat8 = (float) ((double) Static330.aFloat8 - (double) Static330.aFloat8 / 30.0D);
			if (Static330.aFloat9 > Static330.aFloat8) {
				Static330.aFloat8 = Static330.aFloat9;
			}
			Static126.method2284();
			Static330.anInt751 = (int) Static330.aFloat8 >> 1;
			Static330.aByteArrayArrayArray3 = Static320.method9050(Static330.anInt751);
		}
		if (Static293.anInt5675 != -1 && Static596.anInt3354 != -1) {
			@Pc(84) int local84 = Static293.anInt5675 - Static193.anInt3730;
			if (local84 < 2 || local84 > 2) {
				local84 /= 8;
			}
			@Pc(99) int local99 = Static596.anInt3354 - Static241.anInt4462;
			if (local99 < 2 || local99 > 2) {
				local99 /= 8;
			}
			Static193.anInt3730 += local84;
			Static241.anInt4462 += local99;
			if (local84 == 0 && local99 == 0) {
				Static596.anInt3354 = -1;
				Static293.anInt5675 = -1;
			}
			Static126.method2284();
		}
		if (Static416.anInt7349 > 0) {
			Static150.anInt3080--;
			if (Static150.anInt3080 == 0) {
				Static416.anInt7349--;
				Static150.anInt3080 = 100;
			}
		} else {
			Static426.anInt7486 = -1;
			Static16.anInt256 = -1;
		}
		if (!Static558.aBoolean633 || Static38.aClass114_4 == null) {
			return;
		}
		for (@Pc(159) Class5_Sub48 local159 = (Class5_Sub48) Static38.aClass114_4.method2805(); local159 != null; local159 = (Class5_Sub48) Static38.aClass114_4.method2814()) {
			@Pc(168) Class103 local168 = Static330.aClass93_3.method2280(local159.aClass5_Sub36_1.anInt5984);
			if (local159.method7314(arg1, arg0)) {
				if (local168.aStringArray18 != null) {
					if (local168.aStringArray18[4] != null) {
						Static282.method4539(local168.aStringArray18[4], false, -1, -1, false, (long) local159.aClass5_Sub36_1.anInt5984, 0, 1006, (long) local159.aClass5_Sub36_1.anInt5984, local168.anInt2801, local168.aString16, true);
					}
					if (local168.aStringArray18[3] != null) {
						Static282.method4539(local168.aStringArray18[3], false, -1, -1, false, (long) local159.aClass5_Sub36_1.anInt5984, 0, 1008, (long) local159.aClass5_Sub36_1.anInt5984, local168.anInt2801, local168.aString16, true);
					}
					if (local168.aStringArray18[2] != null) {
						Static282.method4539(local168.aStringArray18[2], false, -1, -1, false, (long) local159.aClass5_Sub36_1.anInt5984, 0, 1004, (long) local159.aClass5_Sub36_1.anInt5984, local168.anInt2801, local168.aString16, true);
					}
					if (local168.aStringArray18[1] != null) {
						Static282.method4539(local168.aStringArray18[1], false, -1, -1, false, (long) local159.aClass5_Sub36_1.anInt5984, 0, 1010, (long) local159.aClass5_Sub36_1.anInt5984, local168.anInt2801, local168.aString16, true);
					}
					if (local168.aStringArray18[0] != null) {
						Static282.method4539(local168.aStringArray18[0], false, -1, -1, false, (long) local159.aClass5_Sub36_1.anInt5984, 0, 1007, (long) local159.aClass5_Sub36_1.anInt5984, local168.anInt2801, local168.aString16, true);
					}
				}
				if (!local159.aClass5_Sub36_1.aBoolean527) {
					local159.aClass5_Sub36_1.aBoolean527 = true;
					Static652.method8744(Static411.aClass394_113, local159.aClass5_Sub36_1.anInt5984, local168.anInt2801);
				}
				if (local159.aClass5_Sub36_1.aBoolean527) {
					Static652.method8744(Static326.aClass394_94, local159.aClass5_Sub36_1.anInt5984, local168.anInt2801);
				}
			} else if (local159.aClass5_Sub36_1.aBoolean527) {
				local159.aClass5_Sub36_1.aBoolean527 = false;
				Static652.method8744(Static328.aClass394_95, local159.aClass5_Sub36_1.anInt5984, local168.anInt2801);
			}
		}
	}

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "(I)I")
	public static int method7723() {
		return Static1.anInt9943 == 1 ? Static206.anInt3873 : Static513.anInt8561;
	}

	@OriginalMember(owner = "client!taa", name = "d", descriptor = "(I)V")
	public static void method7724() {
		if (Static510.aClass331_6 == null) {
			return;
		}
		if (Static510.aClass331_6.anInt9108 == 1) {
			Static510.aClass331_6 = null;
			return;
		}
		if (Static510.aClass331_6.anInt9108 == 2) {
			Static602.method8252(Static672.aClass268_6, Static449.aString72, 2);
			Static510.aClass331_6 = null;
			return;
		}
	}
}
