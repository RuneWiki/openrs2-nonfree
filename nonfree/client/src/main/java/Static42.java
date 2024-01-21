import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!la;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_365 = Static177.method3050("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_366 = Static177.method3050("Connection lost)3");

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public static int anInt1067 = 0;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	public static int anInt1069 = 0;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!jd;")
	public static Class46 aClass46_367 = aClass46_366;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class4_Sub13 local7 = null;
		for (@Pc(16) Class4_Sub13 local16 = (Class4_Sub13) Static185.aClass11_16.method274(); local16 != null; local16 = (Class4_Sub13) Static185.aClass11_16.method271()) {
			if (local16.anInt2390 == arg0 && local16.anInt2391 == arg4 && local16.anInt2389 == arg6 && local16.anInt2382 == arg8) {
				local7 = local16;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class4_Sub13();
			local7.anInt2391 = arg4;
			local7.anInt2389 = arg6;
			local7.anInt2382 = arg8;
			local7.anInt2390 = arg0;
			Static170.method2915(local7);
			Static185.aClass11_16.method272(local7);
		}
		local7.anInt2374 = arg3;
		local7.anInt2381 = arg5;
		local7.anInt2378 = arg2;
		local7.anInt2375 = arg7;
		local7.anInt2379 = arg1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public static void method715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class4_Sub1_Sub2 local7 = Static188.method3182(arg1);
		@Pc(15) int local15 = local7.anInt211;
		@Pc(18) int local18 = local7.anInt218;
		@Pc(21) int local21 = local7.anInt220;
		@Pc(28) int local28 = Class14.anIntArray58[local21 - local15];
		if (arg0 < 0 || local28 < arg0) {
			arg0 = 0;
		}
		local28 <<= local15;
		Static147.anIntArray64[local18] = Static147.anIntArray64[local18] & ~local28 | arg0 << local15 & local28;
	}
}
