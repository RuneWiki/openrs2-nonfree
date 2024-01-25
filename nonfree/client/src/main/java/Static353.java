import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!rq", name = "y", descriptor = "Z")
	public static boolean aBoolean476;

	@OriginalMember(owner = "client!rq", name = "z", descriptor = "[I")
	public static int[] anIntArray704;

	@OriginalMember(owner = "client!rq", name = "w", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_199 = new Class158("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!rq", name = "x", descriptor = "I")
	public static int anInt7449 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!p;IILclient!za;BI)V")
	public static void method5673(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class231 local9 = Static420.aClass84_2.method1802(arg0.anInt5683);
		if (local9.anInt6725 == -1) {
			return;
		}
		if (arg0.aBoolean361) {
			@Pc(26) int local26 = arg1 + arg0.anInt5650;
			arg1 = local26 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(42) Class137 local42 = local9.method5129(arg3, arg0.aBoolean353, arg1);
		if (local42 == null) {
			return;
		}
		@Pc(48) int local48 = arg0.anInt5661;
		@Pc(51) int local51 = arg0.anInt5679;
		if ((arg1 & 0x1) == 1) {
			local51 = arg0.anInt5661;
			local48 = arg0.anInt5679;
		}
		@Pc(65) int local65 = local42.RA();
		@Pc(68) int local68 = local42.Q();
		if (local9.aBoolean424) {
			local65 = local48 * 4;
			local68 = local51 * 4;
		}
		if (local9.anInt6730 == 0) {
			local42.method5700(arg2, arg4 + 4 - local51 * 4, local65, local68);
		} else {
			local42.ya(arg2, arg4 + 4 - local51 * 4, local65, local68, 0, local9.anInt6730 | 0xFF000000, 1);
		}
	}
}
