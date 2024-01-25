import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!qw;")
	private static final Class302 aClass302_51 = new Class302();

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
	private static int anInt7859 = 0;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "Z")
	private static boolean aBoolean546 = false;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLclient!e;)V")
	public static synchronized void method6512(@OriginalArg(1) Interface5 arg0) {
		if (aBoolean546) {
			return;
		}
		if (anInt7859 > 0) {
			@Pc(16) Class3_Sub27 local16 = new Class3_Sub27();
			local16.anInterface5_1 = arg0;
			aClass302_51.method6613(local16);
		} else {
			arg0.w(false);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public static synchronized void method6513() {
		anInt7859++;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
	public static synchronized void method6514() {
		while (true) {
			@Pc(4) Class3_Sub27 local4 = (Class3_Sub27) aClass302_51.method6611();
			if (local4 == null) {
				return;
			}
			local4.anInterface5_1.w(true);
			local4.method9034();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
	public static synchronized void method6515() {
		aBoolean546 = true;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	public static synchronized void method6516() {
		anInt7859--;
		if (anInt7859 == 0) {
			method6514();
		}
	}
}
