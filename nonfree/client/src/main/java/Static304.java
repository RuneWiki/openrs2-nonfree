import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
	public static int anInt6543;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "Lclient!rf;")
	public static Class206 aClass206_122;

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
	public static final int anInt6545 = 50;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "[I")
	public static final int[] anIntArray1344 = new int[anInt6545];

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "[I")
	public static final int[] anIntArray1345 = new int[anInt6545];

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "[I")
	public static final int[] anIntArray1346 = new int[anInt6545];

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "[I")
	public static final int[] anIntArray1347 = new int[anInt6545];

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "[I")
	public static final int[] anIntArray1348 = new int[anInt6545];

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray162 = new String[anInt6545];

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "[I")
	public static final int[] anIntArray1349 = new int[anInt6545];

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIB)V")
	public static void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(40) String local40 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local40);
		Static192.method3298(true, local40);
	}
}
