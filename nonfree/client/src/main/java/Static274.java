import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!hga;")
	public static Class141 aClass141_3;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Lclient!wp;")
	public static Class392 aClass392_1;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Z")
	public static boolean aBoolean382 = false;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)V")
	public static void method4661(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub18 local16 = (Class2_Sub18) Static284.aClass335_14.method8357((long) arg0);
		if (local16 != null) {
			local16.aClass78_Sub1_1.method1999();
			Static432.method7065(local16.anInt1619, local16.aBoolean112);
			local16.method9825();
		}
	}
}
