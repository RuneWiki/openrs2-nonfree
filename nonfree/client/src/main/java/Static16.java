import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "Lclient!da;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "I")
	public static int anInt250;

	@OriginalMember(owner = "client!aia", name = "g", descriptor = "Lclient!tc;")
	public static Class113 aClass113_2;

	@OriginalMember(owner = "client!aia", name = "e", descriptor = "I")
	public static int anInt249 = -1;

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(III)Z")
	public static boolean method230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static448.method6753(arg0, arg1) & ((arg1 & 0x2000) != 0 | Static351.method5255(arg1, arg0) | Static313.method4818(arg0, arg1));
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)[Lclient!vj;")
	public static Class365[] method231() {
		return new Class365[] { Static613.aClass365_17, Static21.aClass365_1, Static609.aClass365_16, Static392.aClass365_14, Static310.aClass365_11, Static522.aClass365_15, Static76.aClass365_4, Static343.aClass365_13, Static197.aClass365_18, Static516.aClass365_12 };
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZLclient!cb;Lclient!np;)Lclient!sr;")
	public static Class5_Sub48 method232(@OriginalArg(1) Class46 arg0, @OriginalArg(2) Class251 arg1) {
		@Pc(8) Class5_Sub48 local8 = Static78.method1355();
		local8.anInt8985 = arg0.anInt1164;
		local8.aClass46_97 = arg0;
		if (local8.anInt8985 == -1) {
			local8.aClass5_Sub22_Sub1_2 = new Class5_Sub22_Sub1(260);
		} else if (local8.anInt8985 == -2) {
			local8.aClass5_Sub22_Sub1_2 = new Class5_Sub22_Sub1(10000);
		} else if (local8.anInt8985 <= 18) {
			local8.aClass5_Sub22_Sub1_2 = new Class5_Sub22_Sub1(20);
		} else if (local8.anInt8985 <= 98) {
			local8.aClass5_Sub22_Sub1_2 = new Class5_Sub22_Sub1(100);
		} else {
			local8.aClass5_Sub22_Sub1_2 = new Class5_Sub22_Sub1(260);
		}
		local8.aClass5_Sub22_Sub1_2.method2653(arg1);
		local8.aClass5_Sub22_Sub1_2.method2656(local8.aClass46_97.method982());
		local8.anInt8986 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)Lclient!tda;")
	public static Class328 method233(@OriginalArg(1) int arg0) {
		@Pc(10) Class328 local10 = (Class328) Static171.aClass87_95.method1805((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static604.aClass207_120.method4681(1, arg0);
		local10 = new Class328();
		local10.anInt9120 = arg0;
		if (local20 != null) {
			local10.method7868(new Class5_Sub22(local20));
		}
		local10.method7867();
		if (local10.anInt9110 == 2 && Static636.aClass273_48.method6581((long) arg0) == null) {
			Static636.aClass273_48.method6585((long) arg0, new Class5_Sub41(Static185.anInt3250));
			Static24.aClass328Array1[Static185.anInt3250++] = local10;
		}
		Static171.aClass87_95.method1792((long) arg0, local10);
		return local10;
	}
}
