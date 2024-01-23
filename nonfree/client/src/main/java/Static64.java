import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "Lclient!ek;")
	public static Class42 aClass42_17;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
	public static int anInt1560;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Lclient!l;")
	public static Class101 aClass101_2;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "J")
	public static long aLong55;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	public static int anInt1562;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
	public static int[] anIntArray133 = new int[5];

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "[Lclient!mi;")
	public static Class112[] aClass112Array3 = new Class112[14];

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
	public static int[] anIntArray134 = new int[2500];

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
	public static int anInt1561 = 0;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString58 = "Opened title screen";

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method1185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static38.anInt954 * 128) {
			arg0 = Static38.anInt954 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static232.anInt4680 * 128) {
			arg2 = Static232.anInt4680 * 128 - 1;
		}
		Static192.anInt4024 = Class1.anIntArray4[arg3];
		Static100.anInt2374 = Class1.anIntArray3[arg3];
		Static222.anInt4524 = Class1.anIntArray4[arg4];
		Static20.anInt418 = Class1.anIntArray3[arg4];
		Static10.anInt148 = arg0;
		Static268.anInt5235 = arg1;
		Static18.anInt389 = arg2;
		Static290.anInt5686 = arg0 / 128;
		Static72.anInt1815 = arg2 / 128;
		Static82.anInt1918 = Static290.anInt5686 - Static243.anInt4841;
		if (Static82.anInt1918 < 0) {
			Static82.anInt1918 = 0;
		}
		Static281.anInt5559 = Static72.anInt1815 - Static243.anInt4841;
		if (Static281.anInt5559 < 0) {
			Static281.anInt5559 = 0;
		}
		Static276.anInt5467 = Static290.anInt5686 + Static243.anInt4841;
		if (Static276.anInt5467 > Static38.anInt954) {
			Static276.anInt5467 = Static38.anInt954;
		}
		Static84.anInt1964 = Static72.anInt1815 + Static243.anInt4841;
		if (Static84.anInt1964 > Static232.anInt4680) {
			Static84.anInt1964 = Static232.anInt4680;
		}
		@Pc(99) short local99;
		if (Static116.aBoolean184) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static243.anInt4841 + Static243.anInt4841 + 2; local104++) {
			for (local113 = 0; local113 < Static243.anInt4841 + Static243.anInt4841 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static243.anInt4841 << 7) - (Static10.anInt148 & 0x7F);
				@Pc(140) int local140 = (local113 - Static243.anInt4841 << 7) - (Static18.anInt389 & 0x7F);
				@Pc(146) int local146 = Static290.anInt5686 + local104 - Static243.anInt4841;
				@Pc(152) int local152 = Static72.anInt1815 + local113 - Static243.anInt4841;
				if (local146 >= 0 && local152 >= 0 && local146 < Static38.anInt954 && local152 < Static232.anInt4680) {
					@Pc(176) int local176;
					if (Static85.anIntArrayArrayArray4 == null) {
						local176 = Static300.anIntArrayArrayArray15[0][local146][local152] + 128 - Static268.anInt5235;
					} else {
						local176 = Static85.anIntArrayArrayArray4[0][local146][local152] + 128 - Static268.anInt5235;
					}
					@Pc(201) int local201 = Static300.anIntArrayArrayArray15[3][local146][local152] - Static268.anInt5235 - 1000;
					Static269.aBooleanArrayArray4[local104][local113] = Static90.method1598(local130, local201, local176, local140, local99);
				} else {
					Static269.aBooleanArrayArray4[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static243.anInt4841 + Static243.anInt4841 + 1; local104++) {
			for (local113 = 0; local113 < Static243.anInt4841 + Static243.anInt4841 + 1; local113++) {
				Static6.aBooleanArrayArray1[local104][local113] = Static269.aBooleanArrayArray4[local104][local113] || Static269.aBooleanArrayArray4[local104 + 1][local113] || Static269.aBooleanArrayArray4[local104][local113 + 1] || Static269.aBooleanArrayArray4[local104 + 1][local113 + 1];
			}
		}
		Static2.anIntArray11 = arg6;
		Static315.anIntArray604 = arg7;
		Static282.anIntArray530 = arg8;
		Static149.anIntArray329 = arg9;
		Static36.anIntArray82 = arg10;
		Static7.method122();
		if (Static136.aClass2_Sub13ArrayArrayArray3 != null) {
			Static211.method3515(true);
			Static293.method4500(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static116.aBoolean184) {
				Static229.aBoolean306 = false;
				Static118.method1991(0, 0);
				Static235.method3806(null);
				Static212.method3547();
			}
			Static211.method3515(false);
		}
		Static293.method4500(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z[S)[S")
	public static short[] method1187(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) short[] local18 = new short[arg0.length];
			Static323.method3555(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}
}
