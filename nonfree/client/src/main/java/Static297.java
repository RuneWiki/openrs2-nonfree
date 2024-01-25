import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
	public static int anInt4703 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!iaa;I)Lclient!hba;")
	public static Class77_Sub2 method4043(@OriginalArg(0) Class6_Sub26 arg0) {
		return new Class77_Sub2(arg0.method4974(), arg0.method4974(), arg0.method4974(), arg0.method4974(), arg0.method4949(), arg0.method4949(), arg0.method4966());
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)I")
	public static int method4044() {
		return Static217.anInt3896;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII[BII)V")
	public static void method4045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5) {
		if (arg0 > 0 && !Static85.method1890(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static85.method1890(arg3)) {
			@Pc(33) int local33 = Static498.method7458(arg2);
			@Pc(35) int local35 = 0;
			@Pc(46) int local46 = arg0 < arg3 ? arg0 : arg3;
			@Pc(50) int local50 = arg0 >> 1;
			@Pc(54) int local54 = arg3 >> 1;
			@Pc(56) byte[] local56 = arg4;
			@Pc(63) byte[] local63 = new byte[local50 * local54 * local33];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local35, arg5, arg0, arg3, 0, arg2, 5121, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(81) int local81 = local33 * arg0;
				@Pc(83) byte[] local83 = local63;
				for (@Pc(85) int local85 = 0; local85 < local33; local85++) {
					@Pc(89) int local89 = local85;
					@Pc(91) int local91 = local85;
					@Pc(95) int local95 = local81 + local85;
					for (@Pc(97) int local97 = 0; local97 < local54; local97++) {
						for (@Pc(101) int local101 = 0; local101 < local50; local101++) {
							@Pc(107) byte local107 = local56[local91];
							local91 += local33;
							@Pc(117) int local117 = local107 + local56[local91];
							local91 += local33;
							@Pc(127) int local127 = local117 + local56[local95];
							local95 += local33;
							@Pc(137) int local137 = local127 + local56[local95];
							local95 += local33;
							local63[local89] = (byte) (local137 >> 2);
							local89 += local33;
						}
						local95 += local81;
						local91 += local81;
					}
				}
				local63 = local56;
				arg3 = local54;
				local56 = local83;
				arg0 = local50;
				local54 >>= 0x1;
				local46 >>= 0x1;
				local35++;
				local50 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)Z")
	public static boolean method4046(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
