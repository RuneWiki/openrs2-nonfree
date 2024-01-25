import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!uu", name = "s", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_192 = new Class126(88, 6);

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(IBI)Z")
	public static boolean method8223(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!pt;ZB)V")
	public static void method8224(@OriginalArg(0) Class3_Sub9_Sub5 arg0) {
		Static212.aClass232_2.method8514(arg0);
		Static419.method5980(Static571.aClass143_129, Static251.aClass143_60, arg0, Static212.aClass232_2, Static375.aClass143_92);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZLclient!v;)I")
	public static int method8225(@OriginalArg(1) Class3_Sub6_Sub20 arg0) {
		@Pc(12) String local12 = Static567.method7685(arg0);
		return Static17.aClass202_1.method4624(local12, Static359.aClass102Array17);
	}
}
