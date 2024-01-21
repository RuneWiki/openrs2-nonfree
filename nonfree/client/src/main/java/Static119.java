import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ub", name = "xc", descriptor = "Lclient!na;")
	public static Class56 aClass56_28;

	@OriginalMember(owner = "client!ub", name = "eb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_834 = method1462("Please reload this page)3");

	@OriginalMember(owner = "client!ub", name = "hb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_835 = method1462("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!ub", name = "qb", descriptor = "I")
	public static int anInt1927 = 0;

	@OriginalMember(owner = "client!ub", name = "rb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_836 = method1462("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ub", name = "wb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_837 = aClass65_834;

	@OriginalMember(owner = "client!ub", name = "dc", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9 = new int[4][13][13];

	@OriginalMember(owner = "client!ub", name = "lc", descriptor = "Lclient!pe;")
	public static Class65 aClass65_839 = method1462("mapdots");

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	public static void method1461() {
		aClass65_835 = null;
		aClass65_834 = null;
		aClass65_839 = null;
		aClass65_837 = null;
		aClass56_28 = null;
		anIntArrayArrayArray9 = null;
		aClass65_836 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!pe;")
	public static Class65 method1462(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class65 local13 = new Class65();
		local13.aByteArray27 = new byte[local9];
		@Pc(19) int local19 = 0;
		while (local9 > local19) {
			@Pc(27) int local27 = local6[local19++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local19 >= local9) {
					break;
				}
				@Pc(51) int local51 = local6[local19++] & 0xFF;
				local13.aByteArray27[local13.anInt2005++] = (byte) (local51 + (local27 + -40) * 43 - 48);
			} else if (local27 != 0) {
				local13.aByteArray27[local13.anInt2005++] = (byte) local27;
			}
		}
		local13.method1485();
		return local13.method1489();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!vb;IIII)V")
	public static void method1463(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) Class2_Sub14 local3 = new Class2_Sub14();
		local3.anInt2393 = arg1.anInt2696;
		local3.anInt2378 = arg1.anInt2664;
		local3.anInt2383 = arg1.anInt2685 * 128;
		local3.anInt2377 = arg4;
		local3.anInt2386 = arg3 * 128;
		@Pc(32) int local32 = arg1.anInt2671;
		local3.anIntArray312 = arg1.anIntArray354;
		local3.anInt2379 = arg0 * 128;
		local3.anInt2374 = arg1.anInt2665;
		@Pc(48) int local48 = arg1.anInt2689;
		if (arg2 == 1 || arg2 == 3) {
			local48 = arg1.anInt2671;
			local32 = arg1.anInt2689;
		}
		local3.anInt2384 = (arg3 + local48) * 128;
		local3.anInt2387 = (arg0 + local32) * 128;
		if (arg1.anIntArray351 != null) {
			local3.aClass2_Sub1_Sub15_1 = arg1;
			local3.method1722();
		}
		Static12.aClass13_5.method263(local3);
		if (local3.anIntArray312 != null) {
			local3.anInt2380 = (int) (Math.random() * (double) (local3.anInt2378 - local3.anInt2374)) + local3.anInt2374;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!na;Z)V")
	public static void method1464(@OriginalArg(0) Class56 arg0) {
		Static26.aClass56_12 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
	public static void method1465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(10) int local10 = 1;
		@Pc(13) int[] local13 = new int[4];
		local13[0] = arg1;
		local8[0] = arg0;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (arg1 != Static105.anIntArray310[local23]) {
				local13[local10] = Static105.anIntArray310[local23];
				local8[local10] = Static56.anIntArray176[local23];
				local10++;
			}
		}
		Static105.anIntArray310 = local13;
		Static56.anIntArray176 = local8;
		Static86.method1387(Static56.anIntArray176, Static44.aClass79Array1.length - 1, Static105.anIntArray310, Static44.aClass79Array1, 0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!k;)V")
	public static void method1469(@OriginalArg(1) Class2_Sub1_Sub4_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static12.anIntArray30.length; local7++) {
			Static12.anIntArray30[local7] = 0;
		}
		@Pc(40) int local40;
		for (@Pc(30) int local30 = 0; local30 < 5000; local30++) {
			local40 = (int) (Math.random() * 128.0D * (double) 256);
			Static12.anIntArray30[local40] = (int) (Math.random() * 256.0D);
		}
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(69) int local69;
		for (local40 = 0; local40 < 20; local40++) {
			for (local57 = 1; local57 < 255; local57++) {
				for (local61 = 1; local61 < 127; local61++) {
					local69 = (local57 << 7) + local61;
					Static4.anIntArray157[local69] = (Static12.anIntArray30[local69 + 1] + Static12.anIntArray30[local69 - 1] + Static12.anIntArray30[local69 + -128] + Static12.anIntArray30[local69 + 128]) / 4;
				}
			}
			@Pc(109) int[] local109 = Static12.anIntArray30;
			Static12.anIntArray30 = Static4.anIntArray157;
			Static4.anIntArray157 = local109;
		}
		if (arg0 == null) {
			return;
		}
		local57 = 0;
		for (local61 = 0; local61 < arg0.anInt1367; local61++) {
			for (local69 = 0; local69 < arg0.anInt1370; local69++) {
				if (arg0.aByteArray21[local57++] != 0) {
					@Pc(145) int local145 = arg0.anInt1371 + local61 + 16;
					@Pc(152) int local152 = arg0.anInt1372 + local69 + 16;
					@Pc(158) int local158 = (local145 << 7) + local152;
					Static12.anIntArray30[local158] = 0;
				}
			}
		}
	}
}
