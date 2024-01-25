import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static431 {

	@OriginalMember(owner = "client!nla", name = "h", descriptor = "I")
	public static int anInt7043;

	@OriginalMember(owner = "client!nla", name = "f", descriptor = "Lclient!dw;")
	public static Class92 aClass92_2;

	@OriginalMember(owner = "client!nla", name = "a", descriptor = "[I")
	public static final int[] anIntArray506 = new int[5];

	@OriginalMember(owner = "client!nla", name = "j", descriptor = "J")
	public static long aLong215 = 0L;

	@OriginalMember(owner = "client!nla", name = "a", descriptor = "(IIII[BIZLclient!uja;)Lclient!ke;")
	public static Class64_Sub4_Sub1 method6279(@OriginalArg(2) int arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(7) Class145_Sub3 arg3) {
		if (arg3.aBoolean858 || Static457.method6641(arg2) && Static457.method6641(arg0)) {
			return new Class64_Sub4_Sub1(arg3, 3553, 6406, arg2, arg0, false, arg1, 6406);
		} else if (arg3.aBoolean860) {
			return new Class64_Sub4_Sub1(arg3, 34037, 6406, arg2, arg0, false, arg1, 6406);
		} else {
			return new Class64_Sub4_Sub1(arg3, 6406, arg2, arg0, Static330.method4577(arg2), Static330.method4577(arg0), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!nla", name = "a", descriptor = "(BI)V")
	public static void method6280(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static261.anInt10710 = arg0;
		Static317.aClass4_Sub7Array5 = new Class4_Sub7[Static429.anIntArray123[Static261.anInt10710] + 1];
		Static518.anInt8266 = 0;
		Static6.anInt5790 = 0;
	}
}
