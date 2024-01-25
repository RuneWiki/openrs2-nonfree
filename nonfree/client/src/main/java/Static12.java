import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!ek;")
	public static Class94 aClass94_1;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public static int anInt155 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "[B")
	public static byte[] aByteArray2 = null;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_6 = new Class186(132, 8);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)[Lclient!hda;")
	public static Class146[] method153() {
		return new Class146[] { Static624.aClass146_4, Static25.aClass146_1, Static432.aClass146_2 };
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIB)V")
	public static void method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class3_Sub4_Sub2 local17 = Static502.method7211(13, (long) arg0);
		local17.method630();
		local17.anInt803 = arg1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method155(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < Static22.anInt373; local21++) {
			if (arg0.equalsIgnoreCase(Static432.aStringArray29[local21])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString109);
	}
}
