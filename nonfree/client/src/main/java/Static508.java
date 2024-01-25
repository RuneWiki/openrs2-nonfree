import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "Lclient!rk;")
	private static final Class249 aClass249_70 = new Class249();

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Z")
	private static boolean aBoolean641 = false;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	private static int anInt8849 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
	public static synchronized void method7431() {
		anInt8849--;
		if (anInt8849 == 0) {
			method7433();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public static synchronized void method7432() {
		anInt8849++;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
	public static synchronized void method7433() {
		while (true) {
			@Pc(8) Class2_Sub18 local8 = (Class2_Sub18) aClass249_70.method6529();
			if (local8 == null) {
				return;
			}
			local8.anInterface14_1.NA(true);
			local8.method7802();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!o;I)V")
	public static synchronized void method7434(@OriginalArg(0) Interface14 arg0) {
		if (aBoolean641) {
			return;
		}
		if (anInt8849 <= 0) {
			arg0.NA(false);
		} else {
			@Pc(15) Class2_Sub18 local15 = new Class2_Sub18();
			local15.anInterface14_1 = arg0;
			aClass249_70.method6523(local15);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)V")
	public static synchronized void method7435() {
		aBoolean641 = true;
	}
}
