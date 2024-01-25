import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "Z")
	private static boolean aBoolean447 = false;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Lclient!oe;")
	private static final Class244 aClass244_49 = new Class244();

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	private static int anInt6088 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZB)V")
	public static synchronized void method5181() {
		aBoolean447 = true;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!p;I)V")
	public static synchronized void method5182(@OriginalArg(0) Interface18 arg0) {
		if (aBoolean447) {
			return;
		}
		if (anInt6088 <= 0) {
			arg0.UA(false);
		} else {
			@Pc(13) Class4_Sub22 local13 = new Class4_Sub22();
			local13.anInterface18_1 = arg0;
			aClass244_49.method5960(local13);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
	public static synchronized void method5183() {
		anInt6088--;
		if (anInt6088 == 0) {
			method5185();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public static synchronized void method5184() {
		anInt6088++;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)V")
	public static synchronized void method5185() {
		while (true) {
			@Pc(4) Class4_Sub22 local4 = (Class4_Sub22) aClass244_49.method5968();
			if (local4 == null) {
				return;
			}
			local4.anInterface18_1.UA(true);
			local4.method8379();
		}
	}
}
