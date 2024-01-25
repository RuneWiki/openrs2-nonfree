import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!jba", name = "w", descriptor = "Lclient!qb;")
	public static Class247 aClass247_1;

	@OriginalMember(owner = "client!jba", name = "A", descriptor = "I")
	public static int anInt4797;

	@OriginalMember(owner = "client!jba", name = "F", descriptor = "Lclient!an;")
	public static Class16 aClass16_59;

	@OriginalMember(owner = "client!jba", name = "G", descriptor = "[Lclient!ha;")
	public static Class84[] aClass84Array5;

	@OriginalMember(owner = "client!jba", name = "B", descriptor = "Lclient!daa;")
	public static final Class12_Sub8 aClass12_Sub8_4 = new Class12_Sub8(new byte[5000]);

	@OriginalMember(owner = "client!jba", name = "J", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_70 = new Class45(97, 7);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method4058(@OriginalArg(1) String arg0) {
		return Static192.method3671(ub.class, arg0);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method4061(@OriginalArg(0) Class42 arg0) {
		arg0.N(0, 0, Static169.anInt3893, 350);
		arg0.f(0, 0, Static169.anInt3893, 350, Static61.anInt1462 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static370.anInt6854;
		@Pc(47) int local47;
		if (Static118.anInt2734 > 0) {
			@Pc(37) int local37 = 342 - Static370.anInt6854;
			local47 = local37 * local27 / (Static118.anInt2734 + local27 - 1);
			@Pc(49) int local49 = 4;
			if (Static118.anInt2734 > 1) {
				local49 = (Static118.anInt2734 - Static380.anInt7651 - 1) * (-local47 + local37) / (Static118.anInt2734 - 1) + 4;
			}
			arg0.f(Static169.anInt3893 - 16, local49, 12, local47, Static61.anInt1462 << 24 | 0x332277, 2);
			for (@Pc(88) int local88 = Static380.anInt7651; local88 < Static380.anInt7651 + local27 && Static118.anInt2734 > local88; local88++) {
				@Pc(97) String[] local97 = Static434.method6610(Static255.aStringArray29[local88], '\b');
				@Pc(104) int local104 = (Static169.anInt3893 - 24) / local97.length;
				for (@Pc(106) int local106 = 0; local106 < local97.length; local106++) {
					@Pc(114) int local114 = local106 * local104 + 8;
					arg0.N(local114, 0, local104 + local114 - 8, 350);
					Static56.aClass80_2.method7769(-16777216, local114, local97[local106], 350 - Static93.anInt2164 - Static267.aClass244_5.anInt7388 - Static370.anInt6854 * (-Static380.anInt7651 + local88) - 2, -1);
				}
			}
		}
		arg0.N(0, 0, Static169.anInt3893, 350);
		arg0.method5827(-1, Static169.anInt3893, 350 - Static93.anInt2164, 0);
		Static12.aClass80_1.method7769(-16777216, 10, "--> " + Static21.aString93, 350 - Static445.aClass244_7.anInt7388 - 1, -1);
		if (!Static38.aBoolean44) {
			return;
		}
		local47 = -1;
		if (Static409.anInt7683 % 30 > 15) {
			local47 = 16777215;
		}
		arg0.method5840(350 - Static445.aClass244_7.anInt7388 - 11, 12, local47, Static445.aClass244_7.method6147("--> " + Static21.aString93.substring(0, Static465.anInt8475)) + 10);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BI)V")
	public static void method4062(@OriginalArg(1) int arg0) {
		@Pc(13) Class12_Sub4_Sub1 local13 = Static389.method6156(14, arg0);
		local13.method823();
	}
}
