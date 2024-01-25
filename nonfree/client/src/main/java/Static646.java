import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)Z")
	public static boolean method8667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
	public static void method8668() {
		Static63.aClass50Array3 = null;
		Static61.aClass50Array2 = null;
		Static588.aClass50Array13 = null;
		Static654.aClass50Array15 = null;
		Static604.aClass73_15 = null;
		Static400.aClass50Array16 = null;
		Static305.aClass50Array5 = null;
		Static322.aClass50Array6 = null;
		Static431.aClass73_10 = null;
		Static16.aClass50Array1 = null;
		Static4.aClass50_1 = null;
		Static231.aClass73_8 = null;
		Static642.aClass50_37 = null;
		Static644.aClass50Array14 = null;
		Static328.aClass50Array7 = null;
		Static494.aClass50Array12 = null;
		Static366.aClass50Array9 = null;
		Static375.aClass50Array10 = null;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method8669(@OriginalArg(1) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(47) int local47 = arg0.indexOf(" ", "directlogin ".length());
			if (local47 >= 0) {
				@Pc(52) int local52 = arg0.length();
				arg0 = arg0.substring(0, local47) + " ";
				for (@Pc(68) int local68 = local47 + 1; local68 < local52; local68++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}
}
