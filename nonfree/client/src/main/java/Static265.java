import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!wr;")
	public static Class109 aClass109_33;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I")
	public static int method5631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Lclient!fh;")
	public static Class67 method5633(@OriginalArg(1) int arg0) {
		@Pc(5) Class87 local5 = Static322.aClass87_57;
		@Pc(14) Class67 local14;
		synchronized (Static322.aClass87_57) {
			local14 = (Class67) Static322.aClass87_57.method2482((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(36) byte[] local36 = Static147.aClass216_53.method5648(Static289.method4616(arg0), Static214.method4113(arg0));
		local14 = new Class67();
		local14.anInt2099 = arg0;
		if (local36 != null) {
			local14.method1825(new Class1_Sub8(local36));
		}
		@Pc(59) Class87 local59 = Static322.aClass87_57;
		synchronized (Static322.aClass87_57) {
			Static322.aClass87_57.method2481(local14, (long) arg0);
			return local14;
		}
	}
}
