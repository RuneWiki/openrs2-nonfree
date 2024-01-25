import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
	public static int anInt4466;

	@OriginalMember(owner = "client!aw", name = "L", descriptor = "[Lclient!pga;")
	public static Class32[] aClass32Array11;

	@OriginalMember(owner = "client!aw", name = "O", descriptor = "I")
	public static int anInt4468;

	@OriginalMember(owner = "client!aw", name = "E", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_74 = new Class268(75, 8);

	@OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
	public static int anInt4467 = 0;

	@OriginalMember(owner = "client!aw", name = "N", descriptor = "Lclient!io;")
	public static final Class152 aClass152_7 = new Class152(3, 2);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIII)I")
	public static int method3898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 4095 - arg0;
		} else if (local7 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}
}
