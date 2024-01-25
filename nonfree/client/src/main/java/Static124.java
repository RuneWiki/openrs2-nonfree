import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!el", name = "c", descriptor = "I")
	public static int anInt2401;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	public static int anInt2403;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	public static int anInt2402 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZBI)Lclient!hg;")
	public static Class2_Sub23 method1801(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class2_Sub23) Static562.aClass162_42.method3519(local17);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
	public static int method1802() {
		return Static411.anInt7120;
	}
}
