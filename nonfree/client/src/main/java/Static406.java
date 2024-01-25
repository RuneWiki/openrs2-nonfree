import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "[F")
	public static float[] aFloatArray65;

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "[Lclient!ra;")
	public static Class298[] aClass298Array1;

	@OriginalMember(owner = "client!nv", name = "N", descriptor = "[F")
	public static float[] aFloatArray66;

	@OriginalMember(owner = "client!nv", name = "F", descriptor = "[B")
	private static byte[] aByteArray62;

	@OriginalMember(owner = "client!nv", name = "B", descriptor = "[F")
	public static float[] aFloatArray67;

	@OriginalMember(owner = "client!nv", name = "M", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "[Lclient!ou;")
	public static Class269[] aClass269Array1;

	@OriginalMember(owner = "client!nv", name = "O", descriptor = "I")
	public static int anInt6948;

	@OriginalMember(owner = "client!nv", name = "H", descriptor = "[F")
	public static float[] aFloatArray68;

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "I")
	private static int anInt6949;

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "[F")
	public static float[] aFloatArray69;

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "[F")
	public static float[] aFloatArray70;

	@OriginalMember(owner = "client!nv", name = "z", descriptor = "[I")
	public static int[] anIntArray403;

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "[Lclient!fm;")
	public static Class130[] aClass130Array1;

	@OriginalMember(owner = "client!nv", name = "K", descriptor = "I")
	public static int anInt6953;

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "[I")
	public static int[] anIntArray404;

	@OriginalMember(owner = "client!nv", name = "D", descriptor = "I")
	private static int anInt6954;

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "[Lclient!le;")
	public static Class212[] aClass212Array1;

	@OriginalMember(owner = "client!nv", name = "J", descriptor = "[F")
	public static float[] aFloatArray71;

	@OriginalMember(owner = "client!nv", name = "P", descriptor = "Z")
	private static boolean aBoolean534 = false;

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)I")
	public static int method5947(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6954) {
			local8 = 8 - anInt6954;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray62[anInt6949] >> anInt6954 & local14) << local3;
			anInt6954 = 0;
			anInt6949++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray62[anInt6949] >> anInt6954 & local8) << local3;
			anInt6954 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([BI)V")
	public static void method5948(@OriginalArg(0) byte[] arg0) {
		aByteArray62 = arg0;
		anInt6949 = 0;
		anInt6954 = 0;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!la;I)Lclient!nv;")
	public static Class5_Sub37 method5950(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1) {
		if (method5957(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4997(arg1);
			return local14 == null ? null : new Class5_Sub37(local14);
		} else {
			arg0.method4977(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)F")
	public static float method5951(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "([B)V")
	private static void method5952(@OriginalArg(0) byte[] arg0) {
		method5948(arg0);
		anInt6948 = 0x1 << method5947(4);
		anInt6953 = 0x1 << method5947(4);
		aFloatArray68 = new float[anInt6953];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6948 : anInt6953;
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
			local191 = Static197.method8882(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static374.method5469(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray66 = local39;
				aFloatArray71 = local84;
				aFloatArray69 = local136;
				anIntArray403 = local185;
			} else {
				aFloatArray65 = local39;
				aFloatArray67 = local84;
				aFloatArray70 = local136;
				anIntArray402 = local185;
			}
		}
		local24 = method5947(8) + 1;
		aClass269Array1 = new Class269[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass269Array1[local28] = new Class269();
		}
		local32 = method5947(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5947(16);
		}
		@Pc(269) int local269 = method5947(6) + 1;
		aClass130Array1 = new Class130[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass130Array1[local41] = new Class130();
		}
		@Pc(290) int local290 = method5947(6) + 1;
		aClass298Array1 = new Class298[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass298Array1[local86] = new Class298();
		}
		@Pc(311) int local311 = method5947(6) + 1;
		aClass212Array1 = new Class212[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass212Array1[local138] = new Class212();
		}
		@Pc(332) int local332 = method5947(6) + 1;
		aBooleanArray16 = new boolean[local332];
		anIntArray404 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray16[local191] = method5956() != 0;
			method5947(16);
			method5947(16);
			anIntArray404[local191] = method5947(8);
		}
		aBoolean534 = true;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!la;II)Lclient!nv;")
	public static Class5_Sub37 method5954(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5957(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4991(arg1, arg2, -5);
			return local16 == null ? null : new Class5_Sub37(local16);
		} else {
			arg0.method4980(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "()I")
	public static int method5956() {
		@Pc(7) int local7 = aByteArray62[anInt6949] >> anInt6954 & 0x1;
		anInt6954++;
		anInt6949 += anInt6954 >> 3;
		anInt6954 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!la;)Z")
	private static boolean method5957(@OriginalArg(0) Class208 arg0) {
		if (!aBoolean534) {
			@Pc(7) byte[] local7 = arg0.method4991(0, 0, -125);
			if (local7 == null) {
				return false;
			}
			method5952(local7);
		}
		return true;
	}
}
