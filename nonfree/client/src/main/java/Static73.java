import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!jc", name = "gb", descriptor = "I")
	public static int anInt2180;

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_654 = Static170.method3101("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!jc", name = "db", descriptor = "Lclient!eh;")
	public static Class28 aClass28_655 = Static170.method3101("me");

	@OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
	public static volatile int anInt2179 = 0;

	@OriginalMember(owner = "client!jc", name = "hb", descriptor = "I")
	public static int anInt2181 = 0;

	@OriginalMember(owner = "client!jc", name = "jb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_656 = Static170.method3101("Mem:");

	@OriginalMember(owner = "client!jc", name = "kb", descriptor = "[Lclient!eh;")
	public static Class28[] aClass28Array13 = new Class28[1000];

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
	public static void method1680() {
		@Pc(7) int local7 = Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1805(Static171.aClass28_1435);
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 0; local9 < Static82.anInt2400; local9++) {
			local16 = Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1805(Static87.method1995(local9));
			if (local16 > local7) {
				local7 = local16;
			}
		}
		local7 += 8;
		Static69.aBoolean112 = true;
		Static68.anInt2102 = Static82.anInt2400 * 15 + 22;
		Static132.anInt3333 = local7;
		local16 = Static82.anInt2400 * 15 + 21;
		@Pc(57) int local57 = Static2.anInt80 - local7 / 2;
		@Pc(59) int local59 = Static160.anInt3914;
		if (local59 + local16 > 503) {
			local59 = 503 - local16;
		}
		if (local57 + local7 > 765) {
			local57 = 765 - local7;
		}
		if (local57 < 0) {
			local57 = 0;
		}
		if (local59 < 0) {
			local59 = 0;
		}
		Static91.anInt4119 = local57;
		Static65.anInt2018 = local59;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!eh;Lclient!ah;Lclient!eh;)Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4 method1681(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class28 arg2) {
		@Pc(4) int local4 = arg1.method1029(arg0);
		@Pc(10) int local10 = arg1.method1031(arg2, local4);
		return Static18.method571(local4, arg1, local10);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(Z)V")
	public static void method1682() {
		aClass28_655 = null;
		aClass28Array13 = null;
		aClass28_654 = null;
		aClass28_656 = null;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V")
	public static void method1683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt3336; local12++) {
			@Pc(18) Class32 local18 = local7.aClass32Array3[local12];
			if ((local18.aLong49 >> 29 & 0x3L) == 2L && local18.anInt1450 == arg1 && local18.anInt1449 == arg2) {
				Static86.method1990(local18);
				return;
			}
		}
	}
}
