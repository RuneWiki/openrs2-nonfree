import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
	public static int anInt5630;

	@OriginalMember(owner = "client!sg", name = "G", descriptor = "Lclient!rk;")
	public static Class180 aClass180_78;

	@OriginalMember(owner = "client!sg", name = "T", descriptor = "Lclient!rk;")
	public static Class180 aClass180_79;

	@OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
	public static int anInt5632 = -1;

	@OriginalMember(owner = "client!sg", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString355 = null;

	@OriginalMember(owner = "client!sg", name = "M", descriptor = "[I")
	public static final int[] anIntArray713 = new int[128];

	@OriginalMember(owner = "client!sg", name = "O", descriptor = "[B")
	public static final byte[] aByteArray86 = new byte[520];

	@OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
	public static int anInt5635 = -2;

	@OriginalMember(owner = "client!sg", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString356 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)I")
	public static int method4739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static92.aByteArrayArrayArray3[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static92.aByteArrayArrayArray3[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "(B)V")
	public static void method4741() {
		@Pc(13) int local13 = Static5.aByteArrayArray3.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (Static5.aByteArrayArray3[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static282.anInt5543; local25++) {
					if (Static147.anIntArray420[local25] == Static94.anIntArray311[local15]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static147.anIntArray420[Static282.anInt5543] = Static94.anIntArray311[local15];
					local23 = Static282.anInt5543++;
				}
				@Pc(65) Class7_Sub3 local65 = new Class7_Sub3(Static5.aByteArrayArray3[local15]);
				@Pc(67) int local67 = 0;
				while (Static5.aByteArrayArray3[local15].length > local65.anInt3005 && local67 < 511 && Static11.anInt3203 < 1023) {
					@Pc(88) int local88 = local23 | local67++ << 6;
					@Pc(92) int local92 = local65.method2764();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(119) int local119 = (Static94.anIntArray311[local15] >> 8) * 64 + local102 - Static350.anInt6609;
					@Pc(131) int local131 = local106 + (Static94.anIntArray311[local15] & 0xFF) * 64 - Static237.anInt4696;
					@Pc(137) Class174 local137 = Static132.method2664(local65.method2764());
					if (Static69.aClass22_Sub2_Sub1_Sub2Array1[local88] == null && (local137.aByte54 & 0x1) > 0 && local96 == Static75.anInt1865 && local119 >= 0 && Static15.anInt287 > local137.anInt5191 + local119 && local131 >= 0 && local131 + local137.anInt5191 < Static325.anInt6173) {
						Static69.aClass22_Sub2_Sub1_Sub2Array1[local88] = new Class22_Sub2_Sub1_Sub2();
						Static69.aClass22_Sub2_Sub1_Sub2Array1[local88].anInt5115 = local88;
						@Pc(190) Class22_Sub2_Sub1_Sub2 local190 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local88];
						Static257.anIntArray649[Static11.anInt3203++] = local88;
						local190.anInt5096 = Static212.anInt4234;
						local190.method4426(local137);
						local190.method4420(local190.aClass174_1.anInt5191);
						local190.anInt5111 = local190.aClass174_1.anInt5178 << 3;
						if (local190.anInt5111 == 0) {
							local190.method4411(0);
						} else {
							local190.method4411(Static122.anIntArray368[local190.aClass174_1.aByte56 - 1]);
						}
						local190.method4408(true, local190.method4421(), local119, local131, local96);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)V")
	public static void method4742() {
		if (Static213.aClass15_1 != null) {
			Static213.aClass15_1.method4461();
		}
		if (Static272.aClass15_2 != null) {
			Static272.aClass15_2.method4461();
		}
		Static221.method3907(Static108.aBoolean108);
		Static213.aClass15_1 = Static187.method3414(0, Static269.aCanvas4, Static116.aClass21_4, 22050);
		Static213.aClass15_1.method4465(Static193.aClass7_Sub8_Sub2_2);
		Static272.aClass15_2 = Static187.method3414(1, Static269.aCanvas4, Static116.aClass21_4, 2048);
		Static272.aClass15_2.method4465(Static134.aClass7_Sub8_Sub3_2);
	}
}
