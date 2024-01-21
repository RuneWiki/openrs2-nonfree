import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_24;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!pe;")
	public static Class13 aClass13_35;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1131 = Static158.method3034("<)4col>");

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "[I")
	public static final int[] anIntArray452 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1132 = null;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
	public static int anInt4110 = 0;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1133 = Static158.method3034("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1134 = Static158.method3034("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ)I")
	public static int method3112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Lclient!fg;")
	public static Class26 method3114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass26_1;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
	public static void method3115() {
		if (Static134.aClass82_1 != null) {
			@Pc(3) Class82 local3 = Static134.aClass82_1;
			synchronized (Static134.aClass82_1) {
				Static134.aClass82_1 = null;
			}
		}
	}
}
