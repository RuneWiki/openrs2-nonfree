import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Lclient!hn;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
	public static int[] anIntArray259 = new int[200];

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "S")
	public static short aShort47 = 256;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
	public static int anInt2473 = 0;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "[I")
	public static int[] anIntArray260 = new int[128];

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString148 = "Loaded fonts";

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
	public static int anInt2476 = 0;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)I")
	public static int method1841() {
		return Static245.anInt5017;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIILclient!hd;IJZ)Z")
	public static boolean method1842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static79.method1342(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public static void method1844(@OriginalArg(0) int arg0) {
		if (Static99.method1656(arg0)) {
			Static171.method2790(Static34.aClass191ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)V")
	public static void method1845(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub3_Sub22 local4 = Static271.method4108(14, arg0);
		local4.method4464();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)I")
	public static int method1846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static237.anIntArray462[Static26.method590(arg0, arg2)];
		if (arg1 > 0) {
			@Pc(20) int local20 = Static237.anInterface1_1.method4596(arg1 & 0xFFFF);
			@Pc(31) int local31;
			@Pc(56) int local56;
			if (local20 != 0) {
				if (arg2 < 0) {
					local31 = 0;
				} else if (arg2 <= 127) {
					local31 = arg2 * 131586;
				} else {
					local31 = 16777215;
				}
				if (local20 == 256) {
					local7 = local31;
				} else {
					local56 = 256 - local20;
					local7 = ((local31 & 0xFF00FF) * local20 + local56 * (local7 & 0xFF00FF) & 0xFF00FF00) + ((local31 & 0xFF00) * local20 + local56 * (local7 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local31 = Static237.anInterface1_1.method4600(arg1 & 0xFFFF);
			if (local31 != 0) {
				local31 += 256;
				@Pc(110) int local110 = (local7 & 0xFF) * local31;
				local56 = (local7 >> 8 & 0xFF) * local31;
				if (local56 > 65535) {
					local56 = 65535;
				}
				if (local110 > 65535) {
					local110 = 65535;
				}
				@Pc(137) int local137 = local31 * (local7 >> 16 & 0xFF);
				if (local137 > 65535) {
					local137 = 65535;
				}
				local7 = (local110 >> 8) + ((local137 << 8 & 0xFF0093) + (local56 & 0xFF00));
			}
		}
		return local7;
	}
}
