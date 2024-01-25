import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)I")
	public static int method7316(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static411.method5772(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!pca;II)V")
	public static void method7317(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) int arg2) {
		if (Static253.aBoolean325) {
			@Pc(21) Class41 local21 = Static191.anInt4131 == -1 ? null : Static106.aClass27_1.method483(Static191.anInt4131);
			if (Static70.method1716(arg1).method3243() && (Static182.anInt3987 & 0x20) != 0 && (local21 == null || arg1.method5709(Static191.anInt4131, local21.anInt1311) != local21.anInt1311)) {
				Static367.method5215(arg1.anInt7279, arg1.anInt7254, Static421.aString201, Static238.aString114 + " -> " + arg1.aString187, true, 5, false, 0L, arg1.anInt7268, Static455.anInt7961);
			}
		}
		@Pc(79) String local79;
		for (@Pc(72) int local72 = 9; local72 >= 5; local72--) {
			local79 = Static427.method5902(local72, arg1);
			if (local79 != null) {
				Static367.method5215(arg1.anInt7279, arg1.anInt7254, local79, arg1.aString187, true, 1006, false, (long) (local72 + 1), arg1.anInt7268, Static376.method5256(local72, arg1));
			}
		}
		local79 = Static169.method3024(arg1);
		if (local79 != null) {
			Static367.method5215(arg1.anInt7279, arg1.anInt7254, local79, arg1.aString187, true, 58, false, 0L, arg1.anInt7268, arg1.anInt7267);
		}
		for (@Pc(142) int local142 = 4; local142 >= 0; local142--) {
			@Pc(149) String local149 = Static427.method5902(local142, arg1);
			if (local149 != null) {
				Static367.method5215(arg1.anInt7279, arg1.anInt7254, local149, arg1.aString187, true, 12, false, (long) (local142 + 1), arg1.anInt7268, Static376.method5256(local142, arg1));
			}
		}
		if (!Static70.method1716(arg1).method3241()) {
			return;
		}
		if (arg1.aString188 == null) {
			Static367.method5215(arg1.anInt7279, arg1.anInt7254, Static573.aClass350_13.method7730(Static201.anInt4321), "", true, 57, false, 0L, arg1.anInt7268, -1);
		} else {
			Static367.method5215(arg1.anInt7279, arg1.anInt7254, arg1.aString188, "", true, 57, false, 0L, arg1.anInt7268, -1);
		}
	}

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)I")
	public static int method7318() {
		if (Static178.aFrame3 == null) {
			return Static342.aBoolean435 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
