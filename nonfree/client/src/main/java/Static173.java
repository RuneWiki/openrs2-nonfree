import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!qe", name = "kb", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!qe", name = "mb", descriptor = "I")
	public static int anInt3574;

	@OriginalMember(owner = "client!qe", name = "sb", descriptor = "Lclient!ki;")
	public static Class1_Sub1_Sub10_Sub1 aClass1_Sub1_Sub10_Sub1_2;

	@OriginalMember(owner = "client!qe", name = "ob", descriptor = "I")
	public static int anInt3576 = 0;

	@OriginalMember(owner = "client!qe", name = "pb", descriptor = "[S")
	public static short[] aShortArray54 = new short[256];

	@OriginalMember(owner = "client!qe", name = "rb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1184 = Static186.method3527(" has logged out)3");

	@OriginalMember(owner = "client!qe", name = "qb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1183 = aClass50_1184;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIILclient!ra;Lclient!tc;IIIIZIII)Lclient!ra;")
	public static Class20_Sub5 method2874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20_Sub5 arg4, @OriginalArg(5) Class110 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(27) long local27 = ((long) arg10 << 48) + ((long) arg7 << 32) + (long) ((arg6 << 16) + arg12 - -(arg11 << 24));
		@Pc(35) Class20_Sub5 local35 = (Class20_Sub5) Static35.aClass84_15.method2579(local27);
		@Pc(109) int local109;
		@Pc(115) int local115;
		@Pc(121) int local121;
		@Pc(125) int local125;
		@Pc(145) int local145;
		if (local35 == null) {
			@Pc(52) int[] local52 = new int[] { 64, 96, 128 };
			@Pc(67) byte local67;
			if (arg12 == 1) {
				local67 = 9;
			} else if (arg12 == 2) {
				local67 = 12;
			} else if (arg12 == 3) {
				local67 = 15;
			} else if (arg12 == 4) {
				local67 = 18;
			} else {
				local67 = 21;
			}
			@Pc(103) Class20_Sub4 local103 = new Class20_Sub4(local67 * 3 + 1, local67 * 2 * 3 - local67, 0);
			local109 = local103.method1415(0, 0);
			@Pc(113) int[][] local113 = new int[3][local67];
			@Pc(127) int local127;
			@Pc(155) int local155;
			for (local115 = 0; local115 < 3; local115++) {
				local121 = local52[local115];
				local125 = local52[local115];
				for (local127 = 0; local127 < local67; local127++) {
					@Pc(135) int local135 = (local127 << 11) / local67;
					local145 = arg1 + local121 * Class120.anIntArray491[local135] >> 16;
					local155 = local125 * Class120.anIntArray492[local135] + arg3 >> 16;
					local113[local115][local127] = local103.method1415(local145, local155);
				}
			}
			for (local121 = 0; local121 < 3; local121++) {
				local125 = (local121 * 256 + 128) / 3;
				local127 = 256 - local125;
				@Pc(201) byte local201 = (byte) (local125 * arg11 + local127 * arg6 >> 8);
				@Pc(246) short local246 = (short) (((arg10 & 0x380) * local125 + local127 * (arg7 & 0x380) & 0x38000) + ((arg10 & 0xFC00) * local125 + local127 * (arg7 & 0xFC00) & 0xFC0000) + ((arg10 & 0x7F) * local125 + local127 * (arg7 & 0x7F) & 0x7F00) >> 8);
				for (local155 = 0; local155 < local67; local155++) {
					if (local121 == 0) {
						local103.method1397(local109, local113[0][(local155 + 1) % local67], local113[0][local155], local246, local201);
					} else {
						local103.method1397(local113[local121 - 1][local155], local113[local121 - 1][(local155 + 1) % local67], local113[local121][(local155 + 1) % local67], local246, local201);
						local103.method1397(local113[local121 - 1][local155], local113[local121][(local155 + 1) % local67], local113[local121][local155], local246, local201);
					}
				}
			}
			local35 = local103.method1402(64, 768, -50, -10, -50);
			Static35.aClass84_15.method2582(local35, local27);
		}
		@Pc(373) int local373 = arg12 * 64 - 1;
		@Pc(376) int local376 = -local373;
		@Pc(379) int local379 = -local373;
		@Pc(381) int local381 = local373;
		@Pc(384) int local384 = arg4.method1704();
		local109 = local373;
		local115 = arg4.method1703();
		if (arg9) {
			if (arg8 > 640 && arg8 < 1408) {
				local109 = local373 + 128;
			}
			if (arg8 > 128 && arg8 < 896) {
				local376 -= 128;
			}
			if (arg8 > 1152 && arg8 < 1920) {
				local381 = local373 + 128;
			}
			if (arg8 > 1664 || arg8 < 384) {
				local379 -= 128;
			}
		}
		if (local376 > local384) {
			local384 = local376;
		}
		if (local381 < local115) {
			local115 = local381;
		}
		local121 = arg4.method1702();
		if (local121 < local379) {
			local121 = local379;
		}
		local125 = arg4.method1707();
		if (local109 < local125) {
			local125 = local109;
		}
		@Pc(464) Class1_Sub1_Sub15 local464 = null;
		if (arg5 != null) {
			@Pc(471) int local471 = arg5.anIntArray458[arg0];
			local464 = Static16.method229(local471 >> 16);
			arg0 = local471 & 0xFFFF;
		}
		if (local464 == null) {
			local35 = local35.method1708(true, true);
			local35.method1697((local115 - local384) / 2, 128, (local125 - local121) / 2);
			local35.method1698((local384 + local115) / 2, 0, (local125 + local121) / 2);
		} else {
			local35 = local35.method1708(!local464.method2744(arg0), true);
			local35.method1697((local115 - local384) / 2, 128, (local125 - local121) / 2);
			local35.method1698((local384 + local115) / 2, 0, (local121 + local125) / 2);
			local35.method1690(local464, arg0);
		}
		if (arg8 != 0) {
			local35.method1700(arg8);
		}
		@Pc(575) Class20_Sub5_Sub1 local575 = (Class20_Sub5_Sub1) local35;
		if (arg2 != Static131.method2213(local121 + arg3, local384 + arg1, Static212.anInt4195) || Static131.method2213(arg3 + local125, arg1 - -local115, Static212.anInt4195) != arg2) {
			for (local145 = 0; local145 < local575.anInt2164; local145++) {
				local575.anIntArray215[local145] += Static131.method2213(arg3 + local575.anIntArray212[local145], local575.anIntArray217[local145] + arg1, Static212.anInt4195) - arg2;
			}
			local575.aBoolean96 = false;
		}
		return local35;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V")
	public static void method2876() {
		Static40.aClass84_16.method2577(5);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(III)Lclient!k;")
	public static Class61 method2877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class61 local14 = local7.aClass61_1;
			local7.aClass61_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method2878(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static158.aClass22_1);
		arg0.removeMouseMotionListener(Static158.aClass22_1);
		arg0.removeFocusListener(Static158.aClass22_1);
		Static153.anInt3175 = 0;
	}
}
