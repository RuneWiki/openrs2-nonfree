import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_23;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "Lclient!ge;")
	public static Class39 aClass39_17 = new Class39(64);

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1174 = Static200.method3116("p11_full");

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
	public static int anInt3414 = 0;

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1175 = Static200.method3116("sl_button");

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1176 = Static200.method3116("Loaded input handler");

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1177 = Static200.method3116("::fpsoff");

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1178 = aClass60_1176;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "[I")
	public static int[] anIntArray442 = new int[32];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIILclient!dd;IZJ)Z")
	public static boolean method2597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class9 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static83.anInt1959 || local4 >= Static150.anInt3350) {
					return false;
				}
				@Pc(25) Class1_Sub22 local25 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][local1][local4];
				if (local25 != null && local25.anInt3358 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class29 local49 = new Class29();
		local49.aLong43 = arg11;
		local49.anInt1434 = arg0;
		local49.anInt1440 = arg5;
		local49.anInt1435 = arg6;
		local49.anInt1429 = arg7;
		local49.aClass9_3 = arg8;
		local49.anInt1428 = arg9;
		local49.anInt1437 = arg1;
		local49.anInt1423 = arg2;
		local49.anInt1430 = arg1 + arg3 - 1;
		local49.anInt1431 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static100.aClass1_Sub22ArrayArrayArray3[local124][local92][local95] == null) {
						Static100.aClass1_Sub22ArrayArrayArray3[local124][local92][local95] = new Class1_Sub22(local124, local92, local95);
					}
				}
				@Pc(157) Class1_Sub22 local157 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][local92][local95];
				local157.aClass29Array3[local157.anInt3358] = local49;
				local157.anIntArray435[local157.anInt3358] = local98;
				local157.anInt3354 |= local98;
				local157.anInt3358++;
			}
		}
		if (arg10) {
			Static141.aClass29Array2[Static4.anInt97++] = local49;
		}
		return true;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)Lclient!oe;")
	public static Class1_Sub1_Sub19 method2598(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub19 local10 = (Class1_Sub1_Sub19) Static27.aClass39_6.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30;
		if (arg0 < 32768) {
			local30 = Static47.aClass7_10.method3242(1, arg0);
		} else {
			local30 = Static28.aClass7_25.method3242(1, arg0 & 0x7FFF);
		}
		local10 = new Class1_Sub1_Sub19();
		if (local30 != null) {
			local10.method2406(new Class1_Sub9(local30));
		}
		if (arg0 >= 32768) {
			local10.method2396();
		}
		Static27.aClass39_6.method1152((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V")
	public static void method2599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub27 local12 = (Class1_Sub27) Static121.aClass33_7.method1071((long) arg2);
		if (local12 == null) {
			local12 = new Class1_Sub27();
			Static121.aClass33_7.method1072((long) arg2, local12);
		}
		if (arg1 >= local12.anIntArray656.length) {
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(43) int[] local43 = new int[arg1 + 1];
			for (@Pc(45) int local45 = 0; local45 < local12.anIntArray656.length; local45++) {
				local38[local45] = local12.anIntArray656[local45];
				local43[local45] = local12.anIntArray657[local45];
			}
			for (@Pc(71) int local71 = local12.anIntArray656.length; local71 < arg1; local71++) {
				local38[local71] = -1;
				local43[local71] = 0;
			}
			local12.anIntArray656 = local38;
			local12.anIntArray657 = local43;
		}
		local12.anIntArray656[arg1] = arg0;
		local12.anIntArray657[arg1] = arg3;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BIIIII)V")
	public static void method2601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg0;
		@Pc(19) int local19 = arg2 - arg1;
		if (local10 == 0) {
			if (local19 != 0) {
				Static196.method3051(arg4, arg0, arg1, arg2);
			}
		} else if (local19 == 0) {
			Static31.method590(arg1, arg4, arg0, arg3);
		} else {
			@Pc(48) int local48 = (local19 << 12) / local10;
			@Pc(57) int local57 = arg1 - (local48 * arg0 >> 12);
			@Pc(65) int local65;
			@Pc(67) int local67;
			if (arg0 < Static214.anInt4572) {
				local67 = local57 + (Static214.anInt4572 * local48 >> 12);
				local65 = Static214.anInt4572;
			} else if (Static130.anInt2847 >= arg0) {
				local65 = arg0;
				local67 = arg1;
			} else {
				local67 = local57 + (Static130.anInt2847 * local48 >> 12);
				local65 = Static130.anInt2847;
			}
			if (Static141.anInt3163 > local67) {
				local65 = (Static141.anInt3163 - local57 << 12) / local48;
				local67 = Static141.anInt3163;
			} else if (Static200.anInt4273 < local67) {
				local65 = (Static200.anInt4273 - local57 << 12) / local48;
				local67 = Static200.anInt4273;
			}
			@Pc(137) int local137;
			@Pc(145) int local145;
			if (Static214.anInt4572 > arg3) {
				local145 = (local48 * Static214.anInt4572 >> 12) + local57;
				local137 = Static214.anInt4572;
			} else if (Static130.anInt2847 < arg3) {
				local137 = Static130.anInt2847;
				local145 = (local48 * Static130.anInt2847 >> 12) + local57;
			} else {
				local145 = arg2;
				local137 = arg3;
			}
			if (Static141.anInt3163 > local145) {
				local145 = Static141.anInt3163;
				local137 = (Static141.anInt3163 - local57 << 12) / local48;
			} else if (local145 > Static200.anInt4273) {
				local145 = Static200.anInt4273;
				local137 = (Static200.anInt4273 - local57 << 12) / local48;
			}
			Static148.method3516(local67, local137, local145, local65, arg4);
		}
	}
}
