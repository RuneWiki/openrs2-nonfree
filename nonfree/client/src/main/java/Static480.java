import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!rda", name = "D", descriptor = "[I")
	public static final int[] anIntArray536 = new int[250];

	@OriginalMember(owner = "client!rda", name = "J", descriptor = "Lclient!us;")
	public static final Class344 aClass344_102 = new Class344(7, 3);

	@OriginalMember(owner = "client!rda", name = "N", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_114 = new Class218(5, 6);

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(B)V")
	public static void method7066() {
		if (Static145.aClass376_37 == null) {
			return;
		}
		if (Static145.aClass376_37.anInt10510 == 1) {
			Static145.aClass376_37 = null;
			return;
		}
		if (Static145.aClass376_37.anInt10510 == 2) {
			Static65.method1480(Static594.aClass228_10, 2, Static74.aString14);
			Static145.aClass376_37 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IZ)Lclient!fj;")
	public static Class100 method7068() {
		return new Class100(1, false);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BIIII)I")
	public static int method7069(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class3_Sub1_Sub2.anIntArray85[arg3 * 8192 / arg1] >> 1;
		return ((65536 - local21) * arg2 >> 16) + (arg0 * local21 >> 16);
	}

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)V")
	public static void method7070() {
		Static139.method3135(Static233.aClass108_7);
		Static196.anInt4619++;
		if (Static353.aBoolean597 && Static638.aBoolean885) {
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			if (Static349.aBoolean590) {
				local26 = Static477.method7033();
				local28 = Static10.method114();
			}
			@Pc(42) int local42 = Static501.aClass59_5.method4107() + local26;
			@Pc(49) int local49 = Static501.aClass59_5.method4106() + local28;
			local49 -= Static28.anInt483;
			local42 -= Static77.anInt3994;
			if (local42 < Static413.anInt7711) {
				local42 = Static413.anInt7711;
			}
			if (Static408.anInt7678 > local49) {
				local49 = Static408.anInt7678;
			}
			if (local42 + Static233.aClass108_7.anInt4067 > Static413.anInt7711 + Static326.aClass108_8.anInt4067) {
				local42 = Static326.aClass108_8.anInt4067 + Static413.anInt7711 - Static233.aClass108_7.anInt4067;
			}
			if (Static408.anInt7678 + Static326.aClass108_8.anInt4037 < Static233.aClass108_7.anInt4037 + local49) {
				local49 = Static326.aClass108_8.anInt4037 + Static408.anInt7678 - Static233.aClass108_7.anInt4037;
			}
			@Pc(130) int local130 = local42 + Static326.aClass108_8.anInt4056 - Static413.anInt7711;
			@Pc(138) int local138 = Static326.aClass108_8.anInt4009 + local49 - Static408.anInt7678;
			@Pc(197) Class3_Sub51 local197;
			if (Static501.aClass59_5.method4100()) {
				if (Static233.aClass108_7.anInt4075 < Static196.anInt4619) {
					@Pc(151) int local151 = local42 - Static612.anInt10135;
					@Pc(156) int local156 = local49 - Static134.anInt3481;
					if (local151 > Static233.aClass108_7.anInt4077 || local151 < -Static233.aClass108_7.anInt4077 || Static233.aClass108_7.anInt4077 < local156 || -Static233.aClass108_7.anInt4077 > local156) {
						Static60.aBoolean100 = true;
					}
				}
				if (Static233.aClass108_7.anObjectArray19 != null && Static60.aBoolean100) {
					local197 = new Class3_Sub51();
					local197.aClass108_13 = Static233.aClass108_7;
					local197.anObjectArray33 = Static233.aClass108_7.anObjectArray19;
					local197.anInt10307 = local138;
					local197.anInt10306 = local130;
					Static84.method2222(local197);
					return;
				}
			} else {
				if (Static60.aBoolean100) {
					Static32.method596();
					if (Static233.aClass108_7.anObjectArray6 != null) {
						local197 = new Class3_Sub51();
						local197.anInt10306 = local130;
						local197.anInt10307 = local138;
						local197.aClass108_14 = Static46.aClass108_1;
						local197.aClass108_13 = Static233.aClass108_7;
						local197.anObjectArray33 = Static233.aClass108_7.anObjectArray6;
						Static84.method2222(local197);
					}
					if (Static46.aClass108_1 != null && Static71.method1834(Static233.aClass108_7) != null) {
						Static4.method66(Static233.aClass108_7, Static46.aClass108_1);
					}
				} else if ((Static639.anInt10496 == 1 || Static76.method1868()) && Static443.anInt8026 > 2) {
					Static17.method259(Static612.anInt10135 + Static77.anInt3994, Static28.anInt483 + Static134.anInt3481);
				} else if (Static328.method5502()) {
					Static17.method259(Static77.anInt3994 + Static612.anInt10135, Static28.anInt483 - -Static134.anInt3481);
				}
				Static233.aClass108_7 = null;
			}
		} else if (Static196.anInt4619 > 1) {
			Static233.aClass108_7 = null;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([BBII)I")
	public static int method7071(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg1; local9++) {
			local7 = Class3_Sub2_Sub21.anIntArray404[(arg0[local9] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}
}
