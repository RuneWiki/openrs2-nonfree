import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
	public static int anInt10196;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
	public static int anInt10201;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "Lclient!vj;")
	public static final Class365 aClass365_16 = new Class365(2, 2);

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "Lclient!fa;")
	public static final Class99 aClass99_10 = new Class99();

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIILclient!vga;IIILclient!ka;ILclient!ha;IIII)Lclient!ka;")
	public static Class187 method8685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class362 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class187 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class133 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg6 == null) {
			return null;
		}
		@Pc(16) int local16 = 2055;
		if (arg3 != null) {
			local16 = arg3.method8561(false, arg5, -1) | 0x807;
			local16 &= 0xFFFFFDFF;
		}
		@Pc(52) long local52 = (long) ((arg11 << 24) + (arg4 << 16) + arg7) + ((long) arg12 << 32) + ((long) arg9 << 48);
		@Pc(54) Class87 local54 = Static295.aClass87_129;
		@Pc(62) Class187 local62;
		synchronized (Static295.aClass87_129) {
			local62 = (Class187) Static295.aClass87_129.method1805(local52);
		}
		if (local62 == null || arg8.method7296(local62.ua(), local16) != 0) {
			if (local62 != null) {
				local16 = arg8.method7292(local16, local62.ua());
			}
			@Pc(105) byte local105;
			if (arg7 == 1) {
				local105 = 9;
			} else if (arg7 == 2) {
				local105 = 12;
			} else if (arg7 == 3) {
				local105 = 15;
			} else if (arg7 == 4) {
				local105 = 18;
			} else {
				local105 = 21;
			}
			@Pc(134) int[] local134 = new int[] { 64, 96, 128 };
			@Pc(152) Class26 local152 = new Class26(local105 * 3 + 1, local105 * 6 + -local105, 0);
			@Pc(159) int local159 = local152.method339(0, 0, 0);
			@Pc(163) int[][] local163 = new int[3][local105];
			@Pc(171) int local171;
			@Pc(175) int local175;
			@Pc(177) int local177;
			@Pc(201) int local201;
			for (@Pc(165) int local165 = 0; local165 < 3; local165++) {
				local171 = local134[local165];
				local175 = local134[local165];
				for (local177 = 0; local177 < local105; local177++) {
					@Pc(185) int local185 = (local177 << 14) / local105;
					@Pc(193) int local193 = Class377.anIntArray600[local185] * local171 >> 14;
					local201 = Class377.anIntArray601[local185] * local175 >> 14;
					local163[local165][local177] = local152.method339(local201, local193, 0);
				}
			}
			for (local171 = 0; local171 < 3; local171++) {
				local175 = (local171 * 256 + 128) / 3;
				local177 = 256 - local175;
				@Pc(256) byte local256 = (byte) (local175 * arg11 + local177 * arg4 >> 8);
				@Pc(301) short local301 = (short) ((local175 * (arg9 & 0x7F) + local177 * (arg12 & 0x7F) & 0x7F00) + (local175 * (arg9 & 0x380) + local177 * (arg12 & 0x380) & 0x38000) + ((arg9 & 0xFC00) * local175 + (arg12 & 0xFC00) * local177 & 0xFC0000) >> 8);
				for (local201 = 0; local201 < local105; local201++) {
					if (local171 == 0) {
						local152.method343(local301, local163[0][local201], local159, local163[0][(local201 + 1) % local105], (byte) 1, local256, (byte) -1, (short) -1);
					} else {
						local152.method343(local301, local163[local171][(local201 + 1) % local105], local163[local171 - 1][local201], local163[local171 - 1][(local201 + 1) % local105], (byte) 1, local256, (byte) -1, (short) -1);
						local152.method343(local301, local163[local171][local201], local163[local171 - 1][local201], local163[local171][(local201 + 1) % local105], (byte) 1, local256, (byte) -1, (short) -1);
					}
				}
			}
			local62 = arg8.method7256(local152, local16, Static262.anInt4727, 64, 768);
			@Pc(424) Class87 local424 = Static295.aClass87_129;
			synchronized (Static295.aClass87_129) {
				Static295.aClass87_129.method1792(local52, local62);
			}
		}
		@Pc(440) int local440 = arg6.V();
		@Pc(443) int local443 = arg6.RA();
		@Pc(446) int local446 = arg6.HA();
		@Pc(449) int local449 = arg6.G();
		@Pc(451) Class5_Sub5_Sub12 local451 = null;
		if (arg3 != null) {
			@Pc(458) int local458 = arg3.anIntArray571[arg5];
			local451 = Static435.aClass298_1.method7026(local458 >> 16);
			arg5 = local458 & 0xFFFF;
		}
		if (local451 == null) {
			local62 = local62.method8656((byte) 3, local16, true);
			local62.O(local443 - local440 >> 1, 128, local449 - local446 >> 1);
			local62.H(local440 + local443 >> 1, 0, local446 + local449 >> 1);
		} else {
			local62 = local62.method8656((byte) 3, local16, true);
			local62.O(local443 - local440 >> 1, 128, local449 - local446 >> 1);
			local62.H(local443 + local440 >> 1, 0, local449 + local446 >> 1);
			local62.method8655(local451, arg5);
		}
		if (arg10 != 0) {
			local62.FA(arg10);
		}
		if (arg1 != 0) {
			local62.VA(arg1);
		}
		if (arg0 != 0) {
			local62.H(0, arg0, 0);
		}
		return local62;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!aca;)V")
	public static void method8686(@OriginalArg(1) Class5_Sub1 arg0) {
		arg0.aBoolean693 = false;
		if (arg0.aClass5_Sub37_6 != null) {
			arg0.aClass5_Sub37_6.anInt8934 = 0;
		}
		for (@Pc(22) Class5_Sub1 local22 = arg0.method8282(); local22 != null; local22 = arg0.method8285()) {
			method8686(local22);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZLclient!ii;ZB)V")
	public static void method8688(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub27 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt4270;
		@Pc(12) int local12 = (int) arg1.aLong278;
		arg1.method9047();
		if (arg0) {
			Static431.method5476(local8);
		}
		Static81.method1368(local8);
		@Pc(31) Class295 local31 = Static107.method9049(local12);
		if (local31 != null) {
			Static465.method6901(local31);
		}
		Static10.method206();
		if (!arg2 && Static337.anInt5727 != -1) {
			Static441.method6684(1, Static337.anInt5727);
		}
		@Pc(54) Class83 local54 = new Class83(Static269.aClass273_11);
		for (@Pc(59) Class5_Sub27 local59 = (Class5_Sub27) local54.method1694(); local59 != null; local59 = (Class5_Sub27) local54.method1693()) {
			if (!local59.method9048()) {
				local59 = (Class5_Sub27) local54.method1694();
				if (local59 == null) {
					return;
				}
			}
			if (local59.anInt4272 == 3) {
				@Pc(81) int local81 = (int) local59.aLong278;
				if (local81 >>> 16 == local8) {
					method8688(true, local59, arg2);
				}
			}
		}
	}
}
