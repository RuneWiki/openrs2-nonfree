import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static188 {

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
	public static int anInt3659;

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_110 = new Class272(112, 10);

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
	public static int anInt3658 = 1;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
	public static boolean method3226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
