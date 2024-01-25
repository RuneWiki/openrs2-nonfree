import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "[I")
	public static int[] anIntArray138;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString25 = "";

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIBILjava/lang/String;Lclient!ha;II)V")
	public static void method2399(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) Class143 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static430.aClass59_32 == null || Static145.aClass59_4 == null) {
			if (Static471.aClass50_136.method897(Static241.anInt3913) && Static471.aClass50_136.method897(Static50.anInt773)) {
				Static430.aClass59_32 = arg3.method6247(Static684.method7228(Static471.aClass50_136, Static241.anInt3913, 0), true);
				@Pc(53) Class301 local53 = Static684.method7228(Static471.aClass50_136, Static50.anInt773, 0);
				Static145.aClass59_4 = arg3.method6247(local53, true);
				local53.method7233();
				Static113.aClass59_3 = arg3.method6247(local53, true);
			} else {
				arg3.aa(arg5, arg0, arg4, 20, Static27.anInt372 | 255 - Static406.anInt6995 << 24, 1);
			}
		}
		if (Static430.aClass59_32 != null && Static145.aClass59_4 != null) {
			@Pc(79) int local79 = (arg4 - Static145.aClass59_4.method8049() * 2) / Static430.aClass59_32.method8049();
			for (@Pc(81) int local81 = 0; local81 < local79; local81++) {
				Static430.aClass59_32.method8057(arg5 + Static145.aClass59_4.method8049() + local81 * Static430.aClass59_32.method8049(), arg0);
			}
			Static145.aClass59_4.method8057(arg5, arg0);
			Static113.aClass59_3.method8057(arg4 + arg5 - Static113.aClass59_3.method8049(), arg0);
		}
		Static32.aClass72_2.method6925(arg0 + 14, arg2, arg5 + 3, -1, -16777216 | Static229.anInt3713);
		arg3.aa(arg5, arg0 + 20, arg4, arg1 - 20, Static27.anInt372 | -Static406.anInt6995 + 255 << 24, 1);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method2400(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(15) byte[] local15 = new byte[32768];
		Static685.method8328(arg1, arg0, local15, 0, 32768);
		return local15;
	}
}
