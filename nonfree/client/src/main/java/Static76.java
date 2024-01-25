import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!db", name = "u", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public static int anInt1814;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	public static int anInt1815 = -1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1744(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub17 local8 = new Class1_Sub17(arg0);
		@Pc(17) int local17 = local8.method4487();
		@Pc(21) int local21 = local8.method4481();
		if (local21 < 0 || Static148.anInt2938 != 0 && local21 > Static148.anInt2938) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(44) byte[] local44 = new byte[local21];
			local8.method4505(local44, local21);
			return local44;
		} else {
			@Pc(56) int local56 = local8.method4481();
			if (local56 < 0 || Static148.anInt2938 != 0 && Static148.anInt2938 < local56) {
				throw new RuntimeException();
			}
			@Pc(70) byte[] local70 = new byte[local56];
			if (local17 == 1) {
				Static196.method3736(local70, local56, arg0, local21);
			} else {
				@Pc(86) Class71 local86 = Static516.aClass71_1;
				synchronized (Static516.aClass71_1) {
					Static516.aClass71_1.method1929(local8, local70);
				}
			}
			return local70;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBI)V")
	public static void method1747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static259.aClass1_Sub17_Sub2_1.anInt4872 = 0;
		Static259.aClass1_Sub17_Sub2_1.method4451(Static10.aClass39_7.anInt1272);
		Static259.aClass1_Sub17_Sub2_1.method4451(arg0);
		Static259.aClass1_Sub17_Sub2_1.method4451(arg2);
		Static259.aClass1_Sub17_Sub2_1.method4473(arg3);
		Static259.aClass1_Sub17_Sub2_1.method4473(arg1);
		Static245.anInt4713 = 0;
		Static186.anInt3864 = 1;
		Static121.anInt2497 = -3;
		Static219.anInt4315 = 0;
	}
}
