import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "Lclient!oa;")
	public static Class15 aClass15_16;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZIIII)V")
	public static void method7996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static455.aClass3_Sub27_Sub1_1.anInt4799 != 0 && arg2 != 0 && Static228.anInt4641 < 50 && arg1 != -1) {
			Static200.aClass64Array1[Static228.anInt4641++] = new Class64((byte) 1, arg1, arg2, arg3, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!oa;IIIIII)Lclient!ba;")
	public static Class21 method7998(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = (long) arg2;
		@Pc(17) Class21 local17 = (Class21) Static562.aClass211_63.method5534(local11);
		if (local17 == null) {
			@Pc(27) Class96 local27 = Static374.method6085(arg2, Static159.aClass254_51);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt3175 < 13) {
				local27.method2775();
			}
			local17 = arg0.method5352(local27, 2055, Static553.anInt9932, 64, 768);
			Static562.aClass211_63.method5529(local11, local17);
		}
		local17 = local17.method7131((byte) 2, 2055, true);
		if (arg4 != 0) {
			local17.I(arg4);
		}
		if (arg5 != 0) {
			local17.AA(arg5);
		}
		if (arg1 != 0) {
			local17.v(arg1);
		}
		if (arg3 != 0) {
			local17.m(0, arg3, 0);
		}
		return local17;
	}
}
