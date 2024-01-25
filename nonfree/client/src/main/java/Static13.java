import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public static int anInt269;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "I")
	public static int anInt271;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Lclient!pj;")
	public static final Class156 aClass156_4 = new Class156(64);

	@OriginalMember(owner = "client!am", name = "i", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_10 = new Class140(16);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!od;I)V")
	public static void method321(@OriginalArg(0) Class147 arg0) {
		Static191.aClass147_3 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	public static void method323() {
		@Pc(11) Class140 local11 = Static326.aClass140_165;
		synchronized (Static326.aClass140_165) {
			Static326.aClass140_165.method3813();
		}
	}
}
