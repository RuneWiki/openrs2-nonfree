import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
	private static int anInt5017 = 0;

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "Lclient!wba;")
	private static final Class353 aClass353_30 = new Class353();

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "Z")
	private static boolean aBoolean409 = false;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)V")
	public static synchronized void method4084() {
		anInt5017++;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	public static synchronized void method4085() {
		anInt5017--;
		if (anInt5017 == 0) {
			method4088();
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZB)V")
	public static synchronized void method4086() {
		aBoolean409 = true;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLclient!p;)V")
	public static synchronized void method4087(@OriginalArg(1) Interface15 arg0) {
		if (aBoolean409) {
			return;
		}
		if (anInt5017 > 0) {
			@Pc(13) Class1_Sub12 local13 = new Class1_Sub12();
			local13.anInterface15_1 = arg0;
			aClass353_30.method7679(local13);
		} else {
			arg0.UA(false);
		}
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V")
	public static synchronized void method4088() {
		while (true) {
			@Pc(4) Class1_Sub12 local4 = (Class1_Sub12) aClass353_30.method7688();
			if (local4 == null) {
				return;
			}
			local4.anInterface15_1.UA(true);
			local4.method7859();
		}
	}
}
