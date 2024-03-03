import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIILclient!ct;)V", line = 43)
	public static void method2266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class41 arg3) {
		for (@Pc(10) Class2_Sub19 local10 = (Class2_Sub19) Class62.aClass135_14.method3552(); local10 != null; local10 = (Class2_Sub19) Class62.aClass135_14.method3553()) {
			if (local10.anInt2902 == arg0 && local10.anInt2896 == arg1 * 128 && local10.anInt2907 == arg2 * 128 && local10.aClass41_1.anInt1349 == arg3.anInt1349) {
				if (local10.aClass2_Sub12_Sub4_3 != null) {
					Static211.aClass2_Sub12_Sub2_2.method2083(local10.aClass2_Sub12_Sub4_3);
					local10.aClass2_Sub12_Sub4_3 = null;
				}
				if (local10.aClass2_Sub12_Sub4_2 != null) {
					Static211.aClass2_Sub12_Sub2_2.method2083(local10.aClass2_Sub12_Sub4_2);
					local10.aClass2_Sub12_Sub4_2 = null;
				}
				local10.method6469();
				return;
			}
		}
	}
}
