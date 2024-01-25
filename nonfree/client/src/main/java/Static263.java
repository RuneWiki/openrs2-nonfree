import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static263 {

	@OriginalMember(owner = "client!kb", name = "Sb", descriptor = "Lclient!pe;")
	public static Class254 aClass254_78;

	@OriginalMember(owner = "client!kb", name = "vc", descriptor = "[I")
	public static final int[] anIntArray340 = new int[6];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method4644() {
		Static378.anInt10236 = 0;
		Static171.anInt3554 = 0;
		Static11.anInt366 = 0;
		Static393.anInt7568 = 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)Z")
	public static boolean method4657(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
