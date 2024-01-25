import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
	public static int anInt6306;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "[Lclient!od;")
	public static Class151[] aClass151Array2;

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString303 = "Select";

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIILclient!fp;)V")
	public static void method5753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class44_Sub2 arg4) {
		arg4.anInt2897 = (arg1 << 7) + 64;
		arg4.anInt2905 = arg3;
		arg4.anInt2900 = (arg2 << 7) + 64;
		@Pc(24) Class187 local24 = Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class214 local31 = local24.aClass214_19; local31 != null; local31 = local31.aClass214_21) {
				if (local31.aClass44_Sub4_1.aBoolean423) {
					@Pc(41) int local41 = local31.aClass44_Sub4_1.method5784();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt2905 += local28;
				arg4.aBoolean225 = true;
			}
		}
		if (Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static101.method2079(arg0, arg1, arg2);
		}
		Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2].aClass44_Sub2_1 = arg4;
	}
}
