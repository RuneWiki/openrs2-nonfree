import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
	public static int anInt2207;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
	public static int anInt2209;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method1895(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static52.method867(Static80.aClass103_66);
		Static18.aClass1_Sub28_Sub1_1.method5398(Static349.method4734(arg0) + 1);
		Static18.aClass1_Sub28_Sub1_1.method5398(arg1);
		Static18.aClass1_Sub28_Sub1_1.method5364(arg0);
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V")
	public static void method1898() {
		@Pc(15) int local15 = Static151.aByteArrayArray9.length;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (Static151.aByteArrayArray9[local17] != null) {
				@Pc(25) int local25 = -1;
				for (@Pc(27) int local27 = 0; local27 < Static276.anInt4897; local27++) {
					if (Static248.anIntArray298[local17] == Static221.anIntArray238[local27]) {
						local25 = local27;
						break;
					}
				}
				if (local25 == -1) {
					Static221.anIntArray238[Static276.anInt4897] = Static248.anIntArray298[local17];
					local25 = Static276.anInt4897++;
				}
				@Pc(67) Class1_Sub28 local67 = new Class1_Sub28(Static151.aByteArrayArray9[local17]);
				@Pc(69) int local69 = 0;
				while (local67.anInt6812 < Static151.aByteArrayArray9[local17].length && local69 < 511 && Static328.anInt5608 < 1023) {
					@Pc(90) int local90 = local25 | local69++ << 6;
					@Pc(94) int local94 = local67.method5335();
					@Pc(98) int local98 = local94 >> 14;
					@Pc(104) int local104 = local94 >> 7 & 0x3F;
					@Pc(108) int local108 = local94 & 0x3F;
					@Pc(121) int local121 = local104 + (Static248.anIntArray298[local17] >> 8) * 64 - Static199.anInt3480;
					@Pc(135) int local135 = (Static248.anIntArray298[local17] & 0xFF) * 64 + local108 - Static164.anInt2731;
					@Pc(142) Class54 local142 = Static161.aClass231_2.method5022(local67.method5335());
					if (Static87.aClass25_Sub5_Sub1_Sub1Array6[local90] == null && (local142.aByte11 & 0x1) > 0 && local98 == Static456.anInt7534 && local121 >= 0 && local121 + local142.anInt1348 < Static296.anInt5187 && local135 >= 0 && Static206.anInt3607 > local142.anInt1348 + local135) {
						Static87.aClass25_Sub5_Sub1_Sub1Array6[local90] = new Class25_Sub5_Sub1_Sub1();
						Static87.aClass25_Sub5_Sub1_Sub1Array6[local90].anInt4284 = local90;
						@Pc(193) Class25_Sub5_Sub1_Sub1 local193 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local90];
						Static31.anIntArray30[Static328.anInt5608++] = local90;
						local193.anInt4298 = Static236.anInt4213;
						local193.method2590(local142);
						local193.method3431(local193.aClass54_1.anInt1348);
						local193.anInt4274 = local193.aClass54_1.anInt1325 << 3;
						if (local193.anInt4274 == 0) {
							local193.method3435(0);
						} else {
							local193.method3435(local193.aClass54_1.aByte9 + 4 << 11 & 0x388F);
						}
						local193.method2591(local193.method3427(), true, local135, local98, local121);
					}
				}
			}
		}
	}
}
