import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!rt", name = "B", descriptor = "I")
	public static int anInt6401;

	@OriginalMember(owner = "client!rt", name = "J", descriptor = "I")
	public static int anInt6407;

	@OriginalMember(owner = "client!rt", name = "U", descriptor = "Lclient!we;")
	public static Class267 aClass267_1;

	@OriginalMember(owner = "client!rt", name = "M", descriptor = "Lclient!nj;")
	public static final Class181 aClass181_34 = new Class181();

	@OriginalMember(owner = "client!rt", name = "Q", descriptor = "I")
	public static int anInt6411 = 0;

	@OriginalMember(owner = "client!rt", name = "R", descriptor = "[I")
	public static final int[] anIntArray526 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!rt", name = "T", descriptor = "Lclient!nj;")
	public static final Class181 aClass181_36 = new Class181();

	@OriginalMember(owner = "client!rt", name = "V", descriptor = "[S")
	public static final short[] aShortArray92 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!rt", name = "X", descriptor = "J")
	public static long aLong334 = -1L;

	@OriginalMember(owner = "client!rt", name = "Y", descriptor = "Lclient!gi;")
	public static Class93 aClass93_17 = null;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!qg;Lclient!za;Lclient!ho;Z)V")
	public static void method5083(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) Class2_Sub16 arg2) {
		@Pc(14) Class41 local14 = arg0.method4742(arg1);
		if (local14 == null) {
			return;
		}
		@Pc(20) int local20 = local14.YA();
		if (local20 < local14.ZA()) {
			local20 = local14.ZA();
		}
		@Pc(32) int local32 = arg2.anInt2884;
		@Pc(35) int local35 = arg2.anInt2881;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(78) int local78;
		if (arg0.aString62 != null) {
			local37 = Static419.aClass15_10.method328(arg0.aString62, null, Static51.aStringArray9, null);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static51.aStringArray9[local55];
				if (local55 < local37 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local78 = Static131.aClass223_2.method5136(local61);
				if (local78 > local39) {
					local39 = local78;
				}
			}
			local41 = local37 * Static131.aClass223_2.method5134() + Static131.aClass223_2.method5140() / 2;
		}
		local55 = local20 / 2 + arg2.anInt2884;
		@Pc(107) int local107 = arg2.anInt2881;
		if (Static5.anInt6731 + local20 > local32) {
			local55 = local39 / 2 + Static5.anInt6731 + local20 / 2 + 10 + 5;
			local32 = Static5.anInt6731;
		} else if (Static5.anInt6723 - local20 < local32) {
			local55 = Static5.anInt6723 - local39 / 2 - local20 / 2 - 15;
			local32 = Static5.anInt6723 - local20;
		}
		if (Static5.anInt6728 + local20 > local35) {
			local107 = Static5.anInt6728 + local20 / 2 + 10;
			local35 = Static5.anInt6728;
		} else if (Static5.anInt6722 - local20 < local35) {
			local35 = Static5.anInt6722 - local20;
			local107 = Static5.anInt6722 - local41 - local20 / 2 - 10;
		}
		local78 = (int) (Math.atan2((double) (local32 - arg2.anInt2884), (double) (local35 - arg2.anInt2881)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local14.method6084((float) local20 / 2.0F + (float) local32, (float) local35 + (float) local20 / 2.0F, 4096, local78);
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		if (arg0.aString62 != null) {
			local257 = local55 - local39 / 2 - 5;
			local259 = local107;
			local261 = local257 + local39 + 10;
			local263 = Static131.aClass223_2.method5134() * local37 + local107 + 3;
			if (arg0.anInt5960 != 0) {
				arg1.method5996(local263 - local107, local107, arg0.anInt5960, local257, local261 - local257);
			}
			if (arg0.anInt5961 != 0) {
				arg1.method5993(arg0.anInt5961, local263 - local107, local107, local257, local261 - local257);
			}
			for (@Pc(336) int local336 = 0; local336 < local37; local336++) {
				@Pc(342) String local342 = Static51.aStringArray9[local336];
				if (local336 < local37 - 1) {
					local342 = local342.substring(0, local342.length() - 4);
				}
				Static131.aClass223_2.method5135(arg1, local342, local55, local107, arg0.anInt5965);
				local107 += Static131.aClass223_2.method5134();
			}
		}
		if (arg0.anInt5962 == -1 && arg0.aString62 == null) {
			return;
		}
		@Pc(386) Class2_Sub32 local386 = new Class2_Sub32(arg2);
		local20 >>= 0x1;
		local386.anInt5516 = local259;
		local386.anInt5518 = local263;
		local386.anInt5524 = local257;
		local386.anInt5522 = local261;
		local386.anInt5523 = local35 - local20;
		local386.anInt5514 = local35 + local20;
		local386.anInt5520 = local32 - local20;
		local386.anInt5519 = local32 + local20;
		Static463.aClass181_53.method3973(local386);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IILclient!gi;I)V")
	public static void method5084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2) {
		@Pc(8) Class102 local8 = arg2.method2124(Static257.aClass75_8);
		if (local8 == null) {
			return;
		}
		Static257.aClass75_8.ba(arg0, arg1, arg2.anInt2436 + arg0, arg1 - -arg2.anInt2495);
		if (Static433.anInt7312 < 3) {
			Static54.aClass41_2.method6087((float) arg0 + (float) arg2.anInt2436 / 2.0F, (float) arg2.anInt2495 / 2.0F + (float) arg1, ((int) -Static37.aFloat9 & 0x3FFF) << 2, local8, arg0, arg1);
		} else {
			Static257.aClass75_8.ra(-16777216, local8, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!gi;B)Lclient!gi;")
	public static Class93 method5087(@OriginalArg(0) Class93 arg0) {
		@Pc(11) Class93 local11 = Static53.method866(arg0);
		if (local11 == null) {
			local11 = arg0.aClass93_6;
		}
		return local11;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZII)V")
	public static void method5095(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg2 * Static434.aClass165_Sub1_1.anInt4208 >> 8;
		if (arg0 == -1 && !Static235.aBoolean262) {
			Static95.method1417();
		} else if (arg0 != -1 && (Static323.anInt5772 != arg0 || !Static67.method1062()) && local11 != 0 && !Static235.aBoolean262) {
			Static415.method5705(arg1, local11, Static431.aClass171_95, arg0);
		}
		Static323.anInt5772 = arg0;
	}
}
