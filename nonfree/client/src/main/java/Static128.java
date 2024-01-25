import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
	public static int anInt2136;

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
	public static int anInt2134 = 0;

	@OriginalMember(owner = "client!dt", name = "E", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_38 = new Class225(110, -1);

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)V")
	public static void method1880() {
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			Static144.aBooleanArray12[local10] = false;
		}
		Static455.anInt7437 = Static583.anInt2354;
		Static24.anInt300 = Static430.anInt7002;
		Static144.anInt2464 = -1;
		Static345.anInt5345 = 0;
		Static253.anInt3964 = -1;
		Static45.anInt602 = -1;
		Static657.anInt10298 = Static528.anInt8386;
		Static654.anInt10226 = -1;
		Static78.anInt1360 = Static218.anInt3475;
		Static48.anInt641 = 0;
		Static60.anInt1040 = 5;
		Static679.anInt10496 = Static411.anInt6731;
		Static524.anInt8314 = Static611.anInt9456;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
	public static void method1883(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub6_Sub12 local9 = Static636.method8647(12, (long) arg1);
		local9.method6239();
		local9.anInt6936 = arg0;
	}
}
