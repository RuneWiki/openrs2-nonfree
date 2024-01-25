import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "Z")
	private static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "Lclient!uh;")
	private static final Class341 aClass341_21 = new Class341();

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
	private static int anInt1997 = 0;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BZ)V")
	public static synchronized void method1911() {
		aBoolean165 = true;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
	public static synchronized void method1912() {
		anInt1997--;
		if (anInt1997 == 0) {
			method1914();
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILclient!e;)V")
	public static synchronized void method1913(@OriginalArg(1) Interface8 arg0) {
		if (aBoolean165) {
			return;
		}
		if (anInt1997 <= 0) {
			arg0.w(false);
		} else {
			@Pc(13) Class2_Sub38 local13 = new Class2_Sub38();
			local13.anInterface8_1 = arg0;
			aClass341_21.method8528(local13);
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V")
	public static synchronized void method1914() {
		while (true) {
			@Pc(4) Class2_Sub38 local4 = (Class2_Sub38) aClass341_21.method8526();
			if (local4 == null) {
				return;
			}
			local4.anInterface8_1.w(true);
			local4.method9253();
		}
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(B)V")
	public static synchronized void method1915() {
		anInt1997++;
	}
}
