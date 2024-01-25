import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "Lclient!la;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
	public static int anInt619;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
	public static int anInt620;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_7 = new Class81(97, 3);

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	public static void method549() {
		Static89.aClass356_5.method7802();
		Static412.aClass117_8.method2555();
		Static132.aClass117_2.method2555();
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
	public static void method551() {
		if (Static79.aFloat37 < 1024.0F) {
			Static79.aFloat37 = 1024.0F;
		}
		while (Static143.aFloat61 >= 16384.0F) {
			Static143.aFloat61 -= 16384.0F;
		}
		if (Static79.aFloat37 > 3072.0F) {
			Static79.aFloat37 = 3072.0F;
		}
		while (Static143.aFloat61 < 0.0F) {
			Static143.aFloat61 += 16384.0F;
		}
		@Pc(43) int local43 = Static82.anInt9165 >> 9;
		@Pc(47) int local47 = Static536.anInt8844 >> 9;
		@Pc(53) int local53 = Static122.method2103(Static240.anInt4595, Static82.anInt9165, Static536.anInt8844);
		@Pc(55) int local55 = 0;
		@Pc(81) int local81;
		if (local43 > 3 && local47 > 3 && Static500.anInt6888 - 4 > local43 && local47 < Static573.anInt9325 - 4) {
			for (local81 = local43 - 4; local81 <= local43 + 4; local81++) {
				for (@Pc(87) int local87 = local47 - 4; local87 <= local47 + 4; local87++) {
					@Pc(91) int local91 = Static240.anInt4595;
					if (local91 < 3 && Static70.method1506(local87, local81)) {
						local91++;
					}
					@Pc(106) int local106 = 0;
					if (Static81.aClass231_Sub1_1.aByteArrayArrayArray18 != null && Static81.aClass231_Sub1_1.aByteArrayArrayArray18[local91] != null) {
						local106 = (Static81.aClass231_Sub1_1.aByteArrayArrayArray18[local91][local81][local87] & 0xFF) * 8;
					}
					if (Static20.aClass17Array1 != null && Static20.aClass17Array1[local91] != null) {
						@Pc(146) int local146 = local106 + local53 - Static20.aClass17Array1[local91].method6642(local81, local87);
						if (local146 > local55) {
							local55 = local146;
						}
					}
				}
			}
		}
		local81 = (local55 >> 2) * 1536;
		if (local81 > 786432) {
			local81 = 786432;
		}
		if (local81 < 262144) {
			local81 = 262144;
		}
		if (local81 > Static507.anInt8454) {
			Static507.anInt8454 += (local81 - Static507.anInt8454) / 24;
		} else if (local81 < Static507.anInt8454) {
			Static507.anInt8454 += (local81 - Static507.anInt8454) / 80;
			return;
		}
	}
}
