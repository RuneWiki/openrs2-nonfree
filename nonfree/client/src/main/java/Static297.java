import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static297 {

	@OriginalMember(owner = "client!mc", name = "bd", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_165 = new Class88("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBI)I")
	public static int method4806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static348.anIntArray456[arg1 & 0x3] : Static223.anIntArray331[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!daa;I)Lclient!mda;")
	public static Class182_Sub1 method4811(@OriginalArg(0) Class12_Sub8 arg0) {
		return new Class182_Sub1(arg0.method5217(), arg0.method5217(), arg0.method5217(), arg0.method5217(), arg0.method5195(), arg0.method5195(), arg0.method5216());
	}
}
