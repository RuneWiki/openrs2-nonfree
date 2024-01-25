import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
	public static int anInt4174;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
	public static int anInt4175;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_39 = new Class103(4);

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method3708(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = Static51.method1097(arg1, arg0);
		@Pc(13) String[] local13 = new String[local8 + 1];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			@Pc(22) int local22;
			for (local22 = local17; arg1.charAt(local22) != arg0; local22++) {
			}
			local13[local15++] = arg1.substring(local17, local22);
			local17 = local22 + 1;
		}
		local13[local8] = arg1.substring(local17);
		return local13;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!wd;ILclient!pe;)I")
	public static int method3718(@OriginalArg(0) Class213 arg0, @OriginalArg(2) Class89 arg1) {
		if (arg0.anInt6554 != -1) {
			return arg0.anInt6554;
		}
		if (arg0.anInt6539 != -1) {
			@Pc(31) Class18 local31 = Static203.anInterface6_4.method5614(arg1.method5393() ? arg0.anInt6539 : arg0.anInt6542);
			if (!local31.aBoolean16) {
				return local31.aShort7;
			}
		}
		return arg0.anInt6543;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!bi;Lclient!pe;I)V")
	public static void method3719(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class89 arg1) {
		Static224.method3946(arg1, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
	public static void method3720() {
		if (Static244.anInt4835 < 0) {
			Static142.anInt3109 = -1;
			Static23.anInt5708 = -1;
			Static244.anInt4835 = 0;
		}
		if (Static306.anInt3325 < Static244.anInt4835) {
			Static23.anInt5708 = -1;
			Static142.anInt3109 = -1;
			Static244.anInt4835 = Static306.anInt3325;
		}
		if (Static107.anInt1502 < 0) {
			Static23.anInt5708 = -1;
			Static107.anInt1502 = 0;
			Static142.anInt3109 = -1;
		}
		if (Static107.anInt1502 > Static306.anInt3326) {
			Static142.anInt3109 = -1;
			Static23.anInt5708 = -1;
			Static107.anInt1502 = Static306.anInt3326;
		}
	}
}
