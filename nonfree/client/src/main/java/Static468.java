import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!qba", name = "L", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "([Lclient!lq;II)V")
	public static void method6676(@OriginalArg(0) Class28_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class28_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10777;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10777 < local27 + (local29 & 0x1)) {
				@Pc(44) Class28_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method6676(arg0, arg1, local10 - 1);
		method6676(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "(B)V")
	public static void method6678() {
		if (Static639.anApplet2 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static639.anApplet2.getParameter("cookiehost");
			@Pc(23) int local23 = (int) (Static547.method7619() / 86400000L) - 11745;
			@Pc(35) String local35 = "usrdob=" + local23 + "; version=1; path=/; domain=" + local15;
			Static682.method3656("document.cookie=\"" + local35 + "\"", Static639.anApplet2);
		} catch (@Pc(49) Throwable local49) {
		}
	}
}
