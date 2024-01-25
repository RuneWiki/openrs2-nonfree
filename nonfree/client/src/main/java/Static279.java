import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!us;")
	public static final Class234 aClass234_119 = new Class234(73, -1);

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_89 = new Class57("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "F")
	public static float aFloat67 = 1024.0F;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_90 = new Class57("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBII)I")
	public static int method5259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		@Pc(31) int local31 = 255 - arg1;
		return local26 + (((arg0 & 0xFF00) * local31 & 0xFF0000 | (arg0 & 0xFF00FF) * local31 & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	public static void method5260(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub7_Sub8 local10 = Static275.method4307(6, arg0);
		local10.method3217();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZBIZ)V")
	public static void method5262(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && Static1.anInt10 == arg0 && arg2 == Static336.anInt2336 && (Static363.anInt6170 == Static24.anInt332 || Static164.aClass154_Sub1_1.method5400(Static2.anInt68))) {
			return;
		}
		Static1.anInt10 = arg0;
		Static24.anInt332 = Static363.anInt6170;
		Static336.anInt2336 = arg2;
		if (Static164.aClass154_Sub1_1.method5400(Static2.anInt68)) {
			Static24.anInt332 = 0;
		}
		if (arg1) {
			Static310.method4763(28);
		} else {
			Static310.method4763(25);
		}
		Static289.method4519(Static140.aClass150_3, Static28.aClass57_13.method1122(Static66.anInt1307), true);
		@Pc(63) int local63 = Static21.anInt265;
		Static21.anInt265 = (Static1.anInt10 - (Static12.anInt161 >> 4)) * 8;
		@Pc(74) int local74 = Static103.anInt2044;
		Static103.anInt2044 = (Static336.anInt2336 - (Static44.anInt787 >> 4)) * 8;
		Static281.aClass3_Sub7_Sub16_3 = Static42.method460(Static1.anInt10 * 8, Static336.anInt2336 * 8);
		Static384.aClass169_3 = null;
		@Pc(98) int local98 = Static21.anInt265 - local63;
		@Pc(103) int local103 = Static103.anInt2044 - local74;
		@Pc(107) int local107;
		@Pc(117) int local117;
		if (arg1) {
			Static23.anInt305 = 0;
			local107 = (Static12.anInt161 - 1) * 128;
			@Pc(177) int local177 = Static44.anInt787 * 128 - 128;
			for (local117 = 0; local117 < 32768; local117++) {
				@Pc(185) Class28_Sub1_Sub1_Sub1 local185 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local117];
				if (local185 != null) {
					local185.anInt5766 -= local103 * 128;
					local185.anInt5774 -= local98 * 128;
					if (local185.anInt5774 >= 0 && local185.anInt5774 <= local107 && local185.anInt5766 >= 0 && local177 >= local185.anInt5766) {
						@Pc(242) boolean local242 = true;
						for (@Pc(244) int local244 = 0; local244 < 10; local244++) {
							local185.anIntArray491[local244] -= local98;
							local185.anIntArray490[local244] -= local103;
							if (local185.anIntArray491[local244] < 0 || Static12.anInt161 <= local185.anIntArray491[local244] || local185.anIntArray490[local244] < 0 || Static44.anInt787 <= local185.anIntArray490[local244]) {
								local242 = false;
							}
						}
						if (local242) {
							Static369.anIntArray664[Static23.anInt305++] = local117;
						} else {
							Static166.aClass28_Sub1_Sub1_Sub1Array41[local117].method2967(null);
							Static166.aClass28_Sub1_Sub1_Sub1Array41[local117] = null;
						}
					} else {
						Static166.aClass28_Sub1_Sub1_Sub1Array41[local117].method2967(null);
						Static166.aClass28_Sub1_Sub1_Sub1Array41[local117] = null;
					}
				}
			}
		} else {
			for (local107 = 0; local107 < 32768; local107++) {
				@Pc(113) Class28_Sub1_Sub1_Sub1 local113 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local107];
				if (local113 != null) {
					for (local117 = 0; local117 < 10; local117++) {
						local113.anIntArray491[local117] -= local98;
						local113.anIntArray490[local117] -= local103;
					}
					local113.anInt5766 -= local103 * 128;
					local113.anInt5774 -= local98 * 128;
				}
			}
		}
		for (local107 = 0; local107 < 2048; local107++) {
			@Pc(336) Class28_Sub1_Sub1_Sub2 local336 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local107];
			if (local336 != null) {
				for (local117 = 0; local117 < 10; local117++) {
					local336.anIntArray491[local117] -= local98;
					local336.anIntArray490[local117] -= local103;
				}
				local336.anInt5774 -= local98 * 128;
				local336.anInt5766 -= local103 * 128;
			}
		}
		Static108.method1775(local103, local98);
		for (@Pc(393) Class3_Sub36 local393 = (Class3_Sub36) Static230.aClass138_34.method3051(); local393 != null; local393 = (Class3_Sub36) Static230.aClass138_34.method3050()) {
			local393.anInt5110 -= local103;
			local393.anInt5104 -= local98;
			if (local393.anInt5104 < 0 || local393.anInt5110 < 0 || Static12.anInt161 <= local393.anInt5104 || Static44.anInt787 <= local393.anInt5110) {
				local393.method5700();
			}
		}
		if (Static361.anInt6050 != 0) {
			Static109.anInt2145 -= local103;
			Static361.anInt6050 -= local98;
		}
		Static117.anInt2227 = 0;
		if (arg1) {
			Static37.anInt658 -= local98;
			Static210.anInt3709 -= local98;
			Static339.anInt5726 -= local103 * 128;
			Static206.anInt3639 -= local98 * 128;
			Static241.anInt4238 -= local103;
			Static258.anInt4650 -= local103;
			if (Math.abs(local98) > Static12.anInt161 || Math.abs(local103) > Static44.anInt787) {
				Static347.method5256();
			}
		} else if (Static88.anInt1815 == 4) {
			Static76.anInt1623 -= local98 * 128;
			Static71.anInt1429 -= local98 * 128;
			Static104.anInt2066 -= local103 * 128;
			Static268.anInt4726 -= local103 * 128;
		} else {
			Static88.anInt1815 = 1;
		}
		Static27.method329();
		Static239.method5187();
		Static93.aClass138_10.method3046();
		Static182.aClass138_22.method3046();
		Static11.aClass22_8.method289();
		Static82.method1363();
	}
}
