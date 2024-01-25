import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString38 = null;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "[I")
	public static final int[] anIntArray337 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "[I")
	public static final int[] anIntArray338 = new int[8];

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "S")
	public static short aShort56 = 205;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method4107(@OriginalArg(1) String arg0) {
		return Static149.method2447(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method4109() {
		@Pc(16) int local16 = Static529.aByteArrayArray38.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			if (Static529.aByteArrayArray38[local18] != null) {
				@Pc(26) int local26 = -1;
				for (@Pc(28) int local28 = 0; local28 < Static539.anInt8810; local28++) {
					if (Static234.anIntArray280[local18] == Static311.anIntArray414[local28]) {
						local26 = local28;
						break;
					}
				}
				if (local26 == -1) {
					Static311.anIntArray414[Static539.anInt8810] = Static234.anIntArray280[local18];
					local26 = Static539.anInt8810++;
				}
				@Pc(71) Class2_Sub15 local71 = new Class2_Sub15(Static529.aByteArrayArray38[local18]);
				@Pc(73) int local73 = 0;
				while (Static529.aByteArrayArray38[local18].length > local71.anInt5241 && local73 < 511 && Static416.anInt7186 < 1023) {
					@Pc(94) int local94 = local26 | local73++ << 6;
					@Pc(98) int local98 = local71.method4294();
					@Pc(102) int local102 = local98 >> 14;
					@Pc(108) int local108 = local98 >> 7 & 0x3F;
					@Pc(112) int local112 = local98 & 0x3F;
					@Pc(125) int local125 = (Static234.anIntArray280[local18] >> 8) * 64 + local108 - Static35.anInt906;
					@Pc(138) int local138 = local112 + (Static234.anIntArray280[local18] & 0xFF) * 64 - Static130.anInt5246;
					@Pc(145) Class86 local145 = Static254.aClass202_2.method4488(local71.method4294());
					@Pc(152) Class2_Sub32 local152 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local94);
					if (local152 == null && (local145.aByte35 & 0x1) > 0 && Static426.anInt7278 == local102 && local125 >= 0 && local145.anInt2152 + local125 < Static188.anInt3850 && local138 >= 0 && Static49.anInt1174 > local145.anInt2152 + local138) {
						@Pc(193) Class6_Sub1_Sub1_Sub1_Sub1 local193 = new Class6_Sub1_Sub1_Sub1_Sub1();
						local193.lb = local94;
						@Pc(201) Class2_Sub32 local201 = new Class2_Sub32(local193);
						Static544.aClass162_40.method3522(local201, (long) local94);
						Static223.aClass2_Sub32Array1[Static31.anInt820++] = local201;
						Static169.anIntArray198[Static416.anInt7186++] = local94;
						local193.anInt7348 = Static412.anInt575;
						local193.method159(local145);
						local193.method6156(local193.aClass86_1.anInt2152);
						local193.anInt7391 = local193.aClass86_1.anInt2155 << 3;
						local193.method6169(local193.aClass86_1.aByte38 + 4 << 11 & 0x3967, true);
						local193.method152(true, local138, local193.method6165(), local102, local125);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)Lclient!iw;")
	public static Class136_Sub1 method4110(@OriginalArg(0) int arg0) {
		return Static419.aBoolean511 && Static158.anInt3180 <= arg0 && arg0 <= Static198.anInt3925 ? Static363.aClass136_Sub1Array2[arg0 - Static158.anInt3180] : null;
	}
}
