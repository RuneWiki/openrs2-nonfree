import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!ms", name = "D", descriptor = "Lclient!jn;")
	public static Class176 aClass176_97;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!vc;I)Z")
	public static boolean method5935(@OriginalArg(0) Class338 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean684) {
			return false;
		} else if (!arg0.method7973(Static455.anInterface21_2)) {
			return false;
		} else if (Static464.aClass350_36.method8207((long) arg0.anInt9766) == null) {
			return Static277.aClass350_21.method8207((long) arg0.anInt9770) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)V")
	public static void method5936(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg0, 9);
		local8.method7134();
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V")
	public static void method5937() {
		Static458.aClass44_13.pa(Static242.anInt4382, Static214.aClass4_Sub19_Sub1_1.aBoolean266 ? Static453.anInt8519 + 256 << 2 : -1, 0);
	}
}
