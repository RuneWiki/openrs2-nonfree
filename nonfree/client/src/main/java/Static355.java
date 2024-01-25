import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!vd;B)V")
	public static void method5680(@OriginalArg(0) Class353 arg0) {
		Static316.anInt6067 = 0;
		Static215.anInt4208 = 0;
		Static361.aClass81_6 = new Class81();
		Static569.aClass20_Sub6_Sub1_Sub1Array2 = new Class20_Sub6_Sub1_Sub1[1024];
		Static385.aClass20_Sub8Array1 = new Class20_Sub8[Static296.anIntArray354[Static544.anInt9351] + 1];
		Static514.anInt9008 = 0;
		Static323.anInt6179 = 0;
		Static542.method7926(arg0);
		Static532.method7698(arg0);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)Z")
	public static boolean method5681() {
		try {
			return Static263.method4677();
		} catch (@Pc(14) IOException local14) {
			Static534.method7893();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(79) String local79 = "T2 - " + (Static5.aClass268_3 == null ? -1 : Static5.aClass268_3.method7011()) + "," + (Static112.aClass268_38 == null ? -1 : Static112.aClass268_38.method7011()) + "," + (Static441.aClass268_143 == null ? -1 : Static441.aClass268_143.method7011()) + " - " + Static501.anInt8676 + "," + (Static606.anInt8651 + Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray335[0]) + "," + (Static195.anInt3961 + Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray336[0]) + " - ";
			for (@Pc(81) int local81 = 0; local81 < Static501.anInt8676 && local81 < 50; local81++) {
				local79 = local79 + Static456.aClass6_Sub40_Sub2_2.aByteArray113[local81] + ",";
			}
			Static619.method8645(local19, local79);
			Static126.method2048(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5682(@OriginalArg(1) String arg0) {
		return Static612.method7494(arg0, 10);
	}
}
