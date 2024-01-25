import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!so", name = "p", descriptor = "I")
	public static int anInt8952;

	@OriginalMember(owner = "client!so", name = "q", descriptor = "I")
	public static int anInt8953;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(JI)V")
	public static void method7536(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 + Static188.anInt3090;
		@Pc(15) int local15 = Static368.anInt6448 + Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367;
		if (Static171.anInt2825 - local10 < -2000 || Static171.anInt2825 - local10 > 2000 || Static602.anInt9872 - local15 < -2000 || Static602.anInt9872 - local15 > 2000) {
			Static602.anInt9872 = local15;
			Static171.anInt2825 = local10;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		if (Static171.anInt2825 != local10) {
			local59 = local10 - Static171.anInt2825;
			local67 = (int) (arg0 * (long) local59 / 320L);
			if (local59 > 0) {
				if (local67 == 0) {
					local67 = 1;
				} else if (local59 < local67) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = -1;
			} else if (local67 < local59) {
				local67 = local59;
			}
			Static171.anInt2825 += local67;
		}
		Static495.aFloat161 += Static644.aFloat196 * (float) arg0 / 6.0F;
		if (local15 != Static602.anInt9872) {
			local59 = local15 - Static602.anInt9872;
			local67 = (int) (arg0 * (long) local59 / 320L);
			if (local59 > 0) {
				if (local67 == 0) {
					local67 = 1;
				} else if (local59 < local67) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = -1;
			} else if (local67 < local59) {
				local67 = local59;
			}
			Static602.anInt9872 += local67;
		}
		Static329.aFloat117 += Static147.aFloat198 * (float) arg0 / 6.0F;
		Static221.method3130();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIII)V")
	public static void method7538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = Static439.method6578(arg1, Static128.anInt2200, Static380.anInt6585);
		@Pc(27) int local27 = Static439.method6578(arg3, Static128.anInt2200, Static380.anInt6585);
		@Pc(33) int local33 = Static439.method6578(arg5, Static361.anInt6317, Static651.anInt10267);
		@Pc(39) int local39 = Static439.method6578(arg4, Static361.anInt6317, Static651.anInt10267);
		@Pc(47) int local47 = Static439.method6578(arg2 + arg1, Static128.anInt2200, Static380.anInt6585);
		@Pc(56) int local56 = Static439.method6578(arg3 - arg2, Static128.anInt2200, Static380.anInt6585);
		for (@Pc(58) int local58 = local19; local58 < local47; local58++) {
			Static343.method5202(local33, Static286.anIntArrayArray42[local58], arg0, local39);
		}
		for (@Pc(74) int local74 = local27; local74 > local56; local74--) {
			Static343.method5202(local33, Static286.anIntArrayArray42[local74], arg0, local39);
		}
		@Pc(100) int local100 = Static439.method6578(arg5 + arg2, Static361.anInt6317, Static651.anInt10267);
		@Pc(109) int local109 = Static439.method6578(arg4 - arg2, Static361.anInt6317, Static651.anInt10267);
		for (@Pc(111) int local111 = local47; local111 <= local56; local111++) {
			@Pc(117) int[] local117 = Static286.anIntArrayArray42[local111];
			Static343.method5202(local33, local117, arg0, local100);
			Static343.method5202(local109, local117, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)Z")
	public static boolean method7539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLclient!wq;B)V")
	public static void method7542(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class394 arg1) {
		@Pc(20) int local20 = arg1.anInt10512 == 0 ? arg1.anInt10536 : arg1.anInt10512;
		@Pc(32) int local32 = arg1.anInt10470 == 0 ? arg1.anInt10532 : arg1.anInt10470;
		Static327.method5092(local32, local20, arg0, Static227.aClass394ArrayArray2[arg1.anInt10490 >> 16], arg1.anInt10490);
		if (arg1.aClass394Array2 != null) {
			Static327.method5092(local32, local20, arg0, arg1.aClass394Array2, arg1.anInt10490);
		}
		@Pc(65) Class5_Sub4 local65 = (Class5_Sub4) Static131.aClass335_15.method7766((long) arg1.anInt10490);
		if (local65 != null) {
			Static206.method2869(local65.anInt257, local32, local20, arg0);
		}
	}
}
