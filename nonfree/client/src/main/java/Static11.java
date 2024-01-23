import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	public static int anInt294;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "[Lclient!tg;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array1;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	public static int anInt296;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	public static int anInt298;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "[I")
	public static int[] anIntArray34 = new int[4096];

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Lclient!o;")
	public static Class86 method314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class86 local3 = Static13.method333(arg0);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass86Array1 == null || arg1 >= local3.aClass86Array1.length) {
			return null;
		} else {
			return local3.aClass86Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)Lclient!aa;")
	public static Class1_Sub2_Sub1 method315(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub2_Sub1 local6 = (Class1_Sub2_Sub1) Static46.aClass8_3.method312((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static165.aClass28_41.method819(arg0, 5);
		local6 = new Class1_Sub2_Sub1();
		if (local20 != null) {
			local6.method85(new Class1_Sub26(local20));
		}
		Static46.aClass8_3.method304(local6, (long) arg0);
		return local6;
	}
}
