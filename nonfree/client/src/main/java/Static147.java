import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!he", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray22;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_184 = new Class12(63, 9);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!za;)V")
	public static void method5931(@OriginalArg(0) Class34 arg0) {
		for (@Pc(1) int local1 = Static79.anInt1470; local1 < Static105.anInt1943; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static37.anInt666; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static408.anInt6716; local7++) {
					@Pc(16) Class169 local16 = Static359.aClass169ArrayArrayArray5[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class25_Sub4 local21 = local16.aClass25_Sub4_2;
						@Pc(24) Class25_Sub4 local24 = local16.aClass25_Sub4_1;
						if (local21 != null && local21.method4602()) {
							Static330.method4431(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method4602()) {
								Static330.method4431(arg0, local24, local1, local4, local7, 1, 1);
								local24.method4609(0, 0, false, 0, local21, arg0);
								local24.method4607();
							}
							local21.method4607();
						}
						for (@Pc(70) Class27 local70 = local16.aClass27_3; local70 != null; local70 = local70.aClass27_1) {
							@Pc(74) Class25_Sub5 local74 = local70.aClass25_Sub5_1;
							if (local74 != null && local74.method4602()) {
								Static330.method4431(arg0, local74, local1, local4, local7, local74.aShort96 + 1 - local74.aShort97, local74.aShort95 - local74.aShort94 + 1);
								local74.method4607();
							}
						}
						@Pc(111) Class25_Sub2 local111 = local16.aClass25_Sub2_2;
						if (local111 != null && local111.method4602()) {
							Static1.method8(arg0, local111, local1, local4, local7);
							local111.method4607();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)B")
	public static byte method5932(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(JIILclient!ta;Lclient!jk;IIII)V")
	public static void method5937(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class104 arg3, @OriginalArg(4) Class124 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(15) int local15 = arg7 * arg7 + arg6 * arg6;
		if (arg0 < (long) local15) {
			return;
		}
		@Pc(31) int local31 = Math.min(arg4.anInt3376 / 2, arg4.anInt3356 / 2);
		if (local31 * local31 >= local15) {
			Static112.method1800(arg5, arg3, arg2, arg6, arg4, arg7, Static359.aClass6Array12[arg1]);
			return;
		}
		local31 -= 10;
		@Pc(57) int local57;
		if (Static333.anInt5693 == 4) {
			local57 = (int) Static98.aFloat20 & 0x3FFF;
		} else {
			local57 = Static378.anInt2798 + (int) Static98.aFloat20 & 0x3FFF;
		}
		@Pc(70) int local70 = Class1_Sub4_Sub8_Sub1.anIntArray50[local57];
		@Pc(74) int local74 = Class1_Sub4_Sub8_Sub1.anIntArray49[local57];
		if (Static333.anInt5693 != 4) {
			local70 = local70 * 256 / (Static435.anInt7311 + 256);
			local74 = local74 * 256 / (Static435.anInt7311 + 256);
		}
		@Pc(104) int local104 = arg6 * local70 + arg7 * local74 >> 15;
		@Pc(115) int local115 = arg6 * local74 - local70 * arg7 >> 15;
		@Pc(121) double local121 = Math.atan2((double) local104, (double) local115);
		@Pc(128) int local128 = (int) ((double) local31 * Math.sin(local121));
		@Pc(135) int local135 = (int) ((double) local31 * Math.cos(local121));
		Static361.aClass6Array13[arg1].method5890((float) local128 + (float) arg4.anInt3376 / 2.0F + (float) arg5, (float) -local135 + (float) arg4.anInt3356 / 2.0F + (float) arg2, 4096, (int) (-local121 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!kh;)Z")
	public static boolean method5938(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub28_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method3084(2);
		@Pc(33) int local33;
		@Pc(40) int local40;
		@Pc(110) int local110;
		@Pc(114) int local114;
		@Pc(120) int local120;
		if (local8 == 0) {
			if (arg1.method3084(1) != 0) {
				method5938(arg0, arg1);
			}
			local33 = arg1.method3084(6);
			local40 = arg1.method3084(6);
			@Pc(52) boolean local52 = arg1.method3084(1) == 1;
			if (local52) {
				Static59.anIntArray54[Static409.anInt6725++] = arg0;
			}
			if (Static28.aClass25_Sub5_Sub1_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(75) Class44 local75 = Static162.aClass44Array1[arg0];
			@Pc(83) Class25_Sub5_Sub1_Sub2 local83 = Static28.aClass25_Sub5_Sub1_Sub2Array1[arg0] = new Class25_Sub5_Sub1_Sub2();
			local83.anInt4284 = arg0;
			if (Static7.aClass1_Sub28Array1[arg0] != null) {
				local83.method3448(Static7.aClass1_Sub28Array1[arg0]);
			}
			local83.method3435(local75.anInt1174);
			local83.anInt4238 = local75.anInt1172;
			local110 = local75.anInt1171;
			local114 = local110 >> 28;
			local120 = local110 >> 14 & 0xFF;
			local83.aBoolean487 = local75.aBoolean122;
			@Pc(128) int local128 = local110 & 0xFF;
			local83.aByteArray51[0] = Static372.aByteArray84[arg0];
			local83.aByte94 = (byte) local114;
			local83.method3441((local120 << 6) + local33 - Static199.anInt3480, (local128 << 6) - -local40 - Static164.anInt2731);
			local83.aBoolean486 = false;
			Static162.aClass44Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local33 = arg1.method3084(2);
			local40 = Static162.aClass44Array1[arg0].anInt1171;
			Static162.aClass44Array1[arg0].anInt1171 = (((local40 >> 28) + local33 & 0x3) << 28) + (local40 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(221) int local221;
			@Pc(226) int local226;
			@Pc(234) int local234;
			if (local8 != 2) {
				local33 = arg1.method3084(18);
				local40 = local33 >> 16;
				local221 = local33 >> 8 & 0xFF;
				local226 = local33 & 0xFF;
				local234 = Static162.aClass44Array1[arg0].anInt1171;
				local110 = local40 + (local234 >> 28) & 0x3;
				local114 = local221 + (local234 >> 14) & 0xFF;
				local120 = local234 + local226 & 0xFF;
				Static162.aClass44Array1[arg0].anInt1171 = (local114 << 14) + (local110 << 28) + local120;
				return false;
			}
			local33 = arg1.method3084(5);
			local40 = local33 >> 3;
			local221 = local33 & 0x7;
			local226 = Static162.aClass44Array1[arg0].anInt1171;
			local234 = local40 + (local226 >> 28) & 0x3;
			local110 = local226 >> 14 & 0xFF;
			local114 = local226 & 0xFF;
			if (local221 == 0) {
				local110--;
				local114--;
			}
			if (local221 == 1) {
				local114--;
			}
			if (local221 == 2) {
				local114--;
				local110++;
			}
			if (local221 == 3) {
				local110--;
			}
			if (local221 == 4) {
				local110++;
			}
			if (local221 == 5) {
				local110--;
				local114++;
			}
			if (local221 == 6) {
				local114++;
			}
			if (local221 == 7) {
				local114++;
				local110++;
			}
			Static162.aClass44Array1[arg0].anInt1171 = (local110 << 14) + ((local234 << 28) + local114);
			return false;
		}
	}
}
