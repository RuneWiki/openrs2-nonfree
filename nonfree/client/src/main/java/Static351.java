import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!lr", name = "F", descriptor = "Lclient!bo;")
	public static final Class44 aClass44_3 = new Class44();

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[BIIIII[B)V")
	public static void method5272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(20) int local20 = -(arg4 & 0x3);
		for (@Pc(23) int local23 = -arg0; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg5++;
				arg7[local31] = (byte) (arg7[local31] - arg2[arg3++]);
				@Pc(44) int local44 = arg5++;
				arg7[local44] = (byte) (arg7[local44] - arg2[arg3++]);
				@Pc(57) int local57 = arg5++;
				arg7[local57] = (byte) (arg7[local57] - arg2[arg3++]);
				@Pc(70) int local70 = arg5++;
				arg7[local70] = (byte) (arg7[local70] - arg2[arg3++]);
			}
			for (@Pc(89) int local89 = local20; local89 < 0; local89++) {
				local31 = arg5++;
				arg7[local31] = (byte) (arg7[local31] - arg2[arg3++]);
			}
			arg3 += arg1;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method5274(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = arg0[local12 + arg2] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(43) char local43 = Static66.aCharArray1[local22 - 128];
					if (local43 == '\u0000') {
						local43 = '?';
					}
					local22 = local43;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	public static void method5277(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		Static558.anInt8991 = arg1;
		Static490.anInt8296 = 2;
		Static164.method2758(arg0, false, arg2);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IFIFFFFF)F")
	public static float method5278(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(20) float local20 = arg0 - arg2;
		@Pc(25) float local25 = arg6 - arg5;
		@Pc(29) float local29 = arg4 - arg3;
		@Pc(31) float local31 = 0.0F;
		@Pc(33) float local33 = 0.0F;
		@Pc(35) float local35 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(43) float local43 = local20 * local7 + arg2;
			@Pc(49) float local49 = local25 * local7 + arg5;
			@Pc(55) float local55 = local29 * local7 + arg3;
			@Pc(60) int local60 = (int) local43 >> 9;
			@Pc(65) int local65 = (int) local55 >> 9;
			if (local60 > 0 && local65 > 0 && Static251.anInt4680 > local60 && Static406.anInt6924 > local65) {
				@Pc(84) int local84 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142;
				if (local84 < 3 && (Static338.aByteArrayArrayArray13[1][local60][local65] & 0x2) != 0) {
					local84++;
				}
				@Pc(113) int local113 = Static239.aClass104Array1[local84].method8286((int) local43, (int) local55);
				if ((float) local113 < local49) {
					if (arg1 < 2) {
						return local7;
					}
					return method5278(local43, arg1 - 1, local31, local35, local55, local33, local49) * 0.1F + local7 - 0.1F;
				}
			}
			local7 += 0.1F;
			local33 = local49;
			local35 = local55;
			local31 = local43;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BI)V")
	public static void method5280() {
		@Pc(5) Class279 local5 = Static104.aClass279_10;
		synchronized (Static104.aClass279_10) {
			Static104.aClass279_10.method6630(5);
		}
		local5 = Static488.aClass279_44;
		synchronized (Static488.aClass279_44) {
			Static488.aClass279_44.method6630(5);
		}
	}
}
