import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	public static int anInt7117;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "Lclient!o;")
	public static Class85 aClass85_24;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray155 = new boolean[200];

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!ql;")
	public static final Class210 aClass210_61 = new Class210(14, 1);

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!ql;")
	public static final Class210 aClass210_62 = new Class210(15, 4);

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!ql;")
	public static final Class210 aClass210_63 = new Class210(16, -2);

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Lclient!ql;")
	public static final Class210 aClass210_64 = new Class210(17, 0);

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!ql;")
	public static final Class210 aClass210_65 = new Class210(18, -2);

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!ql;")
	public static final Class210 aClass210_66 = new Class210(19, -2);

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Lclient!ql;")
	public static final Class210 aClass210_67 = new Class210(20, 6);

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!ql;")
	public static final Class210 aClass210_68 = new Class210(21, 9);

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!ql;")
	public static final Class210 aClass210_69 = new Class210(22, -2);

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!ql;")
	public static final Class210 aClass210_70 = new Class210(23, 4);

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!ql;")
	public static final Class210 aClass210_71 = new Class210(24, -1);

	@OriginalMember(owner = "client!db", name = "p", descriptor = "Lclient!ql;")
	public static final Class210 aClass210_72 = new Class210(25, -2);

	@OriginalMember(owner = "client!db", name = "r", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_267 = new Class67(94, 0);

	@OriginalMember(owner = "client!db", name = "u", descriptor = "Z")
	public static boolean aBoolean619 = false;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public static void method5766(@OriginalArg(1) int arg0) {
		Static369.anInt5966 = arg0;
		@Pc(7) Class77 local7 = Static85.aClass77_52;
		synchronized (Static85.aClass77_52) {
			Static85.aClass77_52.method1395();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)V")
	public static void method5767(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(6) Class111_Sub5 local6 = (Class111_Sub5) Static349.aClass63_7.method1019(); local6 != null; local6 = (Class111_Sub5) Static349.aClass63_7.method1022()) {
			if (local6.anInt4561 <= Static98.anInt1304) {
				local6.method5886();
			} else {
				Static150.method3716(arg2 >> 1, local6.anInt4557, (local6.anInt4563 << 7) + 64, local6.anInt4560 * 2, arg0 >> 1, (local6.anInt4558 << 7) + 64);
				Static17.aClass137_5.method4586(local6.aString44, local6.anInt4564 | 0xFF000000, 0, Static99.anIntArray133[1] + arg1, arg3 + Static99.anIntArray133[0]);
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IILclient!pk;IBI)V")
	public static void method5769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub35 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt5294 == -1 && arg2.anIntArray389 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = Static126.aClass19_Sub1_1.anInt4221 * arg2.anInt5288 >> 8;
		if (arg3 > arg2.anInt5290) {
			local15 = arg3 - arg2.anInt5290;
		} else if (arg2.anInt5300 > arg3) {
			local15 = arg2.anInt5300 - arg3;
		}
		if (arg4 > arg2.anInt5293) {
			local15 += arg4 - arg2.anInt5293;
		} else if (arg2.anInt5299 > arg4) {
			local15 += arg2.anInt5299 - arg4;
		}
		if (arg2.anInt5296 == 0 || local15 - 64 > arg2.anInt5296 || Static126.aClass19_Sub1_1.anInt4221 == 0 || arg1 != arg2.anInt5291) {
			if (arg2.aClass1_Sub9_Sub4_3 != null) {
				Static123.aClass1_Sub9_Sub1_1.method4263(arg2.aClass1_Sub9_Sub4_3);
				arg2.aClass1_Sub9_Sub4_3 = null;
			}
			if (arg2.aClass1_Sub9_Sub4_2 != null) {
				Static123.aClass1_Sub9_Sub1_1.method4263(arg2.aClass1_Sub9_Sub4_2);
				arg2.aClass1_Sub9_Sub4_2 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(141) int local141 = local23 * (arg2.anInt5296 - local15) / arg2.anInt5296;
		if (arg2.aClass1_Sub9_Sub4_3 != null) {
			arg2.aClass1_Sub9_Sub4_3.method5056(local141);
		} else if (arg2.anInt5294 >= 0) {
			@Pc(156) Class194 local156 = Static473.method4118(Static84.aClass185_26, arg2.anInt5294, 0);
			if (local156 != null) {
				@Pc(163) Class1_Sub8_Sub1 local163 = local156.method4120().method697(Static14.aClass35_1);
				@Pc(168) Class1_Sub9_Sub4 local168 = Static474.method5051(local163, local141);
				local168.method5040(-1);
				Static123.aClass1_Sub9_Sub1_1.method4260(local168);
				arg2.aClass1_Sub9_Sub4_3 = local168;
			}
		}
		if (arg2.aClass1_Sub9_Sub4_2 != null) {
			arg2.aClass1_Sub9_Sub4_2.method5056(local141);
			if (!arg2.aClass1_Sub9_Sub4_2.method5956()) {
				arg2.aClass1_Sub9_Sub4_2 = null;
			}
		} else if (arg2.anIntArray389 != null && (arg2.anInt5287 -= arg0) <= 0) {
			@Pc(218) int local218 = (int) ((double) arg2.anIntArray389.length * Math.random());
			@Pc(226) Class194 local226 = Static473.method4118(Static84.aClass185_26, arg2.anIntArray389[local218], 0);
			if (local226 != null) {
				@Pc(233) Class1_Sub8_Sub1 local233 = local226.method4120().method697(Static14.aClass35_1);
				@Pc(238) Class1_Sub9_Sub4 local238 = Static474.method5051(local233, local141);
				local238.method5040(0);
				Static123.aClass1_Sub9_Sub1_1.method4260(local238);
				arg2.aClass1_Sub9_Sub4_2 = local238;
				arg2.anInt5287 = arg2.anInt5298 + (int) (Math.random() * (double) (arg2.anInt5297 - arg2.anInt5298));
				return;
			}
		}
	}
}
