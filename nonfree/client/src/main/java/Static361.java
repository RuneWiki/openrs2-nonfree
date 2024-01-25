import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!s", name = "s", descriptor = "I")
	public static int anInt6112;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "I")
	public static int anInt6115;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	public static int anInt6104 = 0;

	@OriginalMember(owner = "client!s", name = "w", descriptor = "[Lclient!ln;")
	public static final Class7_Sub2_Sub3_Sub2[] aClass7_Sub2_Sub3_Sub2Array1 = new Class7_Sub2_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!s", name = "x", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_95 = new Class217(9, 7);

	@OriginalMember(owner = "client!s", name = "z", descriptor = "Lclient!ef;")
	public static final Class61 aClass61_10 = new Class61(14, 0, 4, 1);

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V")
	public static void method4770() {
		Static263.aClass10_1.method303();
		Static290.aClass100_1.method3211();
		if (Static130.aClass234_2 != null) {
			Static130.aClass234_2.method5931(Static392.aCanvas6);
		}
		Static332.aClient1.method1106();
		Static392.aCanvas6.setBackground(Color.black);
		Static251.anInt4762 = -1;
		Static263.aClass10_1 = Static296.method4147(Static392.aCanvas6);
		Static290.aClass100_1 = Static405.method5231(Static392.aCanvas6);
		if (Static130.aClass234_2 != null) {
			Static130.aClass234_2.method5930(Static392.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!bu;B)I")
	public static int method4771(@OriginalArg(0) Class32 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method800(Static359.anInt6090)) {
			local5++;
		}
		if (arg0.method800(Static275.anInt5095)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	public static void method4772() {
		Static391.anInt6727 = 0;
		@Pc(12) int local12 = (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 >> 7) + Static223.anInt7618;
		@Pc(19) int local19 = Static57.anInt5085 + (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static391.anInt6727 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static391.anInt6727 = 1;
		}
		if (Static391.anInt6727 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static391.anInt6727 = 0;
		}
	}
}
