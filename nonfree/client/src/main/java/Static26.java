import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(B)[I")
	public static int[] method394() {
		return new int[] { Static50.anInt900, Static157.anInt3080, Static255.anInt6560 };
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ZB)V")
	public static void method395(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		@Pc(14) Class5_Sub41 local14 = Static338.method5082();
		local14.aClass5_Sub36_Sub2_1.method7324(Static115.aClass157_6.anInt3847);
		local14.aClass5_Sub36_Sub2_1.method7296(0);
		@Pc(29) int local29 = local14.aClass5_Sub36_Sub2_1.anInt8456;
		local14.aClass5_Sub36_Sub2_1.method7296(656);
		@Pc(38) int[] local38 = Static194.method8973(52, local14);
		@Pc(42) int local42 = local14.aClass5_Sub36_Sub2_1.anInt8456;
		local14.aClass5_Sub36_Sub2_1.method7327(arg2);
		local14.aClass5_Sub36_Sub2_1.method7296(Static653.anInt10666);
		local14.aClass5_Sub36_Sub2_1.method7327(arg1);
		local14.aClass5_Sub36_Sub2_1.method7329(Static218.aLong113);
		local14.aClass5_Sub36_Sub2_1.method7324(Static375.anInt7800);
		local14.aClass5_Sub36_Sub2_1.method7324(Static536.aClass290_6.anInt7535);
		Static368.method5498(local14.aClass5_Sub36_Sub2_1);
		@Pc(79) String local79 = Static83.aString12;
		local14.aClass5_Sub36_Sub2_1.method7324(local79 == null ? 0 : 1);
		if (local79 != null) {
			local14.aClass5_Sub36_Sub2_1.method7327(local79);
		}
		local14.aClass5_Sub36_Sub2_1.method7324(arg0);
		local14.aClass5_Sub36_Sub2_1.method7324(arg3 ? 1 : 0);
		local14.aClass5_Sub36_Sub2_1.anInt8456 += 7;
		local14.aClass5_Sub36_Sub2_1.method7325(local38, local42, local14.aClass5_Sub36_Sub2_1.anInt8456);
		local14.aClass5_Sub36_Sub2_1.method7308(local14.aClass5_Sub36_Sub2_1.anInt8456 - local29);
		Static4.aClass389_16.method9079(local14);
		Static447.anInt7320 = -3;
		Static78.anInt1382 = 1;
		Static405.anInt10910 = 0;
		Static659.anInt10733 = 0;
		if (arg0 < 13) {
			Static525.aBoolean555 = true;
			Static147.method2741();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!d;IILclient!ha;I)V")
	public static void method396(@OriginalArg(1) int arg0, @OriginalArg(2) Interface7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class100 arg4, @OriginalArg(6) int arg5) {
		if (Static455.anInt7370 < 100) {
			Static61.method1060(arg4, arg1);
		}
		arg4.KA(arg3, arg5, arg2 + arg3, arg5 + arg0);
		@Pc(33) int local33;
		@Pc(44) int local44;
		if (Static455.anInt7370 < 100) {
			local33 = arg2 / 2 + arg3;
			local44 = arg0 / 2 + arg5 - 18 - 20;
			arg4.aa(arg3, arg5, arg2, arg0, -16777216, 0);
			arg4.method8607(local33 - 152, local44, 304, 34, Static153.aColorArray6[Static681.anInt10911].getRGB(), 0);
			arg4.aa(local33 - 150, local44 + 2, Static455.anInt7370 * 3, 30, Static78.aColorArray4[Static681.anInt10911].getRGB(), 0);
			Static196.aClass70_3.method8434(local44 + 20, -1, local33, Static475.aColorArray14[Static681.anInt10911].getRGB(), Static184.aClass131_19.method3168(Static375.anInt7800));
			return;
		}
		@Pc(108) int local108 = Static124.anInt2052 - (int) ((float) arg2 / Static491.aFloat23);
		local33 = Static381.anInt6410 + (int) ((float) arg0 / Static491.aFloat23);
		local44 = (int) ((float) arg2 / Static491.aFloat23) + Static124.anInt2052;
		@Pc(134) int local134 = Static381.anInt6410 - (int) ((float) arg0 / Static491.aFloat23);
		Static98.anInt1632 = (int) ((float) (arg0 * 2) / Static491.aFloat23);
		Static455.anInt7375 = Static124.anInt2052 - (int) ((float) arg2 / Static491.aFloat23);
		Static181.anInt3402 = (int) ((float) (arg2 * 2) / Static491.aFloat23);
		Static137.anInt2730 = Static381.anInt6410 - (int) ((float) arg0 / Static491.aFloat23);
		Static491.method675(local108 + Static491.anInt622, Static491.anInt617 + local33, local44 + Static491.anInt622, local134 + Static491.anInt617, arg3, arg5, arg3 + arg2, arg0 + (arg5 - -1));
		Static491.method658(arg4);
		@Pc(196) Class20 local196 = Static491.method660(arg4);
		Static322.method4929(local196, arg4);
		if (Static396.anInt6671 > 0) {
			Static81.anInt1432--;
			if (Static81.anInt1432 == 0) {
				Static81.anInt1432 = 20;
				Static396.anInt6671--;
			}
		}
		if (!Static480.aBoolean521) {
			return;
		}
		@Pc(234) int local234 = arg2 + arg3 - 5;
		@Pc(240) int local240 = arg5 + arg0 - 8;
		Static414.aClass70_6.method8428("Fps:" + Static69.anInt1172, 16776960, local240, -1, local234);
		@Pc(257) int local257 = local240 - 15;
		@Pc(259) Runtime local259 = Runtime.getRuntime();
		@Pc(269) int local269 = (int) ((local259.totalMemory() - local259.freeMemory()) / 1024L);
		@Pc(271) int local271 = 16776960;
		if (local269 > 65536) {
			local271 = 16711680;
		}
		Static414.aClass70_6.method8428("Mem:" + local269 + "k", local271, local257, -1, local234);
		local240 = local257 - 15;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public static void method398() {
		Static492.aClass306_35.method6936();
	}
}
