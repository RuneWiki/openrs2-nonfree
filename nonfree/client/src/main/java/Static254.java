import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!si", name = "fb", descriptor = "[[[Lclient!jj;")
	public static Class1_Sub16[][][] aClass1_Sub16ArrayArrayArray3;

	@OriginalMember(owner = "client!si", name = "wc", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31;

	@OriginalMember(owner = "client!si", name = "yd", descriptor = "I")
	public static int anInt4750;

	@OriginalMember(owner = "client!si", name = "nb", descriptor = "[I")
	public static int[] anIntArray530 = new int[4096];

	@OriginalMember(owner = "client!si", name = "ob", descriptor = "I")
	public static int anInt4691 = 2;

	@OriginalMember(owner = "client!si", name = "Bc", descriptor = "[I")
	public static int[] anIntArray536 = new int[128];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BIIIIIIILclient!s;)V")
	public static void method3972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class150 arg7) {
		@Pc(5) int local5 = arg6 & 0x3;
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (local5 == 1 || local5 == 3) {
			local23 = arg7.anInt4562;
			local20 = arg7.anInt4532;
		} else {
			local20 = arg7.anInt4562;
			local23 = arg7.anInt4532;
		}
		@Pc(44) int local44;
		@Pc(42) int local42;
		if (local23 + arg4 > 104) {
			local42 = arg4 + 1;
			local44 = arg4;
		} else {
			local44 = (local23 >> 1) + arg4;
			local42 = arg4 + (local23 + 1 >> 1);
		}
		@Pc(82) int local82;
		@Pc(75) int local75;
		if (local20 + arg0 <= 104) {
			local75 = (local20 + 1 >> 1) + arg0;
			local82 = arg0 + (local20 >> 1);
		} else {
			local82 = arg0;
			local75 = arg0 + 1;
		}
		@Pc(98) int local98 = (local23 << 6) + (arg4 << 7);
		@Pc(107) int local107 = (arg0 << 7) + (local20 << 6);
		@Pc(109) int local109 = 0;
		@Pc(113) int[][] local113 = Static280.anIntArrayArrayArray13[arg3];
		@Pc(140) int local140 = local113[local42][local82] + local113[local44][local82] + local113[local44][local75] + local113[local42][local75] >> 2;
		@Pc(155) int[][] local155;
		if (arg3 != 0) {
			local155 = Static280.anIntArrayArrayArray13[0];
			local109 = local140 - (local155[local44][local82] + local155[local42][local82] + local155[local44][local75] + local155[local42][local75] >> 2);
		}
		local155 = null;
		if (arg3 < 3) {
			local155 = Static280.anIntArrayArrayArray13[arg3 + 1];
		}
		@Pc(216) Class88 local216 = arg7.method3892(local98, false, local140, arg6, true, null, arg2, local107, local113, local155);
		Static15.method215(local216.aClass57_Sub1_24, local98 - arg5, local109, local107 - arg1);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(Z)V")
	public static void method3979() {
		Static242.aClass175_36.method4287();
		Static83.aClass175_11.method4287();
	}
}
