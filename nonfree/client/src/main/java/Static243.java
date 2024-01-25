import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
	public static int anInt4911;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_74 = new Class40("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_123 = new Class150(107, 6);

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "[I")
	public static final int[] anIntArray310 = new int[32];

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "[I")
	public static final int[] anIntArray311 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLclient!jk;)V")
	public static void method4137(@OriginalArg(1) Class15_Sub2_Sub1_Sub2 arg0) {
		for (@Pc(15) Class5_Sub19 local15 = (Class5_Sub19) Static479.aClass99_71.method2526(); local15 != null; local15 = (Class5_Sub19) Static479.aClass99_71.method2519()) {
			if (local15.aClass15_Sub2_Sub1_Sub2_1 == arg0) {
				if (local15.aClass5_Sub15_Sub1_2 != null) {
					Static373.aClass5_Sub15_Sub2_1.method4871(local15.aClass5_Sub15_Sub1_2);
					local15.aClass5_Sub15_Sub1_2 = null;
				}
				local15.method7425();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZI)Z")
	public static boolean method4138(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static146.method2755(arg0, arg1) || Static150.method2772(arg0, arg1);
	}
}
