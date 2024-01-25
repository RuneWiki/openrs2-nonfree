import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
	public static int anInt7606;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6617(@OriginalArg(0) String arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local17 > local19 + 2) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(76) int local76;
				if (local25 >= '0' && local25 <= '9') {
					local76 = local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local76 = local25 - 87;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local14.append('%');
						continue;
					}
					local76 = local25 + 10 - 65;
				}
				local25 = arg0.charAt(local19 + 2);
				local76 *= 16;
				if (local25 >= '0' && local25 <= '9') {
					local76 += local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local76 += local25 + 10 - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local14.append('%');
						continue;
					}
					local76 += local25 - 55;
				}
				local19 += 2;
				if (local76 != 0 && Static611.method8015((byte) local76)) {
					local14.append(Static305.method4280((byte) local76));
				}
			} else if (local25 == '+') {
				local14.append(' ');
			} else {
				local14.append(local25);
			}
		}
		return local14.toString();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!es;)Lclient!ro;")
	public static Class103_Sub2_Sub1 method6618(@OriginalArg(1) Class4_Sub11 arg0) {
		@Pc(7) Class103_Sub2 local7 = Static643.method8576(arg0);
		@Pc(11) int local11 = arg0.method8834();
		return new Class103_Sub2_Sub1(local7.aClass291_14, local7.aClass125_16, local7.anInt8643, local7.anInt8650, local7.anInt8646, local7.anInt8653, local7.anInt8648, local7.anInt8641, local7.anInt8644, local7.anInt8161, local7.anInt8165, local7.anInt8167, local7.anInt8166, local7.anInt8162, local7.anInt8160, local11);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z")
	public static boolean method6619(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!bn;Z)V")
	public static void method6620(@OriginalArg(0) Class4_Sub11_Sub1 arg0) {
		arg0.method8860(Static580.aClass34_115.method1229());
		arg0.method8860(Static64.aClass34_11.method1229());
		arg0.method8860(Static674.aClass34_134.method1229());
		arg0.method8860(Static20.aClass34_4.method1229());
		arg0.method8860(Static42.aClass34_6.method1229());
		arg0.method8860(Static151.aClass34_38.method1229());
		arg0.method8860(Static611.aClass34_120.method1229());
		arg0.method8860(Static89.aClass34_20.method1229());
		arg0.method8860(Static368.aClass34_80.method1229());
		arg0.method8860(Static573.aClass34_112.method1229());
		arg0.method8860(Static122.aClass34_28.method1229());
		arg0.method8860(Static349.aClass34_75.method1229());
		arg0.method8860(Static338.aClass34_73.method1229());
		arg0.method8860(Static305.aClass34_68.method1229());
		arg0.method8860(Static400.aClass34_84.method1229());
		arg0.method8860(Static172.aClass34_44.method1229());
		arg0.method8860(Static194.aClass34_48.method1229());
		arg0.method8860(Static31.aClass34_124.method1229());
		arg0.method8860(Static584.aClass34_60.method1229());
		arg0.method8860(Static203.aClass34_53.method1229());
		arg0.method8860(Static199.aClass34_50.method1229());
		arg0.method8860(Static363.aClass34_82.method1229());
		arg0.method8860(Static335.aClass34_72.method1229());
		arg0.method8860(Static329.aClass34_71.method1229());
		arg0.method8860(Static584.aClass34_59.method1229());
		arg0.method8860(Static96.aClass34_21.method1229());
		arg0.method8860(Static629.aClass34_125.method1229());
		arg0.method8860(Static362.aClass34_81.method1229());
		arg0.method8860(Static388.aClass34_83.method1229());
		arg0.method8860(Static409.aClass34_85.method1229());
		arg0.method8860(Static201.aClass34_52.method1229());
		arg0.method8860(Static143.aClass34_31.method1229());
		arg0.method8860(Static534.method7447());
		arg0.method8860(Static402.method5127());
		arg0.method8860(Static636.aClass34_126.method1229());
	}
}
