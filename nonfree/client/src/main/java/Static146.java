import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString210 = "Please wait...";

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
	public static void method2933(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static132.method2660();
		} else if (arg0 == 2) {
			Static270.method4500();
		} else if (arg0 == 3) {
			Static124.method2594();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)I")
	public static int method2934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)Lclient!wd;")
	public static Class213 method2935(@OriginalArg(0) int arg0) {
		@Pc(18) Class213 local18 = (Class213) Static225.aClass103_44.method2682((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static312.aClass180_90.method4560(arg0, 4);
		local18 = new Class213();
		if (local28 != null) {
			local18.method5572(arg0, new Class7_Sub3(local28));
		}
		local18.method5573(arg0);
		Static225.aClass103_44.method2687(local18, (long) arg0);
		return local18;
	}
}
