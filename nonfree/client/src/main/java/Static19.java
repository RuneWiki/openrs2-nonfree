import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	public static int anInt473;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "J")
	public static long aLong13;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!v;")
	public static Class3_Sub3 aClass3_Sub3_1;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Lclient!ad;")
	public static Class4 aClass4_235 = Static75.method1216("Abbrechen");

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Lclient!ad;")
	public static Class4 aClass4_236 = Static75.method1216("_");

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!ad;")
	public static Class4 aClass4_237 = Static75.method1216("backvmid1");

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!ad;")
	public static Class4 aClass4_238 = Static75.method1216("mapmarker");

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Z")
	public static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Lclient!ad;")
	private static Class4 aClass4_239 = Static75.method1216("glow2:");

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_240 = aClass4_239;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_241 = Static75.method1216("blinken1:");

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!ad;")
	public static Class4 aClass4_242 = Static75.method1216("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!d", name = "o", descriptor = "I")
	public static int anInt476 = 0;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "I")
	public static int anInt477 = 0;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "I")
	public static int anInt478 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method285() {
		@Pc(9) int local9 = Static113.aClass3_Sub1_Sub4_Sub4_3.method1859(Static9.aClass4_160);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static4.anInt204; local11++) {
			local19 = Static113.aClass3_Sub1_Sub4_Sub4_3.method1858(Static104.aClass4Array20[local11]);
			if (local19 > local9) {
				local9 = local19;
			}
		}
		local9 += 8;
		local19 = Static4.anInt204 * 15 + 21;
		@Pc(85) int local85;
		@Pc(107) int local107;
		if (Static4.anInt194 > 4 && Static91.anInt2055 > 4 && Static4.anInt194 < 516 && Static91.anInt2055 < 338) {
			Static106.aBoolean231 = true;
			Static76.anInt1815 = 0;
			Static85.anInt1989 = local9;
			Static9.anInt315 = Static4.anInt204 * 15 + 22;
			local85 = Static4.anInt194 - local9 / 2 - 4;
			if (local9 + local85 > 512) {
				local85 = 512 - local9;
			}
			if (local85 < 0) {
				local85 = 0;
			}
			local107 = Static91.anInt2055 - 4;
			Static39.anInt1072 = local85;
			if (local19 + local107 > 334) {
				local107 = 334 - local19;
			}
			if (local107 < 0) {
				local107 = 0;
			}
			Static75.anInt1788 = local107;
		}
		if (Static4.anInt194 > 553 && Static91.anInt2055 > 205 && Static4.anInt194 < 743 && Static91.anInt2055 < 466) {
			Static9.anInt315 = Static4.anInt204 * 15 + 22;
			Static106.aBoolean231 = true;
			local107 = Static91.anInt2055 - 205;
			if (local107 < 0) {
				local107 = 0;
			} else if (local107 + local19 > 261) {
				local107 = 261 - local19;
			}
			Static76.anInt1815 = 1;
			local85 = Static4.anInt194 - local9 / 2 - 553;
			Static75.anInt1788 = local107;
			if (local85 < 0) {
				local85 = 0;
			} else if (local9 + local85 > 190) {
				local85 = 190 - local9;
			}
			Static39.anInt1072 = local85;
			Static85.anInt1989 = local9;
		}
		if (Static4.anInt194 <= 17 || Static91.anInt2055 <= 357 || Static4.anInt194 >= 496 || Static91.anInt2055 >= 453) {
			return;
		}
		Static106.aBoolean231 = true;
		Static76.anInt1815 = 2;
		Static85.anInt1989 = local9;
		Static9.anInt315 = Static4.anInt204 * 15 + 22;
		local85 = Static4.anInt194 - local9 / 2 - 17;
		local107 = Static91.anInt2055 - 357;
		if (local85 < 0) {
			local85 = 0;
		} else if (local85 + local9 > 479) {
			local85 = 479 - local9;
		}
		Static39.anInt1072 = local85;
		if (local107 < 0) {
			local107 = 0;
		} else if (local19 + local107 > 96) {
			local107 = 96 - local19;
		}
		Static75.anInt1788 = local107;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	public static void method286() {
		aClass4_240 = null;
		aClass4_238 = null;
		aClass4_242 = null;
		aClass4_235 = null;
		aClass4_239 = null;
		aClass4_237 = null;
		aClass4_241 = null;
		aClass4_236 = null;
		aClass3_Sub3_1 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[BII)Z")
	public static boolean method287(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = -1;
		@Pc(14) boolean local14 = true;
		@Pc(19) Class3_Sub4 local19 = new Class3_Sub4(arg1);
		label65: while (true) {
			@Pc(23) int local23 = local19.method444();
			if (local23 == 0) {
				return local14;
			}
			@Pc(27) int local27 = 0;
			local12 += local23;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(60) int local60;
				@Pc(95) Class3_Sub1_Sub5 local95;
				do {
					@Pc(74) int local74;
					@Pc(70) int local70;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local19.method444();
										if (local39 == 0) {
											continue label65;
										}
										local19.method446();
									}
									local39 = local19.method444();
									if (local39 == 0) {
										continue label65;
									}
									local27 += local39 - 1;
									@Pc(54) int local54 = local27 & 0x3F;
									local60 = local19.method446() >> 2;
									@Pc(66) int local66 = local27 >> 6 & 0x3F;
									local70 = arg0 + local54;
									local74 = arg2 + local66;
								} while (local74 <= 0);
							} while (local70 <= 0);
						} while (local74 >= 103);
					} while (local70 >= 103);
					local95 = Static38.method1911(local12);
				} while (local60 == 22 && Static36.aBoolean70 && local95.anInt1524 == 0 && !local95.aBoolean117);
				local33 = true;
				if (!local95.method1029()) {
					local14 = false;
					Static76.anInt1811++;
				}
			}
		}
	}
}
