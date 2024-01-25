import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7937(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V")
	public static void method7939(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub40 local10 = (Class3_Sub40) Static580.aClass25_45.method426((long) arg0);
		if (local10 != null) {
			local10.aClass172_Sub1_1.method7040();
			Static56.method1019(local10.anInt7435, local10.aBoolean535);
			local10.method8682();
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!uv;IBI)V")
	public static void method7940(@OriginalArg(0) Class344 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static459.anInt7854 = arg2;
		Static70.anInt1416 = arg1;
		Static105.aClass344_3 = arg0;
	}
}
