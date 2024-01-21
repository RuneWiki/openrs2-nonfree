import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1493 = Static161.method2452(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1494 = Static161.method2452("<col=ff0000>");

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public static int anInt3990 = 0;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1495 = Static161.method2452("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class64 local3 = new Class64();
		local3.anInt2389 = arg2 / 128;
		local3.anInt2373 = arg3 / 128;
		local3.anInt2379 = arg4 / 128;
		local3.anInt2386 = arg5 / 128;
		local3.anInt2396 = arg1;
		local3.anInt2395 = arg2;
		local3.anInt2381 = arg3;
		local3.anInt2392 = arg4;
		local3.anInt2382 = arg5;
		local3.anInt2380 = arg6;
		local3.anInt2378 = arg7;
		Static77.aClass64ArrayArray11[arg0][Static77.anIntArray351[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIZI)V")
	public static void method3020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static171.method2627(Static173.anInt3464, arg0, Static174.anInt3493);
		@Pc(22) int local22 = Static171.method2627(Static173.anInt3464, arg3, Static174.anInt3493);
		@Pc(28) int local28 = Static171.method2627(Static27.anInt493, arg1, Static72.anInt1572);
		@Pc(34) int local34 = Static171.method2627(Static27.anInt493, arg4, Static72.anInt1572);
		for (@Pc(36) int local36 = local16; local36 <= local22; local36++) {
			Static27.method409(local34, arg2, Static9.anIntArrayArray1[local36], local28);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
	public static int method3021(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}
}
