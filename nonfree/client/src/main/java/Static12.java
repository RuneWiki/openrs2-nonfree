import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "Z")
	public static boolean aBoolean8;

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "Lclient!oj;")
	public static Class5_Sub5_Sub15 aClass5_Sub5_Sub15_1;

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_12 = new Class87(128, 4);

	@OriginalMember(owner = "client!aga", name = "m", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!aga", name = "o", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(BII)Z")
	public static boolean method218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V")
	public static void method220() {
		if (Static470.aClass100_14.aBoolean194 && Static304.aClass306_3.anInt8300 != -1) {
			Static551.method8048(Static304.aClass306_3.aString95, Static304.aClass306_3.anInt8300);
		}
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(B)V")
	public static void method223() {
		Static412.anInt7175 = 0;
		@Pc(18) boolean local18 = Static257.aClass5_Sub22_Sub1_1.method5903() == 1;
		@Pc(22) int local22 = Static257.aClass5_Sub22_Sub1_1.method5966();
		@Pc(26) int local26 = Static257.aClass5_Sub22_Sub1_1.method5951();
		@Pc(30) int local30 = Static257.aClass5_Sub22_Sub1_1.method5951();
		Static256.method4232();
		Static623.method8836(local22);
		@Pc(45) int local45 = (Static50.anInt1005 - Static257.aClass5_Sub22_Sub1_1.anInt6629) / 16;
		Static275.anIntArrayArray30 = new int[local45][4];
		@Pc(55) int local55;
		for (@Pc(51) int local51 = 0; local51 < local45; local51++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static275.anIntArrayArray30[local51][local55] = Static257.aClass5_Sub22_Sub1_1.method5913();
			}
		}
		Static108.anIntArray127 = new int[local45];
		Static136.anIntArray144 = null;
		Static511.aByteArrayArray22 = new byte[local45][];
		Static641.aByteArrayArray31 = new byte[local45][];
		Static518.anIntArray491 = new int[local45];
		Static598.aByteArrayArray28 = null;
		Static499.aByteArrayArray26 = new byte[local45][];
		Static499.anIntArray574 = new int[local45];
		Static239.anIntArray219 = new int[local45];
		Static312.anIntArray597 = new int[local45];
		Static172.aByteArrayArray8 = new byte[local45][];
		local45 = 0;
		for (local55 = (local26 - (Static326.anInt5541 >> 4)) / 8; local55 <= ((Static326.anInt5541 >> 4) + local26) / 8; local55++) {
			for (@Pc(137) int local137 = (local30 - (Static448.anInt7637 >> 4)) / 8; local137 <= ((Static448.anInt7637 >> 4) + local30) / 8; local137++) {
				Static312.anIntArray597[local45] = (local55 << 8) + local137;
				Static518.anIntArray491[local45] = Static17.aClass207_6.method4686("m" + local55 + "_" + local137);
				Static499.anIntArray574[local45] = Static17.aClass207_6.method4686("l" + local55 + "_" + local137);
				Static239.anIntArray219[local45] = Static17.aClass207_6.method4686("um" + local55 + "_" + local137);
				Static108.anIntArray127[local45] = Static17.aClass207_6.method4686("ul" + local55 + "_" + local137);
				local45++;
			}
		}
		Static303.method4735(local18, 11, local30, local26);
	}
}
