import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!gea", name = "e", descriptor = "[Lclient!ika;")
	public static Class165[] aClass165Array1;

	@OriginalMember(owner = "client!gea", name = "i", descriptor = "Lclient!uq;")
	public static Class362 aClass362_40;

	@OriginalMember(owner = "client!gea", name = "n", descriptor = "Lclient!k;")
	public static Class3_Sub32 aClass3_Sub32_1;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BI)V")
	public static void method2977(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub5_Sub20 local9 = Static447.method6065((long) arg0, 12);
		local9.method8834();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZCLjava/lang/String;)I")
	public static int method2985(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg1.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg1.charAt(local10) == arg0) {
				local5++;
			}
		}
		return local5;
	}
}
