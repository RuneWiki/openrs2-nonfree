import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static566 {

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
	public static int anInt9466 = 0;

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "[Lclient!ck;")
	public static final Class56[] aClass56Array1 = new Class56[35];

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
	public static int anInt9470 = -1;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)I")
	public static int method7773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static596.anIntArray724[arg0 & 0x3] : 256;
	}
}
