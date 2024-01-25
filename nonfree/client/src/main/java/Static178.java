import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "Z")
	private static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
	private static int anInt3012 = 0;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "Lclient!cga;")
	private static final Class60 aClass60_57 = new Class60();

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)V")
	public static synchronized void method2623() {
		aBoolean299 = true;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public static synchronized void method2624() {
		while (true) {
			@Pc(6) Class2_Sub24 local6 = (Class2_Sub24) aClass60_57.method1225();
			if (local6 == null) {
				return;
			}
			local6.anInterface5_1.w(true);
			local6.method9872();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public static synchronized void method2625() {
		anInt3012--;
		if (anInt3012 == 0) {
			method2624();
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public static synchronized void method2626() {
		anInt3012++;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!e;I)V")
	public static synchronized void method2627(@OriginalArg(0) Interface5 arg0) {
		if (aBoolean299) {
			return;
		}
		if (anInt3012 > 0) {
			@Pc(10) Class2_Sub24 local10 = new Class2_Sub24();
			local10.anInterface5_1 = arg0;
			aClass60_57.method1233(local10);
		} else {
			arg0.w(false);
		}
	}
}
