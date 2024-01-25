import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ol", name = "G", descriptor = "[Lclient!lf;")
	public static Class90[] aClass90Array11;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "[[B")
	public static final byte[][] aByteArrayArray15 = new byte[250][];

	@OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
	public static int anInt4474 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V")
	public static void method4122(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static203.aByteArrayArray12;
		} else {
			local9 = Static61.aByteArrayArray4;
		}
		@Pc(16) int local16 = Static28.aByteArrayArray2.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = local9[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static80.anIntArray184[local18] >> 8) * 64 - Static182.anInt3775;
				@Pc(48) int local48 = (Static80.anIntArray184[local18] & 0xFF) * 64 - Static161.anInt3315;
				Static278.method4804();
				Static311.method5242(Static34.aClass2_6, local48, Static24.aClass91Array1, arg0, local37, local24);
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(B)I")
	public static int method4125() {
		return Static130.anInt2532;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIZI)V")
	public static void method4126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static106.anInt2157 && arg3 <= Static251.anInt6512) {
			@Pc(19) int local19 = Static216.method3969(Static291.anInt5657, arg2, Static49.anInt1124);
			@Pc(25) int local25 = Static216.method3969(Static291.anInt5657, arg0, Static49.anInt1124);
			Static301.method5136(local19, arg1, arg3, local25);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
	public static void method4127() {
		Static99.anInt1954 = -1;
		Static254.aClass90_15 = null;
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V")
	public static void method4128() {
		Static171.method3410(Static75.anInt1518);
		@Pc(17) int local17 = (Static221.anInt4363 >> 10) + (Static182.anInt3775 >> 3);
		@Pc(25) int local25 = (Static161.anInt3315 >> 3) + (Static164.anInt3425 >> 10);
		Static343.aByteArrayArray17 = new byte[18][];
		Static346.aByteArrayArray21 = new byte[18][];
		Static63.anIntArray153 = new int[18];
		Static50.anIntArrayArray5 = new int[18][4];
		Static299.anIntArray724 = new int[18];
		Static28.aByteArrayArray2 = new byte[18][];
		Static16.anIntArray43 = new int[18];
		Static203.aByteArrayArray12 = new byte[18][];
		Static58.anIntArray145 = new int[18];
		Static61.aByteArrayArray4 = new byte[18][];
		Static269.anIntArray658 = new int[18];
		Static80.anIntArray184 = new int[18];
		@Pc(75) int local75 = 0;
		@Pc(94) int local94;
		for (@Pc(83) int local83 = (local17 - (Static48.anInt1107 >> 4)) / 8; local83 <= ((Static48.anInt1107 >> 4) + local17) / 8; local83++) {
			for (local94 = (local25 - (Static337.anInt6402 >> 4)) / 8; local94 <= ((Static337.anInt6402 >> 4) + local25) / 8; local94++) {
				@Pc(103) int local103 = (local83 << 8) + local94;
				Static80.anIntArray184[local75] = local103;
				Static269.anIntArray658[local75] = Static316.aClass165_94.method4502("m" + local83 + "_" + local94);
				Static299.anIntArray724[local75] = Static316.aClass165_94.method4502("l" + local83 + "_" + local94);
				Static63.anIntArray153[local75] = Static316.aClass165_94.method4502("n" + local83 + "_" + local94);
				Static58.anIntArray145[local75] = Static316.aClass165_94.method4502("um" + local83 + "_" + local94);
				Static16.anIntArray43[local75] = Static316.aClass165_94.method4502("ul" + local83 + "_" + local94);
				if (Static63.anIntArray153[local75] == -1) {
					Static269.anIntArray658[local75] = -1;
					Static299.anIntArray724[local75] = -1;
					Static58.anIntArray145[local75] = -1;
					Static16.anIntArray43[local75] = -1;
				}
				local75++;
			}
		}
		for (local94 = local75; local94 < Static63.anIntArray153.length; local94++) {
			Static63.anIntArray153[local94] = -1;
			Static269.anIntArray658[local94] = -1;
			Static299.anIntArray724[local94] = -1;
			Static58.anIntArray145[local94] = -1;
			Static16.anIntArray43[local94] = -1;
		}
		Static291.method4961(true, 0, 8, local25, local17, 8, false);
	}
}
