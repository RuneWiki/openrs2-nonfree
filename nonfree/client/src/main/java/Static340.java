import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!li", name = "x", descriptor = "Lclient!ec;")
	public static Class92 aClass92_4;

	@OriginalMember(owner = "client!li", name = "z", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_92 = new Class171(56, 3);

	@OriginalMember(owner = "client!li", name = "A", descriptor = "I")
	public static int anInt5862 = -1;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IBII)I")
	public static int method4971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1 & 0x3;
		if (local8 == 0) {
			return arg2;
		} else if (local8 == 1) {
			return 4095 - arg0;
		} else if (local8 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(II)V")
	public static void method4972(@OriginalArg(1) int arg0) {
		if (Static185.method2900(arg0)) {
			Static676.method9004(-1, Static270.aClass265ArrayArray2[arg0]);
		}
	}
}
