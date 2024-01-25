import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "Lclient!eq;")
	public static Class97 aClass97_26;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "J")
	public static long aLong75 = -1L;

	@OriginalMember(owner = "client!ds", name = "J", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_22 = new Class269(50, 0);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
	public static void method1767() {
		for (@Pc(8) Class2_Sub5_Sub4 local8 = (Class2_Sub5_Sub4) Static280.aClass238_29.method5833(); local8 != null; local8 = (Class2_Sub5_Sub4) Static280.aClass238_29.method5838()) {
			@Pc(12) Class11_Sub1_Sub1_Sub5 local12 = local8.aClass11_Sub1_Sub1_Sub5_1;
			if (local12.anInt6694 < Static325.anInt5888) {
				local8.method8599();
				local12.method5642();
			} else if (local12.anInt6680 <= Static325.anInt5888) {
				local12.method5641();
				if (local12.anInt6689 > 0) {
					@Pc(47) Class2_Sub51 local47 = (Class2_Sub51) Static357.aClass222_23.method5468((long) (local12.anInt6689 - 1));
					if (local47 != null) {
						@Pc(52) Class11_Sub1_Sub1_Sub2_Sub2 local52 = local47.aClass11_Sub1_Sub1_Sub2_Sub2_2;
						if (local52.anInt9925 >= 0 && local52.anInt9925 < Static3.anInt46 * 512 && local52.anInt9929 >= 0 && Static270.anInt5194 * 512 > local52.anInt9929) {
							local12.method5645(local52.anInt9925, Static582.method8038(local12.aByte124, local52.anInt9925, local52.anInt9929) - local12.anInt6696, local52.anInt9929, Static325.anInt5888);
						}
					}
				}
				if (local12.anInt6689 < 0) {
					@Pc(108) int local108 = -local12.anInt6689 - 1;
					@Pc(117) Class11_Sub1_Sub1_Sub2_Sub1 local117;
					if (Static182.anInt4021 == local108) {
						local117 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2;
					} else {
						local117 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local108];
					}
					if (local117 != null && local117.anInt9925 >= 0 && local117.anInt9925 < Static3.anInt46 * 512 && local117.anInt9929 >= 0 && Static270.anInt5194 * 512 > local117.anInt9929) {
						local12.method5645(local117.anInt9925, Static582.method8038(local12.aByte124, local117.anInt9925, local117.anInt9929) - local12.anInt6696, local117.anInt9929, Static325.anInt5888);
					}
				}
				local12.method5646(Static362.anInt6541);
				Static381.method5741(local12, true);
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!lda;Lclient!lda;IIZ)I")
	public static int method1768(@OriginalArg(0) Class202_Sub1 arg0, @OriginalArg(1) Class202_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg2 == 1) {
			local11 = arg0.anInt5722;
			local14 = arg1.anInt5722;
			if (!arg3) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg2 == 2) {
			return Static401.method6154(arg1.method4778().aString58, Static377.anInt6756, arg0.method4778().aString58);
		} else if (arg2 == 3) {
			if (arg0.aString56.equals("-")) {
				if (arg1.aString56.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString56.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static401.method6154(arg1.aString56, Static377.anInt6756, arg0.aString56);
			}
		} else if (arg2 == 4) {
			if (arg0.method4770()) {
				return arg1.method4770() ? 0 : 1;
			} else if (arg1.method4770()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg0.method4772()) {
				return arg1.method4772() ? 0 : 1;
			} else if (arg1.method4772()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg0.method4775()) {
				return arg1.method4775() ? 0 : 1;
			} else if (arg1.method4775()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg0.method4773()) {
				return arg1.method4773() ? 0 : 1;
			} else if (arg1.method4773()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local11 = arg0.anInt5727;
			local14 = arg1.anInt5727;
			if (arg3) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local14 == -1) {
					local14 = 1000;
				}
				if (local11 == -1) {
					local11 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg0.anInt5725 - arg1.anInt5725;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!ak;I)V")
	public static void method1770(@OriginalArg(0) Class11_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(15) Class2_Sub31 local15 = (Class2_Sub31) Static634.aClass222_44.method5468((long) arg0.anInt3246);
		if (local15 == null) {
			return;
		}
		if (local15.aClass2_Sub2_Sub5_3 != null) {
			Static1.aClass2_Sub2_Sub2_6.method1042(local15.aClass2_Sub2_Sub5_3);
			local15.aClass2_Sub2_Sub5_3 = null;
		}
		local15.method8599();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIII)V")
	public static void method1771(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(8) Class11_Sub2 local8 = (Class11_Sub2) Static18.aClass143_1.method3536(); local8 != null; local8 = (Class11_Sub2) Static18.aClass143_1.method3528()) {
			if (local8.anInt1057 <= Static325.anInt5888) {
				local8.method8372();
			} else {
				Static304.method4695(local8.anInt1062, (local8.anInt1056 << 9) + 256, arg2 >> 1, local8.anInt1060 * 2, (local8.anInt1054 << 9) + 256, arg0 >> 1);
				Static4.aClass64_1.method7493(arg1 + Static269.anIntArray354[0], arg3 - -Static269.anIntArray354[1], local8.aString11, local8.anInt1058 | 0xFF000000, 0);
			}
		}
	}
}
