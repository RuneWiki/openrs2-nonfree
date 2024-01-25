import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!cm", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray16 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IJBI)V")
	public static void method835(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) arg1 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) arg1 >> 20 & 0x3;
		@Pc(26) int local26 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local12 != 10 && local12 != 11 && local12 != 22) {
			Static155.method2334(arg2, 0, 0, arg0, 0, local12, local19, true);
			return;
		}
		@Pc(59) Class236 local59 = Static54.aClass153_1.method3081(local26);
		@Pc(73) int local73;
		@Pc(70) int local70;
		if (local19 == 0 || local19 == 2) {
			local73 = local59.anInt5893;
			local70 = local59.anInt5912;
		} else {
			local70 = local59.anInt5893;
			local73 = local59.anInt5912;
		}
		@Pc(84) int local84 = local59.anInt5918;
		if (local19 != 0) {
			local84 = (local84 << local19 & 0xF) + (local84 >> 4 - local19);
		}
		Static155.method2334(arg2, local73, local70, arg0, local84, 0, 0, true);
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V")
	public static void method836() {
		@Pc(9) int[] local9 = new int[Static263.aClass102_2.anInt2686];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static263.aClass102_2.anInt2686; local18++) {
			@Pc(25) Class88 local25 = Static263.aClass102_2.method2172(local18);
			if (local25.anInt2011 >= 0 || local25.anInt2031 >= 0) {
				local9[local16++] = local18;
			}
		}
		Static115.anIntArray262 = new int[local16];
		for (@Pc(53) int local53 = 0; local53 < local16; local53++) {
			Static115.anIntArray262[local53] = local9[local53];
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
	public static int method838() {
		try {
			if (Static24.anInt387 == 0) {
				if (Static260.aLong146 > Static378.method5293() - 5000L) {
					return 0;
				}
				Static85.aClass112_3 = Static341.aClass162_5.method3289(Static108.anInt1883, Static125.aString20);
				Static293.aLong166 = Static378.method5293();
				Static24.anInt387 = 1;
			}
			if (Static378.method5293() > Static293.aLong166 + 30000L) {
				return Static97.method1417(1000);
			}
			@Pc(84) int local84;
			@Pc(122) int local122;
			if (Static24.anInt387 == 1) {
				if (Static85.aClass112_3.anInt2969 == 2) {
					return Static97.method1417(1001);
				}
				if (Static85.aClass112_3.anInt2969 != 1) {
					return -1;
				}
				Static6.aClass130_1 = new Class130((Socket) Static85.aClass112_3.anObject5, Static341.aClass162_5);
				Static85.aClass112_3 = null;
				local84 = 0;
				if (Static148.aBoolean231) {
					local84 = Static88.anInt1641;
				}
				Static209.aClass1_Sub33_Sub2_2.lb = 0;
				Static209.aClass1_Sub33_Sub2_2.method5165(Static159.aClass66_9.anInt1518);
				Static209.aClass1_Sub33_Sub2_2.method5142(local84);
				Static6.aClass130_1.method2670(Static209.aClass1_Sub33_Sub2_2.lb, Static209.aClass1_Sub33_Sub2_2.aByteArray86);
				if (Static216.aClass14_1 != null) {
					Static216.aClass14_1.method4896();
				}
				if (Static296.aClass14_2 != null) {
					Static296.aClass14_2.method4896();
				}
				local122 = Static6.aClass130_1.method2672();
				if (Static216.aClass14_1 != null) {
					Static216.aClass14_1.method4896();
				}
				if (Static296.aClass14_2 != null) {
					Static296.aClass14_2.method4896();
				}
				if (local122 != 0) {
					return Static97.method1417(local122);
				}
				Static24.anInt387 = 2;
			}
			if (Static24.anInt387 == 2) {
				if (Static6.aClass130_1.method2675() < 2) {
					return -1;
				}
				Static370.anInt6046 = Static6.aClass130_1.method2672();
				Static370.anInt6046 <<= 0x8;
				Static370.anInt6046 += Static6.aClass130_1.method2672();
				Static114.aByteArray38 = new byte[Static370.anInt6046];
				Static24.anInt387 = 3;
				Static90.anInt1660 = 0;
			}
			if (Static24.anInt387 != 3) {
				return -1;
			}
			local84 = Static6.aClass130_1.method2675();
			if (local84 < 1) {
				return -1;
			}
			if (Static370.anInt6046 - Static90.anInt1660 < local84) {
				local84 = Static370.anInt6046 - Static90.anInt1660;
			}
			Static6.aClass130_1.method2666(local84, Static114.aByteArray38, Static90.anInt1660);
			Static90.anInt1660 += local84;
			if (Static370.anInt6046 > Static90.anInt1660) {
				return -1;
			} else if (Static16.method182(Static114.aByteArray38)) {
				Static52.aClass124_Sub1Array1 = new Class124_Sub1[Static391.anInt6385];
				local122 = 0;
				for (@Pc(232) int local232 = Static208.anInt3626; local232 <= Static382.anInt6199; local232++) {
					@Pc(238) Class124_Sub1 local238 = Static273.method4215(local232);
					if (local238 != null) {
						Static52.aClass124_Sub1Array1[local122++] = local238;
					}
				}
				Static78.anInt1494 = 0;
				Static300.aClass1_Sub21_2 = null;
				Static6.aClass130_1.method2668();
				Static6.aClass130_1 = null;
				Static114.aByteArray38 = null;
				Static24.anInt387 = 0;
				Static232.anInt804 = 0;
				Static260.aLong146 = Static378.method5293();
				return 0;
			} else {
				return Static97.method1417(1002);
			}
		} catch (@Pc(274) IOException local274) {
			return Static97.method1417(1003);
		}
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(III)V")
	public static void method839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(0, 15);
		local8.method3004();
		local8.anInt3679 = arg0;
		local8.anInt3686 = arg1;
	}
}
