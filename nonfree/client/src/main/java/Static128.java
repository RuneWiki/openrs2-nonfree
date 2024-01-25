import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!ega", name = "g", descriptor = "[I")
	public static final int[] anIntArray161 = new int[14];

	@OriginalMember(owner = "client!ega", name = "p", descriptor = "[I")
	public static final int[] anIntArray162 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)V")
	public static void method1804(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg0, 5);
		local8.method669();
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(II)I")
	public static int method1806(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIZI)V")
	public static void method1807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static379.anInt5914 <= arg3 - arg1 && arg1 + arg3 <= Static624.anInt10032 && Static257.anInt4068 <= arg0 - arg1 && arg1 + arg0 <= Static67.anInt1214) {
			Static417.method5580(arg0, arg2, arg1, arg3);
		} else {
			Static13.method185(arg0, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)V")
	public static void method1809() {
		Static592.anInt9602 = 0;
		@Pc(11) int local11 = Static53.aClass2_Sub22_Sub2_1.method8545();
		@Pc(15) int local15 = Static53.aClass2_Sub22_Sub2_1.method8544();
		@Pc(24) boolean local24 = Static53.aClass2_Sub22_Sub2_1.method8527() == 1;
		@Pc(28) int local28 = Static53.aClass2_Sub22_Sub2_1.method8521();
		Static626.method8384();
		Static222.method3035(local11);
		@Pc(42) int local42 = (Static84.anInt1498 - Static53.aClass2_Sub22_Sub2_1.anInt10247) / 16;
		Static220.anIntArrayArray16 = new int[local42][4];
		@Pc(52) int local52;
		for (@Pc(48) int local48 = 0; local48 < local42; local48++) {
			for (local52 = 0; local52 < 4; local52++) {
				Static220.anIntArrayArray16[local48][local52] = Static53.aClass2_Sub22_Sub2_1.method8542();
			}
		}
		Static439.anIntArray503 = new int[local42];
		Static416.anIntArray474 = new int[local42];
		Static399.anIntArray466 = null;
		Static352.anIntArray395 = new int[local42];
		Static171.aByteArrayArray9 = null;
		Static4.aByteArrayArray1 = new byte[local42][];
		Static407.anIntArray620 = new int[local42];
		Static388.aByteArrayArray21 = new byte[local42][];
		Static508.aByteArrayArray26 = new byte[local42][];
		Static403.aByteArrayArray22 = new byte[local42][];
		Static60.anIntArray91 = new int[local42];
		local42 = 0;
		for (local52 = (local28 - (Static228.anInt3704 >> 4)) / 8; local52 <= (local28 + (Static228.anInt3704 >> 4)) / 8; local52++) {
			for (@Pc(125) int local125 = (local15 - (Static162.anInt2911 >> 4)) / 8; local125 <= ((Static162.anInt2911 >> 4) + local15) / 8; local125++) {
				Static407.anIntArray620[local42] = (local52 << 8) + local125;
				Static60.anIntArray91[local42] = Static280.aClass380_67.method8609("m" + local52 + "_" + local125);
				Static439.anIntArray503[local42] = Static280.aClass380_67.method8609("l" + local52 + "_" + local125);
				Static352.anIntArray395[local42] = Static280.aClass380_67.method8609("um" + local52 + "_" + local125);
				Static416.anIntArray474[local42] = Static280.aClass380_67.method8609("ul" + local52 + "_" + local125);
				local42++;
			}
		}
		Static599.method8102(11, local28, local15, local24);
	}
}
