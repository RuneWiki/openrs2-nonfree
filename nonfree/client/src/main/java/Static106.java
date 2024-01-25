import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Lclient!dc;")
	public static Class53 aClass53_1;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Lclient!pu;")
	public static final Class203 aClass203_11 = new Class203();

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
	public static void method1755() {
		if (Static129.method2126(Static170.anInt3494) || Static91.method1566(Static170.anInt3494)) {
			Static55.method1049(5000, Static378.anInt6885 >> 10, Static78.anInt1973 >> 10);
		} else {
			@Pc(28) int local28 = Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray130[0] >> 3;
			@Pc(35) int local35 = Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray129[0] >> 3;
			if (local28 >= 0 && Static209.anInt4283 >> 3 > local28 && local35 >= 0 && Static211.anInt4295 >> 3 > local35) {
				Static55.method1049(5000, local28, local35);
			} else {
				Static55.method1049(0, Static209.anInt4283 >> 4, Static211.anInt4295 >> 4);
			}
		}
		Static218.method3406();
		Static71.method1364();
		Static356.method5663();
		Static398.method5482();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[S[Ljava/lang/String;)V")
	public static void method1756(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static197.method3165(arg1.length - 1, arg1, 0, arg0);
	}
}
