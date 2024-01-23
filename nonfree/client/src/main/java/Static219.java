import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "Lclient!nk;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
	public static int anInt4499 = 0;

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "Lclient!gd;")
	public static Class61 aClass61_40 = new Class61(5);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Lclient!cc;")
	public static Class23 method3422(@OriginalArg(0) int arg0) {
		@Pc(18) Class23 local18 = (Class23) Static144.aClass61_22.method1384((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(29) byte[] local29 = Static133.aClass132_47.method3194(30, arg0);
		local18 = new Class23();
		if (local29 != null) {
			local18.method529(new Class8_Sub2(local29), arg0);
		}
		Static144.aClass61_22.method1377((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method3423(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(15) byte[] local15 = new byte[local6];
		Static301.method502(arg0, 0, local15, 0, local6);
		return local15;
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V")
	public static void method3425() {
		Static299.aClass8_Sub1_Sub3_8 = null;
		Static91.aClass8_Sub1_Sub3_6 = null;
		Static177.aClass8_Sub1_Sub3_4 = null;
		Static89.aClass8_Sub1_Sub3_5 = null;
	}
}
