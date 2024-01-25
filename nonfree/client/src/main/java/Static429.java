import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "Lclient!aca;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "[S")
	public static short[] aShortArray115;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray98 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString183 = "";

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "Z")
	public static final boolean aBoolean562 = false;

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
	public static final int anInt7441 = 1337;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)Lclient!et;")
	public static Class91 method6657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class91 local7 = Static384.method6156(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.lb == null || arg1 >= local7.lb.length) {
			return null;
		} else {
			return local7.lb[arg1];
		}
	}
}
