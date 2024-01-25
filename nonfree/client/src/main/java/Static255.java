import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
	public static int anInt4054;

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "[I")
	public static final int[] anIntArray278 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILclient!wn;B)Z")
	public static boolean method3523(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub22_Sub2 arg1) {
		@Pc(13) int local13 = arg1.method8569(2);
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(110) int local110;
		@Pc(114) int local114;
		@Pc(120) int local120;
		if (local13 == 0) {
			if (arg1.method8569(1) != 0) {
				method3523(arg0, arg1);
			}
			local36 = arg1.method8569(6);
			local41 = arg1.method8569(6);
			@Pc(53) boolean local53 = arg1.method8569(1) == 1;
			if (local53) {
				Static556.anIntArray698[Static620.anInt9966++] = arg0;
			}
			if (Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(76) Class336 local76 = Static4.aClass336Array1[arg0];
			@Pc(84) Class13_Sub1_Sub1_Sub1_Sub2 local84 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[arg0] = new Class13_Sub1_Sub1_Sub1_Sub2();
			local84.anInt4582 = arg0;
			if (Static458.aClass2_Sub22Array1[arg0] != null) {
				local84.method3973(Static458.aClass2_Sub22Array1[arg0]);
			}
			local84.method3952(local76.anInt8972, true);
			local84.anInt4580 = local76.anInt8971;
			local110 = local76.anInt8969;
			local114 = local110 >> 28;
			local120 = local110 >> 14 & 0xFF;
			@Pc(124) int local124 = local110 & 0xFF;
			@Pc(133) int local133 = local36 + (local120 << 6) - Static132.anInt2246;
			@Pc(142) int local142 = (local124 << 6) - (Static123.anInt2176 - local41);
			local84.aBoolean323 = local76.aBoolean670;
			local84.aByteArray52[0] = Static148.aByteArray34[arg0];
			local84.aByte127 = local84.aByte126 = (byte) local114;
			if (Static181.method2642(local142, local133)) {
				local84.aByte126++;
			}
			local84.method3975(local142, local133);
			local84.aBoolean325 = false;
			Static4.aClass336Array1[arg0] = null;
			return true;
		} else if (local13 == 1) {
			local36 = arg1.method8569(2);
			local41 = Static4.aClass336Array1[arg0].anInt8969;
			Static4.aClass336Array1[arg0].anInt8969 = (((local41 >> 28) + local36 & 0x3) << 28) + (local41 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(240) int local240;
			@Pc(245) int local245;
			@Pc(253) int local253;
			if (local13 != 2) {
				local36 = arg1.method8569(18);
				local41 = local36 >> 16;
				local240 = local36 >> 8 & 0xFF;
				local245 = local36 & 0xFF;
				local253 = Static4.aClass336Array1[arg0].anInt8969;
				local110 = local41 + (local253 >> 28) & 0x3;
				local114 = local240 + (local253 >> 14) & 0xFF;
				local120 = local253 + local245 & 0xFF;
				Static4.aClass336Array1[arg0].anInt8969 = local120 + (local114 << 14) + (local110 << 28);
				return false;
			}
			local36 = arg1.method8569(5);
			local41 = local36 >> 3;
			local240 = local36 & 0x7;
			local245 = Static4.aClass336Array1[arg0].anInt8969;
			local253 = (local245 >> 28) + local41 & 0x3;
			local110 = local245 >> 14 & 0xFF;
			local114 = local245 & 0xFF;
			if (local240 == 0) {
				local110--;
				local114--;
			}
			if (local240 == 1) {
				local114--;
			}
			if (local240 == 2) {
				local110++;
				local114--;
			}
			if (local240 == 3) {
				local110--;
			}
			if (local240 == 4) {
				local110++;
			}
			if (local240 == 5) {
				local114++;
				local110--;
			}
			if (local240 == 6) {
				local114++;
			}
			if (local240 == 7) {
				local110++;
				local114++;
			}
			Static4.aClass336Array1[arg0].anInt8969 = (local110 << 14) + (local253 << 28) + local114;
			return false;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)[Lclient!cba;")
	public static Class45[] method3524() {
		return new Class45[] { Static361.aClass45_3, Static305.aClass45_2, Static171.aClass45_1 };
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V")
	public static void method3526() {
		@Pc(1) Class32 local1 = Static22.aClass32_6;
		synchronized (Static22.aClass32_6) {
			Static22.aClass32_6.method632();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V")
	public static void method3527() {
		if (Static329.anInt5228 <= 0) {
			Static61.aString13 = "";
			return;
		}
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < Static397.aStringArray34.length; local10++) {
			if (Static397.aStringArray34[local10].indexOf("--> ") != -1) {
				@Pc(22) int local22 = ~Static329.anInt5228;
				local8++;
				if (local22 == ~local8) {
					Static61.aString13 = Static397.aStringArray34[local10].substring(Static397.aStringArray34[local10].indexOf(">") + 2);
					break;
				}
			}
		}
	}
}
