import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILjava/lang/String;Lclient!ofa;)I")
	public static int method8718(@OriginalArg(1) String arg0, @OriginalArg(2) Class5_Sub22 arg1) {
		@Pc(6) int local6 = arg1.anInt6629;
		@Pc(15) byte[] local15 = Static390.method5793(arg0);
		arg1.method5932(local15.length);
		arg1.anInt6629 += Static411.aClass152_1.method3710(0, arg1.anInt6629, local15.length, arg1.aByteArray71, local15);
		return arg1.anInt6629 - local6;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)V")
	public static void method8719(@OriginalArg(0) int arg0) {
		Static10.anInt220 = 2;
		Static92.anInt1879 = arg0;
		if (Static358.aString61 == null) {
			Static606.method8671(35);
		} else {
			@Pc(24) Class5_Sub22 local24 = new Class5_Sub22(Static483.method7166(Static89.method1512(Static358.aString61)));
			@Pc(28) long local28 = local24.method5907();
			Static66.aLong35 = local24.method5907();
			Static567.method8234(Static249.method4127(local28), "", true);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BI)Z")
	public static boolean method8723(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IFFF)I")
	public static int method8725(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(13) float local13 = (float) 0 > arg1 ? -arg1 : arg1;
		@Pc(22) float local22 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(31) float local31 = arg2 < 0.0F ? -arg2 : arg2;
		if (local13 < local22 && local22 > local31) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local13 < local31 && local31 > local22) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIBIII)I")
	public static int method8728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static11.aClass61Array1 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(22) int local22 = arg4 >> 9;
			@Pc(26) int local26 = arg3 >> 9;
			if (arg2 < 0 || arg1 < 0 || Static326.anInt5541 - 1 < arg2 || arg1 > Static448.anInt7637 - 1) {
				return 0;
			} else if (local22 >= 1 && local26 >= 1 && Static326.anInt5541 - 1 >= local22 && local26 <= Static448.anInt7637 - 1) {
				@Pc(107) boolean local107 = (Static305.aByteArrayArrayArray18[1][arg4 >> 9][arg3 >> 9] & 0x2) != 0;
				@Pc(135) boolean local135;
				@Pc(151) boolean local151;
				if ((arg4 & 0x1FF) == 0) {
					local135 = (Static305.aByteArrayArrayArray18[1][local22 - 1][arg3 >> 9] & 0x2) != 0;
					local151 = (Static305.aByteArrayArrayArray18[1][local22][arg3 >> 9] & 0x2) != 0;
					if (local151 != local135) {
						local107 = (Static305.aByteArrayArrayArray18[1][arg2][arg1] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x1FF) == 0) {
					local135 = (Static305.aByteArrayArrayArray18[1][arg4 >> 9][local26 - 1] & 0x2) != 0;
					local151 = (Static305.aByteArrayArrayArray18[1][arg4 >> 9][local26] & 0x2) != 0;
					if (local151 != local135) {
						local107 = (Static305.aByteArrayArrayArray18[1][arg2][arg1] & 0x2) != 0;
					}
				}
				if (local107) {
					arg0++;
				}
				return Static11.aClass61Array1[arg0].method8584(arg3, arg4);
			} else {
				return 0;
			}
		} else {
			return Static11.aClass61Array1[arg0].method8584(arg3, arg4);
		}
	}
}
