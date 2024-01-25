import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!maa", name = "M", descriptor = "Lclient!ac;")
	public static Class5 aClass5_27;

	@OriginalMember(owner = "client!maa", name = "I", descriptor = "Lclient!em;")
	public static final Class82 aClass82_9 = new Class82(4);

	@OriginalMember(owner = "client!maa", name = "J", descriptor = "Lclient!fq;")
	public static final Class104 aClass104_9 = new Class104(12, 0, 1, 0);

	@OriginalMember(owner = "client!maa", name = "K", descriptor = "I")
	public static int anInt5422 = 0;

	@OriginalMember(owner = "client!maa", name = "L", descriptor = "[I")
	public static final int[] anIntArray312 = new int[4];

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)V")
	public static void method4603() {
		@Pc(13) int local13 = Static172.aByteArrayArray9.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (Static172.aByteArrayArray9[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static280.anInt5853; local25++) {
					if (Static475.anIntArray531[local15] == Static602.anIntArray607[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static602.anIntArray607[Static280.anInt5853] = Static475.anIntArray531[local15];
					local23 = Static280.anInt5853++;
				}
				@Pc(69) Class3_Sub15 local69 = new Class3_Sub15(Static172.aByteArrayArray9[local15]);
				@Pc(71) int local71 = 0;
				while (local69.anInt10282 < Static172.aByteArrayArray9[local15].length && local71 < 511 && Static377.anInt7132 < 1023) {
					@Pc(88) int local88 = local71++ << 6 | local23;
					@Pc(92) int local92 = local69.method8414();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(118) int local118 = local102 + (Static475.anIntArray531[local15] >> 8) * 64 - Static446.anInt8090;
					@Pc(131) int local131 = local106 + (Static475.anIntArray531[local15] & 0xFF) * 64 - Static124.anInt3150;
					@Pc(140) Class22 local140 = Static604.aClass139_2.method4345(local69.method8414());
					@Pc(147) Class3_Sub49 local147 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local88);
					if (local147 == null && (local140.aByte14 & 0x1) > 0 && local96 == Static630.anInt10396 && local118 >= 0 && local140.anInt404 + local118 < Static394.anInt7540 && local131 >= 0 && local140.anInt404 + local131 < Static462.anInt8391) {
						@Pc(188) Class2_Sub3_Sub1_Sub2_Sub1 local188 = new Class2_Sub3_Sub1_Sub2_Sub1();
						local188.anInt6289 = local88;
						@Pc(196) Class3_Sub49 local196 = new Class3_Sub49(local188);
						Static60.aClass307_6.method7425((long) local88, local196);
						Static482.aClass3_Sub49Array1[Static234.anInt5314++] = local196;
						Static176.anIntArray229[Static377.anInt7132++] = local88;
						local188.anInt6288 = Static251.anInt5580;
						local188.method2679(local140);
						local188.method5309(local188.aClass22_1.anInt404);
						local188.anInt6275 = local188.aClass22_1.anInt423 << 3;
						local188.method5322((local188.aClass22_1.lb + 4 & 0x70600007) << 11, true);
						local188.method2683(true, local131, local188.method5308(), local96, local118);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIZZ)V")
	public static void method4604(@OriginalArg(2) boolean arg0) {
		Static590.anInt9843 = 22050;
		Static66.anInt1409 = 2;
		Static457.aBoolean715 = arg0;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
	public static void method4606() {
		Static367.aClass345_3.method8052();
	}
}
