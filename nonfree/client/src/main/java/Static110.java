import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public static int anInt2295;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public static int anInt2296;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public static int anInt2297;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public static int anInt2298;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "[I")
	public static final int[] anIntArray255 = new int[50];

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_852 = Static161.method2452("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Lclient!dc;")
	public static Class20 aClass20_851 = aClass20_852;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZILclient!ld;I)V")
	public static void method1756(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21;
		if ((arg2 & 0x400) != 0) {
			arg1.anInt2266 = Static10.aClass5_Sub6_Sub1_1.method3054();
			local21 = Static10.aClass5_Sub6_Sub1_1.method3066();
			arg1.anInt2225 = local21 >> 16;
			if (arg1.anInt2266 == 65535) {
				arg1.anInt2266 = -1;
			}
			arg1.anInt2239 = (local21 & 0xFFFF) + Static177.anInt3533;
			arg1.anInt2236 = 0;
			arg1.anInt2255 = 0;
			if (arg1.anInt2239 > Static177.anInt3533) {
				arg1.anInt2255 = -1;
			}
		}
		@Pc(72) int local72;
		if ((arg2 & 0x40) != 0) {
			local21 = Static10.aClass5_Sub6_Sub1_1.method3043();
			local72 = Static10.aClass5_Sub6_Sub1_1.method3062();
			@Pc(76) int local76 = Static10.aClass5_Sub6_Sub1_1.method3059();
			@Pc(79) int local79 = Static10.aClass5_Sub6_Sub1_1.anInt4050;
			@Pc(87) boolean local87 = (local21 & 0x8000) != 0;
			if (arg1.aClass20_848 != null && arg1.aClass56_1 != null) {
				@Pc(98) long local98 = arg1.aClass20_848.method595();
				@Pc(100) boolean local100 = false;
				if (local72 <= 1) {
					if (!local87 && (Static127.anInt2649 == 1 || Static68.anInt1469 == 1)) {
						local100 = true;
					} else {
						for (@Pc(119) int local119 = 0; local119 < Static50.anInt1082; local119++) {
							if (Static168.aLongArray39[local119] == local98) {
								local100 = true;
								break;
							}
						}
					}
				}
				if (!local100 && Static217.anInt4212 == 0) {
					@Pc(144) int local144 = -1;
					Static157.aClass5_Sub6_3.anInt4050 = 0;
					Static10.aClass5_Sub6_Sub1_1.method3079(local76, Static157.aClass5_Sub6_3.aByteArray56);
					Static157.aClass5_Sub6_3.anInt4050 = 0;
					@Pc(176) Class20 local176;
					if (local87) {
						local21 &= 0x7FFF;
						@Pc(167) Class46 local167 = Static153.method2325(Static157.aClass5_Sub6_3);
						local144 = local167.anInt1892;
						local176 = local167.aClass5_Sub2_Sub12_1.method1933(Static157.aClass5_Sub6_3);
					} else {
						local176 = Static81.method1358(Static157.method2387(Static157.aClass5_Sub6_3).method560());
					}
					arg1.aClass20_835 = local176.method580();
					arg1.anInt2260 = local21 & 0xFF;
					arg1.anInt2267 = local21 >> 8;
					arg1.anInt2219 = 150;
					if (local72 == 2) {
						Static177.method2680(local87 ? 17 : 1, local144, local176, null, Static70.method1166(new Class20[] { Static43.aClass20_331, arg1.aClass20_848 }));
					} else if (local72 == 1) {
						Static177.method2680(local87 ? 17 : 1, local144, local176, null, Static70.method1166(new Class20[] { Static64.aClass20_480, arg1.aClass20_848 }));
					} else {
						Static177.method2680(local87 ? 17 : 2, local144, local176, null, arg1.aClass20_848);
					}
				}
			}
			Static10.aClass5_Sub6_Sub1_1.anInt4050 = local76 + local79;
		}
		if ((arg2 & 0x80) != 0) {
			local21 = Static10.aClass5_Sub6_Sub1_1.method3074();
			local72 = Static10.aClass5_Sub6_Sub1_1.method3036();
			arg1.method1745(local21, local72, Static177.anInt3533);
			arg1.anInt2218 = Static177.anInt3533 + 300;
			arg1.anInt2264 = Static10.aClass5_Sub6_Sub1_1.method3062();
		}
		if ((arg2 & 0x10) != 0) {
			arg1.aClass20_835 = Static10.aClass5_Sub6_Sub1_1.method3027();
			if (arg1.aClass20_835.method577(0) == 126) {
				arg1.aClass20_835 = arg1.aClass20_835.method549(1);
				Static189.method2824(2, arg1.aClass20_835, arg1.aClass20_848);
			} else if (Static210.aClass1_Sub2_Sub2_2 == arg1) {
				Static189.method2824(2, arg1.aClass20_835, arg1.aClass20_848);
			}
			arg1.anInt2267 = 0;
			arg1.anInt2260 = 0;
			arg1.anInt2219 = 150;
		}
		if ((arg2 & 0x1) != 0) {
			local21 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local72 = Static10.aClass5_Sub6_Sub1_1.method3074();
			if (local21 == 65535) {
				local21 = -1;
			}
			Static128.method1996(local72, local21, arg1);
		}
		if ((arg2 & 0x20) != 0) {
			arg1.anInt2249 = Static10.aClass5_Sub6_Sub1_1.method3081();
			if (arg1.anInt2249 == 65535) {
				arg1.anInt2249 = -1;
			}
		}
		if ((arg2 & 0x4) != 0) {
			arg1.anInt2226 = Static10.aClass5_Sub6_Sub1_1.method3081();
			arg1.anInt2253 = Static10.aClass5_Sub6_Sub1_1.method3077();
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt2228 = Static10.aClass5_Sub6_Sub1_1.method3036();
			arg1.anInt2250 = Static10.aClass5_Sub6_Sub1_1.method3062();
			arg1.anInt2214 = Static10.aClass5_Sub6_Sub1_1.method3074();
			arg1.anInt2245 = Static10.aClass5_Sub6_Sub1_1.method3036();
			arg1.anInt2247 = Static10.aClass5_Sub6_Sub1_1.method3077() + Static177.anInt3533;
			arg1.anInt2269 = Static10.aClass5_Sub6_Sub1_1.method3081() + Static177.anInt3533;
			arg1.anInt2270 = Static10.aClass5_Sub6_Sub1_1.method3059();
			arg1.anInt2235 = 1;
			arg1.anInt2220 = 0;
		}
		if ((arg2 & 0x200) != 0) {
			local21 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local72 = Static10.aClass5_Sub6_Sub1_1.method3062();
			arg1.method1745(local21, local72, Static177.anInt3533);
		}
		if ((arg2 & 0x2) == 0) {
			return;
		}
		local21 = Static10.aClass5_Sub6_Sub1_1.method3062();
		@Pc(504) byte[] local504 = new byte[local21];
		@Pc(509) Class5_Sub6 local509 = new Class5_Sub6(local504);
		Static10.aClass5_Sub6_Sub1_1.method3065(local504, local21);
		Static57.aClass5_Sub6Array1[arg0] = local509;
		arg1.method1752(local509);
	}
}
