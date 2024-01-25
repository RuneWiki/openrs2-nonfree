import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!d", name = "Vc", descriptor = "I")
	public static int anInt2160;

	@OriginalMember(owner = "client!d", name = "bd", descriptor = "[Lclient!at;")
	public static Class21_Sub1_Sub1[] aClass21_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!d", name = "ld", descriptor = "I")
	public static int anInt2172;

	@OriginalMember(owner = "client!d", name = "od", descriptor = "I")
	public static int anInt2175;

	@OriginalMember(owner = "client!d", name = "Tc", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!d", name = "ed", descriptor = "[I")
	public static final int[] anIntArray105 = new int[32];

	@OriginalMember(owner = "client!d", name = "hd", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_14 = new Class344(58, 3);

	@OriginalMember(owner = "client!d", name = "rd", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[ILclient!d;[I[I)V")
	public static void method1708(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class21_Sub1_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(15) int local15 = arg3[local7];
			@Pc(19) int local19 = arg0[local7];
			@Pc(23) int local23 = arg2[local7];
			@Pc(25) int local25 = 0;
			while (local19 != 0 && arg1.aClass237Array3.length > local25) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg1.aClass237Array3[local25] = null;
					} else {
						@Pc(43) Class111 local43 = Static17.aClass254_1.method5936(local15);
						@Pc(46) int local46 = local43.anInt3148;
						@Pc(51) Class237 local51 = arg1.aClass237Array3[local25];
						if (local51 != null) {
							if (local51.anInt6861 == local15) {
								if (local46 == 0) {
									local51 = arg1.aClass237Array3[local25] = null;
								} else if (local46 == 1) {
									local51.anInt6863 = 1;
									local51.anInt6858 = 0;
									local51.anInt6860 = local23;
									local51.anInt6864 = 0;
									local51.anInt6862 = 0;
									if (!arg1.aBoolean295) {
										Static593.method8263(0, arg1, local43);
									}
								} else if (local46 == 2) {
									local51.anInt6864 = 0;
								}
							} else if (local43.anInt3152 >= Static17.aClass254_1.method5936(local51.anInt6861).anInt3152) {
								local51 = arg1.aClass237Array3[local25] = null;
							}
						}
						if (local51 == null) {
							local51 = arg1.aClass237Array3[local25] = new Class237();
							local51.anInt6862 = 0;
							local51.anInt6863 = 1;
							local51.anInt6860 = local23;
							local51.anInt6861 = local15;
							local51.anInt6858 = 0;
							local51.anInt6864 = 0;
							if (!arg1.aBoolean295) {
								Static593.method8263(0, arg1, local43);
							}
						}
					}
				}
				local25++;
				local19 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(ILjava/lang/String;)I")
	public static int method1711(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = Static220.method7179(arg0.charAt(local17)) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II[B)[B")
	public static byte[] method1712(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static599.method3060(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
