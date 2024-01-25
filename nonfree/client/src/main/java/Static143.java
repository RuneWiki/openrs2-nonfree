import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!j", name = "q", descriptor = "Lclient!ia;")
	public static Class1_Sub22 aClass1_Sub22_1;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "Lclient!dq;")
	public static final Class38 aClass38_12 = new Class38(32);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method2850(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(15) int local15 = Static326.method5531(arg0, arg1);
		@Pc(20) String[] local20 = new String[local15 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local15; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0 != arg1.charAt(local30); local30++) {
			}
			local20[local22++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local20[local15] = arg1.substring(local24);
		return local20;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIILclient!kg;)V")
	public static void method2851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class112 arg2) {
		Static33.anInt829 = arg0;
		Static342.anInt6501 = arg1;
		Static95.aClass112_7 = arg2;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!wc;B)I")
	public static int method2853(@OriginalArg(0) Class11_Sub2_Sub6_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt6709;
		@Pc(12) Class67 local12 = arg0.method5898();
		if (arg0.aBoolean499) {
			local8 = arg0.anInt6694;
		} else if (arg0.anInt6733 == local12.anInt2097 || local12.anInt2099 == arg0.anInt6733 || arg0.anInt6733 == local12.anInt2110 || arg0.anInt6733 == local12.anInt2143) {
			local8 = arg0.anInt6682;
		} else if (local12.anInt2114 == arg0.anInt6733 || arg0.anInt6733 == local12.anInt2109 || local12.anInt2113 == arg0.anInt6733 || local12.anInt2115 == arg0.anInt6733) {
			local8 = arg0.anInt6690;
		}
		return local8;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IC)Z")
	public static boolean method2855(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
