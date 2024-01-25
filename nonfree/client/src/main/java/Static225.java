import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "F")
	public static float aFloat142;

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
	public static int anInt4310;

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[128][128];

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_104 = new Class81(15, 0);

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
	public static final int anInt4312 = 1337;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
	public static void method3478() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static125.aBooleanArray17[local3] = false;
		}
		Static65.anInt7824 = 1;
		Static21.anInt433 = -1;
		Static148.anInt2821 = -1;
		Static399.anInt6965 = 0;
		Static391.anInt6869 = 0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)Lclient!ra;")
	public static Class208 method3479(@OriginalArg(1) int arg0) {
		@Pc(8) Class208[] local8 = Static379.method5281();
		for (@Pc(16) int local16 = 0; local16 < local8.length; local16++) {
			if (local8[local16].anInt5936 == arg0) {
				return local8[local16];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([SB[Ljava/lang/String;)V")
	public static void method3480(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static14.method221(arg1, arg1.length - 1, 0, arg0);
	}
}
