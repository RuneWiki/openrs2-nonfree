import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
	public static int anInt5410;

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "Lclient!f;")
	public static Class14 aClass14_17;

	@OriginalMember(owner = "client!lw", name = "s", descriptor = "I")
	public static int anInt5421;

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "[Lclient!gu;")
	public static Class119_Sub1[] aClass119_Sub1Array1;

	@OriginalMember(owner = "client!lw", name = "i", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_109 = new Class56(37, 1);

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "I")
	public static final int anInt5414 = 1403;

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "Z")
	public static boolean aBoolean399 = false;

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "[I")
	public static final int[] anIntArray307 = new int[] { 25000, 2000 };

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)Z")
	public static boolean method4651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static422.method7213(arg0, arg1) & (Static269.method4101(arg1, arg0) | (arg1 & 0x2000) != 0 | Static398.method5800(arg0, arg1));
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIB)Z")
	public static boolean method4652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V")
	public static void method4654() {
		Static61.anInt1462 = -1;
		Static570.anInt9273 = 1;
		if (Static205.aString25 == null) {
			Static526.method7023(35);
		} else {
			@Pc(24) Class3_Sub11 local24 = new Class3_Sub11(Static90.method1710(Static414.method5927(Static205.aString25)));
			@Pc(30) long local30 = local24.method5226();
			Static576.aLong269 = local24.method5226();
			Static259.method3987(true, Static596.method7952(local30), "");
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)I")
	public static int method4655(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local13 - local22 || local20 - local24 < local11) {
			if (local8 <= local13 - local22) {
				return -1;
			}
			if (local20 - local24 >= local11) {
				return 1;
			}
			@Pc(63) char local63;
			if (local22 == '\u0000') {
				local63 = arg0.charAt(local13++);
			} else {
				local63 = local22;
			}
			@Pc(76) char local76;
			if (local24 == '\u0000') {
				local76 = arg2.charAt(local20++);
			} else {
				local76 = local24;
			}
			local22 = Static549.method7293(local63);
			local24 = Static549.method7293(local76);
			local63 = Static551.method7302(arg1, local63);
			local76 = Static551.method7302(arg1, local76);
			if (local76 != local63 && Character.toUpperCase(local63) != Character.toUpperCase(local76)) {
				local63 = Character.toLowerCase(local63);
				local76 = Character.toLowerCase(local76);
				if (local76 != local63) {
					return Static458.method6412(arg1, local63) - Static458.method6412(arg1, local76);
				}
			}
		}
		@Pc(143) int local143 = Math.min(local8, local11);
		for (@Pc(145) int local145 = 0; local145 < local143; local145++) {
			if (arg1 == 2) {
				local20 = local11 - local145 - 1;
				local13 = local8 - local145 - 1;
			} else {
				local20 = local145;
				local13 = local145;
			}
			@Pc(176) char local176 = arg0.charAt(local13);
			@Pc(180) char local180 = arg2.charAt(local20);
			if (local176 != local180 && Character.toUpperCase(local176) != Character.toUpperCase(local180)) {
				local176 = Character.toLowerCase(local176);
				local180 = Character.toLowerCase(local180);
				if (local176 != local180) {
					return Static458.method6412(arg1, local176) - Static458.method6412(arg1, local180);
				}
			}
		}
		@Pc(224) int local224 = local8 - local11;
		if (local224 != 0) {
			return local224;
		}
		for (@Pc(233) int local233 = 0; local233 < local143; local233++) {
			@Pc(239) char local239 = arg0.charAt(local233);
			@Pc(243) char local243 = arg2.charAt(local233);
			if (local243 != local239) {
				return Static458.method6412(arg1, local239) - Static458.method6412(arg1, local243);
			}
		}
		return 0;
	}
}
