import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "Lclient!hw;")
	public static Class154 aClass154_1;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "Lclient!uq;")
	public static Class362 aClass362_88;

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "[S")
	public static short[] aShortArray74;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
	public static int anInt6707 = 0;

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "[I")
	public static final int[] anIntArray351 = new int[200];

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BI)Z")
	public static boolean method5629(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(BI)Z")
	public static boolean method5630(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Z")
	public static boolean method5631(@OriginalArg(0) int arg0) {
		if (arg0 == 11 || arg0 == 51 || arg0 == 18 || arg0 == 23 || arg0 == 12) {
			return true;
		} else {
			return arg0 == 49 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIBLclient!ofa;Lclient!ha;I)V")
	public static void method5632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class265 arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = 7; local11 >= 0; local11--) {
			for (@Pc(15) int local15 = 127; local15 >= 0; local15--) {
				@Pc(33) int local33 = (arg1 & 0x3F) << 10 | (local11 & 0x7) << 7 | local15 & 0x7F;
				Static253.method3817(true, false);
				@Pc(41) int local41 = Static537.anIntArray457[local33];
				Static84.method1335(false, true);
				arg3.aa((local15 * arg2.anInt7024 >> 7) + arg0, arg4 - -((7 - local11) * arg2.anInt6997 >> 3), (arg2.anInt7024 >> 7) + 1, (arg2.anInt6997 >> 3) + 1, local41, 0);
			}
		}
	}
}
