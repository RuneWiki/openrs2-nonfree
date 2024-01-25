import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fw", name = "H", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!fw", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[200];

	@OriginalMember(owner = "client!fw", name = "K", descriptor = "I")
	public static int anInt2686 = -1;

	@OriginalMember(owner = "client!fw", name = "N", descriptor = "I")
	public static int anInt2688 = 0;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BILclient!mh;I)Lclient!ln;")
	public static Class2_Sub13_Sub11 method2531(@OriginalArg(1) int arg0, @OriginalArg(2) Class188 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 << 8 | arg1.anInt5470;
		@Pc(24) Class2_Sub13_Sub11 local24 = (Class2_Sub13_Sub11) Static196.aClass65_3.method1918((long) local15 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static458.aClass53_131.method1599(Static458.aClass53_131.method1605(local15));
		if (local36 == null) {
			local15 = arg2 + 65536 << 8 | arg1.anInt5470;
			local24 = (Class2_Sub13_Sub11) Static196.aClass65_3.method1918((long) local15 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static458.aClass53_131.method1599(Static458.aClass53_131.method1605(local15));
			if (local36 == null) {
				local15 = arg1.anInt5470 | 0xFFFF00;
				local24 = (Class2_Sub13_Sub11) Static196.aClass65_3.method1918((long) local15 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static458.aClass53_131.method1599(Static458.aClass53_131.method1605(local15));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local24 = Static108.method2074(local36);
					local24.aClass188_5 = arg1;
					Static196.aClass65_3.method1921((long) local15 << 16, local24);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local24 = Static108.method2074(local36);
				local24.aClass188_5 = arg1;
				Static196.aClass65_3.method1921((long) local15 << 16, local24);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local24 = Static108.method2074(local36);
			local24.aClass188_5 = arg1;
			Static196.aClass65_3.method1921((long) local15 << 16, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!wca;ZII)V")
	public static void method2533(@OriginalArg(0) Class310 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static262.anInt7124 = arg1;
		Static189.anInt3454 = arg2;
		Static157.aClass310_6 = arg0;
	}
}
