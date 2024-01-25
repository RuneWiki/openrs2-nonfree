import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "Lclient!ok;")
	public static Class178 aClass178_20;

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_27 = new Class253(12, -2);

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_36 = new Class55("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZZIZ)V")
	public static void method1380(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static302.method4024(0, arg2, arg1, arg0, arg3, Static31.aClass19_Sub1Array1.length - 1);
		Static22.anInt4933 = 0;
		Static12.aClass7_Sub29_2 = null;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
	public static void method1381() {
		@Pc(9) int local9 = Static210.aClass7_Sub14_Sub1_4.method3990();
		@Pc(18) boolean local18 = Static210.aClass7_Sub14_Sub1_4.method3968() == 1;
		@Pc(24) int local24 = Static210.aClass7_Sub14_Sub1_4.method3946();
		@Pc(28) int local28 = Static210.aClass7_Sub14_Sub1_4.method3972();
		Static97.anInt1979 = Static210.aClass7_Sub14_Sub1_4.method3981();
		Static100.method1743(local28);
		Static210.aClass7_Sub14_Sub1_4.method1361();
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(59) int local59;
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			for (local48 = 0; local48 < Static333.anInt3375 >> 3; local48++) {
				for (local52 = 0; local52 < Static102.anInt2086 >> 3; local52++) {
					local59 = Static210.aClass7_Sub14_Sub1_4.method1358(1);
					if (local59 == 1) {
						Static17.anIntArrayArrayArray1[local44][local48][local52] = Static210.aClass7_Sub14_Sub1_4.method1358(26);
					} else {
						Static17.anIntArrayArrayArray1[local44][local48][local52] = -1;
					}
				}
			}
		}
		Static210.aClass7_Sub14_Sub1_4.method1353();
		local48 = (Static205.anInt3627 - Static210.aClass7_Sub14_Sub1_4.anInt4989) / 16;
		Static220.anIntArrayArray29 = new int[local48][4];
		for (local52 = 0; local52 < local48; local52++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static220.anIntArrayArray29[local52][local59] = Static210.aClass7_Sub14_Sub1_4.method3938();
			}
		}
		Static333.aByteArrayArray14 = new byte[local48][];
		Static170.anIntArray421 = new int[local48];
		Static3.aByteArrayArray1 = null;
		Static48.anIntArray70 = new int[local48];
		Static401.anIntArray574 = null;
		Static331.anIntArray494 = new int[local48];
		Static420.aByteArrayArray22 = new byte[local48][];
		Static253.anIntArray367 = new int[local48];
		Static155.aByteArrayArray12 = new byte[local48][];
		Static36.anIntArray53 = new int[local48];
		Static66.aByteArrayArray4 = new byte[local48][];
		local48 = 0;
		for (local59 = 0; local59 < 4; local59++) {
			for (@Pc(189) int local189 = 0; local189 < Static333.anInt3375 >> 3; local189++) {
				for (@Pc(193) int local193 = 0; local193 < Static102.anInt2086 >> 3; local193++) {
					@Pc(203) int local203 = Static17.anIntArrayArrayArray1[local59][local189][local193];
					if (local203 != -1) {
						@Pc(213) int local213 = local203 >> 14 & 0x3FF;
						@Pc(219) int local219 = local203 >> 3 & 0x7FF;
						@Pc(229) int local229 = (local213 / 8 << 8) + local219 / 8;
						for (@Pc(231) int local231 = 0; local231 < local48; local231++) {
							if (local229 == Static331.anIntArray494[local231]) {
								local229 = -1;
								break;
							}
						}
						if (local229 != -1) {
							Static331.anIntArray494[local48] = local229;
							@Pc(264) int local264 = local229 >> 8 & 0xFF;
							@Pc(268) int local268 = local229 & 0xFF;
							Static253.anIntArray367[local48] = Static402.aClass178_123.method3836("m" + local264 + "_" + local268);
							Static48.anIntArray70[local48] = Static402.aClass178_123.method3836("l" + local264 + "_" + local268);
							Static36.anIntArray53[local48] = Static402.aClass178_123.method3836("um" + local264 + "_" + local268);
							Static170.anIntArray421[local48] = Static402.aClass178_123.method3836("ul" + local264 + "_" + local268);
							local48++;
						}
					}
				}
			}
		}
		Static114.method1939(10, local9, local24, local18);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)I")
	public static int method1382(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)Z")
	public static boolean method1383() {
		if (Static193.aBoolean205) {
			try {
				if ((Boolean) Static468.method5098(Static230.aClass61_4.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}
}
