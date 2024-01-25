import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!lv", name = "cb", descriptor = "I")
	public static int anInt4039;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_68 = new Class194(80, 8);

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V")
	public static void method3199() {
		@Pc(12) int local12 = Static31.anInt622;
		@Pc(14) int[] local14 = Static334.anIntArray387;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class2_Sub1_Sub3_Sub2 local24 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local14[local16]];
			if (local24 != null && local24.anInt6132 > 0) {
				local24.anInt6132--;
				if (local24.anInt6132 == 0) {
					local24.aString64 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static424.anInt7114; local54++) {
			@Pc(61) long local61 = (long) Static218.anIntArray351[local54];
			@Pc(67) Class5_Sub7 local67 = (Class5_Sub7) Static380.aClass252_36.method5659(local61);
			if (local67 != null) {
				@Pc(72) Class2_Sub1_Sub3_Sub1 local72 = local67.aClass2_Sub1_Sub3_Sub1_1;
				if (local72.anInt6132 > 0) {
					local72.anInt6132--;
					if (local72.anInt6132 == 0) {
						local72.aString64 = null;
					}
				}
			}
		}
	}
}
