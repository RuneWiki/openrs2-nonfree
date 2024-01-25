import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!cw;")
	public static Class45 aClass45_7;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "[I")
	public static int[] anIntArray430;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
	public static int anInt5332 = 2;

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_73 = new Class146(24, 3);

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
	public static int anInt5333 = 0;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	public static void method4329() {
		if (!Static213.aBoolean43) {
			return;
		}
		while (true) {
			while (Static267.anInt4400 < Static360.aClass176_Sub1Array2.length) {
				@Pc(29) Class176_Sub1 local29 = Static360.aClass176_Sub1Array2[Static267.anInt4400];
				if (local29 != null && local29.anInt4266 == -1) {
					if (Static147.aClass4_Sub16_1 == null) {
						Static147.aClass4_Sub16_1 = Static160.aClass40_2.method684(local29.aString34);
					}
					@Pc(52) int local52 = Static147.aClass4_Sub16_1.anInt2822;
					if (local52 == -1) {
						return;
					}
					Static147.aClass4_Sub16_1 = null;
					Static267.anInt4400++;
					local29.anInt4266 = local52;
				} else {
					Static267.anInt4400++;
				}
			}
			return;
		}
	}
}
