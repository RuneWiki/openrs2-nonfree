import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!mf;")
	private static final Class163 aClass163_42 = new Class163();

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Z")
	private static final boolean aBoolean450 = true;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "Z")
	private static boolean aBoolean451 = false;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLclient!un;)V")
	public static synchronized void method5372(@OriginalArg(1) Interface11 arg0) {
		if (aBoolean450) {
			@Pc(16) Class10_Sub19 local16 = new Class10_Sub19();
			local16.anInterface11_1 = arg0;
			aClass163_42.method3613(local16);
		} else if (!aBoolean451) {
			arg0.p();
			return;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static synchronized void method5373() {
		while (true) {
			@Pc(4) Class10_Sub19 local4 = (Class10_Sub19) aClass163_42.method3622();
			if (local4 == null) {
				return;
			}
			local4.anInterface11_1.p();
			local4.method6033();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)V")
	public static synchronized void method5374() {
		aBoolean451 = true;
	}
}
