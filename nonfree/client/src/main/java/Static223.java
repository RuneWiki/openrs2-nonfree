import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!vk;")
	public static Class302 aClass302_1;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_101 = new Class150(5, -1);

	@OriginalMember(owner = "client!j", name = "c", descriptor = "[I")
	public static int[] anIntArray287 = new int[2];

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method3540() {
		for (@Pc(10) Class5_Sub2_Sub15 local10 = (Class5_Sub2_Sub15) Static22.aClass99_3.method2526(); local10 != null; local10 = (Class5_Sub2_Sub15) Static22.aClass99_3.method2519()) {
			@Pc(20) Class15_Sub2_Sub3 local20 = local10.aClass15_Sub2_Sub3_1;
			if (local20.anInt3959 < Static481.anInt8318) {
				local10.method7425();
				local20.method3430();
			} else if (local20.anInt3956 <= Static481.anInt8318) {
				if (local20.anInt3975 > 0) {
					@Pc(56) Class5_Sub51 local56 = (Class5_Sub51) Static521.aClass42_42.method1109((long) (local20.anInt3975 - 1));
					if (local56 != null) {
						@Pc(61) Class15_Sub2_Sub1_Sub2 local61 = local56.aClass15_Sub2_Sub1_Sub2_2;
						if (local61.anInt8492 >= 0 && Static460.anInt7894 * 128 > local61.anInt8492 && local61.anInt8493 >= 0 && local61.anInt8493 < Static235.anInt4493 * 128) {
							local20.method3427(Static191.method5464(local61.anInt8492, local61.anInt8493, local20.aByte91) - local20.anInt3971, local61.anInt8493, local61.anInt8492, Static481.anInt8318);
						}
					}
				}
				if (local20.anInt3975 < 0) {
					@Pc(111) int local111 = -local20.anInt3975 - 1;
					@Pc(118) Class15_Sub2_Sub1_Sub1 local118;
					if (Static510.anInt8653 == local111) {
						local118 = Static35.aClass15_Sub2_Sub1_Sub1_1;
					} else {
						local118 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local111];
					}
					if (local118 != null && local118.anInt8492 >= 0 && local118.anInt8492 < Static460.anInt7894 * 128 && local118.anInt8493 >= 0 && local118.anInt8493 < Static235.anInt4493 * 128) {
						local20.method3427(Static191.method5464(local118.anInt8492, local118.anInt8493, local20.aByte91) - local20.anInt3971, local118.anInt8493, local118.anInt8492, Static481.anInt8318);
					}
				}
				local20.method3424(Static168.anInt7198);
				Static68.method1297(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!tv;)V")
	public static void method3541(@OriginalArg(0) Class15_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort110; local2 <= arg0.aShort111; local2++) {
			for (@Pc(6) int local6 = arg0.aShort109; local6 <= arg0.aShort108; local6++) {
				@Pc(16) Class37 local16 = Static152.aClass37ArrayArrayArray1[arg0.aByte91][local2][local6];
				if (local16 != null) {
					@Pc(21) Class108 local21 = local16.aClass108_1;
					@Pc(23) Class108 local23 = null;
					while (local21 != null) {
						if (local21.aClass15_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass108_1 = local21.aClass108_3;
							} else {
								local23.aClass108_3 = local21.aClass108_3;
							}
							local21.method2791();
							break;
						}
						local23 = local21;
						local21 = local21.aClass108_3;
					}
					local16.aByte27 = 0;
					for (@Pc(56) Class108 local56 = local16.aClass108_1; local56 != null; local56 = local56.aClass108_3) {
						local16.aByte27 = (byte) (local16.aByte27 | local56.anInt3129);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!jba;III)V")
	public static void method3542(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static479.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt5117 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass5_Sub10Array5[arg0.anInt5117++] = Static24.aClass250Array3[local21 - 1].aClass5_Sub10_3;
			local9 += 16L;
		}
		for (local21 = arg0.anInt5117; local21 < 4; local21++) {
			arg0.aClass5_Sub10Array5[local21] = null;
		}
	}
}
