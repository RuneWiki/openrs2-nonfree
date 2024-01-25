import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!da", name = "h", descriptor = "I")
	public static int anInt1374 = 0;

	@OriginalMember(owner = "client!da", name = "x", descriptor = "[S")
	public static short[] aShortArray20 = new short[256];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	public static void method1231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg2 * Static8.aClass173_Sub1_1.anInt4414 >> 8;
		if (local6 != 0 && arg1 != -1) {
			Static233.method3661(Static305.aClass158_67, local6, arg1);
			Static284.aBoolean341 = true;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
	public static void method1233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static81.anInt1574 <= arg2 - arg1 && Static99.anInt1808 >= arg2 + arg1 && Static97.anInt1796 <= arg3 - arg1 && arg3 + arg1 <= Static85.anInt1636) {
			Static415.method5625(arg3, arg1, arg2, arg0);
		} else {
			Static428.method5841(arg1, arg3, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZI)V")
	public static void method1234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class125 local13 = Static78.aClass125ArrayArray1[arg1][arg0];
		if (local13 != null) {
			Static353.anInt5953 = local13.anInt3074;
			Static108.anInt1928 = local13.anInt3072;
			Static20.anInt356 = local13.anInt3078;
		}
		Static428.method5839();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)V")
	public static void method1235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static367.method5802(arg0)) {
			Static311.method4453(arg3, Static129.aClass239ArrayArray1[arg0], -1, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V")
	public static void method1236(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static313.anInt5099 != -1) {
				Static25.method5897(Static313.anInt5099);
			}
			for (@Pc(14) Class6_Sub16 local14 = (Class6_Sub16) Static20.aClass137_3.method3181(); local14 != null; local14 = (Class6_Sub16) Static20.aClass137_3.method3182()) {
				if (!local14.method5980()) {
					local14 = (Class6_Sub16) Static20.aClass137_3.method3181();
					if (local14 == null) {
						break;
					}
				}
				Static60.method1108(false, true, local14);
			}
			Static313.anInt5099 = -1;
			Static20.aClass137_3 = new Class137(8);
			Static153.method2489();
			Static313.anInt5099 = Static197.anInt3500;
			Static219.method3376(false);
			Static207.method3239();
			Static308.method4423(Static313.anInt5099);
		}
		Static389.method5356();
		Static54.anInt1132 = -1;
		Static151.method2482(Static415.anInt6946);
		Static134.aClass3_Sub3_Sub6_Sub1_1 = new Class3_Sub3_Sub6_Sub1();
		Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray582[0] = Static84.anInt1632 / 2;
		Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 = Static84.anInt1632 * 128 / 2;
		Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 = Static261.anInt4480 * 128 / 2;
		Static214.anInt3730 = 0;
		Static32.anInt521 = 0;
		Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray583[0] = Static261.anInt4480 / 2;
		if (Static9.anInt164 == 2) {
			Static32.anInt521 = Static319.anInt5203 << 7;
			Static214.anInt3730 = Static363.anInt6129 << 7;
		} else {
			Static429.method5847();
		}
		Static121.method1986();
		if (Static32.anInt521 == 0 || Static214.anInt3730 == 0) {
			Static260.method4007(10);
		} else {
			Static290.method4319();
			Static260.method4007(28);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method1237() {
		Static298.method4373(Static378.aClass25_116);
		Static449.aClass6_Sub15_Sub1_2.method3075(Static172.method2743());
		Static449.aClass6_Sub15_Sub1_2.method3100(Static235.anInt4053);
		Static449.aClass6_Sub15_Sub1_2.method3100(Static381.anInt6279);
		Static449.aClass6_Sub15_Sub1_2.method3075(Static8.aClass173_Sub1_1.anInt4417);
	}
}
