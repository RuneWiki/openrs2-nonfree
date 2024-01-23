import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!od", name = "p", descriptor = "Lclient!ma;")
	public static Class108 aClass108_4;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "I")
	public static int anInt4203 = 127;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ek;I)V")
	public static void method3407(@OriginalArg(0) Class42 arg0) {
		Static220.aClass42_69 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!bn;Lclient!g;IIIII)V")
	public static void method3409(@OriginalArg(0) Class2_Sub8_Sub1 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(19) int local19;
		if (Static16.anInt342 == 4) {
			local19 = (int) Static239.aFloat51 & 0x7FF;
		} else {
			local19 = (int) Static239.aFloat51 + Static301.anInt5810 & 0x7FF;
		}
		@Pc(40) int local40 = arg4 * arg4 + arg2 * arg2;
		@Pc(52) int local52 = Math.max(arg1.anInt2057 / 2, arg1.anInt2031 / 2) + 10;
		if (local40 > local52 * local52) {
			return;
		}
		@Pc(66) int local66 = Class1.anIntArray4[local19];
		@Pc(70) int local70 = Class1.anIntArray3[local19];
		if (Static16.anInt342 != 4) {
			local66 = local66 * 256 / (Static141.anInt3097 + 256);
			local70 = local70 * 256 / (Static141.anInt3097 + 256);
		}
		@Pc(100) int local100 = arg4 * local66 + local70 * arg2 >> 16;
		@Pc(111) int local111 = arg4 * local70 - local66 * arg2 >> 16;
		if (Static116.aBoolean184) {
			((Class2_Sub8_Sub1_Sub2) arg0).method4383(arg1.anInt2057 / 2 + arg3 + local100 - arg0.anInt5520 / 2, arg5 - -(arg1.anInt2031 / 2) - (local111 - -(arg0.anInt5516 / 2)), (Class2_Sub8_Sub1_Sub2) arg1.method1555(false));
		} else {
			((Class2_Sub8_Sub1_Sub1) arg0).method2774(local100 + arg3 + arg1.anInt2057 / 2 - arg0.anInt5520 / 2, arg1.anInt2031 / 2 + (arg5 - local111) + -(arg0.anInt5516 / 2), arg1.anIntArray181, arg1.anIntArray176);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V")
	public static void method3410(@OriginalArg(1) int arg0) {
		@Pc(6) Class177 local6 = Static56.aClass177_1;
		synchronized (Static56.aClass177_1) {
			Static155.anInt3470 = arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public static void method3412(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub8_Sub10 local12 = Static92.method1633(1, arg0);
		local12.method2043();
	}
}
