import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_190 = Static158.method3034("<col=80ff00>");

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
	public static int anInt785 = 0;

	@OriginalMember(owner = "client!ce", name = "R", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ce", name = "bb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_191 = Static158.method3034("");

	@OriginalMember(owner = "client!ce", name = "hb", descriptor = "I")
	public static int anInt803 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ra;I)I")
	public static int method637(@OriginalArg(0) Class72 arg0) {
		@Pc(22) Class2_Sub12 local22 = (Class2_Sub12) Static174.aClass51_13.method2458((long) arg0.anInt3911 + ((long) arg0.anInt3935 << 32));
		return local22 == null ? arg0.anInt3870 : local22.anInt2882;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)I")
	public static int method639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!i;Lclient!i;)V")
	public static void method641(@OriginalArg(1) Class2_Sub1_Sub7_Sub3_Sub1 arg0, @OriginalArg(2) Class2_Sub1_Sub7_Sub3_Sub1 arg1) {
		if (Static54.aClass2_Sub1_Sub7_Sub4Array4 == null) {
			Static54.aClass2_Sub1_Sub7_Sub4Array4 = Static78.method1883(Static53.anInt1659, 0, Static99.aClass13_Sub1_13);
		}
		if (Static76.aClass2_Sub1_Sub7_Sub2Array6 == null) {
			Static76.aClass2_Sub1_Sub7_Sub2Array6 = Static134.method2771(Static128.anInt3500, Static99.aClass13_Sub1_13, 0);
		}
		if (Static48.aClass2_Sub1_Sub7_Sub2Array2 == null) {
			Static48.aClass2_Sub1_Sub7_Sub2Array2 = Static134.method2771(Static191.anInt4558, Static99.aClass13_Sub1_13, 0);
		}
		if (Static84.aClass2_Sub1_Sub7_Sub2Array7 == null) {
			Static84.aClass2_Sub1_Sub7_Sub2Array7 = Static134.method2771(Static115.anInt3213, Static99.aClass13_Sub1_13, 0);
		}
		Static133.method2120(0, 23, 765, 480, 0);
		Static133.method2125(0, 0, 125, 23, 12425273, 9135624);
		Static133.method2125(125, 0, 640, 23, 5197647, 2697513);
		arg1.method1793(Static70.aClass60_528, 62, 15, 0, -1);
		if (Static84.aClass2_Sub1_Sub7_Sub2Array7 != null) {
			Static84.aClass2_Sub1_Sub7_Sub2Array7[1].method1202(140, 1);
			arg0.method1786(Static73.aClass60_537, 152, 10, 16777215, -1);
			Static84.aClass2_Sub1_Sub7_Sub2Array7[0].method1202(140, 12);
			arg0.method1786(Static145.aClass60_1030, 152, 21, 16777215, -1);
		}
		if (Static48.aClass2_Sub1_Sub7_Sub2Array2 != null) {
			if (Static48.anIntArray140[0] == 0 && Static24.anIntArray79[0] == 0) {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[2].method1202(280, 4);
			} else {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[0].method1202(280, 4);
			}
			if (Static48.anIntArray140[0] == 0 && Static24.anIntArray79[0] == 1) {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[3].method1202(295, 4);
			} else {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[1].method1202(295, 4);
			}
			arg1.method1786(Static57.aClass60_415, 312, 17, 16777215, -1);
			if (Static48.anIntArray140[0] == 1 && Static24.anIntArray79[0] == 0) {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[2].method1202(390, 4);
			} else {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[0].method1202(390, 4);
			}
			if (Static48.anIntArray140[0] == 1 && Static24.anIntArray79[0] == 1) {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[3].method1202(405, 4);
			} else {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[1].method1202(405, 4);
			}
			arg1.method1786(Static196.aClass60_1316, 422, 17, 16777215, -1);
			if (Static48.anIntArray140[0] == 2 && Static24.anIntArray79[0] == 0) {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[2].method1202(500, 4);
			} else {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[0].method1202(500, 4);
			}
			if (Static48.anIntArray140[0] == 2 && Static24.anIntArray79[0] == 1) {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[3].method1202(515, 4);
			} else {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[1].method1202(515, 4);
			}
			arg1.method1786(Static166.aClass60_1126, 532, 17, 16777215, -1);
			if (Static48.anIntArray140[0] == 3 && Static24.anIntArray79[0] == 0) {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[2].method1202(610, 4);
			} else {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[0].method1202(610, 4);
			}
			if (Static48.anIntArray140[0] == 3 && Static24.anIntArray79[0] == 1) {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[3].method1202(625, 4);
			} else {
				Static48.aClass2_Sub1_Sub7_Sub2Array2[1].method1202(625, 4);
			}
			arg1.method1786(Static114.aClass60_895, 642, 17, 16777215, -1);
		}
		Static133.method2120(708, 4, 50, 16, 0);
		arg0.method1793(Static43.aClass60_311, 733, 16, 16777215, -1);
		Static119.anInt3318 = -1;
		if (Static54.aClass2_Sub1_Sub7_Sub4Array4 == null) {
			return;
		}
		@Pc(395) int local395 = 8;
		@Pc(401) int local401 = 24;
		@Pc(403) int local403;
		@Pc(405) int local405;
		do {
			local403 = local401;
			local405 = local395;
			if (local401 * (local395 - 1) >= Static36.anInt1080) {
				local395--;
			}
			if (Static36.anInt1080 <= local395 * (local401 - 1)) {
				local401--;
			}
			if (local395 * (local401 - 1) >= Static36.anInt1080) {
				local401--;
			}
		} while (local403 != local401 || local395 != local405);
		local403 = (765 - local395 * 88) / (local395 + 1);
		if (local403 > 5) {
			local403 = 5;
		}
		@Pc(478) int local478 = (765 - (local395 - 1) * local403 - local395 * 88) / 2;
		local405 = (480 - local401 * 19) / (local401 - -1);
		if (local405 > 5) {
			local405 = 5;
		}
		@Pc(511) int local511 = (480 - (local401 - 1) * local405 - local401 * 19) / 2;
		@Pc(513) int local513 = local478;
		@Pc(517) int local517 = local511 + 23;
		@Pc(519) int local519 = 0;
		for (@Pc(521) int local521 = 0; local521 < Static36.anInt1080; local521++) {
			@Pc(525) boolean local525 = true;
			@Pc(529) Class14 local529 = Static43.aClass14Array1[local521];
			@Pc(534) Class60 local534 = Static72.method1661(local529.anInt761);
			if (local529.anInt761 == -1) {
				local525 = false;
				local534 = Static31.aClass60_228;
			} else if (local529.anInt761 > 1980) {
				local534 = Static144.aClass60_1025;
				local525 = false;
			}
			if (Static131.anInt215 >= local513 && Static157.anInt3985 >= local517 && Static131.anInt215 < local513 + 88 && Static157.anInt3985 < local517 + 19 && local525) {
				Static119.anInt3318 = local521;
				Static54.aClass2_Sub1_Sub7_Sub4Array4[local529.aBoolean27 ? 1 : 0].method2150(local513, local517);
			} else {
				Static54.aClass2_Sub1_Sub7_Sub4Array4[local529.aBoolean27 ? 1 : 0].method2149(local513, local517);
			}
			if (Static76.aClass2_Sub1_Sub7_Sub2Array6 != null) {
				Static76.aClass2_Sub1_Sub7_Sub2Array6[local529.anInt765 + (local529.aBoolean27 ? 8 : 0)].method1202(local513 + 29, local517);
			}
			arg1.method1793(Static72.method1661(local529.anInt767), local513 + 15, local517 + 5 + 9, 0, -1);
			arg0.method1793(local534, local513 + 60, local517 - -9 + 5, 268435455, -1);
			local517 += local405 + 19;
			local519++;
			if (local519 >= local401) {
				local517 = local511 + 23;
				local513 += local403 + 88;
				local519 = 0;
			}
		}
	}
}
