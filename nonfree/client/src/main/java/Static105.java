import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "J")
	public static long aLong76;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Lclient!wd;")
	public static Class192 aClass192_1;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "Z")
	public static boolean aBoolean156;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
	public static int anInt1942 = 0;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	public static int anInt1943 = 0;

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
	public static int anInt1947 = 0;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "[I")
	public static int[] anIntArray195 = new int[14];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIILclient!qf;Lclient!qf;IIJ)V")
	public static void method1680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10 arg4, @OriginalArg(5) Class10 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class19 local8 = new Class19();
		local8.aLong20 = arg8;
		local8.anInt476 = arg1 * 128 + 64;
		local8.anInt483 = arg2 * 128 + 64;
		local8.anInt481 = arg3;
		local8.aClass10_3 = arg4;
		local8.aClass10_2 = arg5;
		local8.anInt472 = arg6;
		local8.anInt480 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static146.aClass3_Sub25ArrayArrayArray7[local42][arg1][arg2] == null) {
				Static146.aClass3_Sub25ArrayArrayArray7[local42][arg1][arg2] = new Class3_Sub25(local42, arg1, arg2);
			}
		}
		Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2].aClass19_1 = local8;
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Lclient!uf;")
	public static Class138 method1681() {
		try {
			return (Class138) Class.forName("Class138_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method1682() {
		Static157.aClass98_24.method2571();
		Static148.aClass98_20.method2571();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1683(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static215.aClass3_Sub26_Sub1_2.method3958(255);
			Static215.aClass3_Sub26_Sub1_2.method3907(Static147.method2494(arg0));
			Static215.aClass3_Sub26_Sub1_2.method3914(arg0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)Lclient!vd;")
	public static Class3_Sub4_Sub22 method1684(@OriginalArg(1) int arg0) {
		@Pc(25) Class3_Sub4_Sub22 local25 = (Class3_Sub4_Sub22) Static155.aClass33_6.method828((long) arg0);
		if (local25 != null) {
			return local25;
		}
		@Pc(37) byte[] local37 = Static195.aClass155_82.method4121(arg0, 0);
		if (local37 == null || local37.length <= 1) {
			return null;
		} else {
			local25 = Static306.method4924(local37);
			Static155.aClass33_6.method827(local25, (long) arg0);
			return local25;
		}
	}
}
