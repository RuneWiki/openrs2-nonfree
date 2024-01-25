import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLclient!nr;Lclient!ct;Lclient!ct;Lclient!ct;)Z")
	public static boolean method2619(@OriginalArg(1) Class1_Sub6_Sub4 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) Class30 arg2, @OriginalArg(4) Class30 arg3) {
		Static228.aClass30_67 = arg3;
		Static40.aClass1_Sub6_Sub4_2 = arg0;
		Static107.aClass30_32 = arg1;
		Static158.aClass30_49 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)V")
	public static void method2621() {
		Static226.aClass21_123.method857();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLclient!at;)Lclient!po;")
	public static Class1_Sub1 method2622(@OriginalArg(1) Class1_Sub7 arg0) {
		arg0.method2132();
		@Pc(13) int local13 = arg0.method2132();
		@Pc(17) Class1_Sub1 local17 = Static242.method4515(local13);
		local17.anInt6964 = arg0.method2132();
		@Pc(26) int local26 = arg0.method2132();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method2132();
			local17.method6002(local34, arg0);
		}
		local17.method6008();
		return local17;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLclient!bf;I)Lclient!rr;")
	public static Class187 method2623(@OriginalArg(1) Class11_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class187 local9;
		if (Static55.aClass187_1 == null) {
			local9 = new Class187();
		} else {
			local9 = Static55.aClass187_1;
			Static55.aClass187_1 = Static55.aClass187_1.aClass187_3;
			local9.aClass187_3 = null;
			Static230.anInt1972--;
		}
		local9.anInt5493 = arg1;
		local9.aClass11_Sub2_2 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2624(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			local7 *= 37L;
			@Pc(30) char local30 = arg0.charAt(local20);
			if (local30 >= 'A' && local30 <= 'Z') {
				local7 += local30 + 1 - 65;
			} else if (local30 >= 'a' && local30 <= 'z') {
				local7 += local30 + 1 - 97;
			} else if (local30 >= '0' && local30 <= '9') {
				local7 += local30 - 21;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}
