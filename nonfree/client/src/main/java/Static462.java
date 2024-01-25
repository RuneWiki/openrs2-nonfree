import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
	public static int anInt8179 = 0;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "Z")
	public static boolean aBoolean556 = false;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!rg;)Lclient!fq;")
	public static Class22_Sub2 method7051(@OriginalArg(1) Class6_Sub40 arg0) {
		@Pc(7) Class22 local7 = Static282.method4956(arg0);
		@Pc(11) int local11 = arg0.method8579();
		@Pc(21) int local21 = arg0.method8579();
		@Pc(25) int local25 = arg0.method8571();
		return new Class22_Sub2(local7.aClass238_9, local7.aClass79_14, local7.anInt5439, local7.anInt5436, local7.anInt5441, local7.anInt5435, local7.anInt5432, local7.anInt5438, local7.anInt5431, local11, local21, local25);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
	public static void method7052() {
		@Pc(10) Class166 local10 = Static201.aClass166_20;
		synchronized (Static201.aClass166_20) {
			Static201.aClass166_20.method4811();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZB)I")
	public static int method7053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class6_Sub16 local8 = Static148.method2357(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && local8.anIntArray171.length > arg1) {
			return local8.anIntArray171[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!vt;)V")
	public static void method7054(@OriginalArg(1) Class6_Sub40_Sub2 arg0) {
		arg0.method8618();
		@Pc(10) int local10 = Static229.anInt4561;
		@Pc(20) Class20_Sub2_Sub2_Sub1_Sub1 local20 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local10] = new Class20_Sub2_Sub2_Sub1_Sub1();
		local20.anInt5567 = local10;
		@Pc(28) int local28 = arg0.method8619(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray335[0] = local39 - Static606.anInt8651;
		local20.anInt10725 = (local20.anIntArray335[0] << 9) + (local20.method4913() << 8);
		local20.anIntArray336[0] = local43 - Static195.anInt3961;
		local20.anInt10729 = (local20.anIntArray336[0] << 9) + (local20.method4913() << 8);
		Static175.anInt3636 = local20.aByte131 = local20.aByte130 = local33;
		if (Static492.method7384(local20.anIntArray335[0], local20.anIntArray336[0])) {
			local20.aByte130++;
		}
		if (Static594.aClass6_Sub40Array1[local10] != null) {
			local20.method1028(Static594.aClass6_Sub40Array1[local10]);
		}
		Static530.anInt8592 = 0;
		Static551.anIntArray576[Static530.anInt8592++] = local10;
		Static431.aByteArray89[local10] = 0;
		Static203.anInt4060 = 0;
		for (@Pc(141) int local141 = 1; local141 < 2048; local141++) {
			if (local141 != local10) {
				@Pc(155) int local155 = arg0.method8619(18);
				@Pc(159) int local159 = local155 >> 16;
				@Pc(165) int local165 = local155 >> 8 & 0xFF;
				@Pc(169) int local169 = local155 & 0xFF;
				@Pc(177) Class260 local177 = Static592.aClass260Array1[local141] = new Class260();
				local177.aBoolean535 = false;
				local177.anInt7979 = local169 + (local159 << 28) + (local165 << 14);
				local177.anInt7980 = 0;
				local177.anInt7978 = -1;
				Static18.anIntArray12[Static203.anInt4060++] = local141;
				Static431.aByteArray89[local141] = 0;
			}
		}
		arg0.method8631();
	}
}
