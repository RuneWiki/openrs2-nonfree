import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "[I")
	public static int[] anIntArray456;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public static int anInt7599 = -1;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "[S")
	public static short[] aShortArray145 = new short[256];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)Lclient!lt;")
	public static Class23_Sub8 method6364() {
		@Pc(16) Class23_Sub8 local16 = (Class23_Sub8) Static503.aClass105_11.method2438();
		if (local16 == null) {
			return new Class23_Sub8();
		} else {
			Static325.anInt6037--;
			return local16;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIILclient!v;IIIILclient!ha;II)V")
	public static void method6366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub6_Sub20 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class16 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg3 > arg9 && arg7 + arg9 > arg3 && arg0 > arg2 - 13 && arg2 + 3 > arg0) {
			arg5 = arg10;
		}
		@Pc(40) String local40 = Static567.method7685(arg4);
		Static243.aClass69_5.method7462(arg9 + 3, arg2, Static442.anIntArray463, local40, arg5, Static359.aClass102Array17);
	}
}
