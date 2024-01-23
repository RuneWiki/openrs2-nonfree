import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Lclient!pk;")
	public static Class132 aClass132_27;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
	public static int anInt1613;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString63 = " ";

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/lang/String;Lclient!aj;)I")
	public static int method1181(@OriginalArg(1) String arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		@Pc(11) int local11 = arg1.anInt2955;
		@Pc(15) byte[] local15 = Static41.method624(arg0);
		arg1.method2328(local15.length);
		arg1.anInt2955 += Static59.aClass145_1.method3536(arg1.aByteArray24, arg1.anInt2955, local15, 0, local15.length);
		return arg1.anInt2955 - local11;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!tk;II)V")
	public static void method1183(@OriginalArg(1) Class159 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static185.anInt3679 < 2 && Static149.anInt3012 == 0 && !Static215.aBoolean357) {
			return;
		}
		@Pc(24) String local24 = Static167.method2647();
		if (arg0 == null) {
			@Pc(40) int local40 = Static229.aClass8_Sub1_Sub5_3.method2018(local24, arg2 + 4, arg1 + 15, Static17.aRandom1, Static123.anInt2480);
			Static216.method3391(local40 + Static229.aClass8_Sub1_Sub5_3.method2014(local24), 15, arg2 + 4, arg1);
			return;
		}
		@Pc(59) Class8_Sub1_Sub5 local59 = arg0.method3887(Static199.aClass43Array4);
		if (local59 == null) {
			local59 = Static229.aClass8_Sub1_Sub5_3;
		}
		local59.method2023(local24, arg2, arg1, arg0.anInt5123, arg0.anInt5121, arg0.anInt5193, arg0.anInt5114, arg0.anInt5112, arg0.anInt5127, Static17.aRandom1, Static123.anInt2480, Static111.anIntArray185);
		Static216.method3391(Static111.anIntArray185[2], Static111.anIntArray185[3], Static111.anIntArray185[0], Static111.anIntArray185[1]);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public static void method1184() {
		if (Static201.aFloat36 < 128.0F) {
			Static201.aFloat36 = 128.0F;
		}
		while (Static82.aFloat20 >= 2048.0F) {
			Static82.aFloat20 -= 2048.0F;
		}
		while (Static82.aFloat20 < 0.0F) {
			Static82.aFloat20 += 2048.0F;
		}
		@Pc(39) int local39 = Static194.anInt3891 >> 7;
		if (Static201.aFloat36 > 383.0F) {
			Static201.aFloat36 = 383.0F;
		}
		@Pc(50) int local50 = Static163.anInt4477 >> 7;
		@Pc(56) int local56 = Static59.method927(Static163.anInt4477, Static194.anInt3891, Static34.anInt770);
		@Pc(58) int local58 = 0;
		@Pc(78) int local78;
		if (local50 > 3 && local39 > 3 && local50 < 100 && local39 < 100) {
			for (local78 = local50 - 4; local78 <= local50 + 4; local78++) {
				for (@Pc(87) int local87 = local39 - 4; local87 <= local39 + 4; local87++) {
					@Pc(98) int local98 = Static34.anInt770;
					if (local98 < 3 && (Static170.aByteArrayArrayArray9[1][local78][local87] & 0x2) == 2) {
						local98++;
					}
					@Pc(139) int local139 = (Static212.aByteArrayArrayArray12[local98][local78][local87] & 0xFF) * 8 + local56 - Static195.anIntArrayArrayArray7[local98][local78][local87];
					if (local139 > local58) {
						local58 = local139;
					}
				}
			}
		}
		local78 = local58 * 192;
		if (local78 > 98048) {
			local78 = 98048;
		}
		if (local78 < 32768) {
			local78 = 32768;
		}
		if (local78 > Static215.anInt4428) {
			Static215.anInt4428 += (local78 - Static215.anInt4428) / 24;
		} else if (Static215.anInt4428 > local78) {
			Static215.anInt4428 += (local78 - Static215.anInt4428) / 80;
		}
	}
}
