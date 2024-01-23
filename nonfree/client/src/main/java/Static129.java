import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!mg", name = "W", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_25;

	@OriginalMember(owner = "client!mg", name = "bb", descriptor = "[I")
	public static int[] anIntArray480;

	@OriginalMember(owner = "client!mg", name = "cb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!mg", name = "db", descriptor = "Lclient!pc;")
	public static Class2_Sub21_Sub2 aClass2_Sub21_Sub2_3;

	@OriginalMember(owner = "client!mg", name = "gb", descriptor = "I")
	public static int anInt2911;

	@OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
	public static int anInt2901 = 0;

	@OriginalMember(owner = "client!mg", name = "Z", descriptor = "Lclient!qe;")
	public static Class78 aClass78_579 = Static199.method3560("T");

	@OriginalMember(owner = "client!mg", name = "ab", descriptor = "Lclient!qe;")
	public static Class78 aClass78_580 = Static199.method3560(":duelfriend:");

	@OriginalMember(owner = "client!mg", name = "ib", descriptor = "Lclient!qe;")
	public static Class78 aClass78_581 = Static199.method3560("<col=c0ff00>");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
	public static void method2338(@OriginalArg(0) boolean arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static50.anInt908; local9++) {
			@Pc(16) Class5_Sub2_Sub1 local16 = Static95.aClass5_Sub2_Sub1Array1[Static79.anIntArray286[local9]];
			@Pc(25) long local25 = (long) Static79.anIntArray286[local9] << 32 | 0x20000000L;
			if (local16 != null && local16.method1479() && arg0 == local16.aClass2_Sub3_Sub9_1.aBoolean43 && local16.aClass2_Sub3_Sub9_1.method1064()) {
				@Pc(50) int local50 = local16.anInt1849 >> 7;
				@Pc(55) int local55 = local16.anInt1827 >> 7;
				if (local50 >= 0 && local50 < 104 && local55 >= 0 && local55 < 104) {
					if (local16.anInt1832 == 1 && (local16.anInt1849 & 0x7F) == 64 && (local16.anInt1827 & 0x7F) == 64) {
						if (Static57.anIntArrayArray12[local50][local55] == Static25.anInt457) {
							continue;
						}
						Static57.anIntArrayArray12[local50][local55] = Static25.anInt457;
					}
					if (!local16.aClass2_Sub3_Sub9_1.aBoolean44) {
						local25 |= Long.MIN_VALUE;
					}
					local16.anInt1861 = Static208.method3667(local16.anInt1849 + local16.anInt1832 * 64 - 64, Static137.anInt3136, local16.anInt1827 + (local16.anInt1832 - 1) * 64);
					Static183.method3367(Static137.anInt3136, local16.anInt1849, local16.anInt1827, local16.anInt1861, (local16.anInt1832 - 1) * 64 + 60, local16, local16.anInt1853, local25, local16.aBoolean71);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B[Lclient!qe;)[Lclient!qe;")
	public static Class78[] method2339(@OriginalArg(1) Class78[] arg0) {
		@Pc(6) Class78[] local6 = new Class78[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			local6[local8] = Static94.method1640(new Class78[] { Static19.method268(local8), Static2.aClass78_10 });
			if (arg0 != null && arg0[local8] != null) {
				local6[local8] = Static94.method1640(new Class78[] { local6[local8], arg0[local8] });
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "(I)Lclient!nh;")
	public static Class2_Sub23 method2340() {
		@Pc(4) Class2_Sub23 local4 = new Class2_Sub23(24);
		local4.method2132(2);
		local4.method2132(Static180.anInt4194);
		local4.method2132(Static11.aBoolean8 ? 1 : 0);
		local4.method2132(Static101.aBoolean84 ? 1 : 0);
		local4.method2132(Static112.aBoolean105 ? 1 : 0);
		local4.method2132(Static14.aBoolean151 ? 1 : 0);
		local4.method2132(Static214.aBoolean200 ? 1 : 0);
		local4.method2132(Static102.aBoolean86 ? 1 : 0);
		local4.method2132(Static175.aBoolean175 ? 1 : 0);
		local4.method2132(Static64.aBoolean42 ? 1 : 0);
		local4.method2132(Static139.anInt2666);
		local4.method2132(Static116.aBoolean113 ? 1 : 0);
		local4.method2132(Static41.aBoolean31 ? 1 : 0);
		local4.method2132(Static185.aBoolean187 ? 1 : 0);
		local4.method2132(Static99.anInt2151);
		local4.method2132(Static40.aBoolean27 ? 1 : 0);
		local4.method2132(Static11.anInt311);
		local4.method2132(Static89.anInt1999);
		local4.method2132(Static110.anInt2433);
		local4.method2117(Static166.anInt1137);
		local4.method2117(Static112.anInt2452);
		return local4;
	}
}
