import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "Lclient!at;")
	public static final Class23 aClass23_2 = new Class23(false);

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "Lclient!at;")
	public static Class23 aClass23_1 = aClass23_2;

	@OriginalMember(owner = "client!lda", name = "r", descriptor = "I")
	public static int anInt6184 = 0;

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)V")
	public static void method5119() {
		if (!Static492.aBoolean626) {
			Static492.aBoolean626 = true;
			Static117.aFloat269 += (24.0F - Static117.aFloat269) / 2.0F;
			Static137.aBoolean207 = true;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V")
	public static void method5122() {
		if (Static166.anInt3247 <= 0) {
			Static76.aString15 = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static286.aStringArray14.length; local15++) {
			if (Static286.aStringArray14[local15].indexOf("--> ") != -1) {
				local13++;
				if (Static166.anInt3247 == local13) {
					Static76.aString15 = Static286.aStringArray14[local15].substring(Static286.aStringArray14[local15].indexOf(">") + 2);
					break;
				}
			}
		}
	}
}
