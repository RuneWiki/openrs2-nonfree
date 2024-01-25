import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!io;")
	public static final Class7_Sub3_Sub2 aClass7_Sub3_Sub2_1 = new Class7_Sub3_Sub2(5000);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!qf;IIIII)V")
	public static void method510(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3695 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static142.anIntArrayArrayArray11[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class7_Sub16_Sub1 local33 = Static116.aClass7_Sub16_Sub1Array1[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt3695; local35++) {
							if (arg0.aClass7_Sub16_Sub1Array3[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass7_Sub16_Sub1Array3[arg0.anInt3695++] = local33;
						if (arg0.anInt3695 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt3695; local7 < 4; local7++) {
			arg0.aClass7_Sub16_Sub1Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)V")
	public static void method511() {
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			Static341.aBooleanArray31[local10] = false;
		}
		Static70.anInt1731 = Static203.anInt4014;
		Static224.anInt4469 = Static138.anInt3022;
		Static118.anInt6324 = 5;
		Static82.anInt2148 = -1;
		Static51.anInt1370 = Static212.anInt4234;
		Static312.anInt5954 = Static271.anInt5361;
		Static215.anInt4292 = Static24.anInt478;
		Static136.anInt2916 = 0;
		Static113.anInt2571 = Static179.anInt3660;
		Static138.anInt3018 = -1;
		Static126.anInt2791 = 0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
	public static void method512() {
		for (@Pc(5) int local5 = 0; local5 < Static321.aClass14ArrayArray1.length; local5++) {
			for (@Pc(8) int local8 = 0; local8 < Static321.aClass14ArrayArray1[local5].length; local8++) {
				Static321.aClass14ArrayArray1[local5][local8] = Static339.aClass14_2;
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method513(@OriginalArg(0) String arg0) {
		Static249.aString99 = arg0;
		if (Static116.aClass21_4.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static116.aClass21_4.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static116.aClass21_4.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static244.method4208(Static335.method5308() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static362.method3351(Static116.aClass21_4.anApplet1, "document.cookie=\"" + local39 + "\"");
		} catch (@Pc(87) Throwable local87) {
		}
	}
}
