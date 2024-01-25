import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
	public static int anInt3824;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString166 = "yellow:";

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!ec;Z)V")
	public static void method3742(@OriginalArg(0) Class6_Sub10 arg0) {
		@Pc(9) int local9 = arg0.method4017();
		Static338.aClass204Array1 = new Class204[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static338.aClass204Array1[local14] = new Class204();
			Static338.aClass204Array1[local14].anInt6011 = arg0.method4017();
			Static338.aClass204Array1[local14].aString283 = arg0.method4013();
		}
		Static341.anInt6214 = arg0.method4017();
		Static74.anInt1382 = arg0.method4017();
		Static354.anInt6364 = arg0.method4017();
		Static233.aClass64_Sub1Array2 = new Class64_Sub1[Static74.anInt1382 + 1 - Static341.anInt6214];
		for (@Pc(62) int local62 = 0; local62 < Static354.anInt6364; local62++) {
			@Pc(68) int local68 = arg0.method4017();
			@Pc(76) Class64_Sub1 local76 = Static233.aClass64_Sub1Array2[local68] = new Class64_Sub1();
			local76.anInt2858 = arg0.method3972();
			local76.anInt2860 = arg0.method3979();
			local76.anInt2867 = Static341.anInt6214 + local68;
			local76.aString124 = arg0.method4013();
			local76.aString125 = arg0.method4013();
		}
		Static142.anInt2559 = arg0.method3979();
		Static350.aBoolean422 = true;
	}
}
