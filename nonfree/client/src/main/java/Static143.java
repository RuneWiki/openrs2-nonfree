import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!p", name = "v", descriptor = "[Lclient!ng;")
	public static Class47_Sub1[] aClass47_Sub1Array1;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!sg;")
	public static Class91 aClass91_13 = new Class91();

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1120 = Static161.method2452(":clan:");

	@OriginalMember(owner = "client!p", name = "p", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array24 = new Class20[100];

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1121 = Static161.method2452("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!p", name = "C", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!p", name = "G", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1124 = Static161.method2452("Loading config )2 ");

	@OriginalMember(owner = "client!p", name = "D", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1122 = aClass20_1124;

	@OriginalMember(owner = "client!p", name = "E", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1123 = Static161.method2452("Ablegen");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I[I)[I")
	public static int[] method2216(@OriginalArg(1) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) int[] local11 = new int[arg0.length];
			Static220.method50(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!ce;IIZIBII)V")
	public static void method2226(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(43) int local43;
		if (arg3 < 0 || arg3 >= 104 || arg0 < 0 || arg0 >= 104) {
			while (true) {
				local43 = arg1.method3062();
				if (local43 == 0) {
					return;
				}
				if (local43 == 1) {
					arg1.method3062();
					return;
				}
				if (local43 <= 49) {
					arg1.method3062();
				}
			}
			return;
		}
		Static168.aByteArrayArrayArray13[arg2][arg3][arg0] = 0;
		while (true) {
			local43 = arg1.method3062();
			if (local43 == 0) {
				if (arg2 == 0) {
					Static37.anIntArrayArrayArray5[0][arg3][arg0] = -Static128.method1994(arg0 + arg6 + 556238, arg4 + arg3 + 932731) * 8;
					return;
				} else {
					Static37.anIntArrayArrayArray5[arg2][arg3][arg0] = Static37.anIntArrayArrayArray5[arg2 - 1][arg3][arg0] - 240;
					return;
				}
			}
			if (local43 == 1) {
				@Pc(119) int local119 = arg1.method3062();
				if (local119 == 1) {
					local119 = 0;
				}
				if (arg2 == 0) {
					Static37.anIntArrayArrayArray5[0][arg3][arg0] = -local119 * 8;
					return;
				}
				Static37.anIntArrayArrayArray5[arg2][arg3][arg0] = Static37.anIntArrayArrayArray5[arg2 - 1][arg3][arg0] - local119 * 8;
				return;
			}
			if (local43 <= 49) {
				Static83.aByteArrayArrayArray5[arg2][arg3][arg0] = arg1.method3053();
				Static168.aByteArrayArrayArray14[arg2][arg3][arg0] = (byte) ((local43 - 2) / 4);
				Static128.aByteArrayArrayArray10[arg2][arg3][arg0] = (byte) (local43 + arg5 - 2 & 0x3);
			} else if (local43 <= 81) {
				Static168.aByteArrayArrayArray13[arg2][arg3][arg0] = (byte) (local43 - 49);
			} else {
				Static93.aByteArrayArrayArray11[arg2][arg3][arg0] = (byte) (local43 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
	public static void method2231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class29 local13 = local7.aClass29_1;
		if (local13 != null) {
			local13.anInt1077 = local13.anInt1077 * arg3 / 16;
			local13.anInt1074 = local13.anInt1074 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(JIBZ)Lclient!dc;")
	public static Class20 method2232(@OriginalArg(0) long arg0) {
		@Pc(26) int local26 = 1;
		@Pc(31) long local31 = arg0 / (long) 10;
		while (local31 != 0L) {
			local31 /= 10;
			local26++;
		}
		@Pc(52) int local52 = local26;
		if (arg0 < 0L) {
			local52 = local26 + 1;
		}
		@Pc(62) byte[] local62 = new byte[local52];
		if (arg0 < 0L) {
			local62[0] = 45;
		}
		for (@Pc(82) int local82 = 0; local82 < local26; local82++) {
			@Pc(90) int local90 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (local90 < 0) {
				local90 = -local90;
			}
			if (local90 > 9) {
				local90 += 39;
			}
			local62[local52 - local82 - 1] = (byte) (local90 + 48);
		}
		@Pc(130) Class20 local130 = new Class20();
		local130.anInt712 = local52;
		local130.aByteArray10 = local62;
		return local130;
	}
}
