import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
	public static int anInt5632;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "[I")
	public static int[] anIntArray339;

	@OriginalMember(owner = "client!ke", name = "E", descriptor = "[B")
	public static final byte[] aByteArray61 = new byte[520];

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "[J")
	public static final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(B)V")
	public static void method4955() {
		if (Static643.anInt10677 < 0) {
			return;
		}
		@Pc(11) long local11 = Static32.method595();
		Static643.anInt10677 = (int) ((long) Static643.anInt10677 + Static409.aLong187 - local11);
		if (Static643.anInt10677 > 0) {
			@Pc(31) int local31 = (Static643.anInt10677 << 8) / Static175.anInt3641;
			@Pc(36) int local36 = 255 - local31;
			@Pc(41) float local41 = (float) local31 / 255.0F;
			Static152.anInt5124 = ((Static331.aClass274_1.anInt8207 & 0xFF00FF) * local36 + local31 * (Static482.anInt8362 & 0xFF00FF) & 0xFF00FF00) + ((Static482.anInt8362 & 0xFF00) * local31 + local36 * (Static331.aClass274_1.anInt8207 & 0xFF00) & 0xFF0000) >>> 8;
			@Pc(77) float local77 = 1.0F - local41;
			Static451.aFloat167 = Static409.aFloat147 + local77 * (Static331.aClass274_1.aFloat176 - Static409.aFloat147);
			Static597.anInt9945 = ((Static331.aClass274_1.anInt8204 & 0xFF00) * local36 + local31 * (Static442.anInt7976 & 0xFF00) & 0xFF0000) + (local36 * (Static331.aClass274_1.anInt8204 & 0xFF00FF) + local31 * (Static442.anInt7976 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static589.anInt9866 = Static518.anInt9075 * local31 + Static331.aClass274_1.anInt8208 * local36 >> 8;
			Static44.aFloat14 = Static307.aFloat116 + local77 * (Static331.aClass274_1.aFloat172 - Static307.aFloat116);
			Static515.aFloat184 = local77 * (Static331.aClass274_1.aFloat174 - Static524.aFloat186) + Static524.aFloat186;
			Static67.aFloat22 = local77 * (Static331.aClass274_1.aFloat173 - Static529.aFloat187) + Static529.aFloat187;
			Static176.aFloat231 = Static541.aFloat169 + (Static331.aClass274_1.aFloat171 - Static541.aFloat169) * local77;
			Static416.aFloat149 = Static582.aFloat193 + local77 * (Static331.aClass274_1.aFloat175 - Static582.aFloat193);
			if (Static617.aClass57_3 != Static331.aClass274_1.aClass57_1) {
				Static526.aClass57_2 = Static6.aClass100_1.method8827(Static617.aClass57_3, Static331.aClass274_1.aClass57_1, local77, Static526.aClass57_2);
			}
		} else {
			Static152.anInt5124 = Static331.aClass274_1.anInt8207;
			Static44.aFloat14 = Static331.aClass274_1.aFloat172;
			Static176.aFloat231 = Static331.aClass274_1.aFloat171;
			Static515.aFloat184 = Static331.aClass274_1.aFloat174;
			Static451.aFloat167 = Static331.aClass274_1.aFloat176;
			Static597.anInt9945 = Static331.aClass274_1.anInt8204;
			Static67.aFloat22 = Static331.aClass274_1.aFloat173;
			Static643.anInt10677 = -1;
			Static589.anInt9866 = Static331.aClass274_1.anInt8208;
			Static416.aFloat149 = Static331.aClass274_1.aFloat175;
			Static526.aClass57_2 = Static331.aClass274_1.aClass57_1;
		}
		Static409.aLong187 = local11;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!rg;)Lclient!au;")
	public static Class22 method4956(@OriginalArg(1) Class6_Sub40 arg0) {
		@Pc(10) Class238 local10 = Static613.method8515()[arg0.method8604()];
		@Pc(25) Class79 local25 = Static23.method3614()[arg0.method8604()];
		@Pc(29) int local29 = arg0.method8615();
		@Pc(33) int local33 = arg0.method8615();
		@Pc(37) int local37 = arg0.method8571();
		@Pc(41) int local41 = arg0.method8571();
		@Pc(45) int local45 = arg0.method8615();
		@Pc(49) int local49 = arg0.method8579();
		@Pc(53) int local53 = arg0.method8579();
		return new Class22(local10, local25, local29, local33, local37, local41, local45, local49, local53);
	}
}
