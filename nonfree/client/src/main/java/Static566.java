import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "[I")
	public static final int[] anIntArray524 = new int[4];

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
	public static int anInt9571 = 0;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)Z")
	public static boolean method8224() {
		try {
			@Pc(7) Class122 local7 = new Class122();
			@Pc(12) byte[] local12 = local7.method2711(Static261.aByteArray35);
			Static207.method3585(local12);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}
}
