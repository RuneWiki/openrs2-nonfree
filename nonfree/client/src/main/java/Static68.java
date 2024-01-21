import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!id", name = "W", descriptor = "I")
	public static int anInt1725;

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "[Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3[] aClass2_Sub3_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "[I")
	public static int[] anIntArray115 = new int[5];

	@OriginalMember(owner = "client!id", name = "R", descriptor = "Lclient!me;")
	public static Class2_Sub13 aClass2_Sub13_2 = new Class2_Sub13(new byte[5000]);

	@OriginalMember(owner = "client!id", name = "S", descriptor = "Lclient!ai;")
	private static Class6 aClass6_504 = Static38.method685("Please try again)3");

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "Lclient!ai;")
	public static Class6 aClass6_505 = Static38.method685(" weitere Optionen");

	@OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
	public static int anInt1727 = -1;

	@OriginalMember(owner = "client!id", name = "bb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_506 = aClass6_504;

	@OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
	public static int anInt1729 = 0;

	@OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
	public static int anInt1731 = 0;

	@OriginalMember(owner = "client!id", name = "jb", descriptor = "Z")
	public static boolean aBoolean64 = false;

	@OriginalMember(owner = "client!id", name = "mb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_507 = Static38.method685("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!id", name = "nb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_508 = aClass6_507;

	@OriginalMember(owner = "client!id", name = "ob", descriptor = "Lclient!ai;")
	public static Class6 aClass6_509 = Static38.method685("::fpson");

	@OriginalMember(owner = "client!id", name = "pb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_510 = Static38.method685("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!id", name = "qb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_511 = Static38.method685("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[SII[Lclient!ai;)V")
	public static void method1098(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(24) int local24 = (arg2 + arg0) / 2;
		@Pc(26) int local26 = arg2;
		@Pc(30) Class6 local30 = arg3[local24];
		arg3[local24] = arg3[arg0];
		arg3[arg0] = local30;
		@Pc(44) short local44 = arg1[local24];
		arg1[local24] = arg1[arg0];
		arg1[arg0] = local44;
		for (@Pc(56) int local56 = arg2; local56 < arg0; local56++) {
			if (local30 == null || arg3[local56] != null && arg3[local56].method114(local30) < (local56 & 0x1)) {
				@Pc(78) Class6 local78 = arg3[local56];
				arg3[local56] = arg3[local26];
				arg3[local26] = local78;
				@Pc(92) short local92 = arg1[local56];
				arg1[local56] = arg1[local26];
				arg1[local26++] = local92;
			}
		}
		arg3[arg0] = arg3[local26];
		arg3[local26] = local30;
		arg1[arg0] = arg1[local26];
		arg1[local26] = local44;
		method1098(local26 - 1, arg1, arg2, arg3);
		method1098(arg0, arg1, local26 + 1, arg3);
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3 method1099() {
		@Pc(7) Class2_Sub3_Sub2_Sub3 local7 = new Class2_Sub3_Sub2_Sub3();
		local7.anInt3620 = Static88.anIntArray153[0];
		local7.anInt3617 = Static130.anInt3018;
		local7.anInt3619 = Static76.anIntArray121[0];
		local7.anInt3621 = Static131.anIntArray278[0];
		local7.anIntArray357 = Static127.anIntArray258;
		local7.aByteArray46 = Static167.aByteArrayArray10[0];
		local7.anInt3622 = Static14.anIntArray16[0];
		local7.anInt3618 = Static163.anInt3833;
		Static49.method886();
		return local7;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(Z)V")
	public static void method1100() {
		@Pc(16) boolean local16 = false;
		while (!local16) {
			local16 = true;
			for (@Pc(22) int local22 = 0; local22 < Static46.anInt1322 - 1; local22++) {
				if (Static65.anIntArray104[local22] < 1000 && Static65.anIntArray104[local22 + 1] > 1000) {
					local16 = false;
					@Pc(44) Class6 local44 = Static134.aClass6Array17[local22];
					Static134.aClass6Array17[local22] = Static134.aClass6Array17[local22 + 1];
					Static134.aClass6Array17[local22 + 1] = local44;
					@Pc(62) Class6 local62 = Static103.aClass6Array13[local22];
					Static103.aClass6Array13[local22] = Static103.aClass6Array13[local22 + 1];
					Static103.aClass6Array13[local22 + 1] = local62;
					@Pc(80) int local80 = Static65.anIntArray104[local22];
					Static65.anIntArray104[local22] = Static65.anIntArray104[local22 + 1];
					Static65.anIntArray104[local22 + 1] = local80;
					@Pc(98) int local98 = Static30.anIntArray34[local22];
					Static30.anIntArray34[local22] = Static30.anIntArray34[local22 + 1];
					Static30.anIntArray34[local22 + 1] = local98;
					@Pc(116) int local116 = Static134.anIntArray283[local22];
					Static134.anIntArray283[local22] = Static134.anIntArray283[local22 + 1];
					Static134.anIntArray283[local22 + 1] = local116;
					@Pc(134) int local134 = Static117.anIntArray238[local22];
					Static117.anIntArray238[local22] = Static117.anIntArray238[local22 + 1];
					Static117.anIntArray238[local22 + 1] = local134;
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
	public static void method1101() {
		aClass6_511 = null;
		aClass2_Sub3_Sub2_Sub3Array3 = null;
		aClass6_507 = null;
		anIntArray115 = null;
		aClass6_508 = null;
		aClass2_Sub13_2 = null;
		aClass6_504 = null;
		aClass6_505 = null;
		aClass6_509 = null;
		aClass6_506 = null;
		aClass6_510 = null;
	}
}
