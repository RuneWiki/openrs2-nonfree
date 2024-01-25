import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_83 = new Class136(8);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIBII)I")
	public static int method6199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class6_Sub2_Sub7.anIntArray177[arg3 * 8192 / arg0] >> 1;
		return (arg2 * local16 >> 16) + ((65536 - local16) * arg1 >> 16);
	}
}
