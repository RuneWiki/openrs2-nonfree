import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!at", name = "M", descriptor = "Lclient!es;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!at", name = "Q", descriptor = "Lclient!rf;")
	public static Class199 aClass199_1;

	@OriginalMember(owner = "client!at", name = "L", descriptor = "I")
	public static int anInt597 = 0;

	@OriginalMember(owner = "client!at", name = "O", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_21 = new Class184(87, 14);

	@OriginalMember(owner = "client!at", name = "e", descriptor = "(III)V")
	public static void method563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass1_Sub1_2 != null) {
			local7.aClass1_Sub1_2 = null;
		}
		if (local7.aClass1_Sub1_3 != null) {
			local7.aClass1_Sub1_3 = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "e", descriptor = "(B)I")
	public static int method565() {
		@Pc(5) Class75 local5 = Static266.aClass75_7;
		@Pc(7) boolean local7 = false;
		if (Static347.anInt6318 != 0) {
			@Pc(16) Canvas local16 = new Canvas();
			local16.setSize(100, 100);
			local7 = true;
			local5 = Static318.method2582(null, local16, null, 0, 0);
		}
		@Pc(33) long local33 = Static150.method2672();
		for (@Pc(35) int local35 = 0; local35 < 10000; local35++) {
			local5.method2580();
		}
		@Pc(66) int local66 = (int) (Static150.method2672() - local33);
		local5.method2600(100, 0, 100, 0, -16777216);
		if (local7) {
			local5.method2608();
		}
		return local66;
	}
}
