import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!mga", name = "A", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_57 = new Class70(74, 3);

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "(B)V")
	public static void method4465() {
		Static577.aClass222_64.method4428();
		Static208.aClass222_25.method4428();
		Static143.aClass222_15.method4428();
		Static363.aClass222_37.method4428();
	}

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "(Z)V")
	public static void method4471() {
		@Pc(8) int local8 = Static481.aByteArrayArray30.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			if (Static481.aByteArrayArray30[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static583.anInt9562; local25++) {
					if (Static506.anIntArray650[local25] == Static566.anIntArray710[local15]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static506.anIntArray650[Static583.anInt9562] = Static566.anIntArray710[local15];
					local23 = Static583.anInt9562++;
				}
				@Pc(68) Class1_Sub35 local68 = new Class1_Sub35(Static481.aByteArrayArray30[local15]);
				@Pc(70) int local70 = 0;
				while (Static481.aByteArrayArray30[local15].length > local68.anInt7214 && local70 < 511 && Static39.anInt609 < 1023) {
					@Pc(89) int local89 = local70++ << 6 | local23;
					@Pc(93) int local93 = local68.method5771();
					@Pc(97) int local97 = local93 >> 14;
					@Pc(103) int local103 = local93 >> 7 & 0x3F;
					@Pc(107) int local107 = local93 & 0x3F;
					@Pc(121) int local121 = (Static566.anIntArray710[local15] >> 8) * 64 + local103 - Static541.anInt9058;
					@Pc(134) int local134 = (Static566.anIntArray710[local15] & 0xFF) * 64 + local107 - Static116.anInt2289;
					@Pc(141) Class20 local141 = Static322.aClass326_2.method7234(local68.method5771());
					@Pc(148) Class1_Sub42 local148 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local89);
					if (local148 == null && (local141.aByte17 & 0x1) > 0 && local97 == Static42.anInt691 && local121 >= 0 && Static71.anInt1410 > local121 + local141.anInt350 && local134 >= 0 && Static471.anInt8012 > local141.anInt350 + local134) {
						@Pc(188) Class8_Sub3_Sub3_Sub1_Sub2 local188 = new Class8_Sub3_Sub3_Sub1_Sub2();
						local188.anInt6821 = local89;
						@Pc(196) Class1_Sub42 local196 = new Class1_Sub42(local188);
						Static84.aClass187_40.method3795(local196, (long) local89);
						Static466.aClass1_Sub42Array1[Static35.anInt540++] = local196;
						Static17.anIntArray24[Static39.anInt609++] = local89;
						local188.anInt6780 = Static301.anInt5197;
						local188.method5450(local141);
						local188.method5429(local188.aClass20_1.anInt350);
						local188.anInt6804 = local188.aClass20_1.anInt330 << 3;
						local188.method5435(local188.aClass20_1.aByte15 + 4 << 11 & 0x3DDD, true);
						local188.method5448(local121, local188.method5434(), true, local134, local97);
					}
				}
			}
		}
	}
}
