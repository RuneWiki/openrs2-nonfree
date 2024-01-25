import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!qv", name = "A", descriptor = "Lclient!jha;")
	public static Class190 aClass190_3;

	@OriginalMember(owner = "client!qv", name = "B", descriptor = "I")
	public static int anInt3295;

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
	public static int anInt3294 = 0;

	@OriginalMember(owner = "client!qv", name = "y", descriptor = "Z")
	public static boolean aBoolean255 = false;

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "Z")
	public static boolean aBoolean258 = true;

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "(I)I")
	public static int method3113(@OriginalArg(0) int arg0) {
		@Pc(7) Class75 local7 = Static202.aClass75_5;
		@Pc(9) boolean local9 = false;
		if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local9 = true;
			local7 = Static187.method3520(local21, 0, (Class223) null, (Interface11) null, 0);
		}
		@Pc(38) long local38 = Static549.method7758();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local7.method6677();
		}
		if (arg0 != 9714) {
			method3113(-87);
		}
		@Pc(84) int local84 = (int) (Static549.method7758() - local38);
		local7.method6631(100, 0, 100, -16777216, 0);
		if (local9) {
			local7.method6672();
		}
		return local84;
	}
}
