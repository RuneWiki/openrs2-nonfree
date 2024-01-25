import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Lclient!mq;")
	public static Class134 aClass134_9;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "Ljava/lang/String;")
	public static final String aString244 = "wave:";

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!qj;I)V")
	public static void method5320(@OriginalArg(0) Class165 arg0) {
		Static62.aClass165_23 = arg0;
		Static236.anInt4635 = Static62.aClass165_23.method4499(16);
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)I")
	public static int method5322() {
		@Pc(7) Class2 local7 = Static34.aClass2_6;
		@Pc(9) boolean local9 = false;
		if (Static258.anInt5029 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static2.method3301(0, 0, local18, null, null);
			local9 = true;
		}
		@Pc(35) long local35 = Static349.method5647();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method3315();
		}
		@Pc(69) int local69 = (int) (Static349.method5647() - local35);
		local7.method3277(0, 100, 0, -16777216, 100);
		if (local9) {
			local7.method3324();
		}
		return local69;
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
	public static void method5323() {
		Static265.aClass140_135.method3819();
		Static158.aClass140_83.method3819();
		Static252.aClass140_130.method3819();
		Static270.aClass140_141.method3819();
		Static230.aClass140_119.method3819();
	}
}
