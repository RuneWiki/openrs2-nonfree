import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "F")
	public static float aFloat198;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIZII)V")
	public static void method7134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((arg2 ? Static278.aClass3_Sub13_Sub1_1.anInt5135 : Static278.aClass3_Sub13_Sub1_1.anInt5153) != 0 && arg3 != 0 && Static407.anInt6912 < 50 && arg4 != -1) {
			Static567.aClass232Array1[Static407.anInt6912++] = new Class232((byte) (arg2 ? 3 : 2), arg4, arg3, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)Lclient!ho;")
	public static Class133_Sub1 method7135() {
		Static444.anInt7325 = 0;
		return Static230.method3914();
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)V")
	public static void method7136(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub3_Sub7 local14 = Static363.method5457(arg0, 14);
		local14.method845();
	}
}
