import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_41 = new Class84("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Lclient!iq;")
	public static Class39_Sub5 method2349() {
		@Pc(8) Class39_Sub5 local8 = (Class39_Sub5) Static175.aClass188_5.method4536();
		if (local8 == null) {
			return new Class39_Sub5();
		} else {
			Static224.anInt4034--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ls;Lclient!qa;ILclient!tr;)V")
	public static void method2350(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(3) Class231 arg2) {
		@Pc(10) Class80 local10 = arg2.method5360(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.UA();
		if (local10.qa() > local16) {
			local16 = local10.qa();
		}
		@Pc(37) int local37 = arg0.anInt4273;
		@Pc(40) int local40 = arg0.anInt4276;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(60) int local60;
		@Pc(87) int local87;
		if (arg2.aString54 != null) {
			local42 = Static40.aClass101_1.method1968(null, null, arg2.aString54, Static387.aStringArray51);
			for (local60 = 0; local60 < local42; local60++) {
				@Pc(66) String local66 = Static387.aStringArray51[local60];
				if (local60 < local42 - 1) {
					local66 = local66.substring(0, local66.length() - 4);
				}
				local87 = Static22.aClass207_13.method4887(local66);
				if (local87 > local44) {
					local44 = local87;
				}
			}
			local46 = local42 * Static22.aClass207_13.method4889() + Static22.aClass207_13.method4890() / 2;
		}
		local60 = local16 / 2 + arg0.anInt4273;
		@Pc(121) int local121 = arg0.anInt4276;
		if (local16 + Static7.anInt2565 > local37) {
			local37 = Static7.anInt2565;
			local60 = local44 / 2 + Static7.anInt2565 + local16 / 2 + 5 + 10;
		} else if (Static7.anInt2575 - local16 < local37) {
			local37 = Static7.anInt2575 - local16;
			local60 = Static7.anInt2575 - local44 / 2 - local16 / 2 - 5 - 10;
		}
		if (Static7.anInt2569 + local16 > local40) {
			local121 = Static7.anInt2569 + local16 / 2 + 10;
			local40 = Static7.anInt2569;
		} else if (Static7.anInt2574 - local16 < local40) {
			local40 = Static7.anInt2574 - local16;
			local121 = Static7.anInt2574 - local46 - local16 / 2 - 10;
		}
		local87 = (int) (Math.atan2((double) (local37 - arg0.anInt4273), (double) (local40 - arg0.anInt4276)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6097((float) local37 + (float) local16 / 2.0F, (float) local40 + (float) local16 / 2.0F, 4096, local87);
		@Pc(264) int local264 = -2;
		@Pc(266) int local266 = -2;
		@Pc(268) int local268 = -2;
		@Pc(270) int local270 = -2;
		if (arg2.aString54 != null) {
			local264 = local60 - local44 / 2 - 5;
			local266 = local121;
			local270 = local121 + Static22.aClass207_13.method4889() * local42 + 3;
			local268 = local264 + local44 + 10;
			if (arg2.anInt6829 != 0) {
				arg1.method4743(local264, arg2.anInt6829, local121, local270 - local121, local268 + -local264);
			}
			if (arg2.anInt6834 != 0) {
				arg1.method4723(arg2.anInt6834, local270 - local121, local264, local121, local268 - local264);
			}
			for (@Pc(340) int local340 = 0; local340 < local42; local340++) {
				@Pc(346) String local346 = Static387.aStringArray51[local340];
				if (local42 - 1 > local340) {
					local346 = local346.substring(0, local346.length() - 4);
				}
				Static22.aClass207_13.method4886(arg1, local346, local60, local121, arg2.anInt6853);
				local121 += Static22.aClass207_13.method4889();
			}
		}
		if (arg2.anInt6847 == -1 && arg2.aString54 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(398) Class1_Sub9 local398 = new Class1_Sub9(arg0);
		local398.anInt1777 = local40 - local16;
		local398.anInt1776 = local16 + local37;
		local398.anInt1771 = local270;
		local398.anInt1773 = local16 + local40;
		local398.anInt1769 = local268;
		local398.anInt1774 = local266;
		local398.anInt1768 = local37 - local16;
		local398.anInt1770 = local264;
		Static67.aClass266_12.method5998(local398);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLjava/lang/String;II)I")
	public static int method2354(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) char local39 = arg0.charAt(local33);
			if (local33 == 0) {
				if (local39 == '-') {
					local24 = true;
					continue;
				}
				if (local39 == '+') {
					continue;
				}
			}
			@Pc(91) int local91;
			if (local39 >= '0' && local39 <= '9') {
				local91 = local39 - '0';
			} else if (local39 >= 'A' && local39 <= 'Z') {
				local91 = local39 - '7';
			} else if (local39 >= 'a' && local39 <= 'z') {
				local91 = local39 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local91) {
				throw new NumberFormatException();
			}
			if (local24) {
				local91 = -local91;
			}
			@Pc(115) int local115 = arg1 * local28 + local91;
			if (local28 != local115 / arg1) {
				throw new NumberFormatException();
			}
			local26 = true;
			local28 = local115;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)V")
	public static void method2356(@OriginalArg(0) int arg0) {
		if (arg0 == Static215.anInt3917) {
			return;
		}
		Static135.anInt2314 = Static352.anInt6022 = Static9.anIntArray12[arg0];
		Static389.method5309();
		Static93.anIntArrayArray52 = new int[Static135.anInt2314][Static352.anInt6022];
		Static315.anIntArrayArray171 = new int[Static135.anInt2314][Static352.anInt6022];
		Static257.anIntArrayArrayArray13 = new int[4][Static135.anInt2314 >> 3][Static352.anInt6022 >> 3];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static170.aClass112Array1[local40] = Static454.method6087(Static352.anInt6022, Static135.anInt2314);
		}
		Static443.aByteArrayArrayArray17 = new byte[4][Static135.anInt2314][Static352.anInt6022];
		Static130.method1889(Static135.anInt2314, Static352.anInt6022);
		Static131.method5615(Static276.aClass109_10, Static352.anInt6022 >> 3, Static135.anInt2314 >> 3);
		Static215.anInt3917 = arg0;
	}
}
