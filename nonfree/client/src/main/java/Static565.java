import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "Lclient!nca;")
	public static Class254 aClass254_141;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
	public static int anInt8886;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
	public static int anInt8887;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_132 = new Class349(88, 2);

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_29 = new Class118(61);

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_168 = new Class225(91, -1);

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
	public static int anInt8888 = 0;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BI)V")
	public static void method7855() {
		@Pc(1) Class85 local1 = Static146.aClass85_18;
		synchronized (Static146.aClass85_18) {
			Static146.aClass85_18.method1742(5);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!it;ILclient!ka;BI)V")
	public static void method7856(@OriginalArg(0) int arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class45 arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			arg1.method3977(arg4, arg3.HA(), arg3.na(), arg0, arg2, arg3.V(), arg3.fa(), arg3.G(), arg3.EA(), arg3.RA());
		}
	}
}
