import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "Lclient!qq;")
	public static Class269 aClass269_13;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_1 = new Class219(14, 1);

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_2 = new Class219(15, 4);

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_3 = new Class219(16, -2);

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_4 = new Class219(17, 0);

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_5 = new Class219(18, -2);

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_6 = new Class219(19, -2);

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_7 = new Class219(20, 6);

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_8 = new Class219(21, 9);

	@OriginalMember(owner = "client!wc", name = "P", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_9 = new Class219(22, -2);

	@OriginalMember(owner = "client!wc", name = "Q", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_10 = new Class219(23, 4);

	@OriginalMember(owner = "client!wc", name = "R", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_11 = new Class219(24, -1);

	@OriginalMember(owner = "client!wc", name = "S", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_12 = new Class219(25, -2);

	@OriginalMember(owner = "client!wc", name = "T", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_13 = new Class219(26, 0);

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "Lclient!naa;")
	public static final Class219 aClass219_14 = new Class219(27, 0);

	@OriginalMember(owner = "client!wc", name = "W", descriptor = "[I")
	public static final int[] anIntArray822 = new int[13];

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "(I)V")
	public static void method7979() {
		if (Static200.aFloat100 < 1024.0F) {
			Static200.aFloat100 = 1024.0F;
		}
		if (Static200.aFloat100 > 3072.0F) {
			Static200.aFloat100 = 3072.0F;
		}
		while (Static412.aFloat175 >= 16384.0F) {
			Static412.aFloat175 -= 16384.0F;
		}
		while (Static412.aFloat175 < 0.0F) {
			Static412.aFloat175 += 16384.0F;
		}
		@Pc(41) int local41 = Static357.anInt6870 >> 9;
		@Pc(45) int local45 = Static252.anInt5119 >> 9;
		@Pc(51) int local51 = Static482.method7333(Static493.anInt8836, Static252.anInt5119, Static357.anInt6870);
		@Pc(57) int local57 = 0;
		@Pc(83) int local83;
		if (local41 > 3 && local45 > 3 && Static228.anInt4746 - 4 > local41 && Static44.anInt1275 - 4 > local45) {
			for (local83 = local41 - 4; local83 <= local41 + 4; local83++) {
				for (@Pc(89) int local89 = local45 - 4; local89 <= local45 + 4; local89++) {
					@Pc(93) int local93 = Static493.anInt8836;
					if (local93 < 3 && Static539.method7769(local83, local89)) {
						local93++;
					}
					@Pc(108) int local108 = 0;
					if (Static173.aClass202_Sub1_1.aByteArrayArrayArray15 != null && Static173.aClass202_Sub1_1.aByteArrayArrayArray15[local93] != null) {
						local108 = (Static173.aClass202_Sub1_1.aByteArrayArrayArray15[local93][local83][local89] & 0xFF) * 8;
					}
					@Pc(142) int local142 = local108 + local51 - Static47.aClass62Array1[local93].JA(local83, local89);
					if (local57 < local142) {
						local57 = local142;
					}
				}
			}
		}
		local83 = (local57 >> 2) * 1536;
		if (local83 > 786432) {
			local83 = 786432;
		}
		if (local83 < 262144) {
			local83 = 262144;
		}
		if (Static263.anInt5268 < local83) {
			Static263.anInt5268 += (local83 - Static263.anInt5268) / 24;
		} else if (local83 < Static263.anInt5268) {
			Static263.anInt5268 += (local83 - Static263.anInt5268) / 80;
		}
	}
}
