import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Lclient!mb;")
	public static Class70 aClass70_43;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
	public static int anInt4594 = 0;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!ie;")
	public static Class53 aClass53_29 = new Class53(5);

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!ie;")
	public static Class53 aClass53_30 = new Class53(64);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	public static void method3598() {
		Static192.aClass53_25.method1496(5);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILclient!vb;Lclient!s;)V")
	public static void method3599(@OriginalArg(1) int arg0, @OriginalArg(2) Class70_Sub1 arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(9) Class105 local9 = Static28.aClass105_4;
		synchronized (Static28.aClass105_4) {
			for (@Pc(18) Class1_Sub12 local18 = (Class1_Sub12) Static28.aClass105_4.method3120(); local18 != null; local18 = (Class1_Sub12) Static28.aClass105_4.method3109()) {
				if (local18.aLong170 == (long) arg0 && arg2 == local18.aClass100_32 && local18.anInt1479 == 0) {
					local3 = local18.aByteArray15;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(69) byte[] local69 = arg2.method3047(arg0);
			arg1.method3549(local69, arg0, arg2, true);
		} else {
			arg1.method3549(local3, arg0, arg2, true);
		}
	}
}
