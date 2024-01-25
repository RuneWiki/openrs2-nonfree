import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
	public static int anInt7025;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_109 = new Class40("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
	public static int anInt7024 = 0;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)V")
	public static void method5703() {
		Static339.aClass288_46.method6735(5);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIB)I")
	public static int method5705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}
}
