import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)V", line = 4)
	public static void method4153(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) Class2_Sub19 local12 = (Class2_Sub19) Class62.aClass135_14.method3552(); local12 != null; local12 = (Class2_Sub19) Class62.aClass135_14.method3553()) {
			if (local12.aClass2_Sub12_Sub4_3 != null) {
				Static211.aClass2_Sub12_Sub2_2.method2083(local12.aClass2_Sub12_Sub4_3);
				local12.aClass2_Sub12_Sub4_3 = null;
			}
			if (local12.aClass2_Sub12_Sub4_2 != null) {
				Static211.aClass2_Sub12_Sub2_2.method2083(local12.aClass2_Sub12_Sub4_2);
				local12.aClass2_Sub12_Sub4_2 = null;
			}
			local12.method6469();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(55) Class2_Sub19 local55 = (Class2_Sub19) Class11_Sub5_Sub6.aClass135_39.method3552(); local55 != null; local55 = (Class2_Sub19) Class11_Sub5_Sub6.aClass135_39.method3553()) {
			if (local55.aClass2_Sub12_Sub4_3 != null) {
				Static211.aClass2_Sub12_Sub2_2.method2083(local55.aClass2_Sub12_Sub4_3);
				local55.aClass2_Sub12_Sub4_3 = null;
			}
			local55.method6469();
		}
		for (@Pc(82) Class2_Sub19 local82 = (Class2_Sub19) Class160.aClass4_86.method80(); local82 != null; local82 = (Class2_Sub19) Class160.aClass4_86.method79()) {
			if (local82.aClass2_Sub12_Sub4_3 != null) {
				Static211.aClass2_Sub12_Sub2_2.method2083(local82.aClass2_Sub12_Sub4_3);
				local82.aClass2_Sub12_Sub4_3 = null;
			}
			local82.method6469();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!wm;B)V", line = 377)
	public static void method4157(@OriginalArg(0) Class19 arg0) {
		if (Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 != Class226.anInt6377 && (Static307.aClass67ArrayArrayArray3 != null && Static46.method1474(arg0, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78))) {
			Class226.anInt6377 = Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78;
		}
	}
}
