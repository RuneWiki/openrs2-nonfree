import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cda", name = "p", descriptor = "Lclient!so;")
	public static Class4_Sub46 aClass4_Sub46_1;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method1359(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(12) Class4_Sub39 local12 = Static32.method999(Static402.aClass356_1, Static524.aClass344_92);
		local12.aClass4_Sub13_Sub2_1.method7052(Static393.method6014(arg1) + 1);
		local12.aClass4_Sub13_Sub2_1.method7051(arg0);
		local12.aClass4_Sub13_Sub2_1.method7002(arg1);
		Static50.method1166(local12);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
	public static void method1360() {
		Static279.anInt5796 = Static503.aClass198_12.anInt6045 + Static503.aClass198_12.anInt6043 + 2;
		Static404.aStringArray31 = new String[500];
		Static81.anInt10012 = Static478.aClass198_11.anInt6043 + Static478.aClass198_11.anInt6045 + 2;
		for (@Pc(32) int local32 = 0; local32 < Static404.aStringArray31.length; local32++) {
			Static404.aStringArray31[local32] = "";
		}
		Static47.method1139(Static223.aClass152_5.method3624(Static142.anInt3088));
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!od;Z)V")
	public static void method1362(@OriginalArg(0) Class4_Sub36 arg0) {
		if (!Static117.aBoolean207) {
			arg0.method8193();
			Static384.anInt7556--;
		}
	}
}
