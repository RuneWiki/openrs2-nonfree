import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!al", name = "w", descriptor = "[S")
	public static short[] aShortArray2;

	@OriginalMember(owner = "client!al", name = "t", descriptor = "Lclient!of;")
	public static final Class174 aClass174_8 = new Class174("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
	public static void method194() {
		Static134.method2072();
		Static452.aClass139_4 = null;
		Static150.aClass139_3 = null;
		Static61.aClass139_1 = null;
		Static76.aClass57ArrayArray1 = null;
		Static132.aClass167_4 = null;
	}

	@OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V")
	public static void method195() {
		@Pc(9) int local9 = (int) ((double) Static373.anInt6324 * 34.46D);
		local9 <<= 0x0;
		if (Static413.aClass167_11.method6028()) {
			local9 += 128;
		}
		Static413.aClass167_11.h(50, local9);
	}

	@OriginalMember(owner = "client!al", name = "g", descriptor = "(I)V")
	public static void method196() {
		@Pc(8) int local8 = Static298.aByteArrayArray20.length;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			if (Static298.aByteArrayArray20[local18] != null) {
				@Pc(26) int local26 = -1;
				for (@Pc(28) int local28 = 0; local28 < Static325.anInt5446; local28++) {
					if (Static127.anIntArray115[local18] == Static270.anIntArray296[local28]) {
						local26 = local28;
						break;
					}
				}
				if (local26 == -1) {
					Static270.anIntArray296[Static325.anInt5446] = Static127.anIntArray115[local18];
					local26 = Static325.anInt5446++;
				}
				@Pc(68) Class3_Sub25 local68 = new Class3_Sub25(Static298.aByteArrayArray20[local18]);
				@Pc(70) int local70 = 0;
				while (local68.anInt4974 < Static298.aByteArrayArray20[local18].length && local70 < 511 && Static379.anInt6398 < 1023) {
					@Pc(89) int local89 = local70++ << 6 | local26;
					@Pc(93) int local93 = local68.method4083();
					@Pc(97) int local97 = local93 >> 14;
					@Pc(103) int local103 = local93 >> 7 & 0x3F;
					@Pc(107) int local107 = local93 & 0x3F;
					@Pc(120) int local120 = (Static127.anIntArray115[local18] >> 8) * 64 + local103 - Static59.anInt1127;
					@Pc(133) int local133 = (Static127.anIntArray115[local18] & 0xFF) * 64 + local107 - Static49.anInt873;
					@Pc(140) Class158 local140 = Static118.aClass19_1.method401(local68.method4083());
					@Pc(147) Class3_Sub40 local147 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local89);
					if (local147 == null && (local140.aByte52 & 0x1) > 0 && local97 == Static436.anInt7298 && local120 >= 0 && local120 + local140.anInt4454 < Static373.anInt6324 && local133 >= 0 && Static291.anInt5062 > local133 + local140.anInt4454) {
						@Pc(185) Class1_Sub2_Sub6_Sub1 local185 = new Class1_Sub2_Sub6_Sub1();
						local185.anInt7621 = local89;
						@Pc(193) Class3_Sub40 local193 = new Class3_Sub40(local185);
						Static63.aClass140_37.method3494((long) local89, local193);
						Static407.aClass3_Sub40Array1[Static76.anInt1390++] = local193;
						Static198.anIntArray225[Static379.anInt6398++] = local89;
						local185.anInt7602 = Static172.anInt3107;
						local185.method5632(local140);
						local185.method6203(local185.aClass158_1.anInt4454);
						local185.anInt7618 = local185.aClass158_1.anInt4442 << 3;
						local185.method6200((local185.aClass158_1.aByte56 + 4 & 0xAD800007) << 11, true);
						local185.method5633(local185.method6204(), local120, local133, local97, true);
					}
				}
			}
		}
	}
}
