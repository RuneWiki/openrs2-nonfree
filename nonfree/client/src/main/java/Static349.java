import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "[I")
	public static final int[] anIntArray747 = new int[13];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!bn;I)I")
	public static int method5338(@OriginalArg(0) Class2_Sub7 arg0) {
		@Pc(7) String local7 = Static58.method4853(arg0);
		@Pc(17) int[] local17 = null;
		if (Static79.method1414(arg0.anInt541)) {
			local17 = Static106.aClass250_1.method5735((int) arg0.aLong22).anIntArray326;
		} else if (arg0.anInt546 != -1) {
			local17 = Static106.aClass250_1.method5735(arg0.anInt546).anIntArray326;
		} else if (Static27.method683(arg0.anInt541)) {
			@Pc(47) Class12_Sub1_Sub2_Sub1 local47 = Static107.aClass12_Sub1_Sub2_Sub1Array1[(int) arg0.aLong22];
			if (local47 != null) {
				@Pc(52) Class240 local52 = local47.aClass240_1;
				if (local52.anIntArray781 != null) {
					local52 = local52.method5567(Static248.aClass125_1);
				}
				if (local52 != null) {
					local17 = local52.anIntArray783;
				}
			}
		} else if (Static173.method2826(arg0.anInt541)) {
			@Pc(84) Class34 local84;
			if (arg0.anInt541 == 1007) {
				local84 = Static11.aClass123_5.method2703((int) arg0.aLong22);
			} else {
				local84 = Static11.aClass123_5.method2703((int) (arg0.aLong22 >>> 32 & 0x7FFFFFFFL));
			}
			if (local84.anIntArray122 != null) {
				local84 = local84.method831(Static248.aClass125_1);
			}
			if (local84 != null) {
				local17 = local84.anIntArray120;
			}
		}
		if (local17 != null) {
			local7 = local7 + Static254.method4014(local17);
		}
		@Pc(136) int local136 = Static60.aClass216_3.method5075(Static52.aClass5Array11, local7);
		if (arg0.aBoolean38) {
			local136 += Static372.aClass5_16.method5002() + 4;
		}
		return local136;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public static void method5340(@OriginalArg(0) int arg0) {
		Static191.anInt3366 = arg0;
		Static35.aClass154_2.method3748();
	}
}
