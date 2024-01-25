import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "Lclient!pq;")
	public static Class251 aClass251_2;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_3 = new Class40(73, 3);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIBLclient!pea;II)Lclient!mm;")
	public static Class35_Sub3_Sub1 method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.aBoolean457 || Static392.method5808(arg4) && Static392.method5808(arg0)) {
			return new Class35_Sub3_Sub1(arg2, 3553, arg1, arg3, arg4, arg0, true);
		} else if (arg2.aBoolean464) {
			return new Class35_Sub3_Sub1(arg2, 34037, arg1, arg3, arg4, arg0, true);
		} else {
			return new Class35_Sub3_Sub1(arg2, arg1, arg3, arg4, arg0, Static516.method7313(arg4), Static516.method7313(arg0), true);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B[B)V")
	public static void method181(@OriginalArg(1) byte[] arg0) {
		new Class6_Sub14(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
	public static void method182() {
		if (Static29.aClass45_1 != null) {
			Static29.aClass45_1.method6491();
		}
		if (Static194.aClass45_2 != null) {
			Static194.aClass45_2.method6491();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!qe;I)V")
	public static void method183(@OriginalArg(0) Class6_Sub14_Sub2 arg0) {
		arg0.method6045();
		@Pc(10) int local10 = Static44.anInt711;
		@Pc(20) Class29_Sub2_Sub1_Sub2 local20 = Static426.aClass29_Sub2_Sub1_Sub2_2 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local10] = new Class29_Sub2_Sub1_Sub2();
		local20.anInt8541 = local10;
		@Pc(28) int local28 = arg0.method6052(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray661[0] = local39 - Static218.anInt3718;
		local20.anInt9222 = (local20.anIntArray661[0] << 9) + (local20.method7008() << 8);
		local20.anIntArray660[0] = local43 - Static167.anInt3048;
		local20.anInt9218 = (local20.anIntArray660[0] << 9) + (local20.method7008() << 8);
		Static282.anInt4677 = local20.aByte103 = local33;
		if (Static167.aClass6_Sub14Array1[local10] != null) {
			local20.method7020(Static167.aClass6_Sub14Array1[local10]);
		}
		Static199.anInt3448 = 0;
		Static272.anIntArray443[Static199.anInt3448++] = local10;
		Static365.aByteArray80[local10] = 0;
		Static176.anInt3143 = 0;
		for (@Pc(124) int local124 = 1; local124 < 2048; local124++) {
			if (local124 != local10) {
				@Pc(138) int local138 = arg0.method6052(18);
				@Pc(142) int local142 = local138 >> 16;
				@Pc(148) int local148 = local138 >> 8 & 0xFF;
				@Pc(152) int local152 = local138 & 0xFF;
				@Pc(160) Class47 local160 = Static560.aClass47Array4[local124] = new Class47();
				local160.anInt933 = local152 + (local142 << 28) + (local148 << 14);
				local160.anInt934 = -1;
				local160.aBoolean48 = false;
				local160.anInt936 = 0;
				Static409.anIntArray255[Static176.anInt3143++] = local124;
				Static365.aByteArray80[local124] = 0;
			}
		}
		arg0.method6051();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!dga;I)V")
	public static void method184(@OriginalArg(0) Class6_Sub14 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static225.aClass320_3 != null) {
			@Pc(20) int local20;
			try {
				Static225.aClass320_3.method7334(0L);
				Static225.aClass320_3.method7337(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method6039(24, local8);
	}
}
