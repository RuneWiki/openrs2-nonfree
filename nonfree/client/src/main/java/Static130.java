import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
	public static int anInt5552;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!ij;")
	public static Class93 aClass93_108;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	public static int anInt5553 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZI)V")
	public static void method4916(@OriginalArg(2) boolean arg0) {
		Static226.anInt4449 = 22050;
		Static188.aBoolean287 = arg0;
		Static355.anInt6823 = 2;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(JI)V")
	public static void method4918(@OriginalArg(0) long arg0) {
		if (Static178.aClass174ArrayArrayArray3 != null) {
			if (Static53.anInt992 == 1 || Static53.anInt992 == 5) {
				Static136.method2397(arg0);
			} else if (Static53.anInt992 == 4) {
				Static167.method3036(arg0);
			}
		}
		Static40.method632(Static236.aClass55_9, (long) Static283.anInt5563);
		if (Static32.anInt628 != -1) {
			Static28.method629(Static32.anInt628);
		}
		for (@Pc(42) int local42 = 0; local42 < Static66.anInt5818; local42++) {
			if (Static287.aBooleanArray23[local42]) {
				Static133.aBooleanArray10[local42] = true;
			}
			Static34.aBooleanArray5[local42] = Static287.aBooleanArray23[local42];
			Static287.aBooleanArray23[local42] = false;
		}
		Static76.anInt1460 = Static283.anInt5563;
		if (Static236.aClass55_9.method5177()) {
			Static88.aBoolean117 = true;
		}
		if (Static32.anInt628 != -1) {
			Static66.anInt5818 = 0;
			Static301.method5303();
		}
		Static236.aClass55_9.method5186();
		Static216.method3987(Static236.aClass55_9);
		@Pc(97) int local97 = Static195.method3459();
		if (local97 == -1) {
			local97 = Static353.anInt6772;
		}
		Static204.method3754(local97);
		Static299.method6022(Static239.anInt4811, Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632, Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631, Static26.anInt519);
		Static26.anInt519 = 0;
	}
}
