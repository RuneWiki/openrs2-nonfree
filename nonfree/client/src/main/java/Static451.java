import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!og", name = "z", descriptor = "I")
	public static int anInt7308 = -1;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "[I")
	public static final int[] anIntArray523 = new int[3];

	@OriginalMember(owner = "client!og", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method6589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg0 && arg8 == arg3 && arg2 == arg5 && arg4 == arg6) {
			Static438.method6364(arg3, arg5, arg7, arg1, arg4);
			return;
		}
		@Pc(53) int local53 = arg1;
		@Pc(55) int local55 = arg3;
		@Pc(59) int local59 = arg1 * 3;
		@Pc(63) int local63 = arg3 * 3;
		@Pc(67) int local67 = arg0 * 3;
		@Pc(71) int local71 = arg8 * 3;
		@Pc(75) int local75 = arg2 * 3;
		@Pc(79) int local79 = arg6 * 3;
		@Pc(89) int local89 = arg5 + local67 - local75 - arg1;
		@Pc(98) int local98 = local71 + arg4 - local79 - arg3;
		@Pc(108) int local108 = local75 + local59 - local67 - local67;
		@Pc(117) int local117 = local79 + local63 - local71 - local71;
		@Pc(122) int local122 = local67 - local59;
		@Pc(127) int local127 = local71 - local63;
		for (@Pc(129) int local129 = 128; local129 <= 4096; local129 += 128) {
			@Pc(137) int local137 = local129 * local129 >> 12;
			@Pc(143) int local143 = local129 * local137 >> 12;
			@Pc(147) int local147 = local89 * local143;
			@Pc(151) int local151 = local98 * local143;
			@Pc(155) int local155 = local108 * local137;
			@Pc(159) int local159 = local117 * local137;
			@Pc(163) int local163 = local122 * local129;
			@Pc(167) int local167 = local129 * local127;
			@Pc(177) int local177 = (local155 + local147 + local163 >> 12) + arg1;
			@Pc(188) int local188 = (local167 + local151 + local159 >> 12) + arg3;
			Static438.method6364(local55, local177, arg7, local53, local188);
			local55 = local188;
			local53 = local177;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZII)Z")
	public static boolean method6590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)Z")
	public static boolean method6594(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static401.method5914(arg1, arg0) | (arg0 & 0x40000) != 0 || Static400.method5898(arg0, arg1);
	}
}
