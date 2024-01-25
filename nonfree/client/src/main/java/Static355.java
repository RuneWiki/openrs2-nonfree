import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
	private static int anInt6880 = 0;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Z")
	private static boolean aBoolean550 = false;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Lclient!kba;")
	private static final Class163 aClass163_41 = new Class163();

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)V")
	public static synchronized void method5749() {
		aBoolean550 = true;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public static synchronized void method5750() {
		anInt6880--;
		if (anInt6880 == 0) {
			method5753();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLclient!e;)V")
	public static synchronized void method5751(@OriginalArg(1) Interface10 arg0) {
		if (aBoolean550) {
			return;
		}
		if (anInt6880 <= 0) {
			arg0.w(false);
		} else {
			@Pc(12) Class6_Sub52 local12 = new Class6_Sub52();
			local12.anInterface10_1 = arg0;
			aClass163_41.method4967(local12);
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
	public static synchronized void method5752() {
		anInt6880++;
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V")
	public static synchronized void method5753() {
		while (true) {
			@Pc(4) Class6_Sub52 local4 = (Class6_Sub52) aClass163_41.method4969();
			if (local4 == null) {
				return;
			}
			local4.anInterface10_1.w(true);
			local4.method8792();
		}
	}
}
