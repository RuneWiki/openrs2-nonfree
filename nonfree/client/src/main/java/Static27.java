import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "Lclient!gda;")
	public static Class126 aClass126_18;

	@OriginalMember(owner = "client!baa", name = "f", descriptor = "Lclient!jt;")
	public static Class5_Sub28 aClass5_Sub28_1;

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "Lclient!eg;")
	public static Class5_Sub4_Sub2 aClass5_Sub4_Sub2_1;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
	public static int anInt363 = -1;

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
	public static int anInt365 = 0;

	@OriginalMember(owner = "client!baa", name = "g", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)V")
	public static void method419() {
		for (@Pc(15) Class5_Sub11 local15 = (Class5_Sub11) Static3.aClass306_1.method6941(); local15 != null; local15 = (Class5_Sub11) Static3.aClass306_1.method6940()) {
			if (local15.aBoolean88) {
				local15.aBoolean88 = false;
			} else {
				Static419.method6142(local15.anInt1181);
			}
		}
	}
}
