import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	public static int anInt6915 = 0;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger8 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	public static int anInt6916 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIILclient!oa;II[[[BIIIBI)V")
	public static void method5777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class66 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		if (arg11 == 0 || arg3 == 0) {
			return;
		}
		if (arg11 == 9) {
			arg11 = 1;
			arg5 = arg5 + 1 & 0x3;
		}
		if (arg11 == 10) {
			arg5 = arg5 + 3 & 0x3;
			arg11 = 1;
		}
		if (arg11 == 11) {
			arg5 = arg5 + 3 & 0x3;
			arg11 = 8;
		}
		arg4.ma(arg9, arg1, arg6, arg8, arg2, arg10, arg7[arg11 - 1][arg5], arg3, arg0);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V")
	public static void method5778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class285 local9 = Static522.aClass285ArrayArray1[arg2][arg1];
		Static55.method844(arg0, local9 == null ? Static185.aClass285_5 : local9);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!oa;IIII)V")
	public static void method5779(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.ca(arg4, arg3, arg2 + arg4, arg3 - -arg0);
		arg1.method6794(arg2, arg4, arg0, arg3, -16777216);
		if (Static355.anInt6196 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static392.anInt8803 / (float) Static392.anInt8795;
		@Pc(36) int local36 = arg2;
		@Pc(38) int local38 = arg0;
		if (local34 < 1.0F) {
			local38 = (int) ((float) arg2 * local34);
		} else {
			local36 = (int) ((float) arg0 / local34);
		}
		@Pc(65) int local65 = arg4 + (arg2 - local36) / 2;
		@Pc(73) int local73 = arg3 + (arg0 - local38) / 2;
		if (Static56.aClass13_4 == null || arg2 != Static56.aClass13_4.QA() || Static56.aClass13_4.b() != arg0) {
			Static392.method7230(Static392.anInt8797, Static392.anInt8804 + Static392.anInt8803, Static392.anInt8795 + Static392.anInt8797, Static392.anInt8804, local65, local73, local36 + local65, local38 + local73);
			Static392.method7232(arg1);
			Static56.aClass13_4 = arg1.method6802(local65, local73, local36, local38, false);
		}
		Static56.aClass13_4.method8019(local65, local73);
		@Pc(125) int local125 = local36 * Static38.anInt742 / Static392.anInt8795;
		@Pc(131) int local131 = Static357.anInt6211 * local38 / Static392.anInt8803;
		@Pc(144) int local144 = local65 + Static190.anInt3972 * local36 / Static392.anInt8795;
		@Pc(156) int local156 = local38 + local73 - local38 * Static233.anInt4743 / Static392.anInt8803 - local131;
		@Pc(158) int local158 = -1996554240;
		if (Static538.aClass263_5 == Static27.aClass263_1) {
			local158 = -1996488705;
		}
		arg1.C(local144, local156, local125, local131, local158, 1);
		arg1.method6786(local144, local156, local125, local131, local158, 0);
		if (Static162.anInt3559 <= 0) {
			return;
		}
		@Pc(193) int local193;
		if (Static391.anInt6853 > 50) {
			local193 = 500 - Static391.anInt6853 * 5;
		} else {
			local193 = Static391.anInt6853 * 5;
		}
		for (@Pc(204) Class4_Sub48 local204 = (Class4_Sub48) Static392.aClass124_60.method3267(); local204 != null; local204 = (Class4_Sub48) Static392.aClass124_60.method3273()) {
			@Pc(212) Class86 local212 = Static392.aClass337_4.method7441(local204.anInt8895);
			if (Static595.method8010(local212)) {
				@Pc(229) int local229;
				@Pc(241) int local241;
				if (local204.anInt8895 == Static119.anInt2755) {
					local229 = local204.anInt8896 * local36 / Static392.anInt8795 + local65;
					local241 = local73 + local38 * (Static392.anInt8803 - local204.anInt8900) / Static392.anInt8803;
					arg1.method6794(4, local229 - 2, 4, local241 - 2, local193 << 24 | 0xFFFF00);
				} else if (Static597.anInt9820 != -1 && Static597.anInt9820 == local212.anInt2697) {
					local229 = local65 + local204.anInt8896 * local36 / Static392.anInt8795;
					local241 = local73 + local38 * (Static392.anInt8803 - local204.anInt8900) / Static392.anInt8803;
					arg1.method6794(4, local229 - 2, 4, local241 - 2, local193 << 24 | 0xFFFF00);
				}
			}
		}
	}
}
