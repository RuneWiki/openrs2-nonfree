import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "[I")
	public static int[] anIntArray71;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Z")
	public static boolean aBoolean62;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!il;")
	public static final Class93 aClass93_6 = new Class93(9, 3);

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
	public static int anInt984 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
	public static void method955(@OriginalArg(0) int arg0) {
		Static319.method5498();
		@Pc(10) int local10 = Static123.method2594(arg0).anInt3541;
		if (local10 == 0) {
			return;
		}
		@Pc(20) int local20 = Static87.anIntArray147[arg0];
		if (local10 == 5) {
			Static349.anInt6554 = local20;
		}
		if (local10 == 6) {
			Static200.anInt4051 = local20;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!fp;Lclient!je;IIIII)V")
	public static void method956(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static263.anInt5201) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static300.anInt5778) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static354.anInt6714 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class155 local62 = Static105.aClass155ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static258.aClass36Array2[local17].method4431(local23, local32) + Static258.aClass36Array2[local17].method4431(local23 + 1, local32) + Static258.aClass36Array2[local17].method4431(local23, local32 + 1) + Static258.aClass36Array2[local17].method4431(local23 + 1, local32 + 1)) / 4 - (Static258.aClass36Array2[arg2].method4431(arg3, arg4) + Static258.aClass36Array2[arg2].method4431(arg3 + 1, arg4) + Static258.aClass36Array2[arg2].method4431(arg3, arg4 + 1) + Static258.aClass36Array2[arg2].method4431(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class11_Sub5 local143 = local62.aClass11_Sub5_2;
									@Pc(146) Class11_Sub5 local146 = local62.aClass11_Sub5_1;
									if (local143 != null && local143.method5913()) {
										arg1.method5915(arg0, local143, local1, local140, (local23 - arg3) * Static66.anInt1552 + (1 - arg5) * Static145.anInt3090, (local32 - arg4) * Static66.anInt1552 + (1 - arg6) * Static145.anInt3090);
									}
									if (local146 != null && local146.method5913()) {
										arg1.method5915(arg0, local146, local1, local140, (local23 - arg3) * Static66.anInt1552 + (1 - arg5) * Static145.anInt3090, (local32 - arg4) * Static66.anInt1552 + (1 - arg6) * Static145.anInt3090);
									}
									for (@Pc(219) Class187 local219 = local62.aClass187_2; local219 != null; local219 = local219.aClass187_3) {
										@Pc(223) Class11_Sub2 local223 = local219.aClass11_Sub2_2;
										if (local223 != null && local223.method5913() && (local23 == local223.aShort94 || local23 == local3) && (local32 == local223.aShort93 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort92 + 1 - local223.aShort94;
											@Pc(260) int local260 = local223.aShort91 + 1 - local223.aShort93;
											arg1.method5915(arg0, local223, local1, local140, (local223.aShort94 - arg3) * Static66.anInt1552 + (local252 - arg5) * Static145.anInt3090, (local223.aShort93 - arg4) * Static66.anInt1552 + (local260 - arg6) * Static145.anInt3090);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method957() {
		Static129.method2666();
		Static51.aClass63_2 = null;
		Static247.aClass54ArrayArray1 = null;
		Static85.aClass13_2 = null;
		Static188.aClass13_3 = null;
		Static345.aClass13_4 = null;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
	public static void method958() {
		@Pc(1) Class21 local1 = Static163.aClass21_93;
		synchronized (Static163.aClass21_93) {
			Static163.aClass21_93.method851();
		}
		local1 = Static93.aClass21_135;
		synchronized (Static93.aClass21_135) {
			Static93.aClass21_135.method851();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V")
	public static void method959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static253.anInt5163 = arg1 - Static269.anInt3314;
		Static286.anInt5852 = arg0 - Static269.anInt3320;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII)V")
	public static void method960(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(arg0, 11);
		local8.method3480();
		local8.anInt3725 = arg2;
		local8.anInt3727 = arg1;
	}
}
