import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "Lclient!wk;")
	public static Class264 aClass264_50;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "Lclient!ns;")
	public static Class166 aClass166_302;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public static int anInt7575 = 0;

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "Lclient!wi;")
	public static final Class263 aClass263_57 = new Class263(8, 0, 4, 1);

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
	public static int anInt7581 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZI)I")
	public static int method5849(@OriginalArg(2) int arg0) {
		@Pc(14) Class4_Sub39 local14 = Static195.method2229(arg0, false);
		if (local14 == null) {
			return Static88.aClass137_1.method2949(arg0).anInt4661;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray589.length; local31++) {
			if (local14.anIntArray589[local31] == -1) {
				local24++;
			}
		}
		return local24 + Static88.aClass137_1.method2949(arg0).anInt4661 - local14.anIntArray589.length;
	}
}
