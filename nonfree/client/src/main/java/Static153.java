import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!im", name = "M", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_81 = new Class77(102, 12);

	@OriginalMember(owner = "client!im", name = "N", descriptor = "J")
	public static long aLong95 = 0L;

	@OriginalMember(owner = "client!im", name = "Q", descriptor = "[I")
	public static final int[] anIntArray316 = new int[14];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Lclient!fl;")
	public static Class75 method2576(@OriginalArg(0) int arg0) {
		@Pc(8) Class75[] local8 = Static311.method4818();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class75 local16 = local8[local10];
			if (local16.anInt1942 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBIIIII)Lclient!op;")
	public static Class21 method2578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg1 * 32147369L ^ (long) arg0 * 475427L ^ (long) arg2 * 97549L ^ (long) arg3 * 67481L ^ (long) arg4 * 986053L ^ (long) arg5 * 76724863L;
		@Pc(39) Class21 local39 = (Class21) Static391.aClass154_58.method3751(local33);
		if (local39 == null) {
			local39 = Static267.aClass82_6.method4541(arg3, arg2, arg0, arg4, arg1, arg5);
			Static391.aClass154_58.method3745(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!es;)I")
	public static int method2579(@OriginalArg(1) Class12_Sub1_Sub2 arg0) {
		if (arg0.anInt5317 == 0) {
			return 0;
		}
		@Pc(57) int local57;
		@Pc(64) int local64;
		if (arg0.anInt5345 != -1) {
			@Pc(23) Class12_Sub1_Sub2 local23 = null;
			if (arg0.anInt5345 < 32768) {
				local23 = Static107.aClass12_Sub1_Sub2_Sub1Array1[arg0.anInt5345];
			} else if (arg0.anInt5345 >= 32768) {
				local23 = Static90.aClass12_Sub1_Sub2_Sub2Array1[arg0.anInt5345 - 32768];
			}
			if (local23 != null) {
				local57 = arg0.anInt6328 - local23.anInt6328;
				local64 = arg0.anInt6317 - local23.anInt6317;
				if (local57 != 0 || local64 != 0) {
					arg0.method4697((int) (Math.atan2((double) local57, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class12_Sub1_Sub2_Sub2) {
			@Pc(87) Class12_Sub1_Sub2_Sub2 local87 = (Class12_Sub1_Sub2_Sub2) arg0;
			if (local87.anInt5390 != -1 && (local87.anInt5380 == 0 || local87.anInt5377 > 0)) {
				local87.method4697(local87.anInt5390);
				local87.anInt5390 = -1;
			}
		} else if (arg0 instanceof Class12_Sub1_Sub2_Sub1) {
			@Pc(113) Class12_Sub1_Sub2_Sub1 local113 = (Class12_Sub1_Sub2_Sub1) arg0;
			if (local113.anInt3550 != -1 && (local113.anInt5380 == 0 || local113.anInt5377 > 0)) {
				local57 = local113.anInt6328 - (local113.anInt3550 - Static376.anInt6607 - Static376.anInt6607) * 64;
				local64 = local113.anInt6317 - (local113.anInt3545 - Static133.anInt2474 - Static133.anInt2474) * 64;
				if (local57 != 0 || local64 != 0) {
					local113.method4697((int) (Math.atan2((double) local57, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
				local113.anInt3550 = -1;
			}
		}
		return arg0.method4710();
	}

	@OriginalMember(owner = "client!im", name = "f", descriptor = "(I)Ljava/lang/String;")
	public static String method2580() {
		@Pc(7) String local7 = "www";
		if (Static6.aClass143_1 == Static91.aClass143_12) {
			local7 = "www-wtrc";
		} else if (Static91.aClass143_12 == Static384.aClass143_29) {
			local7 = "www-wtqa";
		} else if (Static91.aClass143_12 == Static228.aClass143_20) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static209.aString33 != null) {
			local28 = "/p=" + Static209.aString33;
		}
		return "http://" + local7 + "." + Static209.aClass48_2.aString8 + ".com/l=" + Static189.anInt5185 + "/a=" + Static277.anInt2677 + local28 + "/";
	}
}
