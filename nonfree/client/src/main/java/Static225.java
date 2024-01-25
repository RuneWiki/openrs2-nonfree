import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method3894() {
		Static174.aClass313_23.method7400();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)V")
	public static void method3895(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static418.anInt7355 = arg1;
		Static438.anInt7729 = 2;
		Static524.method7186(arg2, false, arg0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([SB)[S")
	public static short[] method3896(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static551.method3493(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}
}
