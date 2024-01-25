import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_8 = new Class83("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "J")
	public static long aLong14 = 0L;

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "Lclient!ib;")
	public static final Class102 aClass102_2 = new Class102(16);

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "Lclient!gn;")
	public static final Class84 aClass84_2 = new Class84();

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIILclient!rb;Lclient!rb;)V")
	public static void method181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16_Sub5 arg3, @OriginalArg(4) Class16_Sub5 arg4) {
		@Pc(4) Class164 local4 = Static341.method5175(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass16_Sub5_3 = arg3;
			local4.aClass16_Sub5_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIBIII)I")
	public static int method182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(10) int local10 = arg0;
			arg0 = arg3;
			arg3 = local10;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return 7 + 1 - arg5 - arg0;
		} else if (local3 == 2) {
			return 1 + 7 - arg3 - arg4;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) int local14 = arg1 % 8;
		@Pc(21) int local21;
		if (local14 == 0) {
			local21 = 0;
		} else {
			local21 = 8 - local14;
		}
		@Pc(37) int local37 = -((arg4 + 8 - 1) / 8);
		@Pc(47) int local47 = -((arg1 + 8 - 1) / 8);
		for (@Pc(49) int local49 = local37; local49 < 0; local49++) {
			for (@Pc(53) int local53 = local47; local53 < 0; local53++) {
				if (arg2[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local21;
			if (arg2[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg3;
		}
		return false;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!lh;ZI)V")
	public static void method185(@OriginalArg(0) int arg0, @OriginalArg(1) Class16_Sub1_Sub5_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt6021 && arg2 != -1) {
			@Pc(16) Class138 local16 = Static182.aClass55_1.method1397(arg2);
			@Pc(19) int local19 = local16.anInt4406;
			if (local19 == 1) {
				arg1.anInt6046 = arg0;
				arg1.anInt6073 = 0;
				arg1.anInt6012 = 0;
				arg1.anInt6060 = 0;
				arg1.anInt6058 = 1;
				Static15.method156(arg1.anInt6893, arg1.anInt6060, arg1.aByte82, arg1.anInt6892, local16, arg1 == Static1.aClass16_Sub1_Sub5_Sub1_1);
			}
			if (local19 == 2) {
				arg1.anInt6012 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt6021 == -1 || Static182.aClass55_1.method1397(arg2).anInt4413 >= Static182.aClass55_1.method1397(arg1.anInt6021).anInt4413) {
			arg1.anInt6060 = 0;
			arg1.anInt6021 = arg2;
			arg1.anInt6058 = 1;
			arg1.anInt6012 = 0;
			arg1.anInt6073 = 0;
			arg1.anInt6046 = arg0;
			arg1.anInt6087 = arg1.anInt6086;
			if (arg1.anInt6021 != -1) {
				Static15.method156(arg1.anInt6893, arg1.anInt6060, arg1.aByte82, arg1.anInt6892, Static182.aClass55_1.method1397(arg1.anInt6021), arg1 == Static1.aClass16_Sub1_Sub5_Sub1_1);
			}
		}
	}
}
