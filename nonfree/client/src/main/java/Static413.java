import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_195 = new Class158("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString63 = "";

	@OriginalMember(owner = "client!un", name = "g", descriptor = "[Lclient!lh;")
	public static final Class155[] aClass155Array1 = new Class155[2048];

	@OriginalMember(owner = "client!un", name = "i", descriptor = "I")
	public static int anInt7364 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)I")
	public static int method5602() {
		return 2;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!fv;Lclient!za;I)I")
	public static int method5603(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class106 arg1) {
		if (arg0.anInt2778 != -1) {
			return arg0.anInt2778;
		}
		if (arg0.anInt2784 != -1) {
			@Pc(24) Class150 local24 = arg1.anInterface7_10.method78(arg1.method5975() ? arg0.anInt2784 : arg0.anInt2780);
			if (!local24.aBoolean274) {
				return local24.aShort59;
			}
		}
		return arg0.anInt2775;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII)V")
	public static void method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub1_Sub11 local12 = Static248.method3707(arg0, 8);
		local12.method2957();
		local12.anInt3820 = arg2;
		local12.anInt3819 = arg1;
		local12.anInt3823 = arg3;
	}
}
