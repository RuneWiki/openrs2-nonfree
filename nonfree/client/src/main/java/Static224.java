import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!il", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!js;ILclient!hb;Lclient!qh;IIII)V")
	public static void method3330(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11_Sub1_Sub1_Sub3_Sub1 arg2, @OriginalArg(3) Class11_Sub1_Sub1_Sub3_Sub2 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class1_Sub4 local9 = new Class1_Sub4();
		local9.anInt238 = arg1 << 9;
		local9.anInt225 = arg4 << 9;
		local9.anInt232 = arg6;
		if (arg0 != null) {
			local9.aClass178_1 = arg0;
			@Pc(30) int local30 = arg0.anInt4627;
			@Pc(33) int local33 = arg0.anInt4634;
			if (arg5 == 1 || arg5 == 3) {
				local30 = arg0.anInt4634;
				local33 = arg0.anInt4627;
			}
			local9.anInt241 = arg0.anInt4659;
			local9.anInt224 = local33 + arg4 << 9;
			local9.anInt233 = arg0.anInt4625 << 9;
			local9.anInt240 = arg0.anInt4670;
			local9.anInt230 = arg0.anInt4650;
			local9.aBoolean6 = arg0.aBoolean355;
			local9.anInt239 = arg0.anInt4676;
			local9.aBoolean5 = arg0.aBoolean352;
			local9.anInt229 = arg1 + local30 << 9;
			local9.anInt228 = arg0.anInt4629;
			local9.anIntArray9 = arg0.anIntArray254;
			local9.anInt234 = arg0.anInt4632;
			if (arg0.anIntArray252 != null) {
				local9.aBoolean7 = true;
				local9.method210();
			}
			if (local9.anIntArray9 != null) {
				local9.anInt236 = (int) (Math.random() * (double) (local9.anInt241 - local9.anInt234)) + local9.anInt234;
			}
			Static592.aClass111_65.method2552(local9);
		} else if (arg3 != null) {
			local9.aClass11_Sub1_Sub1_Sub3_Sub2_1 = arg3;
			@Pc(147) Class354 local147 = arg3.aClass354_1;
			if (local147.anIntArray597 != null) {
				local9.aBoolean7 = true;
				local147 = local147.method7683(Static390.aClass353_29);
			}
			if (local147 != null) {
				local9.anInt224 = local147.anInt9418 + arg4 << 9;
				local9.anInt229 = local147.anInt9418 + arg1 << 9;
				local9.anInt230 = Static227.method3387(arg3);
				local9.aBoolean5 = local147.aBoolean699;
				local9.anInt228 = local147.anInt9426;
				local9.anInt233 = local147.anInt9415 << 9;
				local9.anInt239 = local147.anInt9408;
				local9.anInt240 = local147.anInt9397;
			}
			Static452.aClass111_52.method2552(local9);
		} else if (arg2 != null) {
			local9.aClass11_Sub1_Sub1_Sub3_Sub1_1 = arg2;
			local9.anInt229 = arg1 + arg2.method6058() << 9;
			local9.anInt224 = arg2.method6058() + arg4 << 9;
			local9.anInt230 = Static126.method2238(arg2);
			local9.aBoolean5 = arg2.aBoolean260;
			local9.anInt233 = arg2.anInt3593 << 9;
			local9.anInt240 = 256;
			local9.anInt228 = arg2.anInt3588;
			local9.anInt239 = 256;
			Static60.aClass91_3.method2269((long) arg2.anInt7524, local9);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)Z")
	public static boolean method3332(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
