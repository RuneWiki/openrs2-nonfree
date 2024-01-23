import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "[Lclient!wd;")
	public static Class8_Sub1_Sub7[] aClass8_Sub1_Sub7Array91;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Lclient!pd;")
	public static Class129 aClass129_22 = new Class129(8);

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray13 = new byte[1000][];

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "Lclient!aj;")
	public static Class8_Sub2 aClass8_Sub2_3 = new Class8_Sub2(new byte[5000]);

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "[J")
	public static long[] aLongArray11 = new long[100];

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!ph;Lclient!pf;Lclient!he;III)V")
	public static void method3340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class36_Sub3_Sub2 arg2, @OriginalArg(3) Class36_Sub3_Sub1 arg3, @OriginalArg(4) Class70 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) Class8_Sub12 local15 = new Class8_Sub12();
		local15.anInt2186 = arg6;
		local15.anInt2193 = arg0 * 128;
		local15.anInt2180 = arg5 * 128;
		if (arg4 != null) {
			local15.anInt2190 = arg4.anInt2083;
			local15.anIntArray156 = arg4.anIntArray143;
			local15.anInt2196 = arg4.anInt2053;
			local15.aClass70_1 = arg4;
			local15.anInt2183 = arg4.anInt2058;
			@Pc(53) int local53 = arg4.anInt2065;
			local15.anInt2187 = arg4.anInt2068;
			local15.anInt2177 = arg4.anInt2079 * 128;
			@Pc(66) int local66 = arg4.anInt2063;
			if (arg1 == 1 || arg1 == 3) {
				local53 = arg4.anInt2063;
				local66 = arg4.anInt2065;
			}
			local15.anInt2189 = (arg0 + local66) * 128;
			local15.anInt2195 = (local53 + arg5) * 128;
			if (arg4.anIntArray145 != null) {
				local15.aBoolean171 = true;
				local15.method1700();
			}
			if (local15.anIntArray156 != null) {
				local15.anInt2194 = (int) ((double) (local15.anInt2183 - local15.anInt2187) * Math.random()) + local15.anInt2187;
			}
			Static52.aClass182_5.method4328(local15);
		} else if (arg2 != null) {
			local15.aClass36_Sub3_Sub2_1 = arg2;
			@Pc(138) Class173 local138 = arg2.aClass173_1;
			if (local138.anIntArray491 != null) {
				local15.aBoolean171 = true;
				local138 = local138.method4245();
			}
			if (local138 != null) {
				local15.anInt2195 = (local138.anInt5633 + arg5) * 128;
				local15.anInt2189 = (local138.anInt5633 + arg0) * 128;
				local15.anInt2196 = Static151.method3108(arg2);
				local15.anInt2190 = local138.anInt5630;
				local15.anInt2177 = local138.anInt5620 * 128;
			}
			Static191.aClass182_24.method4328(local15);
		} else if (arg3 != null) {
			local15.aClass36_Sub3_Sub1_2 = arg3;
			local15.anInt2195 = (arg3.method3110() + arg5) * 128;
			local15.anInt2189 = (arg0 + arg3.method3110()) * 128;
			local15.anInt2196 = Static298.method256(arg3);
			local15.anInt2177 = arg3.anInt4045 * 128;
			local15.anInt2190 = arg3.anInt4030;
			Static247.aClass129_29.method3039(local15, Static31.method513(arg3.aString144));
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!pk;)V")
	public static void method3342(@OriginalArg(1) Class132 arg0) {
		if (Static20.aBoolean35) {
			return;
		}
		if (Static116.aBoolean188) {
			Static126.method1991();
		} else {
			Static103.method1670();
		}
		Static93.aClass8_Sub1_Sub7_4 = Static284.method4236(Static16.anInt3523, arg0);
		@Pc(24) int local24 = Static13.anInt356;
		@Pc(30) int local30 = local24 * 956 / 503;
		Static93.aClass8_Sub1_Sub7_4.method2808((Static250.anInt4959 - local30) / 2, 0, local30, local24);
		Static235.aClass43_1 = Static83.method1365(arg0, Static58.anInt2231);
		Static235.aClass43_1.method4298(Static250.anInt4959 / 2 - Static235.aClass43_1.anInt5710 / 2, 18);
		Static20.aBoolean35 = true;
	}
}
