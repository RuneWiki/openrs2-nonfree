import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([IZLclient!lv;I)Lclient!pl;")
	public static Class264 method4874(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class192 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = null;
		@Pc(14) int[] local14 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) float[][] local18 = null;
		if (arg1.aByteArray53 != null) {
			@Pc(24) int local24 = arg1.anInt6637;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(30) int[] local30 = new int[local24];
			@Pc(33) int[] local33 = new int[local24];
			@Pc(36) int[] local36 = new int[local24];
			@Pc(39) int[] local39 = new int[local24];
			@Pc(42) int[] local42 = new int[local24];
			for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
				local27[local44] = Integer.MAX_VALUE;
				local30[local44] = -2147483647;
				local33[local44] = Integer.MAX_VALUE;
				local36[local44] = -2147483647;
				local39[local44] = Integer.MAX_VALUE;
				local42[local44] = -2147483647;
			}
			@Pc(82) int local82;
			@Pc(138) int local138;
			for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
				local82 = arg0[local76];
				if (arg1.aByteArray53[local82] != -1) {
					@Pc(95) int local95 = arg1.aByteArray53[local82] & 0xFF;
					for (@Pc(97) int local97 = 0; local97 < 3; local97++) {
						@Pc(114) short local114;
						if (local97 == 0) {
							local114 = arg1.aShortArray104[local82];
						} else if (local97 == 1) {
							local114 = arg1.aShortArray109[local82];
						} else {
							local114 = arg1.aShortArray103[local82];
						}
						@Pc(133) int local133 = arg1.anIntArray317[local114];
						local138 = arg1.anIntArray314[local114];
						@Pc(143) int local143 = arg1.anIntArray319[local114];
						if (local27[local95] > local133) {
							local27[local95] = local133;
						}
						if (local30[local95] < local133) {
							local30[local95] = local133;
						}
						if (local33[local95] > local138) {
							local33[local95] = local138;
						}
						if (local36[local95] < local138) {
							local36[local95] = local138;
						}
						if (local143 < local39[local95]) {
							local39[local95] = local143;
						}
						if (local143 > local42[local95]) {
							local42[local95] = local143;
						}
					}
				}
			}
			local18 = new float[local24][];
			local12 = new int[local24];
			local14 = new int[local24];
			local16 = new int[local24];
			for (local82 = 0; local82 < local24; local82++) {
				@Pc(232) byte local232 = arg1.aByteArray48[local82];
				if (local232 > 0) {
					local12[local82] = (local30[local82] + local27[local82]) / 2;
					local14[local82] = (local33[local82] + local36[local82]) / 2;
					local16[local82] = (local39[local82] + local42[local82]) / 2;
					@Pc(302) float local302;
					@Pc(288) float local288;
					@Pc(300) float local300;
					if (local232 == 1) {
						local138 = arg1.anIntArray310[local82];
						local288 = 64.0F / (float) arg1.anIntArray315[local82];
						if (local138 == 0) {
							local300 = 1.0F;
							local302 = 1.0F;
						} else if (local138 > 0) {
							local300 = (float) local138 / 1024.0F;
							local302 = 1.0F;
						} else {
							local302 = (float) -local138 / 1024.0F;
							local300 = 1.0F;
						}
					} else if (local232 == 2) {
						local288 = 64.0F / (float) arg1.anIntArray315[local82];
						local302 = 64.0F / (float) arg1.anIntArray310[local82];
						local300 = 64.0F / (float) arg1.anIntArray311[local82];
					} else {
						local288 = (float) arg1.anIntArray315[local82] / 1024.0F;
						local302 = (float) arg1.anIntArray310[local82] / 1024.0F;
						local300 = (float) arg1.anIntArray311[local82] / 1024.0F;
					}
					local18[local82] = Static598.method8287(arg1.aByteArray54[local82] & 0xFF, local302, local288, arg1.aShortArray102[local82], arg1.aShortArray111[local82], local300, arg1.aShortArray106[local82]);
				}
			}
		}
		return new Class264(local12, local14, local16, local18);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z[Lclient!sba;IZII)V")
	public static void method4875(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class302[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class302 local13 = arg1[local7];
			if (local13 != null && local13.anInt8857 == arg4) {
				Static446.method6811(arg3, arg2, local13, arg0);
				Static73.method2087(arg2, arg3, local13);
				if (local13.anInt8865 > local13.anInt8891 - local13.anInt8909) {
					local13.anInt8865 = local13.anInt8891 - local13.anInt8909;
				}
				if (local13.anInt8853 - local13.anInt8872 < local13.anInt8847) {
					local13.anInt8847 = local13.anInt8853 - local13.anInt8872;
				}
				if (local13.anInt8865 < 0) {
					local13.anInt8865 = 0;
				}
				if (local13.anInt8847 < 0) {
					local13.anInt8847 = 0;
				}
				if (local13.anInt8936 == 0) {
					Static123.method2614(local13, arg0);
				}
			}
		}
	}
}
