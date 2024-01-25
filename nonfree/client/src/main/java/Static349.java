import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	public static int anInt6185;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_81 = new Class208(51, -1);

	@OriginalMember(owner = "client!re", name = "r", descriptor = "[I")
	public static final int[] anIntArray516 = new int[8];

	@OriginalMember(owner = "client!re", name = "w", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_150 = new Class25(53, -2);

	@OriginalMember(owner = "client!re", name = "x", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_110 = new Class231("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!hw;Ljava/lang/String;)I")
	public static int method4922(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) String arg1) {
		@Pc(11) int local11 = arg0.anInt7523;
		@Pc(15) byte[] local15 = Static227.method3105(arg1);
		arg0.method6169(local15.length);
		arg0.anInt7523 += Static342.aClass186_1.method4073(local15.length, arg0.anInt7523, 0, local15, arg0.aByteArray94);
		return arg0.anInt7523 - local11;
	}
}
