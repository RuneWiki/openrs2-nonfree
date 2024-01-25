import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "Z")
	private static boolean aBoolean790 = false;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Lclient!qia;")
	private static final Class276 aClass276_57 = new Class276();

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
	private static int anInt9369 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)V")
	public static synchronized void method7732() {
		aBoolean790 = true;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V")
	public static synchronized void method7733() {
		anInt9369++;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!e;)V")
	public static synchronized void method7734(@OriginalArg(1) Interface7 arg0) {
		if (aBoolean790) {
			return;
		}
		if (anInt9369 <= 0) {
			arg0.w(false);
		} else {
			@Pc(19) Class3_Sub20 local19 = new Class3_Sub20();
			local19.anInterface7_1 = arg0;
			aClass276_57.method6906(local19);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public static synchronized void method7735() {
		while (true) {
			@Pc(12) Class3_Sub20 local12 = (Class3_Sub20) aClass276_57.method6911();
			if (local12 == null) {
				return;
			}
			local12.anInterface7_1.w(true);
			local12.method8671();
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public static synchronized void method7736() {
		anInt9369--;
		if (anInt9369 == 0) {
			method7735();
		}
	}
}
