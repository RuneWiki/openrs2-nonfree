import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	public static int anInt3780 = 0;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Lclient!ud;")
	public static final Class245 aClass245_9 = new Class245(1, 2, 2, 0);

	@OriginalMember(owner = "client!le", name = "n", descriptor = "I")
	public static int anInt3783 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)Lclient!hd;")
	public static Class110 method2992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class110 local7 = Static235.method3185(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass110Array1 == null || arg1 >= local7.aClass110Array1.length) {
			return null;
		} else {
			return local7.aClass110Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public static void method2996() {
		Static234.aBoolean295 = false;
		Static142.aClipboard1 = null;
		Static194.method5772();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)V")
	public static void method2997(@OriginalArg(0) int arg0) {
		Static325.anInt5269 = arg0;
		Static276.anInt4603 = -1;
		Static90.anInt1730 = 3;
		Static373.anInt6112 = 100;
	}
}
