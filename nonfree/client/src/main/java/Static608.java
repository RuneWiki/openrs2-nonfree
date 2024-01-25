import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Lclient!dia;")
	public static Class8_Sub16_Sub1 aClass8_Sub16_Sub1_4;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "Lclient!ub;")
	public static Class336 aClass336_1;

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "Lclient!as;")
	public static final Class8_Sub3 aClass8_Sub3_1 = new Class8_Sub3(0, 0);

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray64 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	public static void method8297() {
		@Pc(8) int local8 = Static357.aByteArrayArray65.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			if (Static357.aByteArrayArray65[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static611.anInt10289; local25++) {
					if (Static170.anIntArray225[local15] == Static328.anIntArray541[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static328.anIntArray541[Static611.anInt10289] = Static170.anIntArray225[local15];
					local23 = Static611.anInt10289++;
				}
				@Pc(69) Class8_Sub8 local69 = new Class8_Sub8(Static357.aByteArrayArray65[local15]);
				@Pc(71) int local71 = 0;
				while (local69.anInt10588 < Static357.aByteArrayArray65[local15].length && local71 < 511 && Static59.anInt1906 < 1023) {
					@Pc(92) int local92 = local71++ << 6 | local23;
					@Pc(96) int local96 = local69.method8578();
					@Pc(100) int local100 = local96 >> 14;
					@Pc(106) int local106 = local96 >> 7 & 0x3F;
					@Pc(110) int local110 = local96 & 0x3F;
					@Pc(123) int local123 = (Static170.anIntArray225[local15] >> 8) * 64 + local106 - Static628.anInt10493;
					@Pc(136) int local136 = local110 + (Static170.anIntArray225[local15] & 0xFF) * 64 - Static594.anInt10160;
					@Pc(143) Class300 local143 = Static297.aClass338_1.method7851(local69.method8578());
					@Pc(150) Class8_Sub50 local150 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local92);
					if (local150 == null && (local143.aByte100 & 0x1) > 0 && Static591.anInt10125 == local100 && local123 >= 0 && Static372.anInt7082 > local143.anInt8912 + local123 && local136 >= 0 && Static218.anInt5023 > local143.anInt8912 + local136) {
						@Pc(190) Class15_Sub1_Sub2_Sub2_Sub2 local190 = new Class15_Sub1_Sub2_Sub2_Sub2();
						local190.anInt8075 = local92;
						@Pc(198) Class8_Sub50 local198 = new Class8_Sub50(local190);
						Static278.aClass253_20.method6591(local198, (long) local92);
						Static537.aClass8_Sub50Array1[Static438.anInt8226++] = local198;
						Static620.anIntArray609[Static59.anInt1906++] = local92;
						local190.anInt8089 = Static435.anInt8192;
						local190.method6702(local143);
						local190.method6691(local190.aClass300_1.anInt8912);
						local190.anInt8097 = local190.aClass300_1.anInt8900 << 3;
						local190.method6683((local190.aClass300_1.aByte97 + 4 & 0xCB000007) << 11, true);
						local190.method6704(local190.method6692(), local100, local123, true, local136);
					}
				}
			}
		}
	}
}
