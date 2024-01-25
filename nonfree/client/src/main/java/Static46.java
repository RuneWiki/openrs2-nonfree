import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
	private static int anInt1040 = 0;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!nt;")
	private static final Class238 aClass238_5 = new Class238();

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "Z")
	private static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public static synchronized void method927() {
		anInt1040++;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V")
	public static synchronized void method928() {
		aBoolean74 = true;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	public static synchronized void method929() {
		while (true) {
			@Pc(4) Class2_Sub24 local4 = (Class2_Sub24) aClass238_5.method5832();
			if (local4 == null) {
				return;
			}
			local4.anInterface8_1.w(true);
			local4.method8599();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!e;I)V")
	public static synchronized void method930(@OriginalArg(0) Interface8 arg0) {
		if (aBoolean74) {
			return;
		}
		if (anInt1040 <= 0) {
			arg0.w(false);
		} else {
			@Pc(17) Class2_Sub24 local17 = new Class2_Sub24();
			local17.anInterface8_1 = arg0;
			aClass238_5.method5837(local17);
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public static synchronized void method931() {
		anInt1040--;
		if (anInt1040 == 0) {
			method929();
		}
	}
}
