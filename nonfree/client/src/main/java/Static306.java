import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	public static final int anInt5961 = 1400;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4959(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static59.anInt1208; local11++) {
			if (arg0.equalsIgnoreCase(Static23.aStringArray7[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!hn;)V")
	public static void method4961(@OriginalArg(1) Class15_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class15_Sub2_Sub1_Sub2) {
			@Pc(28) Class15_Sub2_Sub1_Sub2 local28 = (Class15_Sub2_Sub1_Sub2) arg0;
			if (local28.aClass305_1 != null) {
				Static130.method2414(Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 != local28.aByte91, local28);
			}
		} else if (arg0 instanceof Class15_Sub2_Sub1_Sub1) {
			@Pc(8) Class15_Sub2_Sub1_Sub1 local8 = (Class15_Sub2_Sub1_Sub1) arg0;
			Static134.method2520(local8.aByte91 != Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91, local8);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
	public static void method4963(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1) {
		Static169.method3008(arg1, arg0, arg1.length - 1, 0);
	}
}
