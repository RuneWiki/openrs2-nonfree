import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
	public static int anInt6317;

	@OriginalMember(owner = "client!rl", name = "B", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_205 = new Class175("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!rl", name = "E", descriptor = "Lclient!jd;")
	public static final Class119 aClass119_16 = new Class119(14, 0, 4, 1);

	@OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
	public static int anInt6318 = -1;

	@OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
	public static int anInt6319 = 0;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
	public static void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass1_Sub2_1 != null) {
			local7.aClass1_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
	public static void method4974() {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			Static310.aBooleanArray23[local1] = false;
		}
		Static447.anInt7550 = -1;
		Static419.anInt7236 = 0;
		Static339.anInt6222 = Static430.anInt7326;
		Static433.anInt7353 = Static141.anInt3177;
		Static4.anInt816 = Static80.anInt1722;
		Static400.anInt6964 = 0;
		Static414.anInt7168 = Static398.anInt6901;
		Static335.anInt6175 = Static290.anInt5325;
		Static422.anInt7280 = Static422.anInt7281;
		Static107.anInt2382 = 5;
		Static70.anInt1610 = -1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBI)Lclient!eo;")
	public static Class68 method4975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class68 local7 = Static321.method4661(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass68Array2 == null || local7.aClass68Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass68Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!bt;ILclient!hs;)V")
	public static void method4976(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class103 arg2) {
		@Pc(12) Class3_Sub7 local12 = new Class3_Sub7();
		local12.anInt837 = arg0.method6053();
		local12.anInt836 = arg0.method6014();
		local12.anIntArray60 = new int[local12.anInt837];
		local12.anIntArray61 = new int[local12.anInt837];
		local12.anIntArray59 = new int[local12.anInt837];
		local12.aClass190Array1 = new Class190[local12.anInt837];
		local12.aByteArrayArrayArray13 = new byte[local12.anInt837][][];
		local12.aClass190Array2 = new Class190[local12.anInt837];
		for (@Pc(54) int local54 = 0; local54 < local12.anInt837; local54++) {
			try {
				@Pc(59) int local59 = arg0.method6053();
				@Pc(81) String local81;
				@Pc(85) String local85;
				@Pc(89) int local89;
				if (local59 == 0 || local59 == 1 || local59 == 2) {
					local81 = arg0.method6027();
					local85 = arg0.method6027();
					local89 = 0;
					if (local59 == 1) {
						local89 = arg0.method6014();
					}
					local12.anIntArray59[local54] = local59;
					local12.anIntArray60[local54] = local89;
					local12.aClass190Array2[local54] = arg2.method2820(local85, Static43.method939(local81));
				} else if (local59 == 3 || local59 == 4) {
					local81 = arg0.method6027();
					local85 = arg0.method6027();
					local89 = arg0.method6053();
					@Pc(92) String[] local92 = new String[local89];
					for (@Pc(94) int local94 = 0; local94 < local89; local94++) {
						local92[local94] = arg0.method6027();
					}
					@Pc(114) byte[][] local114 = new byte[local89][];
					@Pc(124) int local124;
					if (local59 == 3) {
						for (@Pc(119) int local119 = 0; local119 < local89; local119++) {
							local124 = arg0.method6014();
							local114[local119] = new byte[local124];
							arg0.method6032(local114[local119], local124);
						}
					}
					local12.anIntArray59[local54] = local59;
					@Pc(153) Class[] local153 = new Class[local89];
					for (local124 = 0; local124 < local89; local124++) {
						local153[local124] = Static43.method939(local92[local124]);
					}
					local12.aClass190Array1[local54] = arg2.method2825(local85, local153, Static43.method939(local81));
					local12.aByteArrayArrayArray13[local54] = local114;
				}
			} catch (@Pc(234) ClassNotFoundException local234) {
				local12.anIntArray61[local54] = -1;
			} catch (@Pc(241) SecurityException local241) {
				local12.anIntArray61[local54] = -2;
			} catch (@Pc(248) NullPointerException local248) {
				local12.anIntArray61[local54] = -3;
			} catch (@Pc(255) Exception local255) {
				local12.anIntArray61[local54] = -4;
			} catch (@Pc(262) Throwable local262) {
				local12.anIntArray61[local54] = -5;
			}
		}
		Static137.aClass229_23.method5321(local12);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V")
	public static void method4978() {
		for (@Pc(12) Class3_Sub15 local12 = (Class3_Sub15) Static342.aClass229_39.method5328(); local12 != null; local12 = (Class3_Sub15) Static342.aClass229_39.method5325()) {
			if (local12.anInt2021 > 0) {
				local12.anInt2021--;
			}
			if (local12.anInt2021 != 0) {
				if (local12.anInt2016 > 0) {
					local12.anInt2016--;
				}
				if (local12.anInt2016 == 0 && local12.anInt2022 >= 1 && local12.anInt2014 >= 1 && Static399.anInt6923 - 2 >= local12.anInt2022 && local12.anInt2014 <= Static127.anInt2696 - 2 && (local12.anInt2015 < 0 || Static376.method5792(local12.anInt2015, local12.anInt2018))) {
					Static154.method2722(local12.anInt2020, local12.anInt2011, local12.anInt2014, local12.anInt2010, local12.anInt2015, local12.anInt2022, local12.anInt2018, -1);
					local12.anInt2016 = -1;
					if (local12.anInt2012 == local12.anInt2015 && local12.anInt2012 == -1) {
						local12.method5987();
					} else if (local12.anInt2012 == local12.anInt2015 && local12.anInt2023 == local12.anInt2011 && local12.anInt2013 == local12.anInt2018) {
						local12.method5987();
					}
				}
			} else if (local12.anInt2012 < 0 || Static376.method5792(local12.anInt2012, local12.anInt2013)) {
				Static154.method2722(local12.anInt2020, local12.anInt2023, local12.anInt2014, local12.anInt2010, local12.anInt2012, local12.anInt2022, local12.anInt2013, -1);
				local12.method5987();
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIB)I")
	public static int method4979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13 = 255 - arg0;
		@Pc(31) int local31 = (arg0 * (arg2 & 0xFF00) & 0xFF0000 | arg0 * (arg2 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return (((arg1 & 0xFF00FF) * local13 & 0xFF00FF00 | (arg1 & 0xFF00) * local13 & 0xFF0000) >>> 8) + local31;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(IBI)I")
	public static int method4980(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static359.anIntArray464[arg1 & 0x3] : 256;
	}
}
