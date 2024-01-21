import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array14;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public static int anInt2972;

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_20;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "Lclient!je;")
	private static Class40 aClass40_1605 = Static69.method1231("FULL");

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_1602 = aClass40_1605;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Lclient!je;")
	private static Class40 aClass40_1604 = Static69.method1231("This world is full)3");

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "Lclient!je;")
	public static Class40 aClass40_1603 = aClass40_1604;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "[J")
	public static long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	public static int anInt2973 = 0;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
	public static int[] anIntArray352 = new int[100];

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public static int anInt2974 = 0;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public static int anInt2975 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public static void method2128() {
		aClass2_Sub1_Sub2_Sub4Array14 = null;
		aClass40_1605 = null;
		aClass40_1604 = null;
		aLongArray8 = null;
		anIntArray352 = null;
		aClass40_1602 = null;
		aClass24_Sub1_20 = null;
		aClass40_1603 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!fd;I)[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] method2129(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) int arg2) {
		return Static125.method2076(arg1, arg0, arg2) ? Static66.method1151() : null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Lclient!vf;")
	public static Class2_Sub1_Sub16 method2131(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub1_Sub16 local8 = (Class2_Sub1_Sub16) Static46.aClass55_36.method1410((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(27) byte[] local27 = Static85.aClass24_24.method1931(arg0, 8);
		local8 = new Class2_Sub1_Sub16();
		if (local27 != null) {
			local8.method2105(new Class2_Sub9(local27));
		}
		Static46.aClass55_36.method1411((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIILclient!nc;)V")
	public static void method2134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub1_Sub7 arg3) {
		if (Static70.anInt1888 >= 50 || Static106.anInt2536 == 0 || (arg3.anIntArray213 == null || arg3.anIntArray213.length <= arg0)) {
			return;
		}
		@Pc(32) int local32 = arg3.anIntArray213[arg0];
		if (local32 == 0) {
			return;
		}
		@Pc(39) int local39 = local32 >> 8;
		Static48.anIntArray137[Static70.anInt1888] = local39;
		@Pc(49) int local49 = local32 >> 4 & 0x7;
		@Pc(60) int local60 = (arg1 - 64) / 128;
		@Pc(64) int local64 = local32 & 0xF;
		@Pc(70) int local70 = (arg2 - 64) / 128;
		Static104.anIntArray285[Static70.anInt1888] = local49;
		Static106.anIntArray289[Static70.anInt1888] = 0;
		Static64.aClass66Array1[Static70.anInt1888] = null;
		Static121.anIntArray331[Static70.anInt1888] = local64 + (local60 << 16) + (local70 << 8);
		Static70.anInt1888++;
	}
}
