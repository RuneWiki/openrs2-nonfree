import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Lclient!uk;")
	public static Class14_Sub47 aClass14_Sub47_2 = null;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Lclient!id;")
	public static Class169_Sub1 method6270() {
		return Static545.aClass169_Sub1Array2.length > Static4.anInt57 ? Static545.aClass169_Sub1Array2[Static4.anInt57++] : null;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BI)V")
	public static void method6271(@OriginalArg(1) int arg0) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg0, 10);
		local9.method4001();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLclient!ha;Lclient!qga;)V")
	public static void method6273(@OriginalArg(1) Class144 arg0, @OriginalArg(2) Class299 arg1) {
		@Pc(33) boolean local33 = Static252.aClass56_1.method1051(arg1.anInt8623, arg1.anInt8530 | 0xFF000000, arg0, arg1.aBoolean608 ? Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1 : null, arg1.anInt8536, arg1.anInt8565, arg1.anInt8621) == null;
		if (local33) {
			Static466.aClass32_45.method582(new Class14_Sub35(arg1.anInt8621, arg1.anInt8565, arg1.anInt8623, arg1.anInt8530 | 0xFF000000, arg1.anInt8536, arg1.aBoolean608));
			Static538.method7933(arg1);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLjava/lang/String;Lclient!iha;BLjava/lang/String;Z)V")
	public static void method6275(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class173 arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4) {
		if (!arg0) {
			Static508.method7613(arg3, 3, arg2);
			return;
		}
		@Pc(26) String local26;
		if (Static251.aString65.startsWith("win") && arg2.aBoolean358) {
			local26 = null;
			if (Static531.anApplet2 != null) {
				local26 = Static531.anApplet2.getParameter("haveie6");
			}
			if (local26 == null || !local26.equals("1")) {
				@Pc(48) Class230 local48 = Static508.method7613(arg3, 0, arg2);
				Static327.aClass173_4 = arg2;
				Static82.aString26 = arg3;
				Static188.aClass230_3 = local48;
				return;
			}
		}
		if (Static251.aString65.startsWith("mac")) {
			local26 = null;
			if (Static531.anApplet2 != null) {
				local26 = Static531.anApplet2.getParameter("havefirefox");
			}
			if (local26 != null && local26.equals("1") && arg4) {
				Static637.method8919(arg2, 1, arg3, arg1);
				return;
			}
		}
		Static508.method7613(arg3, 2, arg2);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6276(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
