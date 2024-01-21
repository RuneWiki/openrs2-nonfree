import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "[I")
	public static int[] anIntArray398;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public static int anInt3456 = 0;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1993 = Static118.method2249("::fpsoff");

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_61 = new Class87(64);

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1995 = Static118.method2249("Unable to find ");

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1994 = aClass65_1995;

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "[Lclient!ta;")
	public static final Class84[] aClass84Array2 = new Class84[50];

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1996 = Static118.method2249("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1997 = aClass65_1996;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIZ)V")
	public static void method2638(@OriginalArg(3) boolean arg0) {
		Static195.anInt4216 = 2;
		Static128.aBoolean131 = arg0;
		Static178.anInt4019 = 22050;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!n;IIIIIB)V")
	public static void method2639(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) long local5 = 0L;
		if (arg5 == 0) {
			local5 = Static198.method3219(arg2, arg1, arg4);
		}
		if (arg5 == 1) {
			local5 = Static95.method1805(arg2, arg1, arg4);
		}
		if (arg5 == 2) {
			local5 = Static202.method1711(arg2, arg1, arg4);
		}
		if (arg5 == 3) {
			local5 = Static26.method479(arg2, arg1, arg4);
		}
		if (local5 == 0L) {
			return;
		}
		@Pc(62) int local62 = (int) local5 >> 14 & 0x1F;
		@Pc(69) int local69 = (int) local5 >> 20 & 0x3;
		@Pc(76) int local76 = (int) (local5 >>> 32) & Integer.MAX_VALUE;
		@Pc(80) Class1_Sub2_Sub13 local80 = Static5.method65(local76);
		if (arg5 == 0) {
			Static198.method3221(arg2, arg1, arg4);
			if (local80.anInt2004 != 0) {
				arg0.method2269(local69, arg1, arg4, local80.aBoolean87, local62);
			}
		}
		if (arg5 == 1) {
			Static176.method2981(arg2, arg1, arg4);
		}
		if (arg5 == 2) {
			Static163.method2803(arg2, arg1, arg4);
			if (local80.anInt2004 != 0 && arg1 + local80.anInt1988 < 104 && local80.anInt1988 + arg4 < 104 && local80.anInt2001 + arg1 < 104 && arg4 + local80.anInt2001 < 104) {
				arg0.method2261(arg4, local69, local80.anInt1988, arg1, local80.aBoolean87, local80.anInt2001);
			}
		}
		if (arg5 != 3) {
			return;
		}
		Static119.method2252(arg2, arg1, arg4);
		if (local80.anInt2004 == 1) {
			arg0.method2268(arg1, arg4);
			return;
		}
	}
}
