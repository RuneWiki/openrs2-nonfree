import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "Lclient!dc;")
	private static final Class70 aClass70_39 = new Class70();

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
	private static int anInt6060 = 0;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "Z")
	private static boolean aBoolean474 = false;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLclient!p;)V")
	public static synchronized void method5080(@OriginalArg(1) Interface18 arg0) {
		if (aBoolean474) {
			return;
		}
		if (anInt6060 <= 0) {
			arg0.UA(false);
		} else {
			@Pc(18) Class2_Sub30 local18 = new Class2_Sub30();
			local18.anInterface18_1 = arg0;
			aClass70_39.method1269(local18);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
	public static synchronized void method5081() {
		aBoolean474 = true;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	public static synchronized void method5082() {
		while (true) {
			@Pc(4) Class2_Sub30 local4 = (Class2_Sub30) aClass70_39.method1262();
			if (local4 == null) {
				return;
			}
			local4.anInterface18_1.UA(true);
			local4.method7657();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public static synchronized void method5083() {
		anInt6060--;
		if (anInt6060 == 0) {
			method5082();
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	public static synchronized void method5084() {
		anInt6060++;
	}
}
