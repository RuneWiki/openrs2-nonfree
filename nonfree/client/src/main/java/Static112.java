import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_842 = Static151.method2243("button near the top of that page)3");

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!mb;")
	public static Class62 aClass62_841 = aClass62_842;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_843 = Static151.method2243("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!ld", name = "D", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_845 = Static151.method2243("<col=ffffff>");

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
	public static int anInt2448 = 1;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
	public static int anInt2449 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIILclient!mf;IZJ)Z")
	public static boolean method1716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class7 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static198.anInt4147 || local4 >= Static12.anInt319) {
					return false;
				}
				@Pc(25) Class2_Sub18 local25 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt3292 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class39 local49 = new Class39();
		local49.aLong54 = arg11;
		local49.anInt1483 = arg0;
		local49.anInt1473 = arg5;
		local49.anInt1477 = arg6;
		local49.anInt1479 = arg7;
		local49.aClass7_5 = arg8;
		local49.anInt1474 = arg9;
		local49.anInt1480 = arg1;
		local49.anInt1484 = arg2;
		local49.anInt1481 = arg1 + arg3 - 1;
		local49.anInt1482 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static92.aClass2_Sub18ArrayArrayArray1[local124][local92][local95] == null) {
						Static92.aClass2_Sub18ArrayArrayArray1[local124][local92][local95] = new Class2_Sub18(local124, local92, local95);
					}
				}
				@Pc(157) Class2_Sub18 local157 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][local92][local95];
				local157.aClass39Array2[local157.anInt3292] = local49;
				local157.anIntArray286[local157.anInt3292] = local98;
				local157.anInt3300 |= local98;
				local157.anInt3292++;
			}
		}
		if (arg10) {
			Static192.aClass39Array3[Static133.anInt2867++] = local49;
		}
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[B)V")
	public static void method1718(@OriginalArg(1) byte[] arg0) {
		@Pc(3) int local3 = 0;
		while (true) {
			while (arg0.length > local3) {
				@Pc(16) int local16 = (arg0[local3++] & 0xFF) * 64 - Static24.anInt573;
				@Pc(28) int local28 = (arg0[local3++] & 0xFF) * 64 - Static128.anInt142;
				@Pc(79) byte local79;
				@Pc(57) int local57;
				if (local16 > 0 && local28 > 0 && local16 + 64 < Static173.anInt3686 && Static104.anInt2340 > local28 + 64) {
					local57 = local16 >> 6;
					@Pc(66) int local66 = Static104.anInt2340 - local28 - 1 >> 6;
					for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
						for (@Pc(72) int local72 = -64; local72 < 0; local72++) {
							local79 = arg0[local3++];
							if (local79 != 0) {
								if (Static29.aByteArrayArrayArray4[local57][local66] == null) {
									Static29.aByteArrayArrayArray4[local57][local66] = new byte[4096];
								}
								Static29.aByteArrayArrayArray4[local57][local66][(-(local72 + 1) << 6) + local68] = local79;
								@Pc(118) byte local118 = arg0[local3++];
								if (Static42.aByteArrayArrayArray18[local57][local66] == null) {
									Static42.aByteArrayArrayArray18[local57][local66] = new byte[4096];
								}
								Static42.aByteArrayArrayArray18[local57][local66][local68 + (-(local72 + 1) << 6)] = local118;
							}
						}
					}
				} else {
					for (local57 = -4096; local57 < 0; local57++) {
						local79 = arg0[local3++];
						if (local79 != 0) {
							local3++;
						}
					}
				}
			}
			return;
		}
	}
}
