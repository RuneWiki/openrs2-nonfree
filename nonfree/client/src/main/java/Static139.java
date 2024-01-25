import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
	public static int anInt2796 = 13156520;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(III)Z")
	public static boolean method2614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static197.method3751(arg0, arg1) || Static498.method7618(arg1, arg0);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)I")
	public static int method2615() {
		if (Static360.aClass91_10 == null) {
			if (!Static238.aBoolean354 && Static197.anInt4015 > 0) {
				if (Static451.aBoolean585 && Static25.aClass241_1.method6303(81) && Static197.anInt4015 > 2) {
					return ((Class1_Sub25) Static105.aClass295_10.aClass1_260.aClass1_284.aClass1_284).anInt4364;
				}
				return ((Class1_Sub25) Static105.aClass295_10.aClass1_260.aClass1_284).anInt4364;
			}
			@Pc(48) int local48 = Static10.aClass99_1.method6618();
			@Pc(52) int local52 = Static10.aClass99_1.method6619();
			@Pc(54) int local54 = Static513.anInt9093;
			@Pc(56) int local56 = Static276.anInt8648;
			@Pc(58) int local58 = Static324.anInt6120;
			if (local48 > local54 && local48 < local54 + local58) {
				@Pc(73) int local73 = -1;
				@Pc(93) int local93;
				for (@Pc(75) int local75 = 0; local75 < Static197.anInt4015; local75++) {
					if (Static242.aBoolean356) {
						local93 = local56 + (Static197.anInt4015 - local75 - 1) * 16 + 33;
						if (local52 > local93 - 13 && local93 + 3 >= local52) {
							local73 = local75;
						}
					} else {
						local93 = local56 + (Static197.anInt4015 - local75 - 1) * 16 + 31;
						if (local52 > local93 - 13 && local52 <= local93 + 3) {
							local73 = local75;
						}
					}
				}
				if (local73 != -1) {
					local93 = 0;
					@Pc(160) Class314 local160 = new Class314(Static105.aClass295_10);
					for (@Pc(165) Class1_Sub25 local165 = (Class1_Sub25) local160.method8057(); local165 != null; local165 = (Class1_Sub25) local160.method8056()) {
						if (local73 == local93++) {
							return local165.anInt4364;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)V")
	public static void method2616() {
		Static216.method3997(Static47.aClass252_84);
		Static259.aClass1_Sub17_Sub2_1.method4451(0);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)Z")
	public static boolean method2617(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
