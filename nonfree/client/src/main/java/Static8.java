import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "jb", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Lclient!js;")
	public static final Class156 aClass156_1 = new Class156(11, 0, 1, 2);

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_5 = new Class277(20);

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_6 = new Class305(49, 1);

	@OriginalMember(owner = "client!ae", name = "W", descriptor = "Lclient!ui;")
	public static final Class295 aClass295_3 = new Class295();

	@OriginalMember(owner = "client!ae", name = "gb", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_7 = new Class45("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)I")
	public static int method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B[S)[S")
	public static short[] method396(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static556.method7045(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
