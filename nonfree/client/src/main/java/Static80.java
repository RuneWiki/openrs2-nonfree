import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "[I")
	public static int[] anIntArray245;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!pc;")
	public static Class51 aClass51_4;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public static int anInt2059;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Lclient!kc;")
	private static Class36 aClass36_968 = Static14.method2017("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!kc;")
	public static Class36 aClass36_969 = aClass36_968;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "Lclient!kc;")
	public static Class36 aClass36_970 = Static14.method2017("redstone3");

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
	public static int[] anIntArray246 = new int[50];

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_971 = Static14.method2017("Menge eingeben:");

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	public static int anInt2060 = -1;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method1490() {
		anIntArray246 = null;
		aClass36_968 = null;
		anIntArray245 = null;
		aClass36_969 = null;
		aClass36_971 = null;
		aClass51_4 = null;
		aClass36_970 = null;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)I")
	public static int method1491() {
		@Pc(7) int local7 = 3;
		if (Static96.anInt2559 < 310) {
			@Pc(15) int local15 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 >> 7;
			@Pc(19) int local19 = Static59.anInt1588 >> 7;
			@Pc(24) int local24 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 >> 7;
			@Pc(32) int local32;
			if (local19 < local24) {
				local32 = local24 - local19;
			} else {
				local32 = local19 - local24;
			}
			@Pc(42) int local42 = Static105.anInt2735 >> 7;
			if ((Static16.aByteArrayArrayArray3[Static92.anInt2412][local42][local19] & 0x4) != 0) {
				local7 = Static92.anInt2412;
			}
			@Pc(66) int local66;
			if (local42 < local15) {
				local66 = local15 - local42;
			} else {
				local66 = local42 - local15;
			}
			@Pc(86) int local86;
			@Pc(88) int local88;
			if (local32 < local66) {
				local86 = local32 * 65536 / local66;
				local88 = 32768;
				while (local15 != local42) {
					local88 += local86;
					if (local15 > local42) {
						local42++;
					} else if (local15 < local42) {
						local42--;
					}
					if ((Static16.aByteArrayArrayArray3[Static92.anInt2412][local42][local19] & 0x4) != 0) {
						local7 = Static92.anInt2412;
					}
					if (local88 >= 65536) {
						local88 -= 65536;
						if (local19 < local24) {
							local19++;
						} else if (local24 < local19) {
							local19--;
						}
						if ((Static16.aByteArrayArrayArray3[Static92.anInt2412][local42][local19] & 0x4) != 0) {
							local7 = Static92.anInt2412;
						}
					}
				}
			} else {
				local86 = local66 * 65536 / local32;
				local88 = 32768;
				while (local19 != local24) {
					local88 += local86;
					if (local19 < local24) {
						local19++;
					} else if (local24 < local19) {
						local19--;
					}
					if ((Static16.aByteArrayArrayArray3[Static92.anInt2412][local42][local19] & 0x4) != 0) {
						local7 = Static92.anInt2412;
					}
					if (local88 >= 65536) {
						if (local15 > local42) {
							local42++;
						} else if (local42 > local15) {
							local42--;
						}
						if ((Static16.aByteArrayArrayArray3[Static92.anInt2412][local42][local19] & 0x4) != 0) {
							local7 = Static92.anInt2412;
						}
						local88 -= 65536;
					}
				}
			}
		}
		if ((Static16.aByteArrayArrayArray3[Static92.anInt2412][Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 >> -1980124601][Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 >> 7] & 0x4) != 0) {
			local7 = Static92.anInt2412;
		}
		return local7;
	}
}
