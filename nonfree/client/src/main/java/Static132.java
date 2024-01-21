import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!qh", name = "db", descriptor = "Lclient!dd;")
	public static Class16 aClass16_23;

	@OriginalMember(owner = "client!qh", name = "eb", descriptor = "Lclient!dd;")
	public static Class16 aClass16_24;

	@OriginalMember(owner = "client!qh", name = "qb", descriptor = "I")
	public static int anInt3760;

	@OriginalMember(owner = "client!qh", name = "ab", descriptor = "I")
	public static int anInt3750 = 0;

	@OriginalMember(owner = "client!qh", name = "jb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_948 = Static8.method128(" (X");

	@OriginalMember(owner = "client!qh", name = "nb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_950 = Static8.method128("Location");

	@OriginalMember(owner = "client!qh", name = "kb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_949 = aClass18_950;

	@OriginalMember(owner = "client!qh", name = "pb", descriptor = "Z")
	public static volatile boolean aBoolean162 = false;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(Z)V")
	public static void method2561() {
		aClass16_24 = null;
		aClass16_23 = null;
		aClass18_948 = null;
		aClass18_950 = null;
		aClass18_949 = null;
	}

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)V")
	public static void method2562() {
		@Pc(9) int local9 = Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2026(Static145.aClass18_1032);
		@Pc(26) int local26;
		for (@Pc(18) int local18 = 0; local18 < Static80.anInt2478; local18++) {
			local26 = Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2026(Static125.method2488(local18));
			if (local9 < local26) {
				local9 = local26;
			}
		}
		local9 += 8;
		anInt3760 = local9;
		Static149.aBoolean185 = true;
		Static32.anInt1094 = Static80.anInt2478 * 15 + 22;
		local26 = Static80.anInt2478 * 15 + 21;
		@Pc(63) int local63 = Static74.anInt2247 - local9 / 2;
		@Pc(65) int local65 = Static91.anInt2764;
		if (local63 + local9 > 765) {
			local63 = 765 - local9;
		}
		if (local63 < 0) {
			local63 = 0;
		}
		if (local65 + local26 > 503) {
			local65 = 503 - local26;
		}
		if (local65 < 0) {
			local65 = 0;
		}
		Static124.anInt3518 = local63;
		Static110.anInt3236 = local65;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)Z")
	public static boolean method2563(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)Lclient!ea;")
	public static Class18 method2564(@OriginalArg(0) int arg0) {
		return Static73.method1249(arg0, false);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
	public static void method2565(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static110.aBooleanArray11[arg0]) {
			return;
		}
		Static130.aClass16_22.method2247(arg0);
		if (Static148.aClass20ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static148.aClass20ArrayArray1[arg0].length; local27++) {
			if (Static148.aClass20ArrayArray1[arg0][local27] != null) {
				if (Static148.aClass20ArrayArray1[arg0][local27].anInt1213 == 2) {
					local25 = false;
				} else {
					Static148.aClass20ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static148.aClass20ArrayArray1[arg0] = null;
		}
		Static110.aBooleanArray11[arg0] = false;
	}
}
