import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
	public static int anInt4561;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray41;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "Z")
	public static boolean aBoolean243;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
	public static int anInt4565;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public static int anInt4560 = 0;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Lclient!pl;")
	public static Class124 aClass124_1 = new Class124();

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
	public static int anInt4563 = 128;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
	public static int[] anIntArray466 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString146 = "Starting 3d Library";

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([Lclient!ok;IB)V")
	public static void method3643(@OriginalArg(0) Class116[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(15) Class116 local15 = arg0[local3];
			if (local15 != null && local15.anInt4344 == arg1 && (!local15.aBoolean224 || !Static37.method854(local15))) {
				if (local15.anInt4376 == 0) {
					if (!local15.aBoolean224 && Static37.method854(local15) && local15 != Static110.aClass116_6) {
						continue;
					}
					method3643(arg0, local15.anInt4290);
					if (local15.aClass116Array1 != null) {
						method3643(local15.aClass116Array1, local15.anInt4290);
					}
					@Pc(70) Class1_Sub12 local70 = (Class1_Sub12) Static147.aClass117_12.method3438((long) local15.anInt4290);
					if (local70 != null) {
						Static140.method2512(local70.anInt2230);
					}
				}
				if (local15.anInt4376 == 6) {
					@Pc(102) int local102;
					if (local15.anInt4367 != -1 || local15.anInt4383 != -1) {
						@Pc(97) boolean local97 = Static68.method1299(local15);
						if (local97) {
							local102 = local15.anInt4383;
						} else {
							local102 = local15.anInt4367;
						}
						if (local102 != -1) {
							@Pc(117) Class163 local117 = Static115.method1895(local102);
							if (local117 != null) {
								local15.anInt4369 += Static112.anInt2417;
								while (local15.anInt4369 > local117.anIntArray589[local15.anInt4374]) {
									local15.anInt4369 -= local117.anIntArray589[local15.anInt4374];
									local15.anInt4374++;
									if (local15.anInt4374 >= local117.anIntArray587.length) {
										local15.anInt4374 -= local117.anInt5904;
										if (local15.anInt4374 < 0 || local117.anIntArray587.length <= local15.anInt4374) {
											local15.anInt4374 = 0;
										}
									}
									local15.anInt4380 = local15.anInt4374 + 1;
									if (local15.anInt4380 >= local117.anIntArray587.length) {
										local15.anInt4380 -= local117.anInt5904;
										if (local15.anInt4380 < 0 || local117.anIntArray587.length <= local15.anInt4380) {
											local15.anInt4380 = -1;
										}
									}
									Static189.method3378(local15);
								}
							}
						}
					}
					if (local15.anInt4354 != 0 && !local15.aBoolean224) {
						@Pc(236) int local236 = local15.anInt4354 >> 16;
						@Pc(240) int local240 = local236 * Static112.anInt2417;
						local102 = local15.anInt4354 << 16 >> 16;
						local15.anInt4362 = local240 + local15.anInt4362 & 0x7FF;
						local102 *= Static112.anInt2417;
						local15.anInt4361 = local15.anInt4361 + local102 & 0x7FF;
						Static189.method3378(local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIII)V")
	public static void method3644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static31.anInt803; local12++) {
			if (Static120.anIntArray298[local12] + Static129.anIntArray268[local12] > arg1 && arg0 + arg1 > Static120.anIntArray298[local12] && arg3 < Static144.anIntArray299[local12] + Static32.anIntArray89[local12] && arg3 + arg2 > Static32.anIntArray89[local12]) {
				Static165.aBooleanArray16[local12] = true;
			}
		}
	}
}
