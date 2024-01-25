import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static581 {

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "J")
	public static long aLong264;

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_278 = new Class363(61, -2);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ)Z")
	public static boolean method7883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!kp;II)V")
	public static void method7884(@OriginalArg(1) Class196 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static406.anInt7068 = arg1;
		Static151.anInt3036 = arg2;
		Static433.aClass196_7 = arg0;
	}
}
