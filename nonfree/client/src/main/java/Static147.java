import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_27 = new Class154(44, -1);

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Lclient!cq;")
	public static final Class63 aClass63_14 = new Class63(0, 2, 2, 1);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!jw;I)I")
	public static int method2015(@OriginalArg(0) Class2_Sub27 arg0) {
		@Pc(7) String local7 = Static491.method6283(arg0);
		@Pc(9) int[] local9 = null;
		if (Static427.method5678(arg0.anInt4323)) {
			local9 = Static466.aClass130_2.method2311((int) arg0.aLong113).anIntArray282;
		} else if (arg0.anInt4325 != -1) {
			local9 = Static466.aClass130_2.method2311(arg0.anInt4325).anIntArray282;
		} else if (Static577.method7485(arg0.anInt4323)) {
			@Pc(32) Class2_Sub5 local32 = (Class2_Sub5) Static436.aClass90_26.method1685((long) arg0.aLong113);
			if (local32 != null) {
				@Pc(37) Class12_Sub2_Sub1_Sub4_Sub2 local37 = local32.aClass12_Sub2_Sub1_Sub4_Sub2_1;
				@Pc(40) Class295 local40 = local37.aClass295_1;
				if (local40.anIntArray493 != null) {
					local40 = local40.method5942(Static426.aClass160_1);
				}
				if (local40 != null) {
					local9 = local40.anIntArray491;
				}
			}
		} else if (Static219.method2681(arg0.anInt4323)) {
			@Pc(80) Class216 local80;
			if (arg0.anInt4323 == 1007) {
				local80 = Static362.aClass290_2.method5799((int) arg0.aLong113);
			} else {
				local80 = Static362.aClass290_2.method5799((int) (arg0.aLong113 >>> 32 & 0x7FFFFFFFL));
			}
			if (local80.anIntArray362 != null) {
				local80 = local80.method4560(Static426.aClass160_1);
			}
			if (local80 != null) {
				local9 = local80.anIntArray364;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static88.method1301(local9);
		}
		@Pc(145) int local145 = Static537.aClass112_11.method2079(Static389.aClass38Array21, local7);
		if (arg0.aBoolean321) {
			local145 += Static380.aClass38_40.E() + 4;
		}
		return local145;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZI)I")
	public static int method2016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (arg1 + local7) / arg0 - local7;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!caa;)V")
	public static void method2022(@OriginalArg(0) Class12_Sub2 arg0) {
		Static337.aClass162_13.MA(arg0.anInt9374, arg0.anInt9373 + (arg0.method7501() >> 1), arg0.anInt9375, Static585.anIntArray614);
		arg0.anInt9378 = Static585.anIntArray614[0];
		arg0.anInt9381 = Static585.anIntArray614[1];
		arg0.anInt9377 = Static585.anIntArray614[2];
	}
}
