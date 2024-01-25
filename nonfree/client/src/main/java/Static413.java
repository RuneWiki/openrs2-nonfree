import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "Lclient!wq;")
	public static Class394 aClass394_4;

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
	public static int anInt7059;

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "Lclient!cl;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BII)Z")
	public static boolean method6079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!rv;I)Lclient!oca;")
	public static Class47_Sub3 method6080(@OriginalArg(0) Class5_Sub15 arg0) {
		return new Class47_Sub3(arg0.method3638(), arg0.method3638(), arg0.method3638(), arg0.method3638(), arg0.method3633(), arg0.method3633(), arg0.method3642());
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)V")
	public static void method6082(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static69.anInt1053 = -1;
		Static62.anInt991 = 1;
		Static96.method1621(arg0, false, arg1);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!li;IZ)V")
	public static void method6083(@OriginalArg(0) Class41_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray521 == null) {
			return;
		}
		@Pc(18) int local18 = arg0.anIntArray521[arg1 + 1];
		if (arg0.anInt9503 == local18) {
			return;
		}
		arg0.anInt9503 = local18;
		arg0.anInt9461 = 1;
		arg0.anInt9525 = arg0.anInt9526;
		arg0.anInt9507 = 0;
		arg0.anInt9459 = 0;
		arg0.anInt9475 = 0;
		if (arg0.anInt9503 != -1) {
			Static119.method1899(arg0.anInt9507, arg0, Static459.aClass128_2.method2686(arg0.anInt9503));
			return;
		}
	}
}
