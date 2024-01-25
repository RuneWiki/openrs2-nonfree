import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
	public static int anInt5923 = -1;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
	public static int anInt5924 = 1;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_79 = new Class84("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_148 = new Class131(24, 3);

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_20 = new Class225(13, 0, 1, 0);

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "[Lclient!ep;")
	public static final Class73[] aClass73Array2 = new Class73[30];

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "Z")
	public static boolean aBoolean385 = false;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
	public static int anInt5927 = 0;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method4792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg6 < 128 || arg5 < 128 || arg6 > (Static135.anInt2314 - 2) * 128 || Static352.anInt6022 * 128 - 256 < arg5) {
			Static343.anIntArray470[0] = Static343.anIntArray470[1] = -1;
			return;
		}
		@Pc(44) int local44 = Static289.method4078(arg6, arg5, arg3) - arg2;
		Static126.aClass18_1.ZA(arg1, 0, 0);
		Static276.aClass109_10.m(Static126.aClass18_1);
		Static276.aClass109_10.ia(arg6, local44, arg5, Static343.anIntArray470);
		Static126.aClass18_1.ZA(-arg1, 0, 0);
		Static276.aClass109_10.m(Static126.aClass18_1);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)V")
	public static void method4793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static268.aClass211ArrayArrayArray4[0][arg1][arg2] != null && Static268.aClass211ArrayArrayArray4[0][arg1][arg2].aClass211_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static268.aClass211ArrayArrayArray4[local22][arg1][arg2] == null) {
				@Pc(46) Class211 local46 = Static268.aClass211ArrayArrayArray4[local22][arg1][arg2] = new Class211(local22, arg1, arg2);
				if (local20) {
					local46.aByte78++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)Z")
	public static boolean method4794() {
		@Pc(8) Class1_Sub8 local8 = (Class1_Sub8) Static8.aClass266_2.aClass1_255.aClass1_262;
		if (local8 == null || Static8.aClass266_2.aClass1_255 == local8) {
			return false;
		} else {
			if (local8.anInt1758 >= 2000) {
				local8.anInt1758 -= 2000;
			}
			return local8.anInt1758 == 1010;
		}
	}
}
