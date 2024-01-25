import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!l;")
	public static Interface7 anInterface7_4;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!o;")
	public static Class137 aClass137_10;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	public static int anInt3192;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIILclient!ql;)V")
	public static void method2363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class30_Sub5 arg4) {
		@Pc(4) Class252 local4 = Static412.method5598(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt6405 = (arg1 << Static198.anInt7947) + Static333.anInt6111;
		arg4.anInt6406 = arg3;
		arg4.anInt6410 = (arg2 << Static198.anInt7947) + Static333.anInt6111;
		for (@Pc(28) Class208 local28 = local4.aClass208_3; local28 != null; local28 = local28.aClass208_2) {
			if (local28.aClass30_Sub1_1.aBoolean484) {
				@Pc(38) int local38 = local28.aClass30_Sub1_1.method5724();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt6406 += local8;
			arg4.aBoolean407 = true;
		} else if (local4.aClass30_Sub4_2 != null) {
			arg4.anInt6406 -= local4.aClass30_Sub4_2.aShort75;
		}
		local4.aClass30_Sub5_1 = arg4;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BZLjava/lang/String;Lclient!nv;Z)V")
	public static void method2365(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class183 arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static354.method5033(arg2, 3, arg1);
			return;
		}
		@Pc(29) String local29;
		if (Static282.aString38.startsWith("win") && Static282.anInt5394 != 3) {
			local29 = null;
			if (arg2.anApplet1 != null) {
				local29 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local29 == null || !local29.equals("1")) {
				@Pc(49) Class157 local49 = Static354.method5033(arg2, 0, arg1);
				Static16.aClass183_1 = arg2;
				Static368.aString60 = arg1;
				Static361.aClass157_7 = local49;
				return;
			}
		}
		if (Static282.aString38.startsWith("mac")) {
			local29 = null;
			if (arg2.anApplet1 != null) {
				local29 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local29 != null && local29.equals("1") && arg0) {
				Static354.method5033(arg2, 1, arg1);
				return;
			}
		}
		Static354.method5033(arg2, 2, arg1);
	}
}
