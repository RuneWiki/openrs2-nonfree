import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!pl", name = "A", descriptor = "Lclient!da;")
	public static Class68 aClass68_9;

	@OriginalMember(owner = "client!pl", name = "D", descriptor = "Lclient!av;")
	public static final Class27 aClass27_14 = new Class27(8, 4);

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
	public static int anInt8161 = -1;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BII)Z")
	public static boolean method7099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7101(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "(B)V")
	public static void method7102() {
		if (Static531.anApplet2 == null) {
			return;
		}
		try {
			@Pc(20) String local20 = Static531.anApplet2.getParameter("cookiehost");
			@Pc(28) int local28 = (int) (Static26.method382() / 86400000L) - 11745;
			@Pc(44) String local44 = "usrdob=" + local28 + "; version=1; path=/; domain=" + local20;
			Static698.method8236("document.cookie=\"" + local44 + "\"", Static531.anApplet2);
		} catch (@Pc(60) Throwable local60) {
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method7103(@OriginalArg(0) Class14_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static258.aClass159Array1 == Static346.aClass159Array2) {
			return;
		}
		@Pc(10) int local10 = Static445.aClass159Array3[arg1].method8209(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(25) Class159 local25 = Static445.aClass159Array3[local12];
				if (local25 != null) {
					local25.wa(arg0, arg2, local10 - local25.method8209(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
