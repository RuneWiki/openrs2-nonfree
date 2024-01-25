import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static157 {

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "[S")
	public static short[] aShortArray71;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
	public static int anInt3025;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString116 = "Connected to update server";

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIZI)V")
	public static void method2489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static224.anInt4582 == 0 || arg2 == 0 || Static186.anInt3102 >= 50 || arg1 == -1) {
			return;
		}
		Static37.anIntArray538[Static186.anInt3102] = arg1;
		Static244.anIntArray393[Static186.anInt3102] = arg2;
		Static109.anIntArray136[Static186.anInt3102] = arg3;
		Static334.aClass143Array1[Static186.anInt3102] = null;
		Static251.anIntArray406[Static186.anInt3102] = 0;
		Static230.anIntArray548[Static186.anInt3102] = arg0;
		Static186.anInt3102++;
	}
}
