import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!rj", name = "Y", descriptor = "[S")
	public static short[] aShortArray105;

	@OriginalMember(owner = "client!rj", name = "ab", descriptor = "Ljava/lang/Object;")
	public static Object anObject15;

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "Lclient!oca;")
	public static final Class225 aClass225_18 = new Class225(13, 0, 1, 0);

	@OriginalMember(owner = "client!rj", name = "X", descriptor = "Lclient!bi;")
	public static final Class33 aClass33_6 = new Class33(2);

	@OriginalMember(owner = "client!rj", name = "bb", descriptor = "J")
	public static long aLong198 = -1L;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(III)Z")
	public static boolean method6572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZIII)V")
	public static void method6573(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static114.aLong65 = 0L;
		@Pc(14) int local14 = Static256.method4386();
		if (arg0 == 3 || local14 == 3) {
			arg1 = true;
		}
		if (!Static243.aClass42_4.method5798()) {
			arg1 = true;
		}
		Static388.method6140(arg1, arg3, arg0, local14, arg2);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!an;I)V")
	public static void method6576(@OriginalArg(0) Class16 arg0) {
		Static5.anInt73 = arg0.method420("titlebg");
		Static214.anInt4675 = arg0.method420("logo");
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method6577(@OriginalArg(0) Class42 arg0) {
		for (@Pc(14) Class7_Sub3 local14 = (Class7_Sub3) Static5.aClass149_1.method3989(); local14 != null; local14 = (Class7_Sub3) Static5.aClass149_1.method3986()) {
			local14.method4200(arg0);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIB)Lclient!mc;")
	public static Class198 method6579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class198 local16 = Static104.method2137(arg0);
		if (arg1 == -1) {
			return local16;
		} else if (local16 == null || local16.aClass198Array1 == null || local16.aClass198Array1.length <= arg1) {
			return null;
		} else {
			return local16.aClass198Array1[arg1];
		}
	}
}
