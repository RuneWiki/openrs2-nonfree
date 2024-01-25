import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
	public static int anInt7500;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IC)Z")
	public static boolean method6206(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(38) char[] local38 = Static426.aCharArray8;
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				@Pc(46) char local46 = local38[local40];
				if (arg0 == local46) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
	public static void method6207() {
		Static66.aClass103_5.method7408();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static549.aLongArray15[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static581.aLongArray16[local24] = 0L;
		}
		Static348.anInt6080 = 0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public static void method6208() {
		Static238.aClass124_58 = new Class124();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)I")
	public static int method6209(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)I")
	public static int method6210() {
		@Pc(7) Class66 local7 = Static185.aClass66_14;
		@Pc(9) boolean local9 = false;
		if (Static403.anInt6994 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static367.method6819(0, local18, 0, null, null);
			local9 = true;
		}
		@Pc(37) long local37 = Static184.method3422();
		for (@Pc(39) int local39 = 0; local39 < 10000; local39++) {
			local7.method6816();
		}
		@Pc(68) int local68 = (int) (Static184.method3422() - local37);
		local7.method6794(100, 0, 100, 0, -16777216);
		if (local9) {
			local7.method6838();
		}
		return local68;
	}
}
