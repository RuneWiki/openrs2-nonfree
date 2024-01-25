import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "Lclient!tm;")
	public static Class233 aClass233_1;

	@OriginalMember(owner = "client!dt", name = "N", descriptor = "Lclient!ic;")
	public static Class113 aClass113_28;

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "Z")
	public static boolean aBoolean114 = false;

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "[I")
	public static final int[] anIntArray72 = new int[3];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
	public static void method1231(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static159.aClass82ArrayArrayArray2 = Static55.aClass82ArrayArrayArray1;
			Static202.aClass163Array2 = Static164.aClass163Array1;
		} else {
			Static159.aClass82ArrayArrayArray2 = Static276.aClass82ArrayArrayArray3;
			Static202.aClass163Array2 = Static240.aClass163Array3;
		}
		Static97.anInt1709 = Static159.aClass82ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!dh;)V")
	public static void method1233(@OriginalArg(1) Class1_Sub11 arg0) {
		@Pc(9) int local9 = arg0.method4469();
		Static440.aClass43Array1 = new Class43[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static440.aClass43Array1[local14] = new Class43();
			Static440.aClass43Array1[local14].anInt1083 = arg0.method4469();
			Static440.aClass43Array1[local14].aString8 = arg0.method4456();
		}
		Static435.anInt7231 = arg0.method4469();
		Static455.anInt7452 = arg0.method4469();
		Static161.anInt1935 = arg0.method4469();
		Static169.aClass114_Sub1Array2 = new Class114_Sub1[Static455.anInt7452 + 1 - Static435.anInt7231];
		for (@Pc(71) int local71 = 0; local71 < Static161.anInt1935; local71++) {
			@Pc(77) int local77 = arg0.method4469();
			@Pc(85) Class114_Sub1 local85 = Static169.aClass114_Sub1Array2[local77] = new Class114_Sub1();
			local85.anInt2754 = arg0.method4463();
			local85.anInt2752 = arg0.method4487();
			local85.anInt2760 = local77 + Static435.anInt7231;
			local85.aString24 = arg0.method4456();
			local85.aString25 = arg0.method4456();
		}
		Static312.anInt5175 = arg0.method4487();
		Static54.aBoolean78 = true;
	}
}
