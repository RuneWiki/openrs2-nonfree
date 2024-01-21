import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
	public static int anInt1431;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_386 = Static81.method1507("scape main");

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_387 = Static81.method1507("headicons_pk");

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
	public static int anInt1427 = 0;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_388 = Static81.method1507(")1 ");

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_390 = Static81.method1507("Could not complete login)3");

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Lclient!dj;")
	public static Class24 aClass24_389 = aClass24_390;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_391 = Static81.method1507("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)I")
	public static int method1103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Lclient!dj;")
	public static Class24 method1104(@OriginalArg(0) int arg0) {
		return Static63.method1281(new Class24[] { Static175.method3020(arg0 >> 24 & 0xFF), Static130.aClass24_861, Static175.method3020(arg0 >> 16 & 0xFF), Static130.aClass24_861, Static175.method3020(arg0 >> 8 & 0xFF), Static130.aClass24_861, Static175.method3020(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)Lclient!fa;")
	public static Class1_Sub2_Sub9 method1105(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub9 local6 = (Class1_Sub2_Sub9) Static110.aClass86_39.method2816((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static92.aClass69_22.method2208(27, arg0);
		local6 = new Class1_Sub2_Sub9();
		if (local25 != null) {
			local6.method1038(new Class1_Sub7(local25));
		}
		Static110.aClass86_39.method2821(local6, (long) arg0);
		return local6;
	}
}
