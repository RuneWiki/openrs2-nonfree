import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_14 = new Class140("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_32 = new Class157(74, 2);

	@OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
	public static int anInt779 = 0;

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
	public static int anInt780 = -60;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)I")
	public static int method899() {
		@Pc(7) Class37 local7 = Static51.aClass37_1;
		@Pc(9) boolean local9 = false;
		if (Static114.anInt2421 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static67.method3720(local18, null, 0, null, 0);
			local9 = true;
		}
		@Pc(39) long local39 = Static22.method285();
		for (@Pc(41) int local41 = 0; local41 < 10000; local41++) {
			local7.method3704();
		}
		@Pc(68) int local68 = (int) (Static22.method285() - local39);
		local7.method3694(100, -16777216, 100, 0, 0);
		if (local9) {
			local7.method3699();
		}
		return local68;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
	public static void method903(@OriginalArg(0) int arg0) {
		anInt779 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static344.anInt6692; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static63.anInt1129; local6++) {
				if (Static196.aClass51ArrayArrayArray3[arg0][local3][local6] == null) {
					Static196.aClass51ArrayArrayArray3[arg0][local3][local6] = new Class51(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
	public static void method908() {
		@Pc(1) Class107 local1 = Static294.aClass107_45;
		synchronized (Static294.aClass107_45) {
			Static294.aClass107_45.method3011(5);
		}
	}
}
