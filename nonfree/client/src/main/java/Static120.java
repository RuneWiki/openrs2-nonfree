import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
	public static int anInt2645;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_89 = new Class62("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_70 = new Class208(81, 6);

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "[B")
	public static final byte[] aByteArray32 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
	public static int anInt2646 = 0;

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "Lclient!wb;")
	public static final Class243 aClass243_10 = new Class243(8);

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
	public static final int anInt2647 = 0;

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "Lclient!co;")
	public static final Class41 aClass41_29 = new Class41(4);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!vt;)Lclient!aa;")
	public static Class2_Sub1 method2133(@OriginalArg(1) Class2_Sub24 arg0) {
		arg0.method5732();
		@Pc(13) int local13 = arg0.method5732();
		@Pc(17) Class2_Sub1 local17 = Static332.method5364(local13);
		local17.anInt7039 = arg0.method5732();
		@Pc(26) int local26 = arg0.method5732();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method5732();
			local17.method6064(local34, arg0);
		}
		local17.method6067();
		return local17;
	}
}
