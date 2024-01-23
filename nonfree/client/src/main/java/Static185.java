import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!ob", name = "ib", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!ob", name = "jb", descriptor = "I")
	public static int anInt3457;

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "Lclient!db;")
	public static Class31 aClass31_27 = new Class31(500);

	@OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
	public static int anInt3456 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Lclient!oe;")
	public static Class125 method2789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class125 local14 = local7.aClass125_1;
			local7.aClass125_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIILclient!ak;BIZ)V")
	public static void method2790(@OriginalArg(0) int arg0, @OriginalArg(3) Class7 arg1, @OriginalArg(5) int arg2) {
		Static17.aBoolean34 = false;
		Static186.anInt3480 = arg0;
		Static279.anInt5596 = arg2;
		Static137.anInt3867 = 1;
		Static289.anInt5738 = 0;
		Static151.anInt2792 = 2;
		Static262.aClass7_210 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(BI)V")
	public static void method2794(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub2_Sub11 local13 = Static163.method3579(3, arg0);
		local13.method1853();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
	public static void method2796(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static119.method3836(arg0.length - 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)V")
	public static void method2797(@OriginalArg(1) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static262.anInt5263 += arg0 * 128;
		@Pc(45) int local45;
		if (Static253.anIntArray600.length < Static262.anInt5263) {
			Static262.anInt5263 -= Static253.anIntArray600.length;
			local45 = (int) (Math.random() * 12.0D);
			Static33.method611(Static36.aClass48_Sub2Array3[local45]);
		}
		local45 = 0;
		@Pc(58) int local58 = (256 - arg0) * 128;
		@Pc(62) int local62 = arg0 * 128;
		@Pc(68) int local68;
		@Pc(98) int local98;
		for (local68 = 0; local68 < local58; local68++) {
			local98 = Static295.anIntArray691[local45 + local62] - arg0 * Static253.anIntArray600[local45 + Static262.anInt5263 & Static253.anIntArray600.length + -1] / 6;
			if (local98 < 0) {
				local98 = 0;
			}
			Static295.anIntArray691[local45++] = local98;
		}
		@Pc(131) int local131;
		@Pc(139) int local139;
		for (local68 = 256 - arg0; local68 < 256; local68++) {
			local98 = local68 * 128;
			for (local131 = 0; local131 < 128; local131++) {
				local139 = (int) (Math.random() * 100.0D);
				if (local139 < 50 && local131 > 10 && local131 < 118) {
					Static295.anIntArray691[local131 + local98] = 255;
				} else {
					Static295.anIntArray691[local131 + local98] = 0;
				}
			}
		}
		for (local68 = 0; local68 < 256 - arg0; local68++) {
			Static242.anIntArray583[local68] = Static242.anIntArray583[local68 + arg0];
		}
		for (local68 = 256 - arg0; local68 < 256; local68++) {
			Static242.anIntArray583[local68] = (int) (Math.sin((double) Static234.anInt4889 / 14.0D) * 16.0D + Math.sin((double) Static234.anInt4889 / 15.0D) * 14.0D + Math.sin((double) Static234.anInt4889 / 16.0D) * 12.0D);
			Static234.anInt4889++;
		}
		local68 = (arg0 + (Static261.anInt5259 & 0x1)) / 2;
		Static99.anInt1898 += arg0;
		if (local68 <= 0) {
			return;
		}
		for (local98 = 0; local98 < Static99.anInt1898; local98++) {
			local131 = (int) (Math.random() * 124.0D) + 2;
			local139 = (int) (Math.random() * 128.0D) + 128;
			Static295.anIntArray691[(local139 << 7) + local131] = 192;
		}
		Static99.anInt1898 = 0;
		@Pc(307) int local307;
		for (local98 = 0; local98 < 256; local98++) {
			local139 = local98 * 128;
			local131 = 0;
			for (local307 = -local68; local307 < 128; local307++) {
				if (local68 + local307 < 128) {
					local131 += Static295.anIntArray691[local68 + local139 + local307];
				}
				if (local307 - local68 - 1 >= 0) {
					local131 -= Static295.anIntArray691[local139 + local307 - local68 - 1];
				}
				if (local307 >= 0) {
					Static162.anIntArray367[local139 + local307] = local131 / (local68 * 2 + 1);
				}
			}
		}
		for (local98 = 0; local98 < 128; local98++) {
			local131 = 0;
			for (local139 = -local68; local139 < 256; local139++) {
				local307 = local139 * 128;
				if (local68 + local139 < 256) {
					local131 += Static162.anIntArray367[local98 + local307 + local68 * 128];
				}
				if (local139 - local68 - 1 >= 0) {
					local131 -= Static162.anIntArray367[local98 + local307 - (local68 + 1) * 128];
				}
				if (local139 >= 0) {
					Static295.anIntArray691[local98 + local307] = local131 / (local68 * 2 + 1);
				}
			}
		}
	}
}
