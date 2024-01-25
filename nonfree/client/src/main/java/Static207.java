import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!iaa", name = "q", descriptor = "I")
	public static int anInt4059 = -1;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!mo;I)Lclient!ew;")
	public static Class97 method3283(@OriginalArg(0) Class1_Sub35 arg0) {
		@Pc(7) int local7 = arg0.method5771();
		@Pc(16) Class335 local16 = Static119.method1872()[arg0.method5750()];
		@Pc(23) Class122 local23 = Static20.method239()[arg0.method5750()];
		@Pc(27) int local27 = arg0.method5738();
		@Pc(36) int local36 = arg0.method5738();
		return new Class97(local7, local16, local23, local27, local36);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IB)V")
	public static void method3284(@OriginalArg(0) int arg0) {
		if (Static11.anInt142 == 0) {
			Static97.aClass1_Sub7_Sub2_2.method526(arg0);
		} else {
			Static403.anInt7063 = arg0;
		}
	}
}
