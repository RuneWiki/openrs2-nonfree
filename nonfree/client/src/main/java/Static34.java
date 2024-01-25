import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bo", name = "I", descriptor = "Lclient!mh;")
	public static Class156 aClass156_1;

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
	public static int anInt597 = 0;

	@OriginalMember(owner = "client!bo", name = "F", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBI)V")
	public static void method469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class156 local16 = Static259.aClass156ArrayArray1[arg1][arg0];
		if (local16 != null) {
			Static109.anInt2229 = local16.anInt4251;
			Static218.anInt3864 = local16.anInt4244;
			Static456.anInt7500 = local16.anInt4246;
		}
		Static106.method1848();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V")
	public static void method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static19.aClass223ArrayArrayArray1[0][arg1][arg2] != null && Static19.aClass223ArrayArrayArray1[0][arg1][arg2].aClass223_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static19.aClass223ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class223 local46 = Static19.aClass223ArrayArrayArray1[local22][arg1][arg2] = new Class223(local22, arg1, arg2);
				if (local20) {
					local46.aByte68++;
				}
			}
		}
	}
}
