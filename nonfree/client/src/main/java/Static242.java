import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "Lclient!un;")
	public static Class59 aClass59_3;

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "Lclient!ms;")
	public static Class137 aClass137_17 = null;

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
	public static int anInt5710 = 1;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BIIII)V")
	public static void method4803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg3;
		@Pc(16) int local16 = -arg3;
		Static224.method5303(Static73.anIntArrayArray6[arg0], arg3 + arg2, arg1, arg2 - arg3);
		@Pc(31) int local31 = -1;
		while (local13 > local11) {
			local31 += 2;
			local11++;
			local16 += local31;
			if (local16 >= 0) {
				local13--;
				local16 -= local13 << 1;
				@Pc(57) int[] local57 = Static73.anIntArrayArray6[local13 + arg0];
				@Pc(63) int[] local63 = Static73.anIntArrayArray6[arg0 - local13];
				@Pc(67) int local67 = local11 + arg2;
				@Pc(72) int local72 = arg2 - local11;
				Static224.method5303(local57, local67, arg1, local72);
				Static224.method5303(local63, local67, arg1, local72);
			}
			@Pc(88) int local88 = local13 + arg2;
			@Pc(93) int local93 = arg2 - local13;
			@Pc(100) int[] local100 = Static73.anIntArrayArray6[arg0 + local11];
			@Pc(107) int[] local107 = Static73.anIntArrayArray6[arg0 - local11];
			Static224.method5303(local100, local88, arg1, local93);
			Static224.method5303(local107, local88, arg1, local93);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZ)V")
	public static void method4804(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		Static263.anIntArrayArrayArray13 = new int[arg0][Static24.anInt454 + 1][Static240.anInt4832 + 1];
		Static237.anIntArray377 = new int[Static240.anInt4832];
		Static39.aByteArrayArrayArray2 = new byte[arg0][Static24.anInt454][Static240.anInt4832];
		Static193.anIntArray304 = new int[5];
		Static56.aByteArrayArrayArray3 = new byte[arg0][Static24.anInt454][Static240.anInt4832];
		Static258.anIntArray400 = new int[Static240.anInt4832];
		if (!arg1) {
			Static128.aByteArrayArrayArray4 = null;
		}
		Static166.anIntArray217 = new int[Static240.anInt4832];
		Static155.aByteArrayArrayArray5 = new byte[arg0][Static24.anInt454][Static240.anInt4832];
		Static184.anIntArray281 = new int[Static240.anInt4832];
		Static217.anInt4442 = 99;
		Static240.aByteArrayArrayArray8 = new byte[arg0][Static24.anInt454][Static240.anInt4832];
		Static7.anIntArray10 = new int[Static240.anInt4832];
		Static277.aByteArrayArrayArray11 = new byte[arg0][Static24.anInt454 + 1][Static240.anInt4832 + 1];
	}

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)V")
	public static void method4805() {
		if (Static107.anInt2025 == 0) {
			return;
		}
		try {
			if (++Static221.anInt4500 > 1500) {
				if (Static291.aClass156_103 != null) {
					Static291.aClass156_103.method4190();
					Static291.aClass156_103 = null;
				}
				if (Static24.anInt453 >= 1) {
					Static243.anInt6755 = -5;
					Static107.anInt2025 = 0;
					return;
				}
				Static107.anInt2025 = 1;
				Static24.anInt453++;
				if (Static68.anInt1253 == Static137.anInt2556) {
					Static68.anInt1253 = Static122.anInt2278;
				} else {
					Static68.anInt1253 = Static137.anInt2556;
				}
				Static221.anInt4500 = 0;
			}
			if (Static107.anInt2025 == 1) {
				Static86.aClass2_3 = Static77.aClass118_7.method2708(Static68.anInt1253, Static206.aString40);
				Static107.anInt2025 = 2;
			}
			@Pc(125) int local125;
			if (Static107.anInt2025 == 2) {
				if (Static86.aClass2_3.anInt6 == 2) {
					throw new IOException();
				}
				if (Static86.aClass2_3.anInt6 != 1) {
					return;
				}
				Static291.aClass156_103 = new Class156((Socket) Static86.aClass2_3.anObject1, Static77.aClass118_7);
				Static86.aClass2_3 = null;
				Static291.aClass156_103.method4183(Static313.aClass11_Sub25_Sub1_5.aByteArray93, Static313.aClass11_Sub25_Sub1_5.anInt6076);
				if (Static126.aClass78_4 != null) {
					Static126.aClass78_4.method5519();
				}
				if (Static143.aClass78_3 != null) {
					Static143.aClass78_3.method5519();
				}
				local125 = Static291.aClass156_103.method4187();
				if (Static126.aClass78_4 != null) {
					Static126.aClass78_4.method5519();
				}
				if (Static143.aClass78_3 != null) {
					Static143.aClass78_3.method5519();
				}
				if (local125 != 101) {
					Static243.anInt6755 = local125;
					Static107.anInt2025 = 0;
					Static291.aClass156_103.method4190();
					Static291.aClass156_103 = null;
					return;
				}
				Static107.anInt2025 = 3;
			}
			if (Static107.anInt2025 == 3 && Static291.aClass156_103.method4193() >= 2) {
				local125 = Static291.aClass156_103.method4187() << 8 | Static291.aClass156_103.method4187();
				Static105.method1609(local125);
				if (Static155.anInt2961 == -1) {
					Static107.anInt2025 = 0;
					Static243.anInt6755 = 6;
					Static291.aClass156_103.method4190();
					Static291.aClass156_103 = null;
				} else {
					Static107.anInt2025 = 0;
					Static291.aClass156_103.method4190();
					Static291.aClass156_103 = null;
					Static1.method3();
				}
			}
		} catch (@Pc(210) IOException local210) {
			if (Static291.aClass156_103 != null) {
				Static291.aClass156_103.method4190();
				Static291.aClass156_103 = null;
			}
			if (Static24.anInt453 < 1) {
				Static221.anInt4500 = 0;
				Static24.anInt453++;
				Static107.anInt2025 = 1;
				if (Static137.anInt2556 == Static68.anInt1253) {
					Static68.anInt1253 = Static122.anInt2278;
				} else {
					Static68.anInt1253 = Static137.anInt2556;
				}
			} else {
				Static243.anInt6755 = -4;
				Static107.anInt2025 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V")
	public static void method4806() {
		for (@Pc(3) int local3 = 0; local3 < Static90.anInt4650; local3++) {
			@Pc(9) int local9 = Static309.anIntArray498[local3];
			@Pc(13) Class67_Sub3_Sub3_Sub2 local13 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local9];
			@Pc(17) int local17 = Static246.aClass11_Sub25_Sub1_3.method5185();
			if ((local17 & 0x40) != 0) {
				local17 += Static246.aClass11_Sub25_Sub1_3.method5185() << 8;
			}
			Static140.method2171(local17, local13, local9);
		}
	}
}
