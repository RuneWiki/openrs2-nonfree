import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "Lclient!in;")
	public static final Class169 aClass169_264 = new Class169(128, -1);

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "Z")
	public static boolean aBoolean800 = false;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZIIIIILclient!ha;)Lclient!ka;")
	public static Class14 method9636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class101 arg5) {
		@Pc(6) long local6 = (long) arg1;
		@Pc(17) Class14 local17 = (Class14) Static656.aClass22_68.method462(local6);
		if (local17 == null) {
			@Pc(27) Class159 local27 = Static452.method7285(Static21.aClass124_7, arg1);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt4809 < 13) {
				local27.method4358();
			}
			local17 = arg5.method8064(local27, 2055, Static561.anInt9735, 64, 768);
			Static656.aClass22_68.method470(local6, local17);
		}
		local17 = local17.method8622((byte) 2, 2055, true);
		if (arg2 != 0) {
			local17.a(arg2);
		}
		if (arg0 != 0) {
			local17.FA(arg0);
		}
		if (arg4 != 0) {
			local17.VA(arg4);
		}
		if (arg3 != 0) {
			local17.H(0, arg3, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IJ)V")
	public static void method9641(@OriginalArg(1) long arg0) {
		Static550.aCalendar1.setTime(new Date(arg0));
	}
}
