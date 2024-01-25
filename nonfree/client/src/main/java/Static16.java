import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
	public static int anInt166;

	@OriginalMember(owner = "client!aja", name = "d", descriptor = "[Lclient!ac;")
	public static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!aja", name = "e", descriptor = "Lclient!da;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "[I")
	public static final int[] anIntArray12 = new int[13];

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)Z")
	public static boolean method238() {
		try {
			return Static55.method1264();
		} catch (@Pc(14) IOException local14) {
			Static42.method787();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static17.aClass218_2 == null ? -1 : Static17.aClass218_2.method5800()) + "," + (Static276.aClass218_71 == null ? -1 : Static276.aClass218_71.method5800()) + "," + (Static614.aClass218_148 == null ? -1 : Static614.aClass218_148.method5800()) + " - " + Static172.anInt4126 + "," + (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray378[0] + Static446.anInt8090) + "," + (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray377[0] + Static124.anInt3150) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static172.anInt4126 && local79 < 50; local79++) {
				local77 = local77 + Static281.aClass3_Sub15_Sub1_4.aByteArray106[local79] + ",";
			}
			Static544.method7724(local77, local19);
			Static229.method4376(false);
			return true;
		}
	}
}
