import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "[Lclient!sh;")
	public static Class80[] aClass80Array1;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "[Lclient!tb;")
	public static Class83[] aClass83Array1;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
	public static int anInt562;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "[Lclient!lb;")
	public static Class53[] aClass53Array1;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
	private static int anInt563;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "[Lclient!pb;")
	public static Class69[] aClass69Array1;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "[I")
	public static int[] anIntArray55;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "[I")
	public static int[] anIntArray56;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
	public static int anInt568;

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "[B")
	private static byte[] aByteArray2;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
	private static int anInt569;

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "[I")
	public static int[] anIntArray57;

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "Z")
	private static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)F")
	public static float method362(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!nh;II)Lclient!cc;")
	public static Class4_Sub5 method363(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method367(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2878(arg1, arg2);
			return local16 == null ? null : new Class4_Sub5(local16);
		} else {
			arg0.method2872(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)I")
	public static int method364(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt563) {
			local8 = 8 - anInt563;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray2[anInt569] >> anInt563 & local14) << local3;
			anInt563 = 0;
			anInt569++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray2[anInt569] >> anInt563 & local8) << local3;
			anInt563 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()I")
	public static int method366() {
		@Pc(7) int local7 = aByteArray2[anInt569] >> anInt563 & 0x1;
		anInt563++;
		anInt569 += anInt563 >> 3;
		anInt563 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!nh;)Z")
	private static boolean method367(@OriginalArg(0) Class62 arg0) {
		if (!aBoolean28) {
			@Pc(7) byte[] local7 = arg0.method2878(0, 0);
			if (local7 == null) {
				return false;
			}
			method368(local7);
			aBoolean28 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "([B)V")
	private static void method368(@OriginalArg(0) byte[] arg0) {
		method369(arg0);
		anInt562 = 0x1 << method364(4);
		anInt568 = 0x1 << method364(4);
		aFloatArray1 = new float[anInt568];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt562 : anInt568;
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
			local191 = Static117.method2135(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static81.method1608(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray6 = local39;
				aFloatArray2 = local84;
				aFloatArray5 = local136;
				anIntArray57 = local185;
			} else {
				aFloatArray8 = local39;
				aFloatArray3 = local84;
				aFloatArray4 = local136;
				anIntArray55 = local185;
			}
		}
		local24 = method364(8) + 1;
		aClass83Array1 = new Class83[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass83Array1[local28] = new Class83();
		}
		local32 = method364(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method364(16);
		}
		@Pc(269) int local269 = method364(6) + 1;
		aClass80Array1 = new Class80[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass80Array1[local41] = new Class80();
		}
		@Pc(290) int local290 = method364(6) + 1;
		aClass69Array1 = new Class69[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass69Array1[local86] = new Class69();
		}
		@Pc(311) int local311 = method364(6) + 1;
		aClass53Array1 = new Class53[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass53Array1[local138] = new Class53();
		}
		@Pc(332) int local332 = method364(6) + 1;
		aBooleanArray3 = new boolean[local332];
		anIntArray56 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray3[local191] = method366() != 0;
			method364(16);
			method364(16);
			anIntArray56[local191] = method364(8);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([BI)V")
	public static void method369(@OriginalArg(0) byte[] arg0) {
		aByteArray2 = arg0;
		anInt569 = 0;
		anInt563 = 0;
	}
}
