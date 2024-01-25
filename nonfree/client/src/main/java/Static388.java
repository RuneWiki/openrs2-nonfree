import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
	public static final int anInt6536 = 1407;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!gs;)V")
	public static void method5534(@OriginalArg(1) Class6_Sub23_Sub1 arg0) {
		arg0.method2877();
		@Pc(15) int local15 = Static659.anInt7559;
		@Pc(25) Class2_Sub1_Sub1_Sub3_Sub1 local25 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local15] = new Class2_Sub1_Sub1_Sub3_Sub1();
		local25.anInt5103 = local15;
		@Pc(35) int local35 = arg0.method2878(30);
		@Pc(40) byte local40 = (byte) (local35 >> 28);
		@Pc(46) int local46 = local35 >> 14 & 0x3FFF;
		local25.anIntArray302[0] = local46 - Static534.anInt8753;
		@Pc(58) int local58 = local35 & 0x3FFF;
		local25.anInt10006 = (local25.anIntArray302[0] << 9) + (local25.method4326() << 8);
		local25.anIntArray301[0] = local58 - Static234.anInt4239;
		local25.anInt10001 = (local25.anIntArray301[0] << 9) + (local25.method4326() << 8);
		Static253.anInt4353 = local25.aByte140 = local25.aByte141 = local40;
		if (Static250.method3635(local25.anIntArray302[0], local25.anIntArray301[0])) {
			local25.aByte141++;
		}
		if (Static346.aClass6_Sub23Array1[local15] != null) {
			local25.method3515(Static346.aClass6_Sub23Array1[local15]);
		}
		Static475.anInt8165 = 0;
		Static75.anIntArray82[Static475.anInt8165++] = local15;
		Static669.aByteArray106[local15] = 0;
		Static218.anInt3725 = 0;
		for (@Pc(153) int local153 = 1; local153 < 2048; local153++) {
			if (local15 != local153) {
				@Pc(167) int local167 = arg0.method2878(18);
				@Pc(171) int local171 = local167 >> 16;
				@Pc(177) int local177 = local167 >> 8 & 0xFF;
				@Pc(181) int local181 = local167 & 0xFF;
				@Pc(189) Class120 local189 = Static288.aClass120Array1[local153] = new Class120();
				local189.anInt3036 = 0;
				local189.anInt3038 = -1;
				local189.aBoolean191 = false;
				local189.aBoolean190 = false;
				local189.anInt3039 = local181 + (local177 << 14) + (local171 << 28);
				Static450.anIntArray690[Static218.anInt3725++] = local153;
				Static669.aByteArray106[local153] = 0;
			}
		}
		arg0.method2883();
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
	public static void method5538() {
		for (@Pc(3) int local3 = 0; local3 < Static133.anInt2316; local3++) {
			@Pc(17) int local17 = Static74.anIntArray80[local3];
			@Pc(24) Class6_Sub44 local24 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local17);
			if (local24 != null) {
				@Pc(29) Class2_Sub1_Sub1_Sub3_Sub2 local29 = local24.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				Static550.method7819(local29.aClass91_1.anInt2346, local29);
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIILclient!ha;IIIIIILclient!ka;IILclient!gf;)Lclient!ka;")
	public static Class184 method5541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class184 arg10, @OriginalArg(11) int arg11, @OriginalArg(13) Class119 arg12) {
		if (arg10 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg12 != null) {
			local11 = arg12.method2502(-1, false, arg2) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg4 << 48) + ((long) ((arg7 << 24) + (arg8 << 16) + arg6) + ((long) arg0 << 32));
		@Pc(50) Class10 local50 = Static278.aClass10_58;
		@Pc(58) Class184 local58;
		synchronized (Static278.aClass10_58) {
			local58 = (Class184) Static278.aClass10_58.method373(local48);
		}
		if (local58 == null || arg3.method7509(local58.ua(), local11) != 0) {
			if (local58 != null) {
				local11 = arg3.method7448(local11, local58.ua());
			}
			@Pc(90) byte local90;
			if (arg6 == 1) {
				local90 = 9;
			} else if (arg6 == 2) {
				local90 = 12;
			} else if (arg6 == 3) {
				local90 = 15;
			} else if (arg6 == 4) {
				local90 = 18;
			} else {
				local90 = 21;
			}
			@Pc(129) int[] local129 = new int[] { 64, 96, 128 };
			@Pc(147) Class22 local147 = new Class22(local90 * 3 + 1, -local90 + local90 * 2 * 3, 0);
			@Pc(154) int local154 = local147.method531(0, 0, 0);
			@Pc(158) int[][] local158 = new int[3][local90];
			@Pc(166) int local166;
			@Pc(170) int local170;
			@Pc(172) int local172;
			@Pc(196) int local196;
			for (@Pc(160) int local160 = 0; local160 < 3; local160++) {
				local166 = local129[local160];
				local170 = local129[local160];
				for (local172 = 0; local172 < local90; local172++) {
					@Pc(180) int local180 = (local172 << 14) / local90;
					@Pc(188) int local188 = local166 * Class6_Sub1_Sub3.anIntArray56[local180] >> 14;
					local196 = Class6_Sub1_Sub3.anIntArray58[local180] * local170 >> 14;
					local158[local160][local172] = local147.method531(0, local196, local188);
				}
			}
			for (local166 = 0; local166 < 3; local166++) {
				local170 = (local166 * 256 + 128) / 3;
				local172 = 256 - local170;
				@Pc(247) byte local247 = (byte) (arg8 * local172 + arg7 * local170 >> 8);
				@Pc(292) short local292 = (short) ((local170 * (arg4 & 0xFC00) + local172 * (arg0 & 0xFC00) & 0xFC0000) + ((arg4 & 0x380) * local170 + (arg0 & 0x380) * local172 & 0x38000) + (local172 * (arg0 & 0x7F) + (arg4 & 0x7F) * local170 & 0x7F00) >> 8);
				for (local196 = 0; local196 < local90; local196++) {
					if (local166 == 0) {
						local147.method532(local158[0][local196], local154, local158[0][(local196 + 1) % local90], (byte) 1, (short) -1, local247, (byte) -1, local292);
					} else {
						local147.method532(local158[local166][(local196 + 1) % local90], local158[local166 - 1][local196], local158[local166 - 1][(local196 + 1) % local90], (byte) 1, (short) -1, local247, (byte) -1, local292);
						local147.method532(local158[local166][local196], local158[local166 - 1][local196], local158[local166][(local196 + 1) % local90], (byte) 1, (short) -1, local247, (byte) -1, local292);
					}
				}
			}
			local58 = arg3.method7475(local147, local11, Static176.anInt2974, 64, 768);
			@Pc(415) Class10 local415 = Static278.aClass10_58;
			synchronized (Static278.aClass10_58) {
				Static278.aClass10_58.method366(local58, local48);
			}
		}
		@Pc(431) int local431 = arg10.V();
		@Pc(434) int local434 = arg10.RA();
		@Pc(437) int local437 = arg10.HA();
		@Pc(440) int local440 = arg10.G();
		@Pc(442) Class6_Sub4_Sub4 local442 = null;
		if (arg12 != null) {
			@Pc(449) int local449 = arg12.anIntArray167[arg2];
			local442 = Static334.aClass268_2.method6468(local449 >> 16);
			arg2 = local449 & 0xFFFF;
		}
		if (local442 == null) {
			local58 = local58.method8660((byte) 3, local11, true);
			local58.O(local434 - local431 >> 1, 128, local440 - local437 >> 1);
			local58.H(local431 + local434 >> 1, 0, local440 + local437 >> 1);
		} else {
			local58 = local58.method8660((byte) 3, local11, true);
			local58.O(local434 - local431 >> 1, 128, local440 - local437 >> 1);
			local58.H(local434 + local431 >> 1, 0, local437 + local440 >> 1);
			local58.method8648(arg2, local442);
		}
		if (arg9 != 0) {
			local58.FA(arg9);
		}
		if (arg5 != 0) {
			local58.VA(arg5);
		}
		if (arg1 != 0) {
			local58.H(0, arg1, 0);
		}
		return local58;
	}
}
