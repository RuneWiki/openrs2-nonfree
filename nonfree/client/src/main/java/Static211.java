import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hda", name = "m", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_62 = new Class100(68, 3);

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZIII)I")
	public static int method3344(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class14_Sub50 local13 = Static250.method3683(arg1, arg0);
		if (local13 == null) {
			return -1;
		} else if (arg2 >= 0 && local13.anIntArray699.length > arg2) {
			return local13.anIntArray699[arg2];
		} else {
			return -1;
		}
	}
}
