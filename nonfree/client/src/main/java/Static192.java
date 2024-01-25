import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "Z")
	public static boolean aBoolean146;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "[Lclient!f;")
	public static Class76[] aClass76Array6;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!bi;III)V")
	public static void method1238(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static427.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt6960 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass2_Sub7Array3[arg0.anInt6960++] = Static77.aClass168Array9[local21 - 1].aClass2_Sub7_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt6960; local21 < 4; local21++) {
			arg0.aClass2_Sub7Array3[local21] = null;
		}
	}
}
