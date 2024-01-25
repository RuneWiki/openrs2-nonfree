import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "Lclient!ig;")
	public static Class12 aClass12_17;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "Lclient!uu;")
	public static Class249 aClass249_7;

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
	public static int anInt5884 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBII)V")
	public static void method4947(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(11) int local11 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		Static367.aFloat104 = local15;
		Static397.aFloat99 = local11;
		if (Static9.anInt164 == 2) {
			Static303.anInt4990 = local15;
			Static217.anInt3768 = local11;
			Static189.anInt6581 = 0;
		}
		Static167.method2725();
		Static165.aBoolean204 = true;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BIILclient!oq;)Lclient!wt;")
	public static Class6_Sub1_Sub18 method4949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class193 arg2) {
		@Pc(10) int local10 = arg0 << 8 | arg2.anInt4907;
		@Pc(19) Class6_Sub1_Sub18 local19 = (Class6_Sub1_Sub18) Static53.aClass149_1.method3402((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static313.aClass158_69.method3691(Static313.aClass158_69.method3701(local10));
		if (local31 == null) {
			local10 = arg1 + 65536 << 8 | arg2.anInt4907;
			local19 = (Class6_Sub1_Sub18) Static53.aClass149_1.method3402((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static313.aClass158_69.method3691(Static313.aClass158_69.method3701(local10));
			if (local31 == null) {
				local10 = arg2.anInt4907 | 0xFFFF00;
				local19 = (Class6_Sub1_Sub18) Static53.aClass149_1.method3402((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static313.aClass158_69.method3691(Static313.aClass158_69.method3701(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static229.method3475(local31);
					local19.aClass193_9 = arg2;
					Static53.aClass149_1.method3404((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static229.method3475(local31);
				local19.aClass193_9 = arg2;
				Static53.aClass149_1.method3404((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static229.method3475(local31);
			local19.aClass193_9 = arg2;
			Static53.aClass149_1.method3404((long) local10 << 16, local19);
			return local19;
		}
	}
}
