import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static156 {

	@OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
	public static int[] anIntArray382;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	public static int anInt3693;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "[Lclient!jd;")
	public static Class1_Sub11[] aClass1_Sub11Array1;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "I")
	public static int anInt3696;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1260 = Static161.method2971(":trade:");

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1261 = Static161.method2971("Bad session id)3");

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1262 = Static161.method2971("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1263 = aClass13_1261;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "I")
	public static int anInt3694 = 0;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1264 = Static161.method2971("");

	@OriginalMember(owner = "client!se", name = "s", descriptor = "[I")
	public static int[] anIntArray383 = new int[50];

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1265 = Static161.method2971(" <col=ffff00>");

	@OriginalMember(owner = "client!se", name = "u", descriptor = "I")
	public static int anInt3695 = -1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZI)I")
	public static int method2670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg0 >> 2 << 10) + (arg2 >> 5 << 7) + (arg1 >> 1);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method2674() {
		aClass13_1263 = null;
		Class79.anIntArray381 = null;
		anIntArray383 = null;
		anIntArray382 = null;
		aClass13_1260 = null;
		aClass13_1265 = null;
		aClass13_1264 = null;
		aClass13_1262 = null;
		aClass1_Sub11Array1 = null;
		aClass13_1261 = null;
	}
}
