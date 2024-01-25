import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static283 {

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "Lclient!mk;")
	public static Class210 aClass210_2;

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "Lclient!sca;")
	public static Class302 aClass302_41;

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_53 = new Class208(5, 2);

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "[I")
	public static final int[] anIntArray370 = new int[256];

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
	public static final int anInt6253 = 1403;

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "[I")
	public static final int[] anIntArray371 = new int[1000];

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIILclient!qj;)V")
	public static void method5438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class274 arg2) {
		Static476.aClass274ArrayArray4[arg1][arg0] = arg2;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)Z")
	public static boolean method5439(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}
}
