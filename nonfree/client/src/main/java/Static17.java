import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "[[F")
	public static final float[][] aFloatArrayArray6 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "Lclient!bm;")
	public static final Class32 aClass32_7 = new Class32();

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_77 = new Class276(85, 7);

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
	public static int anInt6046 = 0;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
	public static void method5002() {
		if (Static333.anInt6934 <= 0) {
			Static387.aString90 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static171.aStringArray14.length; local14++) {
			if (Static171.aStringArray14[local14].startsWith("--> ")) {
				@Pc(25) int local25 = ~Static333.anInt6934;
				local12++;
				if (local25 == ~local12) {
					Static387.aString90 = Static171.aStringArray14[local14].substring(4);
					break;
				}
			}
		}
	}
}
