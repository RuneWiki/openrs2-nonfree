import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)I")
	public static int method5816(@OriginalArg(0) int arg0) {
		if (Static223.aClass5_3 != null) {
			Static223.aClass5_3.method119();
			Static223.aClass5_3 = null;
		}
		Static257.anInt4643++;
		if (Static257.anInt4643 > 4) {
			Static433.anInt7201 = 0;
			Static257.anInt4643 = 0;
			return arg0;
		}
		if (Static444.anInt7413 == Static224.anInt4140) {
			Static224.anInt4140 = Static179.anInt3323;
		} else {
			Static224.anInt4140 = Static444.anInt7413;
		}
		Static433.anInt7201 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!wo;Lclient!ns;Lclient!ns;Lclient!ns;I)Z")
	public static boolean method5817(@OriginalArg(0) Class4_Sub18_Sub4 arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) Class166 arg2, @OriginalArg(3) Class166 arg3) {
		Static67.aClass4_Sub18_Sub4_2 = arg0;
		Static327.aClass166_228 = arg1;
		Static420.aClass166_303 = arg3;
		Static200.aClass166_144 = arg2;
		return true;
	}
}
