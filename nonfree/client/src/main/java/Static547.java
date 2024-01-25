import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!sia", name = "x", descriptor = "I")
	public static int anInt9550;

	@OriginalMember(owner = "client!sia", name = "v", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_91 = new Class341(25, 4);

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method8375(@OriginalArg(0) Class101 arg0) {
		if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 != Static598.anInt10389 && (Static193.aClass291ArrayArrayArray2 != null && Static486.method7716(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142, arg0))) {
			Static598.anInt10389 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method8376(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static679.method4129(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
