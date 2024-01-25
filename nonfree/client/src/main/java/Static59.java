import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cu", name = "vb", descriptor = "I")
	public static int anInt3263;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)Z")
	public static boolean method2634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static438.aBoolean636) {
			return false;
		}
		@Pc(11) int local11 = arg0 >> 16;
		@Pc(15) int local15 = arg0 & 0xFFFF;
		if (Static178.aClass156ArrayArray2[local11] == null || Static178.aClass156ArrayArray2[local11][local15] == null) {
			return false;
		}
		@Pc(38) Class156 local38 = Static178.aClass156ArrayArray2[local11][local15];
		@Pc(55) Class3_Sub14 local55;
		if (arg1 == -1 && local38.anInt4792 == 0) {
			for (local55 = (Class3_Sub14) Static184.aClass243_21.method5208(); local55 != null; local55 = (Class3_Sub14) Static184.aClass243_21.method5203()) {
				if (local55.anInt2182 == 50 || local55.anInt2182 == 1002 || local55.anInt2182 == 8 || local55.anInt2182 == 10 || local55.anInt2182 == 15) {
					for (@Pc(87) Class156 local87 = Static435.method5705(local55.anInt2180); local87 != null; local87 = Static386.method5013(local87)) {
						if (local38.anInt4850 == local87.anInt4850) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class3_Sub14) Static184.aClass243_21.method5208(); local55 != null; local55 = (Class3_Sub14) Static184.aClass243_21.method5203()) {
				if (local55.anInt2181 == arg1 && local38.anInt4850 == local55.anInt2180 && (local55.anInt2182 == 50 || local55.anInt2182 == 1002 || local55.anInt2182 == 8 || local55.anInt2182 == 10 || local55.anInt2182 == 15)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZII)I")
	public static int method2642(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub32 local8 = Static238.method3609(arg0, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg2 >= 0 && local8.anIntArray339.length > arg2) {
			return local8.anIntArray339[arg2];
		} else {
			return -1;
		}
	}
}
