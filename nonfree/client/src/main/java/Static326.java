import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "Lclient!la;")
	public static Class1_Sub23 aClass1_Sub23_3;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "[S")
	public static short[] aShortArray44;

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
	public static int anInt2473;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
	public static int anInt2469 = 100;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "[I")
	public static final int[] anIntArray232 = new int[14];

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZ)V")
	public static void method2143(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static263.aByteArrayArray16;
		} else {
			local9 = Static305.aByteArrayArray22;
		}
		@Pc(16) int local16 = Static345.aByteArrayArray25.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = local9[local18];
			if (local24 != null) {
				@Pc(36) int local36 = (Static222.anIntArray416[local18] >> 8) * 64 - Static234.anInt4783;
				@Pc(47) int local47 = (Static222.anIntArray416[local18] & 0xFF) * 64 - Static32.anInt2224;
				Static63.method4863();
				Static350.method5600(local24, local47, local36, Static208.aClass32_11, arg0, Static29.aClass71Array1);
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;IIBLclient!ak;ILclient!fa;ILclient!em;ILclient!aq;I)V")
	public static void method2150(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class63 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class52 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class12 arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static147.anInt3204 == 4) {
			local13 = (int) Static75.aFloat13 & 0x3FFF;
		} else {
			local13 = (int) Static75.aFloat13 + Static337.anInt6461 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg9.lb / 2, arg9.anInt446 / 2) + 10;
		@Pc(48) int local48 = arg10 * arg10 + arg1 * arg1;
		if (local32 * local32 < local48) {
			return;
		}
		@Pc(58) int local58 = Class1_Sub3_Sub8.anIntArray159[local13];
		@Pc(62) int local62 = Class1_Sub3_Sub8.anIntArray156[local13];
		if (Static147.anInt3204 != 4) {
			local58 = local58 * 256 / (Static287.anInt5748 + 256);
			local62 = local62 * 256 / (Static287.anInt5748 + 256);
		}
		@Pc(93) int local93 = arg10 * local58 + local62 * arg1 >> 15;
		@Pc(103) int local103 = arg10 * local62 - arg1 * local58 >> 15;
		@Pc(110) int local110 = arg5.method1752(arg0, 100, null);
		@Pc(118) int local118 = arg5.method1751(null, arg0);
		@Pc(124) int local124 = local93 - local110 / 2;
		if (-arg9.lb <= local124 && arg9.lb >= local124 && local103 >= -arg9.anInt446 && local103 <= arg9.anInt446) {
			arg3.method5014(1, null, 50, arg4 + arg9.anInt446 / 2 - arg8 - local103 - local118, 0, 0, null, local110, 0, arg0, arg4, local124 + arg2 + arg9.lb / 2, arg2, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLclient!gd;ILjava/awt/Canvas;Lclient!nh;I)Lclient!uo;")
	public static synchronized Class32 method2152(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Class143 arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			if (!Static121.aBooleanArray11[local14]) {
				local12 = local14;
				break;
			}
		}
		if (local12 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(55) Class32 local55;
		if (arg1 == 0) {
			local55 = Static233.method4782(arg2, local12, arg0);
		} else if (arg1 == 1) {
			local55 = Static287.method4920(arg4, arg2, arg3, arg0, local12);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static121.aBooleanArray11[local12] = true;
		return local55;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[IB)V")
	public static void method2168(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		for (@Pc(7) int local7 = 31; local7 > 0; local7--) {
			@Pc(13) int local13 = local7 * 36;
			for (@Pc(15) int local15 = 35; local15 > 0; local15--) {
				if (arg1[local15 + local13] == 0 && arg1[local13 + local15 - 37] != 0) {
					arg1[local13 + local15] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(JZIII)Ljava/lang/String;")
	public static String method2186(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(25) char local25 = '.';
		if (arg2 == 0) {
			local25 = ',';
			local7 = '.';
		}
		if (arg2 == 2) {
			local25 = ' ';
		}
		@Pc(38) boolean local38 = false;
		if (arg0 < 0L) {
			local38 = true;
			arg0 = -arg0;
		}
		@Pc(52) StringBuffer local52 = new StringBuffer(26);
		@Pc(59) int local59;
		@Pc(64) int local64;
		if (arg3 > 0) {
			for (local59 = 0; local59 < arg3; local59++) {
				local64 = (int) arg0;
				arg0 /= 10L;
				local52.append((char) (local64 + 48 - (int) arg0 * 10));
			}
			local52.append(local7);
		}
		local59 = 0;
		while (true) {
			local64 = (int) arg0;
			arg0 /= 10L;
			local52.append((char) (local64 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local38) {
					local52.append('-');
				}
				return local52.reverse().toString();
			}
			if (arg1) {
				local59++;
				if (local59 % 3 == 0) {
					local52.append(local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILclient!po;I)V")
	public static void method2232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class165 arg2) {
		Static37.aClass165ArrayArray1[arg1][arg0] = arg2;
	}
}
