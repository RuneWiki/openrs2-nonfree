import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString18;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
	public static int anInt560 = 0;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
	public static int[] anIntArray48 = new int[25];

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Z")
	public static boolean aBoolean40 = true;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Lclient!gd;")
	public static Class60 method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3452; local13++) {
			@Pc(22) Class60 local22 = local7.aClass60Array3[local13];
			if ((local22.aLong64 >> 29 & 0x3L) == 2L && local22.anInt1529 == arg1 && local22.anInt1522 == arg2) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZII)I")
	public static int method537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)V")
	public static void method539(@OriginalArg(0) byte arg0) {
		if (Static172.aByteArrayArrayArray2 == null) {
			Static172.aByteArrayArrayArray2 = new byte[4][104][104];
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(25) int local25 = 0; local25 < 104; local25++) {
				for (@Pc(32) int local32 = 0; local32 < 104; local32++) {
					Static172.aByteArrayArrayArray2[local20][local25][local32] = arg0;
				}
			}
		}
	}
}
