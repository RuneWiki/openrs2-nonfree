import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public static int anInt1985;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	public static int anInt1986;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[J")
	public static final long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_41 = new Class117("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
	public static void method1622(@OriginalArg(0) boolean arg0) {
		if (Static81.aBoolean91 != arg0) {
			Static81.aBoolean91 = arg0;
			Static154.method2471();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	public static void method1623(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static307.anInt4795 = arg1 - Static271.anInt4339;
		Static155.anInt2944 = arg0 - Static271.anInt4332;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZLclient!ms;I)V")
	public static void method1624(@OriginalArg(0) int arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) int arg2) {
		Static97.anInt1767 = arg2;
		Static162.anInt3053 = arg0;
		Static99.aClass137_2 = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZIIZIIII)V")
	public static void method1626(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg3 && Static16.anInt277 == arg2 && arg5 == anInt1986 && (arg6 == Static141.anInt2602 || Static283.method4712())) {
			return;
		}
		Static141.anInt2602 = arg6;
		Static16.anInt277 = arg2;
		anInt1986 = arg5;
		if (Static283.method4712()) {
			Static141.anInt2602 = 0;
		}
		if (arg0) {
			Static284.method4731(28);
		} else {
			Static284.method4731(25);
		}
		Static151.method2279(Static30.aClass9_1, true, Static349.aClass117_119.method2684(Static230.anInt4634));
		@Pc(55) int local55 = Static182.anInt3662;
		Static182.anInt3662 = (Static16.anInt277 - (Static24.anInt454 >> 4)) * 8;
		@Pc(65) int local65 = Static169.anInt6312;
		Static169.anInt6312 = (anInt1986 - (Static240.anInt4832 >> 4)) * 8;
		Static226.aClass11_Sub4_Sub7_3 = Static271.method3813(Static16.anInt277 * 8, anInt1986 * 8);
		Static22.aClass199_1 = null;
		@Pc(89) int local89 = Static182.anInt3662 - local55;
		@Pc(94) int local94 = Static169.anInt6312 - local65;
		@Pc(104) int local104;
		@Pc(110) int local110;
		@Pc(112) int local112;
		if (arg0) {
			Static141.anInt2601 = 0;
			local104 = Static24.anInt454 * 128 - 128;
			local110 = Static240.anInt4832 * 128 - 128;
			for (local112 = 0; local112 < 32768; local112++) {
				@Pc(118) Class67_Sub3_Sub3_Sub1 local118 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local112];
				if (local118 != null) {
					local118.anInt6308 -= local89 * 128;
					local118.anInt6310 -= local94 * 128;
					if (local118.anInt6308 >= 0 && local118.anInt6308 <= local104 && local118.anInt6310 >= 0 && local118.anInt6310 <= local110) {
						@Pc(159) boolean local159 = true;
						for (@Pc(161) int local161 = 0; local161 < 10; local161++) {
							local118.anIntArray391[local161] -= local89;
							local118.anIntArray392[local161] -= local94;
							if (local118.anIntArray391[local161] < 0 || Static24.anInt454 <= local118.anIntArray391[local161] || local118.anIntArray392[local161] < 0 || local118.anIntArray392[local161] >= Static240.anInt4832) {
								local159 = false;
							}
						}
						if (local159) {
							Static4.anIntArray4[Static141.anInt2601++] = local112;
						} else {
							Static356.aClass67_Sub3_Sub3_Sub1Array1[local112].method2677(null);
							Static356.aClass67_Sub3_Sub3_Sub1Array1[local112] = null;
						}
					} else {
						Static356.aClass67_Sub3_Sub3_Sub1Array1[local112].method2677(null);
						Static356.aClass67_Sub3_Sub3_Sub1Array1[local112] = null;
					}
				}
			}
		} else {
			for (local104 = 0; local104 < 32768; local104++) {
				@Pc(261) Class67_Sub3_Sub3_Sub1 local261 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local104];
				if (local261 != null) {
					for (local112 = 0; local112 < 10; local112++) {
						local261.anIntArray391[local112] -= local89;
						local261.anIntArray392[local112] -= local94;
					}
					local261.anInt6310 -= local94 * 128;
					local261.anInt6308 -= local89 * 128;
				}
			}
		}
		for (local110 = 0; local110 < 2048; local110++) {
			@Pc(323) Class67_Sub3_Sub3_Sub2 local323 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local110];
			if (local323 != null) {
				for (@Pc(327) int local327 = 0; local327 < 10; local327++) {
					local323.anIntArray391[local327] -= local89;
					local323.anIntArray392[local327] -= local94;
				}
				local323.anInt6310 -= local94 * 128;
				local323.anInt6308 -= local89 * 128;
			}
		}
		Static322.anInt6250 = arg6;
		Static156.aClass67_Sub3_Sub3_Sub2_2.method4384(arg1, false, arg4, Static322.anInt6250);
		Static341.method5570(local94, local89);
		for (@Pc(389) Class11_Sub24 local389 = (Class11_Sub24) Static21.aClass16_15.method193(); local389 != null; local389 = (Class11_Sub24) Static21.aClass16_15.method188()) {
			local389.anInt2702 -= local89;
			local389.anInt2699 -= local94;
			if (local389.anInt2702 < 0 || local389.anInt2699 < 0 || Static24.anInt454 <= local389.anInt2702 || local389.anInt2699 >= Static240.anInt4832) {
				local389.method5701();
			}
		}
		Static306.anInt6038 = 0;
		if (Static132.anInt2474 != 0) {
			Static132.anInt2474 -= local89;
			Static276.anInt5528 -= local94;
		}
		if (arg0) {
			Static264.anInt5402 -= local94;
			Static190.anInt3870 -= local89 * 128;
			Static25.anInt6259 -= local89;
			Static145.anInt2656 -= local94;
			Static175.anInt3452 -= local89;
			Static316.anInt6169 -= local94 * 128;
			if (Math.abs(local89) > Static24.anInt454 || Math.abs(local94) > Static240.anInt4832) {
				Static337.method5495();
			}
		} else if (Static81.anInt1498 == 4) {
			Static283.anInt5592 -= local89 * 128;
			Static352.anInt6703 -= local94 * 128;
			Static114.anInt2169 -= local89 * 128;
			Static169.anInt6309 -= local94 * 128;
		} else {
			Static81.anInt1498 = 1;
		}
		Static303.method4306();
		Static178.method2897();
		Static270.aClass16_42.method191();
		Static325.aClass16_14.method191();
		Static44.aClass210_3.method5614();
		Static162.method2587();
	}
}
