import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Lclient!po;")
	public static Class141 aClass141_14;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "[Lclient!we;")
	public static Class188[] aClass188Array13;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!cc;")
	public static Class26 aClass26_49 = new Class26(100);

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "[I")
	public static int[] anIntArray501 = new int[25];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZLclient!fg;ILclient!ho;)V")
	public static void method3848(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub3_Sub7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class83 arg3) {
		@Pc(17) int local17;
		if (arg3.anIntArray188 != null) {
			@Pc(10) boolean local10 = false;
			@Pc(15) int[] local15 = new int[arg3.anIntArray188.length];
			for (local17 = 0; local17 < local15.length / 2; local17++) {
				@Pc(37) int local37 = arg3.anIntArray188[local17 * 2] + arg1.anInt1768;
				@Pc(50) int local50 = arg1.anInt1769 - arg3.anIntArray188[local17 * 2 + 1];
				@Pc(71) int local71 = local15[local17 * 2] = Static121.anInt2969 + (local37 - Static121.anInt2973) * (Static121.anInt2970 - Static121.anInt2969) / (Static121.anInt2972 - Static121.anInt2973);
				@Pc(95) int local95 = local15[local17 * 2 + 1] = Static121.anInt2968 + (local50 - Static121.anInt2967) * (Static121.anInt2971 - Static121.anInt2968) / (Static121.anInt2966 - Static121.anInt2967);
				if (Static121.anInt2969 < local71 && local71 < Static121.anInt2970 && Static121.anInt2968 < local95 && local95 < Static121.anInt2971) {
					local10 = true;
				}
			}
			if (!local10) {
				return;
			}
			Static95.method1628(local15, arg3.anInt2283, arg3.anInt2283 >>> 24);
			for (local17 = 0; local17 < local15.length / 2 - 1; local17++) {
				Static270.method4267(local15[local17 * 2], local15[local17 * 2 + 1], local15[(local17 + 1) * 2], local15[(local17 + 1) * 2 + 1], arg3.anInt2266, arg3.anInt2266 >>> 24);
			}
			Static270.method4267(local15[local15.length - 2], local15[local15.length - 1], local15[0], local15[1], arg3.anInt2266, arg3.anInt2266 >>> 24);
		} else if (arg1.aBoolean106) {
			return;
		}
		@Pc(222) Class4_Sub17 local222 = new Class4_Sub17(arg1);
		@Pc(224) Class56_Sub1 local224 = null;
		if (arg3.anInt2277 != -1) {
			if (arg1.aBoolean105 && arg3.anInt2291 != -1) {
				local224 = (Class56_Sub1) arg3.method1812(true, true);
			} else {
				local224 = (Class56_Sub1) arg3.method1812(false, true);
			}
			if (local224 != null) {
				if (Static145.anInt2853 > 0 && (Static204.anInt3920 != -1 && arg1.anInt1760 == Static204.anInt3920 || Static81.anInt1874 != -1 && arg3.anInt2284 == Static81.anInt1874)) {
					if (Static216.anInt4216 <= 50) {
						local17 = Static216.anInt4216 * 3;
					} else {
						local17 = 300 - Static216.anInt4216 * 3;
					}
					Static270.method4243(arg1.anInt1766, arg1.anInt1764, local224.anInt3408 / 2 + 7, 16776960, local17);
					Static270.method4243(arg1.anInt1766, arg1.anInt1764, local224.anInt3408 / 2 + 5, 16776960, local17);
					Static270.method4243(arg1.anInt1766, arg1.anInt1764, local224.anInt3408 / 2 + 3, 16776960, local17);
					Static270.method4243(arg1.anInt1766, arg1.anInt1764, local224.anInt3408 / 2 + 1, 16776960, local17);
					Static270.method4243(arg1.anInt1766, arg1.anInt1764, local224.anInt3408 / 2, 16776960, local17);
				}
				local224.method2828(arg1.anInt1766 - (local224.anInt3408 >> 1), arg1.anInt1764 - (local224.anInt3413 >> 1));
				local222.anInt3461 = (local224.anInt3413 >> 1) + arg2 + arg1.anInt1764;
				local222.anInt3457 = arg0 + arg1.anInt1766 - (local224.anInt3408 >> 1);
				local222.anInt3462 = (local224.anInt3408 >> 1) + arg0 + arg1.anInt1766;
				local222.anInt3459 = arg2 + arg1.anInt1764 - (local224.anInt3413 >> 1);
			}
		}
		if (arg3.aString131 != null) {
			if (local224 == null) {
				Static203.method3257(arg1, arg0, 0, arg2, true, local222, arg3);
			} else {
				Static203.method3257(arg1, arg0, (local224.anInt3413 >> 1) + 5, arg2, false, local222, arg3);
			}
		}
		if (local222.method2936(Static286.anInt5358, Static312.anInt6042) && arg3.aStringArray15 != null) {
			if (arg3.aStringArray15[4] != null) {
				Static84.method1497((long) arg1.anInt1760, arg3.anInt2284, 0, arg3.aString130, arg3.aStringArray15[4], (short) 1011, -1);
			}
			if (arg3.aStringArray15[3] != null) {
				Static84.method1497((long) arg1.anInt1760, arg3.anInt2284, 0, arg3.aString130, arg3.aStringArray15[3], (short) 1003, -1);
			}
			if (arg3.aStringArray15[2] != null) {
				Static84.method1497((long) arg1.anInt1760, arg3.anInt2284, 0, arg3.aString130, arg3.aStringArray15[2], (short) 1008, -1);
			}
			if (arg3.aStringArray15[1] != null) {
				Static84.method1497((long) arg1.anInt1760, arg3.anInt2284, 0, arg3.aString130, arg3.aStringArray15[1], (short) 1002, -1);
			}
			if (arg3.aStringArray15[0] != null) {
				Static84.method1497((long) arg1.anInt1760, arg3.anInt2284, 0, arg3.aString130, arg3.aStringArray15[0], (short) 1012, -1);
			}
		}
		Static113.aClass114_13.method2625(local222);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!wf;I)V")
	public static void method3849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class189 arg2) {
		if (arg2.aByte26 == 0) {
			arg2.anInt5964 = arg2.anInt5932;
		} else if (arg2.aByte26 == 1) {
			arg2.anInt5964 = arg2.anInt5932 + (arg0 - arg2.anInt5897) / 2;
		} else if (arg2.aByte26 == 2) {
			arg2.anInt5964 = arg0 - arg2.anInt5932 - arg2.anInt5897;
		} else if (arg2.aByte26 == 3) {
			arg2.anInt5964 = arg2.anInt5932 * arg0 >> 14;
		} else if (arg2.aByte26 == 4) {
			arg2.anInt5964 = (arg2.anInt5932 * arg0 >> 14) + (arg0 - arg2.anInt5897) / 2;
		} else {
			arg2.anInt5964 = arg0 - (arg0 * arg2.anInt5932 >> 14) - arg2.anInt5897;
		}
		if (arg2.aByte25 == 0) {
			arg2.anInt5892 = arg2.anInt5955;
		} else if (arg2.aByte25 == 1) {
			arg2.anInt5892 = arg2.anInt5955 + (arg1 - arg2.anInt5953) / 2;
		} else if (arg2.aByte25 == 2) {
			arg2.anInt5892 = arg1 - arg2.anInt5953 - arg2.anInt5955;
		} else if (arg2.aByte25 == 3) {
			arg2.anInt5892 = arg1 * arg2.anInt5955 >> 14;
		} else if (arg2.aByte25 == 4) {
			arg2.anInt5892 = (arg2.anInt5955 * arg1 >> 14) + (arg1 - arg2.anInt5953) / 2;
		} else {
			arg2.anInt5892 = arg1 - (arg2.anInt5955 * arg1 >> 14) - arg2.anInt5953;
		}
		if (!Static27.aBoolean26 || Static41.method687(arg2).anInt3947 == 0 && arg2.anInt5915 != 0) {
			return;
		}
		if (arg2.anInt5892 < 0) {
			arg2.anInt5892 = 0;
		} else if (arg2.anInt5953 + arg2.anInt5892 > arg1) {
			arg2.anInt5892 = arg1 - arg2.anInt5953;
		}
		if (arg2.anInt5964 < 0) {
			arg2.anInt5964 = 0;
		} else if (arg0 < arg2.anInt5964 + arg2.anInt5897) {
			arg2.anInt5964 = arg0 - arg2.anInt5897;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method3851(@OriginalArg(0) Class58 arg0) {
		Static3.aClass58_2 = arg0;
	}
}
