import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
	public static int anInt9869;

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Lclient!ml;")
	public static final Class3_Sub37 aClass3_Sub37_1 = new Class3_Sub37(0, 0);

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "Lclient!qk;")
	public static Class279 aClass279_18 = null;

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "Lclient!ae;")
	public static final Class7 aClass7_7 = new Class7();

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)I")
	public static int method8451(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static57.anInt1567 - 1; local3++) {
			if (arg0 < Static89.anIntArray77[local3] + Static511.anIntArray547[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static57.anInt1567 - 1;
		}
		return local1;
	}
}
