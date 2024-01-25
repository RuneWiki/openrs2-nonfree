import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "Z")
	private static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
	private static int anInt624 = 0;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "Lclient!gw;")
	private static final Class91 aClass91_1 = new Class91();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
	public static synchronized void method522() {
		while (true) {
			@Pc(4) Class4_Sub11 local4 = (Class4_Sub11) aClass91_1.method2583();
			if (local4 == null) {
				return;
			}
			local4.anInterface10_1.pa();
			local4.method6330();
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
	public static synchronized void method523() {
		anInt624--;
		if (anInt624 == 0) {
			method522();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZ)V")
	public static synchronized void method524() {
		aBoolean32 = true;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!v;Z)V")
	public static synchronized void method525(@OriginalArg(0) Interface10 arg0) {
		if (aBoolean32) {
			return;
		}
		if (anInt624 > 0) {
			@Pc(16) Class4_Sub11 local16 = new Class4_Sub11();
			local16.anInterface10_1 = arg0;
			aClass91_1.method2587(local16);
		} else {
			arg0.pa();
		}
	}
}
