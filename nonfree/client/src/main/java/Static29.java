import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "Lclient!qc;")
	private static Class60 aClass60_333 = Static121.method2047("glow1:");

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_324 = aClass60_333;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
	public static int anInt824 = -1;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "Lclient!qc;")
	private static Class60 aClass60_332 = Static121.method2047("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "Lclient!qc;")
	public static Class60 aClass60_325 = aClass60_332;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "Lclient!qc;")
	public static Class60 aClass60_326 = Static121.method2047("Sprites geladen)3");

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Lclient!qc;")
	public static Class60 aClass60_327 = Static121.method2047(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "Lclient!qc;")
	private static Class60 aClass60_331 = Static121.method2047("level)2");

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "Lclient!qc;")
	public static Class60 aClass60_328 = aClass60_331;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "Lclient!qc;")
	public static Class60 aClass60_329 = aClass60_333;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
	public static boolean method579(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI[Lclient!qc;I)Lclient!qc;")
	public static Class60 method580(@OriginalArg(1) int arg0, @OriginalArg(2) Class60[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			if (arg1[local17 + arg2] == null) {
				arg1[local17 + arg2] = Static90.aClass60_873;
			}
			local7 += arg1[arg2 + local17].anInt2310;
		}
		@Pc(51) byte[] local51 = new byte[local7];
		@Pc(53) int local53 = 0;
		@Pc(63) Class60 local63;
		for (@Pc(55) int local55 = 0; local55 < arg0; local55++) {
			local63 = arg1[arg2 + local55];
			Static135.method1053(local63.aByteArray89, 0, local51, local53, local63.anInt2310);
			local53 += local63.anInt2310;
		}
		local63 = new Class60();
		local63.anInt2310 = local7;
		local63.aByteArray89 = local51;
		return local63;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!q;)Z")
	public static boolean method581(@OriginalArg(1) Class4_Sub17 arg0) {
		@Pc(2) int local2 = arg0.anInt2227;
		if (local2 == 205) {
			Static3.anInt33 = 250;
			return true;
		}
		@Pc(38) int local38;
		@Pc(32) int local32;
		if (local2 >= 300 && local2 <= 313) {
			local32 = local2 & 0x1;
			local38 = (local2 - 300) / 2;
			Static112.aClass36_2.method1034(local38, local32 == 1);
		}
		if (local2 >= 314 && local2 <= 323) {
			local32 = local2 & 0x1;
			local38 = (local2 - 314) / 2;
			Static112.aClass36_2.method1031(local32 == 1, local38);
		}
		if (local2 == 324) {
			Static112.aClass36_2.method1038(false);
		}
		if (local2 == 325) {
			Static112.aClass36_2.method1038(true);
		}
		if (local2 == 326) {
			Static56.aClass4_Sub13_Sub1_1.method1265(123);
			Static112.aClass36_2.method1037(Static56.aClass4_Sub13_Sub1_1);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V")
	public static void method582() {
		aClass60_326 = null;
		aClass60_329 = null;
		aClass60_327 = null;
		aClass60_331 = null;
		aClass60_325 = null;
		aClass60_333 = null;
		aClass60_332 = null;
		aClass60_324 = null;
		aClass60_328 = null;
	}
}
