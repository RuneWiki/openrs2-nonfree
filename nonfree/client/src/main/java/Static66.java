import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "J")
	public static long aLong52;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
	public static int anInt1480 = -1;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
	public static int anInt1481 = -2;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger4 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
	public static int anInt1485 = 0;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
	public static int anInt1486 = -1;

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "Lclient!ia;")
	public static Class51 aClass51_481 = Static64.method1101("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "[I")
	public static int[] anIntArray99 = new int[50];

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
	public static void method1130() {
		@Pc(12) int local12 = Static163.aByteArrayArray10.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			if (Static163.aByteArrayArray10[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static164.anInt3633; local24++) {
					if (Static50.anIntArray69[local24] == Static164.anIntArray240[local14]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static50.anIntArray69[Static164.anInt3633] = Static164.anIntArray240[local14];
					local22 = Static164.anInt3633++;
				}
				@Pc(63) Class1_Sub16 local63 = new Class1_Sub16(Static163.aByteArrayArray10[local14]);
				@Pc(65) int local65 = 0;
				while (Static163.aByteArrayArray10[local14].length > local63.anInt4860 && local65 < 511) {
					@Pc(79) int local79 = local65++ << 6 | local22;
					@Pc(83) int local83 = local63.method3805();
					@Pc(87) int local87 = local83 >> 14;
					@Pc(93) int local93 = local83 >> 7 & 0x3F;
					@Pc(97) int local97 = local83 & 0x3F;
					@Pc(111) int local111 = (Static164.anIntArray240[local14] >> 8) * 64 + local93 - Static198.anInt4217;
					@Pc(123) int local123 = (Static164.anIntArray240[local14] & 0xFF) * 64 + local97 - Static118.anInt2541;
					@Pc(129) Class27 local129 = Static168.method2871(local63.method3805());
					if (Static168.aClass5_Sub1_Sub2Array1[local79] == null && (local129.aByte1 & 0x1) > 0 && Static158.anInt3438 == local87 && local111 >= 0 && local129.anInt822 + local111 < 104 && local123 >= 0 && local123 + local129.anInt822 < 104) {
						Static168.aClass5_Sub1_Sub2Array1[local79] = new Class5_Sub1_Sub2();
						@Pc(173) Class5_Sub1_Sub2 local173 = Static168.aClass5_Sub1_Sub2Array1[local79];
						Static202.anIntArray326[Static58.anInt1372++] = local79;
						local173.aClass27_1 = local129;
						local173.anInt3580 = local173.aClass27_1.anInt819;
						local173.anInt3601 = local173.aClass27_1.anInt827;
						local173.anInt3629 = local173.aClass27_1.anInt821;
						local173.anInt3604 = local173.aClass27_1.anInt811;
						local173.anInt3623 = local173.aClass27_1.anInt807;
						local173.anInt3584 = local173.aClass27_1.anInt822;
						if (local173.anInt3601 == 0) {
							local173.anInt3575 = 0;
						}
						local173.anInt3627 = Static109.anInt2430;
						local173.anInt3618 = local173.aClass27_1.anInt796;
						local173.anInt3625 = local173.aClass27_1.anInt801;
						local173.anInt3600 = local173.aClass27_1.anInt815;
						local173.method2797(local123, true, local111);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)Lclient!tg;")
	public static Class64 method1131() {
		try {
			return (Class64) Class.forName("Class64_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIB)V")
	public static void method1132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = Static28.method525(Static122.anInt2710, arg3, Static225.anInt4729);
		@Pc(17) int local17 = Static28.method525(Static122.anInt2710, arg2, Static225.anInt4729);
		@Pc(23) int local23 = Static28.method525(Static149.anInt3252, arg1, Static160.anInt3454);
		@Pc(29) int local29 = Static28.method525(Static149.anInt3252, arg0, Static160.anInt3454);
		for (@Pc(31) int local31 = local7; local31 <= local17; local31++) {
			Static71.method1261(Static113.anIntArrayArray10[local31], local23, arg4, local29);
		}
	}
}
