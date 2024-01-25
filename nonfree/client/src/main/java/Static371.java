import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "[I")
	public static int[] anIntArray362 = new int[2];

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method5531(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(21) String local21 = Static382.method5678(arg0);
		if (local21 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < Static645.anInt10557; local27++) {
			@Pc(33) String local33 = Static167.aStringArray13[local27];
			@Pc(37) String local37 = Static382.method5678(local33);
			if (Static601.method8248(arg0, local33, local37, local21)) {
				Static645.anInt10557--;
				for (@Pc(50) int local50 = local27; local50 < Static645.anInt10557; local50++) {
					Static167.aStringArray13[local50] = Static167.aStringArray13[local50 + 1];
					Static7.aStringArray1[local50] = Static7.aStringArray1[local50 + 1];
					Static167.anIntArray152[local50] = Static167.anIntArray152[local50 + 1];
					Static181.aStringArray14[local50] = Static181.aStringArray14[local50 + 1];
					Static351.anIntArray339[local50] = Static351.anIntArray339[local50 + 1];
					Static369.aBooleanArray18[local50] = Static369.aBooleanArray18[local50 + 1];
				}
				Static98.anInt1628 = Static55.anInt959;
				@Pc(128) Class389 local128 = Static120.method1769(false);
				@Pc(134) Class5_Sub41 local134 = Static647.method8905(Static304.aClass381_133, local128.aClass393_2);
				local134.aClass5_Sub36_Sub2_1.method7324(Static271.method4453(arg0));
				local134.aClass5_Sub36_Sub2_1.method7327(arg0);
				local128.method9079(local134);
				return;
			}
		}
	}
}
