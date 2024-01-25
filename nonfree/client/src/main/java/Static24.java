import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "Lclient!ada;")
	private static final Class8 aClass8_6 = new Class8();

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "Z")
	private static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
	private static int anInt399 = 0;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	public static synchronized void method365() {
		anInt399--;
		if (anInt399 == 0) {
			method366();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
	public static synchronized void method366() {
		while (true) {
			@Pc(9) Class6_Sub30 local9 = (Class6_Sub30) aClass8_6.method152();
			if (local9 == null) {
				return;
			}
			local9.anInterface7_1.w(true);
			local9.method9043();
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
	public static synchronized void method367() {
		anInt399++;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!e;I)V")
	public static synchronized void method368(@OriginalArg(0) Interface7 arg0) {
		if (aBoolean14) {
			return;
		}
		if (anInt399 > 0) {
			@Pc(14) Class6_Sub30 local14 = new Class6_Sub30();
			local14.anInterface7_1 = arg0;
			aClass8_6.method157(local14);
		} else {
			arg0.w(false);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BZ)V")
	public static synchronized void method369() {
		aBoolean14 = true;
	}
}
