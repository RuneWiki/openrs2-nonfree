import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
	private static int anInt7726;

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
	private static int anInt7727;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "[F")
	public static float[] aFloatArray77;

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "[Lclient!rd;")
	public static Class315[] aClass315Array1;

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "[B")
	private static byte[] aByteArray67;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "[Lclient!go;")
	public static Class137[] aClass137Array1;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "[F")
	public static float[] aFloatArray78;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "[I")
	public static int[] anIntArray418;

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
	public static int anInt7728;

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "[I")
	public static int[] anIntArray419;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "[F")
	public static float[] aFloatArray79;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "[F")
	public static float[] aFloatArray80;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "[Lclient!wb;")
	public static Class394[] aClass394Array1;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "[F")
	public static float[] aFloatArray81;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "[Lclient!we;")
	public static Class398[] aClass398Array1;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
	public static int anInt7729;

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "[F")
	public static float[] aFloatArray83;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "[F")
	public static float[] aFloatArray84;

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "[I")
	public static int[] anIntArray420;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Z")
	private static boolean aBoolean588 = false;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)F")
	public static float method6546(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!lb;)Z")
	private static boolean method6547(@OriginalArg(0) Class221 arg0) {
		if (!aBoolean588) {
			@Pc(7) byte[] local7 = arg0.method5089(0, 0);
			if (local7 == null) {
				return false;
			}
			method6552(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()I")
	public static int method6548() {
		@Pc(7) int local7 = aByteArray67[anInt7727] >> anInt7726 & 0x1;
		anInt7726++;
		anInt7727 += anInt7726 >> 3;
		anInt7726 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([BI)V")
	public static void method6549(@OriginalArg(0) byte[] arg0) {
		aByteArray67 = arg0;
		anInt7727 = 0;
		anInt7726 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([B)V")
	private static void method6552(@OriginalArg(0) byte[] arg0) {
		method6549(arg0);
		anInt7729 = 0x1 << method6556(4);
		anInt7728 = 0x1 << method6556(4);
		aFloatArray84 = new float[anInt7728];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt7729 : anInt7728;
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
			local191 = Static700.method9156(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static209.method3108(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray80 = local39;
				aFloatArray81 = local84;
				aFloatArray83 = local136;
				anIntArray418 = local185;
			} else {
				aFloatArray78 = local39;
				aFloatArray79 = local84;
				aFloatArray77 = local136;
				anIntArray419 = local185;
			}
		}
		local24 = method6556(8) + 1;
		aClass394Array1 = new Class394[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass394Array1[local28] = new Class394();
		}
		local32 = method6556(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method6556(16);
		}
		@Pc(269) int local269 = method6556(6) + 1;
		aClass137Array1 = new Class137[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass137Array1[local41] = new Class137();
		}
		@Pc(290) int local290 = method6556(6) + 1;
		aClass398Array1 = new Class398[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass398Array1[local86] = new Class398();
		}
		@Pc(311) int local311 = method6556(6) + 1;
		aClass315Array1 = new Class315[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass315Array1[local138] = new Class315();
		}
		@Pc(332) int local332 = method6556(6) + 1;
		aBooleanArray19 = new boolean[local332];
		anIntArray420 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray19[local191] = method6548() != 0;
			method6556(16);
			method6556(16);
			anIntArray420[local191] = method6556(8);
		}
		aBoolean588 = true;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!lb;II)Lclient!ob;")
	public static Class3_Sub36 method6553(@OriginalArg(0) Class221 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method6547(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5089(arg2, arg1);
			return local16 == null ? null : new Class3_Sub36(local16);
		} else {
			arg0.method5093(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!lb;I)Lclient!ob;")
	public static Class3_Sub36 method6555(@OriginalArg(0) Class221 arg0, @OriginalArg(1) int arg1) {
		if (method6547(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5077(arg1);
			return local14 == null ? null : new Class3_Sub36(local14);
		} else {
			arg0.method5068(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)I")
	public static int method6556(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt7726) {
			local8 = 8 - anInt7726;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray67[anInt7727] >> anInt7726 & local14) << local3;
			anInt7726 = 0;
			anInt7727++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray67[anInt7727] >> anInt7726 & local8) << local3;
			anInt7726 += arg0;
		}
		return local1;
	}
}
