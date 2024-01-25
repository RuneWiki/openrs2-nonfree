import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!wg", name = "Q", descriptor = "Lclient!tj;")
	public static Class193 aClass193_109;

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_242 = new Class198(30);

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_243 = new Class198(500);

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "S")
	public static short aShort93 = 1;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
	public static int anInt6619 = 0;

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
	public static int anInt6620 = -1;

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_360 = new Class159("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
	public static int anInt6621 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!br;B)V")
	public static void method5536(@OriginalArg(0) Class21 arg0) {
		if (arg0.anInt781 == Static226.anInt4584) {
			Static172.aBooleanArray19[arg0.anInt731] = true;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)I")
	public static int method5544() {
		@Pc(7) Class47 local7 = Static274.aClass47_9;
		@Pc(9) boolean local9 = false;
		if (Static225.anInt4568 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local9 = true;
			local7 = Static344.method2669(0, null, local15, null, 0);
		}
		@Pc(32) long local32 = Static208.method3879();
		for (@Pc(34) int local34 = 0; local34 < 10000; local34++) {
			local7.method2666();
		}
		@Pc(67) int local67 = (int) (Static208.method3879() - local32);
		local7.method2687(0, -16777216, 100, 0, 100);
		if (local9) {
			local7.method2673();
		}
		return local67;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V")
	public static void method5547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static15.aClass4_Sub11_Sub1_2.method3452(arg0);
		Static15.aClass4_Sub11_Sub1_2.method3438(arg2);
		Static15.aClass4_Sub11_Sub1_2.method3459(arg1);
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V")
	public static void method5548() {
		for (@Pc(10) Class2_Sub4 local10 = (Class2_Sub4) Static178.aClass32_6.method850(); local10 != null; local10 = (Class2_Sub4) Static178.aClass32_6.method846()) {
			local10.method3935();
		}
	}
}
