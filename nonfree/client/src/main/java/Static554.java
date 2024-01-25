import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!uv", name = "S", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[100];

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "(I)V")
	public static void method7603() {
		for (@Pc(7) int local7 = 0; local7 < Static345.anInt6219; local7++) {
			@Pc(13) Class367 local13 = Static73.aClass367Array4[local7];
			if (local13.aByte128 == 3) {
				if (local13.aClass3_Sub16_Sub2_4 == null) {
					local13.anInt10343 = Integer.MIN_VALUE;
				} else {
					Static354.aClass3_Sub16_Sub4_2.method7757(local13.aClass3_Sub16_Sub2_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLclient!qk;)Lclient!qk;")
	public static Class3_Sub16_Sub3 method7604(@OriginalArg(1) Class3_Sub16_Sub3 arg0) {
		@Pc(22) Class3_Sub16_Sub3 local22 = arg0 == null ? new Class3_Sub16_Sub3() : new Class3_Sub16_Sub3(arg0);
		local22.method6102();
		return local22;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!ie;I)Lclient!io;")
	public static Class149 method7605(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(7) String local7 = arg0.method6786();
		@Pc(14) Class154 local14 = Static447.method6195()[arg0.method6814()];
		@Pc(21) Class201 local21 = Static342.method4995()[arg0.method6814()];
		@Pc(33) int local33 = arg0.method6789();
		@Pc(37) int local37 = arg0.method6789();
		@Pc(41) int local41 = arg0.method6814();
		@Pc(45) int local45 = arg0.method6814();
		@Pc(49) int local49 = arg0.method6814();
		@Pc(53) int local53 = arg0.method6811();
		@Pc(57) int local57 = arg0.method6811();
		@Pc(61) int local61 = arg0.method6816();
		@Pc(65) int local65 = arg0.method6816();
		@Pc(69) int local69 = arg0.method6816();
		return new Class149(local7, local14, local21, local33, local37, local41, local45, local49, local53, local57, local61, local65, local69);
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(IIB)I")
	public static int method7606(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return local17 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IJ)V")
	public static void method7608(@OriginalArg(1) long arg0) {
		@Pc(11) int local11 = Static357.anInt6340;
		@Pc(13) int local13 = Static372.anInt6492;
		@Pc(25) int local25;
		@Pc(33) int local33;
		if (Static377.anInt6530 != local11) {
			local25 = local11 - Static377.anInt6530;
			local33 = (int) ((long) local25 * arg0 / 320L);
			if (local25 > 0) {
				if (local33 == 0) {
					local33 = 1;
				} else if (local33 > local25) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = -1;
			} else if (local25 > local33) {
				local33 = local25;
			}
			Static377.anInt6530 += local33;
		}
		if (!Static348.aClass3_Sub51_Sub1_5.aBoolean681) {
			Static123.aFloat75 += Static240.aFloat116 * (float) arg0 / 40.0F * 8.0F;
			Static209.aFloat229 += Static1.aFloat1 * (float) arg0 / 40.0F * 8.0F;
		}
		if (local13 != Static262.anInt5037) {
			local25 = local13 - Static262.anInt5037;
			local33 = (int) (arg0 * (long) local25 / 320L);
			if (local25 > 0) {
				if (local33 == 0) {
					local33 = 1;
				} else if (local25 < local33) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = -1;
			} else if (local25 > local33) {
				local33 = local25;
			}
			Static262.anInt5037 += local33;
		}
		Static459.method6313();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method7609(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '<' || local25 == '>') {
				local17 += 3;
			}
		}
		@Pc(49) StringBuffer local49 = new StringBuffer(local17 + local15);
		for (@Pc(51) int local51 = 0; local51 < local15; local51++) {
			@Pc(57) char local57 = arg0.charAt(local51);
			if (local57 == '<') {
				local49.append("<lt>");
			} else if (local57 == '>') {
				local49.append("<gt>");
			} else {
				local49.append(local57);
			}
		}
		return local49.toString();
	}
}
