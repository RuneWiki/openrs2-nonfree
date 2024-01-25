import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ms", name = "A", descriptor = "Lclient!rr;")
	public static Class222 aClass222_1;

	@OriginalMember(owner = "client!ms", name = "K", descriptor = "Lclient!pf;")
	public static Class199 aClass199_1;

	@OriginalMember(owner = "client!ms", name = "D", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_77 = new Class231("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
	public static int anInt4369 = 0;

	@OriginalMember(owner = "client!ms", name = "L", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_71 = new Class186(15, 8);

	@OriginalMember(owner = "client!ms", name = "M", descriptor = "I")
	public static int anInt4370 = -1;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIB)V")
	public static void method3940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static122.anInt2160 == 1) {
			Static131.method2145(Static80.aClass6_Sub33_1, arg0, arg1);
		} else if (Static122.anInt2160 == 2) {
			Static419.method5689(arg0, arg1);
		}
		Static80.aClass6_Sub33_1 = null;
		Static122.anInt2160 = 0;
	}

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "(I)I")
	public static int method3941() {
		try {
			if (Static400.anInt6607 == 0) {
				if (Static260.aLong141 > Static154.method2527() - 5000L) {
					return 0;
				}
				Static408.aClass249_8 = Static165.aClass103_3.method2378(Static53.aString9, Static172.anInt3043);
				Static14.aLong12 = Static154.method2527();
				Static400.anInt6607 = 1;
			}
			if (Static154.method2527() > Static14.aLong12 + 30000L) {
				return Static355.method5005(1000);
			}
			@Pc(76) int local76;
			@Pc(106) int local106;
			if (Static400.anInt6607 == 1) {
				if (Static408.aClass249_8.anInt6929 == 2) {
					return Static355.method5005(1001);
				}
				if (Static408.aClass249_8.anInt6929 != 1) {
					return -1;
				}
				Static103.aClass30_1 = new Class30((Socket) Static408.aClass249_8.anObject10, Static165.aClass103_3);
				Static408.aClass249_8 = null;
				local76 = 0;
				if (Static301.aBoolean200) {
					local76 = Static16.anInt282;
				}
				Static449.aClass6_Sub15_Sub1_2.anInt3487 = 0;
				Static449.aClass6_Sub15_Sub1_2.method3075(Static289.aClass20_9.anInt414);
				Static449.aClass6_Sub15_Sub1_2.method3107(local76);
				Static103.aClass30_1.method733(Static449.aClass6_Sub15_Sub1_2.aByteArray51, Static449.aClass6_Sub15_Sub1_2.anInt3487);
				Static124.method3215();
				local106 = Static103.aClass30_1.method738();
				Static124.method3215();
				if (local106 != 0) {
					return Static355.method5005(local106);
				}
				Static400.anInt6607 = 2;
			}
			if (Static400.anInt6607 == 2) {
				if (Static103.aClass30_1.method735() < 2) {
					return -1;
				}
				Static26.anInt2327 = Static103.aClass30_1.method738();
				Static26.anInt2327 <<= 0x8;
				Static26.anInt2327 += Static103.aClass30_1.method738();
				Static400.anInt6607 = 3;
				Static57.aByteArray16 = new byte[Static26.anInt2327];
				Static347.anInt5814 = 0;
			}
			if (Static400.anInt6607 != 3) {
				return -1;
			}
			local76 = Static103.aClass30_1.method735();
			if (local76 < 1) {
				return -1;
			}
			if (local76 > Static26.anInt2327 - Static347.anInt5814) {
				local76 = Static26.anInt2327 - Static347.anInt5814;
			}
			Static103.aClass30_1.method734(Static347.anInt5814, Static57.aByteArray16, local76);
			Static347.anInt5814 += local76;
			if (Static26.anInt2327 > Static347.anInt5814) {
				return -1;
			} else if (Static195.method3060(Static57.aByteArray16)) {
				Static148.aClass184_Sub1Array1 = new Class184_Sub1[Static200.anInt3522];
				local106 = 0;
				for (@Pc(205) int local205 = Static201.anInt3536; local205 <= Static266.anInt4578; local205++) {
					@Pc(211) Class184_Sub1 local211 = Static243.method3753(local205);
					if (local211 != null) {
						Static148.aClass184_Sub1Array1[local106++] = local211;
					}
				}
				Static141.aClass6_Sub22_1 = null;
				Static311.anInt5063 = 0;
				Static103.aClass30_1.method741();
				Static57.aByteArray16 = null;
				Static103.aClass30_1 = null;
				Static400.anInt6607 = 0;
				Static188.anInt3289 = 0;
				Static260.aLong141 = Static154.method2527();
				return 0;
			} else {
				return Static355.method5005(1002);
			}
		} catch (@Pc(243) IOException local243) {
			return Static355.method5005(1003);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!wg;I)V")
	public static void method3942(@OriginalArg(0) Class6_Sub5 arg0) {
		if (arg0.aClass6_Sub4_5 != null) {
			arg0.aClass6_Sub4_5.anInt2441 = 0;
		}
		arg0.aBoolean478 = false;
		for (@Pc(23) Class6_Sub5 local23 = arg0.method5729(); local23 != null; local23 = arg0.method5732()) {
			method3942(local23);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
	public static void method3943() {
		Static261.aClass12_13 = null;
		Static56.aClass12_1 = null;
		Static141.aClass12_4 = null;
		Static327.aClass12_15 = null;
		Static158.aClass12_9 = null;
		Static348.aClass12_16 = null;
		Static148.aClass12_8 = null;
		Static321.aClass12_14 = null;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I[BIIBLjava/lang/String;)I")
	public static int method3944(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(25) char local25 = arg3.charAt(local12);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg0[arg1 + local12] = (byte) local25;
			} else if (local25 == '€') {
				arg0[arg1 + local12] = -128;
			} else if (local25 == '‚') {
				arg0[arg1 + local12] = -126;
			} else if (local25 == 'ƒ') {
				arg0[local12 + arg1] = -125;
			} else if (local25 == '„') {
				arg0[arg1 + local12] = -124;
			} else if (local25 == '…') {
				arg0[arg1 + local12] = -123;
			} else if (local25 == '†') {
				arg0[arg1 + local12] = -122;
			} else if (local25 == '‡') {
				arg0[arg1 + local12] = -121;
			} else if (local25 == 'ˆ') {
				arg0[local12 + arg1] = -120;
			} else if (local25 == '‰') {
				arg0[arg1 + local12] = -119;
			} else if (local25 == 'Š') {
				arg0[local12 + arg1] = -118;
			} else if (local25 == '‹') {
				arg0[arg1 + local12] = -117;
			} else if (local25 == 'Œ') {
				arg0[local12 + arg1] = -116;
			} else if (local25 == 'Ž') {
				arg0[arg1 + local12] = -114;
			} else if (local25 == '‘') {
				arg0[arg1 + local12] = -111;
			} else if (local25 == '’') {
				arg0[local12 + arg1] = -110;
			} else if (local25 == '“') {
				arg0[arg1 + local12] = -109;
			} else if (local25 == '”') {
				arg0[arg1 + local12] = -108;
			} else if (local25 == '•') {
				arg0[arg1 + local12] = -107;
			} else if (local25 == '–') {
				arg0[arg1 + local12] = -106;
			} else if (local25 == '—') {
				arg0[arg1 + local12] = -105;
			} else if (local25 == '˜') {
				arg0[local12 + arg1] = -104;
			} else if (local25 == '™') {
				arg0[arg1 + local12] = -103;
			} else if (local25 == 'š') {
				arg0[arg1 + local12] = -102;
			} else if (local25 == '›') {
				arg0[local12 + arg1] = -101;
			} else if (local25 == 'œ') {
				arg0[arg1 + local12] = -100;
			} else if (local25 == 'ž') {
				arg0[arg1 + local12] = -98;
			} else if (local25 == 'Ÿ') {
				arg0[local12 + arg1] = -97;
			} else {
				arg0[local12 + arg1] = 63;
			}
		}
		return local10;
	}
}
