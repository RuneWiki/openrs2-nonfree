import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eda", name = "k", descriptor = "[S")
	public static short[] aShortArray41;

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[100];

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)I")
	public static int method1898(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIIII)V")
	public static void method1902(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static153.anInt2554 = arg0;
		Static55.anInt4238 = 0;
		Static502.anInt8456 = 0;
		Static292.anInt4921 = arg1;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "([Lclient!sha;IZ)V")
	public static void method1904(@OriginalArg(0) Class321[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class321 local13 = arg0[local7];
			if (local13 != null && arg1 == local13.anInt9033 && !Static83.method1460(local13)) {
				if (local13.anInt9105 == 0) {
					method1904(arg0, local13.anInt9040);
					if (local13.aClass321Array1 != null) {
						method1904(local13.aClass321Array1, local13.anInt9040);
					}
					@Pc(47) Class6_Sub51 local47 = (Class6_Sub51) Static262.aClass209_35.method5038((long) local13.anInt9040);
					if (local47 != null) {
						Static663.method8290(local47.anInt9360);
					}
				}
				if (local13.anInt9105 == 6 && local13.anInt9018 != -1) {
					@Pc(68) Class119 local68 = Static334.aClass268_2.method6469(local13.anInt9018);
					if (local68 != null) {
						local13.anInt9010 += Static332.anInt7620;
						@Pc(79) int local79 = local13.anInt9012;
						while (local68.anIntArray168[local13.anInt9012] < local13.anInt9010) {
							local13.anInt9010 -= local68.anIntArray168[local13.anInt9012];
							local13.anInt9012++;
							if (local68.anIntArray167.length <= local13.anInt9012) {
								local13.anInt9012 -= local68.anInt3005;
								if (local13.anInt9012 < 0 || local13.anInt9012 >= local68.anIntArray167.length) {
									local13.anInt9012 = 0;
								}
							}
							local13.anInt9099 = local13.anInt9012 + 1;
							if (local13.anInt9099 >= local68.anIntArray167.length) {
								local13.anInt9099 -= local68.anInt3005;
								if (local13.anInt9099 < 0 || local68.anIntArray167.length <= local13.anInt9099) {
									local13.anInt9099 = -1;
								}
							}
							Static293.method4206(local13);
						}
						if (local13.anInt9012 != local79) {
							Static245.method3612(local13.anInt9012, local68);
						}
					}
				}
			}
		}
	}
}
