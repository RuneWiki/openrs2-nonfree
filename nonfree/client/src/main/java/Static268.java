import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public static int anInt4146;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public static int anInt4147;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public static int anInt4153;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "Lclient!nda;")
	public static final Class258 aClass258_2 = new Class258("WIP", 2);

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_71 = new Class397(59, -1);

	@OriginalMember(owner = "client!id", name = "r", descriptor = "J")
	public static long aLong150 = 0L;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_72 = new Class397(28, 6);

	@OriginalMember(owner = "client!id", name = "v", descriptor = "[I")
	public static final int[] anIntArray330 = new int[1000];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BIZ)V")
	public static void method3816(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static66.aClass3_Sub2_2 == null) {
			Static66.aClass3_Sub2_2 = new Class3_Sub2(20000);
		}
		Static66.aClass3_Sub2_2.method2068(0, arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static203.method3087(Static66.aClass3_Sub2_2.aByteArray20);
		Static85.aClass238_Sub1Array1 = new Class238_Sub1[Static274.anInt4207];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = Static711.anInt11000; local35 <= Static42.anInt1246; local35++) {
			@Pc(43) Class238_Sub1 local43 = Static131.method2341(local35);
			if (local43 != null) {
				Static85.aClass238_Sub1Array1[local33++] = local43;
			}
		}
		Static351.aBoolean362 = false;
		Static321.aLong176 = Static517.method6965();
		Static66.aClass3_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static510.aByteArrayArrayArray11[0][arg2][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static510.aByteArrayArrayArray11[arg1][arg2][arg0] & 0x10) == 0) {
			return Static610.method6272(arg2, arg0, arg1) == arg3;
		} else {
			return false;
		}
	}
}
