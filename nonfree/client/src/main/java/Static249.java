import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
	public static int anInt4896 = 0;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)Lclient!qo;")
	public static Class147 method3906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass147_1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	public static void method3910() {
		if (Static69.method2440() || Static194.anInt4082 == Static32.anInt876) {
			Static107.method1822();
			if (Static32.anInt876 != Static50.anInt1278) {
				Static227.method3705();
			}
		} else {
			Static10.method154(Static180.anInt3907, Static261.anInt5142, false, Static32.anInt876, Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], false);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIILclient!ml;Lclient!ml;IIJ)V")
	public static void method3914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class122 local8 = new Class122();
		local8.aLong142 = arg8;
		local8.anInt4018 = arg1 * 128 + 64;
		local8.anInt4021 = arg2 * 128 + 64;
		local8.anInt4023 = arg3;
		local8.aClass15_3 = arg4;
		local8.aClass15_2 = arg5;
		local8.anInt4022 = arg6;
		local8.anInt4019 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static52.aClass2_Sub13ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static52.aClass2_Sub13ArrayArrayArray1[local42][arg1][arg2] = new Class2_Sub13(local42, arg1, arg2);
			}
		}
		Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass122_1 = local8;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!la;ILjava/awt/Frame;)V")
	public static void method3916(@OriginalArg(0) Class102 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(8) Class111 local8 = arg0.method2889(arg1);
			while (local8.anInt3788 == 0) {
				Static138.method2475(10L);
			}
			if (local8.anInt3788 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static138.method2475(100L);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLclient!ek;)I")
	public static int method3918(@OriginalArg(1) Class42 arg0) {
		@Pc(12) int local12 = 0;
		if (arg0.method1253(Static119.anInt5238)) {
			local12++;
		}
		if (arg0.method1253(Static95.anInt2289)) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(III)I")
	public static int method3919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(30) int local30 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local30;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static308.anIntArrayArrayArray16[arg0][local16][local20] == -Static40.anInt989) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static9.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5;
			if (!Static294.method4514(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static294.method4514(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static294.method4514(local16, local156, local182)) {
				return false;
			} else if (Static294.method4514(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static87.method1552(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static294.method4514(local16 + 1, Static9.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5, local20 + 1) && Static294.method4514(local16 + 128 - 1, Static9.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static294.method4514(local16 + 128 - 1, Static9.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static294.method4514(local16 + 1, Static9.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLclient!ek;Lclient!ek;)V")
	public static void method3922(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class42 arg1) {
		Static260.aClass42_82 = arg0;
		Static159.aClass42_44 = arg1;
		Static26.anInt4559 = Static260.aClass42_82.method1269(3);
	}
}
