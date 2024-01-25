import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "Lclient!qfa;")
	public static Class309 aClass309_1;

	@OriginalMember(owner = "client!fv", name = "F", descriptor = "I")
	public static int anInt3107 = 0;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIZII)V")
	public static void method2721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = arg0; local8 <= arg2; local8++) {
			Static494.method7075(arg3, arg1, arg4, Static449.anIntArrayArray48[local8], 18601);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIILclient!cb;IILclient!ka;IIILclient!ha;)Lclient!ka;")
	public static Class45 method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class53 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class45 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class145 arg11) {
		if (arg8 == null) {
			return null;
		}
		@Pc(12) int local12 = 2055;
		if (arg5 != null) {
			local12 = arg5.method4082() | 0x807;
			local12 &= 0xFFFFFDFF;
		}
		@Pc(46) long local46 = ((long) arg3 << 48) + (long) ((arg2 << 24) + (arg0 << 16) + arg1) + ((long) arg7 << 32);
		@Pc(48) Class85 local48 = Static146.aClass85_18;
		@Pc(58) Class45 local58;
		synchronized (Static146.aClass85_18) {
			local58 = (Class45) Static146.aClass85_18.method1737(local46);
		}
		if (local58 == null || arg11.method9686(local58.ua(), local12) != 0) {
			if (local58 != null) {
				local12 = arg11.method9695(local12, local58.ua());
			}
			@Pc(91) byte local91;
			if (arg1 == 1) {
				local91 = 9;
			} else if (arg1 == 2) {
				local91 = 12;
			} else if (arg1 == 3) {
				local91 = 15;
			} else if (arg1 == 4) {
				local91 = 18;
			} else {
				local91 = 21;
			}
			@Pc(133) int[] local133 = new int[] { 64, 96, 128 };
			@Pc(150) Class229 local150 = new Class229(local91 * 3 + 1, local91 * 3 * 2 - local91, 0);
			@Pc(157) int local157 = local150.method5318(0, 0, 0);
			@Pc(161) int[][] local161 = new int[3][local91];
			@Pc(169) int local169;
			@Pc(173) int local173;
			@Pc(175) int local175;
			@Pc(199) int local199;
			for (@Pc(163) int local163 = 0; local163 < 3; local163++) {
				local169 = local133[local163];
				local173 = local133[local163];
				for (local175 = 0; local175 < local91; local175++) {
					@Pc(183) int local183 = (local175 << 14) / local91;
					@Pc(191) int local191 = Class145_Sub1.anIntArray761[local183] * local169 >> 14;
					local199 = Class145_Sub1.anIntArray760[local183] * local173 >> 14;
					local161[local163][local175] = local150.method5318(local199, 0, local191);
				}
			}
			for (local169 = 0; local169 < 3; local169++) {
				local173 = (local169 * 256 + 128) / 3;
				local175 = 256 - local173;
				@Pc(257) byte local257 = (byte) (arg2 * local173 + local175 * arg0 >> 8);
				@Pc(302) short local302 = (short) (((arg3 & 0x7F) * local173 + (arg7 & 0x7F) * local175 & 0x7F00) + (local175 * (arg7 & 0x380) + (arg3 & 0x380) * local173 & 0x38000) + (local173 * (arg3 & 0xFC00) + local175 * (arg7 & 0xFC00) & 0xFC0000) >> 8);
				for (local199 = 0; local199 < local91; local199++) {
					if (local169 == 0) {
						local150.method5310((byte) -1, local302, (short) -1, local157, (byte) 1, local257, local161[0][local199], local161[0][(local199 + 1) % local91]);
					} else {
						local150.method5310((byte) -1, local302, (short) -1, local161[local169 - 1][local199], (byte) 1, local257, local161[local169][(local199 + 1) % local91], local161[local169 - 1][(local199 + 1) % local91]);
						local150.method5310((byte) -1, local302, (short) -1, local161[local169 - 1][local199], (byte) 1, local257, local161[local169][local199], local161[local169][(local199 + 1) % local91]);
					}
				}
			}
			local58 = arg11.method9700(local150, local12, Static107.anInt1822, 64, 768);
			@Pc(435) Class85 local435 = Static146.aClass85_18;
			synchronized (Static146.aClass85_18) {
				Static146.aClass85_18.method1745(local46, 16383, local58);
			}
		}
		@Pc(451) int local451 = arg8.V();
		@Pc(454) int local454 = arg8.RA();
		@Pc(457) int local457 = arg8.HA();
		@Pc(460) int local460 = arg8.G();
		if (arg5 == null) {
			local58 = local58.method5768((byte) 3, local12, true);
			local58.O(local454 - local451 >> 1, 128, local460 - local457 >> 1);
			local58.H(local451 + local454 >> 1, 0, local457 + local460 >> 1);
		} else {
			local58 = local58.method5768((byte) 3, local12, true);
			local58.O(local454 - local451 >> 1, 128, local460 - local457 >> 1);
			local58.H(local454 + local451 >> 1, 0, local457 + local460 >> 1);
			arg5.method4096(local58);
		}
		if (arg9 != 0) {
			local58.FA(arg9);
		}
		if (arg10 != 0) {
			local58.VA(arg10);
		}
		if (arg4 != 0) {
			local58.H(0, arg4, 0);
		}
		return local58;
	}
}
