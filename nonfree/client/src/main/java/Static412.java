import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "[F")
	public static float[] aFloatArray52;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "[F")
	public static float[] aFloatArray53;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
	private static int anInt7046;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "[Lclient!fia;")
	public static Class110[] aClass110Array1;

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "[I")
	public static int[] anIntArray559;

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "[F")
	public static float[] aFloatArray54;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "[F")
	public static float[] aFloatArray55;

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "[Lclient!md;")
	public static Class222[] aClass222Array1;

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "[F")
	public static float[] aFloatArray56;

	@OriginalMember(owner = "client!oo", name = "w", descriptor = "[F")
	public static float[] aFloatArray57;

	@OriginalMember(owner = "client!oo", name = "y", descriptor = "[I")
	public static int[] anIntArray560;

	@OriginalMember(owner = "client!oo", name = "z", descriptor = "[I")
	public static int[] anIntArray561;

	@OriginalMember(owner = "client!oo", name = "A", descriptor = "I")
	public static int anInt7052;

	@OriginalMember(owner = "client!oo", name = "B", descriptor = "I")
	public static int anInt7053;

	@OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
	private static int anInt7055;

	@OriginalMember(owner = "client!oo", name = "F", descriptor = "[F")
	public static float[] aFloatArray58;

	@OriginalMember(owner = "client!oo", name = "G", descriptor = "[B")
	private static byte[] aByteArray56;

	@OriginalMember(owner = "client!oo", name = "H", descriptor = "[Z")
	public static boolean[] aBooleanArray43;

	@OriginalMember(owner = "client!oo", name = "I", descriptor = "[Lclient!dda;")
	public static Class70[] aClass70Array1;

	@OriginalMember(owner = "client!oo", name = "K", descriptor = "[Lclient!rp;")
	public static Class307[] aClass307Array1;

	@OriginalMember(owner = "client!oo", name = "J", descriptor = "Z")
	private static boolean aBoolean587 = false;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!wu;I)Lclient!oo;")
	public static Class5_Sub38 method6277(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1) {
		if (method6283(arg0)) {
			@Pc(14) byte[] local14 = arg0.method8893(arg1);
			return local14 == null ? null : new Class5_Sub38(local14);
		} else {
			arg0.method8883(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)F")
	public static float method6278(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)I")
	public static int method6279(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt7055) {
			local8 = 8 - anInt7055;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray56[anInt7046] >> anInt7055 & local14) << local3;
			anInt7055 = 0;
			anInt7046++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray56[anInt7046] >> anInt7055 & local8) << local3;
			anInt7055 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "()I")
	public static int method6280() {
		@Pc(7) int local7 = aByteArray56[anInt7046] >> anInt7055 & 0x1;
		anInt7055++;
		anInt7046 += anInt7055 >> 3;
		anInt7055 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!wu;)Z")
	private static boolean method6283(@OriginalArg(0) Class384 arg0) {
		if (!aBoolean587) {
			@Pc(7) byte[] local7 = arg0.method8885(0, 0);
			if (local7 == null) {
				return false;
			}
			method6287(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!wu;II)Lclient!oo;")
	public static Class5_Sub38 method6285(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method6283(arg0)) {
			@Pc(16) byte[] local16 = arg0.method8885(arg1, arg2);
			return local16 == null ? null : new Class5_Sub38(local16);
		} else {
			arg0.method8878(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "([BI)V")
	public static void method6286(@OriginalArg(0) byte[] arg0) {
		aByteArray56 = arg0;
		anInt7046 = 0;
		anInt7055 = 0;
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "([B)V")
	private static void method6287(@OriginalArg(0) byte[] arg0) {
		method6286(arg0);
		anInt7052 = 0x1 << method6279(4);
		anInt7053 = 0x1 << method6279(4);
		aFloatArray56 = new float[anInt7053];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt7052 : anInt7053;
			local28 = local24 >> 1;
			local32 = local24 >> 2;
			local36 = local24 >> 3;
			@Pc(39) float[] local39 = new float[local28];
			for (local41 = 0; local41 < local32; local41++) {
				local39[local41 * 2] = (float) Math.cos((double) (local41 * 4) * 3.141592653589793D / (double) local24);
				local39[local41 * 2 + 1] = -((float) Math.sin((double) (local41 * 4) * 3.141592653589793D / (double) local24));
			}
			@Pc(84) float[] local84 = new float[local28];
			for (local86 = 0; local86 < local32; local86++) {
				local84[local86 * 2] = (float) Math.cos((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
				local84[local86 * 2 + 1] = (float) Math.sin((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
			}
			@Pc(136) float[] local136 = new float[local32];
			for (local138 = 0; local138 < local36; local138++) {
				local136[local138 * 2] = (float) Math.cos((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24);
				local136[local138 * 2 + 1] = -((float) Math.sin((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24));
			}
			@Pc(185) int[] local185 = new int[local36];
			local191 = Static407.method6237(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static143.method4225(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray52 = local39;
				aFloatArray55 = local84;
				aFloatArray54 = local136;
				anIntArray560 = local185;
			} else {
				aFloatArray57 = local39;
				aFloatArray58 = local84;
				aFloatArray53 = local136;
				anIntArray559 = local185;
			}
		}
		local24 = method6279(8) + 1;
		aClass307Array1 = new Class307[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass307Array1[local28] = new Class307();
		}
		local32 = method6279(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method6279(16);
		}
		@Pc(269) int local269 = method6279(6) + 1;
		aClass70Array1 = new Class70[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass70Array1[local41] = new Class70();
		}
		@Pc(290) int local290 = method6279(6) + 1;
		aClass110Array1 = new Class110[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass110Array1[local86] = new Class110();
		}
		@Pc(311) int local311 = method6279(6) + 1;
		aClass222Array1 = new Class222[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass222Array1[local138] = new Class222();
		}
		@Pc(332) int local332 = method6279(6) + 1;
		aBooleanArray43 = new boolean[local332];
		anIntArray561 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray43[local191] = method6280() != 0;
			method6279(16);
			method6279(16);
			anIntArray561[local191] = method6279(8);
		}
		aBoolean587 = true;
	}
}
