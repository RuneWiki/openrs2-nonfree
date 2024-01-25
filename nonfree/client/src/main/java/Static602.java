import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!vha", name = "m", descriptor = "I")
	public static int anInt10571 = 0;

	@OriginalMember(owner = "client!vha", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)I")
	public static int method8804() {
		@Pc(7) Class20 local7 = Static186.aClass20_4;
		@Pc(9) boolean local9 = false;
		if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() != 0) {
			@Pc(23) Canvas local23 = new Canvas();
			local23.setSize(100, 100);
			local7 = Static348.method5945(0, null, 0, local23, null);
			local9 = true;
		}
		@Pc(42) long local42 = Static277.method5091();
		for (@Pc(44) int local44 = 0; local44 < 10000; local44++) {
			local7.method7279();
		}
		@Pc(72) int local72 = (int) (Static277.method5091() - local42);
		local7.method7278(100, 0, 0, 100, -16777216);
		if (local9) {
			local7.method7238();
		}
		return local72;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)Lclient!ca;")
	public static Class47 method8806() {
		try {
			return (Class47) Class.forName("Class47_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
