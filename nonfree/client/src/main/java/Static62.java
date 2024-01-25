import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
	public static int anInt1184 = 0;

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_16 = new Class341(16, -1);

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "[I")
	public static final int[] anIntArray63 = new int[256];

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method1156(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static605.anInt10580 = 2;
		Static353.anInt6795 = arg0;
		Static205.method3904(false, arg2, arg1);
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V")
	public static void method1157() {
		@Pc(12) Class2_Sub52 local12 = Static311.method5098(Static380.aClass341_74, Static125.aClass179_1);
		local12.aClass2_Sub8_Sub2_2.method5170(Static255.method4444());
		local12.aClass2_Sub8_Sub2_2.method5192(Static406.anInt7570);
		local12.aClass2_Sub8_Sub2_2.method5192(Static19.anInt352);
		local12.aClass2_Sub8_Sub2_2.method5170(Static230.aClass2_Sub54_15.aClass4_Sub19_1.method6178());
		Static38.method791(local12);
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)Z")
	public static boolean method1158() {
		return Static26.aBoolean26;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I[[S[[F)[[S")
	public static short[][] method1159(@OriginalArg(1) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
			for (@Pc(19) int local19 = 0; local19 < arg0[local15].length; local19++) {
				arg0[local15][local19] = (short) (int) (arg1[local15][local19] * 16383.0F);
			}
		}
		return arg0;
	}
}
