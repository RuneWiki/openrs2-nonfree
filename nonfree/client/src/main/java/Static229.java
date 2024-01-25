import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Lclient!l;")
	public static Class57 aClass57_18;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "Lclient!sp;")
	public static final Class219 aClass219_4 = new Class219("WTI", 5);

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
	public static int anInt4407 = 0;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	public static void method3458() {
		@Pc(12) int local12 = Static33.anInt606;
		@Pc(14) int[] local14 = Static99.anIntArray157;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class16_Sub1_Sub5_Sub1 local24 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local14[local16]];
			if (local24 != null) {
				Static44.method761(local24.method4751(), local24);
			}
		}
	}
}
