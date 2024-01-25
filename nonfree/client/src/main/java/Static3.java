import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!l;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	public static int anInt11 = 0;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "[[B")
	public static final byte[][] aByteArrayArray2 = new byte[50][];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method8() {
		@Pc(14) int local14 = aByteArrayArray1.length;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			if (aByteArrayArray1[local16] != null) {
				@Pc(24) int local24 = -1;
				for (@Pc(26) int local26 = 0; local26 < Static152.anInt2843; local26++) {
					if (Static422.anIntArray591[local26] == Static331.anIntArray494[local16]) {
						local24 = local26;
						break;
					}
				}
				if (local24 == -1) {
					Static422.anIntArray591[Static152.anInt2843] = Static331.anIntArray494[local16];
					local24 = Static152.anInt2843++;
				}
				@Pc(69) Class7_Sub14 local69 = new Class7_Sub14(aByteArrayArray1[local16]);
				@Pc(71) int local71 = 0;
				while (local69.anInt4989 < aByteArrayArray1[local16].length && local71 < 511 && Static56.anInt943 < 1023) {
					@Pc(88) int local88 = local71++ << 6 | local24;
					@Pc(92) int local92 = local69.method3943();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(119) int local119 = local102 + (Static331.anIntArray494[local16] >> 8) * 64 - Static359.anInt5713;
					@Pc(132) int local132 = local106 + (Static331.anIntArray494[local16] & 0xFF) * 64 - Static314.anInt5181;
					@Pc(139) Class249 local139 = Static442.aClass98_1.method2241(local69.method3943());
					if (Static171.aClass26_Sub2_Sub4_Sub1Array1[local88] == null && (local139.aByte87 & 0x1) > 0 && Static179.anInt7446 == local96 && local119 >= 0 && Static333.anInt3375 > local139.anInt6507 + local119 && local132 >= 0 && Static102.anInt2086 > local139.anInt6507 + local132) {
						Static171.aClass26_Sub2_Sub4_Sub1Array1[local88] = new Class26_Sub2_Sub4_Sub1();
						Static171.aClass26_Sub2_Sub4_Sub1Array1[local88].anInt7080 = local88;
						@Pc(197) Class26_Sub2_Sub4_Sub1 local197 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local88];
						Static228.anIntArray347[Static56.anInt943++] = local88;
						local197.anInt7098 = Static274.anInt4617;
						local197.method4827(local139);
						local197.method5519(local197.aClass249_1.anInt6507);
						local197.anInt7044 = local197.aClass249_1.anInt6543 << 3;
						if (local197.anInt7044 == 0) {
							local197.method5505(0);
						} else {
							local197.method5505(local197.aClass249_1.aByte83 + 4 << 11 & 0x3CEF);
						}
						local197.method4824(true, local132, local119, local197.method5512(), local96);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method9(@OriginalArg(0) String arg0) {
		if (!Static402.aBoolean412) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static36.anInt647;
		@Pc(14) int[] local14 = Static362.anIntArray533;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class26_Sub2_Sub4_Sub2 local24 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local14[local16]];
			if (local24 != null && Static104.aClass26_Sub2_Sub4_Sub2_2 != local24 && local24.aString69 != null && local24.aString69.equalsIgnoreCase(arg0)) {
				Static81.method1414(Static357.aClass2_93);
				Static255.aClass7_Sub14_Sub1_2.method3991(0);
				Static255.aClass7_Sub14_Sub1_2.method3993(Static68.anInt1325);
				Static255.aClass7_Sub14_Sub1_2.method3953(Static228.anInt3966);
				Static255.aClass7_Sub14_Sub1_2.method3955(Static175.anInt3126);
				Static255.aClass7_Sub14_Sub1_2.method3958(local14[local16]);
				Static253.method3388(0, true, local24.anIntArray604[0], 0, local24.method5512(), -2, local24.anIntArray603[0], local24.method5512());
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static90.method1616(Static109.aClass55_51.method1205(Static5.anInt20) + arg0);
		}
		if (Static402.aBoolean412) {
			Static23.method249();
		}
	}
}
