import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!hja;")
	public static Class161 aClass161_1;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "[I")
	public static int[] anIntArray325;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Lclient!fr;")
	public static final Class123 aClass123_3 = new Class123(0, 2, 2, 1);

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	public static int anInt4140 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZILclient!nt;I)V")
	public static void method3805(@OriginalArg(1) int arg0, @OriginalArg(2) Class270 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte110 == 0) {
			arg1.anInt6981 = arg1.anInt6974;
		} else if (arg1.aByte110 == 1) {
			arg1.anInt6981 = arg1.anInt6974 + (arg0 - arg1.anInt7045) / 2;
		} else if (arg1.aByte110 == 2) {
			arg1.anInt6981 = arg0 - arg1.anInt7045 - arg1.anInt6974;
		} else if (arg1.aByte110 == 3) {
			arg1.anInt6981 = arg1.anInt6974 * arg0 >> 14;
		} else if (arg1.aByte110 == 4) {
			arg1.anInt6981 = (arg1.anInt6974 * arg0 >> 14) + (arg0 - arg1.anInt7045) / 2;
		} else {
			arg1.anInt6981 = arg0 - arg1.anInt7045 - (arg1.anInt6974 * arg0 >> 14);
		}
		if (arg1.aByte109 == 0) {
			arg1.anInt7036 = arg1.anInt7054;
		} else if (arg1.aByte109 == 1) {
			arg1.anInt7036 = (arg2 - arg1.anInt7015) / 2 + arg1.anInt7054;
		} else if (arg1.aByte109 == 2) {
			arg1.anInt7036 = arg2 - arg1.anInt7054 - arg1.anInt7015;
		} else if (arg1.aByte109 == 3) {
			arg1.anInt7036 = arg2 * arg1.anInt7054 >> 14;
		} else if (arg1.aByte109 == 4) {
			arg1.anInt7036 = (arg2 * arg1.anInt7054 >> 14) + (arg2 - arg1.anInt7015) / 2;
		} else {
			arg1.anInt7036 = arg2 - (arg2 * arg1.anInt7054 >> 14) - arg1.anInt7015;
		}
		if (!Static571.aBoolean583) {
			return;
		}
		if (Static85.method1871(arg1).anInt7682 == 0 && arg1.anInt7008 != 0) {
			return;
		}
		if (arg1.anInt7036 < 0) {
			arg1.anInt7036 = 0;
		} else if (arg1.anInt7015 + arg1.anInt7036 > arg2) {
			arg1.anInt7036 = arg2 - arg1.anInt7015;
		}
		if (arg1.anInt6981 < 0) {
			arg1.anInt6981 = 0;
			return;
		}
		if (arg1.anInt7045 + arg1.anInt6981 > arg0) {
			arg1.anInt6981 = arg0 - arg1.anInt7045;
			return;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
	public static void method3806() {
		@Pc(5) Class307 local5 = Static41.aClass307_11;
		synchronized (Static41.aClass307_11) {
			Static41.aClass307_11.method6995(5);
		}
	}
}
