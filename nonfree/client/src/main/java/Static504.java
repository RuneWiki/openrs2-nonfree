import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static504 {

	@OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
	public static int[] anIntArray776;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_127 = new Class158(2, 4);

	@OriginalMember(owner = "client!va", name = "d", descriptor = "I")
	public static int anInt9379 = 0;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "[I")
	public static final int[] anIntArray777 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BII)Z")
	public static boolean method7747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z")
	public static boolean method7750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
