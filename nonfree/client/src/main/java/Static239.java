import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!iaa", name = "Kd", descriptor = "Lclient!lc;")
	public static Class207 aClass207_2;

	@OriginalMember(owner = "client!iaa", name = "Sd", descriptor = "I")
	public static int anInt3959 = 0;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IILclient!oba;ILclient!ka;I)V")
	public static void method3529(@OriginalArg(1) int arg0, @OriginalArg(2) Class261 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			arg1.method5888(arg2, arg3.fa(), arg3.na(), arg3.RA(), arg0, arg3.EA(), arg3.HA(), arg3.G(), arg4, arg3.V());
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIILclient!ha;IILclient!qh;IBIII)V")
	public static void method3539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class33 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub5_Sub17 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg9 < arg0 && arg7 + arg9 > arg0 && arg8 - 13 < arg2 && arg2 < arg8 + 3 && arg6.aBoolean599) {
			arg4 = arg10;
		}
		@Pc(40) int[] local40 = null;
		if (Static566.method7494(arg6.anInt7673)) {
			local40 = Static532.aClass255_2.method5210((int) arg6.aLong226).anIntArray199;
		} else if (arg6.anInt7675 != -1) {
			local40 = Static532.aClass255_2.method5210(arg6.anInt7675).anIntArray199;
		} else if (Static98.method1982(arg6.anInt7673)) {
			@Pc(71) Class4_Sub45 local71 = (Class4_Sub45) Static597.aClass66_41.method1994((long) (int) arg6.aLong226);
			if (local71 != null) {
				@Pc(76) Class3_Sub1_Sub2_Sub2_Sub2 local76 = local71.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				@Pc(79) Class345 local79 = local76.aClass345_1;
				if (local79.anIntArray624 != null) {
					local79 = local79.method7529(Static526.aClass293_1);
				}
				if (local79 != null) {
					local40 = local79.anIntArray626;
				}
			}
		} else if (Static193.method3007(arg6.anInt7673)) {
			@Pc(111) Class342 local111;
			if (arg6.anInt7673 == 1011) {
				local111 = Static441.aClass74_169.method2075((int) arg6.aLong226);
			} else {
				local111 = Static441.aClass74_169.method2075((int) (arg6.aLong226 >>> 32 & 0x7FFFFFFFL));
			}
			if (local111.anIntArray620 != null) {
				local111 = local111.method7495(Static526.aClass293_1);
			}
			if (local111 != null) {
				local40 = local111.anIntArray619;
			}
		}
		@Pc(149) String local149 = Static624.method8379(arg6);
		if (local40 != null) {
			local149 = local149 + Static314.method4357(local40);
		}
		Static344.aClass56_10.method8053(Static128.aClass17Array3, arg8, arg9 + 3, Static2.anIntArray1, arg4, local149);
		if (arg6.aBoolean601) {
			Static93.aClass17_14.method5246(arg9 + Static641.aClass31_10.method1024(local149) + 5, arg8 + -12);
		}
	}
}
