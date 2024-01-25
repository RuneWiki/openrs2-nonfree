import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cga", name = "s", descriptor = "Lclient!vv;")
	public static final Class363 aClass363_7 = new Class363();

	@OriginalMember(owner = "client!cga", name = "D", descriptor = "I")
	public static int anInt9908 = -1;

	@OriginalMember(owner = "client!cga", name = "F", descriptor = "I")
	public static int anInt9910 = 0;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!tn;I)V")
	public static void method8135(@OriginalArg(0) Class3_Sub15 arg0) {
		@Pc(9) int local9 = arg0.method8465();
		Static82.aClass63Array1 = new Class63[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static82.aClass63Array1[local14] = new Class63();
			Static82.aClass63Array1[local14].anInt2552 = arg0.method8465();
			Static82.aClass63Array1[local14].aString19 = arg0.method8416();
		}
		Static46.anInt1031 = arg0.method8465();
		Static464.anInt8404 = arg0.method8465();
		Static72.anInt1911 = arg0.method8465();
		Static539.aClass153_Sub1Array2 = new Class153_Sub1[Static464.anInt8404 + 1 - Static46.anInt1031];
		for (@Pc(66) int local66 = 0; local66 < Static72.anInt1911; local66++) {
			@Pc(72) int local72 = arg0.method8465();
			@Pc(80) Class153_Sub1 local80 = Static539.aClass153_Sub1Array2[local72] = new Class153_Sub1();
			local80.anInt5573 = arg0.method8401();
			local80.anInt5570 = arg0.method8402();
			local80.anInt5586 = Static46.anInt1031 + local72;
			local80.aString51 = arg0.method8416();
			local80.aString52 = arg0.method8416();
		}
		Static359.anInt9617 = arg0.method8402();
		Static153.aBoolean323 = true;
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(III)V")
	public static void method8136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static448.anInt8136 = arg1;
		Static33.anInt611 = arg0;
		if (Static178.anInt4220 == 0) {
			Static211.anInt4905 = Static156.anInt3814 * 2 + Static33.anInt611;
			Static273.anInt5828 = Static293.anInt5936 * 2 + Static448.anInt8136;
		} else if (Static178.anInt4220 == 1) {
			Static87.anInt2288 = Static448.anInt8136 / Static246.anInt5504 + Static94.anInt2525 + 2;
			Static158.anInt3847 = Static33.anInt611 / Static584.anInt9762 + Static79.anInt1962 + 2;
			Static273.anInt5828 = Static87.anInt2288 * Static246.anInt5504;
			Static211.anInt4905 = Static584.anInt9762 * Static158.anInt3847;
			Static293.anInt5936 = Static273.anInt5828 - Static448.anInt8136 >> 1;
			Static156.anInt3814 = Static211.anInt4905 - Static33.anInt611 >> 1;
			return;
		} else if (Static178.anInt4220 == 2) {
			Static211.anInt4905 = Static33.anInt611;
			Static273.anInt5828 = Static448.anInt8136;
			return;
		}
	}
}
