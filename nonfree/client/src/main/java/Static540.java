import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!sca", name = "w", descriptor = "[[[Lclient!dq;")
	public static Class73[][][] aClass73ArrayArrayArray3;

	@OriginalMember(owner = "client!sca", name = "r", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_181 = new Class151(66, 3);

	@OriginalMember(owner = "client!sca", name = "t", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_182 = new Class151(77, -2);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg3 && arg8 == arg4 && arg1 == arg2 && arg5 == arg6) {
			Static337.method4617(arg7, arg0, arg6, arg8, arg1);
			return;
		}
		@Pc(42) int local42 = arg0;
		@Pc(44) int local44 = arg8;
		@Pc(48) int local48 = arg0 * 3;
		@Pc(52) int local52 = arg8 * 3;
		@Pc(56) int local56 = arg3 * 3;
		@Pc(60) int local60 = arg4 * 3;
		@Pc(64) int local64 = arg2 * 3;
		@Pc(68) int local68 = arg5 * 3;
		@Pc(78) int local78 = arg1 + local56 - arg0 - local64;
		@Pc(87) int local87 = arg6 + local60 - arg8 - local68;
		@Pc(96) int local96 = local64 + local48 - local56 - local56;
		@Pc(106) int local106 = local52 + local68 - local60 - local60;
		@Pc(111) int local111 = local56 - local48;
		@Pc(115) int local115 = local60 - local52;
		for (@Pc(117) int local117 = 128; local117 <= 4096; local117 += 128) {
			@Pc(125) int local125 = local117 * local117 >> 12;
			@Pc(131) int local131 = local117 * local125 >> 12;
			@Pc(135) int local135 = local131 * local78;
			@Pc(139) int local139 = local87 * local131;
			@Pc(143) int local143 = local96 * local125;
			@Pc(147) int local147 = local106 * local125;
			@Pc(151) int local151 = local117 * local111;
			@Pc(155) int local155 = local115 * local117;
			@Pc(165) int local165 = (local135 + local143 + local151 >> 12) + arg0;
			@Pc(176) int local176 = arg8 + (local147 + local139 + local155 >> 12);
			Static337.method4617(arg7, local42, local176, local44, local165);
			local42 = local165;
			local44 = local176;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(III)Z")
	public static boolean method7231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(B[B)[B")
	public static byte[] method7233(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		@Pc(17) int local17 = local8.method8865();
		@Pc(21) int local21 = local8.method8850();
		if (local21 < 0 || Static563.anInt6735 != 0 && Static563.anInt6735 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(44) byte[] local44 = new byte[local21];
			local8.method8870(local44, 0, local21);
			return local44;
		} else {
			@Pc(56) int local56 = local8.method8850();
			if (local56 < 0 || Static563.anInt6735 != 0 && Static563.anInt6735 < local56) {
				throw new RuntimeException();
			}
			@Pc(74) byte[] local74 = new byte[local56];
			if (local17 == 1) {
				Static503.method6851(local74, local56, arg0, local21);
			} else {
				@Pc(81) Class237 local81 = Static80.aClass237_1;
				synchronized (Static80.aClass237_1) {
					Static80.aClass237_1.method4972(local8, local74);
				}
			}
			return local74;
		}
	}
}
