import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[B")
	public static final byte[] aByteArray51 = new byte[520];

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	public static int anInt4218 = 0;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
	public static int anInt4221 = 0;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1979 = Static187.method3089("overlay2)3dat");

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1980 = Static187.method3089("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
	public static final int anInt4226 = 4;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1981 = Static187.method3089("runes");

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1982 = Static187.method3089("<)4col>");

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
	public static int anInt4229 = -1;

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "[I")
	public static final int[] anIntArray344 = new int[anInt4226];

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "[[Lclient!oh;")
	public static final Class74[][] aClass74ArrayArray1 = new Class74[anInt4226][500];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ab;I)V")
	public static void method3191(@OriginalArg(0) Class3 arg0) {
		Static71.aClass3_11 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method3192() {
		@Pc(7) int local7 = Static192.anInt4179;
		@Pc(9) int local9 = Static196.anInt4260;
		@Pc(11) int local11 = Static31.anInt737;
		@Pc(13) int local13 = Static170.anInt3552;
		Static46.method3173(local7, local9, local13, local11, 6116423);
		Static46.method3173(local7 + 1, local9 + 1, local13 - 2, 16, 0);
		Static46.method3175(local7 + 1, local9 + 18, local13 - 2, local11 - 19, 0);
		Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2443(Static155.aClass92_1432, local7 + 3, local9 + 14, 6116423, -1);
		@Pc(60) int local60 = Static126.anInt2633;
		@Pc(62) int local62 = Static85.anInt1855;
		for (@Pc(64) int local64 = 0; local64 < Static152.anInt3135; local64++) {
			@Pc(78) int local78 = (Static152.anInt3135 - local64 - 1) * 15 + local9 + 31;
			@Pc(80) int local80 = 16777215;
			if (local62 > local7 && local62 < local13 + local7 && local60 > local78 - 13 && local60 < local78 + 3) {
				local80 = 16776960;
			}
			Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2443(Static29.method553(local64), local7 + 3, local78, local80, 0);
		}
		Static196.method3226(Static192.anInt4179, Static31.anInt737, Static196.anInt4260, Static170.anInt3552);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!ka;)Lclient!tg;")
	public static Class1_Sub1 method3193(@OriginalArg(1) Class1_Sub14 arg0) {
		arg0.method3010();
		@Pc(13) int local13 = arg0.method3010();
		@Pc(17) Class1_Sub1 local17 = Static18.method404(local13);
		local17.anInt4474 = arg0.method3010();
		@Pc(26) int local26 = arg0.method3010();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method3010();
			local17.method3390(arg0, local34);
		}
		local17.method3388();
		return local17;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ba;B)I")
	public static int method3194(@OriginalArg(0) Class11 arg0) {
		@Pc(17) Class1_Sub20 local17 = (Class1_Sub20) Static192.aClass97_22.method3375((long) arg0.anInt272 + ((long) arg0.anInt275 << 32));
		return local17 == null ? arg0.anInt329 : local17.anInt2663;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
	public static boolean method3195(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}
}
