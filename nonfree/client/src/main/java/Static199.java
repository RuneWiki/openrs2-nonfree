import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	private static int anInt3351 = 0;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!sja;")
	private static final Class342 aClass342_31 = new Class342();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Z")
	private static boolean aBoolean210 = false;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static synchronized void method3052() {
		anInt3351++;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static synchronized void method3053() {
		while (true) {
			@Pc(11) Class3_Sub9 local11 = (Class3_Sub9) aClass342_31.method7653();
			if (local11 == null) {
				return;
			}
			local11.anInterface6_1.w(true);
			local11.method9596();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V")
	public static synchronized void method3054() {
		aBoolean210 = true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!e;B)V")
	public static synchronized void method3055(@OriginalArg(0) Interface6 arg0) {
		if (aBoolean210) {
			return;
		}
		if (anInt3351 > 0) {
			@Pc(20) Class3_Sub9 local20 = new Class3_Sub9();
			local20.anInterface6_1 = arg0;
			aClass342_31.method7654(local20);
		} else {
			arg0.w(false);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static synchronized void method3056() {
		anInt3351--;
		if (anInt3351 == 0) {
			method3053();
		}
	}
}
