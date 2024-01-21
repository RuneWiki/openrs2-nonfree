import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!md", name = "g", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray28;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public static int anInt2118 = 0;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!lc;")
	public static Class31 aClass31_743 = Static56.method1206("(U1");

	@OriginalMember(owner = "client!md", name = "f", descriptor = "[I")
	public static int[] anIntArray296 = new int[500];

	@OriginalMember(owner = "client!md", name = "p", descriptor = "Lclient!lc;")
	public static Class31 aClass31_744 = Static56.method1206("m");

	@OriginalMember(owner = "client!md", name = "r", descriptor = "J")
	public static long aLong56 = 0L;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "Lclient!lc;")
	public static Class31 aClass31_745 = Static56.method1206(" from your friend list first");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public static void method1319() {
		Static28.aClass9_11.method861();
		Static34.anIntArray172 = Static97.method1653(Static34.anIntArray172);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)I")
	public static int method1320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class2_Sub1_Sub3_Sub4.anIntArray376[arg1 * 1024 / arg3] >> 1;
		return (arg2 * local21 >> 16) + (arg0 * (65536 - local21) >> 16);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method1321() {
		@Pc(5) Class34 local5 = Static56.aClass34_1;
		synchronized (Static56.aClass34_1) {
			Static68.anInt2205 = Static46.anInt1617;
			Static85.anInt2508 = Static40.anInt2034;
			Static61.anInt2102 = Static65.anInt2154;
			Static49.anInt2693 = Static102.anInt694;
			Static105.anInt2783 = Static82.anInt2305;
			Static15.anInt649 = Static75.anInt2245;
			Static66.aLong58 = Static4.aLong6;
			Static102.anInt694 = 0;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method1322() {
		anIntArray296 = null;
		aByteArrayArrayArray28 = null;
		aClass31_743 = null;
		aClass31_744 = null;
		anIntArray297 = null;
		aClass31_745 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!cb;)V")
	public static void method1323(@OriginalArg(1) Class2_Sub1_Sub3_Sub1 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static4.anIntArray20.length; local9++) {
			Static4.anIntArray20[local9] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) (Math.random() * 128.0D * (double) 256);
			Static4.anIntArray20[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(67) int local67;
		for (local32 = 0; local32 < 20; local32++) {
			for (local55 = 1; local55 < 255; local55++) {
				for (local59 = 1; local59 < 127; local59++) {
					local67 = (local55 << 7) + local59;
					Static78.anIntArray320[local67] = (Static4.anIntArray20[local67 + 128] + Static4.anIntArray20[local67 - 128] + Static4.anIntArray20[local67 - 1] + Static4.anIntArray20[local67 - -1]) / 4;
				}
			}
			@Pc(112) int[] local112 = Static4.anIntArray20;
			Static4.anIntArray20 = Static78.anIntArray320;
			Static78.anIntArray320 = local112;
		}
		if (arg0 == null) {
			return;
		}
		local55 = 0;
		for (local59 = 0; local59 < arg0.anInt436; local59++) {
			for (local67 = 0; local67 < arg0.anInt432; local67++) {
				if (arg0.aByteArray7[local55++] != 0) {
					@Pc(145) int local145 = arg0.anInt433 + local59 + 16;
					@Pc(152) int local152 = arg0.anInt431 + local67 + 16;
					@Pc(158) int local158 = local152 + (local145 << 7);
					Static4.anIntArray20[local158] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lclient!lc;")
	public static Class31 method1324(@OriginalArg(1) int arg0) {
		if (Static40.anInt2026 + 10 < arg0) {
			return Static57.aClass31_931;
		}
		@Pc(16) Calendar local16 = Calendar.getInstance();
		@Pc(23) long local23 = ((long) arg0 + 11745L) * 86400000L;
		local16.setTime(new Date(local23));
		@Pc(38) int local38 = local16.get(5);
		@Pc(42) int local42 = local16.get(2);
		@Pc(46) int local46 = local16.get(1);
		@Pc(97) Class31[] local97 = new Class31[] { Static87.aClass31_814, Static48.aClass31_620, Static92.aClass31_566, Static102.aClass31_217, Static47.aClass31_613, Static90.aClass31_842, Static27.aClass31_381, Static101.aClass31_946, Static80.aClass31_311, Static79.aClass31_799, Static39.aClass31_532, Static30.aClass31_425 };
		return Static37.method974(new Class31[] { Static89.method1499(local38), Static4.aClass31_59, local97[local42], Static4.aClass31_59, Static89.method1499(local46) });
	}
}
