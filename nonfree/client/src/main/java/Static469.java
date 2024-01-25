import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!vea;IIILclient!ha;IIBIII)V")
	public static void method6666(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7_Sub21 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class13 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg3 > arg7 && arg7 + arg9 > arg3 && arg8 - 13 < arg6 && arg8 + 3 > arg6 && arg1.aBoolean722) {
			arg2 = arg10;
		}
		@Pc(41) int[] local41 = null;
		if (Static572.method7950(arg1.anInt10014)) {
			local41 = Static470.aClass250_1.method5960((int) arg1.aLong262).anIntArray650;
		} else if (arg1.anInt10012 != -1) {
			local41 = Static470.aClass250_1.method5960(arg1.anInt10012).anIntArray650;
		} else if (Static303.method4765(arg1.anInt10014)) {
			@Pc(68) Class2_Sub32 local68 = (Class2_Sub32) Static514.aClass323_32.method7484((long) (int) arg1.aLong262);
			if (local68 != null) {
				@Pc(73) Class16_Sub1_Sub1_Sub3_Sub1 local73 = local68.aClass16_Sub1_Sub1_Sub3_Sub1_2;
				@Pc(76) Class113 local76 = local73.aClass113_1;
				if (local76.anIntArray213 != null) {
					local76 = local76.method2752(Static382.aClass282_1);
				}
				if (local76 != null) {
					local41 = local76.anIntArray211;
				}
			}
		} else if (Static342.method5178(arg1.anInt10014)) {
			@Pc(114) Class5 local114;
			if (arg1.anInt10014 == 1003) {
				local114 = Static79.aClass304_2.method6956((int) arg1.aLong262);
			} else {
				local114 = Static79.aClass304_2.method6956((int) (arg1.aLong262 >>> 32 & 0x7FFFFFFFL));
			}
			if (local114.anIntArray9 != null) {
				local114 = local114.method77(Static382.aClass282_1);
			}
			if (local114 != null) {
				local41 = local114.anIntArray10;
			}
		}
		@Pc(156) String local156 = Static519.method7225(arg1);
		if (local41 != null) {
			local156 = local156 + Static416.method6094(local41);
		}
		Static544.aClass37_8.method6074(arg8, arg7 + 3, arg2, Static629.anIntArray726, local156, Static402.aClass31Array11);
		if (arg1.aBoolean723) {
			Static457.aClass31_35.method8793(arg7 + Static551.aClass183_13.method4453(local156) + 5, arg8 + -12);
		}
	}
}
