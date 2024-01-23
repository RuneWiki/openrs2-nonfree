import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "[[Lclient!hi;")
	public static Class66[][] aClass66ArrayArray1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
	public static int anInt4956 = 0;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString290 = "red:";

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[Lclient!hi;I)V")
	public static void method4261(@OriginalArg(0) int arg0, @OriginalArg(1) Class66[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(15) Class66 local15 = arg1[local7];
			if (local15 != null) {
				if (local15.anInt2176 == 0) {
					if (local15.aClass66Array3 != null) {
						method4261(arg0, local15.aClass66Array3);
					}
					@Pc(39) Class1_Sub25 local39 = (Class1_Sub25) Static302.aClass142_26.method3543((long) local15.anInt2157);
					if (local39 != null) {
						Static290.method4438(arg0, local39.anInt4289);
					}
				}
				@Pc(56) Class1_Sub10 local56;
				if (arg0 == 0 && local15.anObjectArray24 != null) {
					local56 = new Class1_Sub10();
					local56.aClass66_10 = local15;
					local56.anObjectArray1 = local15.anObjectArray24;
					Static194.method3152(local56);
				}
				if (arg0 == 1 && local15.anObjectArray2 != null) {
					if (local15.anInt2178 >= 0) {
						@Pc(82) Class66 local82 = Static53.method968(local15.anInt2157);
						if (local82 == null || local82.aClass66Array3 == null || local82.aClass66Array3.length <= local15.anInt2178 || local82.aClass66Array3[local15.anInt2178] != local15) {
							continue;
						}
					}
					local56 = new Class1_Sub10();
					local56.aClass66_10 = local15;
					local56.anObjectArray1 = local15.anObjectArray2;
					Static194.method3152(local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method4262(@OriginalArg(0) long arg0) {
		Static72.aCalendar5.setTime(new Date(arg0));
		@Pc(13) int local13 = Static72.aCalendar5.get(7);
		@Pc(17) int local17 = Static72.aCalendar5.get(5);
		@Pc(21) int local21 = Static72.aCalendar5.get(2);
		@Pc(25) int local25 = Static72.aCalendar5.get(1);
		@Pc(29) int local29 = Static72.aCalendar5.get(11);
		@Pc(41) int local41 = Static72.aCalendar5.get(12);
		@Pc(45) int local45 = Static72.aCalendar5.get(13);
		return Static70.aStringArray5[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static233.aStringArray32[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
	public static void method4263() {
		Static296.aClass187_148.method4525();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!ia;IIIB)Z")
	public static boolean method4264(@OriginalArg(1) int arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class20 local10 = Static307.method4654(arg1.anInt2375);
		if (local10.anInt559 == -1) {
			return true;
		}
		if (arg1.aBoolean154) {
			@Pc(25) int local25 = arg3 + arg1.anInt2383;
			arg3 = local25 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(40) Class23_Sub1 local40 = local10.method502(arg1.aBoolean145, arg3);
		if (local40 == null) {
			return false;
		}
		@Pc(48) int local48 = arg1.anInt2377;
		@Pc(51) int local51 = arg1.anInt2385;
		@Pc(54) int local54 = local40.anInt4476;
		if ((arg3 & 0x1) == 1) {
			local48 = arg1.anInt2385;
			local51 = arg1.anInt2377;
		}
		@Pc(69) int local69 = local40.anInt4468;
		if (local10.aBoolean23) {
			local54 = local48 * 4;
			local69 = local51 * 4;
		}
		if (local10.anInt550 == 0) {
			local40.method1496(arg0 * 4 + 48, (-local51 + 104 + -arg2) * 4 + 48, local54, local69);
		} else {
			local40.method1501(arg0 * 4 + 48, (-arg2 + 104 + -local51) * 4 + 48, local54, local69, local10.anInt550);
		}
		return true;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!nk;ILclient!nk;)V")
	public static void method4265(@OriginalArg(0) Class121 arg0, @OriginalArg(2) Class121 arg1) {
		Static11.aClass1_Sub2_Sub6_1 = Static43.method811(Static192.anInt3639, arg0, arg1);
		if (Static156.aBoolean211) {
			Static34.aClass1_Sub2_Sub6_Sub1_4 = Static142.method2461(Static192.anInt3639, arg1, arg0);
		} else {
			Static34.aClass1_Sub2_Sub6_Sub1_4 = (Class1_Sub2_Sub6_Sub1) Static11.aClass1_Sub2_Sub6_1;
		}
		Static140.aClass1_Sub2_Sub6_3 = Static43.method811(Static178.anInt3426, arg0, arg1);
		Static307.aClass1_Sub2_Sub6_4 = Static43.method811(Static126.anInt1738, arg0, arg1);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)Lclient!ng;")
	public static Class1_Sub2_Sub12 method4266() {
		if (Static109.aClass170_9 == null) {
			return null;
		}
		for (@Pc(21) Class1_Sub2_Sub12 local21 = (Class1_Sub2_Sub12) Static117.aClass124_1.method3168(); local21 != null; local21 = (Class1_Sub2_Sub12) Static117.aClass124_1.method3168()) {
			@Pc(29) Class175 local29 = Static210.method3349(local21.anInt3591);
			if (local29 != null && local29.aBoolean342 && local29.method4294()) {
				return local21;
			}
		}
		return null;
	}
}
