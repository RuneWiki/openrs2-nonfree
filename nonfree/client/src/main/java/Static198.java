import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
	public static int anInt3778 = 100;

	@OriginalMember(owner = "client!jt", name = "z", descriptor = "Lclient!eb;")
	public static final Class58 aClass58_1 = new Class58();

	@OriginalMember(owner = "client!jt", name = "B", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_30 = new Class258();

	@OriginalMember(owner = "client!jt", name = "C", descriptor = "I")
	public static int anInt3783 = -2;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IB)V")
	public static void method2841() {
		@Pc(1) Class69 local1 = Static67.aClass69_13;
		synchronized (Static67.aClass69_13) {
			Static67.aClass69_13.method1594(5);
		}
		local1 = Static51.aClass69_11;
		synchronized (Static51.aClass69_11) {
			Static51.aClass69_11.method1594(5);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZI)I")
	public static int method2844(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
