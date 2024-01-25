import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!qga", name = "H", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!qga", name = "G", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_83 = new Class240(53, 4);

	@OriginalMember(owner = "client!qga", name = "J", descriptor = "[I")
	public static final int[] anIntArray419 = new int[5];

	@OriginalMember(owner = "client!qga", name = "K", descriptor = "Lclient!qw;")
	public static final Class302 aClass302_50 = new Class302();

	@OriginalMember(owner = "client!qga", name = "M", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_84 = new Class240(24, -1);

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(III)Z")
	public static boolean method6444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method6445(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static89.aString26 = Static89.aString26 + arg0[0];
			Static610.anInt10155 += arg0[0].length();
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.length; local17++) {
			if (arg0[local17].startsWith("pause")) {
				@Pc(36) int local36 = 5;
				try {
					local36 = Integer.parseInt(arg0[local17].substring(6));
				} catch (@Pc(45) Exception local45) {
				}
				Static85.method1345("Pausing for " + local36 + " seconds...");
				Static299.anInt5078 = local17 + 1;
				Static200.aStringArray70 = arg0;
				Static631.aLong287 = (long) (local36 * 1000) + Static15.method380();
				return;
			}
			Static89.aString26 = arg0[local17];
			Static654.method8758(false);
		}
	}
}
