import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!io", name = "I", descriptor = "Lclient!fp;")
	public static final Class83 aClass83_5 = new Class83(14, 0, 4, 1);

	@OriginalMember(owner = "client!io", name = "cb", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!io", name = "db", descriptor = "Z")
	public static boolean aBoolean197 = false;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Lclient!oa;")
	public static Class26_Sub1 method2592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass26_Sub1_2;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method2596() {
		@Pc(7) String local7 = "www";
		if (Static141.aClass136_4 == Static313.aClass136_7) {
			local7 = "www-wtrc";
		} else if (Static216.aClass136_3 == Static313.aClass136_7) {
			local7 = "www-wtqa";
		} else if (Static313.aClass136_7 == Static330.aClass136_8) {
			local7 = "www-wtwip";
		}
		@Pc(34) String local34 = "";
		if (Static240.aString48 != null) {
			local34 = "/p=" + Static240.aString48;
		}
		return "http://" + local7 + "." + Static191.aClass137_3.aString45 + ".com/l=" + Static5.anInt20 + "/a=" + Static274.anInt4622 + local34 + "/";
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)Lclient!ki;")
	public static Class134 method2597(@OriginalArg(0) int arg0) {
		@Pc(12) Class134 local12 = (Class134) Static425.aClass126_60.method2822((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static183.aClass178_47.method3838(arg0, 1);
		local12 = new Class134();
		local12.anInt3784 = arg0;
		if (local22 != null) {
			local12.method3040(new Class7_Sub14(local22));
		}
		local12.method3039();
		if (local12.anInt3787 == 2 && Static79.aClass164_9.method3512((long) arg0) == null) {
			Static79.aClass164_9.method3508((long) arg0, new Class7_Sub2(Static253.anInt4288));
			Static190.aClass134Array1[Static253.anInt4288++] = local12;
		}
		Static425.aClass126_60.method2824((long) arg0, local12);
		return local12;
	}
}
