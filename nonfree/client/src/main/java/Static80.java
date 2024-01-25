import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Lclient!sa;")
	public static Class313 aClass313_1;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "[I")
	public static final int[] anIntArray58 = new int[8];

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "[I")
	public static final int[] anIntArray59 = new int[32];

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "Lclient!qha;")
	public static final Class291 aClass291_4 = new Class291(8);

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "Lclient!el;")
	public static final Class109 aClass109_34 = new Class109(54, 6);

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
	public static int anInt1219 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)I")
	public static int method1205() {
		@Pc(7) Class57 local7 = Static457.aClass57_11;
		@Pc(9) boolean local9 = false;
		if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local9 = true;
			local7 = Static637.method8915(0, local21, 0, (Interface1) null, (Class208) null);
		}
		@Pc(38) long local38 = Static515.method7499(79);
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local7.method7696();
		}
		if (-79 != -79) {
			method1207(6, -106);
		}
		@Pc(85) int local85 = (int) (Static515.method7499(123) - local38);
		local7.method7731(-16777216, 0, 100, 100, 0);
		if (local9) {
			local7.method7722();
		}
		return local85;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZI)V")
	public static void method1207(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static436.anInt7489 = arg1 - Static629.anInt9765;
		Static652.anInt10539 = arg0 - Static629.anInt9763;
	}
}
