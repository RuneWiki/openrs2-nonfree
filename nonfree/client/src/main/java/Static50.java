import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
	public static int anInt1103;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIBLclient!ma;)V")
	public static void method926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4_Sub28 arg3) {
		@Pc(28) long local28 = (long) (arg1 | arg2 << 28 | arg0 << 14);
		@Pc(34) Class4_Sub21 local34 = (Class4_Sub21) Static178.aClass198_35.method5261(local28);
		if (local34 == null) {
			local34 = new Class4_Sub21();
			Static178.aClass198_35.method5267(local28, local34);
			local34.aClass130_65.method3510(arg3);
			return;
		}
		@Pc(56) Class142 local56 = Static247.method4270(arg3.anInt4053);
		@Pc(59) int local59 = local56.anInt4515;
		if (local56.anInt4459 == 1) {
			local59 *= arg3.anInt4051 + 1;
		}
		for (@Pc(78) Class4_Sub28 local78 = (Class4_Sub28) local34.aClass130_65.method3499(); local78 != null; local78 = (Class4_Sub28) local34.aClass130_65.method3512()) {
			local56 = Static247.method4270(local78.anInt4053);
			@Pc(90) int local90 = local56.anInt4515;
			if (local56.anInt4459 == 1) {
				local90 *= local78.anInt4051 + 1;
			}
			if (local59 > local90) {
				Static143.method2799(local78, arg3);
				return;
			}
		}
		local34.aClass130_65.method3510(arg3);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		Static346.method5622(0, arg0, arg4, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
	public static void method928() {
		@Pc(5) Class85 local5 = Static234.aClass85_1;
		synchronized (Static234.aClass85_1) {
			Static234.aClass85_1.method2010();
		}
	}
}
