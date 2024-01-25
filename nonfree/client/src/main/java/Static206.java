import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
	public static int anInt3014;

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "[I")
	public static final int[] anIntArray249 = new int[14];

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
	public static int anInt3015 = 0;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V")
	public static void method2564() {
		Static361.aClass2_Sub7_Sub2_1.method4530();
		@Pc(13) int local13 = Static361.aClass2_Sub7_Sub2_1.method4535(8);
		@Pc(18) int local18;
		if (local13 < Static365.anInt6148) {
			for (local18 = local13; local18 < Static365.anInt6148; local18++) {
				Static19.anIntArray48[Static579.anInt9393++] = Static461.anIntArray562[local18];
			}
		}
		if (local13 > Static365.anInt6148) {
			throw new RuntimeException("gnpov1");
		}
		Static365.anInt6148 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(57) int local57 = Static461.anIntArray562[local18];
			@Pc(65) Class12_Sub2_Sub1_Sub4_Sub2 local65 = ((Class2_Sub5) Static436.aClass90_26.method1685((long) local57)).aClass12_Sub2_Sub1_Sub4_Sub2_1;
			@Pc(70) int local70 = Static361.aClass2_Sub7_Sub2_1.method4535(1);
			if (local70 == 0) {
				Static461.anIntArray562[Static365.anInt6148++] = local57;
				local65.anInt8367 = Static417.anInt8887;
			} else {
				@Pc(93) int local93 = Static361.aClass2_Sub7_Sub2_1.method4535(2);
				if (local93 == 0) {
					Static461.anIntArray562[Static365.anInt6148++] = local57;
					local65.anInt8367 = Static417.anInt8887;
					Static224.anIntArray269[Static549.anInt9008++] = local57;
				} else {
					@Pc(138) int local138;
					@Pc(152) int local152;
					if (local93 == 1) {
						Static461.anIntArray562[Static365.anInt6148++] = local57;
						local65.anInt8367 = Static417.anInt8887;
						local138 = Static361.aClass2_Sub7_Sub2_1.method4535(3);
						local65.method6780(local138, 1);
						local152 = Static361.aClass2_Sub7_Sub2_1.method4535(1);
						if (local152 == 1) {
							Static224.anIntArray269[Static549.anInt9008++] = local57;
						}
					} else if (local93 == 2) {
						Static461.anIntArray562[Static365.anInt6148++] = local57;
						local65.anInt8367 = Static417.anInt8887;
						if (Static361.aClass2_Sub7_Sub2_1.method4535(1) == 1) {
							local138 = Static361.aClass2_Sub7_Sub2_1.method4535(3);
							local65.method6780(local138, 2);
							local152 = Static361.aClass2_Sub7_Sub2_1.method4535(3);
							local65.method6780(local152, 2);
						} else {
							local138 = Static361.aClass2_Sub7_Sub2_1.method4535(3);
							local65.method6780(local138, 0);
						}
						local138 = Static361.aClass2_Sub7_Sub2_1.method4535(1);
						if (local138 == 1) {
							Static224.anIntArray269[Static549.anInt9008++] = local57;
						}
					} else if (local93 == 3) {
						Static19.anIntArray48[Static579.anInt9393++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2565(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method2566(@OriginalArg(1) byte[] arg0) {
		return Static72.method1195(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BIIIII)Z")
	public static boolean method2568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg4; local7++) {
			for (@Pc(22) int local22 = arg1; local22 <= arg3; local22++) {
				if (arg2 == Static471.anIntArrayArray50[local7][local22] && Static29.anIntArrayArray4[local7][local22] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(III)Z")
	public static boolean method2569(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
