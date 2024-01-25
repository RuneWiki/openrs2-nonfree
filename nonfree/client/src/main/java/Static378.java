import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!ofa", name = "y", descriptor = "Lclient!dca;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!ofa", name = "w", descriptor = "[F")
	public static final float[] aFloatArray46 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIII)I")
	public static int method5644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static97.aByteArrayArrayArray19[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static97.aByteArrayArrayArray19[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)V")
	public static void method5645(@OriginalArg(1) int arg0) {
		Static70.anInt1454 = -1;
		Static470.anInt7923 = arg0;
		Static70.anInt1454 = -1;
		Static575.method7836();
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lclient!oa;ILclient!bd;IIB)V")
	public static void method5646(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class34 local9 = Static279.aClass190_2.method4353(arg2.anInt594);
		if (local9.anInt836 == -1) {
			return;
		}
		if (arg2.aBoolean58) {
			@Pc(22) int local22 = arg1 + arg2.anInt615;
			arg1 = local22 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(38) Class13 local38 = local9.method730(arg1, arg2.aBoolean47, arg0);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg2.anInt612;
		@Pc(47) int local47 = arg2.anInt638;
		if ((arg1 & 0x1) == 1) {
			local47 = arg2.anInt612;
			local44 = arg2.anInt638;
		}
		@Pc(73) int local73 = local38.AA();
		@Pc(76) int local76 = local38.a();
		if (local9.aBoolean71) {
			local76 = local47 * 4;
			local73 = local44 * 4;
		}
		if (local9.anInt839 == 0) {
			local38.method8024(arg4, arg3 - (local47 - 1) * 4, local73, local76);
		} else {
			local38.KA(arg4, arg3 - (local47 - 1) * 4, local73, local76, 0, local9.anInt839 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)Lclient!l;")
	public static Class10_Sub4 method5647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass10_Sub4_2;
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(III)Z")
	public static boolean method5648(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static211.method3680(arg1, arg0) & Static478.method6639(arg1, arg0);
	}
}
