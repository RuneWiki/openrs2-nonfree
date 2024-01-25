import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
	private static int anInt135 = 0;

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "Z")
	private static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "Lclient!fh;")
	private static final Class114 aClass114_1 = new Class114();

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V")
	public static synchronized void method103() {
		anInt135++;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZB)V")
	public static synchronized void method104() {
		aBoolean19 = true;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
	public static synchronized void method105() {
		while (true) {
			@Pc(8) Class2_Sub36 local8 = (Class2_Sub36) aClass114_1.method2765();
			if (local8 == null) {
				return;
			}
			local8.anInterface3_1.w(true);
			local8.method8920();
		}
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)V")
	public static synchronized void method106() {
		anInt135--;
		if (anInt135 == 0) {
			method105();
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lclient!e;I)V")
	public static synchronized void method107(@OriginalArg(0) Interface3 arg0) {
		if (aBoolean19) {
			return;
		}
		if (anInt135 <= 0) {
			arg0.w(false);
		} else {
			@Pc(15) Class2_Sub36 local15 = new Class2_Sub36();
			local15.anInterface3_1 = arg0;
			aClass114_1.method2771(local15);
		}
	}
}
