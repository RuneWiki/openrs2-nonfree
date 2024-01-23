import java.awt.Font;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Z")
	public static boolean aBoolean361;

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "Lclient!ek;")
	public static Class42 aClass42_92;

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "[Lclient!bn;")
	public static Class2_Sub8_Sub1[] aClass2_Sub8_Sub1Array10;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
	public static int anInt5422 = 0;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
	public static int anInt5425 = 0;

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
	public static int anInt5426 = 0;

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString186 = "wave:";

	@OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
	public static int anInt5430 = 0;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLclient!oe;)Lclient!ag;")
	public static Class7 method4311(@OriginalArg(1) Class2_Sub16 arg0) {
		@Pc(12) Class7 local12 = new Class7();
		local12.anInt121 = arg0.method2130();
		local12.aClass2_Sub8_Sub8_1 = Static231.method3762(local12.anInt121);
		return local12;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!oe;)V")
	public static void method4313(@OriginalArg(1) Class2_Sub16 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static39.anInt981; local11++) {
			@Pc(18) int local18 = arg0.method2161();
			@Pc(22) int local22 = arg0.method2130();
			if (local22 == 65535) {
				local22 = -1;
			}
			if (Static279.aClass58_Sub1Array2[local18] != null) {
				Static279.aClass58_Sub1Array2[local18].anInt2150 = local22;
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(ILclient!oe;)V")
	public static void method4314(@OriginalArg(1) Class2_Sub16 arg0) {
		if (arg0.aByteArray17.length - arg0.anInt2789 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method2146();
		if (local20 < 0 || local20 > 11) {
			return;
		}
		@Pc(47) byte local47;
		if (local20 == 11) {
			local47 = 33;
		} else if (local20 == 10) {
			local47 = 32;
		} else if (local20 == 9) {
			local47 = 31;
		} else if (local20 == 8) {
			local47 = 30;
		} else if (local20 == 7) {
			local47 = 29;
		} else if (local20 == 6) {
			local47 = 28;
		} else if (local20 == 5) {
			local47 = 28;
		} else if (local20 == 4) {
			local47 = 24;
		} else if (local20 == 3) {
			local47 = 23;
		} else if (local20 == 2) {
			local47 = 22;
		} else if (local20 == 1) {
			local47 = 23;
		} else {
			local47 = 19;
		}
		if (arg0.aByteArray17.length - arg0.anInt2789 < local47) {
			return;
		}
		Static178.anInt5291 = arg0.method2146();
		if (Static178.anInt5291 < 1) {
			Static178.anInt5291 = 1;
		} else if (Static178.anInt5291 > 4) {
			Static178.anInt5291 = 4;
		}
		Static253.method3985(arg0.method2146() == 1);
		Static3.aBoolean8 = arg0.method2146() == 1;
		Static185.aBoolean365 = arg0.method2146() == 1;
		Static19.aBoolean30 = arg0.method2146() == 1;
		Static226.aBoolean403 = arg0.method2146() == 1;
		Static154.aBoolean236 = arg0.method2146() == 1;
		Static206.aBoolean292 = arg0.method2146() == 1;
		Static191.aBoolean276 = arg0.method2146() == 1;
		Static243.anInt4839 = arg0.method2146();
		if (Static243.anInt4839 > 2) {
			Static243.anInt4839 = 2;
		}
		if (local20 >= 2) {
			Static265.aBoolean348 = arg0.method2146() == 1;
		} else {
			Static265.aBoolean348 = arg0.method2146() == 1;
			arg0.method2146();
		}
		Static74.aBoolean118 = arg0.method2146() == 1;
		Static40.aBoolean64 = arg0.method2146() == 1;
		Static262.anInt5150 = arg0.method2146();
		if (Static262.anInt5150 > 2) {
			Static262.anInt5150 = 2;
		}
		Static214.anInt4370 = Static262.anInt5150;
		Static49.aBoolean87 = arg0.method2146() == 1;
		Static99.anInt2343 = arg0.method2146();
		if (Static99.anInt2343 > 127) {
			Static99.anInt2343 = 127;
		}
		Static287.anInt5651 = arg0.method2146();
		Static201.anInt4203 = arg0.method2146();
		if (Static201.anInt4203 > 127) {
			Static201.anInt4203 = 127;
		}
		if (local20 >= 1) {
			Static248.anInt2151 = arg0.method2130();
			Static202.anInt2813 = arg0.method2130();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method2146();
		}
		if (local20 >= 4) {
			@Pc(380) int local380 = arg0.method2146();
			if (Static167.anInt3694 < 96) {
				local380 = 0;
			}
			Static97.method1696(local380);
		}
		if (local20 >= 5) {
			Static215.anInt4387 = arg0.method2145();
		}
		if (local20 >= 6) {
			Static119.anInt5242 = arg0.method2146();
		}
		if (local20 >= 7) {
			Static128.aBoolean205 = arg0.method2146() == 1;
		}
		if (local20 >= 8) {
			Static41.aBoolean65 = arg0.method2146() == 1;
		}
		if (local20 >= 9) {
			Static272.anInt5414 = arg0.method2146();
		}
		if (local20 >= 10) {
			Static60.aBoolean96 = arg0.method2146() != 0;
		}
		if (local20 >= 11) {
			Static261.aBoolean343 = arg0.method2146() != 0;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
	public static void method4315() {
		Static232.aClass157_39.method4027();
		Static105.aClass157_9.method4027();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)I")
	public static int method4317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub10 local12 = (Class2_Sub10) Static219.aClass101_18.method2867((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < local12.anIntArray104.length; local36++) {
				if (arg1 == local12.anIntArray105[local36]) {
					local34 += local12.anIntArray104[local36];
				}
			}
			return local34;
		}
	}
}
