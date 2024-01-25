import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_149 = new Class254(47, 3);

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "[I")
	public static final int[] anIntArray584 = new int[32];

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
	public static int anInt7791 = 0;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5992(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static305.method4200(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static321.anInt5589; local30++) {
			@Pc(36) String local36 = Static104.aStringArray14[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static305.method4200(local36);
			if (local36 != null && local36.equals(local25)) {
				Static321.anInt5589--;
				for (@Pc(60) int local60 = local30; local60 < Static321.anInt5589; local60++) {
					Static104.aStringArray14[local60] = Static104.aStringArray14[local60 + 1];
					Static50.aStringArray7[local60] = Static50.aStringArray7[local60 + 1];
					Static49.aStringArray5[local60] = Static49.aStringArray5[local60 + 1];
					Static156.aStringArray18[local60] = Static156.aStringArray18[local60 + 1];
					Static340.aBooleanArray22[local60] = Static340.aBooleanArray22[local60 + 1];
				}
				Static238.anInt4203 = Static270.anInt2350;
				Static224.method3272(Static403.aClass254_132);
				Static201.aClass1_Sub14_Sub2_2.method4553(Static388.method5637(arg0));
				Static201.aClass1_Sub14_Sub2_2.method4512(arg0);
				return;
			}
		}
	}
}
