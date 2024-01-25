import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "Lclient!ri;")
	public static Class284 aClass284_115;

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "[I")
	public static int[] anIntArray393;

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
	public static final int anInt6995 = 52;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZIII)I")
	public static int method5589(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub44 local8 = Static470.method6424(arg0, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(19) int local19 = 0;
			for (@Pc(21) int local21 = 0; local21 < local8.anIntArray447.length; local21++) {
				if (local8.anIntArray446[local21] == arg1) {
					local19 += local8.anIntArray447[local21];
				}
			}
			return local19;
		}
	}
}
