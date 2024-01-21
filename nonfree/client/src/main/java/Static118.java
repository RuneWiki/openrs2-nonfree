import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!u", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1236 = Static56.method816(":tradereq:");

	@OriginalMember(owner = "client!u", name = "u", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1237 = Static56.method816("button near the top of that page)3");

	@OriginalMember(owner = "client!u", name = "v", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!u", name = "w", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1238 = Static56.method816("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!u", name = "z", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1239 = Static56.method816("Registrierter Benutzer");

	@OriginalMember(owner = "client!u", name = "I", descriptor = "I")
	public static volatile int anInt2651 = 0;

	@OriginalMember(owner = "client!u", name = "J", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1241 = aClass34_1237;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1242 = Static56.method816("::noclip");

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
	public static void method1649() {
		for (@Pc(8) int local8 = 0; local8 < Static64.anInt2023; local8++) {
			@Pc(14) int local14 = Static36.anIntArray126[local8]--;
			if (Static36.anIntArray126[local8] >= -10) {
				@Pc(87) Class57 local87 = Static4.aClass57Array1[local8];
				if (local87 == null) {
					local87 = Static139.method1328(Static94.aClass14_Sub1_17, Static68.anIntArray207[local8], 0);
					if (local87 == null) {
						continue;
					}
					Static36.anIntArray126[local8] += local87.method1331();
					Static4.aClass57Array1[local8] = local87;
				}
				if (Static36.anIntArray126[local8] < 0) {
					@Pc(208) int local208;
					if (Static20.anIntArray67[local8] == 0) {
						local208 = Static53.anInt1363;
					} else {
						@Pc(128) int local128 = Static20.anIntArray67[local8] >> 16 & 0xFF;
						@Pc(136) int local136 = (Static20.anIntArray67[local8] & 0xFF) * 128;
						@Pc(146) int local146 = local128 * 128 + 64 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043;
						if (local146 < 0) {
							local146 = -local146;
						}
						@Pc(159) int local159 = Static20.anIntArray67[local8] >> 8 & 0xFF;
						@Pc(169) int local169 = local159 * 128 + 64 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059;
						if (local169 < 0) {
							local169 = -local169;
						}
						@Pc(183) int local183 = local146 + local169 - 128;
						if (local136 < local183) {
							Static36.anIntArray126[local8] = -100;
							continue;
						}
						if (local183 < 0) {
							local183 = 0;
						}
						local208 = Static67.anInt1640 * (local136 - local183) / local136;
					}
					if (local208 > 0) {
						@Pc(219) Class8_Sub9_Sub1 local219 = local87.method1329().method1343(Static132.aClass51_2);
						@Pc(224) Class8_Sub11_Sub2 local224 = Static136.method990(local219, local208);
						local224.method984(Static58.anIntArray191[local8] - 1);
						Static104.aClass8_Sub11_Sub4_1.method1922(local224);
					}
					Static36.anIntArray126[local8] = -100;
				}
			} else {
				Static64.anInt2023--;
				for (@Pc(30) int local30 = local8; local30 < Static64.anInt2023; local30++) {
					Static68.anIntArray207[local30] = Static68.anIntArray207[local30 + 1];
					Static4.aClass57Array1[local30] = Static4.aClass57Array1[local30 + 1];
					Static58.anIntArray191[local30] = Static58.anIntArray191[local30 + 1];
					Static36.anIntArray126[local30] = Static36.anIntArray126[local30 + 1];
					Static20.anIntArray67[local30] = Static20.anIntArray67[local30 + 1];
				}
				local8--;
			}
		}
		if (Static60.aBoolean63 && !Static112.method1538()) {
			if (Static47.anInt1277 != 0 && Static74.anInt1780 != -1) {
				Static86.method1302(0, Static47.anInt1277, Static67.aClass14_Sub1_9, Static74.anInt1780);
			}
			Static60.aBoolean63 = false;
		}
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
	public static void method1650() {
		@Pc(13) Object local13 = Static60.anObject4;
		synchronized (Static60.anObject4) {
			if (Static73.anInt1778 == 0) {
				Static93.aClass40_3.method951(new Class5(), 5);
			}
			Static73.anInt1778 = 600;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public static void method1651() {
		aLongArray6 = null;
		aClass34_1239 = null;
		aClass34_1238 = null;
		aClass34_1237 = null;
		aClass34_1236 = null;
		aClass34_1242 = null;
		aClass34_1241 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!md;ILclient!pd;B)V")
	public static void method1652(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class61 arg2) {
		@Pc(12) Class8_Sub10 local12 = new Class8_Sub10();
		local12.aClass14_Sub1_8 = arg0;
		local12.anInt1311 = 1;
		local12.aLong102 = arg1;
		local12.aClass61_2 = arg2;
		@Pc(27) Class49 local27 = Static127.aClass49_14;
		synchronized (Static127.aClass49_14) {
			Static127.aClass49_14.method1114(local12);
		}
		method1650();
	}
}
