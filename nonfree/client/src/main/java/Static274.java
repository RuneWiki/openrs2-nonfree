import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!np", name = "y", descriptor = "I")
	public static int anInt4617 = 0;

	@OriginalMember(owner = "client!np", name = "E", descriptor = "[I")
	public static final int[] anIntArray419 = new int[1];

	@OriginalMember(owner = "client!np", name = "F", descriptor = "I")
	public static int anInt4622 = 0;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "(I)V")
	public static void method3665() {
		if (!Static178.aBoolean197) {
			return;
		}
		while (true) {
			while (Static22.anInt4933 < Static31.aClass19_Sub1Array1.length) {
				@Pc(26) Class19_Sub1 local26 = Static31.aClass19_Sub1Array1[Static22.anInt4933];
				if (local26 != null && local26.anInt2228 == -1) {
					if (Static12.aClass7_Sub29_2 == null) {
						Static12.aClass7_Sub29_2 = Static39.aClass198_1.method4089(local26.aString18);
					}
					@Pc(49) int local49 = Static12.aClass7_Sub29_2.anInt3815;
					if (local49 == -1) {
						return;
					}
					Static12.aClass7_Sub29_2 = null;
					Static22.anInt4933++;
					local26.anInt2228 = local49;
				} else {
					Static22.anInt4933++;
				}
			}
			return;
		}
	}
}
