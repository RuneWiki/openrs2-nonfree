import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
	public static int anInt8396;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "Z")
	public static boolean aBoolean605 = false;

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
	public static final int anInt8395 = 1;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Lclient!iq;")
	public static Class1_Sub5 method7013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class1_Sub5 local14 = local7.aClass1_Sub5_1;
			local7.aClass1_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBI)Z")
	public static boolean method7016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B[[I)V")
	public static void method7018(@OriginalArg(1) int[][] arg0) {
		Static130.anIntArrayArray89 = arg0;
	}
}
