import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!np", name = "j", descriptor = "Lclient!of;")
	public static final Class174 aClass174_135 = new Class174("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIB)Lclient!cl;")
	public static Class3_Sub3_Sub4 method3883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) Class3_Sub3_Sub4 local22 = (Class3_Sub3_Sub4) Static365.aClass140_34.method3490((long) arg0 << 32 | (long) arg1);
		if (local22 == null) {
			local22 = new Class3_Sub3_Sub4(arg0, arg1);
			Static365.aClass140_34.method3494(local22.aLong248, local22);
		}
		return local22;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3884(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(51) long local51 = arg0;
				arg0 /= 37L;
				@Pc(65) char local65 = Static301.aCharArray6[(int) (local51 - arg0 * 37L)];
				if (local65 == '_') {
					@Pc(75) int local75 = local47.length() - 1;
					local47.setCharAt(local75, Character.toUpperCase(local47.charAt(local75)));
					local65 = ' ';
				}
				local47.append(local65);
			}
			local47.reverse();
			local47.setCharAt(0, Character.toUpperCase(local47.charAt(0)));
			return local47.toString();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method3885(@OriginalArg(1) Class167 arg0) {
		@Pc(7) int local7 = Static368.anInt6234;
		@Pc(9) int local9 = Static348.anInt5871;
		@Pc(16) int local16 = Static100.anInt1814;
		@Pc(18) int local18 = Static242.anInt4125;
		arg0.method5951(local18, local9, -10660793, local7, local16);
		arg0.method5951(16, local9 + 1, -16777216, local7 + 1, local16 - 2);
		arg0.method6016(local7 + 1, local18 + -19, -16777216, local16 - 2, local9 + 18);
		Static266.aClass18_2.method5167(Static22.aClass174_14.method4208(Static300.anInt5192), -10660793, -1, local7 + 3, local9 + 14);
		@Pc(77) int local77 = Static171.aClass50_1.method4993();
		@Pc(81) int local81 = Static171.aClass50_1.method4989();
		@Pc(83) int local83 = 0;
		for (@Pc(90) Class3_Sub38 local90 = (Class3_Sub38) Static325.aClass193_54.method4519(); local90 != null; local90 = (Class3_Sub38) Static325.aClass193_54.method4525()) {
			@Pc(106) int local106 = local9 + (Static276.anInt4608 - local83 - 1) * 16 + 31;
			@Pc(108) short local108 = -1;
			if (local7 < local77 && local77 < local7 + local16 && local81 > local106 - 13 && local106 + 3 > local81 && local90.aBoolean413) {
				local108 = -256;
			}
			@Pc(149) int[] local149 = null;
			if (Static56.method1096(local90.anInt5875)) {
				local149 = Static158.aClass272_1.method6283((int) local90.aLong199).anIntArray365;
			} else if (local90.anInt5869 != -1) {
				local149 = Static158.aClass272_1.method6283(local90.anInt5869).anIntArray365;
			} else if (Static419.method5747(local90.anInt5875)) {
				@Pc(227) Class3_Sub40 local227 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local90.aLong199);
				if (local227 != null) {
					@Pc(232) Class1_Sub2_Sub6_Sub1 local232 = local227.aClass1_Sub2_Sub6_Sub1_2;
					@Pc(235) Class158 local235 = local232.aClass158_1;
					if (local235.anIntArray294 != null) {
						local235 = local235.method3705(Static119.aClass47_1);
					}
					if (local235 != null) {
						local149 = local235.anIntArray295;
					}
				}
			} else if (Static396.method5462(local90.anInt5875)) {
				@Pc(194) Class31 local194;
				if (local90.anInt5875 == 1007) {
					local194 = Static9.aClass149_1.method3573((int) local90.aLong199);
				} else {
					local194 = Static9.aClass149_1.method3573((int) (local90.aLong199 >>> 32 & 0x7FFFFFFFL));
				}
				if (local194.anIntArray44 != null) {
					local194 = local194.method863(Static119.aClass47_1);
				}
				if (local194 != null) {
					local149 = local194.anIntArray43;
				}
			}
			@Pc(260) String local260 = Static413.method5691(local90);
			if (local149 != null) {
				local260 = local260 + Static270.method3761(local149);
			}
			Static266.aClass18_2.method5161(local106, local108, local7 + 3, Static306.aClass2Array15, local260, Static39.anIntArray31);
			if (local90.aBoolean412) {
				Static330.aClass2_13.method5829(Static251.aClass124_14.method3099(local260) + local7 + 5, local106 + -12);
			}
			local83++;
		}
		Static297.method4223(Static348.anInt5871, Static100.anInt1814, Static368.anInt6234, Static242.anInt4125);
	}
}
