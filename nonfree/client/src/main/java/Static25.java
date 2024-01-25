import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!f;")
	public static Class38 aClass38_5;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Lclient!ba;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Lclient!qi;")
	public static Class286 aClass286_1;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "I")
	public static int anInt442 = 0;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public static void method354() {
		@Pc(7) Class317 local7 = null;
		try {
			local7 = Static132.method1782("2");
			@Pc(23) Class2_Sub7 local23 = new Class2_Sub7(Static40.anInt757 * 6 + 3);
			local23.method4459(1);
			local23.method4511(Static40.anInt757);
			for (@Pc(35) int local35 = 0; local35 < Static297.anIntArray342.length; local35++) {
				if (Static143.aBooleanArray26[local35]) {
					local23.method4511(local35);
					local23.method4495(Static297.anIntArray342[local35]);
				}
			}
			local7.method6335(0, local23.anInt5186, local23.aByteArray52);
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (local7 != null) {
				local7.method6333();
			}
		} catch (@Pc(73) Exception local73) {
		}
		Static266.aLong115 = Static362.method5133();
		Static435.aBoolean574 = false;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!mv;I)Lclient!ak;")
	public static Class13 method356(@OriginalArg(1) int arg0, @OriginalArg(2) Class229 arg1) {
		@Pc(9) byte[] local9 = arg1.method4980(arg0, 0);
		return local9 == null ? null : new Class13(local9);
	}
}
