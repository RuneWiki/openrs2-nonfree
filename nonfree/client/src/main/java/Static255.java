import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ot", name = "Y", descriptor = "I")
	public static int anInt4901;

	@OriginalMember(owner = "client!ot", name = "U", descriptor = "Lclient!lc;")
	public static final Class136 aClass136_8 = new Class136("", 12);

	@OriginalMember(owner = "client!ot", name = "W", descriptor = "Z")
	public static boolean aBoolean361 = false;

	@OriginalMember(owner = "client!ot", name = "X", descriptor = "Lclient!ci;")
	public static final Class38 aClass38_3 = new Class38("runescape", 0);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!vt;)V")
	public static void method4404(@OriginalArg(1) Class2_Sub24 arg0) {
		if (arg0.aByteArray100.length - arg0.anInt6669 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method5732();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray100.length - arg0.anInt6669 < 2) {
			return;
		}
		@Pc(44) int local44 = arg0.method5753();
		if (local44 * 6 != arg0.aByteArray100.length - arg0.anInt6669) {
			return;
		}
		while (true) {
			@Pc(60) int local60;
			@Pc(64) int local64;
			do {
				do {
					do {
						if (arg0.aByteArray100.length <= arg0.anInt6669) {
							return;
						}
						local60 = arg0.method5753();
						local64 = arg0.method5776();
					} while (local60 >= Static318.anIntArray509.length);
				} while (!Static137.aBooleanArray7[local60]);
			} while (Static230.aClass71_1.method1558(local60).aChar5 == '1' && (local64 < -1 || local64 > 1));
			Static318.anIntArray509[local60] = local64;
		}
	}
}
