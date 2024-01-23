import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	public static int anInt3435;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	public static int anInt3436;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!lc;")
	public static Class98 aClass98_98;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)V")
	public static void method2713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class4_Sub2_Sub21 local4 = Static39.method4121(arg0, 7);
		local4.method4360();
		local4.anInt5492 = arg1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method2714() {
		aClass98_98 = null;
	}
}
