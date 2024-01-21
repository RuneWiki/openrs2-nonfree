import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Lclient!w;")
	public static Class96 aClass96_47;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray52;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	public static int anInt4469 = 0;

	@OriginalMember(owner = "client!tg", name = "S", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_2056 = Static187.method3089(" seconds)3");

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "Lclient!vd;")
	public static Class92 aClass92_2052 = aClass92_2056;

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2053 = Static187.method3089(":chalreq:");

	@OriginalMember(owner = "client!tg", name = "J", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2054 = Static187.method3089("Neuer Benutzer");

	@OriginalMember(owner = "client!tg", name = "P", descriptor = "Z")
	public static boolean aBoolean242 = false;

	@OriginalMember(owner = "client!tg", name = "Q", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2055 = Static187.method3089("blinken3:");

	@OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
	public static int anInt4483 = 0;

	@OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
	public static final int anInt4484 = 3353893;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)Lclient!la;")
	public static Class1_Sub3_Sub14 method3389(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub14 local10 = (Class1_Sub3_Sub14) Static74.aClass47_12.method1281((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static48.aClass3_7.method3265(Static112.method1669(arg0), Static6.method121(arg0));
		local10 = new Class1_Sub3_Sub14();
		if (local24 != null) {
			local10.method1632(new Class1_Sub14(local24));
		}
		Static74.aClass47_12.method1273((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class74 local3 = new Class74();
		local3.anInt2840 = arg2 / 128;
		local3.anInt2828 = arg3 / 128;
		local3.anInt2832 = arg4 / 128;
		local3.anInt2837 = arg5 / 128;
		local3.anInt2836 = arg1;
		local3.anInt2825 = arg2;
		local3.anInt2829 = arg3;
		local3.anInt2838 = arg4;
		local3.anInt2823 = arg5;
		local3.anInt2839 = arg6;
		local3.anInt2824 = arg7;
		Static195.aClass74ArrayArray1[arg0][Static195.anIntArray344[arg0]++] = local3;
	}
}
