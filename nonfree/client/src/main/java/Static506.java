import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
	public static int anInt8471;

	@OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
	public static int anInt8470 = 0;

	@OriginalMember(owner = "client!raa", name = "m", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_119 = new Class376(39, 8);

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZI)V")
	public static void method7171(@OriginalArg(1) int arg0) {
		Static446.anInt7708 = arg0;
		@Pc(12) Class279 local12 = Static488.aClass279_44;
		synchronized (Static488.aClass279_44) {
			Static488.aClass279_44.method6638();
		}
		local12 = Static104.aClass279_10;
		synchronized (Static104.aClass279_10) {
			Static104.aClass279_10.method6638();
		}
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public static String method7175(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub54 local10 = (Class3_Sub54) Static623.aClass62_45.method1682((long) arg0);
		if (local10 != null) {
			@Pc(17) Class3_Sub5_Sub2 local17 = local10.aClass133_Sub1_1.method2972();
			if (local17 != null) {
				@Pc(24) double local24 = local10.aClass133_Sub1_1.method2960();
				if (local24 >= (double) local17.method2011() && local24 <= (double) local17.method2015()) {
					return local17.method2017();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z[B)Ljava/lang/String;")
	public static String method7176(@OriginalArg(1) byte[] arg0) {
		return Static351.method5274(arg0, arg0.length, 0);
	}
}
