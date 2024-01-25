import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
	public static int anInt6203 = 0;

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_82 = new Class212(43, 7);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBZ)V")
	public static void method5094(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) Class4_Sub38 local16 = Static351.method5112(arg1, arg0);
		if (local16 != null) {
			local16.method6330();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)I")
	public static int method5098(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static389.aClass14Array3 == null) {
			return 0;
		} else if (arg4 < 3) {
			@Pc(14) int local14 = arg3 >> 7;
			@Pc(18) int local18 = arg0 >> 7;
			if (arg2 < 0 || arg1 < 0 || Static193.anInt3853 - 1 < arg2 || arg1 > Static301.anInt5585 - 1) {
				return 0;
			} else if (local14 >= 1 && local18 >= 1 && Static193.anInt3853 - 1 >= local14 && local18 <= Static301.anInt5585 - 1) {
				@Pc(86) boolean local86 = (Static398.aByteArrayArrayArray17[1][arg3 >> 7][arg0 >> 7] & 0x2) != 0;
				@Pc(114) boolean local114;
				@Pc(130) boolean local130;
				if ((arg3 & 0x7F) == 0) {
					local114 = (Static398.aByteArrayArrayArray17[1][local14 - 1][arg0 >> 7] & 0x2) != 0;
					local130 = (Static398.aByteArrayArrayArray17[1][local14][arg0 >> 7] & 0x2) != 0;
					if (local130 != local114) {
						local86 = (Static398.aByteArrayArrayArray17[1][arg2][arg1] & 0x2) != 0;
					}
				}
				if ((arg0 & 0x7F) == 0) {
					local114 = (Static398.aByteArrayArrayArray17[1][arg3 >> 7][local18 - 1] & 0x2) != 0;
					local130 = (Static398.aByteArrayArrayArray17[1][arg3 >> 7][local18] & 0x2) != 0;
					if (local130 != local114) {
						local86 = (Static398.aByteArrayArrayArray17[1][arg2][arg1] & 0x2) != 0;
					}
				}
				if (local86) {
					arg4++;
				}
				return Static389.aClass14Array3[arg4].R(arg3, arg0);
			} else {
				return 0;
			}
		} else {
			return Static389.aClass14Array3[arg4].R(arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([Ljava/lang/Object;[IIII)V")
	public static void method5101(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) int local16 = arg1[local10];
		arg1[local10] = arg1[arg2];
		arg1[arg2] = local16;
		@Pc(30) Object local30 = arg0[local10];
		arg0[local10] = arg0[arg2];
		arg0[arg2] = local30;
		@Pc(47) int local47 = local16 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(49) int local49 = arg3; local49 < arg2; local49++) {
			if (arg1[local49] < local16 + (local47 & local49)) {
				@Pc(65) int local65 = arg1[local49];
				arg1[local49] = arg1[local12];
				arg1[local12] = local65;
				@Pc(79) Object local79 = arg0[local49];
				arg0[local49] = arg0[local12];
				arg0[local12++] = local79;
			}
		}
		arg1[arg2] = arg1[local12];
		arg1[local12] = local16;
		arg0[arg2] = arg0[local12];
		arg0[local12] = local30;
		method5101(arg0, arg1, local12 - 1, arg3);
		method5101(arg0, arg1, arg2, local12 + 1);
	}
}
