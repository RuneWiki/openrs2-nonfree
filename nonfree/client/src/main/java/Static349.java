import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "[I")
	public static final int[] anIntArray413 = new int[8];

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "Lclient!dv;")
	public static final Class63 aClass63_7 = new Class63();

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public static void method4560() {
		@Pc(8) int local8 = Static106.aByteArrayArray152.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static106.aByteArrayArray152[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static92.anInt4214; local20++) {
					if (Static334.anIntArray397[local10] == Static386.anIntArray535[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static386.anIntArray535[Static92.anInt4214] = Static334.anIntArray397[local10];
					local18 = Static92.anInt4214++;
				}
				@Pc(67) Class1_Sub19 local67 = new Class1_Sub19(Static106.aByteArrayArray152[local10]);
				@Pc(69) int local69 = 0;
				while (Static106.aByteArrayArray152[local10].length > local67.anInt3698 && local69 < 511 && Static137.anInt2142 < 1023) {
					@Pc(88) int local88 = local69++ << 6 | local18;
					@Pc(92) int local92 = local67.method2896();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(119) int local119 = (Static334.anIntArray397[local10] >> 8) * 64 + local102 - Static315.anInt5207;
					@Pc(133) int local133 = (Static334.anIntArray397[local10] & 0xFF) * 64 + local106 - Static47.anInt676;
					@Pc(140) Class272 local140 = Static428.aClass196_1.method4163(local67.method2896());
					@Pc(147) Class1_Sub44 local147 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local88);
					if (local147 == null && (local140.aByte97 & 0x1) > 0 && local96 == Static130.anInt2040 && local119 >= 0 && local119 + local140.anInt7346 < Static147.anInt2300 && local133 >= 0 && Static293.anInt4886 > local140.anInt7346 + local133) {
						@Pc(183) Class11_Sub1_Sub3_Sub1 local183 = new Class11_Sub1_Sub3_Sub1();
						local183.anInt3279 = local88;
						@Pc(191) Class1_Sub44 local191 = new Class1_Sub44(local183);
						Static46.aClass208_33.method4413((long) local88, local191);
						Static47.aClass1_Sub44Array1[Static406.anInt6516++] = local191;
						Static135.anIntArray183[Static137.anInt2142++] = local88;
						local183.lb = Static98.anInt1304;
						local183.method1303(local140);
						local183.method2637(local183.aClass272_1.anInt7346);
						local183.anInt3297 = local183.aClass272_1.anInt7317 << 3;
						local183.method2642((local183.aClass272_1.aByte100 + 4 & 0xEA600007) << 11, true);
						local183.method1299(local133, true, local96, local183.method2635(), local119);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	public static void method4563() {
		Static190.anInt3500 = -1;
		Static353.aClass85_17 = null;
	}
}
