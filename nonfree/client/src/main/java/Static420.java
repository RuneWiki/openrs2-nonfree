import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "[Lclient!o;")
	public static Class41[] aClass41Array14;

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_118 = new Class231("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!bd;Lclient!bd;Z)V")
	public static void method5764(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		if (arg1.aClass2_Sub1_58 != null) {
			arg1.method5838();
		}
		arg1.aClass2_Sub1_58 = arg0;
		arg1.aClass2_Sub1_57 = arg0.aClass2_Sub1_57;
		arg1.aClass2_Sub1_58.aClass2_Sub1_57 = arg1;
		arg1.aClass2_Sub1_57.aClass2_Sub1_58 = arg1;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIIIIILclient!e;IIIILclient!hg;Lclient!za;)Lclient!e;")
	public static Class63 method5766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class63 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) Class109 arg12, @OriginalArg(14) Class75 arg13) {
		if (arg8 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg12 != null) {
			local11 = arg12.method2299(-1, arg9, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg6 << 48) + ((long) arg11 << 32) + (long) ((arg3 << 24) + (arg10 << 16) + arg4);
		@Pc(49) Class188 local49 = Static288.aClass188_42;
		@Pc(57) Class63 local57;
		synchronized (Static288.aClass188_42) {
			local57 = (Class63) Static288.aClass188_42.method4158(local47);
		}
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(164) int local164;
		@Pc(168) int local168;
		if (local57 == null || arg13.method6023(local57.RA(), local11) != 0) {
			if (local57 != null) {
				local11 = arg13.method5987(local11, local57.RA());
			}
			@Pc(86) byte local86;
			if (arg4 == 1) {
				local86 = 9;
			} else if (arg4 == 2) {
				local86 = 12;
			} else if (arg4 == 3) {
				local86 = 15;
			} else if (arg4 == 4) {
				local86 = 18;
			} else {
				local86 = 21;
			}
			@Pc(128) int[] local128 = new int[] { 64, 96, 128 };
			@Pc(145) Class76 local145 = new Class76(local86 * 3 + 1, local86 * 3 * 2 - local86, 0);
			local152 = local145.method1781(0, 0, 0);
			@Pc(156) int[][] local156 = new int[3][local86];
			@Pc(170) int local170;
			@Pc(194) int local194;
			for (local158 = 0; local158 < 3; local158++) {
				local164 = local128[local158];
				local168 = local128[local158];
				for (local170 = 0; local170 < local86; local170++) {
					@Pc(178) int local178 = (local170 << 14) / local86;
					@Pc(186) int local186 = Class229.anIntArray537[local178] * local164 >> 15;
					local194 = Class229.anIntArray536[local178] * local168 >> 15;
					local156[local158][local170] = local145.method1781(local186, local194, 0);
				}
			}
			for (local164 = 0; local164 < 3; local164++) {
				local168 = (local164 * 256 + 128) / 3;
				local170 = 256 - local168;
				@Pc(245) byte local245 = (byte) (local170 * arg10 + local168 * arg3 >> 8);
				@Pc(290) short local290 = (short) (((arg6 & 0xFC00) * local168 + local170 * (arg11 & 0xFC00) & 0xFC0000) + ((arg6 & 0x380) * local168 + (arg11 & 0x380) * local170 & 0x38000) + ((arg6 & 0x7F) * local168 + (arg11 & 0x7F) * local170 & 0x7F00) >> 8);
				for (local194 = 0; local194 < local86; local194++) {
					if (local164 == 0) {
						local145.method1776((short) -1, (byte) -1, local156[0][(local194 + 1) % local86], local290, local152, (byte) 1, local156[0][local194], local245);
					} else {
						local145.method1776((short) -1, (byte) -1, local156[local164 - 1][(local194 + 1) % local86], local290, local156[local164 - 1][local194], (byte) 1, local156[local164][(local194 + 1) % local86], local245);
						local145.method1776((short) -1, (byte) -1, local156[local164][(local194 + 1) % local86], local290, local156[local164 - 1][local194], (byte) 1, local156[local164][local194], local245);
					}
				}
			}
			local57 = arg13.method6016(local145, local11, Static9.anInt6381, 64, 768);
			@Pc(410) Class188 local410 = Static288.aClass188_42;
			synchronized (Static288.aClass188_42) {
				Static288.aClass188_42.method4155(local47, local57);
			}
		}
		@Pc(429) int local429 = (arg4 << 6) - 1;
		@Pc(432) int local432 = -local429;
		@Pc(435) int local435 = -local429;
		@Pc(442) int local442 = local429;
		local152 = local429;
		if (arg7 != 0) {
			if ((arg7 & 0x4) != 0) {
				local442 = local429 + 128;
			}
			if ((arg7 & 0x2) != 0) {
				local435 -= 128;
			}
			if ((arg7 & 0x1) != 0) {
				local152 = local429 + 128;
			}
			if ((arg7 & 0x8) != 0) {
				local432 -= 128;
			}
		}
		@Pc(478) int local478 = arg8.ta();
		local158 = arg8.MA();
		local164 = arg8.Z();
		local168 = arg8.S();
		if (local432 > local478) {
			local478 = local432;
		}
		if (local442 < local158) {
			local158 = local442;
		}
		if (local435 > local164) {
			local164 = local435;
		}
		if (local168 > local152) {
			local168 = local152;
		}
		@Pc(521) Class2_Sub1_Sub12 local521 = null;
		if (arg12 != null) {
			@Pc(528) int local528 = arg12.anIntArray240[arg9];
			local521 = Static37.aClass80_1.method1871(local528 >> 16);
			arg9 = local528 & 0xFFFF;
		}
		if (local521 == null) {
			local57 = local57.method6296((byte) 3, local11, true);
			local57.n(local158 - local478 >> 1, 128, local168 - local164 >> 1);
			local57.a(local478 + local158 >> 1, 0, local168 + local164 >> 1);
		} else {
			local57 = local57.method6296((byte) 3, local11, true);
			local57.n(local158 - local478 >> 1, 128, local168 - local164 >> 1);
			local57.a(local158 + local478 >> 1, 0, local168 + local164 >> 1);
			local57.method6285(arg9, local521);
		}
		if (arg5 != 0) {
			local57.W(arg5);
		}
		if (arg1 != 0) {
			local57.K(arg1);
		}
		if (arg0 != 0) {
			local57.a(0, arg0, 0);
		}
		return local57;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLclient!mn;Lclient!l;)V")
	public static void method5767(@OriginalArg(1) Class171 arg0, @OriginalArg(2) Interface7 arg1) {
		Static433.anInterface7_7 = arg1;
		Static370.aClass171_85 = arg0;
	}
}
