import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!gn;")
	public static Class1_Sub5_Sub2 aClass1_Sub5_Sub2_2;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!km;")
	public static Class91 aClass91_164;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "[Lclient!bc;")
	public static Class12[] aClass12Array6;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString261 = "";

	@OriginalMember(owner = "client!r", name = "e", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "Lclient!fl;")
	public static Class1_Sub15 aClass1_Sub15_2 = new Class1_Sub15(0, -1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(DB)V")
	public static void method3473(@OriginalArg(0) double arg0) {
		if (Static230.aDouble2 == arg0) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(26) int local26 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static83.anIntArray173[local11] = local26 <= 255 ? local26 : 255;
		}
		Static230.aDouble2 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)V")
	public static void method3475(@OriginalArg(0) boolean arg0) {
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (Static277.aBoolean412 && arg0) {
			local11 = Static270.aByteArrayArray14;
			local13 = 1;
		} else {
			local11 = Static16.aByteArrayArray2;
			local13 = 4;
		}
		for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
			Static105.method1947();
			for (@Pc(32) int local32 = 0; local32 < 13; local32++) {
				for (@Pc(39) int local39 = 0; local39 < 13; local39++) {
					@Pc(50) int local50 = Static33.anIntArrayArrayArray2[local21][local32][local39];
					if (local50 != -1) {
						@Pc(60) int local60 = local50 >> 24 & 0x3;
						if (!arg0 || local60 == 0) {
							@Pc(74) int local74 = local50 >> 1 & 0x3;
							@Pc(80) int local80 = local50 >> 14 & 0x3FF;
							@Pc(86) int local86 = local50 >> 3 & 0x7FF;
							@Pc(96) int local96 = local86 / 8 + (local80 / 8 << 8);
							for (@Pc(98) int local98 = 0; local98 < Static24.anIntArray414.length; local98++) {
								if (local96 == Static24.anIntArray414[local98] && local11[local98] != null) {
									Static106.method1950(local74, local32 * 8, local11[local98], local60, local21, arg0, local39 * 8, Static88.aClass92Array1, (local80 & 0x7) * 8, (local86 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V")
	public static void method3478(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		for (@Pc(16) int local16 = 99; local16 > 0; local16--) {
			Static171.anIntArray326[local16] = Static171.anIntArray326[local16 - 1];
			Static88.aStringArray25[local16] = Static88.aStringArray25[local16 - 1];
			Static7.aStringArray28[local16] = Static7.aStringArray28[local16 - 1];
			Static266.aStringArray49[local16] = Static266.aStringArray49[local16 - 1];
			Static283.anIntArray537[local16] = Static283.anIntArray537[local16 - 1];
		}
		Static88.aStringArray25[0] = arg1;
		Static270.anInt5278 = Static23.anInt471;
		Static24.anInt4676++;
		Static171.anIntArray326[0] = arg4;
		Static283.anIntArray537[0] = arg2;
		Static7.aStringArray28[0] = arg0;
		Static266.aStringArray49[0] = arg3;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)I")
	public static int method3479() {
		Static298.anInt5622 = 0;
		return Static255.method3902();
	}
}
