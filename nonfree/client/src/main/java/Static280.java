import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static280 {

	@OriginalMember(owner = "client!kfa", name = "w", descriptor = "I")
	public static int anInt5293;

	@OriginalMember(owner = "client!kfa", name = "x", descriptor = "I")
	public static int anInt5294;

	@OriginalMember(owner = "client!kfa", name = "v", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_86 = new Class287(26, 2);

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZIIBZ)V")
	public static void method4228(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static328.method4869(arg0, arg3, 0, arg1, arg2, Static497.aClass48_Sub1Array2.length - 1);
		Static83.anInt2243 = 0;
		Static592.aClass3_Sub28_4 = null;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)V")
	public static void method4230(@OriginalArg(0) int arg0) {
		Static97.anInt2407 = arg0;
		Static472.aClass342_164.method7693();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)Z")
	public static boolean method4231(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static492.method6622(arg1, arg0) || Static19.method208(arg1, arg0);
	}
}
