import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	public static int anInt5146;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
	public static int anInt5148;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "[I")
	public static int[] anIntArray531 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "[I")
	public static int[] anIntArray532 = new int[200];

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray22 = new boolean[5];

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	public static int anInt5155 = 1;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I")
	public static int method4055(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local15 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local15;
		} else {
			return local15;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!kb;IILclient!kb;)Lclient!rg;")
	public static Class1_Sub2_Sub16_Sub2 method4056(@OriginalArg(1) Class83 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class83 arg2) {
		return Static19.method387(arg1, 0, arg0) ? Static134.method2298(arg2.method2306(arg1, 0)) : null;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIII)V")
	public static void method4057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static102.anInt2239 <= arg0 && Static88.anInt2052 >= arg4 && arg1 >= Static152.anInt3532 && Static223.anInt1245 >= arg3) {
			if (arg2 == 1) {
				Static259.method4397(arg3, arg1, arg0, arg5, arg4);
			} else {
				Static286.method4701(arg3, arg0, arg2, arg5, arg1, arg4);
			}
		} else if (arg2 == 1) {
			Static16.method363(arg0, arg3, arg5, arg1, arg4);
		} else {
			Static243.method4186(arg4, arg3, arg5, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Z")
	public static boolean method4058() {
		return Static115.anInt2536 == 0 ? Static141.aClass1_Sub3_Sub2_2.method997() : true;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!kb;ZLclient!kb;IB)Lclient!ij;")
	public static Class1_Sub2_Sub12 method4060(@OriginalArg(0) Class83 arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) int[] local17 = arg0.method2326(arg2);
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(35) byte[] local35 = arg0.method2329(arg2, local17[local19]);
			if (local35 == null) {
				local12 = false;
			} else {
				@Pc(57) int local57 = local35[1] & 0xFF | (local35[0] & 0xFF) << 8;
				@Pc(67) byte[] local67 = arg1.method2329(local57, 0);
				if (local67 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class1_Sub2_Sub12(arg0, arg1, arg2, false);
		} catch (@Pc(97) Exception local97) {
			return null;
		}
	}
}
