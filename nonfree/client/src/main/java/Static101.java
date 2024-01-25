import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_33 = new Class177(75, -1);

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_34 = new Class177(34, -1);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILclient!dw;I)Lclient!gn;")
	public static Class1_Sub1_Sub9 method1723(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1.anInt2081 | arg0 << 8;
		@Pc(24) Class1_Sub1_Sub9 local24 = (Class1_Sub1_Sub9) Static96.aClass215_2.method4926((long) local15 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(38) byte[] local38 = Static10.aClass211_91.method4774(Static10.aClass211_91.method4769(local15));
		if (local38 == null) {
			local15 = arg2 + 65536 << 8 | arg1.anInt2081;
			local24 = (Class1_Sub1_Sub9) Static96.aClass215_2.method4926((long) local15 << 16);
			if (local24 != null) {
				return local24;
			}
			local38 = Static10.aClass211_91.method4774(Static10.aClass211_91.method4769(local15));
			if (local38 == null) {
				local15 = arg1.anInt2081 | 0xFFFF00;
				local24 = (Class1_Sub1_Sub9) Static96.aClass215_2.method4926((long) local15 << 16);
				if (local24 != null) {
					return local24;
				}
				local38 = Static10.aClass211_91.method4774(Static10.aClass211_91.method4769(local15));
				if (local38 == null) {
					return null;
				} else if (local38.length <= 1) {
					return null;
				} else {
					local24 = Static280.method4118(local38);
					local24.aClass65_4 = arg1;
					Static96.aClass215_2.method4925(local24, (long) local15 << 16);
					return local24;
				}
			} else if (local38.length <= 1) {
				return null;
			} else {
				local24 = Static280.method4118(local38);
				local24.aClass65_4 = arg1;
				Static96.aClass215_2.method4925(local24, (long) local15 << 16);
				return local24;
			}
		} else if (local38.length <= 1) {
			return null;
		} else {
			local24 = Static280.method4118(local38);
			local24.aClass65_4 = arg1;
			Static96.aClass215_2.method4925(local24, (long) local15 << 16);
			return local24;
		}
	}
}
