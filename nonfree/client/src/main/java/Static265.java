import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Lclient!vl;")
	public static Interface11 anInterface11_7;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	public static int anInt4551;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	public static int anInt4552;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "Z")
	public static boolean aBoolean327 = false;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_70 = new Class25(43, 3);

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_83 = new Class231("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_74 = new Class186(19, 6);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4063(@OriginalArg(0) String arg0) {
		return Static163.method2663(arg0, 10);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ia;II)Z")
	public static boolean method4064(@OriginalArg(0) Class6_Sub15_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method2604(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(98) int local98;
		@Pc(102) int local102;
		@Pc(108) int local108;
		if (local8 == 0) {
			if (arg0.method2604(1) != 0) {
				method4064(arg0, arg1);
			}
			local25 = arg0.method2604(6);
			local30 = arg0.method2604(6);
			@Pc(42) boolean local42 = arg0.method2604(1) == 1;
			if (local42) {
				Static56.anIntArray98[Static7.anInt156++] = arg1;
			}
			if (Static355.aClass3_Sub3_Sub6_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(65) Class2 local65 = Static337.aClass2Array1[arg1];
			@Pc(73) Class3_Sub3_Sub6_Sub1 local73 = Static355.aClass3_Sub3_Sub6_Sub1Array1[arg1] = new Class3_Sub3_Sub6_Sub1();
			local73.anInt6731 = arg1;
			if (Static362.aClass6_Sub15Array1[arg1] != null) {
				local73.method4694(Static362.aClass6_Sub15Array1[arg1]);
			}
			local73.method5522(local65.anInt7);
			local73.anInt6690 = local65.anInt6;
			local98 = local65.anInt5;
			local102 = local98 >> 28;
			local108 = local98 >> 14 & 0xFF;
			@Pc(112) int local112 = local98 & 0xFF;
			local73.aBoolean377 = local65.aBoolean1;
			local73.aByteArray86[0] = Static49.aByteArray15[arg1];
			local73.aByte93 = (byte) local102;
			local73.method4691((local112 << 6) + local30 - Static99.anInt1814, -Static206.anInt3592 + (local108 << 6) + local25);
			local73.aBoolean378 = false;
			Static337.aClass2Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local25 = arg0.method2604(2);
			local30 = Static337.aClass2Array1[arg1].anInt5;
			Static337.aClass2Array1[arg1].anInt5 = (local30 & 0xFFFFFFF) + (((local30 >> 28) + local25 & 0x3) << 28);
			return false;
		} else {
			@Pc(208) int local208;
			@Pc(213) int local213;
			@Pc(221) int local221;
			if (local8 != 2) {
				local25 = arg0.method2604(18);
				local30 = local25 >> 16;
				local208 = local25 >> 8 & 0xFF;
				local213 = local25 & 0xFF;
				local221 = Static337.aClass2Array1[arg1].anInt5;
				local98 = (local221 >> 28) + local30 & 0x3;
				local102 = local208 + (local221 >> 14) & 0xFF;
				local108 = local221 + local213 & 0xFF;
				Static337.aClass2Array1[arg1].anInt5 = (local98 << 28) - (-(local102 << 14) - local108);
				return false;
			}
			local25 = arg0.method2604(5);
			local30 = local25 >> 3;
			local208 = local25 & 0x7;
			local213 = Static337.aClass2Array1[arg1].anInt5;
			local221 = local30 + (local213 >> 28) & 0x3;
			local98 = local213 >> 14 & 0xFF;
			local102 = local213 & 0xFF;
			if (local208 == 0) {
				local98--;
				local102--;
			}
			if (local208 == 1) {
				local102--;
			}
			if (local208 == 2) {
				local98++;
				local102--;
			}
			if (local208 == 3) {
				local98--;
			}
			if (local208 == 4) {
				local98++;
			}
			if (local208 == 5) {
				local98--;
				local102++;
			}
			if (local208 == 6) {
				local102++;
			}
			if (local208 == 7) {
				local98++;
				local102++;
			}
			Static337.aClass2Array1[arg1].anInt5 = local102 + (local221 << 28) + (local98 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public static void method4065(@OriginalArg(1) int arg0) {
		@Pc(1) Class6_Sub1_Sub8 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class84 local8 = Static93.aClass84Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static364.anInt6134; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static401.anInt6621; local15++) {
						local1 = local8.method5331(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static301.anInt2759;
							@Pc(32) int local32 = local12 << Static301.anInt2759;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class84 local41 = Static93.aClass84Array1[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method5322(local15, local12) - local41.method5322(local15, local12);
									@Pc(67) int local67 = local8.method5322(local15 + 1, local12) - local41.method5322(local15 + 1, local12);
									@Pc(85) int local85 = local8.method5322(local15 + 1, local12 + 1) - local41.method5322(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method5322(local15, local12 + 1) - local41.method5322(local15, local12 + 1);
									local41.method5321(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	public static void method4067() {
		if (Static315.aClass207_5 != Static449.aClass207_11) {
			try {
				Static453.method333(Static160.aClient1, "tbrefresh");
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}
}
