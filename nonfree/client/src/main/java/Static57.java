import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "J")
	public static long aLong50;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
	public static int anInt1786;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "[Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2[] aClass2_Sub1_Sub7_Sub2Array3;

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
	public static int anInt1795;

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
	public static int anInt1788 = 0;

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
	public static volatile int anInt1793 = 0;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_409 = Static158.method3034("title)3jpg");

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_410 = Static158.method3034("World");

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "Lclient!ob;")
	public static Class60 aClass60_411 = aClass60_410;

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_412 = Static158.method3034("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_414 = Static158.method3034("Take");

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "Lclient!ob;")
	public static Class60 aClass60_413 = aClass60_414;

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[112];

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "Lclient!ob;")
	public static Class60 aClass60_415 = aClass60_410;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1337(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static186.aClass85_1);
		arg0.removeMouseMotionListener(Static186.aClass85_1);
		arg0.removeFocusListener(Static186.aClass85_1);
		anInt1793 = 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
	public static void method1338() {
		for (@Pc(1) int local1 = 0; local1 < Static17.anInt552; local1++) {
			@Pc(6) Class6 local6 = Static102.aClass6Array1[local1];
			Static1.method6(local6);
			Static102.aClass6Array1[local1] = null;
		}
		Static17.anInt552 = 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZB)V")
	public static void method1339(@OriginalArg(0) boolean arg0) {
		Static48.aBoolean54 = arg0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(45) int local45;
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(137) int local137;
		@Pc(145) int local145;
		@Pc(153) int local153;
		if (!Static48.aBoolean54) {
			local21 = Static139.aClass2_Sub3_Sub1_32.method242();
			local25 = Static139.aClass2_Sub3_Sub1_32.method242();
			local29 = Static139.aClass2_Sub3_Sub1_32.method194();
			local33 = Static139.aClass2_Sub3_Sub1_32.method192();
			local37 = Static139.aClass2_Sub3_Sub1_32.method209();
			local45 = (Static168.anInt4121 - Static139.aClass2_Sub3_Sub1_32.anInt273) / 16;
			Static100.anIntArrayArray19 = new int[local45][4];
			for (local51 = 0; local51 < local45; local51++) {
				for (local55 = 0; local55 < 4; local55++) {
					Static100.anIntArrayArray19[local51][local55] = Static139.aClass2_Sub3_Sub1_32.method212();
				}
			}
			Static76.anIntArray260 = new int[local45];
			Static174.aByteArrayArray8 = new byte[local45][];
			Static155.aByteArrayArray7 = new byte[local45][];
			Static150.anIntArray425 = new int[local45];
			@Pc(89) boolean local89 = false;
			if ((local37 / 8 == 48 || local37 / 8 == 49) && (local25 / 8) == 48) {
				local89 = true;
			}
			Static18.anIntArray476 = new int[local45];
			if (local37 / 8 == 48 && local25 / 8 == 148) {
				local89 = true;
			}
			local45 = 0;
			for (local137 = (local37 - 6) / 8; local137 <= (local37 + 6) / 8; local137++) {
				for (local145 = (local25 - 6) / 8; local145 <= (local25 + 6) / 8; local145++) {
					local153 = local145 + (local137 << 8);
					if (!local89 || local145 != 49 && local145 != 149 && local145 != 147 && local137 != 50 && (local137 != 49 || local145 != 47)) {
						Static18.anIntArray476[local45] = local153;
						Static76.anIntArray260[local45] = Static113.aClass13_Sub1_15.method527(Static193.method3536(new Class60[] { Static106.aClass60_855, Static72.method1661(local137), Static136.aClass60_992, Static72.method1661(local145) }));
						Static150.anIntArray425[local45] = Static113.aClass13_Sub1_15.method527(Static193.method3536(new Class60[] { Static8.aClass60_76, Static72.method1661(local137), Static136.aClass60_992, Static72.method1661(local145) }));
						local45++;
					}
				}
			}
			Static111.method2461(local29, local25, local21, local33, local37);
			return;
		}
		local21 = Static139.aClass2_Sub3_Sub1_32.method209();
		local25 = Static139.aClass2_Sub3_Sub1_32.method209();
		Static139.aClass2_Sub3_Sub1_32.method247();
		for (local29 = 0; local29 < 4; local29++) {
			for (local33 = 0; local33 < 13; local33++) {
				for (local37 = 0; local37 < 13; local37++) {
					local45 = Static139.aClass2_Sub3_Sub1_32.method246(1);
					if (local45 == 1) {
						Static105.anIntArrayArrayArray7[local29][local33][local37] = Static139.aClass2_Sub3_Sub1_32.method246(26);
					} else {
						Static105.anIntArrayArrayArray7[local29][local33][local37] = -1;
					}
				}
			}
		}
		Static139.aClass2_Sub3_Sub1_32.method253();
		local33 = (Static168.anInt4121 - Static139.aClass2_Sub3_Sub1_32.anInt273) / 16;
		Static100.anIntArrayArray19 = new int[local33][4];
		for (local37 = 0; local37 < local33; local37++) {
			for (local45 = 0; local45 < 4; local45++) {
				Static100.anIntArrayArray19[local37][local45] = Static139.aClass2_Sub3_Sub1_32.method206();
			}
		}
		local45 = Static139.aClass2_Sub3_Sub1_32.method192();
		local51 = Static139.aClass2_Sub3_Sub1_32.method229();
		local55 = Static139.aClass2_Sub3_Sub1_32.method192();
		Static150.anIntArray425 = new int[local33];
		Static174.aByteArrayArray8 = new byte[local33][];
		Static18.anIntArray476 = new int[local33];
		Static155.aByteArrayArray7 = new byte[local33][];
		Static76.anIntArray260 = new int[local33];
		local33 = 0;
		for (local137 = 0; local137 < 4; local137++) {
			for (local145 = 0; local145 < 13; local145++) {
				for (local153 = 0; local153 < 13; local153++) {
					@Pc(424) int local424 = Static105.anIntArrayArrayArray7[local137][local145][local153];
					if (local424 != -1) {
						@Pc(434) int local434 = local424 >> 14 & 0x3FF;
						@Pc(440) int local440 = local424 >> 3 & 0x7FF;
						@Pc(450) int local450 = local440 / 8 + (local434 / 8 << 8);
						for (@Pc(452) int local452 = 0; local452 < local33; local452++) {
							if (Static18.anIntArray476[local452] == local450) {
								local450 = -1;
								break;
							}
						}
						if (local450 != -1) {
							@Pc(480) int local480 = local450 >> 8 & 0xFF;
							Static18.anIntArray476[local33] = local450;
							@Pc(488) int local488 = local450 & 0xFF;
							Static76.anIntArray260[local33] = Static113.aClass13_Sub1_15.method527(Static193.method3536(new Class60[] { Static106.aClass60_855, Static72.method1661(local480), Static136.aClass60_992, Static72.method1661(local488) }));
							Static150.anIntArray425[local33] = Static113.aClass13_Sub1_15.method527(Static193.method3536(new Class60[] { Static8.aClass60_76, Static72.method1661(local480), Static136.aClass60_992, Static72.method1661(local488) }));
							local33++;
						}
					}
				}
			}
		}
		Static111.method2461(local51, local25, local21, local45, local55);
	}
}
