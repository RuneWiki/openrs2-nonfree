import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!fea;")
	private static final Class99 aClass99_54 = new Class99();

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	private static int anInt6557 = 0;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Z")
	private static boolean aBoolean454 = false;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BZ)V")
	public static synchronized void method5437() {
		aBoolean454 = true;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static synchronized void method5438() {
		anInt6557--;
		if (anInt6557 == 0) {
			method5439();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static synchronized void method5439() {
		while (true) {
			@Pc(4) Class5_Sub12 local4 = (Class5_Sub12) aClass99_54.method2516();
			if (local4 == null) {
				return;
			}
			local4.anInterface9_1.NA(true);
			local4.method7425();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	public static synchronized void method5440() {
		anInt6557++;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!o;)V")
	public static synchronized void method5441(@OriginalArg(1) Interface9 arg0) {
		if (aBoolean454) {
			return;
		}
		if (anInt6557 > 0) {
			@Pc(12) Class5_Sub12 local12 = new Class5_Sub12();
			local12.anInterface9_1 = arg0;
			aClass99_54.method2513(local12);
		} else {
			arg0.NA(false);
		}
	}
}
