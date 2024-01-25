import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static249 {

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
	public static int anInt5210 = 0;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
	public static final int[] anIntArray405 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
	public static int anInt5212 = 0;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[S")
	public static short[] aShortArray95 = new short[256];

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
	public static int anInt5214 = 0;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_173 = new Class221(57, 8);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!fh;IB)V")
	public static void method4404(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aByte19 == 0) {
			arg1.anInt1833 = arg1.anInt1902;
		} else if (arg1.aByte19 == 1) {
			arg1.anInt1833 = arg1.anInt1902 + (arg2 - arg1.anInt1845) / 2;
		} else if (arg1.aByte19 == 2) {
			arg1.anInt1833 = arg2 - arg1.anInt1902 - arg1.anInt1845;
		} else if (arg1.aByte19 == 3) {
			arg1.anInt1833 = arg1.anInt1902 * arg2 >> 14;
		} else if (arg1.aByte19 == 4) {
			arg1.anInt1833 = (arg2 * arg1.anInt1902 >> 14) + (arg2 - arg1.anInt1845) / 2;
		} else {
			arg1.anInt1833 = arg2 - (arg2 * arg1.anInt1902 >> 14) - arg1.anInt1845;
		}
		if (arg1.aByte17 == 0) {
			arg1.anInt1831 = arg1.anInt1856;
		} else if (arg1.aByte17 == 1) {
			arg1.anInt1831 = (arg0 - arg1.anInt1874) / 2 + arg1.anInt1856;
		} else if (arg1.aByte17 == 2) {
			arg1.anInt1831 = arg0 - arg1.anInt1874 - arg1.anInt1856;
		} else if (arg1.aByte17 == 3) {
			arg1.anInt1831 = arg0 * arg1.anInt1856 >> 14;
		} else if (arg1.aByte17 == 4) {
			arg1.anInt1831 = (arg0 - arg1.anInt1874) / 2 + (arg0 * arg1.anInt1856 >> 14);
		} else {
			arg1.anInt1831 = arg0 - arg1.anInt1874 - (arg0 * arg1.anInt1856 >> 14);
		}
		if (!Static334.aBoolean581) {
			return;
		}
		if (Static46.method890(arg1).anInt6736 == 0 && arg1.anInt1871 != 0) {
			return;
		}
		if (arg1.anInt1831 < 0) {
			arg1.anInt1831 = 0;
		} else if (arg1.anInt1874 + arg1.anInt1831 > arg0) {
			arg1.anInt1831 = arg0 - arg1.anInt1874;
		}
		if (arg1.anInt1833 < 0) {
			arg1.anInt1833 = 0;
			return;
		}
		if (arg1.anInt1833 + arg1.anInt1845 > arg2) {
			arg1.anInt1833 = arg2 - arg1.anInt1845;
			return;
		}
	}
}
