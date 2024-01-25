import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
	public static int anInt6590;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
	public static int anInt6592;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!mk;")
	public static Class130 aClass130_149 = new Class130();

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "[I")
	public static final int[] anIntArray522 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Z")
	public static boolean aBoolean571 = false;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "[I")
	public static final int[] anIntArray523 = new int[1024];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Z")
	public static boolean method5465() {
		try {
			return Static204.method3615();
		} catch (@Pc(17) IOException local17) {
			Static181.method3368();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(63) String local63 = "T2 - " + Static94.anInt2092 + "," + Static253.anInt5245 + "," + Static326.anInt6408 + " - " + Static302.anInt6099 + "," + (Static10.anInt231 + Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray518[0]) + "," + (Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray517[0] + Static81.anInt1732) + " - ";
			for (@Pc(65) int local65 = 0; local65 < Static302.anInt6099 && local65 < 50; local65++) {
				local63 = local63 + Static200.aClass4_Sub7_Sub1_2.aByteArray42[local65] + ",";
			}
			Static103.method2841(local22, local63);
			Static136.method2722();
			return true;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(CI)Z")
	public static boolean method5466(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
