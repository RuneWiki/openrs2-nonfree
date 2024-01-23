import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!jl", name = "w", descriptor = "Z")
	public static boolean aBoolean169;

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "Lclient!vh;")
	public static Class177 aClass177_5;

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
	public static int anInt2633;

	@OriginalMember(owner = "client!jl", name = "H", descriptor = "Lclient!dd;")
	public static Class31 aClass31_3;

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
	public static int anInt2620 = 0;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "Z")
	public static boolean aBoolean168 = true;

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "[I")
	public static int[] anIntArray223 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!jl", name = "E", descriptor = "[I")
	public static int[] anIntArray224 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)I")
	public static int method2149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
	public static void method2150() {
		@Pc(6) Class48 local6 = Static291.aClass48_1;
		synchronized (Static291.aClass48_1) {
			Static201.anInt4016++;
			Static186.anInt3687 = Static286.anInt5587;
			Static79.anInt1661 = Static69.anInt1422;
			Static178.anInt3603 = Static237.anInt4723;
			Static79.anInt1662 = Static31.anInt652;
			Static72.anInt1466 = Static121.anInt2459;
			Static8.anInt159 = Static21.anInt449;
			Static103.aLong75 = Static2.aLong1;
			Static31.anInt652 = 0;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!pi;I)Lclient!ae;")
	public static Class5_Sub1 method2151(@OriginalArg(0) Class4_Sub24 arg0) {
		return new Class5_Sub1(arg0.method3072(), arg0.method3072(), arg0.method3072(), arg0.method3072(), arg0.method3063(), arg0.method3063(), arg0.method3110());
	}
}
