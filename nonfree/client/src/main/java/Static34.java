import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!tb;")
	public static Class44 aClass44_20;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_530 = Static33.method650("swe");

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public static int anInt966 = -1;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!oa;")
	public static Class56 aClass56_531 = null;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!oa;")
	public static Class56 aClass56_532 = Static33.method650(" @whi@(X");

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	public static int anInt968 = -1;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public static int anInt969 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!td;)I")
	public static int method652(@OriginalArg(1) Class3_Sub1_Sub16 arg0) {
		@Pc(18) Class3_Sub12 local18 = (Class3_Sub12) Static41.aClass2_1.method17(((long) arg0.anInt2817 << 32) + ((long) arg0.anInt2807));
		return local18 == null ? arg0.anInt2800 : local18.anInt1963;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method653() {
		@Pc(10) int local10 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 + Static103.anInt2583;
		@Pc(15) int local15 = Static15.anInt434 + Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196;
		if (Static71.aBooleanArray8[96]) {
			Static54.anInt1548 += (-Static54.anInt1548 - 24) / 2;
		} else if (Static71.aBooleanArray8[97]) {
			Static54.anInt1548 += (24 - Static54.anInt1548) / 2;
		} else {
			Static54.anInt1548 /= 2;
		}
		if (Static71.aBooleanArray8[98]) {
			Static3.anInt3131 += (12 - Static3.anInt3131) / 2;
		} else if (Static71.aBooleanArray8[99]) {
			Static3.anInt3131 += (-Static3.anInt3131 - 12) / 2;
		} else {
			Static3.anInt3131 /= 2;
		}
		Static22.anInt686 = Static22.anInt686 + Static54.anInt1548 / 2 & 0x7FF;
		Static106.anInt2632 += Static3.anInt3131 / 2;
		if (Static75.anInt2033 - local10 < -500 || Static75.anInt2033 - local10 > 500 || Static84.anInt2282 - local15 < -500 || Static84.anInt2282 - local15 > 500) {
			Static75.anInt2033 = local10;
			Static84.anInt2282 = local15;
		}
		if (Static106.anInt2632 < 128) {
			Static106.anInt2632 = 128;
		}
		if (local15 != Static84.anInt2282) {
			Static84.anInt2282 += (local15 - Static84.anInt2282) / 16;
		}
		@Pc(153) int local153 = 0;
		if (Static75.anInt2033 != local10) {
			Static75.anInt2033 += (local10 - Static75.anInt2033) / 16;
		}
		if (Static106.anInt2632 > 383) {
			Static106.anInt2632 = 383;
		}
		@Pc(176) int local176 = Static75.anInt2033 >> 7;
		@Pc(180) int local180 = Static84.anInt2282 >> 7;
		@Pc(186) int local186 = Static27.method560(Static84.anInt2282, Static94.anInt2470, Static75.anInt2033);
		@Pc(206) int local206;
		if (local176 > 3 && local180 > 3 && local176 < 100 && local180 < 100) {
			for (local206 = local176 - 4; local206 <= local176 + 4; local206++) {
				for (@Pc(212) int local212 = local180 - 4; local212 <= local180 + 4; local212++) {
					@Pc(216) int local216 = Static94.anInt2470;
					if (local216 < 3 && (Static66.aByteArrayArrayArray3[1][local206][local212] & 0x2) == 2) {
						local216++;
					}
					@Pc(244) int local244 = local186 - Static22.anIntArrayArrayArray4[local216][local206][local212];
					if (local244 > local153) {
						local153 = local244;
					}
				}
			}
		}
		local206 = local153 * 192;
		if (local206 > 98048) {
			local206 = 98048;
		}
		if (local206 < 32768) {
			local206 = 32768;
		}
		if (Static48.anInt1392 < local206) {
			Static48.anInt1392 += (local206 - Static48.anInt1392) / 24;
		} else if (local206 < Static48.anInt1392) {
			Static48.anInt1392 += (local206 - Static48.anInt1392) / 80;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public static void method654() {
		aClass56_531 = null;
		aClass56_530 = null;
		aClass56_532 = null;
		aClass44_20 = null;
		aByteArrayArray5 = null;
	}
}
