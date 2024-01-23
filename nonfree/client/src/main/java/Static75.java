import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!fh", name = "sb", descriptor = "I")
	public static int anInt2048;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
	public static int anInt1991 = -1;

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)I")
	private static int method1824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(6) int local6 = arg0;
			arg0 = arg1;
			arg1 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg4;
		} else if (local14 == 1) {
			return arg5;
		} else if (local14 == 2) {
			return 7 + 1 - arg4 - arg0;
		} else {
			return 7 + 1 - arg5 - arg1;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[BIZII[Lclient!gd;IIII)V")
	public static void method1840(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class60[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) Class1_Sub13 local6 = new Class1_Sub13(arg1);
		@Pc(13) int local13 = -1;
		while (true) {
			@Pc(19) int local19 = local6.method1846();
			if (local19 == 0) {
				return;
			}
			local13 += local19;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(38) int local38 = local6.method1830();
				if (local38 == 0) {
					break;
				}
				local32 += local38 - 1;
				@Pc(53) int local53 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 12;
				@Pc(63) int local63 = local32 >> 6 & 0x3F;
				@Pc(67) int local67 = local6.method1853();
				@Pc(71) int local71 = local67 >> 2;
				@Pc(75) int local75 = local67 & 0x3;
				if (arg5 == local57 && arg7 <= local63 && arg7 + 8 > local63 && arg4 <= local53 && arg4 + 8 > local53) {
					@Pc(106) Class150 local106 = Static160.method2744(local13);
					@Pc(123) int local123 = method1824(local106.anInt4532, local106.anInt4562, arg0, local75, local63 & 0x7, local53 & 0x7) + arg9;
					@Pc(140) int local140 = Static48.method904(arg0, local75, local106.anInt4562, local53 & 0x7, local106.anInt4532, local63 & 0x7) + arg8;
					if (local123 > 0 && local140 > 0 && local123 < 103 && local140 < 103) {
						@Pc(157) Class60 local157 = null;
						if (!arg3) {
							@Pc(161) int local161 = arg2;
							if ((Static17.aByteArrayArrayArray1[1][local123][local140] & 0x2) == 2) {
								local161 = arg2 - 1;
							}
							if (local161 >= 0) {
								local157 = arg6[local161];
							}
						}
						Static42.method778(!arg3, local75 + arg0 & 0x3, local13, arg2, local71, arg3, local123, arg2, local140, local157);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IC)Z")
	public static boolean method1841(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(38) char[] local38 = Static76.aCharArray5;
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				@Pc(48) char local48 = local38[local40];
				if (arg0 == local48) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZIZLjava/lang/String;ZLjava/lang/String;JII)V")
	public static void method1855(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) String arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) String arg6, @OriginalArg(8) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class1_Sub13 local28 = new Class1_Sub13(128);
		local28.method1822(10);
		local28.method1835((arg1 ? 1 : 0) | (arg3 ? 2 : 0) | (arg5 ? 4 : 0));
		local28.method1857(arg7);
		local28.method1851(local8[0]);
		local28.method1852(arg4);
		local28.method1851(local8[1]);
		local28.method1835(Static158.anInt3622);
		local28.method1822(arg9);
		local28.method1822(arg8);
		local28.method1851(local8[2]);
		local28.method1835(arg2);
		local28.method1835(arg0);
		local28.method1851(local8[3]);
		local28.method1854(Static299.aBigInteger2, Static265.aBigInteger1);
		@Pc(116) Class1_Sub13 local116 = new Class1_Sub13(350);
		local116.method1852(arg6);
		@Pc(130) int local130 = 8 - Static56.method1012(arg6) % 8;
		for (@Pc(132) int local132 = 0; local132 < local130; local132++) {
			local116.method1822((int) (Math.random() * 255.0D));
		}
		local116.method1850(local8);
		Static116.aClass1_Sub13_Sub1_48.anInt2018 = 0;
		Static116.aClass1_Sub13_Sub1_48.method1822(22);
		Static116.aClass1_Sub13_Sub1_48.method1835(local28.anInt2018 + local116.anInt2018 + 2);
		Static116.aClass1_Sub13_Sub1_48.method1835(548);
		Static116.aClass1_Sub13_Sub1_48.method1864(local28.aByteArray63, local28.anInt2018);
		Static116.aClass1_Sub13_Sub1_48.method1864(local116.aByteArray63, local116.anInt2018);
		Static74.anInt1611 = 1;
		Static145.anInt2812 = 0;
		Static104.anInt2212 = -3;
		Static56.anInt1210 = 0;
	}
}
