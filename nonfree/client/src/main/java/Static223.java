import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
	public static int anInt3799;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_8 = new Class159(9, 4);

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
	public static void method3245() {
		if (Static483.aClass46_23 != null) {
			Static42.aClass252_1 = new Class252();
			Static42.aClass252_1.method6248(Static483.aClass46_23.anInt1170, Static483.aClass46_23, Static481.aLong245, Static483.aClass46_23.aClass41_64.method1007(Static616.anInt10077));
			Static152.aThread3 = new Thread(Static42.aClass252_1, "");
			Static152.aThread3.start();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([SIB)[S")
	public static short[] method3246(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static679.method1564(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)Lclient!tia;")
	public static Class6_Sub4_Sub18 method3247() {
		@Pc(8) Class6_Sub4_Sub18 local8 = (Class6_Sub4_Sub18) Static407.aClass384_13.method8910();
		if (local8 != null) {
			local8.method9174();
			local8.method9043();
			return local8;
		}
		do {
			local8 = (Class6_Sub4_Sub18) Static273.aClass384_8.method8910();
			if (local8 == null) {
				return null;
			}
			if (local8.method7974() > Static566.method7936()) {
				return null;
			}
			local8.method9174();
			local8.method9043();
		} while ((Long.MIN_VALUE & local8.aLong310) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BJ)V")
	public static void method3248(@OriginalArg(1) long arg0) {
		@Pc(16) int local16 = Static4.anInt83 + Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006;
		@Pc(21) int local21 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 + Static438.anInt2579;
		if (Static162.anInt2757 - local16 < -2000 || Static162.anInt2757 - local16 > 2000 || Static674.anInt9799 - local21 < -2000 || Static674.anInt9799 - local21 > 2000) {
			Static162.anInt2757 = local16;
			Static674.anInt9799 = local21;
		}
		@Pc(61) int local61;
		@Pc(69) int local69;
		if (Static162.anInt2757 != local16) {
			local61 = local16 - Static162.anInt2757;
			local69 = (int) ((long) local61 * arg0 / 320L);
			if (local61 <= 0) {
				if (local69 == 0) {
					local69 = -1;
				} else if (local69 < local61) {
					local69 = local61;
				}
			} else if (local69 == 0) {
				local69 = 1;
			} else if (local61 < local69) {
				local69 = local61;
			}
			Static162.anInt2757 += local69;
		}
		if (Static674.anInt9799 != local21) {
			local61 = local21 - Static674.anInt9799;
			local69 = (int) (arg0 * (long) local61 / 320L);
			if (local61 > 0) {
				if (local69 == 0) {
					local69 = 1;
				} else if (local69 > local61) {
					local69 = local61;
				}
			} else if (local69 == 0) {
				local69 = -1;
			} else if (local69 < local61) {
				local69 = local61;
			}
			Static674.anInt9799 += local69;
		}
		Static132.aFloat14 += Static591.aFloat182 * (float) arg0 / 6.0F;
		Static228.aFloat26 += Static213.aFloat21 * (float) arg0 / 6.0F;
		Static678.method9178();
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(II)V")
	public static void method3249(@OriginalArg(1) int arg0) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg0, 10);
		local9.method7979();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method3251(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static346.method5045(arg1, 0, arg0.length - 1, arg0);
	}
}
