import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public static int anInt60;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString5 = null;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII[BII)V")
	public static void method58(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(17) int local17 = arg2 - arg3 >> 2;
		arg0 += arg3;
		while (true) {
			local17--;
			if (local17 < 0) {
				local17 = arg2 - arg3 & 0x3;
				while (true) {
					local17--;
					if (local17 < 0) {
						return;
					}
					arg1[arg0++] = 1;
				}
			}
			@Pc(33) int local33 = arg0 + 1;
			arg1[arg0] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg1[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg1[local38] = 1;
			arg0 = local43 + 1;
			arg1[local43] = 1;
		}
	}
}
