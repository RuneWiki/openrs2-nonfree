import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
	public static int anInt6203;

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "Lclient!pt;")
	public static Class3_Sub9_Sub5 aClass3_Sub9_Sub5_1;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public static int anInt6196 = 0;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "Lclient!qn;")
	public static final Class295 aClass295_3 = new Class295("RC", 1);

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
	public static int anInt6204 = -1;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
	public static void method5200() {
		if (Static520.anInt6836 == 7) {
			Static431.method6362(false);
		} else {
			Static565.aClass160_6 = Static673.aClass160_3;
			Static673.aClass160_3 = null;
			Static482.method6863(13);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!od;IIIIIIIIILclient!ha;I)V")
	public static void method5201(@OriginalArg(0) Class3_Sub6_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class16 arg9, @OriginalArg(11) int arg10) {
		if (arg7 > arg5 && arg7 < arg5 + arg1 && arg10 - 13 < arg8 && arg10 + 3 > arg8 && arg0.aBoolean537) {
			arg4 = arg6;
		}
		@Pc(52) int[] local52 = null;
		if (Static315.method4940(arg0.anInt7069)) {
			local52 = Static237.aClass371_2.method8305((int) arg0.aLong202).anIntArray253;
		} else if (arg0.anInt7070 != -1) {
			local52 = Static237.aClass371_2.method8305(arg0.anInt7070).anIntArray253;
		} else if (Static156.method4836(arg0.anInt7069)) {
			@Pc(136) Class3_Sub11 local136 = (Class3_Sub11) Static500.aClass62_40.method1682((long) (int) arg0.aLong202);
			if (local136 != null) {
				@Pc(141) Class23_Sub2_Sub1_Sub2_Sub2 local141 = local136.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				@Pc(144) Class5 local144 = local141.aClass5_1;
				if (local144.anIntArray1 != null) {
					local144 = local144.method56(Static592.aClass47_2);
				}
				if (local144 != null) {
					local52 = local144.anIntArray2;
				}
			}
		} else if (Static340.method5163(arg0.anInt7069)) {
			@Pc(101) Class178 local101;
			if (arg0.anInt7069 == 1007) {
				local101 = Static349.aClass374_2.method8357((int) arg0.aLong202);
			} else {
				local101 = Static349.aClass374_2.method8357((int) (arg0.aLong202 >>> 32 & 0x7FFFFFFFL));
			}
			if (local101.anIntArray313 != null) {
				local101 = local101.method4012(Static592.aClass47_2);
			}
			if (local101 != null) {
				local52 = local101.anIntArray316;
			}
		}
		@Pc(161) String local161 = Static435.method6378(arg0);
		if (local52 != null) {
			local161 = local161 + Static228.method2115(local52);
		}
		Static243.aClass69_5.method7462(arg5 + 3, arg10, Static442.anIntArray463, local161, arg4, Static359.aClass102Array17);
		if (arg0.aBoolean536) {
			Static640.aClass102_39.method6961(Static17.aClass202_1.method4632(local161) + arg5 + 5, arg10 + -12);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)Z")
	public static boolean method5202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static149.method2575(arg0, arg1) | Static308.method4733(arg0, arg1) | Static460.method6620(arg1, arg0)) & Static363.method5414(arg1, arg0);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!fe;")
	public static Class23_Sub2_Sub1 method5203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class85 local14 = local7.aClass85_3; local14 != null; local14 = local14.aClass85_1) {
			@Pc(18) Class23_Sub2_Sub1 local18 = local14.aClass23_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort123 == arg1 && local18.aShort124 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
