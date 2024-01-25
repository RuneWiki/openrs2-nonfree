import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
	public static int anInt1154 = -1;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
	public static void method924() {
		Static420.aClass163_11.JA(Static440.aFloat103 * ((float) Static2.aClass148_Sub1_1.anInt3784 * 0.1F + 0.7F));
		Static420.aClass163_11.B(Static106.anInt2003, Static261.aFloat21, Static107.aFloat18, (float) (Static244.anInt3907 << 0), (float) (Static272.anInt4442 << 0), (float) (Static308.anInt5306 << 0));
		Static420.aClass163_11.method5561(Static30.aClass109_1);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)Lclient!wr;")
	public static Class270 method926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static309.aClass270ArrayArrayArray3[0][arg1][arg2] != null && Static309.aClass270ArrayArrayArray3[0][arg1][arg2].aClass270_1 != null;
			if (local28 && arg0 >= Static289.anInt4757 - 1) {
				return null;
			}
			Static345.method4603(arg0, arg1, arg2);
		}
		return Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
	}
}
