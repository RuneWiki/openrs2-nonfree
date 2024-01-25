import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!ufa", name = "l", descriptor = "Lclient!st;")
	public static final Class314 aClass314_141 = new Class314(13, 2);

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III)I")
	public static int method8037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static330.anIntArray341[arg0 & 0x3] : Static637.anIntArray621[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)[Lclient!gga;")
	public static Class126[] method8038() {
		return new Class126[] { Static284.aClass126_1, Static284.aClass126_2, Static284.aClass126_3, Static284.aClass126_4, Static284.aClass126_5, Static284.aClass126_6, Static284.aClass126_7, Static284.aClass126_8, Static284.aClass126_9, Static284.aClass126_10, Static284.aClass126_11, Static284.aClass126_12 };
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)V")
	public static void method8040(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub7_Sub17 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class91 local8 = Static518.aClass91Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static547.anInt9143; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static573.anInt6750; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static485.anInt8241;
							@Pc(32) int local32 = local12 << Static485.anInt8241;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class91 local41 = Static518.aClass91Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7724(local12, local15) - local41.method7724(local12, local15);
									@Pc(71) int local71 = local8.method7724(local12, local15 + 1) - local41.method7724(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7724(local12 + 1, local15 + 1) - local41.method7724(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7724(local12 + 1, local15) - local41.method7724(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method8041(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub40 local14 = (Class3_Sub40) Static580.aClass25_45.method426((long) arg0);
		if (local14 != null) {
			@Pc(23) Class3_Sub23_Sub1 local23 = local14.aClass172_Sub1_1.method7052();
			if (local23 != null) {
				@Pc(30) double local30 = local14.aClass172_Sub1_1.method7046();
				if ((double) local23.method4093() <= local30 && local30 <= (double) local23.method4095()) {
					return local23.method4096();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIB)Z")
	public static boolean method8042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
