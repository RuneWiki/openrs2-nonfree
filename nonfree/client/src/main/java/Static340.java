import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
	public static int anInt6093 = -1;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
	public static int anInt6094 = -1;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
	public static int anInt6095 = -1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIZ)V")
	public static void method5162(@OriginalArg(3) boolean arg0) {
		Static444.anInt7642 = 2;
		Static477.anInt7971 = 22050;
		Static187.aBoolean231 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZLclient!jq;II)V")
	public static void method5163(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class156 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg1.anInt4732;
		if (arg1.aByte61 == 0) {
			arg1.anInt4732 = arg1.anInt4671;
		} else if (arg1.aByte61 == 1) {
			arg1.anInt4732 = arg3 - arg1.anInt4671;
		} else if (arg1.aByte61 == 2) {
			arg1.anInt4732 = arg1.anInt4671 * arg3 >> 14;
		}
		@Pc(52) int local52 = arg1.anInt4673;
		if (arg1.aByte59 == 0) {
			arg1.anInt4673 = arg1.anInt4737;
		} else if (arg1.aByte59 == 1) {
			arg1.anInt4673 = arg2 - arg1.anInt4737;
		} else if (arg1.aByte59 == 2) {
			arg1.anInt4673 = arg1.anInt4737 * arg2 >> 14;
		}
		if (arg1.aByte61 == 4) {
			arg1.anInt4732 = arg1.anInt4722 * arg1.anInt4673 / arg1.anInt4695;
		}
		if (arg1.aByte59 == 4) {
			arg1.anInt4673 = arg1.anInt4695 * arg1.anInt4732 / arg1.anInt4722;
		}
		if (Static54.aBoolean69 && (Static67.method1228(arg1).anInt2505 != 0 || arg1.anInt4735 == 0)) {
			if (arg1.anInt4673 < 5 && arg1.anInt4732 < 5) {
				arg1.anInt4732 = 5;
				arg1.anInt4673 = 5;
			} else {
				if (arg1.anInt4673 <= 0) {
					arg1.anInt4673 = 5;
				}
				if (arg1.anInt4732 <= 0) {
					arg1.anInt4732 = 5;
				}
			}
		}
		if (Static480.anInt7980 == arg1.anInt4729) {
			Static31.aClass156_1 = arg1;
		}
		if (arg0 && arg1.anObjectArray6 != null && (arg1.anInt4732 != local12 || local52 != arg1.anInt4673)) {
			@Pc(193) Class1_Sub30 local193 = new Class1_Sub30();
			local193.anObjectArray36 = arg1.anObjectArray6;
			local193.aClass156_11 = arg1;
			Static90.aClass37_21.method970(local193);
		}
	}
}
