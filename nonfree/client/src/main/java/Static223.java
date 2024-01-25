import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!il", name = "a", descriptor = "Z")
	private static boolean aBoolean346 = false;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "Lclient!wo;")
	private static final Class361 aClass361_48 = new Class361();

	@OriginalMember(owner = "client!il", name = "c", descriptor = "I")
	private static int anInt4277 = 0;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)V")
	public static synchronized void method3673() {
		aBoolean346 = true;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	public static synchronized void method3674() {
		anInt4277--;
		if (anInt4277 == 0) {
			method3677();
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public static synchronized void method3675() {
		anInt4277++;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!p;)V")
	public static synchronized void method3676(@OriginalArg(1) Interface19 arg0) {
		if (aBoolean346) {
			return;
		}
		if (anInt4277 > 0) {
			@Pc(8) Class1_Sub44 local8 = new Class1_Sub44();
			local8.anInterface19_1 = arg0;
			aClass361_48.method7855(local8);
		} else {
			arg0.UA(false);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	public static synchronized void method3677() {
		while (true) {
			@Pc(12) Class1_Sub44 local12 = (Class1_Sub44) aClass361_48.method7850();
			if (local12 == null) {
				return;
			}
			local12.anInterface19_1.UA(true);
			local12.method7878();
		}
	}
}
