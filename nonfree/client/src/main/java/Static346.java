import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!mha", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[5];

	@OriginalMember(owner = "client!mha", name = "E", descriptor = "Z")
	public static boolean aBoolean583 = false;

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(II)I")
	public static int method5688(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZBII)I")
	public static int method5689(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub17 local8 = Static77.method3511(arg0, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray98.length) {
			return local8.anIntArray98[arg2];
		} else {
			return 0;
		}
	}
}
