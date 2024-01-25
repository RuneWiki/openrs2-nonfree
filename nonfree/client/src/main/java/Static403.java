import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!nr", name = "Z", descriptor = "I")
	public static int anInt6805;

	@OriginalMember(owner = "client!nr", name = "R", descriptor = "I")
	public static int anInt6785 = -1;

	@OriginalMember(owner = "client!nr", name = "hb", descriptor = "Lclient!fg;")
	public static final Class112 aClass112_2 = new Class112();

	@OriginalMember(owner = "client!nr", name = "O", descriptor = "[I")
	public static final int[] anIntArray391 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!nr", name = "db", descriptor = "[I")
	public static final int[] anIntArray392 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!nr", name = "qb", descriptor = "[I")
	public static final int[] anIntArray393 = new int[4096];

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIII)V")
	public static void method5894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = Static465.anInt7544;
		@Pc(7) int local7 = Static90.anInt1510;
		if (Static377.aBoolean419) {
			local5 += Static194.method8971();
			local7 += Static5.method9220();
		}
		@Pc(37) Class155 local37;
		if (Static80.anInt1424 == 1) {
			local37 = Static219.aClass155Array11[Static362.anInt9813 / 100];
			local37.method7202(local5 - 8, local7 + -8);
			Static395.method5811(local7 - 8, local5 - 8 + local37.method7206(), local37.method7209() + local7 - 8, local5 + -8);
		}
		if (Static80.anInt1424 == 2) {
			local37 = Static219.aClass155Array11[Static362.anInt9813 / 100 + 4];
			local37.method7202(local5 - 8, local7 + -8);
			Static395.method5811(local7 - 8, local37.method7206() + local5 - 8, local7 + local37.method7209() - 8, local5 + -8);
		}
		Static271.method4451();
	}
}
