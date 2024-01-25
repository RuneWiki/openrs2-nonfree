import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!qba", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray47;

	@OriginalMember(owner = "client!qba", name = "n", descriptor = "Lclient!h;")
	public static final Class125 aClass125_53 = new Class125(4);

	@OriginalMember(owner = "client!qba", name = "t", descriptor = "Z")
	public static boolean aBoolean538 = false;

	@OriginalMember(owner = "client!qba", name = "u", descriptor = "Lclient!nj;")
	public static final Class12_Sub8_Sub2 aClass12_Sub8_Sub2_2 = new Class12_Sub8_Sub2(5000);

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "(I)[Lclient!oca;")
	public static Class225[] method6202() {
		return new Class225[] { Static148.aClass225_15, Static310.aClass225_23, Static144.aClass225_13, Static386.aClass225_20, Static533.aClass225_27, Static466.aClass225_22, Static506.aClass225_26, Static287.aClass225_12, Static200.aClass225_9, Static542.aClass225_28, Static505.aClass225_25, Static428.aClass225_18, Static440.aClass225_19, Static502.aClass225_24 };
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(III)I")
	public static int method6204(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return local17 + (arg0 & 0xFF80);
	}
}
