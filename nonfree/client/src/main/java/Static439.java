import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_61 = new Class71();

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_130 = new Class67("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method6626(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static194.method3707(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg1.charAt(local25) != arg0; local25++) {
			}
			local15[local17++] = arg1.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public static void method6629() {
		Static376.aClass125_63.method3521();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)Z")
	public static boolean method6631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static185.method3503(arg0, arg1) || Static372.method5860(arg0, arg1);
	}
}
