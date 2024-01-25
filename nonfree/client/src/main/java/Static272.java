import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_64 = new Class267("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Lclient!pj;")
	public static final Class195 aClass195_2 = new Class195(1);

	@OriginalMember(owner = "client!np", name = "e", descriptor = "I")
	public static int anInt4879 = -1;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_97 = new Class92(72, -1);

	@OriginalMember(owner = "client!np", name = "g", descriptor = "I")
	public static int anInt4880 = 0;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method4102(@OriginalArg(1) int arg0) {
		@Pc(23) byte[] local23;
		if (arg0 == 100 && Static122.anInt2537 > 0) {
			local23 = Static37.aByteArrayArray5[--Static122.anInt2537];
			Static37.aByteArrayArray5[Static122.anInt2537] = null;
			return local23;
		} else if (arg0 == 5000 && Static195.anInt7211 > 0) {
			local23 = Static281.aByteArrayArray19[--Static195.anInt7211];
			Static281.aByteArrayArray19[Static195.anInt7211] = null;
			return local23;
		} else if (arg0 == 30000 && Static327.anInt5632 > 0) {
			local23 = Static167.aByteArrayArray24[--Static327.anInt5632];
			Static167.aByteArrayArray24[Static327.anInt5632] = null;
			return local23;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ts;III)V")
	public static void method4103(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static61.anInt1696 = arg2;
		Static233.anInt4271 = arg1;
		Static85.aClass239_2 = arg0;
	}
}
