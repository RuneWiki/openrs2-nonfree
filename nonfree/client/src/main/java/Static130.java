import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!ii;")
	public static Class144 aClass144_1;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_76 = new Class88("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBLclient!fca;I)Lclient!fh;")
	public static Class12_Sub4_Sub6 method2728(@OriginalArg(0) int arg0, @OriginalArg(2) Class98 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1.anInt2990 | arg0 << 8;
		@Pc(24) Class12_Sub4_Sub6 local24 = (Class12_Sub4_Sub6) Static474.aClass14_3.method357((long) local15 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static306.aClass16_77.method410(Static306.aClass16_77.method413(local15));
		if (local36 == null) {
			local15 = arg2 + 65536 << 8 | arg1.anInt2990;
			local24 = (Class12_Sub4_Sub6) Static474.aClass14_3.method357((long) local15 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static306.aClass16_77.method410(Static306.aClass16_77.method413(local15));
			if (local36 == null) {
				local15 = arg1.anInt2990 | 0xFFFF00;
				local24 = (Class12_Sub4_Sub6) Static474.aClass14_3.method357((long) local15 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static306.aClass16_77.method410(Static306.aClass16_77.method413(local15));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local24 = Static208.method3863(local36);
					local24.aClass98_2 = arg1;
					Static474.aClass14_3.method359((long) local15 << 16, local24);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local24 = Static208.method3863(local36);
				local24.aClass98_2 = arg1;
				Static474.aClass14_3.method359((long) local15 << 16, local24);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local24 = Static208.method3863(local36);
			local24.aClass98_2 = arg1;
			Static474.aClass14_3.method359((long) local15 << 16, local24);
			return local24;
		}
	}
}
