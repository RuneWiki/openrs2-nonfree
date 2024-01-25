import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!of", name = "c", descriptor = "[Lclient!ho;")
	public static Class9[] aClass9Array125;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "Lclient!vo;")
	public static Class377 aClass377_1;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Z")
	public static boolean aBoolean484 = false;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "I")
	public static int anInt7264 = -1;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "J")
	public static long aLong210 = 0L;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!qd;Z)V")
	public static void method6241(@OriginalArg(0) Class6_Sub45 arg0) {
		if (Static441.aClass351ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface18 local8 = null;
		if (arg0.anInt8107 == 0) {
			local8 = (Interface18) Static401.method5788(arg0.anInt8116, arg0.anInt8112, arg0.anInt8113);
		}
		if (arg0.anInt8107 == 1) {
			local8 = (Interface18) Static567.method7938(arg0.anInt8116, arg0.anInt8112, arg0.anInt8113);
		}
		if (arg0.anInt8107 == 2) {
			local8 = (Interface18) Static486.method7064(arg0.anInt8116, arg0.anInt8112, arg0.anInt8113, oc.class);
		}
		if (arg0.anInt8107 == 3) {
			local8 = (Interface18) Static82.method1398(arg0.anInt8116, arg0.anInt8112, arg0.anInt8113);
		}
		if (local8 == null) {
			arg0.anInt8111 = 0;
			arg0.anInt8106 = -1;
			arg0.anInt8105 = 0;
		} else {
			arg0.anInt8106 = local8.method8469();
			arg0.anInt8105 = local8.method8473();
			arg0.anInt8111 = local8.method8472();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!pja;)V")
	public static void method6242(@OriginalArg(1) Class6_Sub4_Sub12 arg0) {
		if (Static277.aBoolean303) {
			return;
		}
		arg0.method9174();
		Static183.anInt3155--;
		if (!arg0.aBoolean505) {
			@Pc(84) long local84 = arg0.aLong225;
			@Pc(90) Class6_Sub4_Sub10 local90;
			for (local90 = (Class6_Sub4_Sub10) Static472.aClass209_45.method5038(local84); local90 != null && !local90.aString71.equals(arg0.aString98); local90 = (Class6_Sub4_Sub10) Static472.aClass209_45.method5042()) {
			}
			if (local90 != null && local90.method4628(arg0)) {
				Static376.method5350(local90);
			}
			return;
		}
		for (@Pc(25) Class6_Sub4_Sub10 local25 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8910(); local25 != null; local25 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8908()) {
			if (local25.aString71.equals(arg0.aString98)) {
				@Pc(35) boolean local35 = false;
				for (@Pc(41) Class6_Sub4_Sub12 local41 = (Class6_Sub4_Sub12) local25.aClass384_11.method8910(); local41 != null; local41 = (Class6_Sub4_Sub12) local25.aClass384_11.method8908()) {
					if (arg0 == local41) {
						local35 = true;
						if (local25.method4628(arg0)) {
							Static376.method5350(local25);
						}
						break;
					}
				}
				if (local35) {
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(CB)Z")
	public static boolean method6243(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(JBI)Ljava/lang/String;")
	public static String method6244(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		Static351.method5106(arg0);
		@Pc(17) int local17 = Static43.aCalendar1.get(5);
		@Pc(21) int local21 = Static43.aCalendar1.get(2);
		@Pc(25) int local25 = Static43.aCalendar1.get(1);
		return arg1 == 3 ? Static164.method9057(arg0, arg1) : Integer.toString(local17 / 10) + local17 % 10 + "-" + Static527.aStringArrayArray2[arg1][local21] + "-" + local25;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIIZI)Lclient!tca;")
	public static Class6_Sub51 method6245(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class6_Sub51 local7 = new Class6_Sub51();
		local7.anInt9360 = arg1;
		local7.anInt9358 = arg3;
		Static262.aClass209_35.method5035((long) arg2, local7);
		Static657.method8945(arg1);
		@Pc(26) Class321 local26 = Static286.method4134(arg2);
		if (local26 != null) {
			Static293.method4206(local26);
		}
		if (Static590.aClass321_53 != null) {
			Static293.method4206(Static590.aClass321_53);
			Static590.aClass321_53 = null;
		}
		Static515.method7286();
		if (local26 != null) {
			Static351.method5107(local26, !arg0);
		}
		if (!arg0) {
			Static295.method4219(arg1);
		}
		if (!arg0 && Static561.anInt9357 != -1) {
			Static363.method5233(1, Static561.anInt9357);
		}
		return local7;
	}
}
