import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	public static int anInt3834 = 0;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_72 = new Class92(19, 3);

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
	public static final int anInt3842 = 12;

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "J")
	public static long aLong115 = 0L;

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
	public static int anInt3849 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!md;)V")
	public static void method3168(@OriginalArg(1) Class6_Sub1_Sub1 arg0) {
		arg0.method3791();
		@Pc(10) int local10 = Static4.anInt7923;
		@Pc(25) Class3_Sub2_Sub1_Sub2 local25 = Static302.aClass3_Sub2_Sub1_Sub2_2 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local10] = new Class3_Sub2_Sub1_Sub2();
		local25.anInt6602 = local10;
		@Pc(33) int local33 = arg0.method3803(30);
		@Pc(38) byte local38 = (byte) (local33 >> 28);
		@Pc(44) int local44 = local33 >> 14 & 0x3FFF;
		@Pc(48) int local48 = local33 & 0x3FFF;
		local25.anIntArray458[0] = local44 - Static2.anInt6396;
		local25.anInt7202 = (local25.anIntArray458[0] << 7) + (local25.method5521() << 6);
		local25.anIntArray459[0] = local48 - Static348.anInt6273;
		local25.anInt7207 = (local25.anIntArray459[0] << 7) + (local25.method5521() << 6);
		Static388.anInt6870 = local25.aByte103 = local38;
		if (Static184.aClass6_Sub1Array1[local10] != null) {
			local25.method5531(Static184.aClass6_Sub1Array1[local10]);
		}
		Static95.anInt2186 = 0;
		Static178.anIntArray542[Static95.anInt2186++] = local10;
		Static356.aByteArray79[local10] = 0;
		Static276.anInt4962 = 0;
		for (@Pc(129) int local129 = 1; local129 < 2048; local129++) {
			if (local129 != local10) {
				@Pc(145) int local145 = arg0.method3803(18);
				@Pc(149) int local149 = local145 >> 16;
				@Pc(155) int local155 = local145 >> 8 & 0xFF;
				@Pc(159) int local159 = local145 & 0xFF;
				@Pc(167) Class216 local167 = Static373.aClass216Array1[local129] = new Class216();
				local167.anInt6270 = local159 + (local149 << 28) + (local155 << 14);
				local167.anInt6266 = -1;
				local167.anInt6269 = 0;
				local167.aBoolean400 = false;
				Static223.anIntArray294[Static276.anInt4962++] = local129;
				Static356.aByteArray79[local129] = 0;
			}
		}
		arg0.method3801();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!ae;)Lclient!lk;")
	public static Class6_Sub5 method3171(@OriginalArg(1) Class6_Sub1 arg0) {
		arg0.method6433();
		@Pc(18) int local18 = arg0.method6433();
		@Pc(22) Class6_Sub5 local22 = Static167.method5983(local18);
		local22.anInt7987 = arg0.method6433();
		@Pc(31) int local31 = arg0.method6433();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method6433();
			local22.method6540(local39, arg0);
		}
		local22.method6533();
		return local22;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
	public static void method3172() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static180.aBooleanArray8[local7] = true;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)I")
	public static int method3173(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JIBI)V")
	public static void method3174(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static292.method4382(true, arg2, local22, arg1, 0, 0, 0, local15);
			return;
		}
		@Pc(57) Class106 local57 = Static448.aClass104_4.method2616(local29);
		@Pc(65) int local65;
		@Pc(68) int local68;
		if (local22 == 0 || local22 == 2) {
			local65 = local57.anInt3158;
			local68 = local57.anInt3194;
		} else {
			local65 = local57.anInt3194;
			local68 = local57.anInt3158;
		}
		@Pc(79) int local79 = local57.anInt3155;
		if (local22 != 0) {
			local79 = (local79 << local22 & 0xF) + (local79 >> 4 - local22);
		}
		Static292.method4382(true, arg2, 0, arg1, local68, local79, local65, 0);
	}
}
