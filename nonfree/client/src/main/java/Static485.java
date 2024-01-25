import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!qfa", name = "i", descriptor = "Lclient!hk;")
	public static final Class146 aClass146_11 = new Class146(9, 0, 4, 1);

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IBI)Z")
	public static boolean method7681(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static544.method8346(arg0, arg1) || Static616.method9601(arg0, arg1);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IJ)I")
	public static int method7682(@OriginalArg(1) long arg0) {
		Static345.method5977(arg0);
		return Static550.aCalendar2.get(1);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZIZIZ)I")
	public static int method7683(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class2_Sub42 local10 = Static47.method979(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray350.length; local18++) {
			if (local10.anIntArray350[local18] >= 0 && Static372.aClass343_1.anInt9759 > local10.anIntArray350[local18]) {
				@Pc(48) Class351 local48 = Static372.aClass343_1.method8549(local10.anIntArray350[local18]);
				@Pc(58) int local58 = local48.method8822(arg2, Static142.aClass367_1.method9243(arg2).anInt5933);
				if (arg0) {
					local16 += local10.anIntArray351[local18] * local58;
				} else {
					local16 += local58;
				}
			}
		}
		return local16;
	}
}
