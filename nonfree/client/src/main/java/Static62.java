import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static62 {

	@OriginalMember(owner = "client!caa", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)I")
	public static int method1114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static400.anIntArrayArray31 == null ? 0 : Static400.anIntArrayArray31[arg0][arg1] & 0xFFFFFF;
	}
}
