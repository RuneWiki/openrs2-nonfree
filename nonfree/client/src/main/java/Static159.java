import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fj", name = "C", descriptor = "Z")
	public static final boolean aBoolean165 = false;

	@OriginalMember(owner = "client!fj", name = "J", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_48 = new Class289(2, 0);

	@OriginalMember(owner = "client!fj", name = "P", descriptor = "Z")
	public static final boolean aBoolean166 = true;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
	public static void method2242() {
		Static505.anInt8479 = 0;
		Static461.aClass243Array1 = new Class243[50];
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!sha;III)V")
	public static void method2243(@OriginalArg(0) Class321 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static187.anInt3188 = arg1;
		Static396.aClass321_29 = arg0;
		Static575.anInt9484 = arg2;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!oq;IIIII)V")
	public static void method2244(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static633.anInt10310) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static209.anInt3602) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static245.anInt4308 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class351 local62 = Static441.aClass351ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static289.aClass12Array3[local17].method7846(local23, local32) + Static289.aClass12Array3[local17].method7846(local23 + 1, local32) + Static289.aClass12Array3[local17].method7846(local23, local32 + 1) + Static289.aClass12Array3[local17].method7846(local23 + 1, local32 + 1)) / 4 - (Static289.aClass12Array3[arg1].method7846(arg2, arg3) + Static289.aClass12Array3[arg1].method7846(arg2 + 1, arg3) + Static289.aClass12Array3[arg1].method7846(arg2, arg3 + 1) + Static289.aClass12Array3[arg1].method7846(arg2 + 1, arg3 + 1)) / 4;
									@Pc(151) Class2_Sub1_Sub2 local151 = local62.aClass2_Sub1_Sub2_2;
									@Pc(154) Class2_Sub1_Sub2 local154 = local62.aClass2_Sub1_Sub2_1;
									if (local151 != null && local151.method8451()) {
										arg0.method8462(local151, (local23 - arg2) * Static655.anInt10510 + (1 - arg4) * Static625.anInt10177, local1, local148, Static576.aClass132_15, (local32 - arg3) * Static655.anInt10510 + (1 - arg5) * Static625.anInt10177);
									}
									if (local154 != null && local154.method8451()) {
										arg0.method8462(local154, (local23 - arg2) * Static655.anInt10510 + (1 - arg4) * Static625.anInt10177, local1, local148, Static576.aClass132_15, (local32 - arg3) * Static655.anInt10510 + (1 - arg5) * Static625.anInt10177);
									}
									for (@Pc(227) Class67 local227 = local62.aClass67_3; local227 != null; local227 = local227.aClass67_1) {
										@Pc(231) Class2_Sub1_Sub1 local231 = local227.aClass2_Sub1_Sub1_1;
										if (local231 != null && local231.method8451() && (local23 == local231.aShort118 || local23 == local3) && (local32 == local231.aShort121 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort119 + 1 - local231.aShort118;
											@Pc(268) int local268 = local231.aShort120 + 1 - local231.aShort121;
											arg0.method8462(local231, (local231.aShort118 - arg2) * Static655.anInt10510 + (local260 - arg4) * Static625.anInt10177, local1, local148, Static576.aClass132_15, (local231.aShort121 - arg3) * Static655.anInt10510 + (local268 - arg5) * Static625.anInt10177);
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

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!oq;Z[[[BIB)Z")
	public static boolean method2245(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static256.aBoolean274) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10006 >> Static185.anInt3178;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10001 >> Static185.anInt3178;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class2_Sub1_Sub1) {
			local10 = ((Class2_Sub1_Sub1) arg0).aShort119;
			local17 = ((Class2_Sub1_Sub1) arg0).aShort120;
			local8 = ((Class2_Sub1_Sub1) arg0).aShort118;
			local15 = ((Class2_Sub1_Sub1) arg0).aShort121;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte141 < Static633.anInt10310 && local38 >= Static254.anInt4362 && local38 < Static135.anInt2371 && local41 >= Static620.anInt10119 && local41 < Static357.anInt6125) {
					if ((arg2 == null || arg0.aByte140 < arg3 || arg2[arg0.aByte140][local38][local41] != arg4) && arg0.method8461() && !arg0.method8445(Static576.aClass132_15)) {
						return false;
					}
					if (!arg1 && local38 >= Static608.anInt9872 - 16 && local38 <= Static608.anInt9872 + 16 && local41 >= Static370.anInt6309 - 16 && local41 <= Static370.anInt6309 + 16) {
						if (Static251.aBoolean272) {
							Static364.aClass40Array1[Static177.anInt2998++].method973(arg0);
							Static177.anInt2998 %= Static564.anInt9384;
						} else {
							arg0.method8458(Static576.aClass132_15);
						}
					}
				}
			}
		}
		return true;
	}
}
