import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "F")
	public static float aFloat111;

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "F")
	public static float aFloat112;

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "Lclient!hf;")
	public static final Class129 aClass129_3 = new Class129();

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "Z")
	public static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "Lclient!mc;")
	public static Class198 aClass198_6 = null;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIBI)I")
	public static int method3669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class12_Sub1_Sub36.anIntArray668[arg3 * 8192 / arg1] >> 1;
		return (local16 * arg2 >> 16) + ((65536 - local16) * arg0 >> 16);
	}
}
