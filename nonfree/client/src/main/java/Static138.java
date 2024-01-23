import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "Lclient!jl;")
	public static Class89 aClass89_18 = new Class89(4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)I")
	public static int method2304(@OriginalArg(0) int arg0) {
		@Pc(7) Class147 local7 = Static117.method3397(arg0);
		@Pc(16) int local16 = local7.anInt4982;
		@Pc(19) int local19 = local7.anInt4983;
		@Pc(22) int local22 = local7.anInt4988;
		@Pc(29) int local29 = Class2_Sub2.anIntArray50[local22 - local16];
		return Static296.anIntArray530[local19] >> local16 & local29;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)[Lclient!em;")
	public static Class46[] method2307() {
		@Pc(4) Class46[] local4 = new Class46[Static165.anInt3668];
		for (@Pc(10) int local10 = 0; local10 < Static165.anInt3668; local10++) {
			if (Static294.aBoolean367) {
				local4[local10] = new Class46_Sub2(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[local10], Static137.anIntArray227[local10], Static95.anIntArray212[local10], Static50.anIntArray22[local10], Static34.aByteArrayArray5[local10], Static234.anIntArray454);
			} else {
				local4[local10] = new Class46_Sub1(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[local10], Static137.anIntArray227[local10], Static95.anIntArray212[local10], Static50.anIntArray22[local10], Static34.aByteArrayArray5[local10], Static234.anIntArray454);
			}
		}
		Static20.method432();
		return local4;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIBIII)V")
	public static void method2309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static99.method1656(arg1)) {
			Static35.method743(Static34.aClass191ArrayArray1[arg1], -1, arg0, arg4, arg5, arg6, arg2, arg3);
		}
	}
}
