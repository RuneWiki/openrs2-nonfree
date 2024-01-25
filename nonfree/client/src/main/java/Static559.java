import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "F")
	public static float aFloat196;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "J")
	public static long aLong254 = -1L;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!pw;")
	public static final Class261 aClass261_11 = new Class261("", 11);

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	public static int anInt9221 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZ)V")
	public static void method7549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class6_Sub2_Sub7 local14 = Static401.method5861(arg1, 14);
		local14.method2582();
		local14.anInt2944 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)I")
	public static int method7550() {
		@Pc(7) Class14 local7 = Static240.aClass14_7;
		@Pc(9) boolean local9 = false;
		if (Static560.anInt9242 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local9 = true;
			local7 = Static354.method6855(null, null, 0, local15, 0);
		}
		@Pc(32) long local32 = Static8.method201();
		for (@Pc(34) int local34 = 0; local34 < 10000; local34++) {
			local7.method6868();
		}
		@Pc(67) int local67 = (int) (Static8.method201() - local32);
		local7.method6859(100, 0, 0, -16777216, 100);
		if (local9) {
			local7.method6824();
		}
		return local67;
	}
}
