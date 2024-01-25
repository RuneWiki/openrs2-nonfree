import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString12 = null;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Z")
	public static final boolean aBoolean54 = false;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)I")
	public static int method723(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method731() {
		if (!Static562.aBoolean635) {
			return;
		}
		while (true) {
			while (Static94.anInt1936 < Static588.aClass236_Sub1Array2.length) {
				@Pc(21) Class236_Sub1 local21 = Static588.aClass236_Sub1Array2[Static94.anInt1936];
				if (local21 != null && local21.anInt6388 == -1) {
					if (Static444.aClass3_Sub42_2 == null) {
						Static444.aClass3_Sub42_2 = Static480.aClass79_1.method1710(local21.aString81);
					}
					@Pc(45) int local45 = Static444.aClass3_Sub42_2.anInt8103;
					if (local45 == -1) {
						return;
					}
					Static94.anInt1936++;
					Static444.aClass3_Sub42_2 = null;
					local21.anInt6388 = local45;
				} else {
					Static94.anInt1936++;
				}
			}
			return;
		}
	}
}
