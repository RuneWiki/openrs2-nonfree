import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
	public static int anInt3029;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
	public static int anInt3028 = 0;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1779 = Static107.method1838(":assist:");

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1781 = Static107.method1838("M");

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1780 = aClass28_1781;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "[I")
	public static int[] anIntArray274 = new int[32768];

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1782 = Static107.method1838("gr-Un:");

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
	public static int anInt3033 = -2;

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1783 = aClass28_1781;

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1784 = Static107.method1838(":clanreq:");

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1785 = Static107.method1838(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)V")
	public static void method2081() {
		aClass28_1785 = null;
		anIntArray274 = null;
		aClass28_1783 = null;
		aClass28_1784 = null;
		aClass28_1779 = null;
		aClass28_1781 = null;
		aClass28_1782 = null;
		aClass28_1780 = null;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public static void method2082() {
		Static33.aClass1_1.method2037();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static92.aLongArray8[local10] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static75.aLongArray6[local26] = 0L;
		}
		Static21.anInt736 = 0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIILclient!d;IZJ)Z")
	public static boolean method2083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub4_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static178.anInt3959 || local4 >= Static13.anInt587) {
					return false;
				}
				@Pc(25) Class2_Sub14 local25 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt2269 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class43 local49 = new Class43();
		local49.aLong83 = arg11;
		local49.anInt2316 = arg0;
		local49.anInt2317 = arg5;
		local49.anInt2327 = arg6;
		local49.anInt2324 = arg7;
		local49.aClass2_Sub4_Sub1_2 = arg8;
		local49.anInt2323 = arg9;
		local49.anInt2326 = arg1;
		local49.anInt2322 = arg2;
		local49.anInt2321 = arg1 + arg3 - 1;
		local49.anInt2319 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static133.aClass2_Sub14ArrayArrayArray1[local124][local92][local95] == null) {
						Static133.aClass2_Sub14ArrayArrayArray1[local124][local92][local95] = new Class2_Sub14(local124, local92, local95);
					}
				}
				@Pc(157) Class2_Sub14 local157 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][local92][local95];
				local157.aClass43Array56[local157.anInt2269] = local49;
				local157.anIntArray220[local157.anInt2269] = local98;
				local157.anInt2277 |= local98;
				local157.anInt2269++;
			}
		}
		if (arg10) {
			Static58.aClass43Array37[Static84.anInt2128++] = local49;
		}
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([BI)Lclient!th;")
	public static Class2_Sub4_Sub3_Sub2_Sub1 method2084(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class2_Sub4_Sub3_Sub2_Sub1 local23 = new Class2_Sub4_Sub3_Sub2_Sub1(arg0, Static147.anIntArray314, Static59.anIntArray135, Static171.anIntArray359, Static171.anIntArray358, Static101.anIntArray31, Static81.aByteArrayArray5);
			Static12.method362();
			return local23;
		}
	}
}
