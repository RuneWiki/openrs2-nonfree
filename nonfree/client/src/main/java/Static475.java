import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "Lclient!ha;")
	public static Class2 aClass2_35;

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
	public static int anInt6155 = 0;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray81 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZI)Z")
	public static boolean method5204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V")
	public static void method5209(@OriginalArg(0) int arg0) {
		if (!Static204.method3515(arg0)) {
			return;
		}
		@Pc(14) Class156[] local14 = Static396.aClass156ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class156 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt4652 = 0;
				local22.anInt4670 = 0;
				local22.anInt4680 = 1;
			}
		}
	}
}
