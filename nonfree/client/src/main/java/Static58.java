import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dl", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString36;

	@OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
	public static int anInt1259;

	@OriginalMember(owner = "client!dl", name = "R", descriptor = "Lclient!am;")
	public static Class11 aClass11_24;

	@OriginalMember(owner = "client!dl", name = "T", descriptor = "Z")
	public static boolean aBoolean95;

	@OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
	public static int anInt1260 = -1;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BZ)C")
	public static char method1043(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(43) char local43 = Static306.aCharArray6[local7 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local7 = local43;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!vm;Z[[IZI)V")
	public static void method1044(@OriginalArg(0) Class92 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3; local3++) {
			@Pc(15) int[][] local15;
			@Pc(17) int local17;
			@Pc(21) int local21;
			if (arg2 == null) {
				local15 = null;
			} else {
				local15 = new int[Static92.anInt2048 + 1][Static290.anInt5893 + 1];
				for (local17 = 0; local17 <= Static290.anInt5893; local17++) {
					for (local21 = 0; local21 <= Static92.anInt2048; local21++) {
						local15[local21][local17] = Static57.anIntArrayArrayArray4[local3][local21][local17] - arg2[local21][local17];
					}
				}
			}
			local17 = 0;
			local21 = 0;
			if (!arg1) {
				if (aBoolean95) {
					local17 = 2;
				}
				if (Static86.aBoolean166) {
					local21 = 8;
				}
				if (Static192.anInt4154 != 0) {
					if (local3 == 0 || Static161.anInt3644 >= 96) {
						local21 |= 0x10;
					}
					local17 |= 0x1;
				}
			}
			if (aBoolean95) {
				local21 |= 0x7;
			}
			@Pc(109) Class26 local109 = arg0.method4518(Static92.anInt2048, Static290.anInt5893, Static57.anIntArrayArrayArray4[local3], local15, local17, local21);
			Static225.method3868(local3, local109);
		}
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)V")
	public static void method1045() {
		Static27.anInt450 = 0;
		Static270.anInt6606 = -1;
		Static219.anInt4563 = -1;
		Static321.anInt6340 = -1;
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
	public static void method1047() {
		Static217.aByteArrayArrayArray7 = null;
		Static269.aByteArrayArrayArray10 = null;
		Static336.anIntArray529 = null;
		Static217.anIntArray375 = null;
		Static83.aByteArrayArrayArray2 = null;
		Static83.anIntArray174 = null;
		Static57.anIntArrayArrayArray4 = null;
		Static56.anIntArray140 = null;
		Static212.anIntArray370 = null;
		Static226.aByteArrayArrayArray8 = null;
		Static98.anIntArray525 = null;
		Static230.aByteArrayArrayArray9 = null;
	}
}
