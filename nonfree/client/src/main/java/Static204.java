import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array13;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method3547() {
		@Pc(1) Class198 local1 = Static251.aClass198_47;
		synchronized (Static251.aClass198_47) {
			Static251.aClass198_47.method5236();
		}
		local1 = Static355.aClass198_63;
		synchronized (Static355.aClass198_63) {
			Static355.aClass198_63.method5236();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ir;Lclient!ir;Lclient!qj;I)V")
	public static void method3548(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Interface7 arg2) {
		Static261.aClass100_105 = arg1;
		Static286.anInterface7_1 = arg2;
		Static36.aClass100_13 = arg0;
		if (Static261.aClass100_105 != null) {
			Static42.anInt891 = Static261.aClass100_105.method2309(1);
		}
		if (Static36.aClass100_13 != null) {
			Static215.anInt4409 = Static36.aClass100_13.method2309(1);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([IZI)V")
	public static void method3549(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 31; local7 > 0; local7--) {
			@Pc(18) int local18 = local7 * 36;
			for (@Pc(20) int local20 = 35; local20 > 0; local20--) {
				if (arg0[local20 + local18] == 0 && arg0[local18 + local20 - 37] != 0) {
					arg0[local20 + local18] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3550(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static255.method5155(arg0.charAt(local12)) - local10;
		}
		return local10;
	}
}
