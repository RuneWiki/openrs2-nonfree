import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	private static int anInt9232 = 0;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Lclient!tg;")
	private static final Class330 aClass330_58 = new Class330();

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "Z")
	private static boolean aBoolean669 = false;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZ)V")
	public static synchronized void method7966() {
		aBoolean669 = true;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public static synchronized void method7967() {
		while (true) {
			@Pc(4) Class5_Sub45 local4 = (Class5_Sub45) aClass330_58.method7911();
			if (local4 == null) {
				return;
			}
			local4.anInterface4_1.w(true);
			local4.method9047();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
	public static synchronized void method7968() {
		anInt9232--;
		if (anInt9232 == 0) {
			method7967();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!e;I)V")
	public static synchronized void method7969(@OriginalArg(0) Interface4 arg0) {
		if (aBoolean669) {
			return;
		}
		if (anInt9232 <= 0) {
			arg0.w(false);
		} else {
			@Pc(20) Class5_Sub45 local20 = new Class5_Sub45();
			local20.anInterface4_1 = arg0;
			aClass330_58.method7917(local20);
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	public static synchronized void method7970() {
		anInt9232++;
	}
}
