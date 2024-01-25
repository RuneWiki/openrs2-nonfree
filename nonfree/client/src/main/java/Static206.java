import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!km", name = "g", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_83 = new Class265(84, 10);

	@OriginalMember(owner = "client!km", name = "h", descriptor = "Lclient!di;")
	public static final Class54 aClass54_56 = new Class54(7, 7);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public static void method3257(@OriginalArg(0) int arg0) {
		Static190.anInt3695 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static42.anInt4340; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static386.anInt6463; local6++) {
				if (Static440.aClass106ArrayArrayArray3[arg0][local3][local6] == null) {
					Static440.aClass106ArrayArrayArray3[arg0][local3][local6] = new Class106(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIBII)V")
	public static void method3258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg0 > arg2) {
			for (local10 = arg2; local10 < arg0; local10++) {
				Static280.anIntArrayArray51[local10][arg1] = arg3;
			}
		} else {
			for (local10 = arg0; local10 < arg2; local10++) {
				Static280.anIntArrayArray51[local10][arg1] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	public static void method3260() {
		Static439.method5691();
	}
}
