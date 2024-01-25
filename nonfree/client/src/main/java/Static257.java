import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mv", name = "r", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_61 = new Class146(78, 8);

	@OriginalMember(owner = "client!mv", name = "v", descriptor = "[S")
	public static short[] aShortArray82 = new short[256];

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(B)V")
	public static void method3395() {
		for (@Pc(8) Class20_Sub7 local8 = (Class20_Sub7) Static26.aClass248_2.method5582(); local8 != null; local8 = (Class20_Sub7) Static26.aClass248_2.method5582()) {
			Static104.method1542(local8);
		}
		@Pc(35) int local35;
		@Pc(33) int local33;
		if (Static413.aClass49_Sub1_1.method2485(Static341.anInt5549)) {
			local33 = 3;
			local35 = 0;
		} else {
			local33 = Static163.anInt3008;
			local35 = Static163.anInt3008;
		}
		Static55.method758();
		for (@Pc(44) int local44 = local35; local44 <= local33; local44++) {
			Static55.method761();
			Static55.method766(local44);
			Static55.method750(local44);
		}
		Static55.method759();
		Static55.method751();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIII)I")
	public static int method3396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return ((arg1 >> 2 & 0x3F) << 10) + (arg0 >> 5 << 7) + (arg2 >> 1);
	}
}
