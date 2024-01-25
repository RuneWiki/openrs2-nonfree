import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!ow", name = "k", descriptor = "Lclient!ko;")
	public static final Class208 aClass208_8 = new Class208("", 15);

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "Lclient!pe;")
	public static final Class282 aClass282_38 = new Class282(0, 2, 2, 1);

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IZ)V")
	public static void method6336(@OriginalArg(1) boolean arg0) {
		Static83.aClass10_1.method4212(Static548.aClass100_13.method8595());
		@Pc(18) int[] local18 = Static548.aClass100_13.Y();
		Static386.anInt6538 = local18[0];
		Static638.anInt10399 = local18[1];
		Static189.anInt3494 = local18[3];
		Static88.anInt1479 = local18[2];
		if (arg0) {
			Static548.aClass100_13.DA(Static47.anInt816, Static173.anInt9672, Static160.anInt8867, Static347.anInt5728);
			Static294.method4653(Static193.aDouble6);
		} else {
			Static548.aClass100_13.DA(Static426.anInt7112, Static252.anInt4588, Static494.anInt7987, Static75.anInt1326);
			Static294.method4653(Static209.aDouble7);
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "([IZ[ILclient!ns;[I)V")
	public static void method6337(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class4_Sub1_Sub1_Sub2_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg3.length; local12++) {
			@Pc(18) int local18 = arg3[local12];
			@Pc(22) int local22 = arg0[local12];
			@Pc(26) int local26 = arg1[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && local28 < arg2.aClass64Array3.length; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg2.aClass64Array3[local28] = null;
					} else {
						@Pc(47) Class264 local47 = Static315.aClass14_1.method227(local18);
						@Pc(50) int local50 = local47.anInt7047;
						@Pc(55) Class64 local55 = arg2.aClass64Array3[local28];
						if (local55 != null) {
							if (local18 == local55.anInt1376) {
								if (local50 == 0) {
									local55 = arg2.aClass64Array3[local28] = null;
								} else if (local50 == 1) {
									local55.anInt1377 = 1;
									local55.anInt1380 = local26;
									local55.anInt1383 = 0;
									local55.anInt1378 = 0;
									local55.anInt1384 = 0;
									if (!arg2.aBoolean455) {
										Static628.method8566(local47, 0, arg2);
									}
								} else if (local50 == 2) {
									local55.anInt1383 = 0;
								}
							} else if (local47.anInt7043 >= Static315.aClass14_1.method227(local55.anInt1376).anInt7043) {
								local55 = arg2.aClass64Array3[local28] = null;
							}
						}
						if (local55 == null) {
							local55 = arg2.aClass64Array3[local28] = new Class64();
							local55.anInt1380 = local26;
							local55.anInt1376 = local18;
							local55.anInt1378 = 0;
							local55.anInt1383 = 0;
							local55.anInt1384 = 0;
							local55.anInt1377 = 1;
							if (!arg2.aBoolean455) {
								Static628.method8566(local47, 0, arg2);
							}
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)V")
	public static void method6338(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub11 local10 = (Class5_Sub11) Static3.aClass306_1.method6943((long) arg0);
		if (local10 != null) {
			local10.aBoolean89 = !local10.aBoolean89;
			local10.aClass275_Sub1_1.method6316(local10.aBoolean89);
		}
	}
}
