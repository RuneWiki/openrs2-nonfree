import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "Z")
	public static boolean aBoolean666;

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "[I")
	public static final int[] anIntArray526 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_107 = new Class154(35, 6);

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "[I")
	public static final int[] anIntArray527 = new int[3];

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[5];

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
	public static int anInt7844 = 1;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I")
	public static int method6327() {
		return Static573.aClass264_1.method5512();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Lclient!ps;")
	public static Class273 method6329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class273 local7 = Static594.method7731(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass273Array2 == null || local7.aClass273Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass273Array2[arg1];
		}
	}
}
