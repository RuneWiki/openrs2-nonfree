import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
	public static int anInt8438;

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "[I")
	public static final int[] anIntArray608 = new int[200];

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "Z")
	public static boolean aBoolean565 = false;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method7194(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < Static453.anInt6954; local12++) {
			if (arg0.equalsIgnoreCase(Static646.aStringArray43[local12])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static557.aStringArray38[local12])) {
				return true;
			}
		}
		if (arg1 >= -10) {
			method7194((String) null, (byte) 124);
		}
		return false;
	}
}
