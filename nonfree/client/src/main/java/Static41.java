import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_18 = new Class119("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
	public static int anInt714 = -1;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_26 = new Class12(106, -2);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILclient!oj;IIILclient!za;IILclient!e;IIIII)Lclient!e;")
	public static Class57 method586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class57 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg8 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg2 != null) {
			local11 = arg2.method3959(arg9, false, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = (long) ((arg11 << 16) + arg0 + (arg10 << 24)) + ((long) arg13 << 32) + ((long) arg1 << 48);
		@Pc(51) Class102 local51 = Static394.aClass102_53;
		@Pc(59) Class57 local59;
		synchronized (Static394.aClass102_53) {
			local59 = (Class57) Static394.aClass102_53.method2258(local49);
		}
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(164) int local164;
		@Pc(168) int local168;
		if (local59 == null || arg5.method5783(local59.RA(), local11) != 0) {
			if (local59 != null) {
				local11 = arg5.method5787(local11, local59.RA());
			}
			@Pc(86) byte local86;
			if (arg0 == 1) {
				local86 = 9;
			} else if (arg0 == 2) {
				local86 = 12;
			} else if (arg0 == 3) {
				local86 = 15;
			} else if (arg0 == 4) {
				local86 = 18;
			} else {
				local86 = 21;
			}
			@Pc(126) int[] local126 = new int[] { 64, 96, 128 };
			@Pc(145) Class193 local145 = new Class193(local86 * 3 + 1, -local86 + local86 * 2 * 3, 0);
			local152 = local145.method4265(0, 0, 0);
			@Pc(156) int[][] local156 = new int[3][local86];
			@Pc(170) int local170;
			@Pc(194) int local194;
			for (local158 = 0; local158 < 3; local158++) {
				local164 = local126[local158];
				local168 = local126[local158];
				for (local170 = 0; local170 < local86; local170++) {
					@Pc(178) int local178 = (local170 << 14) / local86;
					@Pc(186) int local186 = local164 * Class1_Sub4_Sub8_Sub1.anIntArray50[local178] >> 15;
					local194 = local168 * Class1_Sub4_Sub8_Sub1.anIntArray49[local178] >> 15;
					local156[local158][local170] = local145.method4265(local186, local194, 0);
				}
			}
			for (local164 = 0; local164 < 3; local164++) {
				local168 = (local164 * 256 + 128) / 3;
				local170 = 256 - local168;
				@Pc(240) byte local240 = (byte) (arg10 * local168 + local170 * arg11 >> 8);
				@Pc(285) short local285 = (short) (((arg13 & 0xFC00) * local170 + (arg1 & 0xFC00) * local168 & 0xFC0000) + (local170 * (arg13 & 0x380) + (arg1 & 0x380) * local168 & 0x38000) + ((arg1 & 0x7F) * local168 + (arg13 & 0x7F) * local170 & 0x7F00) >> 8);
				for (local194 = 0; local194 < local86; local194++) {
					if (local164 == 0) {
						local145.method4252(local152, (byte) -1, local156[0][(local194 + 1) % local86], local285, (byte) 1, local156[0][local194], local240, (short) -1);
					} else {
						local145.method4252(local156[local164 - 1][local194], (byte) -1, local156[local164 - 1][(local194 + 1) % local86], local285, (byte) 1, local156[local164][(local194 + 1) % local86], local240, (short) -1);
						local145.method4252(local156[local164 - 1][local194], (byte) -1, local156[local164][(local194 + 1) % local86], local285, (byte) 1, local156[local164][local194], local240, (short) -1);
					}
				}
			}
			local59 = arg5.method5792(local145, local11, Static379.anInt6356, 64, 768);
			@Pc(412) Class102 local412 = Static394.aClass102_53;
			synchronized (Static394.aClass102_53) {
				Static394.aClass102_53.method2272(local49, local59);
			}
		}
		@Pc(431) int local431 = (arg0 << 6) - 1;
		@Pc(434) int local434 = -local431;
		@Pc(437) int local437 = -local431;
		@Pc(439) int local439 = local431;
		local152 = local431;
		if (arg6 != 0) {
			if ((arg6 & 0x8) != 0) {
				local434 -= 128;
			}
			if ((arg6 & 0x1) != 0) {
				local152 = local431 + 128;
			}
			if ((arg6 & 0x2) != 0) {
				local437 -= 128;
			}
			if ((arg6 & 0x4) != 0) {
				local439 = local431 + 128;
			}
		}
		@Pc(477) int local477 = arg8.ta();
		local158 = arg8.MA();
		local164 = arg8.Z();
		local168 = arg8.S();
		if (local158 > local439) {
			local158 = local439;
		}
		if (local164 < local437) {
			local164 = local437;
		}
		if (local477 < local434) {
			local477 = local434;
		}
		if (local152 < local168) {
			local168 = local152;
		}
		@Pc(508) Class1_Sub5_Sub2 local508 = null;
		if (arg2 != null) {
			@Pc(515) int local515 = arg2.anIntArray326[arg9];
			local508 = Static174.aClass254_1.method5672(local515 >> 16);
			arg9 = local515 & 0xFFFF;
		}
		if (local508 == null) {
			local59 = local59.method5966((byte) 3, local11, true);
			local59.n(local158 - local477 >> 1, 128, local168 - local164 >> 1);
			local59.a(local158 + local477 >> 1, 0, local164 + local168 >> 1);
		} else {
			local59 = local59.method5966((byte) 3, local11, true);
			local59.n(local158 - local477 >> 1, 128, local168 - local164 >> 1);
			local59.a(local477 + local158 >> 1, 0, local168 + local164 >> 1);
			local59.method5964(arg9, local508);
		}
		if (arg3 != 0) {
			local59.W(arg3);
		}
		if (arg4 != 0) {
			local59.K(arg4);
		}
		if (arg7 != 0) {
			local59.a(0, arg7, 0);
		}
		return local59;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLclient!jk;)Z")
	public static boolean method587(@OriginalArg(1) Class124 arg0) {
		if (arg0.anInt3413 == Static130.anInt2370) {
			Static372.anInt6263 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)[B")
	public static byte[] method588(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub5_Sub12 local12 = (Class1_Sub5_Sub12) Static221.aClass17_2.method317((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(46) int local46 = 255 - local40;
				@Pc(51) int local51 = Static301.method4119(local23, local46);
				@Pc(55) byte local55 = local17[local51];
				local17[local51] = local17[local46];
				local17[local46] = local17[511 - local40] = local55;
			}
			local12 = new Class1_Sub5_Sub12(local17);
			Static221.aClass17_2.method315((long) arg0, local12);
		}
		return local12.aByteArray49;
	}
}
