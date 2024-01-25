import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array13;

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
	public static int anInt4237;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "Lclient!gi;")
	public static final Class85 aClass85_6 = new Class85(128);

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_110 = new Class163(56, 3);

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "Lclient!pa;")
	public static final Class183 aClass183_12 = new Class183(1, -1);

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[128][128];

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method3545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
	public static void method3547() {
		Static358.aClass243_1 = new Class243(8);
		Static80.anInt1439 = 0;
		for (@Pc(25) Class23_Sub3 local25 = (Class23_Sub3) Static77.aClass194_2.method4577(); local25 != null; local25 = (Class23_Sub3) Static77.aClass194_2.method4580()) {
			local25.method2966();
		}
	}
}
