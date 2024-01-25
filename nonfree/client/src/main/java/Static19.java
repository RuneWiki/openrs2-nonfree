import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static19 {

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "[I")
	public static int[] anIntArray100;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
	public static int anInt390;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
	public static int anInt391;

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "Lclient!gf;")
	public static final Class120 aClass120_1 = new Class120();

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
	public static int anInt389 = 0;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZII)I")
	public static int method382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)I")
	public static int method384(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
