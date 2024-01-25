import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
	public static int[] anIntArray363;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_80 = new Class241(71, -1);

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public static int anInt6149 = -60;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Z")
	public static boolean aBoolean455 = false;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIII)I")
	public static int method5537(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static98.anInt1457 < 100) {
			return -2;
		}
		@Pc(13) int local13 = -2;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(20) int local20 = arg1 - Static627.anInt7264;
		@Pc(25) int local25 = arg0 - Static627.anInt7268;
		for (@Pc(30) Class6_Sub24 local30 = (Class6_Sub24) Static627.aClass340_57.method8124(); local30 != null; local30 = (Class6_Sub24) Static627.aClass340_57.method8134()) {
			if (arg2 == local30.anInt4787) {
				@Pc(43) int local43 = local30.anInt4789;
				@Pc(46) int local46 = local30.anInt4794;
				@Pc(56) int local56 = local43 + Static627.anInt7264 << 14 | Static627.anInt7268 + local46;
				@Pc(77) int local77 = (local20 - local43) * (local20 + -local43) + (local25 - local46) * (local25 + -local46);
				if (local13 < 0 || local77 < local15) {
					local13 = local56;
					local15 = local77;
				}
			}
		}
		return local13;
	}
}
