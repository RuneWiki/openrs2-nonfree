import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Z")
	private static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
	private static int anInt760 = 0;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!gca;")
	private static final Class111 aClass111_3 = new Class111();

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZB)V")
	public static synchronized void method671() {
		aBoolean45 = true;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public static synchronized void method672() {
		while (true) {
			@Pc(4) Class1_Sub32 local4 = (Class1_Sub32) aClass111_3.method2553();
			if (local4 == null) {
				return;
			}
			local4.anInterface19_1.UA(true);
			local4.method7908();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!p;)V")
	public static synchronized void method673(@OriginalArg(1) Interface19 arg0) {
		if (aBoolean45) {
			return;
		}
		if (anInt760 <= 0) {
			arg0.UA(false);
		} else {
			@Pc(16) Class1_Sub32 local16 = new Class1_Sub32();
			local16.anInterface19_1 = arg0;
			aClass111_3.method2552(local16);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public static synchronized void method674() {
		anInt760++;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public static synchronized void method675() {
		anInt760--;
		if (anInt760 == 0) {
			method672();
		}
	}
}
