import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "[Lclient!hv;")
	public static Class4_Sub7[] aClass4_Sub7Array5;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)V")
	public static void method5758(@OriginalArg(1) int arg0) {
		Static254.anInt3989 = arg0;
		@Pc(7) Class85 local7 = Static124.aClass85_15;
		synchronized (Static124.aClass85_15) {
			Static124.aClass85_15.method1748();
		}
		local7 = Static650.aClass85_66;
		synchronized (Static650.aClass85_66) {
			Static650.aClass85_66.method1748();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!et;B)Lclient!kla;")
	public static Class120_Sub1 method5767(@OriginalArg(0) Class2_Sub20 arg0) {
		return new Class120_Sub1(arg0.method8598(), arg0.method8598(), arg0.method8598(), arg0.method8598(), arg0.method8583(), arg0.method8583(), arg0.method8581(-17416));
	}
}
