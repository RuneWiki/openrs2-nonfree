import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static440 {

	@OriginalMember(owner = "client!raa", name = "p", descriptor = "Lclient!f;")
	public static Class5 aClass5_34;

	@OriginalMember(owner = "client!raa", name = "k", descriptor = "Lclient!fc;")
	public static final Class93 aClass93_7 = new Class93("WTQA", 2);

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "Lclient!ou;")
	public static final Class260 aClass260_4 = new Class260();

	@OriginalMember(owner = "client!raa", name = "o", descriptor = "Lclient!je;")
	public static final Class170 aClass170_11 = new Class170();

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(II)I")
	public static int method6225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static351.anIntArrayArray33 == null ? 0 : Static351.anIntArrayArray33[arg0][arg1] & 0xFFFFFF;
	}
}
