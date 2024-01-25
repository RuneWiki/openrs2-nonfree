import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "J")
	public static long aLong92;

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "Z")
	public static boolean aBoolean238 = false;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "Lclient!eu;")
	public static final Class102 aClass102_4 = new Class102();

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "([I[I[ILclient!ip;I)V")
	public static void method3000(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class4_Sub1_Sub1_Sub2_Sub1 arg3) {
		for (@Pc(10) int local10 = 0; local10 < arg1.length; local10++) {
			@Pc(18) int local18 = arg1[local10];
			@Pc(22) int local22 = arg0[local10];
			@Pc(26) int local26 = arg2[local10];
			for (@Pc(28) int local28 = 0; local22 != 0 && local28 < arg3.aClass64Array3.length; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg3.aClass64Array3[local28] = null;
					} else {
						@Pc(58) Class264 local58 = Static315.aClass14_1.method227(local18);
						@Pc(61) int local61 = local58.anInt7047;
						@Pc(66) Class64 local66 = arg3.aClass64Array3[local28];
						if (local66 != null) {
							if (local18 == local66.anInt1376) {
								if (local61 == 0) {
									local66 = arg3.aClass64Array3[local28] = null;
								} else if (local61 == 1) {
									local66.anInt1378 = 0;
									local66.anInt1384 = 0;
									local66.anInt1383 = 0;
									local66.anInt1380 = local26;
									local66.anInt1377 = 1;
									if (!arg3.aBoolean455) {
										Static628.method8566(local58, 0, arg3);
									}
								} else if (local61 == 2) {
									local66.anInt1383 = 0;
								}
							} else if (local58.anInt7043 >= Static315.aClass14_1.method227(local66.anInt1376).anInt7043) {
								local66 = arg3.aClass64Array3[local28] = null;
							}
						}
						if (local66 == null) {
							local66 = arg3.aClass64Array3[local28] = new Class64();
							local66.anInt1378 = 0;
							local66.anInt1380 = local26;
							local66.anInt1377 = 1;
							local66.anInt1383 = 0;
							local66.anInt1376 = local18;
							local66.anInt1384 = 0;
							if (!arg3.aBoolean455) {
								Static628.method8566(local58, 0, arg3);
							}
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "([SI)[S")
	public static short[] method3001(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(20) short[] local20 = new short[arg0.length];
			Static693.method8322(arg0, 0, local20, 0, arg0.length);
			return local20;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)Z")
	public static boolean method3002(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
