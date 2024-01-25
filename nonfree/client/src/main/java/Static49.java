import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "I")
	public static int anInt1400;

	@OriginalMember(owner = "client!bo", name = "G", descriptor = "D")
	public static double aDouble5;

	@OriginalMember(owner = "client!bo", name = "J", descriptor = "[Lclient!uv;")
	public static Class347[] aClass347Array1;

	@OriginalMember(owner = "client!bo", name = "L", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!bo", name = "H", descriptor = "I")
	public static final int anInt1402 = 1406;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method1445(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class3_Sub4_Sub12 local13 = Static556.method8018(3, arg0);
		local13.method3608();
		local13.aString51 = arg1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!qk;)Lclient!qk;")
	public static Class279 method1446(@OriginalArg(1) Class279 arg0) {
		@Pc(11) Class279 local11 = Static76.method1825(arg0);
		if (local11 == null) {
			local11 = arg0.aClass279_16;
		}
		return local11;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)I")
	public static int method1447() {
		@Pc(7) Class5 local7 = Static323.aClass5_9;
		@Pc(9) boolean local9 = false;
		if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static109.method2235(0, 0, null, local18, null);
			local9 = true;
		}
		@Pc(35) long local35 = Static374.method6036();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method7533();
		}
		@Pc(67) int local67 = (int) (Static374.method6036() - local35);
		local7.method7528(0, 100, 100, 0, -16777216);
		if (local9) {
			local7.method7548();
		}
		return local67;
	}
}
