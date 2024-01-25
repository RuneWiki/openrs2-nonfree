import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public static int anInt128;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!gf;")
	public static final Class85 aClass85_1 = new Class85(16);

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_8 = new Class102(31, 3);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIZ)I")
	public static int method116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(16) Class2_Sub36 local16 = Static382.method4911(arg2, arg1);
		if (local16 == null) {
			return -1;
		} else if (arg0 >= 0 && local16.anIntArray395.length > arg0) {
			return local16.anIntArray395[arg0];
		} else {
			return -1;
		}
	}
}
