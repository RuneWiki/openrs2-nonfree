import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
	public static int anInt1394;

	@OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lclient!wd;")
	public static Class111 aClass111_19;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "S")
	public static short aShort6 = 1;

	@OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
	public static volatile int anInt1402 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZILclient!oe;)Z")
	public static boolean method1150(@OriginalArg(1) int arg0, @OriginalArg(2) Class72 arg1) {
		@Pc(16) byte[] local16 = arg1.method3184(arg0);
		if (local16 == null) {
			return false;
		} else {
			Static156.method2803(local16);
			return true;
		}
	}
}
