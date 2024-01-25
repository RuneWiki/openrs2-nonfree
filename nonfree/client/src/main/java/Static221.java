import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
	public static int anInt5059;

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
	public static int anInt5061;

	@OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
	public static int anInt5063;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_53 = new Class71(70, 2);

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
	public static int anInt5060 = 0;

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "[F")
	public static final float[] aFloatArray54 = new float[2];

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
	public static int anInt5062 = 0;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method4149(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static439.method6796(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(35) int local35 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(43) int local43;
			do {
				local43 = arg1.nextInt();
			} while (local35 <= local43);
			return Static196.method3669(arg0, local43);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IBI)V")
	public static void method4151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static371.anInt7077 = arg0;
		Static553.anInt9617 = arg1;
		if (Static105.anInt2774 == 0) {
			Static494.anInt8752 = Static553.anInt9617 + Static1.anInt10287 * 2;
			Static100.anInt2662 = Static371.anInt7077 + Static389.anInt7547 * 2;
		} else if (Static105.anInt2774 == 1) {
			Static121.anInt3161 = Static553.anInt9617 / Static332.anInt6574 + Static373.anInt8863 + 2;
			Static362.anInt6930 = Static371.anInt7077 / Static266.anInt5676 + Static408.anInt7795 + 2;
			Static100.anInt2662 = Static362.anInt6930 * Static266.anInt5676;
			Static494.anInt8752 = Static332.anInt6574 * Static121.anInt3161;
			Static1.anInt10287 = Static494.anInt8752 - Static553.anInt9617 >> 1;
			Static389.anInt7547 = Static100.anInt2662 - Static371.anInt7077 >> 1;
			return;
		} else if (Static105.anInt2774 == 2) {
			Static100.anInt2662 = Static371.anInt7077;
			Static494.anInt8752 = Static553.anInt9617;
			return;
		}
	}
}
