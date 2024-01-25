import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	public static int anInt9052;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!hk;")
	public static final Class146 aClass146_12 = new Class146(6, 0, 4, 2);

	@OriginalMember(owner = "client!re", name = "i", descriptor = "[I")
	public static final int[] anIntArray456 = new int[8];

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[B)V")
	public static synchronized void method7934(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static578.anInt6964 < 1000) {
			Static317.aByteArrayArray15[Static578.anInt6964++] = arg0;
		} else if (arg0.length == 5000 && Static298.anInt5417 < 250) {
			Static325.aByteArrayArray13[Static298.anInt5417++] = arg0;
		} else if (arg0.length == 30000 && Static171.anInt3609 < 50) {
			Static511.aByteArrayArray18[Static171.anInt3609++] = arg0;
		} else if (Static59.aByteArrayArrayArray8 != null) {
			for (@Pc(67) int local67 = 0; local67 < Static488.anIntArray441.length; local67++) {
				if (Static488.anIntArray441[local67] == arg0.length && Static59.aByteArrayArrayArray8[local67].length > Static606.anIntArray556[local67]) {
					Static59.aByteArrayArrayArray8[local67][Static606.anIntArray556[local67]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;Lclient!cea;II)Lclient!ot;")
	public static Class268 method7935(@OriginalArg(0) String arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return arg1.method1307(arg0);
		} else if (arg2 == 1) {
			@Pc(34) Class268 local34;
			try {
				Static675.method1327(Static637.anApplet2, new Object[] { (new URL(Static637.anApplet2.getCodeBase(), arg0)).toString() }, "openjs");
				local34 = new Class268();
				local34.anInt8008 = 1;
				return local34;
			} catch (@Pc(40) Throwable local40) {
				local34 = new Class268();
				local34.anInt8008 = 2;
				return local34;
			}
		} else {
			@Pc(76) Class268 local76;
			if (arg2 == 2) {
				try {
					Static637.anApplet2.getAppletContext().showDocument(new URL(Static637.anApplet2.getCodeBase(), arg0), "_blank");
					local76 = new Class268();
					local76.anInt8008 = 1;
					return local76;
				} catch (@Pc(82) Exception local82) {
					local76 = new Class268();
					local76.anInt8008 = 2;
					return local76;
				}
			} else if (arg2 == 3) {
				try {
					Static675.method1325(Static637.anApplet2, "loggedout");
				} catch (@Pc(101) Throwable local101) {
				}
				try {
					Static637.anApplet2.getAppletContext().showDocument(new URL(Static637.anApplet2.getCodeBase(), arg0), "_top");
					local76 = new Class268();
					local76.anInt8008 = 1;
					return local76;
				} catch (@Pc(121) Exception local121) {
					local76 = new Class268();
					local76.anInt8008 = 2;
					return local76;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method7936(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(64) char local64;
			if (local17 == '\u0000') {
				local64 = arg2.charAt(local13++);
			} else {
				local64 = local17;
			}
			@Pc(77) char local77;
			if (local19 == '\u0000') {
				local77 = arg0.charAt(local15++);
			} else {
				local77 = local19;
			}
			local17 = Static605.method9056(local64);
			local19 = Static605.method9056(local77);
			local64 = Static2.method60(local64, arg1);
			local77 = Static2.method60(local77, arg1);
			if (local64 != local77 && Character.toUpperCase(local64) != Character.toUpperCase(local77)) {
				local64 = Character.toLowerCase(local64);
				local77 = Character.toLowerCase(local77);
				if (local77 != local64) {
					return Static477.method7612(arg1, local64) - Static477.method7612(arg1, local77);
				}
			}
		}
		@Pc(143) int local143 = Math.min(local8, local11);
		for (@Pc(145) int local145 = 0; local145 < local143; local145++) {
			if (arg1 == 2) {
				local15 = local11 - local145 - 1;
				local13 = local8 - local145 - 1;
			} else {
				local15 = local145;
				local13 = local145;
			}
			@Pc(173) char local173 = arg2.charAt(local13);
			@Pc(177) char local177 = arg0.charAt(local15);
			if (local173 != local177 && Character.toUpperCase(local173) != Character.toUpperCase(local177)) {
				local173 = Character.toLowerCase(local173);
				local177 = Character.toLowerCase(local177);
				if (local173 != local177) {
					return Static477.method7612(arg1, local173) - Static477.method7612(arg1, local177);
				}
			}
		}
		@Pc(228) int local228 = local8 - local11;
		if (local228 != 0) {
			return local228;
		}
		for (@Pc(237) int local237 = 0; local237 < local143; local237++) {
			@Pc(243) char local243 = arg2.charAt(local237);
			@Pc(247) char local247 = arg0.charAt(local237);
			if (local243 != local247) {
				return Static477.method7612(arg1, local243) - Static477.method7612(arg1, local247);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!lt;FIIIFFFI[BFII)V")
	public static void method7937(@OriginalArg(0) Class225 arg0, @OriginalArg(1) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) int arg5, @OriginalArg(9) byte[] arg6, @OriginalArg(10) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static423.method6953(arg4, local7, arg3, arg7, arg6, arg5, arg2, arg1, arg0);
			arg5 += 16384;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!je;BLclient!nfa;I)V")
	public static void method7938(@OriginalArg(0) Class178 arg0, @OriginalArg(2) Class15_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (Static356.anInt6821 >= 50 || (arg0 == null || arg0.anIntArrayArray18 == null || arg2 >= arg0.anIntArrayArray18.length || arg0.anIntArrayArray18[arg2] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray18[arg2][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(67) int local67;
		if (arg0.anIntArrayArray18[arg2].length > 1) {
			local67 = (int) ((double) arg0.anIntArrayArray18[arg2].length * Math.random());
			if (local67 > 0) {
				local40 = arg0.anIntArrayArray18[arg2][local67];
			}
		}
		local67 = 256;
		if (arg0.anIntArray258 != null && arg0.anIntArray262 != null) {
			local67 = arg0.anIntArray258[arg2] + (int) ((double) (arg0.anIntArray262[arg2] - arg0.anIntArray258[arg2]) * Math.random());
		}
		@Pc(116) int local116 = arg0.anIntArray260 == null ? 255 : arg0.anIntArray260[arg2];
		if (local50 == 0) {
			if (arg1 == Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2) {
				if (arg0.aBoolean383) {
					Static248.method4409(local46, local116, local40, 0, local67, false);
					return;
				}
				Static28.method487(local40, local46, local116, local67, 0);
			}
		} else if (Static230.aClass2_Sub54_15.aClass4_Sub22_4.method7520() != 0) {
			@Pc(164) int local164 = arg1.anInt11022 - 256 >> 9;
			@Pc(171) int local171 = arg1.anInt11024 - 256 >> 9;
			@Pc(191) int local191 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 == arg1 ? 0 : (local164 << 16) + (arg1.aByte142 << 24) + (local171 << 8) + local50;
			Static307.aClass150Array1[Static356.anInt6821++] = new Class150((byte) (arg0.aBoolean383 ? 2 : 1), local40, local46, 0, local116, local191, local67, arg1);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method7939() {
		Static595.aClass101_14.L(Static383.anInt7254, Static230.aClass2_Sub54_15.aClass4_Sub3_1.method498() == 1 ? Static427.anInt7842 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method7941(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static578.anInt6964 > 0) {
			local16 = Static317.aByteArrayArray15[--Static578.anInt6964];
			Static317.aByteArrayArray15[Static578.anInt6964] = null;
			return local16;
		} else if (arg0 == 5000 && Static298.anInt5417 > 0) {
			local16 = Static325.aByteArrayArray13[--Static298.anInt5417];
			Static325.aByteArrayArray13[Static298.anInt5417] = null;
			return local16;
		} else if (arg0 == 30000 && Static171.anInt3609 > 0) {
			local16 = Static511.aByteArrayArray18[--Static171.anInt3609];
			Static511.aByteArrayArray18[Static171.anInt3609] = null;
			return local16;
		} else {
			if (Static59.aByteArrayArrayArray8 != null) {
				for (@Pc(66) int local66 = 0; local66 < Static488.anIntArray441.length; local66++) {
					if (Static488.anIntArray441[local66] == arg0 && Static606.anIntArray556[local66] > 0) {
						@Pc(92) byte[] local92 = Static59.aByteArrayArrayArray8[local66][--Static606.anIntArray556[local66]];
						Static59.aByteArrayArrayArray8[local66][Static606.anIntArray556[local66]] = null;
						return local92;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
