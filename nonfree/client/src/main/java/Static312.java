import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!jn", name = "H", descriptor = "I")
	public static int anInt5545;

	@OriginalMember(owner = "client!jn", name = "D", descriptor = "[Lclient!bka;")
	public static Class9[] aClass9Array20;

	@OriginalMember(owner = "client!jn", name = "I", descriptor = "Z")
	public static boolean aBoolean458 = false;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method4703(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = arg0.length();
		@Pc(17) byte[] local17 = new byte[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				local17[local19] = (byte) local25;
			} else if (local25 == '€') {
				local17[local19] = -128;
			} else if (local25 == '‚') {
				local17[local19] = -126;
			} else if (local25 == 'ƒ') {
				local17[local19] = -125;
			} else if (local25 == '„') {
				local17[local19] = -124;
			} else if (local25 == '…') {
				local17[local19] = -123;
			} else if (local25 == '†') {
				local17[local19] = -122;
			} else if (local25 == '‡') {
				local17[local19] = -121;
			} else if (local25 == 'ˆ') {
				local17[local19] = -120;
			} else if (local25 == '‰') {
				local17[local19] = -119;
			} else if (local25 == 'Š') {
				local17[local19] = -118;
			} else if (local25 == '‹') {
				local17[local19] = -117;
			} else if (local25 == 'Œ') {
				local17[local19] = -116;
			} else if (local25 == 'Ž') {
				local17[local19] = -114;
			} else if (local25 == '‘') {
				local17[local19] = -111;
			} else if (local25 == '’') {
				local17[local19] = -110;
			} else if (local25 == '“') {
				local17[local19] = -109;
			} else if (local25 == '”') {
				local17[local19] = -108;
			} else if (local25 == '•') {
				local17[local19] = -107;
			} else if (local25 == '–') {
				local17[local19] = -106;
			} else if (local25 == '—') {
				local17[local19] = -105;
			} else if (local25 == '˜') {
				local17[local19] = -104;
			} else if (local25 == '™') {
				local17[local19] = -103;
			} else if (local25 == 'š') {
				local17[local19] = -102;
			} else if (local25 == '›') {
				local17[local19] = -101;
			} else if (local25 == 'œ') {
				local17[local19] = -100;
			} else if (local25 == 'ž') {
				local17[local19] = -98;
			} else if (local25 == 'Ÿ') {
				local17[local19] = -97;
			} else {
				local17[local19] = 63;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZ)V")
	public static void method4705(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static633.anInt3426 != -1) {
				Static47.method637(Static633.anInt3426);
			}
			for (@Pc(19) Class3_Sub52 local19 = (Class3_Sub52) Static170.aClass136_19.method3509(); local19 != null; local19 = (Class3_Sub52) Static170.aClass136_19.method3506()) {
				if (!local19.method9443()) {
					local19 = (Class3_Sub52) Static170.aClass136_19.method3509();
					if (local19 == null) {
						break;
					}
				}
				Static65.method813(true, false, local19);
			}
			Static633.anInt3426 = -1;
			Static170.aClass136_19 = new Class136(8);
			Static300.method4615();
			Static633.anInt3426 = Static224.aClass84_1.anInt2473;
			Static401.method6009(false);
			Static693.method9085();
			Static185.method2812(Static633.anInt3426);
		}
		Static387.method5835();
		Static284.aBoolean447 = false;
		Static129.method2160();
		Static355.anInt6021 = -1;
		Static470.method6953(Static396.anInt7100);
		Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 = new Class19_Sub1_Sub3_Sub2_Sub2();
		Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anIntArray430[0] = Static362.anInt8653 / 2;
		Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 = Static362.anInt8653 * 512 / 2;
		Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211 = Static206.anInt11291 * 512 / 2;
		Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.lb[0] = Static206.anInt11291 / 2;
		Static235.anInt4471 = 0;
		Static173.anInt3144 = 0;
		if (Static175.anInt10579 == 2) {
			Static173.anInt3144 = Static161.anInt2963 << 9;
			Static235.anInt4471 = Static393.anInt7056 << 9;
		} else {
			Static460.method6827();
		}
		Static538.method6234();
	}
}
