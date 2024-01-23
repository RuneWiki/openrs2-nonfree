import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "y", descriptor = "J")
	public static volatile long aLong6 = 0L;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
	public static void method29(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		if (arg3 > arg2) {
			for (local19 = arg2; local19 < arg3; local19++) {
				Static51.anIntArrayArray1[local19][arg0] = arg1;
			}
		} else {
			for (local19 = arg3; local19 < arg2; local19++) {
				Static51.anIntArrayArray1[local19][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)Lclient!km;")
	public static Class102 method31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class102 local14 = local7.aClass102_1;
			local7.aClass102_1 = null;
			return local14;
		}
	}
}
