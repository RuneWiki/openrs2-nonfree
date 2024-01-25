import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject23;

	@OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
	public static int anInt10341;

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "Lclient!sq;")
	public static final Class316 aClass316_17 = new Class316(6, 0, 4, 2);

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V")
	public static void method8349() {
		@Pc(9) int local9 = Static442.aClass8_Sub8_Sub2_2.method8576();
		@Pc(18) boolean local18 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
		Static336.anInt6621 = Static442.aClass8_Sub8_Sub2_2.method8528();
		@Pc(26) int local26 = Static442.aClass8_Sub8_Sub2_2.method8528();
		@Pc(30) int local30 = Static442.aClass8_Sub8_Sub2_2.method8576();
		Static512.method7372();
		Static84.method2098(local26);
		Static442.aClass8_Sub8_Sub2_2.method8592();
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static372.anInt7082 >> 3; local44++) {
				for (local48 = 0; local48 < Static218.anInt5023 >> 3; local48++) {
					local55 = Static442.aClass8_Sub8_Sub2_2.method8586(1);
					if (local55 == 1) {
						Static346.anIntArrayArrayArray10[local40][local44][local48] = Static442.aClass8_Sub8_Sub2_2.method8586(26);
					} else {
						Static346.anIntArrayArrayArray10[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static442.aClass8_Sub8_Sub2_2.method8590();
		local44 = (Static635.anInt10565 - Static442.aClass8_Sub8_Sub2_2.anInt10588) / 16;
		Static466.anIntArrayArray45 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static466.anIntArrayArray45[local48][local55] = Static442.aClass8_Sub8_Sub2_2.method8540();
			}
		}
		Static161.anIntArray214 = null;
		Static19.aByteArrayArray59 = new byte[local44][];
		Static158.anIntArray212 = new int[local44];
		Static177.aByteArrayArray63 = new byte[local44][];
		Static488.anIntArray481 = new int[local44];
		Static414.anIntArray422 = new int[local44];
		Static87.anIntArray604 = new int[local44];
		Static170.anIntArray225 = new int[local44];
		Static357.aByteArrayArray65 = null;
		Static65.aByteArrayArray30 = new byte[local44][];
		Static568.aByteArrayArray154 = new byte[local44][];
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(187) int local187 = 0; local187 < Static372.anInt7082 >> 3; local187++) {
				for (@Pc(191) int local191 = 0; local191 < Static218.anInt5023 >> 3; local191++) {
					@Pc(201) int local201 = Static346.anIntArrayArrayArray10[local55][local187][local191];
					if (local201 != -1) {
						@Pc(210) int local210 = local201 >> 14 & 0x3FF;
						@Pc(216) int local216 = local201 >> 3 & 0x7FF;
						@Pc(226) int local226 = local216 / 8 + (local210 / 8 << 8);
						for (@Pc(228) int local228 = 0; local228 < local44; local228++) {
							if (local226 == Static170.anIntArray225[local228]) {
								local226 = -1;
								break;
							}
						}
						if (local226 != -1) {
							Static170.anIntArray225[local44] = local226;
							@Pc(257) int local257 = local226 >> 8 & 0xFF;
							@Pc(261) int local261 = local226 & 0xFF;
							Static414.anIntArray422[local44] = Static140.aClass237_41.method6307("m" + local257 + "_" + local261);
							Static87.anIntArray604[local44] = Static140.aClass237_41.method6307("l" + local257 + "_" + local261);
							Static158.anIntArray212[local44] = Static140.aClass237_41.method6307("um" + local257 + "_" + local261);
							Static488.anIntArray481[local44] = Static140.aClass237_41.method6307("ul" + local257 + "_" + local261);
							local44++;
						}
					}
				}
			}
		}
		Static63.method1690(local30, local9, local18, 11);
	}

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "(I)V")
	public static void method8351() {
		if (Static578.aFileOutputStream1 != null) {
			try {
				Static578.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Static578.aFileOutputStream1 = null;
	}
}
