import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "Z")
	private static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "Lclient!gj;")
	private static final Class124 aClass124_17 = new Class124();

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
	private static int anInt2614 = 0;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
	public static synchronized void method2324() {
		anInt2614--;
		if (anInt2614 == 0) {
			method2326();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZI)V")
	public static synchronized void method2325() {
		aBoolean211 = true;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
	public static synchronized void method2326() {
		while (true) {
			@Pc(9) Class4_Sub17 local9 = (Class4_Sub17) aClass124_17.method3272();
			if (local9 == null) {
				return;
			}
			local9.anInterface9_1.H(true);
			local9.method8013();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLclient!g;)V")
	public static synchronized void method2327(@OriginalArg(1) Interface9 arg0) {
		if (aBoolean211) {
			return;
		}
		if (anInt2614 > 0) {
			@Pc(12) Class4_Sub17 local12 = new Class4_Sub17();
			local12.anInterface9_1 = arg0;
			aClass124_17.method3275(local12);
		} else {
			arg0.H(false);
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
	public static synchronized void method2328() {
		anInt2614++;
	}
}
