import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "Lclient!ul;")
	public static Class246 aClass246_111;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Lclient!nm;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
	public static int anInt3381 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	public static void method2935() {
		for (@Pc(10) Class1_Sub42 local10 = (Class1_Sub42) Static16.aClass181_4.method4112(); local10 != null; local10 = (Class1_Sub42) Static16.aClass181_4.method4104()) {
			if (local10.anInt6551 > 0) {
				local10.anInt6551--;
			}
			if (local10.anInt6551 != 0) {
				if (local10.anInt6563 > 0) {
					local10.anInt6563--;
				}
				if (local10.anInt6563 == 0 && local10.anInt6560 >= 1 && local10.anInt6557 >= 1 && Static195.anInt3537 - 2 >= local10.anInt6560 && Static118.anInt2419 - 2 >= local10.anInt6557 && (local10.anInt6559 < 0 || Static371.method5812(local10.anInt6559, local10.anInt6562))) {
					Static26.method558(local10.anInt6557, local10.anInt6554, local10.anInt6553, -1, local10.anInt6562, local10.anInt6559, local10.anInt6560, local10.anInt6556);
					local10.anInt6563 = -1;
					if (local10.anInt6561 == local10.anInt6559 && local10.anInt6561 == -1) {
						local10.method6020();
					} else if (local10.anInt6559 == local10.anInt6561 && local10.anInt6550 == local10.anInt6554 && local10.anInt6562 == local10.anInt6555) {
						local10.method6020();
					}
				}
			} else if (local10.anInt6561 < 0 || Static371.method5812(local10.anInt6561, local10.anInt6555)) {
				Static26.method558(local10.anInt6557, local10.anInt6550, local10.anInt6553, -1, local10.anInt6555, local10.anInt6561, local10.anInt6560, local10.anInt6556);
				local10.method6020();
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLclient!uq;II)V")
	public static void method2936(@OriginalArg(1) Class251 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static218.aClass251_7 = arg0;
		Static374.anInt6113 = arg2;
		Static254.anInt4598 = arg1;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIZII)V")
	public static void method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static38.aClass135_Sub1_1.anInt5110 != 0 && arg1 != 0 && Static259.anInt4646 < 50 && arg2 != -1) {
			Static113.aClass74Array1[Static259.anInt4646++] = new Class74((byte) 1, arg2, arg1, arg4, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method2939(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) byte[] local9 = new byte[local6];
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(20) char local20 = arg0.charAt(local11);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				local9[local11] = (byte) local20;
			} else if (local20 == '€') {
				local9[local11] = -128;
			} else if (local20 == '‚') {
				local9[local11] = -126;
			} else if (local20 == 'ƒ') {
				local9[local11] = -125;
			} else if (local20 == '„') {
				local9[local11] = -124;
			} else if (local20 == '…') {
				local9[local11] = -123;
			} else if (local20 == '†') {
				local9[local11] = -122;
			} else if (local20 == '‡') {
				local9[local11] = -121;
			} else if (local20 == 'ˆ') {
				local9[local11] = -120;
			} else if (local20 == '‰') {
				local9[local11] = -119;
			} else if (local20 == 'Š') {
				local9[local11] = -118;
			} else if (local20 == '‹') {
				local9[local11] = -117;
			} else if (local20 == 'Œ') {
				local9[local11] = -116;
			} else if (local20 == 'Ž') {
				local9[local11] = -114;
			} else if (local20 == '‘') {
				local9[local11] = -111;
			} else if (local20 == '’') {
				local9[local11] = -110;
			} else if (local20 == '“') {
				local9[local11] = -109;
			} else if (local20 == '”') {
				local9[local11] = -108;
			} else if (local20 == '•') {
				local9[local11] = -107;
			} else if (local20 == '–') {
				local9[local11] = -106;
			} else if (local20 == '—') {
				local9[local11] = -105;
			} else if (local20 == '˜') {
				local9[local11] = -104;
			} else if (local20 == '™') {
				local9[local11] = -103;
			} else if (local20 == 'š') {
				local9[local11] = -102;
			} else if (local20 == '›') {
				local9[local11] = -101;
			} else if (local20 == 'œ') {
				local9[local11] = -100;
			} else if (local20 == 'ž') {
				local9[local11] = -98;
			} else if (local20 == 'Ÿ') {
				local9[local11] = -97;
			} else {
				local9[local11] = 63;
			}
		}
		return local9;
	}
}
