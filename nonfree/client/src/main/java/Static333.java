import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!nw", name = "p", descriptor = "Lclient!h;")
	public static final Class114 aClass114_119 = new Class114("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!nw", name = "u", descriptor = "Lclient!h;")
	public static final Class114 aClass114_120 = new Class114("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V")
	public static void method5448() {
		@Pc(10) int local10 = Static540.aByteArrayArray32.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (Static540.aByteArrayArray32[local12] != null) {
				@Pc(19) int local19 = -1;
				for (@Pc(21) int local21 = 0; local21 < Static288.anInt5624; local21++) {
					if (Static323.anIntArray450[local21] == Static85.anIntArray178[local12]) {
						local19 = local21;
						break;
					}
				}
				if (local19 == -1) {
					Static323.anIntArray450[Static288.anInt5624] = Static85.anIntArray178[local12];
					local19 = Static288.anInt5624++;
				}
				@Pc(66) Class1_Sub13 local66 = new Class1_Sub13(Static540.aByteArrayArray32[local12]);
				@Pc(68) int local68 = 0;
				while (local66.anInt3400 < Static540.aByteArrayArray32[local12].length && local68 < 511 && Static457.anInt7857 < 1023) {
					@Pc(87) int local87 = local19 | local68++ << 6;
					@Pc(91) int local91 = local66.method3056();
					@Pc(95) int local95 = local91 >> 14;
					@Pc(101) int local101 = local91 >> 7 & 0x3F;
					@Pc(105) int local105 = local91 & 0x3F;
					@Pc(118) int local118 = (Static85.anIntArray178[local12] >> 8) * 64 + local101 - Static324.anInt6132;
					@Pc(131) int local131 = local105 + (Static85.anIntArray178[local12] & 0xFF) * 64 - Static517.anInt8716;
					@Pc(138) Class238 local138 = Static345.aClass222_1.method5587(local66.method3056());
					@Pc(145) Class1_Sub10 local145 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local87);
					if (local145 == null && (local138.aByte79 & 0x1) > 0 && Static435.anInt7457 == local95 && local118 >= 0 && Static542.anInt9387 > local138.anInt6754 + local118 && local131 >= 0 && Static36.anInt1324 > local138.anInt6754 + local131) {
						@Pc(186) Class47_Sub2_Sub3_Sub1 local186 = new Class47_Sub2_Sub3_Sub1();
						local186.anInt5045 = local87;
						@Pc(194) Class1_Sub10 local194 = new Class1_Sub10(local186);
						Static258.aClass174_15.method4420(local194, (long) local87);
						Static395.aClass1_Sub10Array1[Static198.anInt4112++] = local194;
						Static386.anIntArray503[Static457.anInt7857++] = local87;
						local186.anInt5038 = Static416.anInt7252;
						local186.method3708(local138);
						local186.method4367(local186.aClass238_1.anInt6754);
						local186.anInt5001 = local186.aClass238_1.anInt6761 << 3;
						local186.method4351(true, local186.aClass238_1.aByte81 + 4 << 11 & 0x3C37);
						local186.method3707(local131, local186.method4350(), true, local95, local118);
					}
				}
			}
		}
	}
}
