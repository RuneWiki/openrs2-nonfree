import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
	public static int anInt4944;

	@OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
	public static int anInt4948;

	@OriginalMember(owner = "client!rn", name = "H", descriptor = "Lclient!ho;")
	public static Class3_Sub4_Sub12 aClass3_Sub4_Sub12_6;

	@OriginalMember(owner = "client!rn", name = "C", descriptor = "Z")
	public static boolean aBoolean346 = false;

	@OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
	public static int anInt4957 = -1;

	@OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
	public static int anInt4961 = -1;

	@OriginalMember(owner = "client!rn", name = "R", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4129(@OriginalArg(0) int arg0) {
		@Pc(15) String local15 = Integer.toString(arg0);
		for (@Pc(20) int local20 = local15.length() - 3; local20 > 0; local20 -= 3) {
			local15 = local15.substring(0, local20) + "," + local15.substring(local20);
		}
		if (local15.length() > 9) {
			return " <col=00ff80>" + local15.substring(0, local15.length() - 8) + Static300.aString225 + " (" + local15 + ")</col>";
		} else if (local15.length() <= 6) {
			return " <col=ffff00>" + local15 + "</col>";
		} else {
			return " <col=ffffff>" + local15.substring(0, local15.length() - 4) + Static305.aString229 + " (" + local15 + ")</col>";
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(CB)Z")
	public static boolean method4135(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static117.method1919(arg0)) {
			return true;
		} else {
			@Pc(20) char[] local20 = Static66.aCharArray10;
			@Pc(22) int local22;
			@Pc(30) char local30;
			for (local22 = 0; local22 < local20.length; local22++) {
				local30 = local20[local22];
				if (arg0 == local30) {
					return true;
				}
			}
			local20 = Static256.aCharArray36;
			for (local22 = 0; local22 < local20.length; local22++) {
				local30 = local20[local22];
				if (arg0 == local30) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIZ)V")
	public static void method4141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class56 local13 = Static223.aClass56ArrayArrayArray1[Static99.anInt1826][arg1][arg0];
		if (local13 == null) {
			Static201.method3340(Static99.anInt1826, arg1, arg0);
			return;
		}
		@Pc(23) Class3_Sub4_Sub13 local23 = null;
		@Pc(25) int local25 = -99999999;
		@Pc(30) Class3_Sub4_Sub13 local30;
		for (local30 = (Class3_Sub4_Sub13) local13.method1281(); local30 != null; local30 = (Class3_Sub4_Sub13) local13.method1278()) {
			@Pc(39) Class21 local39 = Static133.method2309(local30.aClass10_Sub2_1.anInt365);
			@Pc(42) int local42 = local39.anInt530;
			if (local39.anInt501 == 1) {
				local42 *= local30.aClass10_Sub2_1.anInt369 + 1;
			}
			if (local42 > local25) {
				local23 = local30;
				local25 = local42;
			}
		}
		if (local23 == null) {
			Static201.method3340(Static99.anInt1826, arg1, arg0);
			return;
		}
		local13.method1274(local23);
		local30 = (Class3_Sub4_Sub13) local13.method1281();
		@Pc(95) Class10_Sub2 local95 = null;
		@Pc(97) Class10_Sub2 local97 = null;
		while (local30 != null) {
			@Pc(103) Class10_Sub2 local103 = local30.aClass10_Sub2_1;
			if (local103.anInt365 != local23.aClass10_Sub2_1.anInt365) {
				if (local95 == null) {
					local95 = local103;
				}
				if (local103.anInt365 != local95.anInt365 && local97 == null) {
					local97 = local103;
				}
			}
			local30 = (Class3_Sub4_Sub13) local13.method1278();
		}
		@Pc(143) long local143 = (long) (arg1 + (arg0 << 7) + 1610612736);
		Static123.method2049(Static99.anInt1826, arg1, arg0, Static122.method2036(arg0 * 128 + 64, arg1 * 128 - -64, Static99.anInt1826), local23.aClass10_Sub2_1, local143, local95, local97);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I[BII)I")
	public static int method4142(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg1; local14++) {
			local8 = Class143.anIntArray479[(arg0[local14] ^ local8) & 0xFF] ^ local8 >>> 8;
		}
		return ~local8;
	}
}
