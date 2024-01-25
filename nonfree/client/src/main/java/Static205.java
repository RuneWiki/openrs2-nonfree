import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!ka;IIILclient!jaa;IILclient!ha;IIIII)Lclient!ka;")
	public static Class129 method3044(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class144 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) int local12 = 2055;
		if (arg4 != null) {
			local12 = arg4.method8947() | 0x807;
			local12 &= 0xFFFFFDFF;
		}
		@Pc(46) long local46 = ((long) arg10 << 32) + (long) ((arg8 << 16) + (arg9 + (arg3 << 24))) + ((long) arg6 << 48);
		@Pc(48) Class317 local48 = Static216.aClass317_32;
		@Pc(56) Class129 local56;
		synchronized (Static216.aClass317_32) {
			local56 = (Class129) Static216.aClass317_32.method7882(local46);
		}
		if (local56 == null || arg7.method6967(local56.ua(), local12) != 0) {
			if (local56 != null) {
				local12 = arg7.method6937(local12, local56.ua());
			}
			@Pc(94) byte local94;
			if (arg9 == 1) {
				local94 = 9;
			} else if (arg9 == 2) {
				local94 = 12;
			} else if (arg9 == 3) {
				local94 = 15;
			} else if (arg9 == 4) {
				local94 = 18;
			} else {
				local94 = 21;
			}
			@Pc(135) int[] local135 = new int[] { 64, 96, 128 };
			@Pc(154) Class72 local154 = new Class72(local94 * 3 + 1, -local94 + 2 * 3 * local94, 0);
			@Pc(161) int local161 = local154.method1684(0, 0, 0, (byte) -96);
			@Pc(165) int[][] local165 = new int[3][local94];
			@Pc(173) int local173;
			@Pc(177) int local177;
			@Pc(179) int local179;
			@Pc(203) int local203;
			for (@Pc(167) int local167 = 0; local167 < 3; local167++) {
				local173 = local135[local167];
				local177 = local135[local167];
				for (local179 = 0; local179 < local94; local179++) {
					@Pc(187) int local187 = (local179 << 14) / local94;
					@Pc(195) int local195 = local173 * Class141.anIntArray207[local187] >> 14;
					local203 = local177 * Class141.anIntArray208[local187] >> 14;
					local165[local167][local179] = local154.method1684(local203, 0, local195, (byte) -98);
				}
			}
			for (local173 = 0; local173 < 3; local173++) {
				local177 = (local173 * 256 + 128) / 3;
				local179 = 256 - local177;
				@Pc(258) byte local258 = (byte) (local177 * arg3 + arg8 * local179 >> 8);
				@Pc(303) short local303 = (short) ((local177 * (arg6 & 0x7F) + local179 * (arg10 & 0x7F) & 0x7F00) + (local179 * (arg10 & 0xFC00) + local177 * (arg6 & 0xFC00) & 0xFC0000) + (local177 * (arg6 & 0x380) + (arg10 & 0x380) * local179 & 0x38000) >> 8);
				for (local203 = 0; local203 < local94; local203++) {
					if (local173 == 0) {
						local154.method1696(local165[0][(local203 + 1) % local94], local165[0][local203], (byte) -1, local258, local303, (byte) 1, local161, (short) -1);
					} else {
						local154.method1696(local165[local173 - 1][(local203 + 1) % local94], local165[local173][(local203 + 1) % local94], (byte) -1, local258, local303, (byte) 1, local165[local173 - 1][local203], (short) -1);
						local154.method1696(local165[local173][(local203 + 1) % local94], local165[local173][local203], (byte) -1, local258, local303, (byte) 1, local165[local173 - 1][local203], (short) -1);
					}
				}
			}
			local56 = arg7.method6908(local154, local12, Static92.anInt11140, 64, 768);
			@Pc(434) Class317 local434 = Static216.aClass317_32;
			synchronized (Static216.aClass317_32) {
				Static216.aClass317_32.method7875(local46, local56);
			}
		}
		@Pc(450) int local450 = arg0.V();
		@Pc(453) int local453 = arg0.RA();
		@Pc(456) int local456 = arg0.HA();
		@Pc(459) int local459 = arg0.G();
		if (arg4 == null) {
			local56 = local56.method5288((byte) 3, local12, true);
			local56.O(local453 - local450 >> 1, 128, local459 - local456 >> 1);
			local56.H(local450 + local453 >> 1, 0, local456 + local459 >> 1);
		} else {
			local56 = local56.method5288((byte) 3, local12, true);
			local56.O(local453 - local450 >> 1, 128, local459 - local456 >> 1);
			local56.H(local450 + local453 >> 1, 0, local459 + local456 >> 1);
			arg4.method8958(local56);
		}
		if (arg5 != 0) {
			local56.FA(arg5);
		}
		if (arg2 != 0) {
			local56.VA(arg2);
		}
		if (arg11 != 0) {
			local56.H(0, arg11, 0);
		}
		return local56;
	}
}
