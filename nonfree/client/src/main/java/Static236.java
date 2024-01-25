import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "Lclient!gca;")
	public static final Class119 aClass119_2 = new Class119();

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!sj;B)V")
	public static void method3841(@OriginalArg(0) Class4_Sub13_Sub2 arg0) {
		arg0.method7063();
		@Pc(10) int local10 = Static1.anInt5011;
		@Pc(20) Class21_Sub1_Sub1_Sub1_Sub2 local20 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local10] = new Class21_Sub1_Sub1_Sub1_Sub2();
		local20.anInt4256 = local10;
		@Pc(36) int local36 = arg0.method7065(30);
		@Pc(41) byte local41 = (byte) (local36 >> 28);
		@Pc(47) int local47 = local36 >> 14 & 0x3FFF;
		@Pc(51) int local51 = local36 & 0x3FFF;
		local20.anIntArray206[0] = local47 - Static242.anInt10133;
		local20.anInt10551 = (local20.anIntArray206[0] << 9) + (local20.method3339() << 8);
		local20.anIntArray207[0] = local51 - Static157.anInt3323;
		local20.anInt10550 = (local20.anIntArray207[0] << 9) + (local20.method3339() << 8);
		Static352.anInt6764 = local20.aByte127 = local20.aByte128 = local41;
		if (Static193.method3175(local20.anIntArray207[0], local20.anIntArray206[0])) {
			local20.aByte128++;
		}
		if (Static229.aClass4_Sub13Array1[local10] != null) {
			local20.method3356(Static229.aClass4_Sub13Array1[local10]);
		}
		Static57.anInt1513 = 0;
		Static447.anIntArray571[Static57.anInt1513++] = local10;
		Static271.aByteArray46[local10] = 0;
		Static84.anInt2249 = 0;
		for (@Pc(151) int local151 = 1; local151 < 2048; local151++) {
			if (local151 != local10) {
				@Pc(165) int local165 = arg0.method7065(18);
				@Pc(169) int local169 = local165 >> 16;
				@Pc(175) int local175 = local165 >> 8 & 0xFF;
				@Pc(179) int local179 = local165 & 0xFF;
				@Pc(187) Class337 local187 = Static140.aClass337Array1[local151] = new Class337();
				local187.anInt10018 = -1;
				local187.anInt10017 = 0;
				local187.anInt10020 = (local175 << 14) + (local169 << 28) + local179;
				local187.aBoolean692 = false;
				Static377.anIntArray404[Static84.anInt2249++] = local151;
				Static271.aByteArray46[local151] = 0;
			}
		}
		arg0.method7062();
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZI)V")
	public static void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) Class4_Sub30 local10 = Static289.method4604(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray329.length; local15++) {
				local10.anIntArray329[local15] = -1;
				local10.anIntArray328[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method3843(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) byte[] local12;
		if (arg2 <= 0) {
			local12 = arg1;
		} else {
			local12 = new byte[arg0];
			for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
				local12[local19] = arg1[arg2 + local19];
			}
		}
		@Pc(41) Class215 local41 = new Class215();
		local41.method5009();
		local41.method5008((long) (arg0 * 8), local12);
		@Pc(66) byte[] local66 = new byte[64];
		local41.method5006(local66);
		return local66;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIIIII)V")
	public static void method3844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static292.anInt5983 <= arg0 - arg2 && Static61.anInt1627 >= arg2 + arg0 && arg4 - arg2 >= Static289.anInt5872 && arg2 + arg4 <= Static160.anInt3347) {
			Static482.method6979(arg2, arg5, arg3, arg1, arg4, arg0);
		} else {
			Static30.method974(arg2, arg0, arg3, arg1, arg4, arg5);
		}
	}
}
