import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1399 = method2971("<br>(X");

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1402 = method2971("Please enter your password)3");

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1400 = aClass13_1402;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1401 = method2971("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1403 = method2971(")4l");

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1404 = method2971("scrollbar");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIILclient!fd;)V")
	public static void method2969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class20 arg6) {
		if (Static67.aBoolean152) {
			Static55.anInt1762 = 32;
		} else {
			Static55.anInt1762 = 0;
		}
		Static67.aBoolean152 = false;
		@Pc(118) int local118;
		if (Static148.anInt3596 != 0) {
			if (arg4 >= arg2 && arg4 < arg2 + 16 && arg0 >= arg3 && arg3 + 16 > arg0) {
				arg6.anInt1592 -= 4;
				Static125.method2300(arg6);
			} else if (arg2 <= arg4 && arg4 < arg2 + 16 && arg0 >= arg1 + arg3 - 16 && arg3 + arg1 > arg0) {
				arg6.anInt1592 += 4;
				Static125.method2300(arg6);
			} else if (arg2 - Static55.anInt1762 <= arg4 && Static55.anInt1762 + arg2 + 16 > arg4 && arg0 >= arg3 + 16 && arg0 < arg1 + arg3 - 16) {
				local118 = arg1 * (arg1 - 32) / arg5;
				if (local118 < 8) {
					local118 = 8;
				}
				@Pc(137) int local137 = arg0 - local118 / 2 - arg3 - 16;
				@Pc(143) int local143 = arg1 - local118 - 32;
				arg6.anInt1592 = local137 * (arg5 - arg1) / local143;
				Static125.method2300(arg6);
				Static67.aBoolean152 = true;
			}
		}
		if (Static148.anInt3599 == 0) {
			return;
		}
		local118 = arg6.anInt1559;
		if (arg2 - local118 <= arg4 && arg0 >= arg3 && arg4 < arg2 + 16 && arg3 + arg1 >= arg0) {
			arg6.anInt1592 += Static148.anInt3599 * 45;
			Static125.method2300(arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ve;I)V")
	public static void method2970(@OriginalArg(0) Class1_Sub12 arg0) {
		if (arg0.aClass1_Sub4_5 != null) {
			arg0.aClass1_Sub4_5.anInt309 = 0;
		}
		arg0.aBoolean281 = false;
		for (@Pc(23) Class1_Sub12 local23 = arg0.method2630(); local23 != null; local23 = arg0.method2629()) {
			method2970(local23);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;)Lclient!dd;")
	public static Class13 method2971(@OriginalArg(1) String arg0) {
		@Pc(14) byte[] local14 = arg0.getBytes();
		@Pc(17) int local17 = local14.length;
		@Pc(19) int local19 = 0;
		@Pc(23) Class13 local23 = new Class13();
		local23.aByteArray19 = new byte[local17];
		while (local19 < local17) {
			@Pc(35) int local35 = local14[local19++] & 0xFF;
			if (local35 <= 45 && local35 >= 40) {
				if (local17 <= local19) {
					break;
				}
				@Pc(51) int local51 = local14[local19++] & 0xFF;
				local23.aByteArray19[local23.anInt1080++] = (byte) (local51 + (local35 + -40) * 43 - 48);
			} else if (local35 != 0) {
				local23.aByteArray19[local23.anInt1080++] = (byte) local35;
			}
		}
		local23.method875();
		return local23.method890();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public static void method2972() {
		aClass13_1399 = null;
		aClass13_1404 = null;
		aClass13_1400 = null;
		aClass13_1403 = null;
		aClass13_1402 = null;
		aClass13_1401 = null;
	}
}
