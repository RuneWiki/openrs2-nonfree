import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!pt;")
	public static final Class265 aClass265_5 = new Class265();

	@OriginalMember(owner = "client!ld", name = "D", descriptor = "[I")
	public static int[] anIntArray353 = new int[2];

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "[I")
	public static final int[] anIntArray354 = new int[5];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)C")
	public static char method4962(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(47) char local47 = Static542.aCharArray9[local7 - 128];
			if (local47 == '\u0000') {
				local47 = '?';
			}
			local7 = local47;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBLclient!oh;Lclient!oh;)V")
	public static void method4963(@OriginalArg(2) Class237 arg0, @OriginalArg(3) Class237 arg1) {
		Static522.aClass237_126 = arg0;
		Static510.aClass237_123 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z[SI)[S")
	public static short[] method4964(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static649.method5533(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
