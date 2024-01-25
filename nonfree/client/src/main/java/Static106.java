import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "F")
	public static float aFloat221;

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
	public static int anInt9893;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray97 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZCLjava/lang/String;)I")
	public static int method8244(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg1.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg1.charAt(local10) == arg0) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIILclient!tb;Lclient!ka;I)V")
	public static void method8252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class316 arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			arg2.method7474(arg1, arg3.G(), arg3.fa(), arg3.RA(), arg4, arg0, arg3.na(), arg3.HA(), arg3.EA(), arg3.V());
		}
	}
}
