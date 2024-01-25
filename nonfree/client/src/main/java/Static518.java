import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Z")
	public static boolean aBoolean547 = false;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Lclient!cja;")
	public static Class9_Sub1_Sub2 method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass9_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!nt;)Lclient!nt;")
	public static Class270 method6970(@OriginalArg(1) Class270 arg0) {
		if (arg0.anInt7050 != -1) {
			return Static254.method3544(arg0.anInt7050);
		}
		@Pc(20) int local20 = arg0.anInt6973 >>> 16;
		@Pc(25) Class92 local25 = new Class92(Static432.aClass313_34);
		for (@Pc(30) Class3_Sub20 local30 = (Class3_Sub20) local25.method2383(); local30 != null; local30 = (Class3_Sub20) local25.method2382()) {
			if (local30.anInt2493 == local20) {
				return Static254.method3544((int) local30.aLong345);
			}
		}
		if (-967035728 != -967035728) {
			method6971();
		}
		return null;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public static void method6971() {
		Static164.aClass307_40.method6998();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z[I[ILclient!kt;[I)V")
	public static void method6974(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class9_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) int local18 = arg1[local12];
			@Pc(22) int local22 = arg0[local12];
			@Pc(26) int local26 = arg3[local12];
			@Pc(28) int local28 = 0;
			while (local22 != 0 && arg2.aClass45_Sub2_Sub1Array3.length > local28) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg2.aClass45_Sub2_Sub1Array3[local28] = null;
					} else {
						@Pc(49) Class149 local49 = Static592.aClass155_2.method3422(local18);
						@Pc(52) int local52 = local49.anInt3736;
						@Pc(57) Class45_Sub2_Sub1 local57 = arg2.aClass45_Sub2_Sub1Array3[local28];
						if (local57 != null && local57.method6572()) {
							if (local57.method6577() == local18) {
								if (local52 == 0) {
									local57 = arg2.aClass45_Sub2_Sub1Array3[local28] = null;
								} else if (local52 == 1) {
									local57.method6591();
									local57.anInt7643 = local26;
								} else if (local52 == 2) {
									local57.method6580();
								}
							} else if (local49.anInt3741 >= local57.method6579().anInt3741) {
								local57 = arg2.aClass45_Sub2_Sub1Array3[local28] = null;
							}
						}
						if (local57 == null || !local57.method6572()) {
							local57 = arg2.aClass45_Sub2_Sub1Array3[local28] = new Class45_Sub2_Sub1(arg2);
							local57.method6576(local18);
							local57.anInt7643 = local26;
						}
					}
				}
				local28++;
				local22 >>>= 0x1;
			}
		}
	}
}
