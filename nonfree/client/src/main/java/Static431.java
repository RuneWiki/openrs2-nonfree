import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
	private static boolean aBoolean490 = false;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!bu;")
	private static final Class38 aClass38_57 = new Class38();

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private static int anInt7443 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
	public static synchronized void method6346() {
		aBoolean490 = true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!o;)V")
	public static synchronized void method6347(@OriginalArg(1) Interface13 arg0) {
		if (aBoolean490) {
			return;
		}
		if (anInt7443 > 0) {
			@Pc(16) Class1_Sub39 local16 = new Class1_Sub39();
			local16.anInterface13_1 = arg0;
			aClass38_57.method1426(local16);
		} else {
			arg0.NA(false);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static synchronized void method6348() {
		while (true) {
			@Pc(4) Class1_Sub39 local4 = (Class1_Sub39) aClass38_57.method1423();
			if (local4 == null) {
				return;
			}
			local4.anInterface13_1.NA(true);
			local4.method7983();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static synchronized void method6349() {
		anInt7443--;
		if (anInt7443 == 0) {
			method6348();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public static synchronized void method6350() {
		anInt7443++;
	}
}
