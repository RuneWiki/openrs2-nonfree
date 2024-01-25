import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "Lclient!qr;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_3;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	public static int anInt1460 = 0;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[5];

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
	public static int anInt1464 = 0;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
	public static void method1296() {
		@Pc(8) int local8 = Static72.aByteArrayArray3.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			if (Static72.aByteArrayArray3[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static427.anInt2926; local25++) {
					if (Static266.anIntArray627[local15] == Static70.anIntArray113[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static70.anIntArray113[Static427.anInt2926] = Static266.anIntArray627[local15];
					local23 = Static427.anInt2926++;
				}
				@Pc(68) Class1_Sub5 local68 = new Class1_Sub5(Static72.aByteArrayArray3[local15]);
				@Pc(70) int local70 = 0;
				while (Static72.aByteArrayArray3[local15].length > local68.anInt6475 && local70 < 511 && Static5.anInt163 < 1023) {
					@Pc(89) int local89 = local23 | local70++ << 6;
					@Pc(93) int local93 = local68.method5362();
					@Pc(97) int local97 = local93 >> 14;
					@Pc(103) int local103 = local93 >> 7 & 0x3F;
					@Pc(107) int local107 = local93 & 0x3F;
					@Pc(120) int local120 = (Static266.anIntArray627[local15] >> 8) * 64 + local103 - Static165.anInt3049;
					@Pc(133) int local133 = (Static266.anIntArray627[local15] & 0xFF) * 64 + local107 - Static345.anInt5799;
					@Pc(140) Class53 local140 = Static238.aClass116_2.method2822(local68.method5362());
					if (Static98.aClass31_Sub2_Sub1_Sub2Array1[local89] == null && (local140.aByte28 & 0x1) > 0 && local97 == Static170.anInt3116 && local120 >= 0 && Static195.anInt3537 > local120 + local140.anInt1728 && local133 >= 0 && Static118.anInt2419 > local133 + local140.anInt1728) {
						Static98.aClass31_Sub2_Sub1_Sub2Array1[local89] = new Class31_Sub2_Sub1_Sub2();
						Static98.aClass31_Sub2_Sub1_Sub2Array1[local89].anInt7301 = local89;
						@Pc(191) Class31_Sub2_Sub1_Sub2 local191 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local89];
						Static331.anIntArray648[Static5.anInt163++] = local89;
						local191.anInt7302 = Static378.anInt4244;
						local191.method5997(local140);
						local191.method5979(local191.aClass53_1.anInt1728);
						local191.anInt7345 = local191.aClass53_1.anInt1726 << 3;
						if (local191.anInt7345 == 0) {
							local191.method5988(0);
						} else {
							local191.method5988((local191.aClass53_1.aByte34 + 4 & 0x51800007) << 11);
						}
						local191.method5996(true, local191.method5989(), local97, local120, local133);
					}
				}
			}
		}
	}
}
