import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!rj", name = "O", descriptor = "F")
	public static float aFloat184;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
	public static int anInt5913 = 0;

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "[I")
	public static final int[] anIntArray414 = new int[3];

	@OriginalMember(owner = "client!rj", name = "N", descriptor = "Z")
	public static boolean aBoolean549 = false;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLclient!wn;[[B)V")
	public static void method4655(@OriginalArg(1) Class266_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(15) int local15 = Static386.aByteArrayArray15.length;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(35) int local35 = (Static308.anIntArray372[local17] >> 8) * 64 - Static180.anInt3453;
				@Pc(46) int local46 = (Static308.anIntArray372[local17] & 0xFF) * 64 - Static86.anInt1771;
				Static159.method2701();
				arg0.method5646(Static175.aClass213Array1, local46, local23, local35, Static122.aClass19_16);
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Z")
	public static boolean method4656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static83.method1510(arg1, arg0) || Static273.method3914(arg0, arg1);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)V")
	public static void method4658(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static118.aClass89_5.method2340(Static391.aClass83_133.method2267(Static178.anInt3423));
		@Pc(24) int local24;
		for (@Pc(18) Class4_Sub39 local18 = (Class4_Sub39) Static206.aClass183_28.method4140(); local18 != null; local18 = (Class4_Sub39) Static206.aClass183_28.method4144()) {
			local24 = Static210.method3197(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static407.anInt6710 * 16 + 21;
		@Pc(54) int local54 = arg1 - local13 / 2;
		if (Static141.anInt2881 < local13 + local54) {
			local54 = Static141.anInt2881 - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(73) int local73 = arg0;
		if (Static302.anInt5346 < arg0 + local24) {
			local73 = Static302.anInt5346 - local24;
		}
		Static310.anInt5424 = local54;
		if (local73 < 0) {
			local73 = 0;
		}
		Static234.aBoolean411 = true;
		Static172.anInt3367 = local73;
		Static173.anInt3370 = local13;
		Static112.anInt2392 = (Static299.aBoolean481 ? 26 : 22) + Static407.anInt6710 * 16;
	}
}
