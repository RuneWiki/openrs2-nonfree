import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hw", name = "M", descriptor = "I")
	public static int anInt3921;

	@OriginalMember(owner = "client!hw", name = "X", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!hw", name = "R", descriptor = "I")
	public static int anInt3926 = -1;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
	public static void method3652() {
		Static71.aClass295_8 = new Class295();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIZLclient!mca;Lclient!mca;)I")
	public static int method3654(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class38_Sub1 arg2, @OriginalArg(4) Class38_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg2.anInt5568;
			local12 = arg3.anInt5568;
			if (!arg1) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static291.method5106(arg2.method5119().aString151, arg3.method5119().aString151, Static544.anInt7853);
		} else if (arg0 == 3) {
			if (arg2.aString133.equals("-")) {
				if (arg3.aString133.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString133.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static291.method5106(arg2.aString133, arg3.aString133, Static544.anInt7853);
			}
		} else if (arg0 == 4) {
			if (arg2.method5117()) {
				return arg3.method5117() ? 0 : 1;
			} else if (arg3.method5117()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg2.method5112()) {
				return arg3.method5112() ? 0 : 1;
			} else if (arg3.method5112()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg2.method5113()) {
				return arg3.method5113() ? 0 : 1;
			} else if (arg3.method5113()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg2.method5110()) {
				return arg3.method5110() ? 0 : 1;
			} else if (arg3.method5110()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg2.anInt5577;
			local12 = arg3.anInt5577;
			if (arg1) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg2.anInt5576 - arg3.anInt5576;
		}
	}

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "(III)V")
	public static void method3655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static335.aFloat103 < Static335.aFloat104) {
			Static335.aFloat103 = (float) ((double) Static335.aFloat103 + (double) Static335.aFloat103 / 30.0D);
			if (Static335.aFloat104 < Static335.aFloat103) {
				Static335.aFloat103 = Static335.aFloat104;
			}
			Static222.method4035();
			Static335.anInt4933 = (int) Static335.aFloat103 >> 1;
			Static335.aByteArrayArrayArray10 = Static338.method3565(Static335.anInt4933);
		} else if (Static335.aFloat104 < Static335.aFloat103) {
			Static335.aFloat103 = (float) ((double) Static335.aFloat103 - (double) Static335.aFloat103 / 30.0D);
			if (Static335.aFloat103 < Static335.aFloat104) {
				Static335.aFloat103 = Static335.aFloat104;
			}
			Static222.method4035();
			Static335.anInt4933 = (int) Static335.aFloat103 >> 1;
			Static335.aByteArrayArrayArray10 = Static338.method3565(Static335.anInt4933);
		}
		if (Static162.anInt3142 != -1 && Static313.anInt5997 != -1) {
			@Pc(84) int local84 = Static162.anInt3142 - Static64.anInt1610;
			if (local84 < 2 || local84 > 2) {
				local84 /= 8;
			}
			@Pc(99) int local99 = Static313.anInt5997 - Static32.anInt1050;
			Static64.anInt1610 += local84;
			if (local99 < 2 || local99 > 2) {
				local99 /= 8;
			}
			Static32.anInt1050 -= -local99;
			if (local84 == 0 && local99 == 0) {
				Static162.anInt3142 = -1;
				Static313.anInt5997 = -1;
			}
			Static222.method4035();
		}
		if (Static360.anInt6507 <= 0) {
			Static9.anInt229 = -1;
			Static39.anInt1113 = -1;
		} else {
			Static486.anInt8594--;
			if (Static486.anInt8594 == 0) {
				Static360.anInt6507--;
				Static486.anInt8594 = 100;
			}
		}
		if (!Static482.aBoolean635 || Static18.aClass295_4 == null) {
			return;
		}
		for (@Pc(170) Class1_Sub6 local170 = (Class1_Sub6) Static18.aClass295_4.method7543(); local170 != null; local170 = (Class1_Sub6) Static18.aClass295_4.method7540()) {
			@Pc(179) Class65 local179 = Static335.aClass32_4.method1129(local170.aClass1_Sub51_1.anInt9566);
			if (local170.method1462(arg0, arg1)) {
				if (local179.aStringArray9 != null) {
					if (local179.aStringArray9[4] != null) {
						Static18.method539(1007, true, 0, -1, local179.anInt1915, local179.aString36, local179.aStringArray9[4], (long) local170.aClass1_Sub51_1.anInt9566, false, -1);
					}
					if (local179.aStringArray9[3] != null) {
						Static18.method539(1001, true, 0, -1, local179.anInt1915, local179.aString36, local179.aStringArray9[3], (long) local170.aClass1_Sub51_1.anInt9566, false, -1);
					}
					if (local179.aStringArray9[2] != null) {
						Static18.method539(1004, true, 0, -1, local179.anInt1915, local179.aString36, local179.aStringArray9[2], (long) local170.aClass1_Sub51_1.anInt9566, false, -1);
					}
					if (local179.aStringArray9[1] != null) {
						Static18.method539(1006, true, 0, -1, local179.anInt1915, local179.aString36, local179.aStringArray9[1], (long) local170.aClass1_Sub51_1.anInt9566, false, -1);
					}
					if (local179.aStringArray9[0] != null) {
						Static18.method539(1003, true, 0, -1, local179.anInt1915, local179.aString36, local179.aStringArray9[0], (long) local170.aClass1_Sub51_1.anInt9566, false, -1);
					}
				}
				if (!local170.aClass1_Sub51_1.aBoolean709) {
					local170.aClass1_Sub51_1.aBoolean709 = true;
					Static173.method3216(Static91.aClass155_26, local170.aClass1_Sub51_1.anInt9566, local179.anInt1915);
				}
				if (local170.aClass1_Sub51_1.aBoolean709) {
					Static173.method3216(Static59.aClass155_1, local170.aClass1_Sub51_1.anInt9566, local179.anInt1915);
				}
			} else if (local170.aClass1_Sub51_1.aBoolean709) {
				local170.aClass1_Sub51_1.aBoolean709 = false;
				Static173.method3216(Static410.aClass155_22, local170.aClass1_Sub51_1.anInt9566, local179.anInt1915);
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(Z)V")
	public static void method3657() {
		for (@Pc(12) int local12 = 0; local12 < Static482.anInt8558; local12++) {
			@Pc(18) Class182 local18 = Static314.aClass182Array1[local12];
			if (local18.aByte70 == 2) {
				if (local18.aClass1_Sub4_Sub1_1 == null) {
					local18.anInt5555 = Integer.MIN_VALUE;
				} else {
					Static475.aClass1_Sub4_Sub2_2.method3184(local18.aClass1_Sub4_Sub1_1);
				}
			}
		}
	}
}
