import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_180 = new Class180(41, 3);

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "[I")
	public static final int[] anIntArray763 = new int[13];

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZII)I")
	public static int method7884(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub24 local8 = Static640.method8894(arg2, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray306.length) {
			return local8.anIntArray306[arg0];
		} else {
			return 0;
		}
	}
}
