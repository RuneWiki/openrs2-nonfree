import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "[Lclient!gj;")
	public static Class64[] aClass64Array1;

	@OriginalMember(owner = "client!ih", name = "Y", descriptor = "Lclient!kb;")
	public static Class83 aClass83_77;

	@OriginalMember(owner = "client!ih", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString77 = "Loading textures - ";

	@OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
	public static int anInt2536 = 0;

	@OriginalMember(owner = "client!ih", name = "cb", descriptor = "Ljava/lang/String;")
	public static String aString78 = " ";

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)Lclient!v;")
	public static Class163 method1895(@OriginalArg(0) int arg0) {
		@Pc(18) Class163 local18 = (Class163) Static80.aClass155_12.method4358((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(34) byte[] local34 = Static186.aClass83_128.method2306(Static152.method2850(arg0), Static239.method4131(arg0));
		local18 = new Class163();
		local18.anInt5921 = arg0;
		if (local34 != null) {
			local18.method4589(new Class1_Sub16(local34));
		}
		local18.method4581();
		Static80.aClass155_12.method4360((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZB)Z")
	public static boolean method1896(@OriginalArg(0) boolean arg0) {
		@Pc(10) boolean local10 = Static214.method3746();
		if (arg0 == local10) {
			return true;
		}
		if (!arg0) {
			Static214.method3742();
		} else if (!Static214.method3743() || !Static214.method3745() || !Static214.method3752()) {
			arg0 = false;
		}
		Static28.aBoolean42 = arg0;
		Static251.method4273(Static43.aClass66_1);
		if (arg0 == local10) {
			return false;
		} else {
			((Class2_Sub1) Static151.anInterface2_1).method4428();
			return true;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Lclient!ok;")
	public static Class116 method1897(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static81.aClass116ArrayArray1[local7] == null || Static81.aClass116ArrayArray1[local7][local11] == null) {
			@Pc(35) boolean local35 = Static91.method1593(local7);
			if (!local35) {
				return null;
			}
		}
		return Static81.aClass116ArrayArray1[local7][local11];
	}
}
