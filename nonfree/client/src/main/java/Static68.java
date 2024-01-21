import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
	public static int anInt1566;

	@OriginalMember(owner = "client!gj", name = "z", descriptor = "Lclient!nc;")
	public static Class65 aClass65_4;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "Lclient!ka;")
	public static final Class1_Sub14 aClass1_Sub14_3 = new Class1_Sub14(8);

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_627 = Static187.method3089(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)Lclient!qh;")
	public static Class1_Sub3_Sub19 method1065(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub19 local10 = (Class1_Sub3_Sub19) Static6.aClass47_1.method1281((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static144.aClass3_26.method3265(27, arg0);
		local10 = new Class1_Sub3_Sub19();
		if (local20 != null) {
			local10.method2377(new Class1_Sub14(local20));
		}
		Static6.aClass47_1.method1273((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([BB)[B")
	public static byte[] method1066(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg0);
		@Pc(12) int local12 = local8.method3010();
		@Pc(24) int local24 = local8.method3058();
		if (local24 < 0 || Static131.anInt2741 != 0 && Static131.anInt2741 < local24) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(43) byte[] local43 = new byte[local24];
			local8.method3017(local24, local43);
			return local43;
		} else {
			@Pc(55) int local55 = local8.method3058();
			if (local55 < 0 || Static131.anInt2741 != 0 && Static131.anInt2741 < local55) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local55];
			if (local12 == 1) {
				Static134.method1983(local79, local55, arg0, local24);
			} else {
				Static124.aClass72_1.method2077(local8, local79);
			}
			return local79;
		}
	}
}
