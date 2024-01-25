import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!e", name = "x", descriptor = "I")
	public static int anInt1670;

	@OriginalMember(owner = "client!e", name = "y", descriptor = "Lclient!tv;")
	public static Class241 aClass241_4;

	@OriginalMember(owner = "client!e", name = "A", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array6;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	public static int anInt1667 = 100;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "I")
	public static int anInt1668 = 0;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
	public static void method1435() {
		@Pc(3) Class169[] local3 = Class7_Sub6.aClass169Array1;
		synchronized (Class7_Sub6.aClass169Array1) {
			for (@Pc(13) int local13 = 0; local13 < Class7_Sub6.aClass169Array1.length; local13++) {
				Class7_Sub6.aClass169Array1[local13] = new Class169();
				Static384.anIntArray619[local13] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BI)[B")
	public static byte[] method1437(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static464.method3633(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
