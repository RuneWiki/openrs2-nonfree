import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "Z")
	private static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "Lclient!eea;")
	private static final Class71 aClass71_49 = new Class71();

	@OriginalMember(owner = "client!on", name = "c", descriptor = "I")
	private static int anInt6663 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IZ)V")
	public static synchronized void method5569() {
		aBoolean424 = true;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public static synchronized void method5570() {
		while (true) {
			@Pc(9) Class3_Sub33 local9 = (Class3_Sub33) aClass71_49.method2084();
			if (local9 == null) {
				return;
			}
			local9.anInterface8_1.H(true);
			local9.method7820();
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
	public static synchronized void method5571() {
		anInt6663--;
		if (anInt6663 == 0) {
			method5570();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!g;I)V")
	public static synchronized void method5572(@OriginalArg(0) Interface8 arg0) {
		if (aBoolean424) {
			return;
		}
		if (anInt6663 > 0) {
			@Pc(16) Class3_Sub33 local16 = new Class3_Sub33();
			local16.anInterface8_1 = arg0;
			aClass71_49.method2076(local16);
		} else {
			arg0.H(false);
		}
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
	public static synchronized void method5573() {
		anInt6663++;
	}
}
