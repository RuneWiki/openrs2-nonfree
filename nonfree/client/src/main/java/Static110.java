import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public static int anInt2060;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	public static int anInt2065;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Lclient!db;")
	public static Class31 aClass31_18 = new Class31(260);

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	public static int anInt2061 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
	public static int method1724() {
		return ((Static99.aBoolean138 ? 1 : 0) << 19) + ((Static57.aBoolean97 ? 1 : 0) << 16) + ((Static282.aBoolean446 ? 1 : 0) << 9) + ((Static294.aBoolean443 ? 1 : 0) << 7) + ((Static160.aBoolean222 ? 1 : 0) << 6) + ((Static287.aBoolean429 ? 1 : 0) << 5) + ((Static16.aBoolean33 ? 1 : 0) << 4) + ((Static13.aBoolean247 ? 1 : 0) << 3) + (Static176.anInt3254 & 0x7) + ((Static51.aBoolean91 ? 1 : 0) << 8) + ((Static97.aBoolean136 ? 1 : 0) << 10) + ((Static235.anInt4896 & 0x3) << 11) + ((Static294.aBoolean445 ? 1 : 0) << 13) + ((Static160.aBoolean223 ? 1 : 0) << 15) + (Static207.anInt4118 << 17) + (((Static73.anInt1433 == 0 ? 0 : 1) << 20) + ((Static259.anInt5233 == 0 ? 0 : 1) << 21) - (-((Static267.anInt5346 == 0 ? 0 : 1) << 22) - (Static200.method3050() << 23)));
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method1725() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static136.aBooleanArray10[local7] = false;
		}
		Static146.anInt2693 = -1;
		Static174.anInt3201 = 0;
		Static109.anInt2057 = 5;
		Static156.anInt1710 = 0;
		Static293.anInt5837 = -1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
	public static int method1727(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(27) int local27 = (local19 >>> 4) + local19 & 0xF0F0F0F;
		@Pc(37) int local37 = local27 + (local27 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	public static void method1728() {
		Static122.method1910(0, 0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[BII)I")
	public static int method1729(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg2; local14++) {
			local12 = local12 >>> 8 ^ Class15_Sub1.anIntArray355[(local12 ^ arg1[local14]) & 0xFF];
		}
		return ~local12;
	}
}
