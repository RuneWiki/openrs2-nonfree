import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	public static int anInt1301;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Lclient!pi;")
	public static Class182 aClass182_1;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "[S")
	public static short[] aShortArray29;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "Lclient!us;")
	public static final Class234 aClass234_29 = new Class234(81, 8);

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "[I")
	public static final int[] anIntArray126 = new int[5];

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "Z")
	public static boolean aBoolean72 = true;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
	public static int anInt1307 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public static void method1121() {
		@Pc(1) Class139 local1 = Static59.aClass139_8;
		synchronized (Static59.aClass139_8) {
			Static59.aClass139_8.method3072();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!rp;I)V")
	public static void method1124(@OriginalArg(0) Class3_Sub5 arg0) {
		if (arg0.aByteArray42.length - arg0.anInt3121 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method2739();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray42.length - arg0.anInt3121 < 2) {
			return;
		}
		@Pc(45) int local45 = arg0.method2767();
		if (local45 * 6 != arg0.aByteArray42.length - arg0.anInt3121) {
			return;
		}
		while (true) {
			@Pc(61) int local61;
			@Pc(65) int local65;
			do {
				do {
					do {
						if (arg0.anInt3121 >= arg0.aByteArray42.length) {
							return;
						}
						local61 = arg0.method2767();
						local65 = arg0.method2726();
					} while (Static97.anIntArray196.length <= local61);
				} while (!Static29.aBooleanArray105[local61]);
			} while (Static380.aClass17_1.method208(local61).aChar5 == '1' && (local65 < -1 || local65 > 1));
			Static97.anIntArray196[local61] = local65;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BII)V")
	public static void method1125(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(5, arg1);
		local8.method3219();
		local8.anInt3670 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "([B[IB[[B[II[[BI)I")
	public static int method1126(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) byte[][] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1[arg4];
		@Pc(15) int local15 = arg3[arg4] + local9;
		@Pc(19) int local19 = arg1[arg6];
		@Pc(26) int local26 = local19 + arg3[arg6];
		@Pc(28) int local28 = local9;
		if (local9 < local19) {
			local28 = local19;
		}
		@Pc(35) int local35 = local15;
		if (local26 < local15) {
			local35 = local26;
		}
		@Pc(46) int local46 = arg0[arg4] & 0xFF;
		if ((arg0[arg6] & 0xFF) < local46) {
			local46 = arg0[arg6] & 0xFF;
		}
		@Pc(67) byte[] local67 = arg2[arg4];
		@Pc(71) byte[] local71 = arg5[arg6];
		@Pc(75) int local75 = local28 - local9;
		@Pc(80) int local80 = local28 - local19;
		for (@Pc(90) int local90 = local28; local90 < local35; local90++) {
			@Pc(102) int local102 = local71[local80++] + local67[local75++];
			if (local102 < local46) {
				local46 = local102;
			}
		}
		return -local46;
	}
}
