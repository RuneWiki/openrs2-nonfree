import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!cj;")
	public static Interface1 anInterface1_12;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!qb;")
	public static final Class84 aClass84_18 = new Class84(30);

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_31 = new Class8(64);

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1202 = Static161.method2452("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1203 = Static161.method2452("Login server offline)3");

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
	public static final int anInt3246 = 4;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "[[Lclient!lh;")
	public static final Class64[][] aClass64ArrayArray11 = new Class64[anInt3246][500];

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1204 = aClass20_1203;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "S")
	public static short aShort40 = 32767;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "[I")
	public static final int[] anIntArray351 = new int[anInt3246];

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "[I")
	public static final int[] anIntArray352 = new int[128];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIILclient!ia;IJZ)Z")
	public static boolean method2443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static80.method1411(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)[Lclient!qh;")
	public static Class5_Sub2_Sub10_Sub1[] method2447() {
		@Pc(9) Class5_Sub2_Sub10_Sub1[] local9 = new Class5_Sub2_Sub10_Sub1[Static99.anInt2138];
		for (@Pc(11) int local11 = 0; local11 < Static99.anInt2138; local11++) {
			@Pc(21) int local21 = Static210.anIntArray84[local11] * Static153.anIntArray337[local11];
			@Pc(25) byte[] local25 = Static191.aByteArrayArray9[local11];
			@Pc(28) int[] local28 = new int[local21];
			for (@Pc(30) int local30 = 0; local30 < local21; local30++) {
				local28[local30] = Static3.anIntArray9[local25[local30] & 0xFF];
			}
			local9[local11] = new Class5_Sub2_Sub10_Sub1(Static58.anInt1319, Static140.anInt2921, Static146.anIntArray320[local11], Static5.anIntArray10[local11], Static153.anIntArray337[local11], Static210.anIntArray84[local11], local28);
		}
		Static85.method1452();
		return local9;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!a;IIIIII)Lclient!a;")
	public static Class1_Sub1 method2450(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg4;
		@Pc(14) Class1_Sub1 local14 = (Class1_Sub1) Static8.aClass84_3.method2332(local8);
		if (local14 == null) {
			@Pc(21) Class1_Sub5 local21 = Static112.method1814(Static130.aClass23_Sub1_15, arg4);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method1818(64, 768, -50, -10, -50);
			Static8.aClass84_3.method2331(local8, local14);
		}
		@Pc(43) int local43 = arg0.method656();
		@Pc(46) int local46 = arg0.method665();
		@Pc(49) int local49 = arg0.method669();
		@Pc(52) int local52 = arg0.method671();
		local14 = local14.method660(true, true);
		if (arg3 != 0) {
			local14.method659(arg3);
		}
		@Pc(68) Class1_Sub1_Sub1 local68 = (Class1_Sub1_Sub1) local14;
		if (Static128.method1999(Static111.anInt2327, local43 + arg1, local49 + arg2) != arg5 || arg5 != Static128.method1999(Static111.anInt2327, local46 + arg1, local52 + arg2)) {
			for (@Pc(92) int local92 = 0; local92 < local68.anInt838; local92++) {
				local68.anIntArray49[local92] += Static128.method1999(Static111.anInt2327, local68.anIntArray56[local92] + arg1, arg2 + local68.anIntArray50[local92]) - arg5;
			}
			local68.aBoolean52 = false;
		}
		return local14;
	}
}
