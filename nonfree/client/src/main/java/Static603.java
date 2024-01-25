import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "J")
	public static long aLong269;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "F")
	public static float aFloat222;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public static int anInt9994;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	public static final int anInt9991 = 328;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLclient!wc;)Ljava/lang/String;")
	public static String method8360(@OriginalArg(1) Class2_Sub5_Sub20 arg0) {
		if (arg0.aString99 == null || arg0.aString99.length() == 0) {
			return arg0.aString101 == null || arg0.aString101.length() <= 0 ? arg0.aString100 : arg0.aString100 + Static628.aClass369_32.method8475(Static377.anInt6756) + arg0.aString101;
		} else if (arg0.aString101 == null || arg0.aString101.length() <= 0) {
			return arg0.aString100 + Static628.aClass369_32.method8475(Static377.anInt6756) + arg0.aString99;
		} else {
			return arg0.aString100 + Static628.aClass369_32.method8475(Static377.anInt6756) + arg0.aString101 + Static628.aClass369_32.method8475(Static377.anInt6756) + arg0.aString99;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)Z")
	public static boolean method8363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
	public static void method8367() {
		Static606.anInt9911 = 1;
		Static288.anInt5415 = -1;
		if (Static473.aString74 == null) {
			Static163.method3036(35);
		} else {
			@Pc(24) Class2_Sub34 local24 = new Class2_Sub34(Static607.method8295(Static229.method3862(Static473.aString74)));
			@Pc(28) long local28 = local24.method6877();
			Static163.aLong100 = local24.method6877();
			Static490.method7019(true, Static400.method6053(local28), "");
		}
	}
}
