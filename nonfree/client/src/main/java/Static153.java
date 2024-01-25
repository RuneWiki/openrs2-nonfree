import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fm", name = "L", descriptor = "Lclient!of;")
	public static final Class230 aClass230_17 = new Class230(11, 6);

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
	public static int anInt2863 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZIZ)I")
	public static int method2444(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub46 local14 = Static378.method5549(false, arg0);
		if (local14 == null) {
			return Static410.aClass21_1.method354(arg0).anInt5543;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray582.length; local26++) {
			if (local14.anIntArray582[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static410.aClass21_1.method354(arg0).anInt5543 - local14.anIntArray582.length;
	}
}
