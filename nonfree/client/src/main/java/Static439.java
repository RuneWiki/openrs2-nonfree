import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "[I")
	public static int[] anIntArray432;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Z")
	public static boolean aBoolean565 = false;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
	public static void method6575() {
		Static483.anInt8316++;
		Static118.anInt2047 = 0;
		Static80.anInt1293 = 0;
		Static351.method5229();
		Static27.method369();
		Static634.method8424();
		@Pc(27) boolean local27 = false;
		@Pc(34) int local34;
		for (@Pc(29) int local29 = 0; local29 < Static80.anInt1293; local29++) {
			local34 = Static287.anIntArray264[local29];
			@Pc(41) Class5_Sub34 local41 = (Class5_Sub34) Static223.aClass335_19.method7766((long) local34);
			@Pc(44) Class41_Sub1_Sub1_Sub3_Sub1 local44 = local41.aClass41_Sub1_Sub1_Sub3_Sub1_1;
			if (Static423.aBoolean549 && Static307.method4720(local34)) {
				Static74.method1092();
			}
			if (Static483.anInt8316 != local44.anInt9500) {
				if (local44.aClass311_1.method7322()) {
					Static207.method2883(local44);
				}
				local44.method4716((Class311) null);
				local41.method8829();
				local27 = true;
			}
		}
		if (local27) {
			Static562.anInt9155 = Static223.aClass335_19.method7767();
			Static223.aClass335_19.method7771(Static278.aClass5_Sub34Array1);
		}
		if (Static386.aClass5_Sub15_Sub2_2.anInt4144 != Static139.anInt2291) {
			throw new RuntimeException("gnp1 pos:" + Static386.aClass5_Sub15_Sub2_2.anInt4144 + " psize:" + Static139.anInt2291);
		}
		for (local34 = 0; local34 < Static386.anInt6720; local34++) {
			if (Static223.aClass335_19.method7766((long) Static662.anIntArray600[local34]) == null) {
				throw new RuntimeException("gnp2 pos:" + local34 + " size:" + Static386.anInt6720);
			}
		}
		if (Static562.anInt9155 - Static386.anInt6720 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static562.anInt9155 - Static386.anInt6720));
		}
		for (@Pc(171) int local171 = 0; local171 < Static562.anInt9155; local171++) {
			if (Static483.anInt8316 != Static278.aClass5_Sub34Array1[local171].aClass41_Sub1_Sub1_Sub3_Sub1_1.anInt9500) {
				throw new RuntimeException("gnp4 uk:" + Static278.aClass5_Sub34Array1[local171].aClass41_Sub1_Sub1_Sub3_Sub1_1.anInt9469);
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)I")
	public static int method6578(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 <= arg0) {
			return arg0 > arg2 ? arg2 : arg0;
		} else {
			return arg1;
		}
	}
}
