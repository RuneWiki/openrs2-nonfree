import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Lclient!fca;")
	private static final Class114 aClass114_59 = new Class114();

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Z")
	private static boolean aBoolean755 = false;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	private static int anInt8873 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!e;)V")
	public static synchronized void method7536(@OriginalArg(1) Interface7 arg0) {
		if (aBoolean755) {
			return;
		}
		if (anInt8873 <= 0) {
			arg0.w(false);
		} else {
			@Pc(15) Class5_Sub13 local15 = new Class5_Sub13();
			local15.anInterface7_1 = arg0;
			aClass114_59.method2807(local15);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public static synchronized void method7537() {
		anInt8873++;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
	public static synchronized void method7538() {
		anInt8873--;
		if (anInt8873 == 0) {
			method7539();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static synchronized void method7539() {
		while (true) {
			@Pc(4) Class5_Sub13 local4 = (Class5_Sub13) aClass114_59.method2813();
			if (local4 == null) {
				return;
			}
			local4.anInterface7_1.w(true);
			local4.method9052();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)V")
	public static synchronized void method7540() {
		aBoolean755 = true;
	}
}
