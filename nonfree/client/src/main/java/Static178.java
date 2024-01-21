import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "Lclient!oa;")
	public static final Class75 aClass75_14 = new Class75(4096);

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array27 = new Class20[200];

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
	public static int anInt3563 = 0;

	@OriginalMember(owner = "client!sh", name = "E", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1304 = Static161.method2452(" x ");

	@OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
	public static int anInt3564 = 0;

	@OriginalMember(owner = "client!sh", name = "H", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1306 = Static161.method2452("Create a free account");

	@OriginalMember(owner = "client!sh", name = "G", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1305 = aClass20_1306;

	@OriginalMember(owner = "client!sh", name = "I", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1307 = Static161.method2452("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1308 = Static161.method2452("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(III)J")
	public static long method2696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt333; local13++) {
			@Pc(19) Class43 local19 = local7.aClass43Array1[local13];
			if ((local19.aLong102 >> 29 & 0x3L) == 2L && local19.anInt1811 == arg1 && local19.anInt1816 == arg2) {
				return local19.aLong102;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	public static void method2697() {
		try {
			if (Static92.anInt1963 == 1) {
				@Pc(12) int local12 = Static154.aClass5_Sub11_Sub2_2.method1637();
				if (local12 > 0 && Static154.aClass5_Sub11_Sub2_2.method1651()) {
					local12 -= Static15.anInt312;
					if (local12 < 0) {
						local12 = 0;
					}
					Static154.aClass5_Sub11_Sub2_2.method1660(local12);
					return;
				}
				Static154.aClass5_Sub11_Sub2_2.method1632();
				Static154.aClass5_Sub11_Sub2_2.method1664();
				Static6.aClass18_1 = null;
				if (Static172.aClass23_68 == null) {
					Static92.anInt1963 = 0;
				} else {
					Static92.anInt1963 = 2;
				}
				Static29.aClass5_Sub18_1 = null;
			}
		} catch (@Pc(51) Exception local51) {
			local51.printStackTrace();
			Static154.aClass5_Sub11_Sub2_2.method1632();
			Static29.aClass5_Sub18_1 = null;
			Static6.aClass18_1 = null;
			Static92.anInt1963 = 0;
			Static172.aClass23_68 = null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)I")
	public static int method2698(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!mf;ZIIIIII)V")
	public static void method2699(@OriginalArg(0) Class69 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static164.aBoolean145) {
			Static18.anInt353 = 32;
		} else {
			Static18.anInt353 = 0;
		}
		Static164.aBoolean145 = false;
		@Pc(123) int local123;
		if (Static18.anInt352 != 0) {
			if (arg1 <= arg3 && arg3 < arg1 + 16 && arg5 >= arg4 && arg5 < arg4 + 16) {
				arg0.anInt2514 -= 4;
				Static184.method2779(arg0);
			} else if (arg1 <= arg3 && arg3 < arg1 + 16 && arg2 + arg4 - 16 <= arg5 && arg2 + arg4 > arg5) {
				arg0.anInt2514 += 4;
				Static184.method2779(arg0);
			} else if (arg1 - Static18.anInt353 <= arg3 && arg3 < arg1 + Static18.anInt353 + 16 && arg4 + 16 <= arg5 && arg4 + arg2 - 16 > arg5) {
				local123 = (arg2 - 32) * arg2 / arg6;
				if (local123 < 8) {
					local123 = 8;
				}
				@Pc(141) int local141 = arg5 - local123 / 2 - arg4 - 16;
				@Pc(147) int local147 = arg2 - local123 - 32;
				arg0.anInt2514 = local141 * (arg6 - arg2) / local147;
				Static184.method2779(arg0);
				Static164.aBoolean145 = true;
			}
		}
		if (Static95.anInt2009 == 0) {
			return;
		}
		local123 = arg0.anInt2541;
		if (arg3 >= arg1 - local123 && arg5 >= arg4 && arg1 + 16 > arg3 && arg4 + arg2 >= arg5) {
			arg0.anInt2514 += Static95.anInt2009 * 45;
			Static184.method2779(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "(III)Lclient!fc;")
	public static Class29 method2701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass29_1;
	}
}
