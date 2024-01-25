import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!uw", name = "P", descriptor = "I")
	public static int anInt9252;

	@OriginalMember(owner = "client!uw", name = "M", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_116 = new Class316(56, 4);

	@OriginalMember(owner = "client!uw", name = "O", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_149 = new Class98(6, 3);

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!va;)V")
	public static void method7330(@OriginalArg(1) Class15_Sub2_Sub4 arg0) {
		if (arg0 instanceof Class15_Sub2_Sub4_Sub1) {
			@Pc(14) Class15_Sub2_Sub4_Sub1 local14 = (Class15_Sub2_Sub4_Sub1) arg0;
			if (local14.aClass88_1 != null) {
				Static9.method125(Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 != local14.aByte98, local14);
				return;
			}
		} else if (arg0 instanceof Class15_Sub2_Sub4_Sub2) {
			@Pc(35) Class15_Sub2_Sub4_Sub2 local35 = (Class15_Sub2_Sub4_Sub2) arg0;
			Static97.method1431(local35.aByte98 != Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98, local35);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZ)V")
	public static void method7331(@OriginalArg(0) int arg0) {
		Static26.anInt444 = -1;
		Static30.anInt535 = arg0;
		Static26.anInt444 = -1;
		Static563.method7799();
	}

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "(III)I")
	public static int method7332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static468.anIntArray572[arg1 & 0x3] : 256;
	}
}
