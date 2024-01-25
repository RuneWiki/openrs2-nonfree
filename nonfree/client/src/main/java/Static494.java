import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!su", name = "j", descriptor = "I")
	public static int anInt8292;

	@OriginalMember(owner = "client!su", name = "k", descriptor = "Z")
	public static boolean aBoolean599 = false;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "I")
	public static int anInt8294 = 0;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "I")
	public static int anInt8295 = 100;

	@OriginalMember(owner = "client!su", name = "p", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[4];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BII)Z")
	public static boolean method6907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(30) boolean local30 = (arg1 & 0x37) == 0 ? Static563.method7586(arg1, arg0) : Static205.method3502(arg0, arg1);
		return local30 | Static96.method1811(arg0, arg1) | (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BI)I")
	public static int method6908(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(CBLjava/lang/String;)I")
	public static int method6909(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0 == arg1.charAt(local17)) {
				local12++;
			}
		}
		return local12;
	}
}
