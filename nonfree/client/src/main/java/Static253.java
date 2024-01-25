import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!mq", name = "X", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_62 = new Class25(81, 15);

	@OriginalMember(owner = "client!mq", name = "ib", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_76 = new Class231("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!mq", name = "mb", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_38 = new Class220(50);

	@OriginalMember(owner = "client!mq", name = "nb", descriptor = "[I")
	public static final int[] anIntArray388 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BII)Lclient!ea;")
	public static Class61 method3906(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class61 local7 = new Class61();
		local7.anInt1580 = -1;
		local7.anInt1579 = arg1 + 1 + 5;
		local7.anInt1578 = arg0 + 1 + 5;
		local7.anInt1585 = -1;
		local7.anIntArrayArray18 = new int[local7.anInt1578][local7.anInt1579];
		local7.method1487();
		return local7;
	}
}
