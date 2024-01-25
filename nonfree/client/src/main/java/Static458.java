import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!qca", name = "B", descriptor = "I")
	public static int anInt4947;

	@OriginalMember(owner = "client!qca", name = "C", descriptor = "[S")
	public static final short[] aShortArray57 = new short[] { 49, 57, 48, 2, 21, 30, 17, 19 };

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIII)I")
	public static int method4354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg2;
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZI)I")
	public static int method4356(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
