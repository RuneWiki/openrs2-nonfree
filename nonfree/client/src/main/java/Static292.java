import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "Lclient!ph;")
	public static Class138 aClass138_83;

	@OriginalMember(owner = "client!uo", name = "w", descriptor = "Lclient!qf;")
	public static Class146 aClass146_18;

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "Lclient!th;")
	public static Class169 aClass169_153 = new Class169(5);

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString187 = " more options";

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4345(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static206.aStringArray34.length; local7++) {
			if (Static206.aStringArray34[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
	public static void method4347(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub8 local6 = (Class1_Sub8) Static247.aClass156_23.method3821((long) arg0);
		if (local6 != null) {
			local6.method4616();
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
	public static void method4349(@OriginalArg(1) int arg0) {
		Static246.aFloatArray28[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static246.aFloatArray28[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static246.aFloatArray28[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static255.method3874(3);
		Static255.method3874(4);
	}
}
