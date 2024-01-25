import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
	public static int anInt2066;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Lclient!wr;")
	public static Class250 aClass250_1;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "[S")
	public static final short[] aShortArray39 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
	public static int anInt2069 = -1;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	public static void method1854() {
		Static379.anInt1192 = 0;
		Static66.aClass210_43.method5043();
		Static48.aBoolean87 = false;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!km;IIBIIZIILclient!qg;ILclient!ab;III)Lclient!ab;")
	public static Class3 method1855(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class189 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class3 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg10 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg8 != null) {
			local11 = arg8.method4433(arg9, -1, false) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = ((long) arg13 << 48) + ((long) arg7 << 32) + (long) (arg6 - (-(arg1 << 16) + -(arg2 << 24)));
		@Pc(51) Class154 local51 = Static285.aClass154_38;
		@Pc(59) Class3 local59;
		synchronized (Static285.aClass154_38) {
			local59 = (Class3) Static285.aClass154_38.method3751(local49);
		}
		@Pc(158) int local158;
		@Pc(164) int local164;
		@Pc(170) int local170;
		@Pc(174) int local174;
		if (local59 == null || arg0.method4499(local59.method3474(), local11) != 0) {
			if (local59 != null) {
				local11 = arg0.method4483(local11, local59.method3474());
			}
			@Pc(91) byte local91;
			if (arg6 == 1) {
				local91 = 9;
			} else if (arg6 == 2) {
				local91 = 12;
			} else if (arg6 == 3) {
				local91 = 15;
			} else if (arg6 == 4) {
				local91 = 18;
			} else {
				local91 = 21;
			}
			@Pc(133) int[] local133 = new int[] { 64, 96, 128 };
			@Pc(151) Class91 local151 = new Class91(local91 * 3 + 1, -local91 + local91 * 3 * 2, 0);
			local158 = local151.method2204(0, 0, 0);
			@Pc(162) int[][] local162 = new int[3][local91];
			@Pc(176) int local176;
			@Pc(200) int local200;
			for (local164 = 0; local164 < 3; local164++) {
				local170 = local133[local164];
				local174 = local133[local164];
				for (local176 = 0; local176 < local91; local176++) {
					@Pc(184) int local184 = (local176 << 14) / local91;
					@Pc(192) int local192 = Class104.anIntArray705[local184] * local170 >> 15;
					local200 = local174 * Class104.anIntArray706[local184] >> 15;
					local162[local164][local176] = local151.method2204(local192, local200, 0);
				}
			}
			for (local170 = 0; local170 < 3; local170++) {
				local174 = (local170 * 256 + 128) / 3;
				local176 = 256 - local174;
				@Pc(255) byte local255 = (byte) (local176 * arg1 + arg2 * local174 >> 8);
				@Pc(300) short local300 = (short) (((arg13 & 0x7F) * local174 + local176 * (arg7 & 0x7F) & 0x7F00) + ((arg13 & 0x380) * local174 + local176 * (arg7 & 0x380) & 0x38000) + ((arg7 & 0xFC00) * local176 + (arg13 & 0xFC00) * local174 & 0xFC0000) >> 8);
				for (local200 = 0; local200 < local91; local200++) {
					if (local170 == 0) {
						local151.method2210(local162[0][local200], local162[0][(local200 + 1) % local91], (short) -1, local300, (byte) 1, local255, (byte) -1, local158);
					} else {
						local151.method2210(local162[local170][(local200 + 1) % local91], local162[local170 - 1][(local200 + 1) % local91], (short) -1, local300, (byte) 1, local255, (byte) -1, local162[local170 - 1][local200]);
						local151.method2210(local162[local170][local200], local162[local170][(local200 + 1) % local91], (short) -1, local300, (byte) 1, local255, (byte) -1, local162[local170 - 1][local200]);
					}
				}
			}
			local59 = arg0.method4466(local151, local11, Static368.anInt6424, 64, 768);
			@Pc(420) Class154 local420 = Static285.aClass154_38;
			synchronized (Static285.aClass154_38) {
				Static285.aClass154_38.method3745(local49, local59);
			}
		}
		@Pc(441) int local441 = arg6 * 64 - 1;
		@Pc(444) int local444 = -local441;
		@Pc(447) int local447 = -local441;
		@Pc(449) int local449 = local441;
		local158 = local441;
		if (arg5) {
			if (arg12 > 13312 || arg12 < 3072) {
				local447 -= 128;
			}
			if (arg12 > 9216 && arg12 < 15360) {
				local449 = local441 + 128;
			}
			if (arg12 > 1024 && arg12 < 7168) {
				local444 -= 128;
			}
			if (arg12 > 5120 && arg12 < 11264) {
				local158 = local441 + 128;
			}
		}
		@Pc(492) int local492 = arg10.method3458();
		local164 = arg10.method3468();
		local170 = arg10.method3436();
		local174 = arg10.method3446();
		if (local444 > local492) {
			local492 = local444;
		}
		if (local449 < local164) {
			local164 = local449;
		}
		if (local170 < local447) {
			local170 = local447;
		}
		if (local174 > local158) {
			local174 = local158;
		}
		@Pc(535) Class2_Sub1_Sub1 local535 = null;
		if (arg8 != null) {
			@Pc(542) int local542 = arg8.anIntArray639[arg9];
			local535 = Static351.aClass175_3.method4106(local542 >> 16);
			arg9 = local542 & 0xFFFF;
		}
		if (local535 == null) {
			local59 = local59.method3481((byte) 3, local11, true);
			local59.method3462((local164 - local492) / 2, 128, (local174 - local170) / 2);
			local59.method3442((local492 + local164) / 2, 0, (local174 + local170) / 2);
		} else {
			local59 = local59.method3481((byte) 3, local11, true);
			local59.method3462((local164 - local492) / 2, 128, (local174 - local170) / 2);
			local59.method3442((local164 + local492) / 2, 0, (local170 + local174) / 2);
			local59.method3482(arg9, local535);
		}
		if (arg4 != 0) {
			local59.method3460(arg4);
		}
		if (arg3 != 0) {
			local59.method3463(arg3);
		}
		if (arg11 != 0) {
			local59.method3442(0, arg11, 0);
		}
		return local59;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)Lclient!wj;")
	public static Class141_Sub1 method1856(@OriginalArg(1) int arg0) {
		return Static73.aBoolean115 && arg0 >= Static299.anInt5300 && Static232.anInt4266 >= arg0 ? Static22.aClass141_Sub1Array1[arg0 - Static299.anInt5300] : null;
	}
}
