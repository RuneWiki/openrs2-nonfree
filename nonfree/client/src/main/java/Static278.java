import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_84 = new Class67("Loaded SW3D", "SW3D geladen", "SW3D chargé", "SW3D carregado");

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!kca;I)V")
	public static void method4791(@OriginalArg(0) Class158 arg0) {
		Static515.aClass3_Sub27_Sub1_2.method4542(arg0.method4210());
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)I")
	public static int method4792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class5.anIntArray760[arg0 * 8192 / arg2] >> 1;
		return (local20 * arg1 >> 16) + (arg3 * (65536 - local20) >> 16);
	}
}
