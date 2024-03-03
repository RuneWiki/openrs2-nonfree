import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "Lclient!ur;")
	public static Class130 aClass130_3;

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
	public static int anInt3693;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
	public static int anInt3694;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;", line = 4)
	public static String[] method3644(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static87.method2002(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0 != arg1.charAt(local25); local25++) {
			}
			local15[local17++] = arg1.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 37)
	public static void method3645() {
		if (Class152.anInt3791 != 3) {
			Class87.anInt2382 = -1;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!nk;B)V", line = 51)
	public static void method3646(@OriginalArg(0) Class161 arg0) {
		if (RuntimeException_Sub1.anInt2465 == arg0.lb) {
			Class2_Sub3_Sub10_Sub1.aBooleanArray59[arg0.anInt4251] = true;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIBII)V", line = 67)
	public static void method3647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static321.anInt6040 / (float) Static321.anInt6044;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg3;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(48) int local48 = arg2 - (arg1 - local11) / 2;
		@Pc(57) int local57 = arg0 - (arg3 - local13) / 2;
		Class2_Sub10.anInt1761 = -1;
		Static142.anInt2769 = local48 * Static321.anInt6044 / local11;
		Static89.anInt2001 = Static321.anInt6040 - local57 * Static321.anInt6040 / local13;
		Class163.anInt4321 = -1;
		Static275.method2424();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 100)
	public static String method3648(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg0.indexOf(arg2); local9 != -1; local9 = arg0.indexOf(arg2, local9 + arg1.length())) {
			arg0 = arg0.substring(0, local9) + arg1 + arg0.substring(local9 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)Ljava/lang/String;", line = 208)
	public static String method3651() {
		@Pc(7) String local7 = "www";
		if (Static114.aClass127_4 == Class90.aClass127_8) {
			local7 = "www-wtrc";
		} else if (Static114.aClass127_4 == Class24.aClass127_1) {
			local7 = "www-wtqa";
		} else if (client.aClass127_2 == Static114.aClass127_4) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Class59.aString17 != null) {
			local28 = "/p=" + Class59.aString17;
		}
		return "http://" + local7 + "." + Class226.aClass50_4.aString15 + ".com/l=" + Class197.anInt5569 + "/a=" + Class116.anInt3145 + local28 + "/";
	}
}
