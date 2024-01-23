import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!w", name = "w", descriptor = "Lclient!qe;")
	public static Class78 aClass78_852 = Static199.method3560("<col=ffb000>");

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	public static int anInt4760 = -1;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_853 = Static199.method3560("::gc");

	@OriginalMember(owner = "client!w", name = "z", descriptor = "Lclient!qe;")
	private static Class78 aClass78_854 = Static199.method3560("Loading wordpack )2 ");

	@OriginalMember(owner = "client!w", name = "A", descriptor = "Lclient!qe;")
	public static Class78 aClass78_855 = Static199.method3560("mem=");

	@OriginalMember(owner = "client!w", name = "C", descriptor = "Lclient!qe;")
	public static Class78 aClass78_856 = aClass78_854;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "Lclient!qe;")
	public static Class78 aClass78_857 = Static199.method3560("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!w", name = "H", descriptor = "Lclient!qe;")
	public static Class78 aClass78_859 = Static199.method3560("leuchten2:");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)V")
	public static void method3823() {
		Static195.method3542(Static30.anInt546, false, Static166.anInt1143, Static134.anInt3131);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!oe;ZLclient!oe;)I")
	public static int method3824(@OriginalArg(0) Class72 arg0, @OriginalArg(2) Class72 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method3175(Static212.anInt4667)) {
			local5++;
		}
		if (arg1.method3175(Static64.anInt1245)) {
			local5++;
		}
		if (arg1.method3175(Static27.anInt489)) {
			local5++;
		}
		if (arg0.method3175(Static212.anInt4667)) {
			local5++;
		}
		if (arg0.method3175(Static64.anInt1245)) {
			local5++;
		}
		if (arg0.method3175(Static27.anInt489)) {
			local5++;
		}
		return local5;
	}
}
