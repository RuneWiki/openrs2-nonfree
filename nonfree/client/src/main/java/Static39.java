import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static39 {

	@OriginalMember(owner = "client!dg", name = "nc", descriptor = "I")
	public static int anInt1274 = 0;

	@OriginalMember(owner = "client!dg", name = "pc", descriptor = "[S")
	public static final short[] aShortArray24 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!dg", name = "wc", descriptor = "J")
	public static long aLong34 = 0L;

	@OriginalMember(owner = "client!dg", name = "Dc", descriptor = "[I")
	public static final int[] anIntArray118 = new int[25];

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ra;I)V")
	public static void method900(@OriginalArg(0) Class72 arg0) {
		if (Static8.anInt286 == arg0.anInt3872) {
			Static127.aBooleanArray14[arg0.anInt3928] = true;
		}
	}
}
