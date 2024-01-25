import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!or", name = "D", descriptor = "[Lclient!ts;")
	public static Class46_Sub7[] aClass46_Sub7Array1;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_331 = new Class305(23, 12);

	@OriginalMember(owner = "client!or", name = "C", descriptor = "Lclient!bk;")
	public static final Class31 aClass31_5 = new Class31();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
	public static void method5829(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static263.aClass64ArrayArrayArray3 = Static15.aClass64ArrayArrayArray1;
			Static296.aClass7Array11 = Static207.aClass7Array7;
		} else {
			Static263.aClass64ArrayArrayArray3 = Static61.aClass64ArrayArrayArray2;
			Static296.aClass7Array11 = Static411.aClass7Array12;
		}
		Static63.anInt1587 = Static263.aClass64ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I[[[Lclient!dg;)V")
	public static void method5832(@OriginalArg(1) Class64[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class64[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class64 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass20_Sub5_1 instanceof Interface7) {
							((Interface7) local23.aClass20_Sub5_1).method8050();
						}
						if (local23.aClass20_Sub4_2 instanceof Interface7) {
							((Interface7) local23.aClass20_Sub4_2).method8050();
						}
						if (local23.aClass20_Sub4_1 instanceof Interface7) {
							((Interface7) local23.aClass20_Sub4_1).method8050();
						}
						if (local23.aClass20_Sub2_1 instanceof Interface7) {
							((Interface7) local23.aClass20_Sub2_1).method8050();
						}
						if (local23.aClass20_Sub2_2 instanceof Interface7) {
							((Interface7) local23.aClass20_Sub2_2).method8050();
						}
						for (@Pc(73) Class232 local73 = local23.aClass232_2; local73 != null; local73 = local73.aClass232_3) {
							@Pc(78) Class20_Sub1 local78 = local73.aClass20_Sub1_2;
							if (local78 instanceof Interface7) {
								((Interface7) local78).method8050();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IZIIIIIIZ)Z")
	public static boolean method5833(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(8) int local8 = Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray780[0];
		@Pc(13) int local13 = Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray781[0];
		if (local8 < 0 || local8 >= Static237.anInt4563 || local13 < 0 || local13 >= Static373.anInt6694) {
			return false;
		} else if (arg3 >= 0 && Static237.anInt4563 > arg3 && arg4 >= 0 && arg4 < Static373.anInt6694) {
			@Pc(74) int local74 = Static231.method4172(Static107.aClass20_Sub1_Sub1_Sub1_1.method7808(), local8, Static23.anIntArray58, arg6, arg1, local13, Static362.aClass243Array5[Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108], Static102.anIntArray160, arg4, arg2, arg3, arg0, arg5, arg7);
			if (local74 < 1) {
				return false;
			}
			Static52.anInt4659 = Static102.anIntArray160[local74 - 1];
			Static259.anInt5037 = Static23.anIntArray58[local74 - 1];
			Static50.aBoolean106 = false;
			Static327.method5596();
			return true;
		} else {
			return false;
		}
	}
}
