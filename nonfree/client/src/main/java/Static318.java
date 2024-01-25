import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Lclient!nq;")
	public static Class144 aClass144_101;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
	public static int anInt6175 = 0;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	public static int anInt6177 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IC)Z")
	public static boolean method5286(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIIIZ)V")
	public static void method5287(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static243.method5705(arg1, 0, Static165.aClass157_Sub1Array5.length - 1, arg0, arg2, arg3);
		Static170.aClass11_Sub34_1 = null;
		Static246.anInt4940 = 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)V")
	public static void method5288(@OriginalArg(1) int arg0) {
		@Pc(8) Class11_Sub4_Sub12 local8 = Static35.method512(12, arg0);
		local8.method3864();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!oo;I)V")
	public static void method5289(@OriginalArg(0) int arg0, @OriginalArg(1) Class67_Sub3_Sub3 arg1) {
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		if (Static293.anInt5807 < arg1.anInt5037) {
			Static10.method168(arg1);
		} else if (arg1.anInt5014 < Static293.anInt5807) {
			Static278.method5402(false, arg1);
			local13 = Static191.anInt6243;
			local11 = Static166.anInt3311;
		} else {
			Static176.method2847(arg1);
		}
		if (arg1.anInt6308 < 128 || arg1.anInt6310 < 128 || arg1.anInt6308 >= Static24.anInt454 * 128 - 128 || arg1.anInt6310 >= Static240.anInt4832 * 128 - 128) {
			arg1.anInt5037 = 0;
			arg1.anInt5014 = 0;
			arg1.anInt5013 = -1;
			arg1.anInt5043 = -1;
			arg1.anInt6308 = arg1.anIntArray391[0] * 128 + arg1.method4368() * 64;
			arg1.anInt6310 = arg1.anIntArray392[0] * 128 + arg1.method4368() * 64;
			arg1.method4382();
		}
		if (Static156.aClass67_Sub3_Sub3_Sub2_2 == arg1 && (arg1.anInt6308 < 1536 || arg1.anInt6310 < 1536 || arg1.anInt6308 >= (Static24.anInt454 - 12) * 128 || arg1.anInt6310 >= Static240.anInt4832 * 128 - 1536)) {
			arg1.anInt5013 = -1;
			arg1.anInt5037 = 0;
			arg1.anInt5043 = -1;
			arg1.anInt5014 = 0;
			arg1.anInt6308 = arg1.anIntArray391[0] * 128 + arg1.method4368() * 64;
			arg1.anInt6310 = arg1.anIntArray392[0] * 128 + arg1.method4368() * 64;
			arg1.method4382();
		}
		@Pc(198) int local198 = Static59.method898(arg1);
		Static330.method5436(local13, arg1, local11, local198);
		Static348.method5638(arg1);
	}
}
