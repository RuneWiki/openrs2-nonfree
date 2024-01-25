import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "Lclient!dv;")
	public static Class59 aClass59_2;

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "Lclient!ll;")
	public static Class152 aClass152_10;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "[I")
	public static final int[] anIntArray502 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
	public static int anInt5655 = 0;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	public static void method4768() {
		@Pc(10) Class220 local10 = Static135.aClass220_16;
		synchronized (Static135.aClass220_16) {
			Static135.aClass220_16.method4987();
		}
		local10 = Static61.aClass220_4;
		synchronized (Static61.aClass220_4) {
			Static61.aClass220_4.method4987();
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
	public static String[] method4770(@OriginalArg(0) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}
}
