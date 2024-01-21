import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!jb;")
	public static Class25 aClass25_9;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Lclient!df;")
	public static Class16 aClass16_37;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!qf;")
	public static Class60 aClass60_617 = Static59.method1195("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_618 = Static59.method1195("lila:");

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!qf;")
	public static Class60 aClass60_619 = Static59.method1195("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public static int anInt1424 = 0;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Lclient!qf;")
	private static Class60 aClass60_620 = Static59.method1195("Loading ignore list");

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Lclient!qf;")
	private static Class60 aClass60_622 = Static59.method1195("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_621 = aClass60_622;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Lclient!qf;")
	public static Class60 aClass60_623 = Static59.method1195("::fpsoff");

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!qf;")
	public static Class60 aClass60_624 = Static59.method1195("@cr1@");

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "Lclient!qf;")
	public static Class60 aClass60_625 = aClass60_620;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([BI)[B")
	public static byte[] method972(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub12 local8 = new Class3_Sub12(arg0);
		@Pc(12) int local12 = local8.method1936();
		@Pc(16) int local16 = local8.method1920();
		if (local16 < 0 || Static11.anInt342 != 0 && local16 > Static11.anInt342) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(35) byte[] local35 = new byte[local16];
			local8.method1941(local35, local16);
			return local35;
		} else {
			@Pc(47) int local47 = local8.method1920();
			if (local47 < 0 || Static11.anInt342 != 0 && Static11.anInt342 < local47) {
				throw new RuntimeException();
			}
			@Pc(64) byte[] local64 = new byte[local47];
			if (local12 == 1) {
				Static5.method99(local64, local47, arg0, local16);
			} else {
				Static127.aClass59_3.method1785(local8, local64);
			}
			return local64;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	public static void method973() {
		@Pc(3) Class60 local3 = null;
		for (@Pc(9) int local9 = 0; local9 < Static22.anInt872; local9++) {
			if (Static68.aClass60Array12[local9].method1847(Static46.aClass60_633) != -1) {
				local3 = Static68.aClass60Array12[local9].method1829(Static68.aClass60Array12[local9].method1847(Static46.aClass60_633));
				break;
			}
		}
		if (local3 == null) {
			Static48.method1026();
			return;
		}
		@Pc(44) int local44 = Static45.anInt1441;
		if (local44 > 190) {
			local44 = 190;
		}
		@Pc(51) int local51 = Static125.anInt3381;
		@Pc(53) int local53 = Static119.anInt3240;
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(62) int local62 = Static71.anInt1516;
		Static40.method1893(local51, local53, local44, local62, 6116423);
		Static40.method1893(local51 + 1, local53 + 1, local44 - 2, 16, 0);
		Static40.method1884(local51 + 1, local53 + 18, local44 - 2, local62 - 19, 0);
		Static123.aClass3_Sub1_Sub2_Sub2_4.method847(local3, local51 + 3, local53 + 14, 6116423, -1);
		@Pc(109) int local109 = Static122.anInt720;
		@Pc(111) int local111 = Static12.anInt374;
		if (Static19.anInt3405 == 0) {
			local111 -= 4;
			local109 -= 4;
		}
		if (Static19.anInt3405 == 1) {
			local109 -= 553;
			local111 -= 205;
		}
		if (Static19.anInt3405 == 2) {
			local109 -= 17;
			local111 -= 357;
		}
		for (@Pc(137) int local137 = 0; local137 < Static22.anInt872; local137++) {
			@Pc(153) int local153 = local53 + (Static22.anInt872 - local137 - 1) * 15 + 31;
			@Pc(155) int local155 = 16777215;
			@Pc(159) Class60 local159 = Static68.aClass60Array12[local137];
			if (local109 > local51 && local51 + local44 > local109 && local153 - 13 < local111 && local153 + 3 > local111) {
				local155 = 16776960;
			}
			if (local159.method1848(local3)) {
				local159 = local159.method1864(0, local159.method1836() - local3.method1836());
				if (local159.method1848(Static84.aClass60_1113)) {
					local159 = local159.method1864(0, local159.method1836() - Static84.aClass60_1113.method1836());
				}
			}
			Static123.aClass3_Sub1_Sub2_Sub2_4.method847(local159, local51 + 3, local153, local155, 0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void method974() {
		Static94.aBoolean99 = true;
		Static14.aBoolean15 = true;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method975() {
		aClass60_619 = null;
		aClass16_37 = null;
		aClass60_618 = null;
		aClass60_623 = null;
		aClass60_617 = null;
		aClass60_622 = null;
		aClass25_9 = null;
		aClass60_621 = null;
		aClass60_625 = null;
		aClass60_624 = null;
		aClass60_620 = null;
		aClass3_Sub1_Sub2_Sub4_3 = null;
		anIntArray161 = null;
	}
}
