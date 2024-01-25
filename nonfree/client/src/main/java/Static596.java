import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!uaa", name = "q", descriptor = "F")
	public static float aFloat138;

	@OriginalMember(owner = "client!uaa", name = "u", descriptor = "I")
	public static int anInt7098;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)I")
	public static int method5956() {
		@Pc(7) Class95 local7 = Static119.aClass95_4;
		@Pc(9) boolean local9 = false;
		if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static599.method6438((Class362) null, 0, (Interface2) null, 0, local18);
		}
		@Pc(35) long local35 = Static15.method380();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method8006();
		}
		@Pc(64) int local64 = (int) (Static15.method380() - local35);
		local7.method8054(100, 0, 100, 0, -16777216);
		if (local9) {
			local7.method8007();
		}
		return local64;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(DZ)V")
	public static void method5959(@OriginalArg(0) double arg0) {
		Static565.aClass17_8.method6233(Static457.aClass17_6);
		Static565.aClass17_8.method6235(0, 0, (int) arg0);
		Static565.aClass95_13.method8037(Static565.aClass17_8);
	}
}
