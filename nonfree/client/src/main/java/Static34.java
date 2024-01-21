import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "[S")
	public static short[] aShortArray13;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!ke;")
	public static Class5_Sub11 aClass5_Sub11_4;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "J")
	public static long aLong40 = 0L;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
	public static int[] anIntArray159 = new int[] { 0, 0, -2, 0, 10, 6, 3, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 5, 11, 2, 0, 0, 0, 0, 0, 1, 5, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, -2, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 6, -2, 4, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 10, 0, 4, 0, 0, 0, 0, 24, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -2, -2, 0, 0, 3, 11, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 6, 0, 2, 0, -2, 0, -2, 0, 0, 0, 0, 0, 2, -2, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -1, 8, 0, 0, 0, 2, 7, 6, 0, 7, 0, 6, 0, 0, 0, 0, 0, 6, -1, 6, 2, 0, 0, 0, 0, 0, -1, 0, 0, -2, 0, -2, 0, 0, 0, 6, 0, 4, 6, 0, 0, 0, 0, 0, 0, 0, 2, 6, 0, 0, 8, 15, 0, 0, 0, 12, 0, 0, 0, -2, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
	public static int anInt1006 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!ff;Lclient!ff;)V")
	public static void method676(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class26 arg1) {
		Static109.aClass26_28 = arg1;
		Static33.aClass26_4 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	public static void method677() {
		aClass5_Sub11_4 = null;
		aShortArray13 = null;
		anIntArray159 = null;
		anIntArray158 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BZ)V")
	public static void method678(@OriginalArg(1) boolean arg0) {
		if (Static81.aClass30_14 == null) {
			return;
		}
		try {
			@Pc(11) Class5_Sub14 local11 = new Class5_Sub14(4);
			local11.method1440(arg0 ? 2 : 3);
			local11.method1438(0);
			Static81.aClass30_14.method780(local11.aByteArray33, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static81.aClass30_14.method779();
			} catch (@Pc(42) Exception local42) {
			}
			Static81.aClass30_14 = null;
			Static8.anInt194++;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!vd;IIIII)V")
	public static void method679(@OriginalArg(0) Class5_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = arg2 * arg2 + arg4 * arg4;
		if (local11 <= 4225 || local11 >= 90000) {
			Static83.method1502(arg4, arg2, arg0, arg3, arg1);
			return;
		}
		@Pc(26) int local26 = Static91.anInt2422 + Static129.anInt3240 & 0x7FF;
		@Pc(30) int local30 = Class5_Sub2_Sub1_Sub2.anIntArray198[local26];
		@Pc(34) int local34 = Class5_Sub2_Sub1_Sub2.anIntArray197[local26];
		@Pc(42) int local42 = local34 * 256 / (Static129.anInt3235 + 256);
		@Pc(50) int local50 = local30 * 256 / (Static129.anInt3235 + 256);
		@Pc(60) int local60 = local50 * arg2 + local42 * arg4 >> 16;
		@Pc(70) int local70 = local42 * arg2 - arg4 * local50 >> 16;
		@Pc(76) double local76 = Math.atan2((double) local60, (double) local70);
		@Pc(82) int local82 = (int) (Math.sin(local76) * 63.0D);
		@Pc(88) int local88 = (int) (Math.cos(local76) * 57.0D);
		Static129.aClass5_Sub2_Sub1_Sub4_7.method2018(arg3 + local82 + 94 + 4 - 10, -local88 + arg1 - -83 - 20, local76);
	}
}
