import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "[I")
	public static final int[] anIntArray424 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "[I")
	public static final int[] anIntArray425 = new int[200];

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	public static void method4674() {
		@Pc(1) Class26 local1 = Static59.aClass26_5;
		synchronized (Static59.aClass26_5) {
			Static59.aClass26_5.method333();
		}
		local1 = Static185.aClass26_33;
		synchronized (Static185.aClass26_33) {
			Static185.aClass26_33.method333();
		}
		local1 = Static222.aClass26_43;
		synchronized (Static222.aClass26_43) {
			Static222.aClass26_43.method333();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public static void method4675() {
		Static18.aClass26_2.method328();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
	public static void method4676(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class11 local15 = Static25.aClass58_38.method1008(); local15 != null; local15 = Static25.aClass58_38.method1004()) {
			if ((local15.aLong215 >> 48 & 0xFFFFL) == (long) arg0) {
				local15.method5701();
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	public static void method4678() {
		while (true) {
			@Pc(6) Class11_Sub44 local6 = (Class11_Sub44) Static90.aClass16_38.method180();
			if (local6 == null) {
				return;
			}
			if (Static212.aClass106ArrayArrayArray2 != null) {
				@Pc(22) Class67_Sub3_Sub3 local22;
				@Pc(18) int local18;
				if (local6.anInt6686 >= 0) {
					local18 = local6.anInt6686 - 1;
					local22 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local18];
				} else {
					local18 = -local6.anInt6686 - 1;
					if (Static256.anInt5197 == local18) {
						local22 = Static156.aClass67_Sub3_Sub3_Sub2_2;
					} else {
						local22 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local18];
					}
				}
				if (local22 != null) {
					@Pc(52) Class84 local52 = Static108.method1650(local6.anInt6685);
					@Pc(63) int local63;
					@Pc(66) int local66;
					if (local6.anInt6671 == 1 || local6.anInt6671 == 3) {
						local63 = local52.anInt2035;
						local66 = local52.anInt1988;
					} else {
						local63 = local52.anInt1988;
						local66 = local52.anInt2035;
					}
					@Pc(81) int local81 = local6.anInt6687 + (local63 >> 1);
					@Pc(90) int local90 = (local63 + 1 >> 1) + local6.anInt6687;
					@Pc(97) int local97 = (local66 >> 1) + local6.anInt6682;
					@Pc(106) int local106 = (local66 + 1 >> 1) + local6.anInt6682;
					@Pc(111) Class77 local111 = Static108.aClass77Array2[local22.aByte73];
					@Pc(135) int local135 = local111.method4122(local81, local97) + local111.method4122(local90, local97) + local111.method4122(local81, local106) + local111.method4122(local90, local106) >> 2;
					@Pc(137) Interface7 local137 = null;
					@Pc(142) int local142 = Static174.anIntArray225[local6.anInt6672];
					if (local142 == 0) {
						local137 = (Interface7) Static3.method15(local22.aByte73, local6.anInt6687, local6.anInt6682);
					} else if (local142 == 1) {
						local137 = (Interface7) Static74.method1139(local22.aByte73, local6.anInt6687, local6.anInt6682);
					} else if (local142 == 2) {
						local137 = (Interface7) Static284.method4725(local22.aByte73, local6.anInt6687, local6.anInt6682, sc.class);
					} else if (local142 == 3) {
						local137 = (Interface7) Static136.method5506(local22.aByte73, local6.anInt6687, local6.anInt6682);
					}
					if (local137 != null) {
						Static185.method3207(-1, local6.anInt6684 + 1, local142, local6.anInt6677, 0, local6.anInt6687, local22.aByte73, local6.anInt6682, 0);
						local22.anInt5064 = local6.anInt6682 * 128 + local66 * 64;
						local22.anInt5073 = local135;
						local22.anInt5067 = Static293.anInt5807 + local6.anInt6677;
						local22.anInt5068 = local6.anInt6687 * 128 + local63 * 64;
						local22.anInterface7_3 = local137;
						local22.anInt5066 = Static293.anInt5807 + local6.anInt6684;
						@Pc(270) int local270 = local6.anInt6679;
						@Pc(273) int local273 = local6.anInt6688;
						@Pc(276) int local276 = local6.anInt6678;
						@Pc(285) int local285;
						if (local273 < local270) {
							local285 = local270;
							local270 = local273;
							local273 = local285;
						}
						@Pc(292) int local292 = local6.anInt6683;
						if (local276 > local292) {
							local285 = local276;
							local276 = local292;
							local292 = local285;
						}
						local22.anInt5065 = local273 + local6.anInt6687;
						local22.anInt5069 = local6.anInt6687 + local270;
						local22.anInt5062 = local292 + local6.anInt6682;
						local22.anInt5072 = local6.anInt6682 + local276;
					}
				}
			}
		}
	}
}
