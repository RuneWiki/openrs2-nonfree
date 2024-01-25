import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Z")
	public static boolean aBoolean203 = false;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_88 = new Class7("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!se", name = "n", descriptor = "Lclient!nu;")
	public static final Class176 aClass176_4 = new Class176();

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_116 = new Class107(51, 4);

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	public static void method2948() {
		if (Static201.aFloat56 < 1024.0F) {
			Static201.aFloat56 = 1024.0F;
		}
		while (Static142.aFloat89 >= 16384.0F) {
			Static142.aFloat89 -= 16384.0F;
		}
		if (Static201.aFloat56 > 3072.0F) {
			Static201.aFloat56 = 3072.0F;
		}
		while (Static142.aFloat89 < 0.0F) {
			Static142.aFloat89 += 16384.0F;
		}
		@Pc(37) int local37 = Static3.anInt108 >> 7;
		@Pc(41) int local41 = Static299.anInt698 >> 7;
		@Pc(47) int local47 = Static301.method4312(Static357.anInt5881, Static3.anInt108, Static299.anInt698);
		@Pc(49) int local49 = 0;
		@Pc(81) int local81;
		if (local37 > 3 && local41 > 3 && Static195.anInt3537 - 4 > local37 && Static118.anInt2419 - 4 > local41) {
			for (local81 = local37 - 4; local81 <= local37 + 4; local81++) {
				for (@Pc(86) int local86 = local41 - 4; local86 <= local41 + 4; local86++) {
					@Pc(89) int local89 = Static357.anInt5881;
					if (local89 < 3 && Static87.method1622(local81, local86)) {
						local89++;
					}
					@Pc(100) int local100 = 0;
					if (Static74.aClass14_Sub1_3.aByteArrayArrayArray14 != null && Static74.aClass14_Sub1_3.aByteArrayArrayArray14[local89] != null) {
						local100 = (Static74.aClass14_Sub1_3.aByteArrayArrayArray14[local89][local81][local86] & 0xFF) * 8;
					}
					@Pc(133) int local133 = local100 + local47 - Static105.aClass149Array1[local89].l(local81, local86);
					if (local133 > local49) {
						local49 = local133;
					}
				}
			}
		}
		local81 = (local49 >> 0) * 1536;
		if (local81 > 786432) {
			local81 = 786432;
		}
		if (local81 < 262144) {
			local81 = 262144;
		}
		if (local81 > Static247.anInt7104) {
			Static247.anInt7104 += (local81 - Static247.anInt7104) / 24;
		} else if (Static247.anInt7104 > local81) {
			Static247.anInt7104 += (local81 - Static247.anInt7104) / 80;
		}
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V")
	public static void method2949() {
		Static28.aClass96_7.method2338();
		Static146.aClass96_18.method2338();
	}
}
