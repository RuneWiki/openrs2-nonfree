import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	public static int anInt900;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "[I")
	public static int[] anIntArray176;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!eh;")
	public static Class28 aClass28_300 = Static170.method3101("Passwort: ");

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_301 = Static170.method3101("mapfunction");

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_302 = Static170.method3101("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!eh;")
	public static Class28 aClass28_303 = Static170.method3101("0(U");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method745() {
		aClass28_301 = null;
		aClass28_302 = null;
		anIntArray176 = null;
		aClass28_303 = null;
		aClass28_300 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)I")
	public static int method746(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!vd;)V")
	public static void method747(@OriginalArg(1) Class80 arg0) {
		Static96.aClass80_103 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method748() {
		@Pc(4) int local4 = Static38.anInt1096 + Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800;
		if (Static78.aBooleanArray12[96]) {
			Static146.anInt3665 += (-Static146.anInt3665 - 24) / 2;
		} else if (Static78.aBooleanArray12[97]) {
			Static146.anInt3665 += (24 - Static146.anInt3665) / 2;
		} else {
			Static146.anInt3665 /= 2;
		}
		if (Static78.aBooleanArray12[98]) {
			Static90.anInt2569 += (12 - Static90.anInt2569) / 2;
		} else if (Static78.aBooleanArray12[99]) {
			Static90.anInt2569 += (-Static90.anInt2569 - 12) / 2;
		} else {
			Static90.anInt2569 /= 2;
		}
		Static139.anInt3673 = Static146.anInt3665 / 2 + Static139.anInt3673 & 0x7FF;
		Static126.anInt3242 += Static90.anInt2569 / 2;
		@Pc(91) int local91 = Static30.anInt956 + Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792;
		if (Static87.anInt2537 - local4 < -500 || Static87.anInt2537 - local4 > 500 || Static81.anInt2373 - local91 < -500 || Static81.anInt2373 - local91 > 500) {
			Static87.anInt2537 = local4;
			Static81.anInt2373 = local91;
		}
		if (Static87.anInt2537 != local4) {
			Static87.anInt2537 += (local4 - Static87.anInt2537) / 16;
		}
		if (Static81.anInt2373 != local91) {
			Static81.anInt2373 += (local91 - Static81.anInt2373) / 16;
		}
		@Pc(154) int local154 = Static81.anInt2373 >> 7;
		if (Static126.anInt3242 < 128) {
			Static126.anInt3242 = 128;
		}
		@Pc(163) int local163 = 0;
		@Pc(167) int local167 = Static87.anInt2537 >> 7;
		if (Static126.anInt3242 > 383) {
			Static126.anInt3242 = 383;
		}
		@Pc(182) int local182 = Static33.method848(Static87.anInt2537, Static171.anInt4109, Static81.anInt2373);
		@Pc(206) int local206;
		if (local167 > 3 && local154 > 3 && local167 < 100 && local154 < 100) {
			for (local206 = local167 - 4; local206 <= local167 + 4; local206++) {
				for (@Pc(211) int local211 = local154 - 4; local211 <= local154 + 4; local211++) {
					@Pc(214) int local214 = Static171.anInt4109;
					if (local214 < 3 && (Static157.aByteArrayArrayArray41[1][local206][local211] & 0x2) == 2) {
						local214++;
					}
					@Pc(241) int local241 = local182 - Static90.anIntArrayArrayArray31[local214][local206][local211];
					if (local163 < local241) {
						local163 = local241;
					}
				}
			}
		}
		local206 = local163 * 192;
		if (local206 > 98048) {
			local206 = 98048;
		}
		if (local206 < 32768) {
			local206 = 32768;
		}
		if (Static77.anInt2284 < local206) {
			Static77.anInt2284 += (local206 - Static77.anInt2284) / 24;
		} else if (local206 < Static77.anInt2284) {
			Static77.anInt2284 += (local206 - Static77.anInt2284) / 80;
		}
	}
}
