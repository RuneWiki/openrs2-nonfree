import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ot", name = "L", descriptor = "[S")
	public static short[] aShortArray85;

	@OriginalMember(owner = "client!ot", name = "Y", descriptor = "I")
	public static int anInt5167;

	@OriginalMember(owner = "client!ot", name = "U", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_150 = new Class107(18, -2);

	@OriginalMember(owner = "client!ot", name = "Z", descriptor = "I")
	public static int anInt5168 = 0;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!ul;Lclient!ul;Lclient!mf;Lclient!ul;I)Z")
	public static boolean method4280(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class1_Sub19_Sub4 arg2, @OriginalArg(3) Class246 arg3) {
		Static132.aClass246_83 = arg0;
		Static331.aClass246_222 = arg3;
		Static108.aClass246_66 = arg1;
		Static244.aClass1_Sub19_Sub4_2 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)V")
	public static void method4281(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(1, arg0);
		local8.method1775();
	}
}
