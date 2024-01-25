import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "Z")
	private static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "I")
	private static int anInt3650 = 0;

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "Lclient!ro;")
	private static final Class306 aClass306_15 = new Class306();

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ZI)V")
	public static synchronized void method3223() {
		aBoolean299 = true;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)V")
	public static synchronized void method3224() {
		while (true) {
			@Pc(9) Class5_Sub18 local9 = (Class5_Sub18) aClass306_15.method7302();
			if (local9 == null) {
				return;
			}
			local9.anInterface10_1.w(true);
			local9.method8911();
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V")
	public static synchronized void method3225() {
		anInt3650++;
	}

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)V")
	public static synchronized void method3226() {
		anInt3650--;
		if (anInt3650 == 0) {
			method3224();
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Lclient!e;B)V")
	public static synchronized void method3227(@OriginalArg(0) Interface10 arg0) {
		if (aBoolean299) {
			return;
		}
		if (anInt3650 > 0) {
			@Pc(11) Class5_Sub18 local11 = new Class5_Sub18();
			local11.anInterface10_1 = arg0;
			aClass306_15.method7303(local11);
		} else {
			arg0.w(false);
		}
	}
}
