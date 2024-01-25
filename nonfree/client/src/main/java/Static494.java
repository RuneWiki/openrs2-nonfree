import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!pla", name = "k", descriptor = "Lclient!cc;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(Lclient!ej;B)I")
	public static int method7145(@OriginalArg(0) Class3_Sub4_Sub5 arg0) {
		@Pc(7) String local7 = Static83.method1070(arg0);
		@Pc(9) int[] local9 = null;
		if (Static292.method4412(arg0.anInt2775)) {
			local9 = Static243.aClass406_2.method9394((int) arg0.aLong105).anIntArray130;
		} else if (arg0.anInt2773 != -1) {
			local9 = Static243.aClass406_2.method9394(arg0.anInt2773).anIntArray130;
		} else if (Static290.method4406(arg0.anInt2775)) {
			@Pc(81) Class3_Sub13 local81 = (Class3_Sub13) Static612.aClass136_44.method3503((long) (int) arg0.aLong105);
			if (local81 != null) {
				@Pc(86) Class19_Sub1_Sub3_Sub2_Sub1 local86 = local81.aClass19_Sub1_Sub3_Sub2_Sub1_2;
				@Pc(89) Class18 local89 = local86.aClass18_1;
				if (local89.anIntArray23 != null) {
					local89 = local89.method407(Static577.aClass362_1);
				}
				if (local89 != null) {
					local9 = local89.anIntArray20;
				}
			}
		} else if (Static664.method8850(arg0.anInt2775)) {
			@Pc(58) Class144 local58 = Static70.aClass323_1.method7792((int) (arg0.aLong105 >>> 32 & 0x7FFFFFFFL));
			if (local58.anIntArray239 != null) {
				local58 = local58.method3629(Static577.aClass362_1);
			}
			if (local58 != null) {
				local9 = local58.anIntArray238;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static146.method2414(local9);
		}
		@Pc(129) int local129 = Static381.aClass330_7.method7905(Static432.aClass9Array28, local7);
		if (arg0.aBoolean229) {
			local129 += Static555.aClass9_30.method8602() + 4;
		}
		return local129;
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(IILclient!d;ILjava/awt/Canvas;Lclient!lb;)Lclient!ha;")
	public static Class67 method7146(@OriginalArg(1) int arg0, @OriginalArg(2) Interface2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Class221 arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg3 != null) {
			@Pc(12) Dimension local12 = arg3.getSize();
			local7 = local12.height;
			local5 = local12.width;
		}
		return Static228.method7644(local7, arg0, arg4, arg1, local5, arg3, arg2);
	}
}
