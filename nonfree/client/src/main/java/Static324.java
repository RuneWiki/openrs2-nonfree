import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!ni;")
	public static final Class178 aClass178_18 = new Class178("LIVE", 0);

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[100];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4280(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg2.indexOf(arg0); local9 != -1; local9 = arg2.indexOf(arg0, local9 + arg1.length())) {
			arg2 = arg2.substring(0, local9) + arg1 + arg2.substring(arg0.length() + local9);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BII)V")
	public static void method4281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static363.aClass158_11.method3038(Static236.aClass15_64.method180(Static429.anInt6999));
		@Pc(26) int local26;
		for (@Pc(20) Class4_Sub30 local20 = (Class4_Sub30) Static41.aClass244_2.method5263(); local20 != null; local20 = (Class4_Sub30) Static41.aClass244_2.method5271()) {
			local26 = Static406.method5509(local20);
			if (local15 < local26) {
				local15 = local26;
			}
		}
		local15 += 8;
		local26 = Static351.anInt5841 * 16 + 21;
		@Pc(66) int local66 = arg0 - local15 / 2;
		if (local66 + local15 > Static345.anInt5723) {
			local66 = Static345.anInt5723 - local15;
		}
		if (local66 < 0) {
			local66 = 0;
		}
		@Pc(86) int local86 = arg1;
		if (Static120.anInt2134 < arg1 + local26) {
			local86 = Static120.anInt2134 - local26;
		}
		if (local86 < 0) {
			local86 = 0;
		}
		Static50.anInt816 = local66;
		Static128.anInt7338 = local15;
		Static339.aBoolean390 = true;
		Static328.anInt5318 = local86;
		Static30.anInt522 = Static351.anInt5841 * 16 + (Static265.aBoolean325 ? 26 : 22);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZII)I")
	public static int method4283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class100.anIntArray208[arg1 * 8192 / arg3] >> 1;
		return (arg0 * local16 >> 16) + (arg2 * (65536 - local16) >> 16);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
	public static void method4285() {
		for (@Pc(10) Class4_Sub22 local10 = (Class4_Sub22) Static125.aClass244_10.method5263(); local10 != null; local10 = (Class4_Sub22) Static125.aClass244_10.method5271()) {
			if (local10.aBoolean283) {
				local10.method3049();
			}
		}
		for (@Pc(37) Class4_Sub22 local37 = (Class4_Sub22) Static273.aClass244_23.method5263(); local37 != null; local37 = (Class4_Sub22) Static273.aClass244_23.method5271()) {
			if (local37.aBoolean283) {
				local37.method3049();
			}
		}
	}
}
