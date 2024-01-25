import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ica", name = "B", descriptor = "I")
	public static int anInt3913;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
	public static void method3499() {
		for (@Pc(6) Class4_Sub36 local6 = (Class4_Sub36) Static88.aClass244_18.method5963(); local6 != null; local6 = (Class4_Sub36) Static88.aClass244_18.method5965()) {
			if (local6.aBoolean563) {
				local6.method6756();
			}
		}
		for (@Pc(30) Class4_Sub36 local30 = (Class4_Sub36) Static190.aClass244_25.method5963(); local30 != null; local30 = (Class4_Sub36) Static190.aClass244_25.method5965()) {
			if (local30.aBoolean563) {
				local30.method6756();
			}
		}
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)V")
	public static void method3500() {
		if (Static406.aClass354_5.aBoolean711 && Static442.aClass342_5.anInt9881 != -1) {
			Static480.method8253(Static442.aClass342_5.anInt9881, Static442.aClass342_5.aString96);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(II)Lclient!kb;")
	public static Class183 method3501(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static455.aFloat121 == 3.0D) {
				return Static230.aClass183_3;
			}
			if ((double) Static455.aFloat121 == 4.0D) {
				return Static428.aClass183_6;
			}
			if ((double) Static455.aFloat121 == 6.0D) {
				return Static471.aClass183_8;
			}
			if ((double) Static455.aFloat121 >= 8.0D) {
				return Static224.aClass183_2;
			}
		} else if (arg0 == 1) {
			if ((double) Static455.aFloat121 == 3.0D) {
				return Static471.aClass183_8;
			}
			if ((double) Static455.aFloat121 == 4.0D) {
				return Static224.aClass183_2;
			}
			if ((double) Static455.aFloat121 == 6.0D) {
				return Static451.aClass183_7;
			}
			if ((double) Static455.aFloat121 >= 8.0D) {
				return Static347.aClass183_4;
			}
		} else if (arg0 == 2) {
			if ((double) Static455.aFloat121 == 3.0D) {
				return Static451.aClass183_7;
			}
			if ((double) Static455.aFloat121 == 4.0D) {
				return Static347.aClass183_4;
			}
			if ((double) Static455.aFloat121 == 6.0D) {
				return Static347.aClass183_5;
			}
			if ((double) Static455.aFloat121 >= 8.0D) {
				return Static2.aClass183_1;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static219.method3585(arg0, arg1) || Static485.method7231(arg1, arg0);
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(8) int arg6) {
		Static8.aClass314Array1[Static343.anInt6653++] = new Class314(4, arg2, arg1, arg5, arg5, arg1, arg4, arg6, arg6, arg4, arg3, arg3, arg0, arg0);
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILclient!un;)Lclient!mba;")
	public static Class4_Sub1 method3504(@OriginalArg(1) Class4_Sub11 arg0) {
		arg0.method4905();
		@Pc(13) int local13 = arg0.method4905();
		@Pc(17) Class4_Sub1 local17 = Static557.method1158(local13);
		local17.anInt10269 = arg0.method4905();
		@Pc(26) int local26 = arg0.method4905();
		for (@Pc(36) int local36 = 0; local36 < local26; local36++) {
			@Pc(42) int local42 = arg0.method4905();
			local17.method8389(local42, arg0);
		}
		local17.method8391();
		return local17;
	}
}
