import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIIILclient!ha;IILclient!ej;I)V")
	public static void method8147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class67 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class3_Sub4_Sub5 arg9, @OriginalArg(11) int arg10) {
		if (arg10 < arg5 && arg5 < arg10 + arg4 && arg3 > arg1 - 13 && arg3 < arg1 + 3 && arg9.aBoolean227) {
			arg6 = arg0;
		}
		@Pc(40) int[] local40 = null;
		if (Static292.method4412(arg9.anInt2775)) {
			local40 = Static243.aClass406_2.method9394((int) arg9.aLong105).anIntArray130;
		} else if (arg9.anInt2773 != -1) {
			local40 = Static243.aClass406_2.method9394(arg9.anInt2773).anIntArray130;
		} else if (Static290.method4406(arg9.anInt2775)) {
			@Pc(102) Class3_Sub13 local102 = (Class3_Sub13) Static612.aClass136_44.method3503((long) (int) arg9.aLong105);
			if (local102 != null) {
				@Pc(107) Class19_Sub1_Sub3_Sub2_Sub1 local107 = local102.aClass19_Sub1_Sub3_Sub2_Sub1_2;
				@Pc(110) Class18 local110 = local107.aClass18_1;
				if (local110.anIntArray23 != null) {
					local110 = local110.method407(Static577.aClass362_1);
				}
				if (local110 != null) {
					local40 = local110.anIntArray20;
				}
			}
		} else if (Static664.method8850(arg9.anInt2775)) {
			@Pc(79) Class144 local79 = Static70.aClass323_1.method7792((int) (arg9.aLong105 >>> 32 & 0x7FFFFFFFL));
			if (local79.anIntArray239 != null) {
				local79 = local79.method3629(Static577.aClass362_1);
			}
			if (local79 != null) {
				local40 = local79.anIntArray238;
			}
		}
		@Pc(162) String local162 = Static83.method1070(arg9);
		if (local40 != null) {
			local162 = local162 + Static146.method2414(local40);
		}
		Static427.aClass44_34.method8116(local162, arg10 + 3, arg1, Static432.aClass9Array28, Static28.anIntArray18, arg6);
		if (arg9.aBoolean229) {
			Static555.aClass9_30.method8617(Static381.aClass330_7.method7911(110, local162) + arg10 + 5, arg1 + -12);
		}
	}
}
