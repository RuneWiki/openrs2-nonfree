import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
	public static int anInt4252;

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_50 = new Class158(45, 16);

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(Z)[Lclient!ng;")
	public static Class204[] method3511() {
		if (Static544.aClass204Array1 == null) {
			@Pc(7) Class204[] local7 = Static464.method6914(Static401.aClass285_11);
			@Pc(11) Class204[] local11 = new Class204[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = Static7.aClass3_Sub15_Sub1_1.method6955(Static382.anInt7091);
			@Pc(83) int local83;
			@Pc(89) Class204 local89;
			label69: for (@Pc(20) int local20 = 0; local20 < local7.length; local20++) {
				@Pc(26) Class204 local26 = local7[local20];
				if ((local26.anInt6219 <= 0 || local26.anInt6219 >= 24) && local26.anInt6216 >= 800 && local26.anInt6218 >= 600 && (local18 != 2 || local26.anInt6216 <= 800 && local26.anInt6218 <= 600) && (local18 != 1 || local26.anInt6216 <= 1024 && local26.anInt6218 <= 768)) {
					for (local83 = 0; local83 < local13; local83++) {
						local89 = local11[local83];
						if (local26.anInt6216 == local89.anInt6216 && local26.anInt6218 == local89.anInt6218) {
							if (local26.anInt6219 > local89.anInt6219) {
								local11[local83] = local26;
							}
							continue label69;
						}
					}
					local11[local13] = local26;
					local13++;
				}
			}
			Static544.aClass204Array1 = new Class204[local13];
			Static559.method5954(local11, 0, Static544.aClass204Array1, 0, local13);
			@Pc(157) int[] local157 = new int[Static544.aClass204Array1.length];
			for (local83 = 0; local83 < Static544.aClass204Array1.length; local83++) {
				local89 = Static544.aClass204Array1[local83];
				local157[local83] = local89.anInt6216 * local89.anInt6218;
			}
			Static425.method6516(local157, Static544.aClass204Array1);
		}
		return Static544.aClass204Array1;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method3515(@OriginalArg(0) Class5 arg0) {
		arg0.ca(0, 0, Static480.anInt8652, 350);
		arg0.C(0, 0, Static480.anInt8652, 350, Static506.anInt8840 << 24 | 0x332277, 1);
		@Pc(32) int local32 = 350 / Static174.anInt3996;
		@Pc(42) int local42;
		if (Static504.anInt9379 > 0) {
			local42 = 342 - Static174.anInt3996;
			@Pc(52) int local52 = local32 * local42 / (local32 + Static504.anInt9379 - 1);
			@Pc(54) int local54 = 4;
			if (Static504.anInt9379 > 1) {
				local54 = (local42 - local52) * ((Static504.anInt9379 - Static167.anInt3861) + -1) / (Static504.anInt9379 - 1) + 4;
			}
			arg0.C(Static480.anInt8652 - 16, local54, 12, local52, Static506.anInt8840 << 24 | 0x332277, 2);
			for (@Pc(92) int local92 = Static167.anInt3861; Static167.anInt3861 + local32 > local92 && Static504.anInt9379 > local92; local92++) {
				@Pc(101) String[] local101 = Static439.method6626('\b', Static305.aStringArray37[local92]);
				@Pc(108) int local108 = (Static480.anInt8652 - 24) / local101.length;
				for (@Pc(110) int local110 = 0; local110 < local101.length; local110++) {
					@Pc(118) int local118 = local108 * local110 + 8;
					arg0.ca(local118, 0, local108 + local118 - 8, 350);
					Static164.aClass59_1.method7281(350 - Static54.aClass53_7.anInt1514 - Static203.anInt4549 - (-Static167.anInt3861 + local92) * Static174.anInt3996 - 2, local101[local110], -1, -16777216, local118);
				}
			}
		}
		arg0.ca(0, 0, Static480.anInt8652, 350);
		arg0.method7434(0, Static480.anInt8652, -1, 350 - Static203.anInt4549);
		Static294.aClass59_2.method7281(349 - Static25.aClass53_6.anInt1514, "--> " + Static27.aString7, -1, -16777216, 10);
		if (!Static530.aBoolean675) {
			return;
		}
		local42 = -1;
		if (Static223.anInt4829 % 30 > 15) {
			local42 = 16777215;
		}
		arg0.method7476(local42, Static25.aClass53_6.method1378("--> " + Static27.aString7.substring(0, Static149.anInt2987)) + 10, -Static25.aClass53_6.anInt1514 + 339, 12);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method3523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 >= Static190.anInt4314 && arg7 <= Static145.anInt2941 && Static190.anInt4314 <= arg5 && arg5 <= Static145.anInt2941 && Static190.anInt4314 <= arg8 && arg8 <= Static145.anInt2941 && arg4 >= Static190.anInt4314 && arg4 <= Static145.anInt2941 && arg0 >= Static269.anInt5577 && Static81.anInt1788 >= arg0 && Static269.anInt5577 <= arg3 && Static81.anInt1788 >= arg3 && arg6 >= Static269.anInt5577 && arg6 <= Static81.anInt1788 && arg1 >= Static269.anInt5577 && Static81.anInt1788 >= arg1) {
			Static267.method4687(arg6, arg4, arg2, arg0, arg7, arg8, arg1, arg5, arg3);
		} else {
			Static311.method5071(arg1, arg4, arg7, arg8, arg5, arg2, arg6, arg0, arg3);
		}
	}
}
