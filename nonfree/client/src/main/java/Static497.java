import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	private static int anInt8415 = 0;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Z")
	private static boolean aBoolean584 = false;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "Lclient!v;")
	private static final Class362 aClass362_57 = new Class362();

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static synchronized void method7155() {
		while (true) {
			@Pc(4) Class6_Sub19 local4 = (Class6_Sub19) aClass362_57.method8531();
			if (local4 == null) {
				return;
			}
			local4.anInterface7_1.w(true);
			local4.method9174();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLclient!e;)V")
	public static synchronized void method7156(@OriginalArg(1) Interface7 arg0) {
		if (aBoolean584) {
			return;
		}
		if (anInt8415 > 0) {
			@Pc(11) Class6_Sub19 local11 = new Class6_Sub19();
			local11.anInterface7_1 = arg0;
			aClass362_57.method8536(local11);
		} else {
			arg0.w(false);
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	public static synchronized void method7157() {
		anInt8415++;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static synchronized void method7158() {
		anInt8415--;
		if (anInt8415 == 0) {
			method7155();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)V")
	public static synchronized void method7159() {
		aBoolean584 = true;
	}
}
