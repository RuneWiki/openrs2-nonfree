import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!wn;Z)V")
	public static void method1049(@OriginalArg(0) Class14_Sub3_Sub21 arg0) {
		@Pc(7) boolean local7 = false;
		arg0.method9253();
		for (@Pc(19) Class14_Sub3_Sub21 local19 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1826(); local19 != null; local19 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1827()) {
			if (Static379.method9309(arg0.method9257(), local19.method9257())) {
				local7 = true;
				Static285.method4072(local19, arg0);
				break;
			}
		}
		if (!local7) {
			Static563.aClass73_11.method1816(arg0);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method1051(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = new byte[arg0.length];
			Static681.method2476(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}
}
