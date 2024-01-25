import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
	public static int anInt4149 = 0;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBIIII)I")
	public static int method3782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static420.aClass84Array4 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(21) int local21 = arg4 >> 7;
			@Pc(25) int local25 = arg0 >> 7;
			if (arg3 < 0 || arg1 < 0 || arg3 > Static84.anInt1632 - 1 || Static261.anInt4480 - 1 < arg1) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && local21 <= Static84.anInt1632 - 1 && Static261.anInt4480 - 1 >= local25) {
				@Pc(91) boolean local91 = (Static179.aByteArrayArrayArray3[1][arg4 >> 7][arg0 >> 7] & 0x2) != 0;
				@Pc(113) boolean local113;
				@Pc(129) boolean local129;
				if ((arg4 & 0x7F) == 0) {
					local113 = (Static179.aByteArrayArrayArray3[1][local21 - 1][arg0 >> 7] & 0x2) != 0;
					local129 = (Static179.aByteArrayArrayArray3[1][local21][arg0 >> 7] & 0x2) != 0;
					if (local129 != local113) {
						local91 = (Static179.aByteArrayArrayArray3[1][arg3][arg1] & 0x2) != 0;
					}
				}
				if ((arg0 & 0x7F) == 0) {
					local113 = (Static179.aByteArrayArrayArray3[1][arg4 >> 7][local25 - 1] & 0x2) != 0;
					local129 = (Static179.aByteArrayArrayArray3[1][arg4 >> 7][local25] & 0x2) != 0;
					if (local113 != local129) {
						local91 = (Static179.aByteArrayArrayArray3[1][arg3][arg1] & 0x2) != 0;
					}
				}
				if (local91) {
					arg2++;
				}
				return Static420.aClass84Array4[arg2].method5334(arg4, arg0);
			} else {
				return 0;
			}
		} else {
			return Static420.aClass84Array4[arg2].method5334(arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public static void method3783() {
		@Pc(7) int local7 = Static416.anInt4773;
		@Pc(9) int[] local9 = Static5.anIntArray3;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class3_Sub3_Sub6_Sub1 local19 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static168.method2732(local19, local19.method5512());
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	public static void method3786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass3_Sub1_1 != null) {
			local7.aClass3_Sub1_1 = null;
		}
		if (local7.aClass3_Sub1_2 != null) {
			local7.aClass3_Sub1_2 = null;
		}
	}
}
