import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
	public static int anInt5228;

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "Z")
	public static boolean aBoolean385 = false;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "[B")
	public static final byte[] aByteArray78 = new byte[520];

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
	public static int anInt5229 = -1;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)Lclient!p;")
	public static Class8_Sub4 method4512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub4_2;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!lf;I)V")
	public static void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (Static183.aClass205_1 == null) {
			return;
		}
		try {
			Static183.aClass205_1.method5309(0L);
			Static183.aClass205_1.method5317(arg0, 24, arg1.aByteArray55);
		} catch (@Pc(23) Exception local23) {
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)Lclient!br;")
	public static Class21 method4515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class21 local7 = Static92.method534(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass21Array1 == null || arg0 >= local7.aClass21Array1.length) {
			return null;
		} else {
			return local7.aClass21Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(JIII)V")
	public static void method4517(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = (int) arg0 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg0 >> 20 & 0x3;
		@Pc(28) int local28 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local14 != 10 && local14 != 11 && local14 != 22) {
			Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], arg2, 0, Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], 0, 0, true, local14, local21, arg1);
			return;
		}
		@Pc(45) Class18 local45 = Static113.method2380(local28);
		@Pc(56) int local56;
		@Pc(59) int local59;
		if (local21 == 0 || local21 == 2) {
			local56 = local45.anInt532;
			local59 = local45.anInt529;
		} else {
			local56 = local45.anInt529;
			local59 = local45.anInt532;
		}
		@Pc(70) int local70 = local45.anInt500;
		if (local21 != 0) {
			local70 = (local70 << local21 & 0xF) + (local70 >> 4 - local21);
		}
		Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], arg2, local56, Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local59, local70, true, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public static void method4518() {
		Static15.aClass4_Sub11_Sub1_2.anInt3768 = 0;
		Static168.anInt6692 = -1;
		Static209.anInt4334 = -1;
		Static229.anInt4619 = -1;
		Static127.aClass4_Sub11_Sub1_3.anInt3768 = 0;
		Static57.anInt1518 = 0;
		Static205.anInt4305 = -1;
		Static258.anInt5208 = 0;
		Static133.anInt3104 = 0;
		Static335.method5408();
		Static246.method4382();
		for (@Pc(31) int local31 = 0; local31 < Static327.aClass8_Sub1_Sub2_Sub1Array1.length; local31++) {
			if (Static327.aClass8_Sub1_Sub2_Sub1Array1[local31] != null) {
				Static327.aClass8_Sub1_Sub2_Sub1Array1[local31].anInt4964 = -1;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static169.aClass8_Sub1_Sub2_Sub2Array1.length; local61++) {
			if (Static169.aClass8_Sub1_Sub2_Sub2Array1[local61] != null) {
				Static169.aClass8_Sub1_Sub2_Sub2Array1[local61].anInt4964 = -1;
			}
		}
		Static172.method3328();
		Static353.anInt2640 = 1;
		Static243.method5095(30);
		for (@Pc(90) int local90 = 0; local90 < 100; local90++) {
			Static172.aBooleanArray19[local90] = true;
		}
		Static178.method3408();
	}
}
