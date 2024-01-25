import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
	public static int anInt6628;

	@OriginalMember(owner = "client!uf", name = "B", descriptor = "Lclient!mh;")
	public static Class157 aClass157_1;

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "[I")
	public static int[] anIntArray555;

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "Z")
	public static boolean aBoolean468 = false;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBZ)V")
	public static void method5143(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0) {
			Static82.aClass163_1 = Static460.method5567(arg0, Static2.aClass148_Sub1_1.anInt3796 * 2, Static286.aCanvas4, Static65.anInterface9_6, Static79.aClass183_2);
		} else {
			if (arg1) {
				Static82.aClass163_1 = Static460.method5567(0, 0, Static286.aCanvas4, Static65.anInterface9_6, Static79.aClass183_2);
				Static82.aClass163_1.t(0);
				@Pc(42) Class141 local42 = Static69.method1057(Static224.anInt3665, Static77.aClass54_26);
				@Pc(51) Class92 local51 = Static82.aClass163_1.method5537(local42, Static461.method256(Static103.aClass54_28, Static224.anInt3665));
				Static3.method33(Static244.aClass134_61.method2720(Static331.anInt5597), local51, true);
				Static82.aClass163_1.method5562();
				Static61.method903();
				Static82.aClass163_1.method5554();
			}
			try {
				Static82.aClass163_1 = Static460.method5567(arg0, Static2.aClass148_Sub1_1.anInt3796 * 2, Static286.aCanvas4, Static65.anInterface9_6, Static79.aClass183_2);
				if (Static82.aClass163_1.method5516()) {
					@Pc(82) boolean local82 = true;
					try {
						local82 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(92) Throwable local92) {
					}
					@Pc(98) Class2_Sub6 local98;
					if (local82) {
						local98 = Static82.aClass163_1.method5506(146800640);
					} else {
						local98 = Static82.aClass163_1.method5506(104857600);
					}
					Static82.aClass163_1.method5533(local98);
				}
			} catch (@Pc(109) Throwable local109) {
				arg0 = 0;
				Static82.aClass163_1 = Static460.method5567(0, 0, Static286.aCanvas4, Static65.anInterface9_6, Static79.aClass183_2);
			}
		}
		Static288.anInt4743 = arg0;
		Static388.method3884();
		if (!Static82.aClass163_1.method5524()) {
			Static115.anInt2125 = 1;
		}
		Static82.aClass163_1.method5564(Static115.anInt2125);
		Static82.aClass163_1.method5547(0);
		Static82.aClass163_1.ya(8);
		Static57.aClass31_2 = Static82.aClass163_1.method5566();
		Static276.aClass31_3 = Static82.aClass163_1.method5566();
		Static127.method1895();
		Static82.aClass163_1.method5531(!Static2.aClass148_Sub1_1.aBoolean258);
		if (Static82.aClass163_1.method5507()) {
			Static417.method5271(Static2.aClass148_Sub1_1.aBoolean261);
		}
		Static264.method3521(Static426.anInt6923 >> 3, Static82.aClass163_1, Static166.anInt2852 >> 3);
		Static449.method5641();
		Static418.aBoolean496 = false;
	}
}
