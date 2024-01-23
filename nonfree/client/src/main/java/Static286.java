import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString169;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Lclient!je;")
	public static Class82 aClass82_2;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
	public static int anInt5073 = 0;

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
	public static int anInt5075 = 0;

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "[S")
	public static short[] aShortArray87 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
	public static int anInt5076 = 0;

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
	public static int anInt5079 = 0;

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
	public static int anInt5081 = 0;

	@OriginalMember(owner = "client!vl", name = "s", descriptor = "[I")
	public static int[] anIntArray594 = new int[32];

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[B")
	public static byte[] method3892(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub22 local13 = (Class1_Sub2_Sub22) Static216.aClass64_18.method1471((long) arg0);
		if (local13 == null) {
			@Pc(22) Random local22 = new Random((long) arg0);
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(27) int local27;
			for (local27 = 0; local27 < 255; local27++) {
				local25[local27] = (byte) local27;
			}
			for (local27 = 0; local27 < 255; local27++) {
				@Pc(52) int local52 = 255 - local27;
				@Pc(57) int local57 = Static14.method284(local52, local22);
				@Pc(61) byte local61 = local25[local57];
				local25[local57] = local25[local52];
				local25[local52] = local25[511 - local27] = local61;
			}
			local13 = new Class1_Sub2_Sub22(local25);
			Static216.aClass64_18.method1466(local13, (long) arg0);
		}
		return local13.aByteArray80;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!ga;IIIIIIZ)V")
	public static void method3896(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray198.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray198[local5] - Static3.anInt142;
			local22 = arg0.anIntArray204[local5] - Static254.anInt5887;
			local29 = arg0.anIntArray199[local5] - Static12.anInt356;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray193 != null) {
				Static83.anIntArray203[local5] = local39;
				Static83.anIntArray194[local5] = local61;
				Static83.anIntArray205[local5] = local71;
			}
			Static83.anIntArray206[local5] = Static208.anInt4133 + (local39 << 9) / local71;
			Static83.anIntArray195[local5] = Static208.anInt4134 + (local61 << 9) / local71;
		}
		Static208.anInt4131 = 0;
		local3 = arg0.anIntArray207.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray207[local5];
			local22 = arg0.anIntArray202[local5];
			local29 = arg0.anIntArray200[local5];
			local39 = Static83.anIntArray206[local15];
			@Pc(148) int local148 = Static83.anIntArray206[local22];
			@Pc(152) int local152 = Static83.anIntArray206[local29];
			@Pc(156) int local156 = Static83.anIntArray195[local15];
			@Pc(160) int local160 = Static83.anIntArray195[local22];
			@Pc(164) int local164 = Static83.anIntArray195[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static167.aBoolean234 && Static47.method4520(Static107.anInt1993 + Static208.anInt4133, Static102.anInt1932 + Static208.anInt4134, local156, local160, local164, local39, local148, local152)) {
					Static186.anInt3478 = arg5;
					Static228.anInt4527 = arg6;
				}
				if (!Static240.aBoolean369 && !arg7) {
					Static208.aBoolean313 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static208.anInt4132 || local148 > Static208.anInt4132 || local152 > Static208.anInt4132) {
						Static208.aBoolean313 = true;
					}
					if (arg0.anIntArray193 == null || arg0.anIntArray193[local5] == -1) {
						if (arg0.anIntArray197[local5] != 12345678) {
							Static208.method3254(local156, local160, local164, local39, local148, local152, arg0.anIntArray197[local5], arg0.anIntArray196[local5], arg0.anIntArray201[local5]);
						}
					} else if (!Static282.aBoolean446) {
						@Pc(373) int local373 = Static208.anInterface4_1.method991(arg0.anIntArray193[local5]);
						Static208.method3254(local156, local160, local164, local39, local148, local152, Static187.method2828(local373, arg0.anIntArray197[local5]), Static187.method2828(local373, arg0.anIntArray196[local5]), Static187.method2828(local373, arg0.anIntArray201[local5]));
					} else if (arg0.aBoolean121) {
						Static208.method3249(local156, local160, local164, local39, local148, local152, arg0.anIntArray197[local5], arg0.anIntArray196[local5], arg0.anIntArray201[local5], Static83.anIntArray203[0], Static83.anIntArray203[1], Static83.anIntArray203[3], Static83.anIntArray194[0], Static83.anIntArray194[1], Static83.anIntArray194[3], Static83.anIntArray205[0], Static83.anIntArray205[1], Static83.anIntArray205[3], arg0.anIntArray193[local5]);
					} else {
						Static208.method3249(local156, local160, local164, local39, local148, local152, arg0.anIntArray197[local5], arg0.anIntArray196[local5], arg0.anIntArray201[local5], Static83.anIntArray203[local15], Static83.anIntArray203[local22], Static83.anIntArray203[local29], Static83.anIntArray194[local15], Static83.anIntArray194[local22], Static83.anIntArray194[local29], Static83.anIntArray205[local15], Static83.anIntArray205[local22], Static83.anIntArray205[local29], arg0.anIntArray193[local5]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IJ)V")
	public static void method3897(@OriginalArg(1) long arg0) {
		Static270.aClass1_Sub18_Sub1_3.anInt3911 = 0;
		Static270.aClass1_Sub18_Sub1_3.method3093(21);
		Static270.aClass1_Sub18_Sub1_3.method3091(arg0);
		Static280.anInt5602 = 0;
		Static109.anInt2050 = -3;
		Static205.anInt4083 = 0;
		Static176.anInt3258 = 1;
	}
}
