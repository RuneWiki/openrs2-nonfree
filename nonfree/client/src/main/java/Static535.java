import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "J")
	public static long aLong389 = 0L;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)Z")
	public static boolean method7304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method7306(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static184.anInt5417; local16++) {
			if (arg0.equalsIgnoreCase(Static333.aStringArray26[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString49);
	}
}
