import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "[[Lclient!cr;")
	public static Class41[][] aClass41ArrayArray2;

	@OriginalMember(owner = "client!ws", name = "r", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_204 = new Class81(54, 9);

	@OriginalMember(owner = "client!ws", name = "w", descriptor = "Lclient!ek;")
	public static final Class2_Sub15 aClass2_Sub15_2 = new Class2_Sub15(0, -1);

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "I")
	public static int anInt7838 = 0;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "([[BI[II[B[IB[[B)I")
	public static int method6076(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg5[arg3];
		@Pc(15) int local15 = arg2[arg3] + local9;
		@Pc(19) int local19 = arg5[arg1];
		@Pc(34) int local34 = local19 + arg2[arg1];
		@Pc(36) int local36 = local9;
		if (local19 > local9) {
			local36 = local19;
		}
		@Pc(47) int local47 = local15;
		if (local15 > local34) {
			local47 = local34;
		}
		@Pc(58) int local58 = arg4[arg3] & 0xFF;
		if ((arg4[arg1] & 0xFF) < local58) {
			local58 = arg4[arg1] & 0xFF;
		}
		@Pc(79) byte[] local79 = arg0[arg3];
		@Pc(83) byte[] local83 = arg6[arg1];
		@Pc(88) int local88 = local36 - local9;
		@Pc(92) int local92 = local36 - local19;
		for (@Pc(94) int local94 = local36; local94 < local47; local94++) {
			@Pc(106) int local106 = local83[local92++] + local79[local88++];
			if (local106 < local58) {
				local58 = local106;
			}
		}
		return -local58;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(JI)V")
	public static void method6077(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static422.anInt7372;
		@Pc(13) int local13 = Static352.anInt7237;
		@Pc(25) int local25;
		@Pc(33) int local33;
		if (local7 != Static349.anInt6145) {
			local25 = local7 - Static349.anInt6145;
			local33 = (int) (arg0 * (long) local25 / 320L);
			if (local25 <= 0) {
				if (local33 == 0) {
					local33 = -1;
				} else if (local33 < local25) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = 1;
			} else if (local25 < local33) {
				local33 = local25;
			}
			Static349.anInt6145 += local33;
		}
		if (!Static399.aClass167_Sub1_1.aBoolean480) {
			Static203.aFloat130 += (float) arg0 * Static83.aFloat67 / 40.0F * 8.0F;
			Static328.aFloat179 += (float) arg0 * Static317.aFloat171 / 40.0F * 8.0F;
		}
		if (Static177.anInt3430 != local13) {
			local25 = local13 - Static177.anInt3430;
			local33 = (int) (arg0 * (long) local25 / 320L);
			if (local25 <= 0) {
				if (local33 == 0) {
					local33 = -1;
				} else if (local25 > local33) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = 1;
			} else if (local33 > local25) {
				local33 = local25;
			}
			Static177.anInt3430 += local33;
		}
		Static309.method4416();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)Lclient!ii;")
	public static Class23_Sub1 method6078(@OriginalArg(1) int arg0) {
		return Static293.aBoolean500 && arg0 >= Static270.anInt4971 && Static220.anInt4212 >= arg0 ? Static323.aClass23_Sub1Array1[arg0 - Static270.anInt4971] : null;
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(Z)Lclient!nn;")
	public static Class170 method6079() {
		try {
			return (Class170) Class.forName("Class170_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!j;III[Z)V")
	public static void method6081(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static372.aClass106Array11 == Static77.aClass106Array12) {
			return;
		}
		@Pc(9) int local9 = Static72.aClass106Array4[arg1].va(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class106 local22 = Static72.aClass106Array4[local11];
				if (local22 != null) {
					local22.U(arg0, arg2, local9 - local22.va(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
