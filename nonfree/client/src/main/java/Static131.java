import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray28 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1162 = Static49.method1293("No reply from loginserver)3");

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1160 = aClass70_1162;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!f;")
	public static Class1_Sub9_Sub1 aClass1_Sub9_Sub1_3 = new Class1_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1161 = Static49.method1293("Lade Sprites )2 ");

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
	public static int anInt3437 = 0;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1163 = Static49.method1293("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1164 = aClass70_1163;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public static void method2563() {
		Static90.anInt2638 = 0;
		@Pc(12) int local12 = (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 >> 7) + Static154.anInt4068;
		@Pc(19) int local19 = Static64.anInt987 + (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static90.anInt2638 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static90.anInt2638 = 1;
		}
		if (Static90.anInt2638 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static90.anInt2638 = 0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!ig;)Lclient!ig;")
	public static Class39 method2564(@OriginalArg(1) Class39 arg0) {
		@Pc(18) int local18 = Static41.method1035(Static20.method439(arg0));
		if (local18 == 0) {
			return null;
		}
		for (@Pc(24) int local24 = 0; local24 < local18; local24++) {
			arg0 = Static128.method3227(arg0.anInt2325);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method2565() {
		anIntArrayArray28 = null;
		aClass70_1160 = null;
		aClass70_1161 = null;
		aFrame1 = null;
		aClass1_Sub9_Sub1_3 = null;
		aClass70_1163 = null;
		aClass70_1164 = null;
		aClass70_1162 = null;
	}
}
