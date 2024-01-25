import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
	public static int anInt7586;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
	public static int anInt7589;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_53 = new Class330(8);

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "[Lclient!rq;")
	public static final Class283[] aClass283Array1 = new Class283[100];

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
	public static int anInt7590 = -1;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZIIZ)I")
	public static int method6072(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class6_Sub46 local10 = Static378.method5549(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray582.length; local18++) {
			if (local10.anIntArray582[local18] >= 0 && local10.anIntArray582[local18] < Static119.aClass244_4.anInt7168) {
				@Pc(49) Class236 local49 = Static119.aClass244_4.method5726(local10.anIntArray582[local18]);
				@Pc(59) int local59 = local49.method5480(arg0, Static111.aClass259_1.method5915(arg0).anInt9885);
				if (arg2) {
					local16 += local59 * local10.anIntArray583[local18];
				} else {
					local16 += local59;
				}
			}
		}
		return local16;
	}
}
