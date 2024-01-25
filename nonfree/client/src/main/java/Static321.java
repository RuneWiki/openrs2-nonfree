import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!mu", name = "F", descriptor = "Lclient!uo;")
	public static Class320 aClass320_4;

	@OriginalMember(owner = "client!mu", name = "O", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_11 = new Class216(1, 7);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4975(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static300.anInt4872; local11++) {
			if (arg0.equalsIgnoreCase(Static489.aStringArray30[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "(I)V")
	public static void method4977() {
		@Pc(5) int local5 = 0;
		if (Static480.aClass6_Sub37_Sub1_1.method5151(Static567.anInt9503)) {
			local5 = 55;
		}
		if (!Static480.aClass6_Sub37_Sub1_1.aBoolean401) {
			local5 |= 0x40;
		}
		Static33.method468(local5);
		Static260.aClass100_1.method2006(local5);
		Static295.aClass256_2.method5922(local5);
		Static51.aClass202_1.method4895(local5);
		Static448.aClass117_2.method2324(local5);
		Static162.method2374(local5);
		Static379.method5525(local5);
		Static109.method7602(local5);
		Static261.method3648(local5);
		Static32.method456();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(JJ)J")
	public static long method4978(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BII)Z")
	public static boolean method4979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static36.method512(arg1, arg0) || Static24.method4707(arg1, arg0);
	}
}
