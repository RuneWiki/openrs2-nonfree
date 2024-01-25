import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Lclient!fd;")
	public static Class72 aClass72_21;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 < 128 || arg1 < 128 || arg2 > Static92.anInt2048 * 128 - 256 || arg1 > Static290.anInt5893 * 128 - 256) {
			Static257.anIntArray436[0] = Static257.anIntArray436[1] = -1;
			return;
		}
		@Pc(51) int local51 = Static119.method2125(arg2, arg1, Static279.anInt5645) - arg4;
		Static269.aClass23_5.method5089(arg0, 0, 0);
		Static164.aClass92_7.method4530(Static269.aClass23_5);
		Static164.aClass92_7.method4443(arg2, local51, arg1, Static257.anIntArray436);
		Static269.aClass23_5.method5089(-arg0, 0, 0);
		Static164.aClass92_7.method4530(Static269.aClass23_5);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public static void method5624() {
		for (@Pc(10) Class4_Sub8 local10 = (Class4_Sub8) Static38.aClass198_5.method5268(); local10 != null; local10 = (Class4_Sub8) Static38.aClass198_5.method5263()) {
			@Pc(15) int local15 = local10.anInt1670;
			if (Static266.method4641(local15)) {
				@Pc(21) boolean local21 = true;
				@Pc(25) Class72[] local25 = Static158.aClass72ArrayArray1[local15];
				for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
					if (local25[local27] != null) {
						local21 = local25[local27].aBoolean159;
						break;
					}
				}
				if (!local21) {
					@Pc(55) int local55 = (int) local10.aLong259;
					@Pc(59) Class72 local59 = Static66.method1243(local55);
					if (local59 != null) {
						Static238.method4097(local59);
					}
				}
			}
		}
	}
}
