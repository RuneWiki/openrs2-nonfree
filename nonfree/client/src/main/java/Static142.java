import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
	public static int anInt3258;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Lclient!vd;")
	public static Class83 aClass83_14;

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "Lclient!hb;")
	public static Class3_Sub1_Sub3_Sub1_Sub1 aClass3_Sub1_Sub3_Sub1_Sub1_5;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
	public static int anInt3267;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Lclient!b;")
	public static Class7 aClass7_23 = new Class7(50);

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	public static int anInt3262 = 0;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray35 = new int[104][104];

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
	public static int anInt3265 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "Lclient!b;")
	public static Class7 aClass7_24 = new Class7(64);

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	public static int anInt3266 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	public static void method2360() {
		aClass83_14 = null;
		aClass3_Sub1_Sub3_Sub1_Sub1_5 = null;
		anIntArrayArray35 = null;
		aClass7_23 = null;
		aClass7_24 = null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZZBIZ)Lclient!cb;")
	public static Class13_Sub1 method2362(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class43 local5 = null;
		if (Static171.aClass80_4 != null) {
			local5 = new Class43(arg2, Static171.aClass80_4, Static80.aClass80Array1[arg2], 1000000);
		}
		return new Class13_Sub1(local5, Static57.aClass43_3, arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B[B)[B")
	public static byte[] method2364(@OriginalArg(1) byte[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(5) byte[] local5 = new byte[local2];
		Static184.method1123(arg0, 0, local5, 0, local2);
		return local5;
	}
}
