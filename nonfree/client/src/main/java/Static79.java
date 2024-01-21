import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
	public static int anInt2467 = -1;

	@OriginalMember(owner = "client!nf", name = "lb", descriptor = "Lclient!eb;")
	public static Class17 aClass17_41 = new Class17(64);

	@OriginalMember(owner = "client!nf", name = "ub", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1051 = Static59.method1195("Loaded config");

	@OriginalMember(owner = "client!nf", name = "tb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1050 = aClass60_1051;

	@OriginalMember(owner = "client!nf", name = "vb", descriptor = "Lclient!ra;")
	public static Class3_Sub12_Sub1 aClass3_Sub12_Sub1_1 = new Class3_Sub12_Sub1(5000);

	@OriginalMember(owner = "client!nf", name = "yb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1052 = Static59.method1195("<)4col>");

	@OriginalMember(owner = "client!nf", name = "Ab", descriptor = "I")
	public static int anInt2485 = 0;

	@OriginalMember(owner = "client!nf", name = "Bb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1053 = Static59.method1195("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLclient!jb;Lclient!jb;)V")
	public static void method1592(@OriginalArg(1) Class25 arg0, @OriginalArg(2) Class25 arg1) {
		Static17.aClass25_3 = arg1;
		Static43.aClass25_9 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)V")
	public static void method1594() {
		aClass17_41 = null;
		aClass3_Sub12_Sub1_1 = null;
		aClass60_1050 = null;
		aClass60_1051 = null;
		aClass60_1053 = null;
		aClass60_1052 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!jb;IZLclient!qf;Lclient!qf;IZ)V")
	public static void method1595(@OriginalArg(0) Class25 arg0, @OriginalArg(3) Class60 arg1, @OriginalArg(4) Class60 arg2) {
		@Pc(15) int local15 = arg0.method920(arg1);
		@Pc(25) int local25 = arg0.method922(local15, arg2);
		Static76.method1560(arg0, local25, 255, local15);
	}

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "(I)V")
	public static void method1600() {
		for (@Pc(12) int local12 = 0; local12 < Static58.anInt1802; local12++) {
			@Pc(18) int local18 = Static78.anIntArray241[local12]--;
			if (Static78.anIntArray241[local12] >= -10) {
				@Pc(91) Class63 local91 = Static96.aClass63Array1[local12];
				if (local91 == null) {
					local91 = Static137.method2000(Static26.aClass25_Sub1_4, Static32.anIntArray135[local12], 0);
					if (local91 == null) {
						continue;
					}
					Static78.anIntArray241[local12] += local91.method1999();
					Static96.aClass63Array1[local12] = local91;
				}
				if (Static78.anIntArray241[local12] < 0) {
					@Pc(208) int local208;
					if (Static103.anIntArray311[local12] == 0) {
						local208 = Static58.anInt1807;
					} else {
						@Pc(131) int local131 = Static103.anIntArray311[local12] >> 16 & 0xFF;
						@Pc(139) int local139 = (Static103.anIntArray311[local12] & 0xFF) * 128;
						@Pc(149) int local149 = local131 * 128 + 64 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524;
						if (local149 < 0) {
							local149 = -local149;
						}
						@Pc(165) int local165 = Static103.anIntArray311[local12] >> 8 & 0xFF;
						@Pc(175) int local175 = local165 * 128 + 64 - Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494;
						if (local175 < 0) {
							local175 = -local175;
						}
						@Pc(187) int local187 = local149 + local175 - 128;
						if (local139 < local187) {
							Static78.anIntArray241[local12] = -100;
							continue;
						}
						if (local187 < 0) {
							local187 = 0;
						}
						local208 = (local139 - local187) * Static22.anInt870 / local139;
					}
					if (local208 > 0) {
						@Pc(219) Class3_Sub9_Sub1 local219 = local91.method1998().method728(Static99.aClass56_1);
						@Pc(224) Class3_Sub2_Sub1 local224 = Static131.method170(local219, local208);
						local224.method163(Static128.anIntArray389[local12] - 1);
						Static125.aClass3_Sub2_Sub2_2.method716(local224);
					}
					Static78.anIntArray241[local12] = -100;
				}
			} else {
				Static58.anInt1802--;
				for (@Pc(34) int local34 = local12; local34 < Static58.anInt1802; local34++) {
					Static32.anIntArray135[local34] = Static32.anIntArray135[local34 + 1];
					Static96.aClass63Array1[local34] = Static96.aClass63Array1[local34 + 1];
					Static128.anIntArray389[local34] = Static128.anIntArray389[local34 + 1];
					Static78.anIntArray241[local34] = Static78.anIntArray241[local34 + 1];
					Static103.anIntArray311[local34] = Static103.anIntArray311[local34 + 1];
				}
				local12--;
			}
		}
		if (Static31.aBoolean34 && !Static81.method1636()) {
			if (Static34.anInt1185 != 0 && Static52.anInt1727 != -1) {
				Static120.method2180(Static41.aClass25_Sub1_7, 0, Static34.anInt1185, Static52.anInt1727);
			}
			Static31.aBoolean34 = false;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!qf;Lclient!jb;Lclient!qf;B)Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3 method1602(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) Class60 arg2) {
		@Pc(9) int local9 = arg1.method920(arg0);
		@Pc(19) int local19 = arg1.method922(local9, arg2);
		return Static101.method1991(local9, local19, arg1);
	}
}
