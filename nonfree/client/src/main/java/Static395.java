import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "Lclient!lga;")
	public static Class207 aClass207_2;

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "Lclient!he;")
	public static Class140 aClass140_1;

	@OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
	public static int anInt7388;

	@OriginalMember(owner = "client!nea", name = "f", descriptor = "Lclient!uf;")
	public static Class357 aClass357_105 = null;

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(B)V")
	public static void method6569() {
		Static339.anInt6007 = Static536.anInt4502;
		Static612.aClass348Array4 = new Class348[500];
		Static90.anInt1654 = 0;
		Static544.aClass348Array3 = new Class348[1000];
		Static278.anInt5147 = Static536.anInt4502;
		Static594.anInt10306 = 0;
		Static533.aBoolean679 = false;
		Static414.anIntArrayArrayArray13 = new int[Static60.anInt1169][Static585.anInt10170 + 1][Static202.anInt4238 + 1];
		Static201.aClass348Array2 = new Class348[2000];
		Static398.anInt7403 = 0;
		Static527.anInt9295 = 0;
		Static45.aClass348Array1 = new Class348[500];
		if (Static64.aClass101_1 instanceof oa) {
			Static351.aBoolean516 = false;
		} else {
			Static351.aBoolean516 = true;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!km;Z)V")
	public static void method6570(@OriginalArg(0) Class15_Sub3_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort62; local2 <= arg0.aShort63; local2++) {
			for (@Pc(6) int local6 = arg0.aShort64; local6 <= arg0.aShort65; local6++) {
				@Pc(16) Class291 local16 = Static193.aClass291ArrayArrayArray2[arg0.aByte142][local2][local6];
				if (local16 != null) {
					@Pc(21) Class27 local21 = local16.aClass27_3;
					@Pc(23) Class27 local23 = null;
					while (local21 != null) {
						if (local21.aClass15_Sub3_Sub3_1 == arg0) {
							if (local23 == null) {
								local16.aClass27_3 = local21.aClass27_1;
							} else {
								local23.aClass27_1 = local21.aClass27_1;
							}
							local21.method628();
							break;
						}
						local23 = local21;
						local21 = local21.aClass27_1;
					}
				}
			}
		}
		if (!arg1) {
			Static353.method6087(arg0);
		}
	}
}
