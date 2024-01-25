import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public static int anInt5613;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!wf;")
	public static final Class1_Sub21_Sub2 aClass1_Sub21_Sub2_2 = new Class1_Sub21_Sub2(5000);

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Lclient!gq;")
	public static final Class88 aClass88_9 = new Class88(16);

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_29 = new Class14();

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
	public static final int[] anIntArray547 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
	public static int method4903() {
		return Static174.anInt5783;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Z")
	public static boolean method4904(@OriginalArg(1) int arg0) {
		if (Static168.aBooleanArray17[arg0]) {
			return true;
		} else if (Static237.aClass134_112.method3003(arg0)) {
			@Pc(31) int local31 = Static237.aClass134_112.method3020(arg0);
			if (local31 == 0) {
				Static168.aBooleanArray17[arg0] = true;
				return true;
			}
			if (Static313.aClass163ArrayArray1[arg0] == null) {
				Static313.aClass163ArrayArray1[arg0] = new Class163[local31];
			}
			for (@Pc(50) int local50 = 0; local50 < local31; local50++) {
				if (Static313.aClass163ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static237.aClass134_112.method3009(local50, arg0);
					if (local64 != null) {
						@Pc(76) Class163 local76 = Static313.aClass163ArrayArray1[arg0][local50] = new Class163();
						local76.anInt4947 = (arg0 << 16) + local50;
						if (local64[0] == -1) {
							local76.method4332(new Class1_Sub21(local64));
						} else {
							local76.method4346(new Class1_Sub21(local64));
						}
					}
				}
			}
			Static168.aBooleanArray17[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
