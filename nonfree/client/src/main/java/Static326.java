import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
	public static int anInt5856;

	@OriginalMember(owner = "client!mh", name = "O", descriptor = "[I")
	public static final int[] anIntArray454 = new int[4096];

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)I")
	public static int method5062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static29.aClass139Array6 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(21) int local21 = arg1 >> 9;
			@Pc(25) int local25 = arg4 >> 9;
			if (arg2 < 0 || arg3 < 0 || Static400.anInt6818 - 1 < arg2 || arg3 > Static271.anInt5050 - 1) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && Static400.anInt6818 - 1 >= local21 && Static271.anInt5050 - 1 >= local25) {
				@Pc(88) boolean local88 = (Static154.aByteArrayArrayArray15[1][arg1 >> 9][arg4 >> 9] & 0x2) != 0;
				@Pc(113) boolean local113;
				@Pc(132) boolean local132;
				if ((arg1 & 0x1FF) == 0) {
					local113 = (Static154.aByteArrayArrayArray15[1][local21 - 1][arg4 >> 9] & 0x2) != 0;
					local132 = (Static154.aByteArrayArrayArray15[1][local21][arg4 >> 9] & 0x2) != 0;
					if (local113 != local132) {
						local88 = (Static154.aByteArrayArrayArray15[1][arg2][arg3] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x1FF) == 0) {
					local113 = (Static154.aByteArrayArrayArray15[1][arg1 >> 9][local25 - 1] & 0x2) != 0;
					local132 = (Static154.aByteArrayArrayArray15[1][arg1 >> 9][local25] & 0x2) != 0;
					if (local113 != local132) {
						local88 = (Static154.aByteArrayArrayArray15[1][arg2][arg3] & 0x2) != 0;
					}
				}
				if (local88) {
					arg0++;
				}
				return Static29.aClass139Array6[arg0].method6890(arg1, arg4);
			} else {
				return 0;
			}
		} else {
			return Static29.aClass139Array6[arg0].method6890(arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B[Lclient!lk;I)V")
	public static void method5065(@OriginalArg(1) Class203[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(21) Class203 local21 = arg0[local7];
			if (local21 != null) {
				if (local21.anInt5473 == 0) {
					if (local21.aClass203Array2 != null) {
						method5065(local21.aClass203Array2, arg1);
					}
					@Pc(42) Class3_Sub28 local42 = (Class3_Sub28) Static227.aClass310_15.method6601((long) local21.anInt5531);
					if (local42 != null) {
						Static107.method5739(local42.anInt5333, arg1);
					}
				}
				@Pc(61) Class3_Sub45 local61;
				if (arg1 == 0 && local21.anObjectArray11 != null) {
					local61 = new Class3_Sub45();
					local61.aClass203_136 = local21;
					local61.anObjectArray33 = local21.anObjectArray11;
					Static149.method2778(local61);
				}
				if (arg1 == 1 && local21.anObjectArray15 != null) {
					if (local21.anInt5504 >= 0) {
						@Pc(87) Class203 local87 = Static414.method5954(local21.anInt5531);
						if (local87 == null || local87.aClass203Array2 == null || local87.aClass203Array2.length <= local21.anInt5504 || local21 != local87.aClass203Array2[local21.anInt5504]) {
							continue;
						}
					}
					local61 = new Class3_Sub45();
					local61.aClass203_136 = local21;
					local61.anObjectArray33 = local21.anObjectArray15;
					Static149.method2778(local61);
				}
			}
		}
	}
}
