import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static161 {

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
	public static int anInt6991 = 0;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray40 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_160 = new Class265(86, 0);

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	public static int anInt6992 = -1;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "[F")
	public static final float[] aFloatArray58 = new float[4];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5536(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIBII)Z")
	public static boolean method5537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static227.aByteArrayArrayArray8[0][arg3][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static227.aByteArrayArrayArray8[arg1][arg3][arg2] & 0x10) == 0) {
			return Static434.method5669(arg3, arg2, arg1) == arg0;
		} else {
			return false;
		}
	}
}
