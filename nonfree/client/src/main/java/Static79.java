import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "Z")
	private static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "Lclient!bv;")
	private static final Class37 aClass37_15 = new Class37();

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
	private static int anInt1416 = 0;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
	public static synchronized void method1340() {
		anInt1416--;
		if (anInt1416 == 0) {
			method1342();
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!o;I)V")
	public static synchronized void method1341(@OriginalArg(0) Interface11 arg0) {
		if (aBoolean87) {
			return;
		}
		if (anInt1416 > 0) {
			@Pc(9) Class1_Sub12 local9 = new Class1_Sub12();
			local9.anInterface11_1 = arg0;
			aClass37_15.method970(local9);
		} else {
			arg0.NA(false);
		}
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V")
	public static synchronized void method1342() {
		while (true) {
			@Pc(9) Class1_Sub12 local9 = (Class1_Sub12) aClass37_15.method973();
			if (local9 == null) {
				return;
			}
			local9.anInterface11_1.NA(true);
			local9.method7525();
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V")
	public static synchronized void method1343() {
		anInt1416++;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)V")
	public static synchronized void method1344() {
		aBoolean87 = true;
	}
}
