import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "Lclient!th;")
	public static Class168 aClass168_166;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
	public static int anInt5022;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
	public static int anInt5023;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	public static volatile int anInt5017 = 0;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "[S")
	public static short[] aShortArray89 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "Z")
	public static boolean aBoolean315 = false;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "S")
	public static short aShort74 = 256;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z[S)[S")
	public static short[] method3798(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) short[] local17 = new short[arg0.length];
			Static319.method1423(arg0, 0, local17, 0, arg0.length);
			return local17;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method3799() {
		@Pc(11) String local11 = "www";
		if (Static236.anInt1712 != 0) {
			local11 = "www-wtqa";
		}
		@Pc(18) String local18 = "";
		if (Static210.aString313 != null) {
			local18 = "/p=" + Static210.aString313;
		}
		return "http://" + local11 + ".runescape.com/l=" + Static134.anInt3081 + "/a=" + Static23.anInt656 + local18 + "/";
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)I")
	public static int method3801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = Integer.MAX_VALUE & local15 * (local15 * 15731 * local15 + 789221) + 1376312589;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V")
	public static void method3802() {
		Static174.aClass89_44.method2273(5);
		Static214.aClass89_32.method2273(5);
		Static256.aClass89_40.method2273(5);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[B)Lclient!eb;")
	public static Class1_Sub3_Sub6 method3803(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class1_Sub3_Sub6 local9 = new Class1_Sub3_Sub6();
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(arg0);
		local14.anInt3000 = local14.aByteArray55.length - 2;
		@Pc(25) int local25 = local14.method2244();
		@Pc(35) int local35 = local14.aByteArray55.length - local25 - 2 - 12;
		local14.anInt3000 = local35;
		@Pc(42) int local42 = local14.method2194();
		local9.anInt1262 = local14.method2244();
		local9.anInt1263 = local14.method2244();
		local9.anInt1258 = local14.method2244();
		local9.anInt1264 = local14.method2244();
		@Pc(66) int local66 = local14.method2199();
		@Pc(78) int local78;
		@Pc(85) int local85;
		if (local66 > 0) {
			local9.aClass186Array1 = new Class186[local66];
			for (local78 = 0; local78 < local66; local78++) {
				local85 = local14.method2244();
				@Pc(92) Class186 local92 = new Class186(Static315.method4766(local85));
				local9.aClass186Array1[local78] = local92;
				while (local85-- > 0) {
					@Pc(107) int local107 = local14.method2194();
					@Pc(111) int local111 = local14.method2194();
					local92.method4575((long) local107, new Class1_Sub17(local111));
				}
			}
		}
		local14.anInt3000 = 0;
		local78 = 0;
		local9.aString73 = local14.method2196();
		local9.aStringArray12 = new String[local42];
		local9.anIntArray158 = new int[local42];
		local9.anIntArray157 = new int[local42];
		while (local35 > local14.anInt3000) {
			local85 = local14.method2244();
			if (local85 == 3) {
				local9.aStringArray12[local78] = local14.method2237().intern();
			} else if (local85 >= 100 || local85 == 21 || local85 == 38 || local85 == 39) {
				local9.anIntArray157[local78] = local14.method2199();
			} else {
				local9.anIntArray157[local78] = local14.method2194();
			}
			local9.anIntArray158[local78++] = local85;
		}
		return local9;
	}
}
