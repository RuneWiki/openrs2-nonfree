import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gka", name = "c", descriptor = "[I")
	public static int[] anIntArray192;

	@OriginalMember(owner = "client!gka", name = "d", descriptor = "Lclient!in;")
	public static final Class169 aClass169_101 = new Class169(40, -2);

	@OriginalMember(owner = "client!gka", name = "f", descriptor = "Lclient!in;")
	public static final Class169 aClass169_102 = new Class169(123, 11);

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(IB)V")
	public static void method3782() {
		Static656.aClass22_68.method468(5);
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(ILjava/lang/Object;BI)[B")
	public static byte[] method3784(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(19) byte[] local19 = (byte[]) arg1;
			return Static414.method6775(arg0, local19);
		} else if (arg1 instanceof Class95) {
			@Pc(31) Class95 local31 = (Class95) arg1;
			return local31.method7799(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
