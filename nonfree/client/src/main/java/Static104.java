import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	public static int anInt1716;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "Lclient!dn;")
	public static final Class86 aClass86_12 = new Class86(4);

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "Lclient!dn;")
	public static final Class86 aClass86_8 = new Class86(1);

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "Lclient!dn;")
	public static final Class86 aClass86_5 = new Class86(1);

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Lclient!dn;")
	public static final Class86 aClass86_6 = new Class86(2);

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "Lclient!dn;")
	public static final Class86 aClass86_7 = new Class86(4);

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Lclient!dn;")
	public static final Class86 aClass86_9 = new Class86(2);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "Lclient!dn;")
	public static final Class86 aClass86_10 = new Class86(4);

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Lclient!dn;")
	public static final Class86 aClass86_11 = new Class86(2);

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "Lclient!ko;")
	public static final Class208 aClass208_1 = new Class208("", 19);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZ)V")
	public static void method1582(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class5_Sub31 local8 = Static93.method1470(arg1, arg0);
		if (local8 != null) {
			local8.method9222();
		}
	}
}
