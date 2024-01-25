import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
	public static int anInt4781 = 0;

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[128][128];

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "[I")
	public static final int[] anIntArray380 = new int[4096];

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
	public static void method4071() {
		Static12.aClass198_5.method5230();
		Static15.aClass198_6.method5230();
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)Z")
	public static boolean method4073() {
		try {
			return Static74.method1129();
		} catch (@Pc(14) IOException local14) {
			Static301.method5086();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(60) String local60 = "T2 - " + Static92.anInt1818 + "," + Static307.anInt6101 + "," + Static170.anInt6276 + " - " + Static306.anInt6046 + "," + (Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0] + Static186.anInt3094) + "," + (Static296.anInt5889 + Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0]) + " - ";
			for (@Pc(62) int local62 = 0; local62 < Static306.anInt6046 && local62 < 50; local62++) {
				local60 = local60 + Static20.aClass3_Sub4_Sub2_1.aByteArray70[local62] + ",";
			}
			Static69.method1091(local60, local19);
			Static251.method4218();
			return true;
		}
	}
}
