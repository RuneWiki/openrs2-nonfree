import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static385 {

	@OriginalMember(owner = "client!t", name = "ab", descriptor = "I")
	public static int anInt6689;

	@OriginalMember(owner = "client!t", name = "bb", descriptor = "Lclient!bh;")
	public static Class24 aClass24_4;

	@OriginalMember(owner = "client!t", name = "L", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!t", name = "M", descriptor = "I")
	public static int anInt6677 = -1;

	@OriginalMember(owner = "client!t", name = "V", descriptor = "I")
	public static int anInt6686 = 100;

	@OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
	public static int anInt6687 = -1;

	@OriginalMember(owner = "client!t", name = "cb", descriptor = "[Lclient!ms;")
	public static final Class175[] aClass175Array1 = new Class175[2048];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!za;)V")
	public static void method5352(@OriginalArg(1) Class75 arg0) {
		if (Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 != Static80.anInt6192 && (Static175.aClass36ArrayArrayArray1 != null && Static63.method5435(arg0, Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101))) {
			Static80.anInt6192 = Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
	public static void method5353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static164.method2403(Static109.aClass208_23);
		}
		if (arg1 == 1) {
			Static164.method2403(Static393.aClass208_93);
		}
		Static389.aClass2_Sub17_Sub1_2.method6130(arg0 + Static153.anInt2798);
		Static389.aClass2_Sub17_Sub1_2.method6130(Static386.anInt7205 + arg2);
		Static389.aClass2_Sub17_Sub1_2.method6172(Static161.aClass115_1.method2374(82) ? 1 : 0);
		Static331.anInt5943 = arg0;
		Static249.anInt4279 = arg2;
		Static68.aBoolean65 = false;
		Static303.method3585();
	}
}
