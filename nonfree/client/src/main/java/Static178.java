import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
	public static int anInt2663;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_33 = new Class154(58, 3);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!r;ILclient!hq;IILclient!da;IIIBII)Lclient!da;")
	public static Class33 method2296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class148 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class33 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg7 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg4 != null) {
			local11 = arg4.method2587(false, arg0, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg11 << 32) + (long) ((arg3 << 24) + (arg5 << 16) + arg6) + ((long) arg8 << 48);
		@Pc(55) Class21 local55 = Static133.aClass21_19;
		@Pc(65) Class33 local65;
		synchronized (Static133.aClass21_19) {
			local65 = (Class33) Static133.aClass21_19.method324(local48);
		}
		if (local65 == null || arg2.method6881(local65.PA(), local11) != 0) {
			if (local65 != null) {
				local11 = arg2.method6846(local11, local65.PA());
			}
			@Pc(103) byte local103;
			if (arg6 == 1) {
				local103 = 9;
			} else if (arg6 == 2) {
				local103 = 12;
			} else if (arg6 == 3) {
				local103 = 15;
			} else if (arg6 == 4) {
				local103 = 18;
			} else {
				local103 = 21;
			}
			@Pc(132) int[] local132 = new int[] { 64, 96, 128 };
			@Pc(150) Class13 local150 = new Class13(local103 * 3 + 1, -local103 + local103 * 3 * 2, 0);
			@Pc(157) int local157 = local150.method231(0, 0, 0);
			@Pc(161) int[][] local161 = new int[3][local103];
			@Pc(169) int local169;
			@Pc(173) int local173;
			@Pc(175) int local175;
			@Pc(199) int local199;
			for (@Pc(163) int local163 = 0; local163 < 3; local163++) {
				local169 = local132[local163];
				local173 = local132[local163];
				for (local175 = 0; local175 < local103; local175++) {
					@Pc(183) int local183 = (local175 << 14) / local103;
					@Pc(191) int local191 = Class285.anIntArray476[local183] * local169 >> 14;
					local199 = local173 * Class285.anIntArray475[local183] >> 14;
					local161[local163][local175] = local150.method231(0, local199, local191);
				}
			}
			for (local169 = 0; local169 < 3; local169++) {
				local173 = (local169 * 256 + 128) / 3;
				local175 = 256 - local173;
				@Pc(250) byte local250 = (byte) (local173 * arg3 + local175 * arg5 >> 8);
				@Pc(295) short local295 = (short) (((arg11 & 0x7F) * local175 + local173 * (arg8 & 0x7F) & 0x7F00) + ((arg11 & 0xFC00) * local175 + (arg8 & 0xFC00) * local173 & 0xFC0000) + (local173 * (arg8 & 0x380) + (arg11 & 0x380) * local175 & 0x38000) >> 8);
				for (local199 = 0; local199 < local103; local199++) {
					if (local169 == 0) {
						local150.method244((byte) 1, local295, local161[0][(local199 + 1) % local103], local157, local250, (byte) -1, (short) -1, local161[0][local199]);
					} else {
						local150.method244((byte) 1, local295, local161[local169 - 1][(local199 + 1) % local103], local161[local169 - 1][local199], local250, (byte) -1, (short) -1, local161[local169][(local199 + 1) % local103]);
						local150.method244((byte) 1, local295, local161[local169][(local199 + 1) % local103], local161[local169 - 1][local199], local250, (byte) -1, (short) -1, local161[local169][local199]);
					}
				}
			}
			local65 = arg2.method6839(local150, local11, Static104.anInt1836, 64, 768);
			@Pc(415) Class21 local415 = Static133.aClass21_19;
			synchronized (Static133.aClass21_19) {
				Static133.aClass21_19.method317(local65, local48);
			}
		}
		@Pc(431) int local431 = arg7.KA();
		@Pc(434) int local434 = arg7.l();
		@Pc(437) int local437 = arg7.OA();
		@Pc(440) int local440 = arg7.za();
		@Pc(442) Class2_Sub2_Sub15 local442 = null;
		if (arg4 != null) {
			@Pc(449) int local449 = arg4.anIntArray254[arg0];
			local442 = Static117.aClass18_1.method292(local449 >> 16);
			arg0 = local449 & 0xFFFF;
		}
		if (local442 == null) {
			local65 = local65.method7200((byte) 3, local11, true);
			local65.R(local434 - local431 >> 1, 128, local440 - local437 >> 1);
			local65.oa(local431 + local434 >> 1, 0, local437 + local440 >> 1);
		} else {
			local65 = local65.method7200((byte) 3, local11, true);
			local65.R(local434 - local431 >> 1, 128, local440 - local437 >> 1);
			local65.oa(local431 + local434 >> 1, 0, local440 + local437 >> 1);
			local65.method7185(arg0, local442);
		}
		if (arg1 != 0) {
			local65.MA(arg1);
		}
		if (arg9 != 0) {
			local65.W(arg9);
		}
		if (arg12 != 0) {
			local65.oa(0, arg12, 0);
		}
		return local65;
	}
}
