import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[200];

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!sk;)I")
	public static int method4291(@OriginalArg(1) Class3_Sub2_Sub1_Sub2 arg0) {
		@Pc(15) int local15 = arg0.anInt6218;
		@Pc(19) Class156 local19 = arg0.method4925();
		if (arg0.aBoolean429) {
			local15 = arg0.anInt6213;
		} else if (local19.anInt4438 == arg0.anInt6177 || arg0.anInt6177 == local19.anInt4469 || local19.anInt4441 == arg0.anInt6177 || local19.anInt4433 == arg0.anInt6177) {
			local15 = arg0.anInt6247;
		} else if (local19.anInt4454 == arg0.anInt6177 || arg0.anInt6177 == local19.anInt4452 || local19.anInt4449 == arg0.anInt6177 || arg0.anInt6177 == local19.anInt4470) {
			local15 = arg0.anInt6219;
		}
		return local15;
	}
}
