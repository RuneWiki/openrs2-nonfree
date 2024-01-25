import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "Z")
	private static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "Lclient!ae;")
	private static final Class8 aClass8_22 = new Class8();

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
	private static int anInt4109 = 0;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZB)V")
	public static synchronized void method3447() {
		aBoolean337 = true;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!p;B)V")
	public static synchronized void method3448(@OriginalArg(0) Interface21 arg0) {
		if (aBoolean337) {
			return;
		}
		if (anInt4109 <= 0) {
			arg0.UA(false);
		} else {
			@Pc(23) Class2_Sub43 local23 = new Class2_Sub43();
			local23.anInterface21_1 = arg0;
			aClass8_22.method212(local23);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	public static synchronized void method3449() {
		anInt4109--;
		if (anInt4109 == 0) {
			method3451();
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V")
	public static synchronized void method3450() {
		anInt4109++;
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
	public static synchronized void method3451() {
		while (true) {
			@Pc(4) Class2_Sub43 local4 = (Class2_Sub43) aClass8_22.method217();
			if (local4 == null) {
				return;
			}
			local4.anInterface21_1.UA(true);
			local4.method7966();
		}
	}
}
