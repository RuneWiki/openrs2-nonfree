import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
	public static int anInt2366;

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString79 = "Opened title screen";

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
	public static int anInt2367 = 0;

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "[S")
	public static short[] aShortArray47 = new short[256];

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
	public static int anInt2370 = 0;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!vm;Lclient!fd;III)V")
	public static void method2006(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class84 local14 = arg1.method1506(arg0);
		if (local14 == null) {
			return;
		}
		arg0.method4459(arg3, arg2, arg3 + arg1.anInt1829, arg1.anInt1806 + arg2);
		if (Static27.anInt450 == 2 || Static27.anInt450 == 5 || Static248.aClass60_22 == null) {
			arg0.method4508(local14, arg3, arg2);
			return;
		}
		@Pc(49) int local49;
		@Pc(68) int local68;
		@Pc(58) int local58;
		@Pc(65) int local65;
		if (Static303.anInt3065 == 4) {
			local65 = 4096;
			local68 = Static331.anInt6556;
			local58 = (int) -Static138.aFloat35 & 0x3FFF;
			local49 = Static2.anInt5073;
		} else {
			local49 = Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465;
			local58 = (int) -Static138.aFloat35 + Static222.anInt4620 & 0x3FFF;
			local65 = 4096 - Static48.anInt1082 * 16;
			local68 = Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466;
		}
		@Pc(94) int local94 = local49 / 32 + 48 + 208 - Static92.anInt2048 * 2;
		@Pc(111) int local111 = Static290.anInt5893 * 4 + 48 + 208 - local68 / 32 - Static290.anInt5893 * 2;
		Static248.aClass60_22.method5694((float) arg1.anInt1829 / 2.0F + (float) arg3, (float) arg1.anInt1806 / 2.0F + (float) arg2, (float) local94, (float) local111, local65, local58 << 2, local14, arg3, arg2);
		@Pc(162) int local162;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(194) int local194;
		for (@Pc(145) Class4_Sub36 local145 = (Class4_Sub36) Static78.aClass130_28.method3499(); local145 != null; local145 = (Class4_Sub36) Static78.aClass130_28.method3512()) {
			@Pc(150) int local150 = local145.anInt5967;
			local162 = (Static200.aClass158_3.anIntArray422[local150] >> 14 & 0x3FFF) - Static10.anInt231;
			local172 = (Static200.aClass158_3.anIntArray422[local150] & 0x3FFF) - Static81.anInt1732;
			local183 = local162 * 4 + 2 - local49 / 32;
			local194 = local172 * 4 + 2 - local68 / 32;
			Static114.method2079(arg3, arg2, local14, arg1, local194, Static200.aClass158_3.anIntArray423[local150], local183, arg0);
		}
		for (local162 = 0; local162 < Static146.anInt3284; local162++) {
			local172 = Static71.anIntArray155[local162] * 4 + 2 - local49 / 32;
			local183 = Static48.anIntArray121[local162] * 4 + 2 - local68 / 32;
			@Pc(249) Class56 local249 = Static320.method5290(Static277.anIntArray457[local162]);
			if (local249.anIntArray151 != null) {
				local249 = local249.method1093();
				if (local249 == null || local249.anInt1308 == -1) {
					continue;
				}
			}
			Static114.method2079(arg3, arg2, local14, arg1, local183, local249.anInt1308, local172, arg0);
		}
		for (@Pc(284) Class4_Sub21 local284 = (Class4_Sub21) Static178.aClass198_35.method5268(); local284 != null; local284 = (Class4_Sub21) Static178.aClass198_35.method5263()) {
			local183 = (int) (local284.aLong259 >> 28 & 0x3L);
			if (local183 == Static270.anInt6606) {
				local194 = (int) (local284.aLong259 & 0x3FFFL) * 4 + 2 - local49 / 32;
				@Pc(333) int local333 = (int) (local284.aLong259 >> 14 & 0x3FFFL) * 4 + 2 - local68 / 32;
				Static2.method4193(arg1, local333, Static27.aClass60Array2[0], arg3, arg2, local14, local194);
			}
		}
		@Pc(401) int local401;
		@Pc(410) int local410;
		for (local183 = 0; local183 < Static282.anInt5712; local183++) {
			@Pc(363) Class2_Sub2_Sub1_Sub2 local363 = Static101.aClass2_Sub2_Sub1_Sub2Array6[Static332.anIntArray523[local183]];
			if (local363 != null && local363.method5441()) {
				@Pc(374) Class34 local374 = local363.aClass34_1;
				if (local374 != null && local374.anIntArray108 != null) {
					local374 = local374.method748();
				}
				if (local374 != null && local374.aBoolean57 && local374.aBoolean56) {
					local401 = local363.anInt6465 / 32 - local49 / 32;
					local410 = local363.anInt6466 / 32 - local68 / 32;
					if (local374.anInt851 == -1) {
						Static2.method4193(arg1, local410, Static27.aClass60Array2[1], arg3, arg2, local14, local401);
					} else {
						Static114.method2079(arg3, arg2, local14, arg1, local410, local374.anInt851, local401, arg0);
					}
				}
			}
		}
		@Pc(489) int local489;
		for (local194 = 0; local194 < Static156.anInt3506; local194++) {
			@Pc(457) Class2_Sub2_Sub1_Sub1 local457 = Static253.aClass2_Sub2_Sub1_Sub1Array1[Static39.anIntArray105[local194]];
			if (local457 != null && local457.method651()) {
				local401 = local457.anInt6465 / 32 - local49 / 32;
				local410 = local457.anInt6466 / 32 - local68 / 32;
				@Pc(487) boolean local487 = false;
				for (local489 = 0; local489 < Static164.anInt3686; local489++) {
					if (local457.aString22.equals(Static284.aStringArray41[local489]) && Static218.anIntArray376[local489] != 0) {
						local487 = true;
						break;
					}
				}
				@Pc(515) boolean local515 = false;
				for (@Pc(517) int local517 = 0; local517 < Static230.anInt4799; local517++) {
					if (local457.aString22.equals(Static297.aClass219Array1[local517].aString257)) {
						local515 = true;
						break;
					}
				}
				@Pc(537) boolean local537 = false;
				if (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt717 != 0 && local457.anInt717 != 0 && local457.anInt717 == Static110.aClass2_Sub2_Sub1_Sub1_1.anInt717) {
					local537 = true;
				}
				if (local487) {
					Static2.method4193(arg1, local410, Static27.aClass60Array2[3], arg3, arg2, local14, local401);
				} else if (local515) {
					Static2.method4193(arg1, local410, Static27.aClass60Array2[5], arg3, arg2, local14, local401);
				} else if (local537) {
					Static2.method4193(arg1, local410, Static27.aClass60Array2[4], arg3, arg2, local14, local401);
				} else {
					Static2.method4193(arg1, local410, Static27.aClass60Array2[2], arg3, arg2, local14, local401);
				}
			}
		}
		@Pc(619) Class121[] local619 = Static190.aClass121Array1;
		@Pc(714) int local714;
		for (local401 = 0; local401 < local619.length; local401++) {
			@Pc(627) Class121 local627 = local619[local401];
			if (local627 != null && local627.anInt3844 != 0 && Static342.anInt6706 % 20 < 10) {
				@Pc(682) int local682;
				if (local627.anInt3844 == 1 && local627.anInt3846 >= 0 && local627.anInt3846 < Static101.aClass2_Sub2_Sub1_Sub2Array6.length) {
					@Pc(660) Class2_Sub2_Sub1_Sub2 local660 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local627.anInt3846];
					if (local660 != null) {
						local489 = local660.anInt6465 / 32 - local49 / 32;
						local682 = local660.anInt6466 / 32 - local68 / 32;
						Static203.method3610(arg1, local14, local682, 360000, arg2, local489, local627.anInt3848, arg3);
					}
				}
				if (local627.anInt3844 == 2) {
					local714 = (local627.anInt3841 - Static10.anInt231) * 4 + 2 - local49 / 32;
					local489 = (local627.anInt3845 - Static81.anInt1732) * 4 + 2 - local68 / 32;
					local682 = local627.anInt3839 * 4;
					local682 *= local682;
					Static203.method3610(arg1, local14, local489, local682, arg2, local714, local627.anInt3848, arg3);
				}
				if (local627.anInt3844 == 10 && local627.anInt3846 >= 0 && local627.anInt3846 < Static253.aClass2_Sub2_Sub1_Sub1Array1.length) {
					@Pc(769) Class2_Sub2_Sub1_Sub1 local769 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local627.anInt3846];
					if (local769 != null) {
						local489 = local769.anInt6465 / 32 - local49 / 32;
						local682 = local769.anInt6466 / 32 - local68 / 32;
						Static203.method3610(arg1, local14, local682, 360000, arg2, local489, local627.anInt3848, arg3);
					}
				}
			}
		}
		if (Static303.anInt3065 == 4) {
			return;
		}
		if (Static321.anInt6340 != 0) {
			local410 = Static321.anInt6340 * 4 + (Static110.aClass2_Sub2_Sub1_Sub1_1.method5425() + -1) * 2 + 2 - local49 / 32;
			local714 = Static219.anInt4563 * 4 + (Static110.aClass2_Sub2_Sub1_Sub1_1.method5425() + -1) * 2 + 2 - local68 / 32;
			Static2.method4193(arg1, local714, Static234.aClass60Array13[Static165.aBoolean283 ? 1 : 0], arg3, arg2, local14, local410);
		}
		arg0.method4502(arg1.anInt1806 / 2 + arg2 - 1, 3, arg1.anInt1829 / 2 + arg3 - 1, 3, -1);
		return;
	}
}
