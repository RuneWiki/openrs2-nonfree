import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "Lclient!ul;")
	public static Class246 aClass246_114;

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "Lclient!la;")
	public static Class71 aClass71_6;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIBI)V")
	public static void method3068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13;
		if (arg2 > arg3) {
			for (local13 = arg3; local13 < arg2; local13++) {
				Static163.anIntArrayArray35[local13][arg1] = arg0;
			}
		} else {
			for (local13 = arg2; local13 < arg3; local13++) {
				Static163.anIntArrayArray35[local13][arg1] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!lq;)V")
	public static void method3070(@OriginalArg(0) Class31_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort103; local2 <= arg0.aShort100; local2++) {
			for (@Pc(6) int local6 = arg0.aShort102; local6 <= arg0.aShort101; local6++) {
				@Pc(16) Class80 local16 = client.lb[arg0.aByte100][local2][local6];
				if (local16 != null) {
					@Pc(21) Class22 local21 = local16.aClass22_2;
					@Pc(23) Class22 local23 = null;
					while (local21 != null) {
						if (local21.aClass31_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass22_2 = local21.aClass22_1;
							} else {
								local23.aClass22_1 = local21.aClass22_1;
							}
							local21.method579();
							break;
						}
						local23 = local21;
						local21 = local21.aClass22_1;
					}
					local16.aByte50 = 0;
					for (@Pc(56) Class22 local56 = local16.aClass22_2; local56 != null; local56 = local56.aClass22_1) {
						local16.aByte50 = (byte) (local16.aByte50 | local56.anInt640);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZLclient!uq;)V")
	public static void method3072(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class251 arg1) {
		@Pc(12) int local12 = arg1.anInt6662 == 0 ? arg1.anInt6687 : arg1.anInt6662;
		@Pc(24) int local24 = arg1.anInt6727 == 0 ? arg1.anInt6677 : arg1.anInt6727;
		Static327.method4647(local24, local12, arg1.anInt6689, Static437.aClass251ArrayArray2[arg1.anInt6689 >> 16], arg0);
		if (arg1.aClass251Array2 != null) {
			Static327.method4647(local24, local12, arg1.anInt6689, arg1.aClass251Array2, arg0);
		}
		@Pc(65) Class1_Sub23 local65 = (Class1_Sub23) Static101.aClass96_16.method2335((long) arg1.anInt6689);
		if (local65 != null) {
			Static99.method1777(arg0, local12, local24, local65.anInt3059);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z")
	public static boolean method3073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
