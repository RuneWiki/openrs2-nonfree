import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
	public static int anInt4179;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "[I")
	public static final int[] anIntArray303 = new int[32];

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
	public static int anInt4172 = 100;

	@OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
	public static final int anInt4174 = 1338;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!kq;IILclient!aa;ZLclient!ha;II)V")
	public static void method3717(@OriginalArg(0) int arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(6) Class33 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class259 local10 = Static526.aClass59_4.method1798(arg6);
		if (local10 == null || !local10.aBoolean515 || !local10.method5863(Static526.aClass293_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray462 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray462.length];
			@Pc(43) int local43;
			@Pc(54) int local54;
			@Pc(58) int local58;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static259.anInt4200 == 4) {
					local43 = (int) Static642.aFloat230 & 0x3FFF;
				} else {
					local43 = (int) Static642.aFloat230 + Static354.anInt5391 & 0x3FFF;
				}
				local54 = Class4_Sub2_Sub26.anIntArray563[local43];
				local58 = Class4_Sub2_Sub26.anIntArray562[local43];
				if (Static259.anInt4200 != 4) {
					local58 = local58 * 256 / (Static338.anInt5228 + 256);
					local54 = local54 * 256 / (Static338.anInt5228 + 256);
				}
				local28[local30 * 2] = ((arg7 + local10.anIntArray462[local30 * 2] * 4) * local58 + (arg0 + local10.anIntArray462[local30 * 2 + 1] * 4) * local54 >> 14) + arg2 + arg1.anInt5035 / 2;
				local28[local30 * 2 + 1] = arg1.anInt4994 / 2 + arg3 - ((arg0 + local10.anIntArray462[local30 * 2 + 1] * 4) * local58 - local54 * (local10.anIntArray462[local30 * 2] * 4 + arg7) >> 14);
			}
			Static372.method4915(arg5, local28, local10.anInt6650, arg1.anIntArray383, arg1.anIntArray387);
			if (local10.anInt6668 <= 0) {
				for (local43 = 0; local43 < local28.length / 2 - 1; local43++) {
					arg5.method8123(local28[local43 * 2], local28[local43 * 2 + 1], local28[local43 * 2 + 2], local28[local43 * 2 + 1 + 2], local10.anIntArray461[local10.aByteArray61[local43] & 0xFF], arg4, arg2, arg3);
				}
				arg5.method8123(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anIntArray461[local10.aByteArray61[local10.aByteArray61.length - 1] & 0xFF], arg4, arg2, arg3);
			} else {
				@Pc(305) int local305;
				@Pc(315) int local315;
				@Pc(324) int local324;
				@Pc(328) int local328;
				for (local43 = 0; local43 < local28.length / 2 - 1; local43++) {
					local54 = local28[local43 * 2];
					local58 = local28[local43 * 2 + 1];
					local305 = local28[local43 * 2 + 2];
					local315 = local28[(local43 + 1) * 2 + 1];
					if (local305 < local54) {
						local324 = local54;
						local54 = local305;
						local328 = local58;
						local58 = local315;
						local305 = local324;
						local315 = local328;
					} else if (local305 == local54 && local58 > local315) {
						local324 = local58;
						local58 = local315;
						local315 = local324;
					}
					arg5.method8125(local54, local58, local305, local315, local10.anIntArray461[local10.aByteArray61[local43] & 0xFF], arg4, arg2, arg3, local10.anInt6668, local10.anInt6652, local10.anInt6680);
				}
				local54 = local28[local28.length - 2];
				local58 = local28[local28.length - 1];
				local305 = local28[0];
				local315 = local28[1];
				if (local305 < local54) {
					local324 = local54;
					local328 = local58;
					local54 = local305;
					local58 = local315;
					local305 = local324;
					local315 = local328;
				} else if (local305 == local54 && local58 > local315) {
					local324 = local58;
					local58 = local315;
					local315 = local324;
				}
				arg5.method8125(local54, local58, local305, local315, local10.anIntArray461[local10.aByteArray61[local10.aByteArray61.length - 1] & 0xFF], arg4, arg2, arg3, local10.anInt6668, local10.anInt6652, local10.anInt6680);
			}
		}
		@Pc(472) Class17 local472 = null;
		if (local10.anInt6678 != -1) {
			local472 = local10.method5862(arg5, false);
			if (local472 != null) {
				Static559.method7427(arg0, local472, arg7, arg4, arg3, arg2, arg1);
			}
		}
		if (local10.aString80 == null) {
			return;
		}
		local30 = 0;
		if (local472 != null) {
			local30 = local472.method5253();
		}
		@Pc(506) Class56 local506 = Static302.aClass56_9;
		@Pc(508) Class31 local508 = Static321.aClass31_5;
		if (local10.anInt6685 == 1) {
			local506 = Static189.aClass56_5;
			local508 = Static636.aClass31_14;
		}
		if (local10.anInt6685 == 2) {
			local506 = Static344.aClass56_10;
			local508 = Static641.aClass31_10;
		}
		Static674.method8949(local506, local10.anInt6662, arg2, arg7, arg4, local508, local30, arg1, local10.aString80, arg0, arg3);
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(B)V")
	public static void method3718() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static527.aBooleanArray18[local7] = false;
		}
		Static69.anInt1456 = Static611.anInt9382;
		Static55.anInt1260 = 0;
		Static378.anInt5618 = Static226.anInt3586;
		Static286.anInt4563 = -1;
		Static77.anInt1632 = -1;
		Static608.anInt9348 = 0;
		Static27.anInt616 = Static618.anInt9710;
		Static259.anInt4200 = 5;
		Static632.anInt9868 = Static177.anInt3088;
		Static75.anInt1621 = -1;
		Static392.anInt5769 = Static383.anInt9871;
		Static558.anInt8603 = -1;
		Static10.anInt163 = Static652.anInt10283;
	}
}
