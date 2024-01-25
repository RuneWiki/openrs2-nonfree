import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
	public static int anInt3763;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_43 = new Class109(64);

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "[I")
	public static int[] anIntArray372 = new int[2];

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
	public static int anInt3764 = 2;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
	public static void method3394() {
		Static125.aClass5_Sub12_Sub2_3.method5125(227);
		Static125.aClass5_Sub12_Sub2_3.method5084(Static215.anInt4249);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZII)I")
	public static int method3395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(25) int local25 = ((arg1 & 0xFF00FF) * local7 & 0xFF00FF00 | local7 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(29) int local29 = 255 - local7;
		return local25 + ((local29 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local29 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILclient!jk;Lclient!jk;)V")
	public static void method3397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub3 arg3, @OriginalArg(4) Class4_Sub3 arg4) {
		if (Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static1.method3(arg0, arg1, arg2);
		}
		Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2].aClass4_Sub3_2 = arg3;
		Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2].aClass4_Sub3_1 = arg4;
	}
}
