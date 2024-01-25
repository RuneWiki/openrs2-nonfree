import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	public static int anInt6160;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_178 = new Class88("Loaded SW3D", "SW3D geladen", "SW3D chargé", "SW3D carregado");

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
	public static int anInt6161 = 1;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILclient!we;Lclient!we;)V")
	public static void method5156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30_Sub2 arg3, @OriginalArg(4) Class30_Sub2 arg4) {
		@Pc(4) Class37 local4 = Static201.method3812(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass30_Sub2_2 = arg3;
			local4.aClass30_Sub2_1 = arg4;
		}
	}
}
