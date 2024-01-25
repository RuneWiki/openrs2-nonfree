import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bm", name = "R", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array2;

	@OriginalMember(owner = "client!bm", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString19 = "Loaded input handler";

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
	public static volatile int anInt530 = 0;

	@OriginalMember(owner = "client!bm", name = "T", descriptor = "I")
	public static int anInt536 = 2;

	@OriginalMember(owner = "client!bm", name = "V", descriptor = "I")
	public static int anInt538 = 0;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(II)V")
	public static void method484() {
		Static303.aClass37_101.method920(5);
		Static123.aClass37_81.method920(5);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!lm;ILclient!lm;Lclient!rh;Lclient!lm;)Z")
	public static boolean method485(@OriginalArg(0) Class134 arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) Class1_Sub31_Sub3 arg2, @OriginalArg(4) Class134 arg3) {
		Static260.aClass134_121 = arg0;
		Static58.aClass1_Sub31_Sub3_1 = arg2;
		Static46.aClass134_26 = arg3;
		Static87.aClass134_37 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!fh;Ljava/awt/Canvas;II)Lclient!ii;")
	public static Class105 method486(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2) {
		return new Class105_Sub2(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V")
	public static void method487() {
		if (Static137.aClass63_2 == null) {
			return;
		}
		while (true) {
			while (Static340.anInt6563 < Static157.aClass127_Sub1Array1.length) {
				@Pc(26) Class127_Sub1 local26 = Static157.aClass127_Sub1Array1[Static340.anInt6563];
				if (local26 != null && local26.anInt6394 == -1) {
					if (Static101.aClass1_Sub34_1 == null) {
						Static101.aClass1_Sub34_1 = Static137.aClass63_2.method1311(local26.aString250);
					}
					@Pc(50) int local50 = Static101.aClass1_Sub34_1.anInt4693;
					if (local50 == -1) {
						return;
					}
					Static101.aClass1_Sub34_1 = null;
					Static340.anInt6563++;
					local26.anInt6394 = local50;
				} else {
					Static340.anInt6563++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static124.method1975(arg1, arg0, arg2, 0, arg4, arg3);
	}
}
