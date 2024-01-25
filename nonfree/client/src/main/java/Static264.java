import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!io", name = "b", descriptor = "[I")
	public static int[] anIntArray261;

	@OriginalMember(owner = "client!io", name = "k", descriptor = "Lclient!ph;")
	public static Class276 aClass276_2;

	@OriginalMember(owner = "client!io", name = "f", descriptor = "I")
	public static int anInt4921 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)Lclient!uaa;")
	public static Class345 method4120(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static648.aClass345ArrayArray2[local7] == null || Static648.aClass345ArrayArray2[local7][local11] == null) {
			@Pc(25) boolean local25 = Static107.method2043(local7);
			if (!local25) {
				return null;
			}
		}
		return Static648.aClass345ArrayArray2[local7][local11];
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)V")
	public static void method4124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static513.anInt8561 = arg1;
		Static154.anInt3151 = arg0;
		if (Static1.anInt9943 == 0) {
			Static193.anInt3732 = Static5.anInt59 * 2 + Static154.anInt3151;
			Static206.anInt3873 = Static414.anInt7335 * 2 + Static513.anInt8561;
		} else if (Static1.anInt9943 == 1) {
			Static299.anInt5764 = Static381.anInt10845 + Static154.anInt3151 / Static597.anInt9791 + 2;
			Static31.anInt495 = Static305.anInt5823 + Static513.anInt8561 / Static382.anInt6778 + 2;
			Static206.anInt3873 = Static382.anInt6778 * Static31.anInt495;
			Static193.anInt3732 = Static299.anInt5764 * Static597.anInt9791;
			Static414.anInt7335 = Static206.anInt3873 - Static513.anInt8561 >> 1;
			Static5.anInt59 = Static193.anInt3732 - Static154.anInt3151 >> 1;
			return;
		} else if (Static1.anInt9943 == 2) {
			Static206.anInt3873 = Static513.anInt8561;
			Static193.anInt3732 = Static154.anInt3151;
			return;
		}
	}
}
