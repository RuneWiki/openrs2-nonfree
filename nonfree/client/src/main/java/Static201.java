import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array4;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "[Lclient!ch;")
	public static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Lclient!qf;")
	public static final Class1_Sub14_Sub2 aClass1_Sub14_Sub2_2 = new Class1_Sub14_Sub2(5000);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Lclient!nk;")
	public static Class174 method3102(@OriginalArg(0) int arg0) {
		@Pc(8) Class174[] local8 = Static152.method2431();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class174 local16 = local8[local10];
			if (local16.anInt4514 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method3103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class167 local13 = local7.aClass167_1; local13 != null; local13 = local13.aClass167_2) {
			@Pc(17) Class47_Sub1 local17 = local13.aClass47_Sub1_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort104 == arg1 && local17.aShort105 == arg2) {
				Static249.method3577(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)I")
	public static int method3104(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local73 < 0.5D) {
				local67 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(163) int local163 = (int) (local60 * 256.0D);
		@Pc(168) int local168 = (int) (local67 * 256.0D);
		if (local168 < 0) {
			local168 = 0;
		} else if (local168 > 255) {
			local168 = 255;
		}
		@Pc(186) int local186 = (int) (local73 * 256.0D);
		if (local186 < 0) {
			local186 = 0;
		} else if (local186 > 255) {
			local186 = 255;
		}
		if (local186 > 243) {
			local168 >>= 0x4;
		} else if (local186 > 217) {
			local168 >>= 0x3;
		} else if (local186 > 192) {
			local168 >>= 0x2;
		} else if (local186 > 179) {
			local168 >>= 0x1;
		}
		return ((local163 >> 2 & 0x3F) << 10) - (-(local168 >> 5 << 7) - (local186 >> 1));
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZZI)V")
	public static void method3105(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static149.anInt2670--;
			if (Static149.anInt2670 == 0) {
				Static95.anIntArray92 = null;
			}
		}
		if (!arg1) {
			return;
		}
		Static49.anInt795--;
		if (Static49.anInt795 == 0) {
			Static302.anIntArray386 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIBI)V")
	public static void method3107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 > Static85.anInt1517 || arg3 < Static357.anInt6537) {
			return;
		}
		@Pc(31) boolean local31;
		if (Static47.anInt762 > arg2) {
			local31 = false;
			arg2 = Static47.anInt762;
		} else if (arg2 > Static60.anInt1086) {
			local31 = false;
			arg2 = Static60.anInt1086;
		} else {
			local31 = true;
		}
		@Pc(55) boolean local55;
		if (arg4 < Static47.anInt762) {
			arg4 = Static47.anInt762;
			local55 = false;
		} else if (arg4 <= Static60.anInt1086) {
			local55 = true;
		} else {
			arg4 = Static60.anInt1086;
			local55 = false;
		}
		if (Static357.anInt6537 > arg1) {
			arg1 = Static357.anInt6537;
		} else {
			Static23.method323(Static283.anIntArrayArray30[arg1++], arg2, arg0, arg4);
		}
		if (arg3 > Static85.anInt1517) {
			arg3 = Static85.anInt1517;
		} else {
			Static23.method323(Static283.anIntArrayArray30[arg3--], arg2, arg0, arg4);
		}
		@Pc(115) int local115;
		if (local31 && local55) {
			for (local115 = arg1; local115 <= arg3; local115++) {
				@Pc(163) int[] local163 = Static283.anIntArrayArray30[local115];
				local163[arg2] = local163[arg4] = arg0;
			}
		} else if (local31) {
			for (local115 = arg1; local115 <= arg3; local115++) {
				Static283.anIntArrayArray30[local115][arg2] = arg0;
			}
		} else if (local55) {
			for (local115 = arg1; local115 <= arg3; local115++) {
				Static283.anIntArrayArray30[local115][arg4] = arg0;
			}
		}
	}
}
